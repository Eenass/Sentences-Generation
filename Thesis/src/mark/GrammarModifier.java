package mark;

import java.util.HashMap;
import java.util.Map;

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

public class GrammarModifier implements Visitor<Expression>{

	private GrammarMap grammar;
	protected Expression empty = new Empty();
	
	public GrammarModifier(GrammarMap grammar) {
		this.grammar = grammar;
		modifyGrammar();
	}
	
	public GrammarMap getGrammar() {
		return grammar;
	}

	private void modifyGrammar() {
		Map<Nonterminal, Expression> temp = new HashMap<Nonterminal, Expression>();
		temp.put(this.grammar.getRoot().getRuleName(), this.grammar.getRoot().getExpr().accept(this));
		this.grammar.setStartSymbol(temp);
		for(Nonterminal n : grammar.getNonterminals()){
			this.grammar.putRule(n, this.grammar.getExpression(n).accept(this));
		}
		
	}

	@Override
	public Expression visit(Terminal terminal) {
		if(terminal.isMarked()){
			return terminal;
		}
		return empty;
	}

	@Override
	public Expression visit(Nonterminal nonterminal) {
		if(nonterminal.isMarked()){
			return nonterminal;
		}
		return empty;
	}

	@Override
	public Expression visit(Optional optional) {
		if(optional.isMarked()){
			return optional.getExpr().accept(this);
		}
		return empty;
	}

	@Override
	public Expression visit(Star star) {
		if(star.isMarked()){
			return star.getExpr().accept(this);
		}
		return empty;
	}

	@Override
	public Expression visit(Plus plus) {
		if(plus.isMarked()){
			return plus.getExpr().accept(this);
		}
		return empty;
	}

	@Override
	public Expression visit(Sequence sequence) {
		Sequence result = new Sequence();
		if(sequence.isMarked()){
			for(Expression exp : sequence.getSequence()){				
				Expression accept = exp.accept(this);
				if(accept.getClass() != Empty.class){
					result.addExpr(accept);
				}	
			}
		}
		return result;
	}

	@Override
	public Expression visit(Empty empty) {
		if(empty.isMarked()){
			return empty;
		}
		return empty;
	}

	@Override
	public Expression visit(Choice choice) {
		Choice result = new Choice();
		if(choice.isMarked()){
			for(Expression exp : choice.getChoices()){
				result.addExpr(exp.accept(this));
			}
		}
		return result;
	}

	

}
