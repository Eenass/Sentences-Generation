package purdom;

import grammarDatastructure.Empty;
import grammarDatastructure.Expression;
import grammarDatastructure.Nonterminal;
import grammarDatastructure.ProductionRule;

import java.util.ArrayList;
import java.util.LinkedHashMap;
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
		this.dlen = new LinkedHashMap<Nonterminal, Integer>();
		this.prev = new LinkedHashMap<Nonterminal, ProductionRule>();
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
			for(Nonterminal n : this.rlen.keySet()){
				for(Expression exp : this.rlen.get(n).getKeys()){
					int rlenExp = this.rlen.get(n).getProdValue(exp);
					if(rlenExp == maxInt){
						continue;
					}
					if(this.dlen.get(n) == maxInt){
						continue;
					}	
					if(this.slen.get(n).equals(maxInt)){
						continue;
					}
				
					int sum = this.dlen.get(n) + this.rlen.get(n).getProdValue(exp) - this.slen.get(n);
					ArrayList<Nonterminal> nonterminals = new GetNonterminals(exp).getNonterminals();
					for(Nonterminal non: nonterminals){
						if(sum < this.dlen.get(non)){
							change = true;
							this.dlen.put(non, sum);
							this.prev.put(non, new ProductionRule(n, exp));
						}
					}
				}
			}
		}
	}
}
