package grammarDatastructure;

public class Optional extends Expression{

	private Expression expr;
	
	public Optional(){
	}
	
	public Optional(Expression expr){
		this.expr = expr;
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
