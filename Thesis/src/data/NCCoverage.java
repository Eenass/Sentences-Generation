package data;

import gtojava.Expression;
import gtojava.Grammar;
import gtojava.GrammarMap;
import gtojava.Nonterminal;
import gtojava.NormalizedGrammar;
import gtojava.ProductionRule;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import purdom.Productions;
import purdom.ProductionsRLEN;
import purdom.PurdomPhaseOne;
import purdom.PurdomPhaseThree;
import purdom.PurdomPhaseTwo;
import buildAST.ASTBuilder;
import buildAST.ASTPrinter;

public class NCCoverage {

	public static void main(String[] args) throws IOException {
		ASTPrinter printer = new ASTPrinter();
		String filePath = "..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedC.g4";
		StringsTable table = new StringsTable();
		Map<String, String> regularExp = table.getRegular();
		ASTBuilder astbuilder = new ASTBuilder(filePath);
		Grammar grammar = astbuilder.buildGrammar();
		GrammarMap grammarMap = new GrammarMap(grammar);
		NormalizedGrammar NGrammar = new NormalizedGrammar(grammarMap);
		int total = NGrammar.getNormalizedGrammar().getGrammarMap().size();
		int sum = 0;
		Map<Nonterminal, Expression> startSymbol = NGrammar.getNormalizedGrammar().getStartSymbol();
		Nonterminal start = startSymbol.entrySet().iterator().next().getKey();
		Productions prods = new Productions(startSymbol.entrySet().iterator().next().getValue());
		List<Expression> list = prods.getProdList();
		for(Expression e : list){
			Map<Nonterminal,  Expression> startSymbol1 = new HashMap<>();
			startSymbol1.put(start, e);
			NGrammar.getNormalizedGrammar().setStartSymbol(startSymbol1);
			NGrammar.getNormalizedGrammar().getGrammarMap().remove(startSymbol);
			NGrammar.getNormalizedGrammar().getGrammarMap().put(start, e);
			PurdomPhaseOne purdom1 = new PurdomPhaseOne(NGrammar.getNormalizedGrammar());
			purdom1.phaseOne();
			Map<Nonterminal, Integer> slen = purdom1.getSlen();
			Map<Nonterminal, ProductionsRLEN> rlen = purdom1.getRlen();
			Map<Nonterminal, Expression> shortest = purdom1.getShortest();
			
			PurdomPhaseTwo purdom2 = new PurdomPhaseTwo(startSymbol1, slen, rlen);
			purdom2.phaseTwo();
			Map<Nonterminal, Integer> dlen = purdom2.getDlen();
			Map<Nonterminal, ProductionRule> prev = purdom2.getPrev();
			System.out.println("grammar size " + slen.size() + " prev size " + prev.size());
			
			GrammarMap temp = new GrammarMap();
			Map<Nonterminal, Expression> rules = new LinkedHashMap<>(NGrammar.getNormalizedGrammar().getGrammarMap());
			temp.setGrammarMap(rules);
			for(Nonterminal n: NGrammar.getNormalizedGrammar().getNonterminals()){
				if(!prev.keySet().contains(n)){
					temp.getGrammarMap().remove(n);
				}
			}
			temp.setStartSymbol(startSymbol1);
			temp.putRule(startSymbol1.entrySet().iterator().next().getKey(), startSymbol1.entrySet().iterator().next().getValue());
			System.out.println("temp grammar size " + temp.getGrammarMap().size());
			
			PurdomPhaseThree purdom3 = new PurdomPhaseThree(temp, prev, shortest, rlen, regularExp);
			List<List<String>> output = purdom3.phaseThree();
			System.out.println("number of generated sentences " + output.size());
			Map<Nonterminal, Boolean> covered = purdom3.getCovered();
			int i = 0;
			for(Nonterminal n: covered.keySet()){
				if(prev.containsKey(n)){
					if(!covered.get(n)){
						i++;
//						System.out.println(n.getName());
					}
				}	
			}
			System.out.println("Uncovered nonterminals " + i + " total number of nonterminals " + (prev.size() + 1));
			sum += i;
			List<List<String>> reversedOutput = new ArrayList<List<String>>();
			for(List<String> l : output){
				Collections.reverse(l);
				reversedOutput.add(l);
				System.out.println(l.toString());
			}
		}
		System.out.println("total number of nonterminal " + total + " covered " + sum);
	}

}
