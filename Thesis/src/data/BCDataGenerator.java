package data;

import grammarDatastructure.Expression;
import grammarDatastructure.Grammar;
import grammarDatastructure.GrammarMap;
import grammarDatastructure.Nonterminal;
import grammarDatastructure.NormalizedGrammar;
import grammarDatastructure.ProductionRule;
import grammarDatastructure.Terminal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import purdom.ProductionsMark;
import purdom.ProductionsRLEN;
import purdom.PurdomPhaseOne;
import purdom.PurdomPhaseThree;
import purdom.PurdomPhaseTwo;
import buildAST.ASTBuilder;
import buildAST.ASTPrinter;

public class BCDataGenerator {

	static StringBuffer buffer = new StringBuffer();
	
	public static void main(String[] args) throws IOException {
		ASTPrinter printer = new ASTPrinter();
		List<String> inputFiles = new ArrayList<String>();
		String targetDir = "..\\Thesis\\src\\extractedTestGrammar";
		File dir = new File(targetDir);
		File[] files = dir.listFiles();
		for (File f: files){
			if(f.getName().contains(".g4")){
				inputFiles.add(f.getAbsolutePath());
			}
		}
		boolean bc, uc;
		bc = true;
		uc = false;
		buffer.append("Grammar\t  N\t  P\t  No.Sen.\t  NC\t  PC\t \n");
		for(String filePath: inputFiles){
			System.out.println(filePath.toString());		
		
			ASTBuilder astbuilder = new ASTBuilder(filePath);
			Grammar grammar = astbuilder.buildGrammar();
			GrammarMap grammarMap = new GrammarMap(grammar);
			NormalizedGrammar NGrammar = new NormalizedGrammar(grammarMap);
			GrammarMap normalizedGrammar = NGrammar.getNormalizedGrammar();
			Map<Nonterminal, Expression> startSymbol = normalizedGrammar.getStartSymbol();
			Entry<Nonterminal, Expression> entryS = startSymbol.entrySet().iterator().next();
			Nonterminal startKey = entryS.getKey();
			System.out.println("start symbol " + startKey.getName());
		
			Accessible filter = new Accessible(normalizedGrammar, startSymbol);
			GrammarMap filteredGrammar = filter.getFilteredGrammar();
			startSymbol = filteredGrammar.getStartSymbol();
			Map<Nonterminal, List<Terminal>> sentences = new HashMap<Nonterminal, List<Terminal>>();
			if(uc){
				sentences = getSentences(filteredGrammar);
				UCGrammar ucGrammar = new UCGrammar(filteredGrammar, sentences);
				filteredGrammar = ucGrammar.getOutput();
				startSymbol = filteredGrammar.getStartSymbol();
			}
			int grammarSize = filteredGrammar.getNonterminals().size();
			PurdomPhaseOne purdom1 = new PurdomPhaseOne(filteredGrammar, bc);
			purdom1.phaseOne();
			Map<Nonterminal, Integer> slen = purdom1.getSlen();
			Map<Nonterminal, ProductionsRLEN> rlen = purdom1.getRlen();
			Map<Nonterminal, Expression> shortest = purdom1.getShortest();

			PurdomPhaseTwo purdom2 = new PurdomPhaseTwo(startSymbol, slen, rlen);
			purdom2.phaseTwo();
			Map<Nonterminal, Integer> dlen = purdom2.getDlen();
			Map<Nonterminal, ProductionRule> prev = purdom2.getPrev();
				
			System.out.println("grammar size " + slen.size() + " prev size " + prev.size());
						
			PurdomPhaseThree purdom3 = new PurdomPhaseThree(filteredGrammar, prev, shortest, rlen);
			List<List<String>> output = purdom3.phaseThree();
			
			Map<Nonterminal, Boolean> covered = purdom3.getCovered();
			int i = 0;
			int k = 0;
			for(Nonterminal n: covered.keySet()){
				if(prev.containsKey(n)){
					if(!covered.get(n)){
						i++;
//						System.out.println(n.getName() + " " + prev.get(n).getRuleName().getName());
					}
				}	
			}
			List<List<String>> reversedOutput = new ArrayList<List<String>>();
			for(List<String> l : output){
				Collections.reverse(l);
				reversedOutput.add(l);
			}
	 
			Map<Nonterminal, ProductionsMark> mark = purdom3.getMark();
			int j = 0;
			Set<Expression> productions = new HashSet<Expression>();
			for(Nonterminal n : mark.keySet()){
				k += mark.get(n).getProdsMark().size();
				productions.addAll(mark.get(n).getKeys());
				for(Expression exp: mark.get(n).getKeys()){
					if(!mark.get(n).getProdValue(exp)){
						j++;
	//					System.out.println("Uncovered production " +n.getName() + " " + exp.accept(printer));	
					}	
				}
			}
	
			Map<Expression, Boolean> productionCoverage = purdom3.getProductionCoverage();
			System.out.println("number of generated sentences " + reversedOutput.size());
			System.out.println("covered productions " + productionCoverage.size() + " out of " + productions.size() + " k " + k);
			System.out.println("Uncovered nonterminals " + i + " " + purdom2.getHasNoPrev()  + " total number of nonterminals " + (prev.size() + 1));
			int h = 0;
			for(Expression exp : productions){
				if(!productionCoverage.containsKey(exp)){
					h++;
				}	
			}
			NCDataGenerator.reportResults(filePath, grammarSize, productions, reversedOutput, i, h, k);
			if(startKey.getName().equals("start")){
				for(List<String> l:reversedOutput){
					System.out.println("length " + l.size() + " " + l.toString());
				}
			}
		}
		if(bc && uc){
			NCDataGenerator.printResultsToFile("CDBC_Coverage.txt");
		}
		else if(bc){
			NCDataGenerator.printResultsToFile("BC_Coverage");
		}
		else if(uc){
			NCDataGenerator.printResultsToFile("UC_Coverage.txt");
		}

	}

	private static Map<Nonterminal, List<Terminal>> getSentences(GrammarMap filteredGrammar) throws IOException {
		NonterminalsSentences sentenceGen = new NonterminalsSentences(filteredGrammar);
		Map<Nonterminal, List<List<String>>> sentences = sentenceGen.getOutput();
		Map<Nonterminal, List<Terminal>> terminalString = new HashMap<Nonterminal, List<Terminal>>();
		
		for(Nonterminal n : sentences.keySet()){				
			List<Terminal> temp = new ArrayList<Terminal>();
			for(List<String> l : sentences.get(n)){
				temp.add(buildString(l));
			}
			terminalString.put(n, temp);
		}
		return terminalString;
		
	}

	private static Terminal buildString(List<String> strings) {
		StringBuilder sb = new StringBuilder();
		for(String s: strings){
			sb.append(s);
		}
		return new Terminal(sb.toString());
	}
	static void reportResults(String filePath,
			int grammarSize, Set<Expression> productions, List<Terminal> ucSentences, int i,
			int h) {
		File f = new File(filePath);
		String fileName = f.getName().replace("Extracted", "");
		double ncCoverage = (((double)(grammarSize-i))/grammarSize)* 100;
		double pcCoverage = (((double)(productions.size()-h))/productions.size())* 100;
		String s = fileName + " \t " + grammarSize + " \t " + productions.size() + " \t \t" + ucSentences.size() + " \t " + ncCoverage+"%" + 
		" \t " + pcCoverage+"%";
		buffer.append(s +"\n");
		
	}


}
