package mark;

import gtojava.Empty;

public class MarkedEmpty extends Empty{

	private String marker;
	
	public MarkedEmpty(String marker) {
		super();
		this.marker = marker;
	}

	public String getMarker() {
		return marker;
	}

	public boolean isMarked(){
		return !this.marker.equals("");
	}
}
