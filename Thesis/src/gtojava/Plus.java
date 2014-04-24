package gtojava;

public class Plus extends Expression{

	Expression expr;
	
	public Plus(Expression e)
	{
		this.expr = e;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

}
