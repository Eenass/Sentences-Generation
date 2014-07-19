package grammarDatastructure;

public class Terminal extends Expression{

	private String terminal;
	
	public Terminal(String terminal) {
		this.terminal = terminal;
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	
	public int hashCode(){
		return terminal.hashCode();
	}

	public boolean equals(Object other){
		return terminal.equals(((Terminal)other).getTerminal());
	}

}
