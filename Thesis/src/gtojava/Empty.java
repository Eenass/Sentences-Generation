package gtojava;

public class Empty extends Expression{

	private boolean marker;
	
	public void setMarker(boolean marker) {
		this.marker = marker;
	}

	public Empty() {		
	}

	public Empty(boolean marker){
		this.marker = marker;
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
