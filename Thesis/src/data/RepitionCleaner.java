package data;

import grammarDatastructure.Choice;
import grammarDatastructure.Empty;
import grammarDatastructure.Expression;
import grammarDatastructure.Nonterminal;
import grammarDatastructure.Optional;
import grammarDatastructure.Plus;
import grammarDatastructure.Sequence;
import grammarDatastructure.Star;
import grammarDatastructure.Terminal;
import grammarDatastructure.Visitor;

public class RepitionCleaner implements Visitor<Expression> {

	public RepitionCleaner() {
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
		return optional.getExpr().accept(this);
	}

	@Override
	public Expression visit(Star star) {
		return star.getExpr().accept(this);
	}

	@Override
	public Expression visit(Plus plus) {
		return plus.getExpr().accept(this);
	}

	@Override
	public Expression visit(Sequence sequence) {
		Sequence seq = new Sequence();
		for(Expression exp : sequence.getSequence()){
			seq.addExpr(exp.accept(this));
		}
		return seq;
	}

	@Override
	public Expression visit(Empty empty) {
		return empty;
	}

	@Override
	public Expression visit(Choice choice) {
		Choice ch = new Choice();
		for(Expression exp : choice.getChoices()){
			ch.addExpr(exp.accept(this));
		}
		return ch;
	}

}
