package gtojava;

public class Empty extends Expression{

	private String marker;
	
	public void setMarker(String marker) {
		this.marker = marker;
	}

	public Empty() {		
	}

	public Empty(String marker){
		this.marker = marker;
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
