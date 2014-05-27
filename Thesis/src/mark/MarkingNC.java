package mark;

import java.util.HashMap;
import java.util.Map;

import gtojava.Choice;
import gtojava.Empty;
import gtojava.Expression;
import gtojava.GrammarMap;
import gtojava.Nonterminal;
import gtojava.Optional;
import gtojava.Plus;
import gtojava.Sequence;
import gtojava.Star;
import gtojava.Terminal;
import gtojava.Visitor;

public class MarkingNC implements Visitor<Expression>{

	private GrammarMap grammar;
	
	public MarkingNC(GrammarMap grammar) {
		this.grammar = grammar;
		markingNC();
	}

	public GrammarMap getGrammar() {
		return grammar;
	}

	public void markingNC(){
		Map<Nonterminal, Expression> temp = new HashMap<Nonterminal, Expression>();
		temp.put(this.grammar.getRoot().getRuleName(), this.grammar.getRoot().getExpr().accept(this));
		this.grammar.setStartSymbol(temp);
		for(Nonterminal n : grammar.getNonterminals()){
			this.grammar.putRule(n, this.grammar.getExpression(n).accept(this));
		}
	}

	@Override
	public Expression visit(Terminal terminal) {
		terminal.setMarker("");
		return terminal;
	}

	@Override
	public Expression visit(Nonterminal nonterminal) {
		nonterminal.setMarker("nc");
		return nonterminal;
	}

	@Override
	public Expression visit(Optional optional) {
		optional.setMarker("");
		return optional;
	}

	@Override
	public Expression visit(Star star) {
		star.setExpr(star.getExpr().accept(this));
		star.setMarker("");
		return star;
	}

	@Override
	public Expression visit(Plus plus) {
		plus.setExpr(plus.getExpr().accept(this));
		plus.setMarker("nc");
		return plus;
	}

	@Override
	public Expression visit(Sequence sequence) {
		Sequence temp = new Sequence();
		for(Expression exp : sequence.getSequence()){	
			temp.addExpr(exp.accept(this));
		}
		temp.setMarker("nc");
		return temp;
	}

	@Override
	public Expression visit(Empty empty) {
		empty.setMarker("");
		return empty;
	}

	@Override
	public Expression visit(Choice choice) {
		Choice temp = new Choice();
		for(Expression exp : choice.getChoices()){
			temp.addExpr(exp.accept(this));
		}
		temp.setMarker("nc");
		return temp;
	}

}
