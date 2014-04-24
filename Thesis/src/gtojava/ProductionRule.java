package gtojava;

public class ProductionRule extends ASTNode{
	
	String label;
	Nonterminal ruleName;
	Expression expr;
	
	public ProductionRule(String label, Nonterminal ruleName, Expression expr){
		this.label = label;
		this.ruleName = ruleName;
		this.expr = expr;
	}
}
