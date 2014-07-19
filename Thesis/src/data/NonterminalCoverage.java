package data;

import grammarDatastructure.Expression;
import grammarDatastructure.Grammar;
import grammarDatastructure.GrammarMap;
import grammarDatastructure.Nonterminal;
import grammarDatastructure.NormalizedGrammar;
import grammarDatastructure.Optional;
import grammarDatastructure.Plus;
import grammarDatastructure.ProductionRule;
import grammarDatastructure.Star;
import grammarDatastructure.Terminal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import purdom.ExpressionElements;
import purdom.GetNonterminals;
import purdom.ProductionsRLEN;
import purdom.PurdomPhaseOne;
import purdom.PurdomPhaseTwo;
import buildAST.ASTBuilder;
import buildAST.ASTPrinter;

public class NonterminalCoverage {

	public static void main(String[] args) throws IOException {
		ASTPrinter printer = new ASTPrinter();
//		String filePath = "..\\Thesis\\src\\testGrammar\\Extractedfasta.g4";
		String filePath = "..\\Thesis\\src\\extractedGrammar\\ExtractedJava.g4";
		ASTBuilder astbuilder = new ASTBuilder(filePath);
		Grammar grammar = astbuilder.buildGrammar();
		GrammarMap grammarMap = new GrammarMap(grammar);
		NormalizedGrammar NGrammar = new NormalizedGrammar(grammarMap);
		GrammarMap normalizedGrammar = NGrammar.getNormalizedGrammar();
		Map<Nonterminal, Expression> startSymbol = normalizedGrammar.getStartSymbol();
		Nonterminal startKey = startSymbol.entrySet().iterator().next().getKey();
		
		NonterminalsSentences sentenceGen = new NonterminalsSentences(normalizedGrammar);
		Map<Nonterminal, List<List<String>>> sentences = sentenceGen.getOutput();
		Map<Nonterminal, List<Terminal>> terminalString = new HashMap<Nonterminal, List<Terminal>>();
		
		for(Nonterminal n : sentences.keySet()){				
//			System.out.println(n.getName() + " " + sentences.get(n).size() ); //+  " : " + sentences.get(n).toString());
			List<Terminal> temp = new ArrayList<Terminal>();
			for(List<String> l : sentences.get(n)){
				temp.add(buildString(l));
			}
			terminalString.put(n, temp);
		}
		
//		PurdomPhaseOne purdom1 = new PurdomPhaseOne(normalizedGrammar);
//		purdom1.phaseOne();
//		Map<Nonterminal, Integer> slen = purdom1.getSlen();
//		Map<Nonterminal, ProductionsRLEN> rlen = purdom1.getRlen();
//		Map<Nonterminal, Expression> shortest = purdom1.getShortest();
//		
//		PurdomPhaseTwo purdom2 = new PurdomPhaseTwo(startSymbol, slen, rlen);
//		purdom2.phaseTwo();
//		Map<Nonterminal, Integer> dlen = purdom2.getDlen();
//		Map<Nonterminal, ProductionRule> prev = purdom2.getPrev();
//		
//		GrammarMap filteredGrammar = filterGrammar(normalizedGrammar, prev);
////		CoverN nccoverage = new CoverN(filteredGrammar, prev, sentences);
//		
////		Map<Nonterminal, Boolean> covered = nccoverage.getCovered();
////		
////		List<List<String>> nc = nccoverage.getNc();
////		
////		for(List<String> l: nc){
////			System.out.println(l);
////		}	
////		List<Map<Nonterminal, Expression>> grammarList = nccoverage.getGrammarList();
////		for(Map<Nonterminal, Expression> map : grammarList){
////			System.out.println(map.size());
////		}
//
//	}
//
//	private static GrammarMap filterGrammar(GrammarMap normalizedGrammar,
//											Map<Nonterminal, ProductionRule> prev) {
//		GrammarMap filteredGrammar = new GrammarMap();
//		Map<Nonterminal, Expression> rules = new LinkedHashMap<>(normalizedGrammar.getGrammarMap());
//		filteredGrammar.setGrammarMap(rules);
//		
//		for(Nonterminal n: normalizedGrammar.getNonterminals()){				
//			if(!prev.keySet().contains(n)){
//				filteredGrammar.getGrammarMap().remove(n); 
//			}
//		}
//		filteredGrammar.setStartSymbol(normalizedGrammar.getStartSymbol());
//		filteredGrammar.getGrammarMap().putAll(normalizedGrammar.getStartSymbol());
//		return filteredGrammar;
	}
	static Terminal buildString(List<String> strings){
		StringBuilder sb = new StringBuilder();
		for(String s: strings){
			sb.append(s);
		}
		return new Terminal(sb.toString());
	}
}
