import gtojava.Grammar;
import gtojava.GrammarMap;
import gtojava.Nonterminal;
import gtojava.NormalizedGrammar;

import java.io.IOException;

import buildAST.ASTBuilder;
import buildAST.ASTPrinter;


public class TestNormalizing {

	public static void main(String[] args) throws IOException {
		ASTPrinter printer = new ASTPrinter();
//		String filePath = "..\\Thesis\\src\\testGrammar\\Testgrammar.g4";
		String filePath = "..\\Thesis\\src\\extractedGrammar\\ExtractedJava.g4";
		ASTBuilder astbuilder = new ASTBuilder(filePath);
		Grammar grammar = astbuilder.buildGrammar();
		GrammarMap grammarMap = new GrammarMap(grammar);
		NormalizedGrammar NGrammar = new NormalizedGrammar(grammarMap);
		for(Nonterminal n : NGrammar.getNormalizedGrammar().getNonterminals()){
			System.out.println(n.getName() + ": " + NGrammar.getNormalizedGrammar().getExpression(n).accept(printer));
		}
	}

}
