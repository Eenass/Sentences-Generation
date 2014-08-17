package dataGeneration;

import grammarDatastructure.Expression;
import grammarDatastructure.Grammar;
import grammarDatastructure.GrammarMap;
import grammarDatastructure.Nonterminal;
import grammarDatastructure.NormalizedGrammar;
import grammarDatastructure.ProductionRule;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
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

public class DataGenerator {

	static StringBuffer buffer = new StringBuffer();
	
	public static void main(String[] args) throws IOException {
		List<String> inputFiles = new ArrayList<String>();
		String targetDir = "..\\Thesis\\GrammartestSet\\extractedTestGrammar";
		File dir = new File(targetDir);
		File[] files = dir.listFiles();
		for (File f: files){
			if(f.getName().contains(".g4")){
				inputFiles.add(f.getAbsolutePath());
			}
		}
		boolean bc, uc;
		bc = false;
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
			if(uc){
				UCBCGrammarAdapter ucGrammar = new UCBCGrammarAdapter(filteredGrammar, false, uc);
				filteredGrammar = ucGrammar.getOutput();
				startSymbol = filteredGrammar.getStartSymbol();
				filter = new Accessible(filteredGrammar, startSymbol);

				filteredGrammar = filter.getFilteredGrammar();
				startSymbol = filteredGrammar.getStartSymbol();
			}
			if(bc){
				UCBCGrammarAdapter bcGrammar = new UCBCGrammarAdapter(filteredGrammar, bc, false);
				filteredGrammar = bcGrammar.getOutput();
				startSymbol = filteredGrammar.getStartSymbol();
			}
			int grammarSize = filteredGrammar.getNonterminals().size();
			PurdomPhaseOne purdom1 = new PurdomPhaseOne(filteredGrammar);
			purdom1.phaseOne();
			Map<Nonterminal, Integer> slen = purdom1.getSlen();
			Map<Nonterminal, ProductionsRLEN> rlen = purdom1.getRlen();
			Map<Nonterminal, Expression> shortest = purdom1.getShortest();

			PurdomPhaseTwo purdom2 = new PurdomPhaseTwo(startSymbol, slen, rlen);
			purdom2.phaseTwo();
			Map<Nonterminal, ProductionRule> prev = purdom2.getPrev();
				
			PurdomPhaseThree purdom3 = new PurdomPhaseThree(filteredGrammar, prev, shortest, rlen);
			List<List<String>> output = purdom3.phaseThree();
			
			Map<Nonterminal, Boolean> covered = purdom3.getCovered();
			int i = 0;
			for(Nonterminal n: covered.keySet()){
				if(!covered.get(n)){
					i++;
				}
			}
			List<List<String>> reversedOutput = new ArrayList<List<String>>();
			for(List<String> l : output){
				Collections.reverse(l);
				reversedOutput.add(l);
			}
	 
			Map<Nonterminal, ProductionsMark> mark = purdom3.getMark();
			Set<Expression> productions = new HashSet<Expression>();
			for(Nonterminal n : mark.keySet()){
				productions.addAll(mark.get(n).getKeys());
			}
	
			Map<Expression, Boolean> productionCoverage = purdom3.getProductionCoverage();
			System.out.println("number of generated sentences " + reversedOutput.size());
			System.out.println("covered productions " + productionCoverage.size() + " out of " + productions.size());
			int h = 0;
			for(Expression exp : productions){
				if(!productionCoverage.containsKey(exp)){
					h++;
				}	
			}		
			
			reportResults(filePath, grammarSize, productions, reversedOutput, i, h);
		}
		
		if(bc && uc){
			printResultsToFile("CDBC_Coverage.txt");
		}
		else if(bc){
			printResultsToFile("BC_Coverage.txt");
		}
		else if(uc){
			printResultsToFile("UC_Coverage.txt");
		}
		else{
			printResultsToFile("NC_PC_Coverage.txt");
		}

	}

	static void printResultsToFile(String name) {
		File file = new File("..\\Thesis\\results\\testResults\\" + name);
		FileWriter fw;
		try {
			fw = new FileWriter(file, true);
			PrintWriter printer = new PrintWriter(fw);
			printer.append(buffer);
			printer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	static void reportResults(String filePath,
			int grammarSize, Set<Expression> productions, List<List<String>> output, int i,
			int h) {
		File f = new File(filePath);
		String fileName = f.getName().replace("Extracted", "");
		double ncCoverage = (((double)(grammarSize-i))/grammarSize)* 100;
		double pcCoverage = (((double)(productions.size()-h))/productions.size())* 100;
		String s = fileName + " \t " + grammarSize + " \t " + productions.size() + " \t" + output.size() + " \t " + ncCoverage + 
		"% \t " + pcCoverage +"% \t ";
		buffer.append(s +"\n");
		
	}
}
