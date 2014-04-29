package gtojava;

public class Star extends Expression{
	
	Expression expr;
	
	public Star(Expression e){
		this.expr = e;
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