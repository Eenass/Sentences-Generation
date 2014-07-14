package data;

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

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ChangeGrammar implements Visitor<Expression>{

	private GrammarMap input;
	private Map<Nonterminal, Expression> startSymbol;
	private GrammarMap output;
	private Nonterminal realStart;
	private boolean yes = false;
	protected Nonterminal currentN = new Nonterminal("");

	public ChangeGrammar(GrammarMap input, Map<Nonterminal, Expression> startSymbol) {
		this.input = input;
		this.startSymbol = startSymbol;
		this.realStart = (Nonterminal) this.startSymbol.entrySet().iterator().next().getValue();
		this.output = new GrammarMap();
		changeGrammar();
	}

	public GrammarMap getOutput() {
		return output;
	}

	private void changeGrammar() {
//		Map<Nonterminal, Expression> start = new HashMap<Nonterminal, Expression>();
		Map<Nonterminal, Expression> rules = new LinkedHashMap<Nonterminal, Expression>();
		for(Nonterminal n: this.input.getNonterminals()){
			if(!n.equals(this.startSymbol.entrySet().iterator().next().getKey())){
				yes = false;
				currentN = n;
				Expression temp = this.input.getExpression(n).accept(this);
//				if(temp.getClass() != Empty.class){
					rules.put(n, temp);
//				}
			}	
		}
//		System.out.println("rules size " + rules.size());
		this.output.setGrammarMap(rules);
		this.output.getGrammarMap().putAll(startSymbol);
		this.output.setStartSymbol(startSymbol);
		
	}

	@Override
	public Expression visit(Terminal terminal) {
		return terminal;
	}

	@Override
	public Expression visit(Nonterminal nonterminal) {
		if(nonterminal.equals(realStart) && !nonterminal.equals(currentN)){
//			System.out.println(nonterminal.getName() + " realStart " + realStart.getName());
			yes = true;
			return nonterminal;
		}
		return nonterminal;
	}

	@Override
	public Expression visit(Optional optional) {
//		yes = false;
//		Expression result = optional.getExpr().accept(this);
//		if(yes){
//			yes = false;
//			return new Empty();
//		}
//		return result;
		return new Empty();
	}

	@Override
	public Expression visit(Star star) {
//		yes = false;
//		Expression result = star.getExpr().accept(this);
//		if(yes){
//			yes = false;
//			return new Empty();
//		}
//		return result;
		return new Empty();
	}

	@Override
	public Expression visit(Plus plus) {
		yes = false;
		Expression result = plus.getExpr().accept(this);
		if(yes){
			yes = false;
			return new Empty();
		}
		return result;
	}

	@Override
	public Expression visit(Sequence sequence) {
		Sequence result = new Sequence();
		for(Expression exp: sequence.getSequence()){
			result.addExpr(exp.accept(this));
		}
		if(yes){
			return new Empty();
		}
		return result;
	}

	@Override
	public Expression visit(Empty empty) {
		return empty;
	}

	@Override
	public Expression visit(Choice choice) {
		Choice ch = new Choice();
		for(Expression exp : choice.getChoices()){
			yes = false;
			Expression temp = exp.accept(this);
			if(!yes){
				ch.addExpr(temp);
			}
		}
		return ch;
	}

}
