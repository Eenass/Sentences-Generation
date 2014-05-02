package buildAST;

import gtojava.Choice;
import gtojava.Empty;
import gtojava.Expression;
import gtojava.Nonterminal;
import gtojava.Optional;
import gtojava.Plus;
import gtojava.Sequence;
import gtojava.Star;
import gtojava.Terminal;
import gtojava.Visitor;

public class ASTPrinter implements Visitor<String>{

	public ASTPrinter() {
	}

	@Override
	public String visit(Terminal terminal) {
		return terminal.getTerminal().toString();
	}

	@Override
	public String visit(Nonterminal nonterminal) {
		return nonterminal.getName().toString();
	}

	@Override
	public String visit(Optional optional) {
		return optional.getExpr().accept(this) + "? ";
	}

	@Override
	public String visit(Star star) {
		return star.getExpr().accept(this) + "*";
	}

	@Override
	public String visit(Plus plus) {
		return plus.getExpr().accept(this) + "+";
	}

	@Override
	public String visit(Sequence sequence) {
		String str = "";
		for(Expression exp: sequence.getSequence()){
			if(exp instanceof Choice){
				str += visitInnerChoice((Choice) exp);
			}
			else{
				str += exp.accept(this) + " ";
			}
		}
		return str;
	}

	private String visitInnerChoice(Choice choice) {
		String str = "";
		for(Expression exp: choice.getChoices()){
			if(choice.getChoices().indexOf(exp) != choice.getChoices().size() - 1){
				str += exp.accept(this) + "|";
			}
			else{
				str += exp.accept(this);
			}
		}
		return str;
	}

	@Override
	public String visit(Empty empty) {
		return "";
	}

	@Override
	public String visit(Choice choice) {
		String str = "";
		for(Expression exp: choice.getChoices()){
			if(choice.getChoices().indexOf(exp) != choice.getChoices().size() - 1){
				str += exp.accept(this) + "\n\t|\t";
			}
			else{
				str += exp.accept(this) + " ";
			}
		}
		return str;
	}

}
