package grammarDatastructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NormalizedGrammar implements Visitor<Expression>{

	private GrammarMap grammar;
	private GrammarMap normalizedGrammar;
	private Map<Nonterminal, Expression> temp = new LinkedHashMap<>();
	private Map<Nonterminal, Expression> newRules = new LinkedHashMap<Nonterminal, Expression>();
	private Map<Nonterminal, Expression> start = new HashMap<>();
	protected int count = 0;

	public NormalizedGrammar(GrammarMap grammar) {
		this.grammar = grammar;
		this.normalizedGrammar = new GrammarMap();
		normalize();
	}

	private void normalize() {
		for(Nonterminal n : this.grammar.getNonterminals()){
			Expression result = this.grammar.getExpression(n).accept(this);
			if(n.equals(this.grammar.getStartSymbol().entrySet().iterator().next().getKey())){
				start.put(n, result);
			}
			temp.put(n, result);
			temp.putAll(newRules);
		}
		this.normalizedGrammar.setGrammarMap(temp);
		this.normalizedGrammar.setStartSymbol(start);
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
		Optional result = new Optional();
		if(optional.getExpr().getClass() == Choice.class){
			String name = "opt" + Integer.toString(count);
			count++;
			Nonterminal nt = new Nonterminal(name);
			Expression exp = optional.getExpr().accept(this);
			newRules.put(nt, exp);
			result.setExpr(nt);
		}
		else{
			Expression exp = optional.getExpr().accept(this);
			result.setExpr(exp);
		}
		return result;
	}

	@Override
	public Expression visit(Star star) {
		Star result = new Star();
		if(star.getExpr().getClass() == Choice.class){
			String name = "star" + Integer.toString(count);
			count++;
			Nonterminal nt = new Nonterminal(name);
			Expression exp = star.getExpr().accept(this);
			newRules.put(nt, exp);
			result.setExpr(nt);
		}
		else{
			Expression exp = star.getExpr().accept(this);
			result.setExpr(exp);
		}
		return result;
	}

	@Override
	public Expression visit(Plus plus) {
		Plus result = new Plus();
		if(plus.getExpr().getClass() == Choice.class){
			String name = "plus" + Integer.toString(count);
			count++;
			Nonterminal nt = new Nonterminal(name);
			Expression exp = plus.getExpr().accept(this);
			newRules.put(nt, exp);
			result.setExpr(nt);
		}
		else{
			Expression exp = plus.getExpr().accept(this);
			result.setExpr(exp);
		}
		return result;
	}

	@Override
	public Expression visit(Sequence sequence) {
		Sequence result = new Sequence();
		for(Expression exp : sequence.getSequence()){
			if(exp.getClass() == Choice.class){
				String name = "seq" + Integer.toString(count);
				count++;
				Nonterminal nt = new Nonterminal(name);
				Expression expr = exp.accept(this);
				newRules.put(nt, expr);
				result.addExpr(nt);
			}
			else{
				result.addExpr(exp.accept(this));
			}
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
		for(Expression exp: choice.getChoices()){
			if(exp.getClass() == Choice.class){
				String name = "choice" + Integer.toString(count);
				count++;
				Nonterminal nt = new Nonterminal(name);
				Expression expr = exp.accept(this);
				newRules.put(nt, expr);
				result.addExpr(nt);
			}
			else{
				result.addExpr(exp.accept(this));
			}
		}
		return result;
	}

	public GrammarMap getNormalizedGrammar() {
		return normalizedGrammar;
	}

	public void setNormalizedGrammar(GrammarMap normalizedGrammar) {
		this.normalizedGrammar = normalizedGrammar;
	}

}
