package gtojava;

import java.util.ArrayList;
import java.util.List;

public class Grammar {

	List<ProductionRule> grammar;
	
	public Grammar() {
		grammar = new ArrayList<ProductionRule>();
	}

	public List<ProductionRule> getGrammar() {
		return grammar;
	}

}
