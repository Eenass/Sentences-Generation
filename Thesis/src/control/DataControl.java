package control;

import gtojava.Choice;
import gtojava.Empty;
import gtojava.Expression;
import gtojava.GrammarMap;
import gtojava.Nonterminal;
import gtojava.Optional;
import gtojava.Plus;
import gtojava.Sequence;
import gtojava.Star;
import gtojava.Terminal;
import gtojava.Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DataControl implements Visitor<List<Path>>{

	private GrammarMap grammar;
	private Map<Nonterminal, RuleProperties> rulesProprties;
//	Map<Nonterminal, ArrayList<Expression>> paths;
	
	public DataControl(GrammarMap grammar) {
		this.grammar = grammar;
		this.rulesProprties = new HashMap<Nonterminal, RuleProperties>();
		findPaths();
	}


	public Map<Nonterminal, RuleProperties> getRulesProprties() {
		return rulesProprties;
	}

	public void findPaths(){
		for(Nonterminal n : grammar.getNonterminals()){
			RuleProperties pro = new RuleProperties(n, this.grammar.getExpression(n));
			this.rulesProprties.put(n, pro);
			this.rulesProprties.get(n).setProductions(this.grammar.getExpression(n).accept(this));
		}
	}

	@Override
	public List<Path> visit(Terminal terminal) {
		Path path = new Path();
		path.addNode(terminal);
		return new ArrayList(Arrays.asList(path));
	}

	@Override
	public List<Path> visit(Nonterminal nonterminal) {
		System.out.println("nonterminal : " + nonterminal.getName());
		if(this.rulesProprties.containsKey(nonterminal)){
			System.out.println("yes");
			if(!this.rulesProprties.get(nonterminal).getProductions().isEmpty()){
				System.out.println("not empty");
				if(!checkRecursion(nonterminal, this.rulesProprties.get(nonterminal))){
					System.out.println("path does not contain nonterminal " + this.rulesProprties.get(nonterminal).getProductions().size());
					Path path = new Path();
					path.addNode(nonterminal);
					return new ArrayList(Arrays.asList(path));
				}
				else{
					System.out.println("in else");
					List<Path> result = new ArrayList<Path>();
					return result;
				}
			}
			else{
				List<Path> list = this.grammar.getExpression(nonterminal).accept(this);
				this.rulesProprties.get(nonterminal).setProductions(list);
				return list;
			}	
		}	
		else{
			RuleProperties pro = new RuleProperties(nonterminal, this.grammar.getExpression(nonterminal));
			this.rulesProprties.put(nonterminal, pro);
			List<Path> list = this.grammar.getExpression(nonterminal).accept(this);
			this.rulesProprties.get(nonterminal).setProductions(list);
			return list;
		}
	}

	private boolean checkRecursion(Nonterminal nonterminal,	RuleProperties ruleProperties) {
		boolean result = false;
		RecursionChecker checker = new RecursionChecker(nonterminal);
		for(Path path : ruleProperties.getProductions()){
			boolean temp = checkRec(checker, path);
			if(temp == true){
				result = temp;
				break;
			}
		}
		return result;
	}

	private boolean checkRec(RecursionChecker checker, Path path) {
		boolean result = false;
		for(Expression exp : path.getPath()){
			boolean temp = exp.accept(checker);
			if(temp == true){
				result = temp;
				break;
			}
		}
		return result;
	}

	@Override
	public List<Path> visit(Optional optional) {
		return optional.getExpr().accept(this);
	}

	@Override
	public List<Path> visit(Star star) {
		return star.getExpr().accept(this);
	}

	@Override
	public List<Path> visit(Plus plus) {
		return plus.getExpr().accept(this);
	}

	@Override
	public List<Path> visit(Sequence sequence) {
		List<List<Path>> list = new ArrayList<List<Path>>();
		for(int i = 0; i < sequence.getSequence().size(); i++){
			list.add(i, sequence.getSequence().get(i).accept(this));
		}
		List<Path> result = combinePaths(list);
		return result;		
	}

	private List<Path> combinePaths(List<List<Path>> list) {
		
		LinkedList<List <Path>> lists = new LinkedList<List <Path>>();
		for(List<Path> l : list){
	    	lists.add(l);
	    }

		Set<Path> combinations = new TreeSet<Path>();
		Set<Path> newCombinations;

		for (Path path: lists.removeFirst()){
			combinations.add(path);
		}
		while (!lists.isEmpty()) {
			List<Path> next = lists.removeFirst();
			newCombinations =  new TreeSet<Path>();
			for (Path path1: combinations) {
				for (Path path2 : next) {
					newCombinations.add(path1.addPath(path2));
				}
			}	       
	        combinations = newCombinations;
		}
		List<Path> result = new ArrayList<Path>(combinations);
		return result;
	    
	}

	@Override
	public List<Path> visit(Empty empty) {
		return new ArrayList(Arrays.asList(new Path()));
	}

	@Override
	public List<Path> visit(Choice choice) {
		List<List<Path>> list = new ArrayList<List<Path>>();
		List<Path> paths = new ArrayList<Path>();
		for(Expression exp : choice.getChoices()){
			list.add(exp.accept(this));
		}
		for(List<Path> l : list){
			for(Path p : l){
				paths.add(p);
			}
		}
		return paths;
	}
}
