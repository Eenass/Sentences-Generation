package mark;

import gtojava.Expression;
import gtojava.Star;

public class MarkedStar extends Star{

	private Expression expr;
	private String marker;
	
	public MarkedStar(Expression expr, String marker) {
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
