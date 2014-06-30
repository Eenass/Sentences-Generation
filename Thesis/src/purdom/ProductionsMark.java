package purdom;

import gtojava.Expression;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductionsMark {

//	private Expression expr;
	private Set<Expression> set;
	private Map<Expression, Boolean> prodsMark;
	
	public ProductionsMark(Set<Expression> set) {
		this.set = set;
		this.prodsMark = new LinkedHashMap<Expression, Boolean>();
	}

	public void markProductions(){
//		List<Expression> prods = new Productions(expr).getProdList();
		for(Expression e : this.set){
			this.prodsMark.put(e, false);
		}
	}
	
	public void updateMark(Expression exp, boolean value){
		this.prodsMark.put(exp, value);
	}

	public Boolean getProdValue(Expression exp){
		return this.prodsMark.get(exp);
	}
	
	public Set<Expression> getKeys(){
		return this.getProdsMark().keySet();
	}

	public Map<Expression, Boolean> getProdsMark() {
		return prodsMark;
	}
	
}
