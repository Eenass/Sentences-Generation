package purdom;

import gtojava.Expression;
import gtojava.Grammar;
import gtojava.GrammarMap;
import gtojava.Nonterminal;
import gtojava.NormalizedGrammar;
import gtojava.ProductionRule;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import buildAST.ASTBuilder;
import buildAST.ASTPrinter;

public class TestPurdom {

	public static void main(String[] args) throws IOException{
		ASTPrinter printer = new ASTPrinter();
		String filePath = "..\\Thesis\\src\\testGrammar\\Test3.g4";
//		String filePath = "..\\Thesis\\src\\testGrammar\\Testgrammar.g4";
//		String filePath = "..\\Thesis\\src\\extractedGrammar\\ExtractedJava.g4";
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
		for(Nonterminal n : slen.keySet()){
			System.out.print(n.getName() + " " + slen.get(n));
			System.out.println(" short " + shortest.get(n).accept(printer));
		}
		for(Nonterminal n : rlen.keySet()){
			for(Expression exp : rlen.get(n).getKeys()){
				System.out.println(exp.accept(printer) + " rlen " + rlen.get(n).getProdValue(exp));
			}
		}
		PurdomPhaseTwo purdom2 = new PurdomPhaseTwo(startSymbol, slen, rlen);
		purdom2.phaseTwo();
		Map<Nonterminal, Integer> dlen = purdom2.getDlen();
		Map<Nonterminal, ProductionRule> prev = purdom2.getPrev();
		for(Nonterminal n: prev.keySet()){
			System.out.print(n.getName() + " dlen " + dlen.get(n));
			System.out.println(" ( " + prev.get(n).getRuleName().accept(printer) + " , " + prev.get(n).getExpr().accept(printer) + ")");

		}
		PurdomPhaseThree purdom3 = new PurdomPhaseThree(NGrammar.getNormalizedGrammar(), prev, shortest);
		List<List<String>> output = purdom3.phaseThree();
		for(List<String> l : output){
			Collections.reverse(l);
			System.out.println(l.toString());
		}
		
		
		Map<Nonterminal, ProductionsMark> mark = purdom3.getMark();
//		for(Nonterminal n : mark.keySet()){
//			System.out.print(n.getName() + " : ");
//			for(Expression exp: mark.get(n).getKeys()){
//				System.out.println(exp.accept(printer) + " " + mark.get(n).getProdValue(exp));				
//			}
//		}
		
	}

}
