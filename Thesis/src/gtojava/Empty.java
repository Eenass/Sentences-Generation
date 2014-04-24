package gtojava;

public class Empty extends Expression{

	public Empty() {
		
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

}
