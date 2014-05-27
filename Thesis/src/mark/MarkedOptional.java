package mark;

import gtojava.Expression;
import gtojava.Optional;

public class MarkedOptional extends Optional{
	
	private Expression expr;
	private String marker;

	public MarkedOptional(Expression expr, String marker) {
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
