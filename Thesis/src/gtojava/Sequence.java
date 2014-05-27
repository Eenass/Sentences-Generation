package gtojava;

import java.util.ArrayList;
import java.util.List;

public class Sequence extends Expression{

	private List<Expression> sequence;
	
	public void setSequence(List<Expression> sequence) {
		this.sequence = sequence;
	}

	private String marker;
	
	public void setMarker(String marker) {
		this.marker = marker;
	}

	public Sequence() {
		this.sequence = new ArrayList<Expression>();
	}

	public Sequence(List<Expression> sequence) {
		this.sequence = sequence;
	}

	public Sequence(List<Expression> sequence, String marker){
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
		return !this.marker.equals("");
	}
	
	public String getMarker() {
		return this.marker;
	}
	
	public String getName() {
		return marker;
	}

//	public int hashCode(){
//		return marker.hashCode();
//	}



}

