package gtojava;

public class Nonterminal extends Expression{

	private String name;
	private boolean marker;
	
	public Nonterminal(String name) {
		this.name = name;
	}

	public Nonterminal(String name, boolean marker){
		this.name = name;
		this.marker = marker;
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

	public void setMarker(boolean marker) {
		this.marker = marker;
	}

	public int hashCode(){
		return name.hashCode();
	}

	public boolean equals(Object other){
		return name.equals(((Nonterminal)other).getName());
	}
	
	public boolean isMarked(){
		return marker;
	}

	public boolean getMarker() {
		return marker;
	}
}
