package gtojava;

import java.util.ArrayList;
import java.util.List;

public class Choice extends Expression{

	private List<Expression> choices;
	
	public Choice() {
		choices = new ArrayList<Expression>();
	}

	public Choice(List<Expression> es) {
		this.choices = es;
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

}
