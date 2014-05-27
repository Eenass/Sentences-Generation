package control;

import gtojava.Grammar;
import gtojava.GrammarMap;
import gtojava.Nonterminal;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import buildAST.ASTBuilder;
import buildAST.ASTPrinter;

public class TestControl {

	public static void main(String[] args) throws IOException {
		String filePath = "..\\Thesis\\src\\extractedGrammar\\ExtractedJava.g4";
		ASTBuilder astbuilder = new ASTBuilder(filePath);
		Grammar grammar = astbuilder.buildGrammar();
		ASTPrinter printer = new ASTPrinter();
		GrammarMap grammarMap = new GrammarMap(grammar);
//		DataControl datacontrol = new DataControl(grammarMap);
//		datacontrol.findPaths();
//		Map<Nonterminal, RuleProperties> paths = datacontrol.getRulesProprties();
//		Set<Nonterminal> keys = paths.keySet();
		Map<Nonterminal, RuleProperties> map = new HashMap<Nonterminal, RuleProperties>();
		for(Nonterminal n : grammarMap.getNonterminals()){
			RuleProperties rulepro = new RuleProperties(n, grammarMap.getExpression(n));
			
		}
		for(Nonterminal n : grammarMap.getNonterminals()){
			if(n.getName().equals("annotationTypeDeclaration")){
//				System.out.println("tastcontrol " + n.getName().toString());
				RuleProperties rulepro = new RuleProperties(n, grammarMap.getExpression(n));
				FindPaths paths = new FindPaths(grammarMap, rulepro);
				paths.printPaths(printer);
//				i++;
//			if (i == 1){
//				break;
			}
		}
		
//		for(Nonterminal n : keys){
//			if(n.getName().equals("Digit")){
//				int i = 0;
//				for(Expression exp : paths.get(n)){
//					System.out.println("\n" + i);
//					System.out.print(exp.accept(printer) + " ");
//					i++;
//				}
//			}
//		}
	}

}
