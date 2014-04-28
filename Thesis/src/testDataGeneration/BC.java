package testDataGeneration;

import gtojava.Choice;
import gtojava.Empty;
import gtojava.Expression;
import gtojava.Nonterminal;
import gtojava.Optional;
import gtojava.Plus;
import gtojava.Selectable;
import gtojava.Sequence;
import gtojava.Star;
import gtojava.Terminal;
import gtojava.Visitor;

public class BC implements Visitor<Expression>{

	public BC() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Expression visit(Terminal terminal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression visit(Nonterminal nonterminal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression visit(Optional optional) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression visit(Star star) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression visit(Plus plus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression visit(Sequence sequence) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression visit(Empty empty) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression visit(Selectable selectable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression visit(Choice choice) {
		// TODO Auto-generated method stub
		return null;
	}

}
