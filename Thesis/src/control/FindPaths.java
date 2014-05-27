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
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import buildAST.ASTPrinter;

public class FindPaths implements Visitor<List<Path>>{

	private GrammarMap grammar;
	private RuleProperties rulePro;

	public FindPaths(GrammarMap grammar, RuleProperties rulePro) {
		this.grammar = grammar;
		this.rulePro = rulePro;
		this.rulePro.getExpression().accept(this);
	}

	@Override
	public List<Path> visit(Terminal terminal) {
		System.out.println("terminal " + terminal.getTerminal().toString());
		Path p = new Path();
		p.addNode(terminal);
		return new ArrayList(Arrays.asList(p));
	}

	@Override
	public List<Path> visit(Nonterminal nonterminal) {
		System.out.println("Nonterminal " + nonterminal.getName().toString());
		Path p = new Path();
		p.addNode(nonterminal);
		return new ArrayList(Arrays.asList(p));
	}

	@Override
	public List<Path> visit(Optional optional) {
		System.out.println("optional");
		return this.rulePro.getExpression().accept(this);
	}

	@Override
	public List<Path> visit(Star star) {
		System.out.println("star");
		return this.rulePro.getExpression().accept(this);
	}

	@Override
	public List<Path> visit(Plus plus) {
		System.out.println("plus");
		return this.rulePro.getExpression().accept(this);
	}

	@Override
	public List<Path> visit(Sequence sequence) {
		System.out.println("sequence");
		List<Path> temp = this.rulePro.getProductions();
		List<List<Path>> list = new ArrayList<List<Path>>();
		list.add(temp);
		for(int i = 0; i < sequence.getSequence().size(); i++){
			List<Path> accept = sequence.getSequence().get(i).accept(this);
			list.add(accept);
		}
		System.out.println("list size " + list.size());
		List<Path> result = combinePaths(list);
		System.out.println("result size " + result.size());
		this.rulePro.setProductions(result);
		return this.rulePro.getProductions();
	}

	@Override
	public List<Path> visit(Empty empty) {
		System.out.println("empty");
		for(int i = 0; i < this.rulePro.getProductions().size(); i++){
			this.rulePro.getProductions().get(i).addNode(empty);			
		}
		return this.rulePro.getProductions();
	}

	@Override
	public List<Path> visit(Choice choice) {
		System.out.println("choice " + choice.getChoices().size());
		List<List<Path>> temp = new ArrayList<List<Path>>();
		for(Expression exp: choice.getChoices()){
			temp.add(exp.accept(this));
		}
		List<Path> result = new ArrayList<Path>();
		for(List<Path> l : temp){
			result.addAll(l);
		}
		this.rulePro.setProductions(result);
		this.printPaths(new ASTPrinter());
		return this.rulePro.getProductions();
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
	
	private List<Path> combinePaths(List<List<Path>> list) {
		
		LinkedList<List <Path>> lists = new LinkedList<List <Path>>();
		for(List<Path> l : list){
	    	lists.add(l);
	    }
		System.out.println("in combine paths " + lists.size());
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
	public void printPaths(ASTPrinter printer){
		System.out.println("printing paths " + this.rulePro.getProductions().size());
		for(Path p : this.rulePro.getProductions()){
			for(Expression exp: p.getPath()){
				System.out.print(exp.accept(printer) + " ");
			}
			System.out.println();
		}
	}

}
