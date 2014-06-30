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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import purdom.ProductionsMark;
import purdom.ProductionsRLEN;
import purdom.PurdomPhaseOne;
import purdom.PurdomPhaseThree;
import purdom.PurdomPhaseTwo;
import buildAST.ASTBuilder;
import buildAST.ASTPrinter;

public class NCDataGenerator {

	public static void main(String[] args) throws IOException {
		ASTPrinter printer = new ASTPrinter();
//		String filePath = "..\\Thesis\\src\\testGrammar\\Test4.g4";
		String filePath = "..\\Thesis\\src\\extractedGrammar\\ExtractedJava.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedC.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedjvmBasic.g4";
//		String filePath = "..\\Thesis\\src\\otherGrammar\\extracted\\ExtractedDOT.g4";
		StringsTable table = new StringsTable();
		Map<String, String> regularExp = table.getRegular();
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
//		for(Nonterminal n : slen.keySet()){
//			System.out.print(n.getName() + " " + slen.get(n));
//			System.out.println(" short " + shortest.get(n).accept(printer));
//		}
//		for(Nonterminal n : rlen.keySet()){
//			for(Expression exp : rlen.get(n).getKeys()){
//				System.out.println(exp.accept(printer) + " rlen " + rlen.get(n).getProdValue(exp));
//			}
//		}
		PurdomPhaseTwo purdom2 = new PurdomPhaseTwo(startSymbol, slen, rlen);
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
		temp.setStartSymbol(NGrammar.getNormalizedGrammar().getStartSymbol());
		temp.putRule(temp.getStartSymbol().entrySet().iterator().next().getKey(), temp.getStartSymbol().entrySet().iterator().next().getValue());
		System.out.println("temp grammar size " + temp.getGrammarMap().size());
//		for(Nonterminal n: prev.keySet()){
//			System.out.print(n.getName() + ": " );//+ " dlen " + dlen.get(n)
//			System.out.println(" ( " + prev.get(n).getRuleName().accept(printer) + " , " + prev.get(n).getExpr().accept(printer) + ")");
////
//		}
//		Map<Nonterminal, Expression> shortestTemp = new HashMap();
//		RepitionCleaner cleaner = new RepitionCleaner();
//		for(Nonterminal n : shortest.keySet()){
//			shortestTemp.put(n, shortest.get(n).accept(cleaner));
////			System.out.println(n.accept(printer) + " " + shortestTemp.get(n).accept(printer));
//		}

		PurdomPhaseThree purdom3 = new PurdomPhaseThree(temp, prev, shortest, rlen, regularExp);
		List<List<String>> output = purdom3.phaseThree();
		System.out.println("number of generated sentences " + output.size());
		Map<Nonterminal, Boolean> covered = purdom3.getCovered();
		int i = 0;
		for(Nonterminal n: covered.keySet()){
			if(prev.containsKey(n)){
				if(!covered.get(n)){
					i++;
					System.out.println(n.getName());
				}
			}	
		}
		System.out.println("Uncovered nonterminals " + i + " total number of nonterminals " + (prev.size() + 1));
		List<List<String>> reversedOutput = new ArrayList<List<String>>();
		for(List<String> l : output){
			Collections.reverse(l);
			reversedOutput.add(l);
			System.out.println(l.toString());
		}
//		String folderName = "..\\Thesis\\src\\datawriting\\ncData\\";
//		DataWriter writer = new DataWriter(reversedOutput, folderName);
//		writer.writing();
//		System.out.println(newgrammar.getGrammarMap().size() + " " + prev.size());
	 
		Map<Nonterminal, ProductionsMark> mark = purdom3.getMark();
		int j = 0;
		for(Nonterminal n : mark.keySet()){
			for(Expression exp: mark.get(n).getKeys()){
				if(!mark.get(n).getProdValue(exp)){
					j++;
//					System.out.println("Uncovered production " + exp.accept(printer));	
				}	
			}
		}
		System.out.println("Number of uncovered production " + j);
//		Map<Nonterminal, Integer> onst = purdom3.getOnst();
//		Map<Nonterminal, Expression> once = purdom3.getOnce();
//		for(Nonterminal n: once.keySet()){
//			System.out.println(n.getName() + " " + once.get(n).accept(printer));
//		}
		
	}

}
