package gtojava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class GrammarMap {

	private Grammar grammar;
	Map<Nonterminal, Expression> grammarMap;
	Map<Nonterminal, Expression> startSymbol;
	
	public GrammarMap(Grammar grammar){
		this.grammar = grammar;
		this.grammarMap = new HashMap<Nonterminal, Expression>();
		this.startSymbol = new HashMap<Nonterminal, Expression>();
		grammarToMap();
	}
	
	public void grammarToMap(){
		for(ProductionRule rule: grammar.getGrammar()){
			if(rule.getRuleName().equals(getRoot().ruleName)){
				this.startSymbol.put(rule.getRuleName(), rule.getExpr());
			}
			putRule(rule.getRuleName(), rule.getExpr());			
		}
	}

	public void setStartSymbol(Map<Nonterminal, Expression> startSymbol) {
		this.startSymbol = startSymbol;
	}

	public Map<Nonterminal, Expression> getGrammarMap() {
		return grammarMap;
	}
	
	public Map<Nonterminal, Expression> getStartSymbol() {
		return startSymbol;
	}

	public Expression getStartSymbolExpression(){
		return startSymbol.get(this.getRoot().ruleName);
	}
	
	public void putRule(Nonterminal ruleName, Expression expr){
		this.grammarMap.put(ruleName, expr);
	}
	
	public Expression getExpression(Nonterminal nonterminal){
		return this.grammarMap.get(nonterminal);
	}
	
	public Set<Nonterminal> getNonterminals(){
		Set<Nonterminal> keySet = this.grammarMap.keySet();
		return keySet;
	}

	public ProductionRule getRoot(){
		return grammar.getGrammar().get(0);
	}
	
	public List<Terminal> getTerminals(){
		return grammar.getTerminals();
	}
}
