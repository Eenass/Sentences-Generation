package dataGeneration;

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Productions implements Visitor<List<Expression>>{

	private Expression expr;
	private GrammarMap grammar;
	private List<Expression> prodList;
	private boolean bc, uc;
	
	public Productions(Expression expr, GrammarMap grammar, boolean bc, boolean uc) {
		this.expr = expr;
		this.grammar = grammar;
		this.bc = bc;
		this.uc = uc;
		this.prodList = this.expr.accept(this);
	}

	@Override
	public List<Expression> visit(Terminal terminal) {
		return new ArrayList<Expression>(Arrays.asList(terminal));
	}

	@Override
	public List<Expression> visit(Nonterminal nonterminal) {
		if(this.uc){
			Expression exp = this.grammar.getExpression(nonterminal);
			List<Expression> result = new ArrayList<Expression>();
			if(exp.getClass() == Choice.class){
				result = ((Choice)exp).getChoices();
			}
			else{
				result = new ArrayList<Expression>(Arrays.asList(exp));
			}
			return result;
		}
		return new ArrayList<Expression>(Arrays.asList(nonterminal));
	}

	@Override
	public List<Expression> visit(Optional optional) {
		List<Expression> list = optional.getExpr().accept(this);
		List<Expression> opts = new ArrayList<Expression>();
		for(Expression exp : list){
			opts.add(new Optional(exp));
			if(this.bc){
				opts.add(new Empty());
			}
		}
		return opts;
	}

	@Override
	public List<Expression> visit(Star star) {
		List<Expression> list = star.getExpr().accept(this);
		List<Expression> stars = new ArrayList<Expression>();
		for(Expression exp : list){
			stars.add(new Star(exp));
			if(this.bc){
				stars.add(new Empty());
			}
		}
		return stars;
	}

	@Override
	public List<Expression> visit(Plus plus) {
		List<Expression> list = plus.getExpr().accept(this);
		List<Expression> pluses = new ArrayList<Expression>();
		for(Expression exp : list){
			Plus plus2 = new Plus(exp);
			pluses.add(plus2);
			if(this.bc){
				Sequence seq = new Sequence();
				seq.addExpr(plus2);
				seq.addExpr(plus2);
				pluses.add(seq);
			}
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
