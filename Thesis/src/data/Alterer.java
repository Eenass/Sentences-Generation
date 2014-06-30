package data;

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

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Alterer implements Visitor<Expression>{
	
	private GrammarMap grammar;
	private Map<Nonterminal, Expression> startSymbol;
	private GrammarMap newGrammar;
	protected boolean equalsNonterminal = false;
	protected Map<Nonterminal, Boolean> coverage = new HashMap<Nonterminal, Boolean>();

	public Alterer(GrammarMap grammar, Map<Nonterminal, Expression> startSymbol) {
		this.grammar = grammar;
		this.startSymbol = startSymbol;
		this.newGrammar = new GrammarMap();
		alterGrammar();
	}

	private void alterGrammar() {
		initCoverage();
		Map<Nonterminal, Expression> tempRules = new LinkedHashMap<>();
		for(Nonterminal n : this.grammar.getNonterminals()){
			Expression accept = this.grammar.getExpression(n).accept(this);
			if(n.equals(this.startSymbol.entrySet().iterator().next().getKey())){
				System.out.println("yes");
				Map<Nonterminal, Expression> start = new HashMap<>();
				start.put(n, accept);
				this.newGrammar.setStartSymbol(start);
			}
			tempRules.put(n, accept);
		}
		this.newGrammar.setGrammarMap(tempRules);
	}	

	private void initCoverage() {
		for(Nonterminal n : this.grammar.getNonterminals()){
			coverage.put(n, false);
		}
		
	}

	@Override
	public Expression visit(Terminal terminal) {
		return terminal;
	}

	@Override
	public Expression visit(Nonterminal nonterminal) {
		if(!coverage.get(nonterminal)){
			equalsNonterminal = true;
			coverage.put(nonterminal, true);
		}
		return nonterminal;
	}

	@Override
	public Expression visit(Optional optional) {
		equalsNonterminal = false;
		Expression result = optional.getExpr().accept(this);
		if(equalsNonterminal){
			return result;
		}
		return new Empty();
	}

	@Override
	public Expression visit(Star star) {
		equalsNonterminal = false;
		Expression result = star.getExpr().accept(this);
		if(equalsNonterminal){
			return result;
		}
		return new Empty();
	}

	@Override
	public Expression visit(Plus plus) {
		return plus.getExpr();
	}

	@Override
	public Expression visit(Sequence sequence) {
		Sequence result = new Sequence();
		for(Expression exp : sequence.getSequence()){
			result.addExpr(exp.accept(this));
		}
		return result;
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

	public GrammarMap getNewGrammar() {
		return newGrammar;
	}

//	public void setNewGrammar(GrammarMap newGrammar) {
//		this.newGrammar = newGrammar;
//	}
//
//	public List<Nonterminal> getLastNonterminals() {
//		return lastNonterminals;
//	}
	
}
