package gtojava;

public class Plus extends Expression{

	private Expression expr;
	private String marker;
	
	public void setMarker(String marker) {
		this.marker = marker;
	}

	public Plus(Expression expr){
		this.expr = expr;
	}

	public Plus() {
	}
	
	public Plus(Expression expr, String marker){
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
		return !this.marker.equals("");
	}
	
	public String getMarker() {
		return marker;
	}

}
