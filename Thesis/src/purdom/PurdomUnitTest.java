package purdom;

import gtojava.Expression;
import gtojava.Grammar;
import gtojava.GrammarMap;
import gtojava.Nonterminal;
import gtojava.NormalizedGrammar;
import gtojava.ProductionRule;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.*;

import static org.junit.Assert.*;
import buildAST.ASTBuilder;

public class PurdomUnitTest {

	
	public void test(String filePath, List<String> expected) throws IOException {
		ASTBuilder astbuilder = new ASTBuilder(filePath);
		Grammar grammar = astbuilder.buildGrammar();
		GrammarMap grammarMap = new GrammarMap(grammar);
		NormalizedGrammar NGrammar = new NormalizedGrammar(grammarMap);
		Map<Nonterminal, Expression> startSymbol = NGrammar.getNormalizedGrammar().getStartSymbol();
		PurdomPhaseOne purdom1 = new PurdomPhaseOne(NGrammar.getNormalizedGrammar());
		purdom1.phaseOne();
		Map<Nonterminal, Integer> slen = purdom1.getSlen();
		Map<Nonterminal, ProductionsRLEN> rlen = purdom1.getRlen();
		Map<Nonterminal, Expression> shortest = purdom1.getShortest();
		PurdomPhaseTwo purdom2 = new PurdomPhaseTwo(startSymbol, slen, rlen);
		purdom2.phaseTwo();
//		Map<Nonterminal, Integer> dlen = purdom2.getDlen();
		Map<Nonterminal, ProductionRule> prev = purdom2.getPrev();
		PurdomPhaseThree purdom3 = new PurdomPhaseThree(NGrammar.getNormalizedGrammar(), prev, shortest);
		List<String> output = purdom3.phaseThree();
		Collections.reverse(output);
		System.out.println(output.toString() + " " + expected.toString());
		assertEquals(output, expected);
	}

	@Test
	public void testGrammar() throws IOException{
		String filePath = "..\\Thesis\\src\\testGrammar\\Test1.g4";
		List<String> expected = new ArrayList(Arrays.asList("'b'", "'a'"));
		test(filePath, expected);
		filePath = "..\\Thesis\\src\\testGrammar\\Test2.g4";
		expected = new ArrayList(Arrays.asList("'a'", "'b'"));
		test(filePath, expected);
		filePath = "..\\Thesis\\src\\testGrammar\\Test3.g4";
		expected = new ArrayList(Arrays.asList("(", "'a'", "'+'", "'b'", ")"));
		test(filePath, expected);
		filePath = "..\\Thesis\\src\\testGrammar\\Test4.g4";
		expected = new ArrayList(Arrays.asList("(", "'a'", "'+'", "'b'", ")", "'c'"));
		test(filePath, expected);
	}
}
