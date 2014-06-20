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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import buildAST.ASTPrinter;

public class PurdomPhaseThree {
	
	private GrammarMap grammar;
	private Map<Nonterminal, ProductionRule> prev;
	private Map<Nonterminal, Expression> shortest;
	private Map<Nonterminal, Expression> once;
	private Map<Nonterminal, ProductionsMark> mark;
	
	private Map<Nonterminal, Integer> onst;
	
	private final Terminal ready = new Terminal("ready"),
			unsure = new Terminal("unsure"), finished = new Terminal("finished");
	List<Terminal> onceCases = new ArrayList<Terminal>(Arrays.asList(ready, unsure, finished));
	protected boolean doSentence = false;
	protected Nonterminal nt = new Nonterminal("");
	protected Stack<Expression> stack = new Stack<Expression>();
	protected List<String> output = new ArrayList<String>();
	List<List<String>> result = new ArrayList<List<String>>();
	ASTPrinter printer = new ASTPrinter();
	
	public PurdomPhaseThree(GrammarMap grammar, Map<Nonterminal, ProductionRule> prev, Map<Nonterminal, Expression> shortest) {
		this.grammar = grammar;
		this.prev = prev;
		this.shortest = shortest;
		this.once = new HashMap<Nonterminal, Expression>();
		this.mark = new HashMap<Nonterminal, ProductionsMark>();
		this.onst = new HashMap<Nonterminal, Integer>();
	}

	public Map<Nonterminal, Expression> getOnce() {
		return once;
	}
	
	public Map<Nonterminal, ProductionsMark> getMark() {
		return mark;
	}
	
	public void init(){
		for(Nonterminal n : this.grammar.getNonterminals()){
			this.once.put(n, ready);
			this.onst.put(n, 0);
			ProductionsMark prod = new ProductionsMark(this.grammar.getExpression(n));
			prod.markProductions();
			this.mark.put(n, prod);
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
			System.out.println("loadonce " + n.getName() + " " +  this.once.get(n).accept(printer));
		}
	}
	
	private void processStack(Expression production){
		System.out.println("process stack " + production.accept(printer));
		this.onst.put(nt, this.onst.get(nt) - 1);
		ExpressionElements elements = new ExpressionElements(production);
		System.out.println("elements size " + elements.getElements().size());
		for(Expression element : elements.getElements()){
			stack.push(element);
			if(element.getClass() == Nonterminal.class){
				this.onst.put((Nonterminal) element, this.onst.get(element)+1);
			}
		}
		boolean done = false;
		while(!done){
			if(stack.isEmpty()){
				System.out.println("yes stack is empty");
				doSentence = false;
				break;
			}
			else{
				if(stack.peek().getClass() == Nonterminal.class){
					System.out.println("got a nonterminal nt " + ((Nonterminal) stack.peek()).getName());
					nt = (Nonterminal) stack.peek();
				}
				Expression e = stack.pop();
				if(e.getClass() == Terminal.class){
//					System.out.println(((Terminal)e).getTerminal());
					output.add(((Terminal)e).getTerminal());
				}
//				else if((e.getClass() == Optional.class || e.getClass() == Star.class || e.getClass() == Plus.class)){
//					System.out.println("e is optional || star || plus");
//					done = false;
//				}
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
			if(this.once.get(start).getClass() == Terminal.class && this.once.get(start).equals(finished)){
				System.out.println("yes finished");
				break;
			}
			this.onst.put(start, 1);
			if(!output.isEmpty()){
				result.add(output);
				output = new ArrayList<String>();
			}
			nt = start;
			doSentence = true;
			while(doSentence){
				System.out.println("nt changed " + nt.getName() + " " + this.once.get(nt).accept(printer));
				Expression onceNt = this.once.get(nt);
				if(nt.equals(start) && onceNt.getClass() == Terminal.class && onceNt.equals(finished)){
					done = true;
					break;
				}
//				else if(nt.equals(start) && onceNt.getClass() == Terminal.class && onceNt.equals(unsure)){
//					this.once.put(nt, finished);
//					break;
//				}
				else if(onceNt.getClass() == Terminal.class && onceNt.equals(finished)){
					System.out.println("once is finished them shortN");
					prod = shortN();
				}
				else if(!containsONCEcase(onceNt)){
					System.out.println("once onceNT is expression");
					prod = onceNt;
					this.once.put(nt, ready);
				}
				else{
					System.out.println("last else " + nt.getName() + "  " + this.once.get(nt).accept(printer)
							+ this.mark.get(nt).getProdValue(this.once.get(nt)) + " " + this.onst.get(nt));
					loadONCE();
					System.out.println("after loadONCE " + nt.getName() + "  " + this.once.get(nt).accept(printer));
					for(Nonterminal i : this.grammar.getNonterminals()){
						System.out.println("i "+ i.getName() + " once(i) " + this.once.get(i).accept(printer));
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
					System.out.println("after else-for loop " + nt.getName() + " " + this.once.get(nt).accept(printer));
					System.out.println("after else-for loop " + this.once.get(start).accept(printer));
					for(Nonterminal n : this.grammar.getNonterminals()){
						if(this.once.get(n).getClass() == Terminal.class && (this.once.get(n).equals(ready))){//|| this.once.get(n).equals(unsure)
							System.out.println("ready to finished " + n.getName() + " " + this.onst.get(n));
							this.once.put(n, finished);
//							if(n.equals(start) && this.onst.get(start) == 1){
//								this.onst.put(n, 0);
//							}
						}
					}
					if(nt.equals(start) && containsONCEcase(this.once.get(nt)) && this.onst.get(start) == 0){// && this.onst.get(start) == 0
						break;
					}
					else if(containsONCEcase(this.once.get(nt))){
						prod = shortN();
					}
					else if(!containsONCEcase(this.once.get(nt))){
						System.out.println("update prod " + nt.getName());
						prod = this.once.get(nt);
						this.once.put(nt, ready);
					}
				}
				processStack(prod);
			}				
		}
		return result;
	}
	
	private boolean containsONCEcase(Expression exp){
		boolean result = false;
		if(exp.getClass() == Terminal.class){
			for(Expression e: onceCases){
				if(exp.equals(e)){
					result = true;
					break;
				}
			}
		}
		return result;
	}

}
