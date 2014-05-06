package testDataGeneration;

import gtojava.Nonterminal;

import java.util.HashMap;
import java.util.Map;

public class PredefinedLiterals {

	private Map<Nonterminal, Object> literals;
	
	public PredefinedLiterals() {
		this.literals = new HashMap<Nonterminal, Object>();
	}
	
	public Map<Nonterminal, Object> getLiterals() {
		return literals;
	}
	
	public void addLiterals(Nonterminal nonterminal, Object object){
		this.literals.put(nonterminal, object);
	}

	public Object getValue(Nonterminal nonterminal){
		return this.literals.get(nonterminal);
	}
	
	public boolean containsNonterminal(Nonterminal nonterminal){
		return this.literals.containsKey(nonterminal);
	}
	
}
