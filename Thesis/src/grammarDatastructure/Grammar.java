package grammarDatastructure;

import java.util.ArrayList;
import java.util.List;

public class Grammar {

	private List<ProductionRule> grammar;
		
	public Grammar() {
		this.grammar = new ArrayList<ProductionRule>();
	}

	public List<ProductionRule> getGrammar() {
		return grammar;
	}
	
	
	public void addProductionRule(ProductionRule rule){
		this.grammar.add(rule);
	}
	
}
