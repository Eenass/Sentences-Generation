package grammarDatastructure;

import java.util.ArrayList;
import java.util.List;

public class Grammar {

	private List<ProductionRule> grammar;
	private List<Terminal> terminlas;
		
	public Grammar() {
		this.grammar = new ArrayList<ProductionRule>();
		this.terminlas = new ArrayList<Terminal>();
	}

	public List<ProductionRule> getGrammar() {
		return grammar;
	}	
	
	public List<Terminal> getTerminlas() {
		return terminlas;
	}

	public void addProductionRule(ProductionRule rule){
		this.grammar.add(rule);
	}
	
	public void addterminal(Terminal t){
		if(!this.terminlas.contains(t)){
			this.terminlas.add(t);
		}	
	}
	
}
