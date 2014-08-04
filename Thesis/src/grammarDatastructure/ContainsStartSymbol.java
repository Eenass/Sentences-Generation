package grammarDatastructure;

import java.util.ArrayList;
import java.util.List;

public class ContainsStartSymbol implements Visitor<Boolean>{

	private Nonterminal start;
	
	public ContainsStartSymbol(Nonterminal start) {
		this.start = start;
	}

	@Override
	public Boolean visit(Terminal terminal) {
		return false;
	}

	@Override
	public Boolean visit(Nonterminal nonterminal) {
		if(nonterminal.equals(this.start)){
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
		List<Boolean> l = new ArrayList<Boolean>();
		for(Expression exp: sequence.getSequence()){
			l.add(exp.accept(this));
		}
		if(l.contains(true)){
			return true;
		}
		return false;
	}

	@Override
	public Boolean visit(Empty empty) {
		return false;
	}

	@Override
	public Boolean visit(Choice choice) {
		List<Boolean> l = new ArrayList<Boolean>();
		for(Expression exp: choice.getChoices()){
			l.add(exp.accept(this));
		}
		if(l.contains(true)){
			return true;
		}
		return false;
	}

}
