package purdom;

import grammarDatastructure.Expression;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProductionsRLEN {

	private List<Expression> prods;
	private Map<Expression, Integer> prodsRlen;
	
	public ProductionsRLEN(List<Expression> prods) {
		this.prods = prods;
		this.prodsRlen = new LinkedHashMap<Expression, Integer>();
		makeRLEN();
	}

	public Map<Expression, Integer> getProdsRlen() {
		return prodsRlen;
	}

	public void makeRLEN(){
		for(Expression e: this.prods){
			this.prodsRlen.put(e, Integer.MAX_VALUE);
		}
	}
	
	public void updateRlen(Expression exp, int value){
		this.prodsRlen.put(exp, value);
	}
	
	public int getProdValue(Expression exp){
		return this.prodsRlen.get(exp);
	}
	
	public Set<Expression> getKeys(){
		return this.getProdsRlen().keySet();
	}
	
	public void updateValue(Expression exp, int value){
		int current = this.prodsRlen.get(exp);
		if((current < 0 || current > value) && value >= 0){
			this.prodsRlen.put(exp, value);
		}	
		
	}

	public Map<Expression, Integer> findMin() {
		Map<Expression, Integer> result = new HashMap<Expression, Integer>();

		Entry<Expression, Integer> currentMin = this.prodsRlen.entrySet().iterator().next();
		for(Entry<Expression, Integer> entry : this.prodsRlen.entrySet()){
			int value = entry.getValue();
			if((currentMin.getValue() < 0 || currentMin.getValue() > value) && value >= 0){
				currentMin = entry;				
			}
		}
		result.put(currentMin.getKey(), currentMin.getValue());
		return result;
	}
	
}