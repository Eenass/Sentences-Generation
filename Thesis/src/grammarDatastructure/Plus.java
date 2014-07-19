package grammarDatastructure;

public class Plus extends Expression{

	private Expression expr;
	
	public Plus(Expression expr){
		this.expr = expr;
	}

	public Plus() {
	}
	
	public Expression getExpr() {
		return expr;
	}

	public void setExpr(Expression expr) {
		this.expr = expr;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
	
}
