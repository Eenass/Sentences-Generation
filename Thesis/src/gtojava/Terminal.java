package gtojava;

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

}
