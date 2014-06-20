package mark;

import gtojava.Expression;
import gtojava.Grammar;
import gtojava.GrammarMap;
import gtojava.Nonterminal;
import gtojava.ProductionRule;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import purdom.ProductionsRLEN;
import purdom.PurdomPhaseOne;
import purdom.PurdomPhaseThree;
import purdom.PurdomPhaseTwo;
import buildAST.ASTBuilder;
import buildAST.ASTPrinter;

public class TestMarking {
	public static void main(String[] args) throws IOException{
		String filePath = "..\\Thesis\\src\\testGrammar\\Testgrammar.g4";
//		String filePath = "..\\Thesis\\src\\extractedGrammar\\ExtractedJava.g4";
		ASTBuilder astbuilder = new ASTBuilder(filePath);
		ASTPrinter printer = new ASTPrinter();
		Grammar grammar = astbuilder.buildGrammar();
		GrammarMap grammarMap = new GrammarMap(grammar);
//		MarkingTC tc = new MarkingTC(grammarMap);
//		GrammarModifier modifier = new GrammarModifier(tc.getGrammar());
		MarkingNC nc = new MarkingNC(grammarMap);
		GrammarModifier modifier = new GrammarModifier(nc.getGrammar());
//		MarkingBC bc = new MarkingBC(grammarMap);
//		GrammarModifier modifier = new GrammarModifier(bc.getGrammar());
//		MarkingUC uc = new MarkingUC(grammarMap);
//		GrammarModifier modifier = new GrammarModifier(uc.getGrammar());
//		MarkingPC pc = new MarkingPC(grammarMap);
//		GrammarModifier modifier = new GrammarModifier(pc.getGrammar());
//		for(Nonterminal n : modifier.getGrammar().getNonterminals()){
//			System.out.println(n.getName() + " " + modifier.getGrammar().getExpression(n).accept(printer));
//		}
		List<List<String>> result = new ArrayList<List<String>>();
		for(Entry<Nonterminal, Expression> n : modifier.getGrammar().getGrammarMap().entrySet()){
			Map<Nonterminal, Expression> startSymbol = new HashMap<Nonterminal, Expression>();
			System.out.println("current entry " + n.getKey().getName());
			startSymbol.put(n.getKey(), n.getValue());
			System.out.println("startsymbol " + startSymbol.entrySet().iterator().next().getKey().getName());
			modifier.getGrammar().setStartSymbol(startSymbol);
			System.out.println("current start symbol " + modifier.getGrammar().getStartSymbol().entrySet().iterator().next().getKey().getName());
			PurdomPhaseOne purdom1 = new PurdomPhaseOne(modifier.getGrammar());
			purdom1.phaseOne();
			Map<Nonterminal, Integer> slen = purdom1.getSlen();
			Map<Nonterminal, ProductionsRLEN> rlen = purdom1.getRlen();
			Map<Nonterminal, Expression> shortest = purdom1.getShortest();
	
			PurdomPhaseTwo purdom2 = new PurdomPhaseTwo(startSymbol, slen, rlen);
			purdom2.phaseTwo();
			Map<Nonterminal, Integer> dlen = purdom2.getDlen();
			Map<Nonterminal, ProductionRule> prev = purdom2.getPrev();
	
			PurdomPhaseThree purdom3 = new PurdomPhaseThree(modifier.getGrammar(), prev, shortest);
			List<String> output = purdom3.phaseThree();
			result.add(output);
			System.out.println(output.toString());
		}
		System.out.println(result.toString());
	}	
		
}
