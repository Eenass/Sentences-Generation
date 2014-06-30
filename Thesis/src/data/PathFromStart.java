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
import java.util.List;
import java.util.Map.Entry;

public class PathFromStart implements Visitor<Expression>{

	private GrammarMap grammar;
	private Nonterminal current;
	protected Empty empty = new Empty();
	protected boolean finish = false;
	private List<Nonterminal> path = new ArrayList<Nonterminal>();
	protected List<Nonterminal> visited = new ArrayList<Nonterminal>();
	
	public PathFromStart(GrammarMap grammar, Nonterminal current) {
		this.grammar = grammar;
		this.current = current;
		findPath();
	}
	
	public List<Nonterminal> getPath() {
		return path;
	}

	public void findPath(){
		Entry<Nonterminal, Expression> start = this.grammar.getStartSymbol().entrySet().iterator().next();
		Nonterminal s = start.getKey();
		Expression e = start.getValue();
		this.path.add(s);
		for(Nonterminal n : this.grammar.getNonterminals()){
			if(n.equals(s)){
				continue;
			}
			else if(n.equals(current)){
				break;
			}
			else{
				finish = false;
				this.grammar.getExpression(n).accept(this);
				if(finish){
					this.path.add(n);
				}
			}
		}
	}

	@Override
	public Expression visit(Terminal terminal) {
		return empty;
	}

	@Override
	public Expression visit(Nonterminal nonterminal) {
		System.out.println("nonterminal " +  nonterminal.getName());
		if(nonterminal.equals(this.current)){
			finish = true;
		}
		else if(!this.path.contains(nonterminal)){
			this.grammar.getExpression(nonterminal).accept(this);
		}
		return nonterminal;
	}

	@Override
	public Expression visit(Optional optional) {
		return optional.getExpr().accept(this);
	}

	@Override
	public Expression visit(Star star) {
		return star.getExpr().accept(this);
	}

	@Override
	public Expression visit(Plus plus) {
		return plus.getExpr().accept(this);
	}

	@Override
	public Expression visit(Sequence sequence) {
		System.out.println("sequence " + sequence.getSequence().size());
		for(Expression exp: sequence.getSequence()){
			exp.accept(this);
			if(finish){
				break;
			}	
		}
		return empty;
	}

	@Override
	public Expression visit(Empty empty) {
		return empty;
	}

	@Override
	public Expression visit(Choice choice) {
		for(Expression exp : choice.getChoices()){
			exp.accept(this);
			if(finish){
				break;
			}	
		}
		return empty;
	}

}
