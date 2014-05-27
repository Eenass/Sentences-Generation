package gtojava;

public class Terminal extends Expression{

	private String terminal;
	private String marker; 
	
	public Terminal(String terminal) {
		this.terminal = terminal;
	}
	
	public Terminal(String terminal, String marker){
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
	
	public void setMarker(String marker) {
		this.marker = marker;
	}

	public int hashCode(){
		return terminal.hashCode();
	}

	public boolean equals(Object other){
		return terminal.equals(((Terminal)other).getTerminal());
	}

	public String getMarker() {
		return marker;
	}
	
	public boolean isMarked(){
		return !this.marker.equals("");
	}

}
