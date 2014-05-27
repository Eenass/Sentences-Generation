package purdom;

import gtojava.Empty;
import gtojava.Expression;
import gtojava.Nonterminal;
import gtojava.ProductionRule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import buildAST.ASTPrinter;

public class PurdomPhaseTwo {
	
	private int maxInt = Integer.MAX_VALUE;
	private Map<Nonterminal, Expression> startSymbol;
	private Map<Nonterminal, Integer> slenNonterminals;
//	private Map<Terminal, Integer> slenTerminals;
	private Map<Nonterminal, ProductionsRLEN> rlen;	
	private Map<Nonterminal, Integer> dlen;
	private Map<Nonterminal, ProductionRule> prev;

	public PurdomPhaseTwo(Map<Nonterminal, Expression> startSymbol, Map<Nonterminal, Integer> slenNonterminals,
//						Map<Terminal, Integer> slenTerminals,
						Map<Nonterminal, ProductionsRLEN> rlen) {
		this.startSymbol = startSymbol;
		this.slenNonterminals = slenNonterminals;
//		this.slenTerminals = slenTerminals;
		this.rlen = rlen;
		this.dlen = new HashMap<Nonterminal, Integer>();
		this.prev = new HashMap<Nonterminal, ProductionRule>();
	}
	
	public Map<Nonterminal, ProductionRule> getPrev() {
		return prev;
	}

	public Map<Nonterminal, Integer> getDlen() {
		return dlen;
	}

	private void init(){
		for(Nonterminal n : this.slenNonterminals.keySet()){
			if(n.equals(this.startSymbol.entrySet().iterator().next().getKey())){
				this.dlen.put(n, this.slenNonterminals.get(n));
				this.prev.put(n, new ProductionRule(n, new Empty()));
			}
			else{
				this.dlen.put(n, maxInt);
				this.prev.put(n, new ProductionRule(new Nonterminal(""), new Empty()));
			}	
		}
	}

	public void phaseTwo(){
		init();
		boolean change = true;
		while(change){
			change = false;
			for(Nonterminal n1 : this.rlen.keySet()){
				for(Nonterminal n : this.rlen.keySet()){
					for(Expression exp : this.rlen.get(n1).getKeys()){
						int rlenExp = this.rlen.get(n1).getProdValue(exp);
						if(rlenExp == maxInt){
							continue;
						}
						if(this.dlen.get(n) == maxInt){
							continue;
						}	
						if(this.slenNonterminals.get(n).equals(maxInt)){
							continue;
						}
					
						ASTPrinter printer = new ASTPrinter();
						System.out.println("this.dlen " + this.dlen.get(n) + " " + exp.accept(printer));
						int sum = this.dlen.get(n) + this.rlen.get(n1).getProdValue(exp) - this.slenNonterminals.get(n);
						ArrayList<Nonterminal> nonterminals = new GetNonterminals(exp).getNonterminals();
						for(Nonterminal non: nonterminals){
							if(sum < this.dlen.get(non)){
								this.dlen.put(non, sum);
								this.prev.put(non, new ProductionRule(n1, exp));
								change = true;
							}
						}
					}
				}		
			}
		}	
	}

	private Entry<Expression, Integer> findMinEntry(Map<Expression, Integer> map) {
		Entry<Expression, Integer> currentMin = map.entrySet().iterator().next();
		for(Entry<Expression, Integer> entry : map.entrySet()){
			int value = entry.getValue();
			if((currentMin.getValue() < 0 || currentMin.getValue() > value) && value >= 0){
				currentMin = entry;				
			}
		}
		return currentMin;
	}
	
}
