import gtojava.Grammar;
import gtojava.ProductionRule;

import java.io.IOException;

import buildAST.ASTBuilder;
import buildAST.ASTPrinter;


public class Extractor {
	
	public static void main(String[] args) throws IOException{
		 String filePath = "..\\Thesis\\src\\antlr\\Java.g4";
		 ASTBuilder astbuilder = new ASTBuilder(filePath);
		 ASTPrinter printer = new ASTPrinter();
//		 String accept = astbuilder.buildGrammar().accept(printer);
		 Grammar grammar = astbuilder.buildGrammar();
		 System.out.println("print results");
		 for(ProductionRule rule: grammar.getGrammar()){
			 System.out.println(rule.getRuleName().accept(printer));
		 }
	}	 		

}
