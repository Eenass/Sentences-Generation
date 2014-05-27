package mark;

import gtojava.Nonterminal;

public class MarkedNonterminal extends Nonterminal{

	private String name;
	private String marker;
	
	public MarkedNonterminal(String name, String marker) {
		super(name);
		this.marker = marker;
	}

	public String getMarker() {
		return marker;
	}

	public boolean isMarked(){
		return !this.marker.equals("");
	}
}
