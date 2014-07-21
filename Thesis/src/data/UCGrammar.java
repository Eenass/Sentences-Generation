package data;

import grammarDatastructure.Choice;
import grammarDatastructure.Empty;
import grammarDatastructure.Expression;
import grammarDatastructure.GrammarMap;
import grammarDatastructure.Nonterminal;
import grammarDatastructure.Optional;
import grammarDatastructure.Plus;
import grammarDatastructure.ProductionRule;
import grammarDatastructure.Sequence;
import grammarDatastructure.Star;
import grammarDatastructure.Terminal;
import grammarDatastructure.Visitor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UCGrammar implements Visitor<Expression>{

	private GrammarMap grammar;
	private Map<Nonterminal, List<Terminal>> sentences;
	private Map<Nonterminal, Expression> temp = new LinkedHashMap<>();
	private Map<Nonterminal, Expression> newRules = new LinkedHashMap<Nonterminal, Expression>();
	private Map<Nonterminal, Expression> start = new HashMap<>();
	private Map<Nonterminal, ProductionRule> rewrittenN = new HashMap<>();
	private GrammarMap output;
	int count = 100;
	
	public UCGrammar(GrammarMap grammar, Map<Nonterminal, List<Terminal>> sentences) {
		this.grammar = grammar;
		this.sentences = sentences;
		this.output = new GrammarMap();
		ucGrammar();
	}

	public GrammarMap getOutput() {
		return output;
	}

	private void ucGrammar() {
		for(Nonterminal n : this.grammar.getNonterminals()){
			Expression result = this.grammar.getExpression(n).accept(this);
			if(n.equals(this.grammar.getStartSymbol().entrySet().iterator().next().getKey())){
				start.put(n, result);
			}
			temp.put(n, result);
			temp.putAll(newRules);
		}
		this.output.setGrammarMap(temp);
		this.output.setStartSymbol(start);
	}
	@Override
	public Expression visit(Terminal terminal) {
		return terminal;
	}

	@Override
	public Expression visit(Nonterminal nonterminal) {
		if(!rewrittenN.containsKey(nonterminal)){
			Nonterminal n = new Nonterminal("nont" + Integer.toString(count));
			count++;
			Choice ch = new Choice();
			ch.addExpr(nonterminal);
			for(Expression exp : this.sentences.get(nonterminal)){
				ch.addExpr(exp);
			}
			newRules.put(n, ch);
			rewrittenN.put(nonterminal, new ProductionRule(n, ch));
			return n;
		}
		else{
			return rewrittenN.get(nonterminal).getRuleName();
		}
	}

	@Override
	public Expression visit(Optional optional) {
		return new Optional(optional.getExpr().accept(this));
	}

	@Override
	public Expression visit(Star star) {
		return new Star(star.getExpr().accept(this));
	}

	@Override
	public Expression visit(Plus plus) {
		return new Plus(plus.getExpr().accept(this));
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
