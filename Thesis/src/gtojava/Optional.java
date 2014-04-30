package gtojava;

public class Optional extends Expression{

	Expression expr;
	
	public Optional(){
	}
	
	public Optional(Expression e){
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
