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
		 Grammar grammar = astbuilder.buildGrammar();
		 System.out.println("print results");
		 for(ProductionRule rule: grammar.getGrammar()){
			 System.out.println("\n"+rule.getRuleName().accept(printer) + "\n\t:\t" + rule.getExpr().accept(printer) + "\n\t;");
		 }
	}	 		

}
