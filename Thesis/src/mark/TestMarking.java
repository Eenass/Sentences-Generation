package mark;

import gtojava.Grammar;
import gtojava.GrammarMap;
import gtojava.Nonterminal;

import java.io.IOException;

import buildAST.ASTBuilder;
import buildAST.ASTPrinter;

public class TestMarking {
	public static void main(String[] args) throws IOException{
		String filePath = "..\\Thesis\\src\\extractedGrammar\\ExtractedJava.g4";
		ASTBuilder astbuilder = new ASTBuilder(filePath);
		Grammar grammar = astbuilder.buildGrammar();
		GrammarMap grammarMap = new GrammarMap(grammar);
//		MarkingTC tc = new MarkingTC(grammarMap);
//		for(Nonterminal n : tc.getGrammar().getNonterminals()){
//			System.out.println(n.getName() + " " + tc.getGrammar().getExpression(n).getClass());
//		}
		
//		MarkingNC nc = new MarkingNC(grammarMap);
//		for(Nonterminal n : nc.getGrammar().getNonterminals()){
//			System.out.println(n.getName() + " " + nc.getGrammar().getExpression(n).getClass());
//		}
	}	
}
