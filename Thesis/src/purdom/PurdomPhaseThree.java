package purdom;

import gtojava.Empty;
import gtojava.Expression;
import gtojava.GrammarMap;
import gtojava.Nonterminal;
import gtojava.Optional;
import gtojava.Plus;
import gtojava.ProductionRule;
import gtojava.Star;
import gtojava.Terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import buildAST.ASTPrinter;

public class PurdomPhaseThree {
	
	private GrammarMap grammar;
	private Map<Nonterminal, ProductionRule> prev;
	private Map<Nonterminal, Expression> shortest;
	private Map<Nonterminal, ProductionsRLEN> rlen;
	private Map<Nonterminal, Expression> once;
	private Map<Nonterminal, ProductionsMark> mark;
	private Map<Nonterminal, Integer> onst;
	private Map<String, String> regularExp;
	private Map<Nonterminal, Boolean> covered;
	
	private final Terminal ready = new Terminal("ready"),
			unsure = new Terminal("unsure"), finished = new Terminal("finished");
	
	protected List<Terminal> onceCases = new ArrayList<Terminal>(Arrays.asList(ready, unsure, finished));
	protected boolean doSentence = false;
	protected Nonterminal nt = new Nonterminal("");
	protected Stack<Expression> stack = new Stack<Expression>();
	protected List<String> output = new ArrayList<String>();
	private List<List<String>> result = new ArrayList<List<String>>();
	protected ASTPrinter printer = new ASTPrinter();
	
	public PurdomPhaseThree(GrammarMap grammar, Map<Nonterminal, ProductionRule> prev,
			Map<Nonterminal, Expression> shortest,Map<Nonterminal, ProductionsRLEN> rlen,
			Map<String, String> regularExp) {
		this.grammar = grammar;
		this.prev = prev;
		this.shortest = shortest;
		this.rlen = rlen;
		this.regularExp = regularExp;
		this.once = new LinkedHashMap<Nonterminal, Expression>();
		this.mark = new LinkedHashMap<Nonterminal, ProductionsMark>();
		this.onst = new LinkedHashMap<Nonterminal, Integer>();
		this.covered = new LinkedHashMap<Nonterminal, Boolean>();
	}

	public Map<Nonterminal, Expression> getOnce() {
		return once;
	}
	
	public Map<Nonterminal, ProductionsMark> getMark() {
		return mark;
	}
	
	public Map<Nonterminal, Boolean> getCovered() {
		return covered;
	}

	public Map<Nonterminal, Integer> getOnst() {
		return onst;
	}

	public void init(){
		for(Nonterminal n : this.grammar.getNonterminals()){
			this.once.put(n, ready);
			this.onst.put(n, 0);
			ProductionsMark prod = new ProductionsMark(this.rlen.get(n).getKeys());
			prod.markProductions();
			this.mark.put(n, prod);
			this.covered.put(n, false);
		}
	}
	
	private Expression shortN(){
		Expression exp = this.shortest.get(nt);
		this.mark.get(nt).updateMark(exp, true);
		if(!this.once.get(nt).equals(finished)){
			this.once.put(nt, ready);
		}
		return exp;
	}
	
	private void loadONCE(){
		for(Nonterminal n : this.grammar.getNonterminals()){
			for(Expression exp : this.mark.get(n).getKeys()){
				if(this.mark.get(n).getProdValue(exp) == false && (this.once.get(n) == ready || this.once.get(n) == unsure)){
					this.once.put(n, exp);
					this.mark.get(n).updateMark(exp, true);
				}
			}
		}
	}
	
	private void processStack(Expression production){
//		System.out.println("production " + production.accept(printer));
		this.onst.put(nt, this.onst.get(nt) - 1);
		ExpressionElements elements = new ExpressionElements(production);
		for(Expression element : elements.getElements()){
			if((element.getClass() == Optional.class || element.getClass() == Star.class || element.getClass() == Plus.class)){
				GetNonterminals get = new GetNonterminals(element);
				List<Nonterminal> list = get.getNonterminals();
				for(Nonterminal n : list){
					stack.push(n);
					this.onst.put(n, this.onst.get(n)+1);
				}
			}	
			else if(element.getClass() == Nonterminal.class){
				stack.push(element);
				this.onst.put((Nonterminal)element, this.onst.get(element)+1);
			}
			else{
				stack.push(element);
			}
		}
		boolean done = false;
		while(!done){
			if(stack.isEmpty()){
//				System.out.println("yes stack is empty");
				doSentence = false;
				break;
			}
			else{
				if(stack.peek().getClass() == Nonterminal.class){
					nt = (Nonterminal) stack.peek();
				}
				Expression e = stack.pop();
				if(e.getClass() == Terminal.class){
					if(this.regularExp.containsKey(((Terminal)e).getTerminal())){
						output.add(this.regularExp.get(((Terminal)e).getTerminal()));
					}
					else if(((Terminal)e).getTerminal().charAt(0) == '\''){
						output.add(((Terminal)e).getTerminal());
					}
					else{
						output.add("");
					}	
				}
				else{
					done = true;
				}
			}
		}
	}
	
	public List<List<String>> phaseThree(){
		init();
		boolean done = false;
		Expression prod = new Empty();
		Map<Nonterminal, Expression> startSymbol = this.grammar.getStartSymbol();
		Entry<Nonterminal, Expression> entry = startSymbol.entrySet().iterator().next();
		Nonterminal start = entry.getKey();
		System.out.println("phase three start " + start.getName());
		while(!done){
			if(this.once.get(start) == finished){
				System.out.println("yes finished");
				break;
			}
			this.onst.put(start, 1);
			nt = start;
			doSentence = true;
			while(doSentence){
//				System.out.println("current nt " + nt.getName());
				this.covered.put(nt, true);
				Expression onceNt = this.once.get(nt);
				if(nt.equals(start) && onceNt == finished){
					done = true;
					break;
				}
				else if(onceNt == finished){
//					System.out.println("onceNt.equals(finished) so SHORTNT");
					prod = shortN();
				}
				else if(!containsONCEcase(onceNt)){
//					System.out.println("!containsONCEcase(onceNt)) so prod = onceNt");
					prod = onceNt;
					this.once.put(nt, ready);
				}
				else{
//					System.out.println("last else");
					loadONCE();					
					System.out.println("load once " + nt.accept(printer) + " " + this.once.get(nt).accept(printer));
					for(Nonterminal i : this.grammar.getNonterminals()){
						if(!i.equals(start) && !containsONCEcase(this.once.get(i))){
							Nonterminal j = i;
//							if (!this.prev.containsKey(j)) continue;
							ProductionRule k = this.prev.get(j);
							while(!containsONCEcase(k.getExpr())){
								j = k.getRuleName();
								if(!containsONCEcase(this.once.get(j))){
									break;
								}
								else{
									if(this.onst.get(i) == 0){
										this.once.put(j, k.getExpr());
										this.mark.get(k.getRuleName()).updateMark(k.getExpr(), true);										
									}
									else{
										this.once.put(j, unsure);
									}
								}
								if (!this.prev.containsKey(j)) break;
								k = this.prev.get(j);
							}
						}
					}
					for(Nonterminal n : this.grammar.getNonterminals()){
						if(this.once.get(n).getClass() == Terminal.class && (this.once.get(n).equals(ready))){//|| this.once.get(n).equals(unsure)
//							System.out.println("ready to finished " + n.getName() + " " + this.onst.get(n));
							this.once.put(n, finished);
						}
					}
					if(nt.equals(start) && containsONCEcase(this.once.get(nt)) && this.onst.get(start) == 0){
						break;
					}
					else if(containsONCEcase(this.once.get(nt))){
						prod = shortN();
					}
					else if(!containsONCEcase(this.once.get(nt))){
						prod = this.once.get(nt);
						this.once.put(nt, ready);
					}
				}
//				System.out.println("go to process stack " + prod.accept(printer));
				processStack(prod);
			}
			if(!output.isEmpty()){
				result.add(output);
				output = new ArrayList<String>();
			}
		}
		return result;
	}
	
	private boolean containsONCEcase(Expression exp){
		boolean result = false;
//		if(exp.getClass() == Terminal.class){
			for(Expression e: onceCases){
				if(exp == e){
					result = true;
					break;
				}
			}
//		}
		return result;
	}

	private boolean allCovered(){
		boolean result = true;
		for(Nonterminal n : this.covered.keySet()){
			if(!this.covered.get(n)){
				result = false;
				break;
			}	
		}
		return result;
	}
}
