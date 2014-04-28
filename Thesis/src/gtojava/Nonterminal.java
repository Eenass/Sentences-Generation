package gtojava;

public class Nonterminal extends Expression{

	private String name;
	
	public Nonterminal(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public String getName() {
		return name;
	}

}
