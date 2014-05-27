package mark;

import gtojava.Terminal;

public class MarkedTerminal extends Terminal{

	private String name;
	private String marker;
	
	public MarkedTerminal(String name, String marker) {
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
