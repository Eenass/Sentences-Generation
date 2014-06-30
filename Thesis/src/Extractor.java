import gtojava.Grammar;
import gtojava.ProductionRule;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import buildAST.ASTBuilder;
import buildAST.ASTPrinter;


public class Extractor {
	
	public static void main(String[] args) throws IOException{
//		 String filePath = "..\\Thesis\\src\\otherGrammar\\C.g4";
//		 String filePath = "..\\Thesis\\src\\otherGrammar\\jvmBasic.g4";
		 String filePath = "..\\Thesis\\src\\otherGrammar\\DOT.g4";
//		 File f = new File("..\\Thesis\\src\\extractedGrammar\\ExtractedJava.g4");
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedC.g4");
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedjvmBasic.g4");
		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedDOT.g4");

		 f.createNewFile();
		 PrintWriter writer = new PrintWriter("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedDOT.g4", "UTF-8");
		 ASTBuilder astbuilder = new ASTBuilder(filePath);
		 ASTPrinter printer = new ASTPrinter();
		 Grammar grammar = astbuilder.buildGrammar();
		 System.out.println("print results");
		 writer.println("grammar ExtractedDOT;");
		 for(ProductionRule rule: grammar.getGrammar()){
			 writer.println("\n"+rule.getRuleName().accept(printer) + "\n\t:\t" + rule.getExpr().accept(printer) + "\n\t;");
		 }
		 writer.close();
//		 for(ProductionRule rule: grammar.getGrammar()){
//			 System.out.println("\n"+rule.getRuleName().accept(printer) + "\n\t:\t" + rule.getExpr().accept(printer) + "\n\t;");
//		 }
	}	 		

}
