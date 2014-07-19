package data;

import grammarDatastructure.Expression;
import grammarDatastructure.GrammarMap;
import grammarDatastructure.Nonterminal;
import grammarDatastructure.ProductionRule;
import grammarDatastructure.Terminal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import purdom.ProductionsRLEN;
import purdom.PurdomPhaseOne;
import purdom.PurdomPhaseThree;
import purdom.PurdomPhaseTwo;

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
			Map<Nonterminal, Expression> startSymbol = new HashMap<>();
			startSymbol.put(new Nonterminal("currentStart"), entry.getKey());

			workingGrammar.setStartSymbol(startSymbol);
			workingGrammar.getGrammarMap().putAll(startSymbol);
			
			if(!entry.getKey().equals(Originalkey)){
				workingGrammar.getGrammarMap().remove(Originalkey);
			}
			
			Accessible filter = new Accessible(workingGrammar, startSymbol);

			GrammarMap filteredGrammar = filter.getFilteredGrammar();
			startSymbol = filteredGrammar.getStartSymbol();
			
			PurdomPhaseOne purdom1 = new PurdomPhaseOne(filteredGrammar, false);
			purdom1.phaseOne();
			Map<Nonterminal, Integer> slen = purdom1.getSlen();
			Map<Nonterminal, ProductionsRLEN> rlen = purdom1.getRlen();
			Map<Nonterminal, Expression> shortest = purdom1.getShortest();
			
			PurdomPhaseTwo purdom2 = new PurdomPhaseTwo(startSymbol, slen, rlen);
			purdom2.phaseTwo();
			Map<Nonterminal, ProductionRule> prev = purdom2.getPrev();
			
			PurdomPhaseThree purdom3 = new PurdomPhaseThree(filteredGrammar, prev, shortest, rlen);
			List<List<String>> output = purdom3.phaseThree();

			List<List<String>> reversedOutput = new ArrayList<List<String>>();
			for(List<String> l : output){
				Collections.reverse(l);
				reversedOutput.add(l);
			}
	 
			this.output.put(entry.getKey(), reversedOutput);
		}	

//		String folderName = "..\\Thesis\\src\\datawriting\\ncData\\";
//		for(Nonterminal n : this.output.keySet()){				
//			DataWriter writer = new DataWriter(this.output.get(n), folderName, n);
//			writer.writing();
////			System.out.println(n.getName() + " " + this.output.get(n).size() +  " : " + this.output.get(n).toString());
//		}
		
	}
}
