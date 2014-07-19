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
import java.util.Arrays;
import java.util.List;

public class ExpressionElements implements Visitor<List<Expression>>{

	private Expression expr;
	private List<Expression> elements;
	
	public ExpressionElements(Expression expr) {
		this.expr = expr;
		this.elements = this.expr.accept(this);
	}
	
	public List<Expression> getElements() {
		return elements;
	}
	
	@Override
	public List<Expression> visit(Terminal terminal) {
		return new ArrayList<Expression>(Arrays.asList(terminal));
	}

	@Override
	public List<Expression> visit(Nonterminal nonterminal) {
		return new ArrayList<Expression>(Arrays.asList(nonterminal));
	}

	@Override
	public List<Expression> visit(Optional optional) {
		List<Expression> result = new ArrayList<Expression>();
		List<Expression> list = optional.getExpr().accept(this);
		for(Expression e : list){
			result.add(new Optional(e));
		}
		return result;
	}

	@Override
	public List<Expression> visit(Star star) {
		List<Expression> result = new ArrayList<Expression>();
		List<Expression> list = star.getExpr().accept(this);
		for(Expression e : list){
			result.add(new Star(e));
		}
		return result;
	}

	@Override
	public List<Expression> visit(Plus plus) {
		List<Expression> result = new ArrayList<Expression>();
		List<Expression> list = plus.getExpr().accept(this);
		for(Expression e : list){
			result.add(new Plus(e));
		}
		return result;
	}

	@Override
	public List<Expression> visit(Sequence sequence) {
		List<Expression> result = new ArrayList<Expression>();
		for(Expression e : sequence.getSequence()){
			result.addAll(e.accept(this));
		}
		return result;
	}

	@Override
	public List<Expression> visit(Empty empty) {
		return new ArrayList<Expression>(Arrays.asList(empty));
	}

	@Override
	public List<Expression> visit(Choice choice) {
		assert(false) : "No choice in expression";
		throw new UnsupportedOperationException();
	}

}
