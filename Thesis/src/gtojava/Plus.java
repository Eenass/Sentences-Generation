package gtojava;

public class Plus extends Expression{

	Expression expr;
	
	public Plus(Expression e){
		this.expr = e;
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
