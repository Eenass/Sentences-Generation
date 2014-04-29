package gtojava;

import java.util.ArrayList;
import java.util.List;

public class Sequence extends Expression{

	private List<Expression> sequence;
	
	public Sequence() {
		this.sequence = new ArrayList<Expression>();
	}

	public Sequence(List<Expression> es) {
		this.sequence = es;
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

