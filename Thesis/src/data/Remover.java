package data;

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

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Remover implements Visitor<Expression>{

	protected Expression empty = new Empty();
	private GrammarMap input;
	private GrammarMap output;
	private Map<Nonterminal, Expression> startSymbol;
	
	
	public Remover(GrammarMap input, Map<Nonterminal, Expression> startSymbol) {
		this.input = input;
		this.startSymbol = startSymbol;
		this.output = new GrammarMap();
		remove();
	}
	
	private void remove() {
		Map<Nonterminal, Expression> tempRules = new LinkedHashMap<>();
		for(Nonterminal n : this.input.getNonterminals()){
			Expression accept = this.input.getExpression(n).accept(this);
			if(n.equals(this.startSymbol.entrySet().iterator().next().getKey())){
				System.out.println("yes");
				Map<Nonterminal, Expression> start = new HashMap<>();
				start.put(n, accept);
				this.output.setStartSymbol(start);
			}
			tempRules.put(n, accept);
		}
		this.output.setGrammarMap(tempRules);		
	}	

	public GrammarMap getOutput() {
		return output;
	}

	@Override
	public Expression visit(Terminal terminal) {
		return terminal;
	}

	@Override
	public Expression visit(Nonterminal nonterminal) {
		return nonterminal;
	}

	@Override
	public Expression visit(Optional optional) {
		return empty;
	}

	@Override
	public Expression visit(Star star) {
		return empty;
	}

	@Override
	public Expression visit(Plus plus) {
		return empty;
	}

	@Override
	public Expression visit(Sequence sequence) {
		Sequence result = new Sequence();
		for(Expression exp : sequence.getSequence()){
			result.addExpr(exp.accept(this));
		}
		return result;
	}

	@Override
	public Expression visit(Empty empty) {
		return empty;
	}

	@Override
	public Expression visit(Choice choice) {
		Choice result = new Choice();
		for(Expression exp : choice.getChoices()){
			result.addExpr(exp.accept(this));
		}
		return result;
	}

}
