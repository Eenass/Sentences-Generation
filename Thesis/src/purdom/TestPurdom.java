package purdom;

import grammarDatastructure.Expression;
import grammarDatastructure.Grammar;
import grammarDatastructure.GrammarMap;
import grammarDatastructure.Nonterminal;
import grammarDatastructure.NormalizedGrammar;
import grammarDatastructure.ProductionRule;
import grammarDatastructure.Terminal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import buildAST.ASTBuilder;
import buildAST.ASTPrinter;
import data.Accessible;
import data.NonterminalsSentences;

public class TestPurdom {

	public static void main(String[] args) throws IOException{
		ASTPrinter printer = new ASTPrinter();
		String filePath = "..\\Thesis\\src\\extractedTestGrammar\\ExtractedAbnf.g4";
		ASTBuilder astbuilder = new ASTBuilder(filePath);
		Grammar grammar = astbuilder.buildGrammar();
		GrammarMap grammarMap = new GrammarMap(grammar);
		NormalizedGrammar NGrammar = new NormalizedGrammar(grammarMap);
		Map<Nonterminal, Expression> startSymbol = NGrammar.getNormalizedGrammar().getStartSymbol();
		
		Accessible filter = new Accessible(NGrammar.getNormalizedGrammar(), startSymbol);

		GrammarMap filteredGrammar = filter.getFilteredGrammar();
		startSymbol = filteredGrammar.getStartSymbol();
		Map<Nonterminal, List<Terminal>> sentences = new HashMap<Nonterminal, List<Terminal>>();
		
//		sentences = getSentences(filteredGrammar);
//		UCGrammar ucGrammar = new UCGrammar(filteredGrammar, sentences);
//		filteredGrammar = ucGrammar.getOutput();
//		startSymbol = filteredGrammar.getStartSymbol();
//		System.out.println("Resulted Grammar ");
//		for(Nonterminal n : filteredGrammar.getNonterminals()){
//			System.out.println(n.accept(printer) + " : " + filteredGrammar.getExpression(n).accept(printer));
//		}
		PurdomPhaseOne purdom1 = new PurdomPhaseOne(filteredGrammar, false);
		purdom1.phaseOne();
		Map<Nonterminal, Integer> slen = purdom1.getSlen();
		Map<Nonterminal, ProductionsRLEN> rlen = purdom1.getRlen();
		Map<Nonterminal, Expression> shortest = purdom1.getShortest();
//		for(Nonterminal n : slen.keySet()){
//			System.out.print(n.getName() + " " + slen.get(n));
//			System.out.println(" short " + shortest.get(n).accept(printer));
//		}
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
			
		PurdomPhaseThree purdom3 = new PurdomPhaseThree(filteredGrammar, prev, shortest, rlen);
		List<List<String>> output = purdom3.phaseThree();
		System.out.println("before removing duplicates " + output.size()); 
		List<Terminal> ucSentences = new ArrayList<Terminal>();
		for(List<String> l : output){
			Collections.reverse(l);
			System.out.println(l.toString());
			Terminal t = buildString(l);
			if(!ucSentences.contains(t)){
				ucSentences.add(t);
			}			
		}
		System.out.println("After removing duplicates "  + ucSentences.size());
		for(Terminal t: ucSentences){
			System.out.println(t.getTerminal());
		}
		Map<Nonterminal, Boolean> covered = purdom3.getCovered();
		int i = 0;
		for(Nonterminal n: covered.keySet()){
			if(prev.containsKey(n)){
				if(!covered.get(n)){
					i++;
				}
			}	
		}
		System.out.println("uncovered productions " + i);	
	}
	
	private static Map<Nonterminal, List<Terminal>> getSentences(GrammarMap filteredGrammar) throws IOException {
		NonterminalsSentences sentenceGen = new NonterminalsSentences(filteredGrammar);
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
		return terminalString;
		
	}

	private static Terminal buildString(List<String> strings) {
		StringBuilder sb = new StringBuilder();
		for(String s: strings){
			sb.append(s);
		}
		return new Terminal(sb.toString());
	}

}
