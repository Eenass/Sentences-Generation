package gtojava;

public class Star extends Expression{
	
	private Expression expr;
	private boolean marker;
	
	public void setMarker(boolean marker) {
		this.marker = marker;
	}

	public Star(Expression e){
		this.expr = e;
	}
	
	public Star() {
	}

	public Star(Expression expr, boolean marker){
		this.expr = expr;
		this.marker = marker;
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

	public boolean isMarked(){
		return marker;
	}
	
	public boolean getMarker() {
		return marker;
	}
}