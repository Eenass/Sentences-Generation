package buildAST;

import grammarParser.ANTLRv4Lexer;
import grammarParser.ANTLRv4Parser;
import gtojava.Expression;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ASTBuilder {
	
	private ANTLRv4Parser parser;

	public ASTBuilder(String filePath) throws IOException {
		InputStream inputstream = new FileInputStream(filePath);
		ANTLRInputStream input = new ANTLRInputStream(inputstream);
//		System.out.println("The input is \n" + input.toString());
		ANTLRv4Lexer lexer = new ANTLRv4Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new ANTLRv4Parser(tokens);
	}

	public Expression buildGrammar(){
		ParseTree tree = parser.grammarSpec();
		BuilderVisitor astBuilder = new BuilderVisitor();
		return tree.accept(astBuilder);
	}
	
	public ANTLRv4Parser getParser() {
		return parser;
	}

}
