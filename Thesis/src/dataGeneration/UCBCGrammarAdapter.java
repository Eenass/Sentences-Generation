package dataGeneration;

import grammarDatastructure.Choice;
import grammarDatastructure.Empty;
import grammarDatastructure.Expression;
import grammarDatastructure.GrammarMap;
import grammarDatastructure.Nonterminal;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UCBCGrammarAdapter {

	private GrammarMap grammar;
	private Map<Nonterminal, Expression> temp = new LinkedHashMap<>();
	private Map<Nonterminal, Expression> start = new HashMap<>();
	private boolean bc, uc;
	private GrammarMap output;
	
	public UCBCGrammarAdapter(GrammarMap grammar, boolean bc, boolean uc) {
		this.grammar = grammar;
		this.output = new GrammarMap();
		this.bc = bc;
		this.uc = uc;
		ucGrammar();
	}

	public GrammarMap getOutput() {
		return output;
	}

	private void ucGrammar() {
		Nonterminal startKey = this.grammar.getStartSymbol().entrySet().iterator().next().getKey();
		for(Nonterminal n : this.grammar.getNonterminals()){
			List<Expression> prods = new Productions(this.grammar.getExpression(n), this.grammar, this.bc, this.uc).getProdList();
			Expression result = new Empty();			
			if(prods.size() > 1){
				result = new Choice(prods);
			}
			else if(prods.size() == 1){
				result = prods.get(0);
			}
			if(n.equals(startKey)){
				if(result.getClass() == Choice.class){
					Nonterminal newStart = new Nonterminal("UCBCstart");
					start.put(newStart, n);
				}
				else{
					start.put(n, result);
				}				
			}			
			temp.putAll(start);
			temp.put(n, result);
		}
		this.output.setGrammarMap(temp);
		this.output.setStartSymbol(start);
	}
}
