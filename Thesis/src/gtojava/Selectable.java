package gtojava;

public class Selectable extends Expression{

	String selector;
	Expression expr;
	
	public Selectable(String sel, Expression e)
	{
		this.selector = sel;
		this.expr = e;
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
