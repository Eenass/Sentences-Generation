package grammarDatastructure;

import java.util.ArrayList;
import java.util.List;

public class Sequence extends Expression{

	private List<Expression> sequence;
	
	public void setSequence(List<Expression> sequence) {
		this.sequence = sequence;
	}

	public Sequence() {
		this.sequence = new ArrayList<Expression>();
	}

	public Sequence(List<Expression> sequence) {
		this.sequence = sequence;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public List<Expression> getSequence() {
		return sequence;
	}
	
	public void addExpr(Expression e){
		this.sequence.add(e);
	}
	
}

