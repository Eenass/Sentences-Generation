package grammarDatastructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class GrammarMap {

	private Grammar grammar;
	private Map<Nonterminal, Expression> grammarMap;
	private Map<Nonterminal, Expression> startSymbol;
	
	public GrammarMap(){		
	}
	
	public GrammarMap(Grammar grammar){
		this.grammar = grammar;
		this.grammarMap = new LinkedHashMap<Nonterminal, Expression>();
		this.startSymbol = new HashMap<Nonterminal, Expression>();
		grammarToMap();
	}
	
	public void grammarToMap(){
		for(ProductionRule rule: grammar.getGrammar()){
			if(rule.getRuleName().equals(getRoot().ruleName)){
				if(rule.getExpr().getClass() == Choice.class){
					Nonterminal newStart = new Nonterminal("start");
					this.startSymbol.clear();
					this.startSymbol.put(newStart, rule.getRuleName());
					putRule(new ProductionRule(newStart, rule.getRuleName()));
				}
				else{
					this.startSymbol.clear();
					this.startSymbol.put(rule.getRuleName(), rule.getExpr());
				}				
			}
			else if(rule.getExpr().accept(new ContainsStartSymbol(this.startSymbol.keySet().iterator().next()))){
				Nonterminal newStart = new Nonterminal("start");
				this.startSymbol.clear();
				this.startSymbol.put(newStart, getRoot().ruleName);
				putRule(new ProductionRule(newStart, getRoot().ruleName));
			}
			putRule(rule);			
		}
	}

	public void setStartSymbol(Map<Nonterminal, Expression> startSymbol) {
		this.startSymbol = startSymbol;
	}

	public Map<Nonterminal, Expression> getGrammarMap() {
		return grammarMap;
	}
	
	public void setGrammarMap(Map<Nonterminal, Expression> grammarMap) {
		this.grammarMap = grammarMap;
	}

	public Map<Nonterminal, Expression> getStartSymbol() {
		return startSymbol;
	}

	public void putRule(ProductionRule rule){
		Nonterminal ruleName = rule.getRuleName();
		Expression expr = rule.getExpr();
		this.grammarMap.put(ruleName, expr);
	}
	
	public Expression getExpression(Nonterminal nonterminal){
		return this.grammarMap.get(nonterminal);
	}
	
	public Set<Nonterminal> getNonterminals(){
		Set<Nonterminal> keySet = this.grammarMap.keySet();
		return keySet;
	}

	private ProductionRule getRoot(){
		return grammar.getGrammar().get(0);
	}
	
}
