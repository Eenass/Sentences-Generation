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
//		System.out.println("Terminal " + terminal.getTerminal().toString() + "\n");
		return terminal.getTerminal().toString();
	}

	@Override
	public String visit(Nonterminal nonterminal) {
//		System.out.println("Nonterminal " + nonterminal.getName().toString() + "\n");
		return nonterminal.getName().toString();
	}

	@Override
	public String visit(Optional optional) {
//		System.out.println("Optional " + optional.getExpr().getClass() + "\n");
		return optional.getExpr().accept(this);
	}

	@Override
	public String visit(Star star) {
		return star.getExpr().accept(this);
	}

	@Override
	public String visit(Plus plus) {
//		System.out.println("Plus " + plus.getExpr().accept(this) + "+ ");
		return plus.getExpr().accept(this) + "+ ";
	}

	@Override
	public String visit(Sequence sequence) {
		String str = "";
		for(Expression exp: sequence.getSequence()){
//			System.out.println("Sequence exp " + exp.accept(this) + " ");
			str += exp.accept(this) + " ";
		}
		return str;
	}

	@Override
	public String visit(Empty empty) {
//		System.out.println("Empty");
		return "";
	}

	@Override
	public String visit(Choice choice) {
		String str = "";
		for(Expression exp: choice.getChoices()){
//			System.out.println("Choice exp " + exp.accept(this) + "\n \t |");
			str += exp.accept(this) + "\n \t |";
		}
		return str;
	}

}
