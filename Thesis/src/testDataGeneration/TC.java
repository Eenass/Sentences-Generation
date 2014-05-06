package testDataGeneration;

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

public class TC implements Visitor<String>{
	
	private GrammarMap grammar;
	
	public TC(GrammarMap grammar) {
		this.grammar = grammar;
	}
	
	@Override
	public String visit(Terminal terminal) {
		return terminal.getTerminal();
	}

	@Override
	public String visit(Nonterminal nonterminal) {
		if(nonterminal.getName().equals("EOF")){
			System.out.println("yes");
			return "";
		}
		return this.grammar.getExpression(nonterminal).accept(this);
	}

	@Override
	public String visit(Optional optional) {
		return "";
	}

	@Override
	public String visit(Star star) {
		return "";
	}

	@Override
	public String visit(Plus plus) {
		return plus.getExpr().accept(this);
	}

	@Override
	public String visit(Sequence sequence) {
		String str = "";
		for(Expression exp : sequence.getSequence()){
			str += exp.accept(this);
		}
		return str;
	}

	@Override
	public String visit(Empty empty) {
		return "";
	}

	@Override
	public String visit(Choice choice) {
		return choice.getChoices().get(0).accept(this);
	}

}
