package mark;

import gtojava.Expression;
import gtojava.Plus;

public class MarkedPlus extends Plus{

	private Expression expr;
	private String marker;
	
	public MarkedPlus(Expression expr, String marker) {
		super(expr);
		this.marker = marker;
	}
	
	public String getMarker() {
		return marker;
	}

	public boolean isMarked(){
		return !this.marker.equals("");
	}

}
