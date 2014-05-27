package mark;

import gtojava.Choice;
import gtojava.Expression;

import java.util.List;

public class MarkedChoice extends Choice{

	private List<Expression> list;
	private String marker;
	
	public MarkedChoice(List<Expression> list, String marker) {
		super(list);
		this.marker = marker;
	}

	public String getMarker() {
		return marker;
	}

	public boolean isMarked(){
		return !this.marker.equals("");
	}

}
