package buildAST;

import grammarDatastructure.Grammar;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlrGrammarParser.ANTLRv4Lexer;
import antlrGrammarParser.ANTLRv4Parser;

public class ASTBuilder {
	
	private ANTLRv4Parser parser;

	public ASTBuilder(String filePath) throws IOException {
		InputStream inputstream = new FileInputStream(filePath);
		ANTLRInputStream input = new ANTLRInputStream(inputstream);
		ANTLRv4Lexer lexer = new ANTLRv4Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new ANTLRv4Parser(tokens);
	}

	public Grammar buildGrammar(){
		ParseTree tree = parser.grammarSpec();
		ASTBuilderVisitor astBuilder = new ASTBuilderVisitor();
		tree.accept(astBuilder);
		return astBuilder.getGrammar();
	}
	
	public ANTLRv4Parser getParser() {
		return parser;
	}

}