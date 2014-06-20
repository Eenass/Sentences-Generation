import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import testGrammar.Test4Lexer;
import testGrammar.Test4Parser;


public class TestRecognize {
	static StringBuffer buffer = new StringBuffer();
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		String f = "'a''c'('a''+''b')";
//		String f = "('a''+''b')'a''c'";
		String f = "'h''h'";
		ANTLRInputStream input = new ANTLRInputStream(f);	
		Test4Lexer lexer = new Test4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Test4Parser parser = new Test4Parser(tokens);
		parser.a();
		String str = parser.getNumberOfSyntaxErrors() > 0? "No" : "Yes";
		System.out.println(str + " " + parser.getNumberOfSyntaxErrors() );


	}

}
