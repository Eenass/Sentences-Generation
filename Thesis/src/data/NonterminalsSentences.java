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
import java.util.Map.Entry;

import datawriting.DataWriter;
import purdom.ProductionsMark;
import purdom.ProductionsRLEN;
import purdom.PurdomPhaseOne;
import purdom.PurdomPhaseThree;
import purdom.PurdomPhaseTwo;
import buildAST.ASTBuilder;
import buildAST.ASTPrinter;

public class NonterminalsSentences {
	
	private GrammarMap grammar;
	private Map<Nonterminal, List<List<String>>> output;
	
	public NonterminalsSentences(GrammarMap grammar) throws IOException{
		this.grammar = grammar;
		this.output = new LinkedHashMap<Nonterminal, List<List<String>>>(); 
		generateSentences();
	}	

	public Map<Nonterminal, List<List<String>>> getOutput() {
		return output;
	}



	private void generateSentences() throws IOException {
		Map<Nonterminal, Expression> originalStart = this.grammar.getStartSymbol();
		Nonterminal Originalkey = originalStart.entrySet().iterator().next().getKey();
		GrammarMap workingGrammar = new GrammarMap();
		Map<Nonterminal, Expression> temprules = new LinkedHashMap<>(this.grammar.getGrammarMap());
		workingGrammar.setGrammarMap(temprules);
		
		for(Entry<Nonterminal, Expression> entry : this.grammar.getGrammarMap().entrySet()){
//			Map<Nonterminal, Expression> tempStart = new HashMap<Nonterminal, Expression>();
//			tempStart.put(entry.getKey(), entry.getValue());
			Map<Nonterminal, Expression> startSymbol = new HashMap<>();
			startSymbol.put(new Nonterminal("currentStart"), entry.getKey());

			workingGrammar.setStartSymbol(startSymbol);
			workingGrammar.getGrammarMap().putAll(startSymbol);
			
			if(!entry.getKey().equals(Originalkey)){
				workingGrammar.getGrammarMap().remove(Originalkey);
			}
			
//			ChangeGrammar change = new ChangeGrammar(workingGrammar, workingGrammar.getStartSymbol());
//			GrammarMap adapted = change.getOutput();
//			
//			Accessible filter = new Accessible(adapted, adapted.getStartSymbol());
//			List<Nonterminal> accessibleN = filter.getAccessible();
//			
//			LinkedHashMap<Nonterminal, Expression> toBEfiltered = new LinkedHashMap<Nonterminal, Expression>(adapted.getGrammarMap());
//			for(Nonterminal n: toBEfiltered.keySet()){
//				if(!accessibleN.contains(n) && !n.equals(startSymbol.entrySet().iterator().next().getKey())){
//					adapted.getGrammarMap().remove(n);
//				}
//			}
			Accessible filter = new Accessible(workingGrammar, startSymbol);

			GrammarMap filteredGrammar = filter.getFilteredGrammar();
			startSymbol = filteredGrammar.getStartSymbol();
			
			PurdomPhaseOne purdom1 = new PurdomPhaseOne(filteredGrammar);
			purdom1.phaseOne();
			Map<Nonterminal, Integer> slen = purdom1.getSlen();
			Map<Nonterminal, ProductionsRLEN> rlen = purdom1.getRlen();
			Map<Nonterminal, Expression> shortest = purdom1.getShortest();
			
			PurdomPhaseTwo purdom2 = new PurdomPhaseTwo(startSymbol, slen, rlen);
			purdom2.phaseTwo();
			Map<Nonterminal, Integer> dlen = purdom2.getDlen();
			Map<Nonterminal, ProductionRule> prev = purdom2.getPrev();
			
//			GrammarMap temp = new GrammarMap();
//			Map<Nonterminal, Expression> rules = new LinkedHashMap<>(filteredGrammar.getGrammarMap());
//			temp.setGrammarMap(rules);
//			Map<Nonterminal, ProductionRule> newPrev = new LinkedHashMap<Nonterminal, ProductionRule>(prev);
			
//			for(Nonterminal n: filteredGrammar.getNonterminals()){				
//				if(!prev.keySet().contains(n)){
//					temp.getGrammarMap().remove(n); 
//				}
//			}
//			temp.setStartSymbol(filteredGrammar.getStartSymbol());
//			temp.getGrammarMap().putAll(filteredGrammar.getStartSymbol());
			
			PurdomPhaseThree purdom3 = new PurdomPhaseThree(filteredGrammar, prev, shortest, rlen);
			List<List<String>> output = purdom3.phaseThree();

			List<List<String>> reversedOutput = new ArrayList<List<String>>();
			for(List<String> l : output){
				Collections.reverse(l);
				reversedOutput.add(l);
			}
	 
//			Map<Nonterminal, ProductionsMark> mark = purdom3.getMark();
//			int j = 0;
//			for(Nonterminal n : mark.keySet()){
//				if(n.equals(entry.getKey())){
//					for(Expression exp: mark.get(n).getKeys()){
//						if(!mark.get(n).getProdValue(exp)){
//							j++;
//						}	
//					}
//				}	
//			}
//			System.out.println("Number of uncovered production " + j);
			this.output.put(entry.getKey(), output);
		}	

//		String folderName = "..\\Thesis\\src\\datawriting\\ncData\\";
//		for(Nonterminal n : this.output.keySet()){				
//			DataWriter writer = new DataWriter(this.output.get(n), folderName, n);
//			writer.writing();
////			System.out.println(n.getName() + " " + this.output.get(n).size() +  " : " + this.output.get(n).toString());
//		}
		
	}
}
