import grammarDatastructure.Choice;
import grammarDatastructure.Empty;
import grammarDatastructure.Grammar;
import grammarDatastructure.Nonterminal;
import grammarDatastructure.Optional;
import grammarDatastructure.Plus;
import grammarDatastructure.ProductionRule;
import grammarDatastructure.Sequence;
import grammarDatastructure.Star;
import grammarDatastructure.Terminal;
import grammarDatastructure.Visitor;


public class GrammarInformation implements Visitor<Integer>{

	private Grammar grammar;
	private Integer nonterminals, productions, terms;
	
	public GrammarInformation(Grammar grammar) {
		this.grammar = grammar;
		this.nonterminals = 0;
		this.productions = 0;
		this.terms = 0;
		calculate();
	}
	
	public Integer getNonterminals() {
		return nonterminals;
	}

	public Integer getProductions() {
		return productions;
	}

	private void calculate() {
		this.nonterminals = this.grammar.getGrammar().size();
		this.terms = this.grammar.getTerminlas().size();
		for(ProductionRule p: this.grammar.getGrammar()){
			this.productions += p.getExpr().accept(this);
		}
		
	}

	public Integer getTerms() {
		return terms;
	}

	@Override
	public Integer visit(Terminal terminal) {
		return 1;
	}

	@Override
	public Integer visit(Nonterminal nonterminal) {
		return 1;
	}

	@Override
	public Integer visit(Optional optional) {
		return 1;
	}

	@Override
	public Integer visit(Star star) {
		return 1;
	}

	@Override
	public Integer visit(Plus plus) {
		return 1;
	}

	@Override
	public Integer visit(Sequence sequence) {
		return 1;
	}

	@Override
	public Integer visit(Empty empty) {
		return 1;
	}

	@Override
	public Integer visit(Choice choice) {
		return choice.getChoices().size();
	}
}
