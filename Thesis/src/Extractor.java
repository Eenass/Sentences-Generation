import grammarDatastructure.Grammar;
import grammarDatastructure.ProductionRule;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import buildAST.ASTBuilder;
import buildAST.ASTPrinter;


public class Extractor {
	
	public static void main(String[] args) throws IOException{

		 ASTPrinter printer = new ASTPrinter();
		 List<String> inputFiles = new ArrayList<String>();
		 String targetDir = "..\\Thesis\\GrammartestSet\\testSetGrammar";
		 File dir = new File(targetDir);
		 File[] files = dir.listFiles();
		 for (File f: files){
			 if(f.getName().contains(".g4")){
				 inputFiles.add(f.getAbsolutePath());
			 }
		 }
		 for(String filePath: inputFiles){
			 File f = new File(filePath);
			 String fileName = f.getName();
			 f = new File("..\\Thesis\\GrammartestSet\\extractedTestGrammar\\Extracted" + fileName);
			 f.createNewFile();
			 PrintWriter writer = new PrintWriter("..\\Thesis\\GrammartestSet\\extractedTestGrammar\\Extracted" + fileName, "UTF-8");
			 ASTBuilder astbuilder = new ASTBuilder(filePath);	
			 Grammar grammar = astbuilder.buildGrammar();
			 System.out.println("print results");
			 fileName = fileName.replace(".g4", ";");
			 writer.println("grammar Extracted" + fileName);
			 for(ProductionRule rule: grammar.getGrammar()){
				 writer.println("\n"+rule.getRuleName().accept(printer) + "\n\t:\t" + rule.getExpr().accept(printer) + "\n\t;");
			 }
			 writer.close();
		 }	 
	}	 		

}
