package purdom;

import gtojava.Choice;
import gtojava.Empty;
import gtojava.Expression;
import gtojava.GrammarMap;
import gtojava.Nonterminal;
import gtojava.Optional;
import gtojava.Plus;
import gtojava.Sequence;
import gtojava.Star;
import gtojava.Terminal;
import gtojava.Visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PurdomPhaseOne implements Visitor<Integer>{
	
	private int maxInt = Integer.MAX_VALUE;
	private GrammarMap grammar;
	private Map<Nonterminal, Integer> slenNonterminals;
	private Map<Terminal, Integer> slenTerminals;
	private Map<Nonterminal, ProductionsRLEN> rlen;
	private Map<Nonterminal, Expression> shortest;
	private boolean too_big = false;

	public PurdomPhaseOne() {
	}
	
	public PurdomPhaseOne(GrammarMap grammar) {
		this.grammar = grammar;
		this.slenNonterminals = new HashMap<Nonterminal, Integer>();
		this.slenTerminals = new HashMap<Terminal, Integer>();
		this.rlen = new HashMap<Nonterminal, ProductionsRLEN>();
		this.shortest = new HashMap<Nonterminal, Expression>();
	}
	
	public Map<Nonterminal, Integer> getSlenNonterminals() {
		return slenNonterminals;
	}

	public Map<Terminal, Integer> getSlenTerminals() {
		return slenTerminals;
	}

	public Map<Nonterminal, ProductionsRLEN> getRlen() {
		return rlen;
	}

	public Map<Nonterminal, Expression> getShortest() {
		return shortest;
	}

	@Override
	public Integer visit(Terminal terminal) {
		return 1;
	}

	@Override
	public Integer visit(Nonterminal nonterminal) {
		if(this.slenNonterminals.get(nonterminal).equals(maxInt)){
			too_big = true;
		}
		return this.slenNonterminals.get(nonterminal);
	}

	@Override
	public Integer visit(Optional optional) {
		return optional.getExpr().accept(this);
	}

	@Override
	public Integer visit(Star star) {
		return star.getExpr().accept(this);
	}

	@Override
	public Integer visit(Plus plus) {
		return plus.getExpr().accept(this);
	}

	@Override
	public Integer visit(Sequence sequence) {
		int result = 0;
		for(Expression exp : sequence.getSequence()){
			result += exp.accept(this);
		}
		if(too_big){
			return maxInt;
		}
		return result;
	}

	
	@Override
	public Integer visit(Empty empty) {
		return 1;
	}

	@Override
	public Integer visit(Choice choice) {
		ArrayList<Integer> len = new ArrayList<Integer>();
		for(Expression exp : choice.getChoices()){
			len.add(exp.accept(this));
		}
		return Collections.min(len);
	}
	
	public void init(){
		for(Terminal t : grammar.getTerminals()){
			this.slenTerminals.put(t, 1);
		}		
		for(Nonterminal n : grammar.getNonterminals()){
			this.slenNonterminals.put(n, maxInt);
			this.shortest.put(n, new Empty());
			ProductionsRLEN p = new ProductionsRLEN(grammar.getExpression(n));
			this.rlen.put(n, p);
		}
	}
	
	public void phaseOne(){
		init();
		boolean change = true;
		while(change){
			change = false;
			for(Nonterminal n : grammar.getNonterminals()){
				int sum = 1;
				for(Expression exp : this.rlen.get(n).getKeys()){
					too_big = false;
					int temp = sum;
					temp += exp.accept(this);
					if(!too_big && temp != this.rlen.get(n).getProdValue(exp)){
						this.rlen.get(n).updateValue(exp, temp);
					}	
				}
				Map<Expression, Integer> min = this.rlen.get(n).findMin();
				Entry<Expression, Integer> entry = min.entrySet().iterator().next();
				Expression shortest = entry.getKey();
				int minLength = entry.getValue(); 
				if(!(minLength < 0) && (minLength != maxInt)){
					if(minLength < this.slenNonterminals.get(n)){
						this.shortest.put(n, shortest);
						this.slenNonterminals.put(n, minLength);
						change = true;
					}
				}	
			}
		}		
	}
}
