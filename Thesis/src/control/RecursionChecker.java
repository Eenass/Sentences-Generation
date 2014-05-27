package control;

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

public class RecursionChecker implements Visitor<Boolean>{

	private Nonterminal nonterminal;

	public RecursionChecker(Nonterminal nonterminal) {
		this.nonterminal = nonterminal;
	}

	@Override
	public Boolean visit(Terminal terminal) {
		return false;
	}

	@Override
	public Boolean visit(Nonterminal nonterminal) {
		if(nonterminal.equals(this.nonterminal)){
			return true;
		}
		return false;
	}

	@Override
	public Boolean visit(Optional optional) {
		return optional.getExpr().accept(this);
	}

	@Override
	public Boolean visit(Star star) {
		return star.getExpr().accept(this);
	}

	@Override
	public Boolean visit(Plus plus) {
		return plus.getExpr().accept(this);
	}

	@Override
	public Boolean visit(Sequence sequence) {
		boolean result = false;
		for(Expression exp : sequence.getSequence()){
			boolean temp = exp.accept(this);
			if(temp == true){
				result = temp;
				break;
			}
		}
		return result;
	}

	@Override
	public Boolean visit(Empty empty) {
		return false;
	}

	@Override
	public Boolean visit(Choice choice) {
		boolean result = false;
		for(Expression exp : choice.getChoices()){
			boolean temp = exp.accept(this);
			if(temp == true){
				result = temp;
				break;
			}
		}
		return result;
	}

}
