package gtojava;

public class Terminal extends Expression{

	private String terminal;
	private boolean marker; 
	
	public Terminal(String terminal) {
		this.terminal = terminal;
	}
	
	public Terminal(String terminal, boolean marker){
		this.terminal = terminal;
		this.marker = marker;
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
	
	public void setMarker(boolean marker) {
		this.marker = marker;
	}

	public int hashCode(){
		return terminal.hashCode();
	}

	public boolean equals(Object other){
		return terminal.equals(((Terminal)other).getTerminal());
	}

	public boolean getMarker() {
		return marker;
	}
	
	public boolean isMarked(){
		return marker;
	}

}
