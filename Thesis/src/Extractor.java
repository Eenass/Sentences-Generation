import java.io.IOException;

import buildAST.ASTBuilder;


public class Extractor {
	
	public static void main(String[] args) throws IOException{
		 String filePath = "..\\Thesis\\src\\antlr\\Java.g4";
		 ASTBuilder astbuilder = new ASTBuilder(filePath);
		 System.out.println(astbuilder.buildGrammar());
	}	 
		

}
