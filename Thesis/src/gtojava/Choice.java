package gtojava;

import java.util.ArrayList;
import java.util.List;

public class Choice extends Expression{

	private List<Expression> choices;
	public void setChoices(List<Expression> choices) {
		this.choices = choices;
	}

	private String marker;
	
	public void setMarker(String marker) {
		this.marker = marker;
	}

	public Choice() {
		choices = new ArrayList<Expression>();
	}

	public Choice(List<Expression> exp) {
		this.choices = exp;
	}
	
	public Choice(List<Expression> exp, String marker) {
		this.choices = exp;
		this.marker = marker;
	}

	public List<Expression> getChoices() {
		return choices;
	}
	
	public void addExpr(Expression choice){
		this.choices.add(choice);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
	
	public boolean isMarked(){
		return !this.marker.equals("");
	}
	
	public String getMarker() {
		return marker;
	}
}
