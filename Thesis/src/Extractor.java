import java.io.IOException;

import buildAST.ASTBuilder;
import buildAST.ASTPrinter;


public class Extractor {
	
	public static void main(String[] args) throws IOException{
		 String filePath = "..\\Thesis\\src\\antlr\\Java.g4";
		 ASTBuilder astbuilder = new ASTBuilder(filePath);
		 ASTPrinter printer = new ASTPrinter();
		 astbuilder.buildGrammar().accept(printer);
	}	 		

}
