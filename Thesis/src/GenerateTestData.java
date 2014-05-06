import gtojava.Grammar;
import gtojava.GrammarMap;

import java.io.IOException;

import testDataGeneration.TC;
import buildAST.ASTBuilder;
import buildAST.ASTPrinter;


public class GenerateTestData {
	
	public static void main(String[] args) throws IOException{
		 String filePath = "..\\Thesis\\src\\extractedGrammar\\ExtractedJava.g4";
		 ASTBuilder astbuilder = new ASTBuilder(filePath);
		 ASTPrinter printer = new ASTPrinter();
		 Grammar grammar = astbuilder.buildGrammar();
		 GrammarMap grammarMap = new GrammarMap(grammar);
		 TC tc = new TC(grammarMap);
		 System.out.println(grammarMap.getRoot().accept(printer));
		 System.out.println(grammarMap.getRoot().accept(tc));
		 
	}	 
}
