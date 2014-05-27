package control;

import gtojava.Empty;
import gtojava.Expression;
import gtojava.Nonterminal;

import java.util.ArrayList;
import java.util.List;

public class RuleProperties {

	private Nonterminal nonterminal;
	private Expression expression;
	private List<Path> productions;
	private Path shortest;
	
	public RuleProperties(Nonterminal nonterminal, Expression expression) {
		this.nonterminal = nonterminal;
		this.expression = expression;
		this.productions = new ArrayList<Path>();
		this.shortest = new Path();
	}
	
	public void setProductions(List<Path> productions) {
		this.productions = productions;
	}

	public List<Path> getProductions() {
		return productions;
	}
	
	public Path getShortest() {
		return shortest;
	}
	
	public void setShortest(Path shortest) {
		this.shortest = shortest;
	}
	
	public void addProduction(Path prod){
		this.productions.add(prod);
	}

	public Expression getExpression() {
		return expression;
	}

}
