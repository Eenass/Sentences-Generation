package purdom;

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Productions implements Visitor<List<Expression>>{

	private Expression expr;
	private List<Expression> prodList;
	
	public Productions(Expression expr) {
		this.expr = expr;
		this.prodList = this.expr.accept(this);
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
		List<Expression> list = optional.getExpr().accept(this);
		List<Expression> opts = new ArrayList<Expression>();
		for(Expression exp : list){
			opts.add(new Optional(exp));
		}
		return opts;
	}

	@Override
	public List<Expression> visit(Star star) {
		List<Expression> list = star.getExpr().accept(this);
		List<Expression> stars = new ArrayList<Expression>();
		for(Expression exp : list){
			stars.add(new Star(exp));
		}
		return stars;
	}

	@Override
	public List<Expression> visit(Plus plus) {
		List<Expression> list = plus.getExpr().accept(this);
		List<Expression> pluses = new ArrayList<Expression>();
		for(Expression exp : list){
			pluses.add(new Plus(exp));
		}
		return pluses;
	}

	@Override
	public List<Expression> visit(Sequence sequence) {
		List<List<Expression>> list = new ArrayList<List<Expression>>();
		for(Expression exp : sequence.getSequence()){
			list.add(exp.accept(this));
		}
		ArrayList<Expression> result = concatExpressions(list);
		return result;
		
	}

	private ArrayList<Expression> concatExpressions(List<List<Expression>> exprs) {
		LinkedList<List<Expression>> lists = new LinkedList<List<Expression>>();
		for(List<Expression> l : exprs){
			lists.add(l);
		}
		List<Sequence> combinations = new ArrayList<Sequence>();
		List<Sequence> newCombinations;

		for (Expression exp: lists.removeFirst()){
			Sequence s = new Sequence();
			s.addExpr(exp);
			combinations.add(s);
		}	
		
		while (!lists.isEmpty()) {
			List<Expression> next = lists.removeFirst();
			newCombinations =  new ArrayList<Sequence>();
			for (Sequence s1: combinations){ 
				for(Expression e : next){
					List<Expression> exprList = new ArrayList<Expression>(s1.getSequence());
					Sequence temp = new Sequence(exprList);
					temp.addExpr(e);
					newCombinations.add(temp);
				}
			}
			combinations = newCombinations;
		}
	
		return new ArrayList<Expression>(combinations) ;
	}
	
	@Override
	public List<Expression> visit(Empty empty) {
		return new ArrayList<Expression>(Arrays.asList(empty));
	}

	@Override
	public List<Expression> visit(Choice choice) {
		List<Expression> list = new ArrayList<Expression>();
		for(Expression exp : choice.getChoices()){
			list.addAll(exp.accept(this));
		}
		return list;
	}

	public List<Expression> getProdList() {
		return prodList;
	}

}
