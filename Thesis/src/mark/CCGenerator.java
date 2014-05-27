package mark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public abstract class CCGenerator {

	protected List<String> concatStrings(List<List<String>> str) {
		LinkedList<List <String>> lists = new LinkedList<List <String>>();
		for(List<String> l : str){
			lists.add(l);
		}
		
		Set<String> combinations = new TreeSet<String>();
		Set<String> newCombinations;

		for (String s: lists.removeFirst()){
			combinations.add(s);
		}	
		
		while (!lists.isEmpty()) {
			List<String> next = lists.removeFirst();
			newCombinations =  new TreeSet<String>();
			for (String s1: combinations){ 
				for (String s2 : next) {
					newCombinations.add(s1 + s2);               
				}
			}
			combinations = newCombinations;
		}
	
		return new ArrayList<String>(combinations) ;
	}
	
	protected List<String> findShortest(List<List<String>> strs) {
		List<String> shortest = new ArrayList<String>();
		for(List<String> l : strs){
			shortest.add(findShortestString(l));
		}
		List<String> result = new ArrayList<String>(Arrays.asList(findShortestString(shortest)));
		return result;
	}
	
	protected String findShortestString(List<String> strs) {
		String shortest = strs.get(0);
		for(int i = 1; i < strs.size(); i++){
			if(shortest.length() > strs.get(i).length()){
				shortest = strs.get(i);
			}
		}
		return shortest;
	}
	

	protected List<String> joinChoices(List<List<String>> strs) {
		List<String> result = new ArrayList<String>();
		for(List<String> l : strs){
			result.addAll(l);
		}
		return result;
		
	}


}
