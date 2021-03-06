package buildAST;

import grammarDatastructure.Choice;
import grammarDatastructure.Empty;
import grammarDatastructure.Expression;
import grammarDatastructure.Nonterminal;
import grammarDatastructure.Optional;
import grammarDatastructure.Plus;
import grammarDatastructure.Sequence;
import grammarDatastructure.Star;
import grammarDatastructure.Terminal;
import grammarDatastructure.Visitor;

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
		for(int i = 0; i < choice.getChoices().size(); i++){
			Expression exp = choice.getChoices().get(i);
			if(i != choice.getChoices().size()-1){
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
		for(int i = 0; i < choice.getChoices().size(); i++){
			Expression exp = choice.getChoices().get(i);
			if(i != choice.getChoices().size() - 1){
				str += exp.accept(this) + "\n\t|\t";
			}
			else{
				str += exp.accept(this) + " ";
			}
		}
		return str;
	}

}
