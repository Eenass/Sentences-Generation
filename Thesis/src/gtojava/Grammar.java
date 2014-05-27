package gtojava;

import java.util.ArrayList;
import java.util.List;

public class Grammar {

	List<ProductionRule> grammar;
	List<Terminal> terminals;
	
	public Grammar() {
		this.grammar = new ArrayList<ProductionRule>();
		this.terminals = new ArrayList<Terminal>();
	}

	public List<ProductionRule> getGrammar() {
		return grammar;
	}
	
	public List<Terminal> getTerminals() {
		return terminals;
	}
	
	public void addProductionRule(ProductionRule rule){
		this.grammar.add(rule);
	}
	
	public void addTerminal(Terminal terminal){
		this.terminals.add(terminal);
	}


}
