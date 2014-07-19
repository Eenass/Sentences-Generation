package purdom;

import grammarDatastructure.Choice;
import grammarDatastructure.Empty;
import grammarDatastructure.Expression;
import grammarDatastructure.GrammarMap;
import grammarDatastructure.Nonterminal;
import grammarDatastructure.Optional;
import grammarDatastructure.Plus;
import grammarDatastructure.Sequence;
import grammarDatastructure.Star;
import grammarDatastructure.Terminal;
import grammarDatastructure.Visitor;

import java.util.LinkedHashMap;
import java.util.Map;

public class PurdomPhaseOne implements Visitor<Integer>{
	
	private int maxInt = Integer.MAX_VALUE;
	private GrammarMap grammar;
	private Map<Nonterminal, Integer> slen;
	private Map<Nonterminal, ProductionsRLEN> rlen;
	private Map<Nonterminal, Expression> shortest;
	private boolean too_big = false;
	private boolean bc;

	public PurdomPhaseOne(GrammarMap grammar, boolean bc) {
		this.grammar = grammar;
		this.bc = bc;
		this.slen = new LinkedHashMap<Nonterminal, Integer>();
		this.rlen = new LinkedHashMap<Nonterminal, ProductionsRLEN>();
		this.shortest = new LinkedHashMap<Nonterminal, Expression>();
	}
	
	public Map<Nonterminal, Integer> getSlen() {
		return slen;
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
		if(this.slen.get(nonterminal).equals(maxInt)){
			too_big = true;
		}
		return this.slen.get(nonterminal);
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
		assert false: "Expressions may not have a choice";
		throw new UnsupportedOperationException();
	}
	
	public void init(){
		for(Nonterminal n : grammar.getNonterminals()){
			this.slen.put(n, maxInt);
			this.shortest.put(n, new Empty());
			ProductionsRLEN p = new ProductionsRLEN(grammar.getExpression(n), this.bc);
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
					if(!too_big && temp < this.rlen.get(n).getProdValue(exp)){
						this.rlen.get(n).updateValue(exp, temp);
						if(temp < this.slen.get(n)){
							this.shortest.put(n, exp);
							this.slen.put(n, temp);
							change = true;
						}
					}
				}
			}
		}
	}
}
