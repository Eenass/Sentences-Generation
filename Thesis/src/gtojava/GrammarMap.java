package gtojava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class GrammarMap {

	private Grammar grammar;
	Map<Nonterminal, Expression> grammarMap;
	
	public GrammarMap(Grammar grammar){
		this.grammar = grammar;
		this.grammarMap = new HashMap<Nonterminal, Expression>();
	}
	
	public void grammarToMap(){
		for(ProductionRule rule: grammar.getGrammar()){
			this.grammarMap.put(rule.getRuleName(), rule.getExpr());
		}
	}

	public Map<Nonterminal, Expression> getGrammarMap() {
		return grammarMap;
	}
	
	public Expression getExpression(Nonterminal nonterminal){
		return this.grammarMap.get(nonterminal);
	}
	
	public Set<Nonterminal> getNonterminals(){
		return this.grammarMap.keySet();
	}

	public Expression getRoot(){
		return grammar.getGrammar().get(0).expr;
	}
}
