package gtojava;

public class Optional extends Expression{

	Expression expr;
	
	public Optional(Expression e)
	{
		this.expr = e;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

}
