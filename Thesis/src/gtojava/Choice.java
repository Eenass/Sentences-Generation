package gtojava;

import java.util.ArrayList;
import java.util.List;

public class Choice extends Expression{

	private List<Expression> choices;
	public void setChoices(List<Expression> choices) {
		this.choices = choices;
	}

	private boolean marker;
	
	public void setMarker(boolean marker) {
		this.marker = marker;
	}

	public Choice() {
		choices = new ArrayList<Expression>();
	}

	public Choice(List<Expression> exp) {
		this.choices = exp;
	}
	
	public Choice(List<Expression> exp, boolean marker) {
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
		return marker;
	}
	
	public boolean getMarker() {
		return marker;
	}
}
