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

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import buildAST.ASTPrinter;

public class Accessible implements Visitor<Boolean>{

	private GrammarMap grammar;
	private Map<Nonterminal, Expression> startSymbol;
	private List<Nonterminal> accessible;
	private GrammarMap filteredGrammar;
	
	public Accessible(GrammarMap grammar, Map<Nonterminal, Expression> startSymbol) {
		this.grammar = grammar;
		this.startSymbol = startSymbol;
		this.accessible = new ArrayList<Nonterminal>();
		this.filteredGrammar = new GrammarMap();
		findNonterminals();
	}

	public GrammarMap getFilteredGrammar() {
		return filteredGrammar;
	}

	public List<Nonterminal> getAccessible() {
		return accessible;
	}
	
	private void findNonterminals() {
		Entry<Nonterminal, Expression> entry = this.startSymbol.entrySet().iterator().next();
		Expression value = entry.getValue();
//		Nonterminal key = entry.getKey();
//		System.out.println("start " + key.getName() + " real start " + ((Nonterminal)value).getName());
		value.accept(this);
		Map<Nonterminal, Expression> rules = new LinkedHashMap<Nonterminal, Expression>();
		rules.putAll(this.startSymbol);
		for(Nonterminal n: this.accessible){
			rules.put(n, this.grammar.getExpression(n));
		}
		this.filteredGrammar.setStartSymbol(startSymbol);
		this.filteredGrammar.setGrammarMap(rules);
	}

	@Override
	public Boolean visit(Terminal terminal) {
		return true;
	}

	@Override
	public Boolean visit(Nonterminal nonterminal) {
//		System.out.println("to be added " + nonterminal.getName());
		if(!this.accessible.contains(nonterminal)){
			this.accessible.add(nonterminal);
			this.grammar.getExpression(nonterminal).accept(this);
		}	
		return true;
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
		for(Expression exp: sequence.getSequence()){
			exp.accept(this);
		}
		return true;
	}

	@Override
	public Boolean visit(Empty empty) {
		return true;
	}

	@Override
	public Boolean visit(Choice choice) {
		for(Expression exp : choice.getChoices()){
			exp.accept(this);
		}
		return true;
	}

}
