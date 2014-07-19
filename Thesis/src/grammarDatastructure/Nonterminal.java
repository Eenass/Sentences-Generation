package grammarDatastructure;

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

	public int hashCode(){
		return name.hashCode();
	}

	public boolean equals(Object other){
		return name.equals(((Nonterminal)other).getName());
	}
	
}
