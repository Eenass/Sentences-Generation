package testDataGeneration;

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
import java.util.Map;
import java.util.Set;

public class NC implements Visitor<String>{
	
	private GrammarMap grammar;
	PredefinedLiterals literals = new PredefinedLiterals();
	Map<Nonterminal, Integer> coverage = initializeCoverage();

	public NC(GrammarMap grammar) {
		this.grammar = grammar;
	}
	
	private Map<Nonterminal, Integer> initializeCoverage(){
		Map<Nonterminal, Integer> temp = new HashMap<Nonterminal, Integer>();
		Set<Nonterminal> nonterminals = grammar.getNonterminals();
		for(Nonterminal n : nonterminals){
			temp.put(n, 0);
		}
		return temp;
	}

	@Override
	public String visit(Terminal terminal) {
		return terminal.getTerminal();
	}

	@Override
	public String visit(Nonterminal nonterminal) {
		String str = generateNonterminalValue(nonterminal);
		if(str.equals("")){
			return grammar.getExpression(nonterminal).accept(this);
		}
		incrementCoverage(nonterminal);
		return str;
	}

	private void incrementCoverage(Nonterminal nonterminal) {
		coverage.put(nonterminal, coverage.get(nonterminal)+1);		
	}

	@Override
	public String visit(Optional optional) {
		return optional.accept(this);
	}

	@Override
	public String visit(Star star) {
		return star.accept(this);
	}

	@Override
	public String visit(Plus plus) {
		return plus.accept(this);
	}

	@Override
	public String visit(Sequence sequence) {
		String str = "";
		for(Expression exp : sequence.getSequence()){
			str += exp.accept(this);
		}
		return str;
	}

	@Override
	public String visit(Empty empty) {
		return "";
	}

	@Override
	public String visit(Choice choice) {
		return choice.getChoices().get(0).accept(this);
	}
	
	private String generateNonterminalValue(Nonterminal nonterminal){
		if(literals.containsNonterminal(nonterminal)){
			return literals.getValue(nonterminal).toString();
		}
		else if(nonterminal.getName().contains("IntegerLiteral") ||
				nonterminal.getName().contains("Digit") ||
				nonterminal.getName().contains("DecimalNumeral")){
			Object i = 1;
			literals.addLiterals(nonterminal, i);
			return i.toString();
		}
		else if(nonterminal.getName().contains("Identifier")){
			Object i = "ident";
			literals.addLiterals(nonterminal, i);
			return i.toString();
		}
		else if(nonterminal.getName().contains("SingleCharacter")){
			Object i = 'a';
			literals.addLiterals(nonterminal, i);
			return i.toString();
		}
		else if(nonterminal.getName().contains("StringCharacter")){
			Object i = 'x';
			literals.addLiterals(nonterminal, i);
			return i.toString();
		}
		else{
			return "";
		}
	}

}
