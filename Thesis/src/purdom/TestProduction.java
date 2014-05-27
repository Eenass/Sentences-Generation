package purdom;

import gtojava.Expression;
import gtojava.Grammar;
import gtojava.GrammarMap;
import gtojava.Nonterminal;
import gtojava.ProductionRule;

import java.io.IOException;
import java.util.Map;

import buildAST.ASTBuilder;
import buildAST.ASTPrinter;

public class TestProduction {

	public static void main(String[] args) throws IOException{
		ASTPrinter printer = new ASTPrinter();
//		Nonterminal n1 = new Nonterminal("n1");
//		Nonterminal n2 = new Nonterminal("n2");
//		Nonterminal n3 = new Nonterminal("n3");
//		Nonterminal n4 = new Nonterminal("n4");
//		Nonterminal n6 = new Nonterminal("n6");
//		Nonterminal n7 = new Nonterminal("n7");
//		Terminal t = new Terminal("t");
//		Terminal t1 = new Terminal("t1");
//		Choice choice1 = new Choice();
//		List<Expression> ch1 = new ArrayList<Expression>(Arrays.asList(n6, n7));
//		choice1.setChoices(ch1);
//		
//		Choice choice = new Choice();
//		List<Expression> ch = new ArrayList<Expression>(Arrays.asList(n1, n2, t));
//		choice.setChoices(ch);
//		Sequence seq = new Sequence();
//		Sequence seq1 = new Sequence();
//		seq1.setSequence(new ArrayList<Expression>(Arrays.asList(choice1, t1)));
//		seq.setSequence(new ArrayList<Expression>(Arrays.asList(choice , n3 , seq1, n4)));
//		Productions p = new Productions(seq);
//		System.out.println(p.getProdList().size());
//		for(Expression e : p.getProdList()){
//			System.out.println(e.accept(printer));
//		}
//		
		String filePath = "..\\Thesis\\src\\testGrammar\\Testgrammar.g4";
//		String filePath = "..\\Thesis\\src\\extractedGrammar\\ExtractedJava.g4";
		ASTBuilder astbuilder = new ASTBuilder(filePath);
		Grammar grammar = astbuilder.buildGrammar();
		GrammarMap grammarMap = new GrammarMap(grammar);
		Map<Nonterminal, Expression> startSymbol = grammarMap.getStartSymbol();
		PurdomPhaseOne purdom1 = new PurdomPhaseOne(grammarMap);
		purdom1.phaseOne();
		Map<Nonterminal, Integer> slen = purdom1.getSlenNonterminals();
		Map<Nonterminal, ProductionsRLEN> rlen = purdom1.getRlen();
		for(Nonterminal n : slen.keySet()){
			System.out.println(n.getName() + " " + slen.get(n));
		}
		PurdomPhaseTwo purdom2 = new PurdomPhaseTwo(startSymbol, slen, rlen);
		purdom2.phaseTwo();
		Map<Nonterminal, Integer> dlen = purdom2.getDlen();
		Map<Nonterminal, ProductionRule> prev = purdom2.getPrev();
		for(Nonterminal n: dlen.keySet()){
			System.out.println(n.getName() + " " + dlen.get(n));
			System.out.println(prev.get(n).getRuleName().accept(printer) + " " + prev.get(n).getExpr().accept(printer));

		}
		
	}

}
