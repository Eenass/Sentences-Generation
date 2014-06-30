package data;

import gtojava.Expression;
import gtojava.Grammar;
import gtojava.GrammarMap;
import gtojava.Nonterminal;
import gtojava.NormalizedGrammar;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

import buildAST.ASTBuilder;
import buildAST.ASTPrinter;

public class TestPath {

	public static void main(String[] args) throws IOException {
		ASTPrinter printer = new ASTPrinter();
//		String filePath = "..\\Thesis\\src\\testGrammar\\Test4.g4";
		String filePath = "..\\Thesis\\src\\extractedGrammar\\ExtractedJava.g4";
		ASTBuilder astbuilder = new ASTBuilder(filePath);
		Grammar grammar = astbuilder.buildGrammar();
		GrammarMap grammarMap = new GrammarMap(grammar);
		NormalizedGrammar NGrammar = new NormalizedGrammar(grammarMap);
		Entry<Nonterminal, Expression> start = NGrammar.getNormalizedGrammar().getStartSymbol().entrySet().iterator().next();
		Nonterminal s = start.getKey();
		Expression e = start.getValue();
		for(Nonterminal n : NGrammar.getNormalizedGrammar().getNonterminals()){
			if(!n.equals(s)){
				System.out.println("\ncurrent nonterminal is " + n.getName() + " " + NGrammar.getNormalizedGrammar().getExpression(n).accept(printer));
//				PathFromStart path = new PathFromStart(NGrammar.getNormalizedGrammar(), n);
//				List<Nonterminal> list = path.getPath();
//				for(Nonterminal n1 : list){
//					System.out.print(n1.getName() + " ");
//				}
			}
		}
	}

}
