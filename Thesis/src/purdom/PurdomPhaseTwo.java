package purdom;

import gtojava.Empty;
import gtojava.Expression;
import gtojava.Nonterminal;
import gtojava.ProductionRule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PurdomPhaseTwo {
	
	private int maxInt = Integer.MAX_VALUE;
	private Map<Nonterminal, Expression> startSymbol;
	private Map<Nonterminal, Integer> slen;
	private Map<Nonterminal, ProductionsRLEN> rlen;	
	private Map<Nonterminal, Integer> dlen;
	private Map<Nonterminal, ProductionRule> prev;

	public PurdomPhaseTwo(Map<Nonterminal, Expression> startSymbol, Map<Nonterminal, Integer> slenNonterminals,
						Map<Nonterminal, ProductionsRLEN> rlen) {
		this.startSymbol = startSymbol;
		this.slen = slenNonterminals;
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
		for(Nonterminal n : this.slen.keySet()){
			if(n.equals(this.startSymbol.entrySet().iterator().next().getKey())){
				this.dlen.put(n, this.slen.get(n));
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
						if(this.slen.get(n).equals(maxInt)){
							continue;
						}
					
						int sum = this.dlen.get(n) + this.rlen.get(n1).getProdValue(exp) - this.slen.get(n);
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
		cleanDlenPrev();
	}

	private void cleanDlenPrev() {
		Map<Nonterminal, Integer> temp = new HashMap<Nonterminal, Integer>(this.dlen);
		for(Nonterminal n : temp.keySet()){
			if(this.dlen.get(n) == maxInt){
				this.dlen.remove(n);
				this.prev.remove(n);
			}
		}
		
	}


}