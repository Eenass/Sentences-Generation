package data;

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
import java.util.List;
import java.util.Map;

public class UCSentencesMaker implements Visitor<List<String>>{

	private GrammarMap grammar;
	private Map<Nonterminal, List<String>> sentences;
	private List<String> output;
	
	public UCSentencesMaker(GrammarMap grammar, Map<Nonterminal, List<String>> sentences){
		this.grammar = grammar;
		this.sentences = sentences;
		this.output = new ArrayList<String>();
	}
	
	
	@Override
	public List<String> visit(Terminal terminal) {
		return new ArrayList<String>(Arrays.asList(terminal.getTerminal()));
	}
	@Override
	public List<String> visit(Nonterminal nonterminal) {
		return null;
	}
	@Override
	public List<String> visit(Optional optional) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<String> visit(Star star) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<String> visit(Plus plus) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<String> visit(Sequence sequence) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<String> visit(Empty empty) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<String> visit(Choice choice) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
