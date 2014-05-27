package control;

import gtojava.Expression;

import java.util.ArrayList;
import java.util.List;

public class Path implements Comparable<Path>{

	private List<Expression> path;
	
	public Path() {
		this.path = new ArrayList<Expression>();
	}

	public List<Expression> getPath() {
		return path;
	}

	public void setPath(List<Expression> path) {
		this.path = path;
	}
	
	public void addNode(Expression exp){
		this.path.add(exp);
	}
	
	public Path addPath(Path p){
		for(Expression exp : p.getPath()){
			addNode(exp);
		}
		Path pa = new Path();
		pa.path = this.path;
		return pa;
	}

	@Override
	public int compareTo(Path arg0) {
		if(this.path.size() == arg0.getPath().size()){
			return 0;
		}
		else if(this.path.size() < arg0.getPath().size()){
			return 1;
		}
		else{
			return -1;
		}
	}

}
