import grammarParser.ANTLRv4Lexer;
import grammarParser.ANTLRv4Parser;
import grammarParser.ANTLRv4Parser.RulesContext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;


public class Extractor {
	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("..\\Thesis\\src\\antlr\\Java.g4"));
		ANTLRv4Lexer lexer = new ANTLRv4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ANTLRv4Parser parser = new ANTLRv4Parser(tokens);
		ParserRuleContext t = parser.grammarSpec();
//		String [] rules = parser.getRuleNames();
//		String [] prods = t.getText().split("[;]");
//		for(String p : prods){
//			System.out.println(p.toString());
//		}
		System.out.println(t.inspect(parser));
	}	

}
