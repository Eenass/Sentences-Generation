package purdom;

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

import java.util.ArrayList;

public class GetNonterminals implements Visitor<Expression>{

	private Expression expr;
	private ArrayList<Nonterminal> nonterminals;
	
	public GetNonterminals(Expression expr) {
		this.expr = expr;
		this.nonterminals = new ArrayList<Nonterminal>();
		this.expr.accept(this);
	}
	
	public ArrayList<Nonterminal> getNonterminals() {
		return nonterminals;
	}
	
	public boolean containsNonterminals(){
		return !this.nonterminals.isEmpty();
	}

	@Override
	public Expression visit(Terminal terminal) {
		return new Empty();
	}

	@Override
	public Expression visit(Nonterminal nonterminal) {
		if(!this.nonterminals.contains(nonterminal)){
			this.nonterminals.add(nonterminal);
		}
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
		for(Expression exp: sequence.getSequence()){
			exp.accept(this);
		}
		return new Empty();
	}

	@Override
	public Expression visit(Empty empty) {
		return empty;
	}

	@Override
	public Expression visit(Choice choice) {
		assert(false) : "There may not be a choice";
		throw new UnsupportedOperationException();
	}

}
