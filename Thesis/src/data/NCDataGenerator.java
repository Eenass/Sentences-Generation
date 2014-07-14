package data;

import gtojava.Expression;
import gtojava.Grammar;
import gtojava.GrammarMap;
import gtojava.Nonterminal;
import gtojava.NormalizedGrammar;
import gtojava.ProductionRule;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import purdom.ProductionsMark;
import purdom.ProductionsRLEN;
import purdom.PurdomPhaseOne;
import purdom.PurdomPhaseThree;
import purdom.PurdomPhaseTwo;
import buildAST.ASTBuilder;
import buildAST.ASTPrinter;

public class NCDataGenerator {
	
	static StringBuffer buffer = new StringBuffer();

	public static void main(String[] args) throws IOException {
		ASTPrinter printer = new ASTPrinter();
		List<String> inputFiles = new ArrayList<String>();
		String targetDir = "..\\Thesis\\src\\testGrammar";
		File dir = new File(targetDir);
		File[] files = dir.listFiles();
		for (File f: files){
			if(f.getName().contains(".g4")){
				inputFiles.add(f.getAbsolutePath());
			}
		}

		buffer.append("Grammar\t  N\t  P\t  No.Sen.\t  NC\t  PC\t \n");
		for(String filePath: inputFiles){
			System.out.println(filePath.toString());		
		
			ASTBuilder astbuilder = new ASTBuilder(filePath);
			Grammar grammar = astbuilder.buildGrammar();
			GrammarMap grammarMap = new GrammarMap(grammar);
			NormalizedGrammar NGrammar = new NormalizedGrammar(grammarMap);
			Map<Nonterminal, Expression> startSymbol = NGrammar.getNormalizedGrammar().getStartSymbol();
			
			Accessible filter = new Accessible(NGrammar.getNormalizedGrammar(), startSymbol);

			GrammarMap filteredGrammar = filter.getFilteredGrammar();
			startSymbol = filteredGrammar.getStartSymbol();
			int grammarSize = filteredGrammar.getNonterminals().size();
			PurdomPhaseOne purdom1 = new PurdomPhaseOne(filteredGrammar);
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
			for(Nonterminal n: covered.keySet()){
				if(prev.containsKey(n)){
					if(!covered.get(n)){
						i++;
//						System.out.println(n.getName());
					}
				}	
			}
			List<List<String>> reversedOutput = new ArrayList<List<String>>();
			for(List<String> l : output){
				Collections.reverse(l);
				reversedOutput.add(l);
//				System.out.println(l.toString());
			}
	//		String folderName = "..\\Thesis\\src\\datawriting\\ncData\\";
	//		DataWriter writer = new DataWriter(reversedOutput, folderName);
	//		writer.writing();
	//		System.out.println(newgrammar.getGrammarMap().size() + " " + prev.size());
		 
			Map<Nonterminal, ProductionsMark> mark = purdom3.getMark();
			int j = 0;
			int k = 0;
			Set<Expression> productions = new HashSet<Expression>();
			for(Nonterminal n : mark.keySet()){
				k += mark.get(n).getKeys().size();
				productions.addAll(mark.get(n).getKeys());
				for(Expression exp: mark.get(n).getKeys()){
					if(!mark.get(n).getProdValue(exp)){
						j++;
	//					System.out.println("Uncovered production " +n.getName() + " " + exp.accept(printer));	
					}	
				}
			}
	
			Map<Expression, Boolean> productionCoverage = purdom3.getProductionCoverage();
			System.out.println("number of generated sentences " + output.size());
			System.out.println("covered productions " + productionCoverage.size() + " out of " + productions.size() + " j " + j);
			System.out.println("Uncovered nonterminals " + i + " " + purdom2.getHasNoPrev()  + " total number of nonterminals " + (prev.size() + 1));
			int h = 0;
			for(Expression exp : productions){
				if(!productionCoverage.containsKey(exp)){
					h++;
				}	
			}
	//		Map<Nonterminal, Integer> onst = purdom3.getOnst();
	//		Map<Nonterminal, Expression> once = purdom3.getOnce();
	//		for(Nonterminal n: once.keySet()){
	//			System.out.println(n.getName() + " " + once.get(n).accept(printer));
	//		}
//			reportResults(filePath, grammarSize, productions, output, i, h);
		}
//		printResultsToFile();
		
	}

//	private static void printResultsToFile() {
//		File file = new File("..\\Thesis\\src\\testResults\\" + "Coverage");
//		FileWriter fw;
//		try {
//			fw = new FileWriter(file, true);
//			PrintWriter printer = new PrintWriter(fw);
//			printer.append(buffer);
//			printer.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}

//	private static void reportResults(String filePath,
//			int grammarSize, Set<Expression> productions, List<List<String>> output, int i,
//			int h) {
//		File f = new File(filePath);
//		String fileName = f.getName().replace("Extracted", "");
////		System.out.println((grammarSize-i)/grammarSize + " " + ((double)(productions.size()-h))/productions.size());
//		double ncCoverage = (((double)(grammarSize-i))/grammarSize)* 100;
//		double pcCoverage = (((double)(productions.size()-h))/productions.size())* 100;
//		String s = fileName + " \t " + grammarSize + " \t " + productions.size() + " \t \t" + output.size() + " \t " + ncCoverage+"%" + 
//		" \t " + pcCoverage+"%";
//		buffer.append(s +"\n");
//		
//	}

}
