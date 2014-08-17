package purdom;

import grammarDatastructure.Empty;
import grammarDatastructure.Expression;
import grammarDatastructure.GrammarMap;
import grammarDatastructure.Nonterminal;
import grammarDatastructure.Optional;
import grammarDatastructure.Plus;
import grammarDatastructure.ProductionRule;
import grammarDatastructure.Star;
import grammarDatastructure.Terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class PurdomPhaseThree {
	
	private GrammarMap grammar;
	private Map<Nonterminal, ProductionRule> prev;
	private Map<Nonterminal, Expression> shortest;
	private Map<Nonterminal, ProductionsRLEN> rlen;
	private Map<Nonterminal, Expression> once;
	private Map<Nonterminal, ProductionsMark> mark;
	private Map<Nonterminal, Integer> onst;
	private Map<Nonterminal, Boolean> covered;
	private Map<Expression, Boolean> productionCoverage;
	private List<List<String>> result = new ArrayList<List<String>>();
	
	private final Terminal ready = new Terminal("ready"),
			unsure = new Terminal("unsure"), finished = new Terminal("finished");
	
	protected List<Terminal> onceCases = new ArrayList<Terminal>(Arrays.asList(ready, unsure, finished));
	protected boolean doSentence = false;
	protected Nonterminal nt = new Nonterminal("");
	protected Stack<Expression> stack = new Stack<Expression>();
	protected List<String> output = new ArrayList<String>();
	protected RepitionCleaner cleaner = new RepitionCleaner();
	

	public PurdomPhaseThree(GrammarMap grammar, Map<Nonterminal, ProductionRule> prev,
			Map<Nonterminal, Expression> shortest,Map<Nonterminal, ProductionsRLEN> rlen) {
		this.grammar = grammar;
		this.prev = prev;
		this.shortest = shortest;
		this.rlen = rlen;
		this.once = new LinkedHashMap<Nonterminal, Expression>();
		this.mark = new LinkedHashMap<Nonterminal, ProductionsMark>();
		this.onst = new LinkedHashMap<Nonterminal, Integer>();
		this.covered = new LinkedHashMap<Nonterminal, Boolean>();
		this.productionCoverage = new LinkedHashMap<Expression, Boolean>();
	}

	public Map<Expression, Boolean> getProductionCoverage() {
		return productionCoverage;
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
		this.onst.put(nt, this.onst.get(nt) - 1);
		this.productionCoverage.put(production, true);
		ExpressionElements elements = new ExpressionElements(production);
		for(Expression element : elements.getElements()){
			if(element.getClass() == Optional.class || element.getClass() == Star.class || element.getClass() == Plus.class){
				GetNonterminals get = new GetNonterminals(element);
				List<Nonterminal> list = get.getNonterminals();
				if(list.isEmpty()){
					stack.push(element.accept(cleaner));
				}
				else{
					for(Nonterminal n : list){
						stack.push(n);
						this.onst.put(n, this.onst.get(n)+1);
					}
				}	
			}	
			else if(element.getClass() == Nonterminal.class){
				stack.push(element);
				this.onst.put((Nonterminal)element, this.onst.get((Nonterminal)element)+1);
			}
			else{
				stack.push(element);
			}
		}
		boolean done = false;
		while(!done){
			if(stack.isEmpty()){
				doSentence = false;
				break;
			}
			else{
				if(stack.peek().getClass() == Nonterminal.class){
					nt = (Nonterminal) stack.peek();
				}
				Expression e = stack.pop();
				if(e.getClass() == Terminal.class){
					String s = "";
					if(((Terminal)e).getTerminal().equals("\"\\") && !stack.isEmpty() &&
							stack.peek().getClass() == Terminal.class && ((Terminal)stack.peek()).getTerminal().equals("~")){
						s = "h";
						output.add(s);
						stack.pop();
					}
					else if(((Terminal)e).getTerminal().equals("\'\\") && !stack.isEmpty() &&
							stack.peek().getClass() == Terminal.class && ((Terminal)stack.peek()).getTerminal().equals("~")){
						s = "'k'";
						output.add(s);
						stack.pop();
					}
					else if(((Terminal)e).getTerminal().charAt(0) == '\''){
						output.add(((Terminal)e).getTerminal());
					}
					else{
						System.out.print("");
					}	
				}
				else if(e.getClass() == Empty.class){
					done = false;
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
		while(!done){
			if(this.once.get(start) == finished){
				break;
			}
			this.onst.put(start, 1);
			nt = start;
			doSentence = true;
			while(doSentence){
				this.covered.put(nt, true);
				Expression onceNt = this.once.get(nt);
				if(nt.equals(start) && onceNt == finished){
					done = true;
					break;
				}
				else if(onceNt == finished){
					prod = shortN();
				}
				else if(!containsONCEcase(onceNt)){
					prod = onceNt;
					this.once.put(nt, ready);
				}
				else{
					loadONCE();		
					for(Nonterminal i : this.grammar.getNonterminals()){
						if(!i.equals(start) && !containsONCEcase(this.once.get(i))){
							Nonterminal j = i;
							if (!this.prev.containsKey(j)) continue;
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
						if(this.once.get(n).getClass() == Terminal.class && (this.once.get(n).equals(ready))){
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
				processStack(prod);
			}
			if(!output.isEmpty()){
				result.add(output);
				output = new ArrayList<String>();
			}
		}
		filterDuplicates();
		return result;
	}
	
	private boolean containsONCEcase(Expression exp){
		boolean result = false;
		for(Expression e: onceCases){
			if(exp == e){
				result = true;
				break;
			}
		}
		return result;
	}

	private void filterDuplicates() {
		List<List<String>> filteredOutput = new ArrayList<List<String>>();
		for(List<String> l: this.result){
			if(!filteredOutput.contains(l)){
				filteredOutput.add(l);
			}
		}
		this.result = filteredOutput;		
	}
}
