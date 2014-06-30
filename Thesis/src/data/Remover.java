package data;

import gtojava.Choice;
import gtojava.Empty;
import gtojava.Expression;
import gtojava.Nonterminal;
import gtojava.Optional;
import gtojava.Plus;
import gtojava.Sequence;
import gtojava.Star;
import gtojava.Terminal;
import gtojava.Visitor;

public class Remover implements Visitor<Expression>{

	protected Expression empty = new Empty();
	public Remover() {
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
