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
//		 String filePath = "..\\Thesis\\src\\otherGrammar\\DOT.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\Clojure.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\Erlang.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\creole.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\asm6502.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\bnf.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\CSV.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\fasta.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\gff3.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\ICalendar.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\IDL.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\IRI.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\JSON.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\logo.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\ObjC.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\PCRE.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\PGN.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\redcode.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\Smalltalk.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\SQLite.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\Swift.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\tnt.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\TURTLE.g4";
//		 File f = new File("..\\Thesis\\src\\extractedGrammar\\ExtractedJava.g4");
//		String filePath = "..\\Thesis\\src\\otherGrammar\\Verilog2001.g4";
		String filePath = "..\\Thesis\\src\\otherGrammar\\WebIDL.g4";
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedC.g4");
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedjvmBasic.g4");
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedDOT.g4");
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedClojure.g4");
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedErlang.g4");
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\Extractedcreole.g4");
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\Extractedasm6502.g4");
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\Extractedbnf.g4");
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedCSV.g4");
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\Extractedfasta.g4");
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\Extractedgff3.g4");
//		 File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedICalendar.g4");
//		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedIDL.g4");
//		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedIRI.g4");
//		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedJSON.g4");
//		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\Extractedlogo.g4");
//		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedObjC.g4");
//		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedPCRE.g4");
//		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedPGN.g4");
//		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedSmalltalk.g4");
//		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedSQLite.g4");
//		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedSwift.g4");
//		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\Extractedtnt.g4");
//		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedTURTLE.g4");
//		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedVerilog2001.g4");
		File f = new File("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedWebIDL.g4");
		

		 

		 f.createNewFile();
		 PrintWriter writer = new PrintWriter("..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedWebIDL.g4", "UTF-8");
		 ASTBuilder astbuilder = new ASTBuilder(filePath);
		 ASTPrinter printer = new ASTPrinter();
		 Grammar grammar = astbuilder.buildGrammar();
		 System.out.println("print results");
		 writer.println("grammar ExtractedWebIDL;");
		 for(ProductionRule rule: grammar.getGrammar()){
			 writer.println("\n"+rule.getRuleName().accept(printer) + "\n\t:\t" + rule.getExpr().accept(printer) + "\n\t;");
		 }
		 writer.close();
//		 for(ProductionRule rule: grammar.getGrammar()){
//			 System.out.println("\n"+rule.getRuleName().accept(printer) + "\n\t:\t" + rule.getExpr().accept(printer) + "\n\t;");
//		 }
	}	 		

}
