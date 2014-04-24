package gtojava;

public class Star extends Expression{
	
	Expression expr;
	
	public Star(Expression e)
	{
		this.expr = e;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

}
