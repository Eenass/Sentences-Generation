package grammarDatastructure;

public class ProductionRule{
	
	Nonterminal ruleName;
	Expression expr;
	
	public ProductionRule(Nonterminal ruleName, Expression expr){
		this.ruleName = ruleName;
		this.expr = expr;
	}
	
	public Nonterminal getRuleName() {
		return ruleName;
	}

	public Expression getExpr() {
		return expr;
	}

}
