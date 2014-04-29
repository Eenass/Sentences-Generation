package buildAST;

import grammarParser.ANTLRv4Parser.AlternativeContext;
import grammarParser.ANTLRv4Parser.AtomContext;
import grammarParser.ANTLRv4Parser.BlockSetContext;
import grammarParser.ANTLRv4Parser.EbnfSuffixContext;
import grammarParser.ANTLRv4Parser.ElementContext;
import grammarParser.ANTLRv4Parser.ElementsContext;
import grammarParser.ANTLRv4Parser.GrammarSpecContext;
import grammarParser.ANTLRv4Parser.LabeledAltContext;
import grammarParser.ANTLRv4Parser.LexerRuleContext;
import grammarParser.ANTLRv4Parser.NotSetContext;
import grammarParser.ANTLRv4Parser.ParserRuleSpecContext;
import grammarParser.ANTLRv4Parser.RangeContext;
import grammarParser.ANTLRv4Parser.RuleAltListContext;
import grammarParser.ANTLRv4Parser.RuleSpecContext;
import grammarParser.ANTLRv4Parser.RulerefContext;
import grammarParser.ANTLRv4Parser.SetElementContext;
import grammarParser.ANTLRv4Parser.TerminalContext;
import grammarParser.ANTLRv4ParserBaseVisitor;
import gtojava.Choice;
import gtojava.Empty;
import gtojava.Expression;
import gtojava.Grammar;
import gtojava.Nonterminal;
import gtojava.Optional;
import gtojava.Plus;
import gtojava.ProductionRule;
import gtojava.Sequence;
import gtojava.Star;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ASTBuilderVisitor extends ANTLRv4ParserBaseVisitor<Expression>{
	
	private Grammar grammar;

	public ASTBuilderVisitor() {
		this.grammar = new Grammar();
	}

	public Grammar getGrammar() {
		return grammar;
	}

	public void setGrammar(Grammar grammar) {
		this.grammar = grammar;
	}
	
	private Choice makeChoice(List l) {
		Choice choice = new Choice();
		for(int i = 0; i < l.size(); i++){
			choice.addExpr((Expression) l.get(i));
		}
		return choice;
	}
	
	private Sequence makeSequence(List l) {
		Sequence sequence = new Sequence();
		for(int i = 0; i < l.size(); i++){
			sequence.addExpr((Expression) l.get(i));
		}
		return sequence;
	}
//	ctx.rules().getChildCount()
	@Override
	public Expression visitGrammarSpec(GrammarSpecContext ctx) {
		System.out.println("visitGrammarSpec");
		List<Expression> rules = new ArrayList<Expression>();
		if(ctx.rules() != null){
			System.out.println("\nrules :");
			for(int i = 0; i < 2; i++){
				System.out.println(" rule " + i + " " + ctx.rules().getChild(i).getText());
				rules.add(ctx.rules().getChild(i).accept(this));
			}
		}
		return makeSequence(rules);
	}
	
	@Override
	public Expression visitRuleSpec(RuleSpecContext ctx) {
		if(ctx.parserRuleSpec() != null){
			return ctx.parserRuleSpec().accept(this);
		}
		else{
			return ctx.lexerRule().accept(this);
		}
	}

	@Override
	public Expression visitParserRuleSpec(ParserRuleSpecContext ctx) {
		System.out.println("visitParserRuleSpec " + ctx.getText());
		Nonterminal n = new Nonterminal("");
		Expression exp = new Empty();
		if(ctx.RULE_REF() != null){
			System.out.println(ctx.RULE_REF().getText());
			n.setName(ctx.RULE_REF().getText());
		}
		if(ctx.ruleBlock() != null){
			exp = ctx.ruleBlock().accept(this);
		}
		grammar.addProductionRule(new ProductionRule(n, exp));
		return exp;
	}
	
	@Override
	public Expression visitRuleAltList(RuleAltListContext ctx) {
		return ctx.labeledAlt(0).accept(this);
	}
	
	@Override
	public Expression visitLabeledAlt(LabeledAltContext ctx) {
		Expression result = new Empty();
		if(ctx.alternative() != null){
			result = ctx.alternative().accept(this);
		}
		return result;
	}
	
	@Override
	public Expression visitAlternative(AlternativeContext ctx) {
		if(ctx.elements() != null){
			return ctx.elements().accept(this);
		}
		return new Empty();
	}
	
	@Override
	public Expression visitElements(ElementsContext ctx) {
		List<Expression> list = new ArrayList<Expression>();
		Expression result = new Empty();
		if(!(ctx.element().isEmpty())){
			for(int i = 0; i < ctx.element().size(); i++){
				System.out.println("visitElements" + ctx.element(i).getText());
				list.add(ctx.element(i).accept(this));
			}
			result = makeChoice(list);
		}	
		return result;
	}

	@Override
	public Expression visitElement(ElementContext ctx) {
		Expression result = new Empty();
		if(ctx.labeledElement() != null){
			result = makeSequence(Arrays.asList(ctx.labeledElement().accept(this),
					makeChoice(Arrays.asList(ctx.ebnfSuffix().accept(this), new Empty()))));
		}
		else if(ctx.atom() != null){
			if(ctx.ebnfSuffix() != null){
				Expression temp = ctx.ebnfSuffix().accept(this);
				if(temp instanceof Optional){
					result = new Optional(ctx.atom().accept(this));
				}
				else if(temp instanceof Star){
					result = new Star(ctx.atom().accept(this));
				}
				else if(temp instanceof Plus){
					result = new Plus(ctx.atom().accept(this));
				}
			}
			else{
				result = ctx.atom().accept(this);
			}
			System.out.println("result " + result);
		}
		else if(ctx.ebnf() != null){
			result = ctx.ebnf().accept(this);
		}
		else if(ctx.ACTION() != null){
			result = makeSequence(Arrays.asList(new Nonterminal(ctx.ACTION().getText()),
					new Optional(new Nonterminal(ctx.QUESTION().getText()))));
		}
		return result;
	}

	@Override
	public Expression visitAtom(AtomContext ctx) {
		Expression exp = new Empty();
		if(ctx.range() != null){
			exp = ctx.range().accept(this);
		}
		else if(ctx.terminal() != null){
			exp = ctx.terminal().accept(this);
		}
		else if(ctx.ruleref() != null){
			exp = ctx.ruleref().accept(this);
		}
		else if(ctx.notSet() != null){
			exp = ctx.notSet().accept(this);
		}
		return exp;
	}
	
	@Override
	public Expression visitRange(RangeContext ctx) {
		Sequence sequence = makeSequence(Arrays.asList(new Nonterminal(ctx.STRING_LITERAL(0).getText()),
									new Nonterminal(ctx.RANGE().getText()), 
									new Nonterminal(ctx.STRING_LITERAL(1).getText())));
		return sequence;
	}
	
	@Override
	public Expression visitTerminal(TerminalContext ctx) {
		Expression exp = new Empty();
		if(ctx.TOKEN_REF() != null){
			exp = new Nonterminal(ctx.TOKEN_REF().getText());
		}
		else if(ctx.STRING_LITERAL() != null){
			exp = new Nonterminal(ctx.STRING_LITERAL().getText());
		}
		return exp;
	}
	

	@Override
	public Expression visitRuleref(RulerefContext ctx) {
		Nonterminal n = new Nonterminal("");
		if(ctx.RULE_REF() != null){
			n.setName(ctx.RULE_REF().getText());
		}
		return n;
	}

	
	@Override
	public Expression visitEbnfSuffix(EbnfSuffixContext ctx) {
		Expression result = new Empty();
		if(ctx.QUESTION(0) != null){
			result = new Optional(new Empty());
		}
		if(ctx.STAR() != null){
			result = new Star(new Empty());
		}
		if(ctx.PLUS() != null){
			result = new Plus(new Empty());
		}
		return result;
	}

	@Override
	public Expression visitNotSet(NotSetContext ctx) {
		Expression result = new Empty();
		if(ctx.NOT() != null && ctx.setElement() != null){
			result = makeSequence(Arrays.asList(new Nonterminal(ctx.NOT().getText()),
								ctx.setElement().accept(this)));
		}
		else if(ctx.NOT() != null && ctx.blockSet() != null){
			result = makeSequence(Arrays.asList(new Nonterminal(ctx.NOT().getText()),
					ctx.blockSet().accept(this)));
		}
		return result;
	}
	
	@Override
	public Expression visitBlockSet(BlockSetContext ctx) {
		Expression result = new Empty();
		Nonterminal n1, n2;
		Choice choice = new Choice();
		n1 = n2 = new Nonterminal("");
		if(ctx.RPAREN() != null){
			n1.setName(ctx.LPAREN().getText());
		}
		if(ctx.setElement(0) != null){
			choice.addExpr(ctx.setElement(0).accept(this));
		}
		if(ctx.setElement(1) != null){
			for(int i = 0; i < ctx.setElement().size(); i++){
				choice.addExpr(ctx.setElement(i).accept(this));
			}
		}
		if(ctx.RPAREN() != null){
			n2.setName(ctx.RPAREN().getText());
		}
		result = makeSequence(Arrays.asList(n1, choice,n2));
		return result;
	}

	@Override
	public Expression visitSetElement(SetElementContext ctx) {
		Expression result = new Empty();
		if(ctx.TOKEN_REF() != null){
			result = new Nonterminal(ctx.TOKEN_REF().getText());
		}
		if(ctx.STRING_LITERAL() != null){
			result = new Nonterminal(ctx.STRING_LITERAL().getText());
		}
		if(ctx.range() != null){
			result = ctx.range().accept(this);
		}
		if(ctx.LEXER_CHAR_SET() != null){
			result = new Nonterminal(ctx.LEXER_CHAR_SET().getText());
		}
		return result;
	}


	@Override
	public Expression visitLexerRule(LexerRuleContext ctx) {
		Nonterminal n = new Nonterminal("");
		Expression exp = new Empty();
		if(ctx.TOKEN_REF() != null){
			System.out.println(ctx.TOKEN_REF().getText());
			n.setName(ctx.TOKEN_REF().getText());
		}
		if(ctx.lexerRuleBlock() != null){
			 exp = ctx.lexerRuleBlock().accept(this);
		}
		grammar.addProductionRule(new ProductionRule(n, exp));
		return exp;
	}



}
