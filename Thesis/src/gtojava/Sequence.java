package gtojava;

import java.util.ArrayList;
import java.util.List;

public class Sequence extends Expression{

	private List<Expression> sequence;
	
	public void setSequence(List<Expression> sequence) {
		this.sequence = sequence;
	}

	private boolean marker;
	
	public void setMarker(boolean marker) {
		this.marker = marker;
	}

	public Sequence() {
		this.sequence = new ArrayList<Expression>();
	}

	public Sequence(List<Expression> sequence) {
		this.sequence = sequence;
	}

	public Sequence(List<Expression> sequence, boolean marker){
		this.sequence = sequence;
		this.marker = marker;
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
	
	public boolean isMarked(){
		return marker;
	}
	
	public boolean getMarker() {
		return this.marker;
	}
	
	public boolean getName() {
		return marker;
	}

//	public int hashCode(){
//		return marker.hashCode();
//	}



}

