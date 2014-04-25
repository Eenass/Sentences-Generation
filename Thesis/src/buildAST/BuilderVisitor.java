package buildAST;

import grammarParser.ANTLRv4Parser.ActionContext;
import grammarParser.ANTLRv4Parser.ActionScopeNameContext;
import grammarParser.ANTLRv4Parser.AltListContext;
import grammarParser.ANTLRv4Parser.AlternativeContext;
import grammarParser.ANTLRv4Parser.AtomContext;
import grammarParser.ANTLRv4Parser.BlockContext;
import grammarParser.ANTLRv4Parser.BlockSetContext;
import grammarParser.ANTLRv4Parser.BlockSuffixContext;
import grammarParser.ANTLRv4Parser.DelegateGrammarContext;
import grammarParser.ANTLRv4Parser.DelegateGrammarsContext;
import grammarParser.ANTLRv4Parser.EbnfContext;
import grammarParser.ANTLRv4Parser.EbnfSuffixContext;
import grammarParser.ANTLRv4Parser.ElementContext;
import grammarParser.ANTLRv4Parser.ElementOptionContext;
import grammarParser.ANTLRv4Parser.ElementOptionsContext;
import grammarParser.ANTLRv4Parser.ElementsContext;
import grammarParser.ANTLRv4Parser.ExceptionGroupContext;
import grammarParser.ANTLRv4Parser.ExceptionHandlerContext;
import grammarParser.ANTLRv4Parser.FinallyClauseContext;
import grammarParser.ANTLRv4Parser.GrammarSpecContext;
import grammarParser.ANTLRv4Parser.GrammarTypeContext;
import grammarParser.ANTLRv4Parser.IdContext;
import grammarParser.ANTLRv4Parser.LabeledAltContext;
import grammarParser.ANTLRv4Parser.LabeledElementContext;
import grammarParser.ANTLRv4Parser.LabeledLexerElementContext;
import grammarParser.ANTLRv4Parser.LexerAltContext;
import grammarParser.ANTLRv4Parser.LexerAltListContext;
import grammarParser.ANTLRv4Parser.LexerAtomContext;
import grammarParser.ANTLRv4Parser.LexerBlockContext;
import grammarParser.ANTLRv4Parser.LexerCommandContext;
import grammarParser.ANTLRv4Parser.LexerCommandExprContext;
import grammarParser.ANTLRv4Parser.LexerCommandNameContext;
import grammarParser.ANTLRv4Parser.LexerCommandsContext;
import grammarParser.ANTLRv4Parser.LexerElementContext;
import grammarParser.ANTLRv4Parser.LexerElementsContext;
import grammarParser.ANTLRv4Parser.LexerRuleBlockContext;
import grammarParser.ANTLRv4Parser.LexerRuleContext;
import grammarParser.ANTLRv4Parser.LocalsSpecContext;
import grammarParser.ANTLRv4Parser.ModeSpecContext;
import grammarParser.ANTLRv4Parser.NotSetContext;
import grammarParser.ANTLRv4Parser.OptionContext;
import grammarParser.ANTLRv4Parser.OptionValueContext;
import grammarParser.ANTLRv4Parser.OptionsSpecContext;
import grammarParser.ANTLRv4Parser.ParserRuleSpecContext;
import grammarParser.ANTLRv4Parser.PrequelConstructContext;
import grammarParser.ANTLRv4Parser.RangeContext;
import grammarParser.ANTLRv4Parser.RuleActionContext;
import grammarParser.ANTLRv4Parser.RuleAltListContext;
import grammarParser.ANTLRv4Parser.RuleBlockContext;
import grammarParser.ANTLRv4Parser.RuleModifierContext;
import grammarParser.ANTLRv4Parser.RuleModifiersContext;
import grammarParser.ANTLRv4Parser.RulePrequelContext;
import grammarParser.ANTLRv4Parser.RuleReturnsContext;
import grammarParser.ANTLRv4Parser.RuleSpecContext;
import grammarParser.ANTLRv4Parser.RulerefContext;
import grammarParser.ANTLRv4Parser.RulesContext;
import grammarParser.ANTLRv4Parser.SetElementContext;
import grammarParser.ANTLRv4Parser.TerminalContext;
import grammarParser.ANTLRv4Parser.ThrowsSpecContext;
import grammarParser.ANTLRv4Parser.TokensSpecContext;
import grammarParser.ANTLRv4ParserBaseVisitor;
import gtojava.Choice;
import gtojava.Empty;
import gtojava.Expression;
import gtojava.Nonterminal;
import gtojava.Optional;
import gtojava.Plus;
import gtojava.Sequence;
import gtojava.Star;
import gtojava.Terminal;

import java.util.Arrays;
import java.util.List;

public class BuilderVisitor extends ANTLRv4ParserBaseVisitor<Expression>{


	public BuilderVisitor() {
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


	@Override
	public Choice visitRuleSpec(RuleSpecContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.parserRuleSpec().accept(this);
		Nonterminal n2 = (Nonterminal) ctx.lexerRule().accept(this);
		Choice  choice = makeChoice(Arrays.asList(n1, n2));
		return choice;
	}

	@Override
	public Choice visitAtom(AtomContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.range().accept(this);
		Nonterminal n2 = (Nonterminal) ctx.terminal().accept(this);
		Nonterminal n3 = (Nonterminal) ctx.ruleref().accept(this);
		Nonterminal n4 = (Nonterminal) ctx.notSet().accept(this);
		Terminal t = new Terminal(ctx.DOT().getText()); 
		Optional o = new Optional(ctx.elementOptions().accept(this));
		Sequence seq = makeSequence(Arrays.asList(t, o));
		Choice choice = makeChoice(Arrays.asList(n1, n2, n3, n4, seq));
		return choice;
	}

	@Override
	public Expression visitRuleBlock(RuleBlockContext ctx) {
		return ctx.ruleAltList().accept(this);
	}

	@Override
	public Expression visitNotSet(NotSetContext ctx) {
		Terminal t = new Terminal(ctx.NOT().getText());
		Nonterminal n1 = (Nonterminal) ctx.setElement().accept(this);
		Nonterminal n2 = (Nonterminal) ctx.blockSet().accept(this);
		Sequence seq1 = makeSequence(Arrays.asList(t, n1));
		Sequence seq2 = makeSequence(Arrays.asList(t, n2));
		Choice choice = makeChoice(Arrays.asList(seq1, seq2));
		return choice;
	}

	@Override
	public Expression visitLexerCommands(LexerCommandsContext ctx) {
		Terminal t1 = new Terminal(ctx.RARROW().getText());
		Nonterminal n1 = (Nonterminal) ctx.lexerCommand(0).accept(this);
		Terminal t2 = new Terminal(ctx.COMMA(0).getText());
		Nonterminal n2 = (Nonterminal) ctx.lexerCommand(1).accept(this);
		Star star = new Star(makeSequence(Arrays.asList(t2, n2)));
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, star));
		return sequence;
	}

	@Override
	public Expression visitLexerAltList(LexerAltListContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.lexerAlt(0).accept(this);
		Terminal t = new Terminal(ctx.OR(0).getText());
		Nonterminal n2 = (Nonterminal) ctx.lexerAlt(1).accept(this);
		Star star = new Star(makeSequence(Arrays.asList(t, n2)));
		Sequence sequence = makeSequence(Arrays.asList(n1, star));
		return sequence;
	}

	@Override
	public Expression visitRuleModifier(RuleModifierContext ctx) {
		Terminal t1 = new Terminal(ctx.PUBLIC().getText());
		Terminal t2 = new Terminal(ctx.PRIVATE().getText());
		Terminal t3 = new Terminal(ctx.PROTECTED().getText());
		Terminal t4 = new Terminal(ctx.FRAGMENT().getText());
		Choice choice = makeChoice(Arrays.asList(t1, t2, t3, t4));
		return choice;
	}

	@Override
	public Expression visitRuleAltList(RuleAltListContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.labeledAlt(0).accept(this);
		Terminal t = new Terminal(ctx.OR(0).getText());
		Nonterminal n2 = (Nonterminal) ctx.labeledAlt(1).accept(this);
		Star star = new Star(makeSequence(Arrays.asList(t, n2)));
		Sequence sequence = makeSequence(Arrays.asList(n1, star));
		return sequence;
	}

	@Override
	public Expression visitTerminal(TerminalContext ctx) {
		Terminal t1 = new Terminal(ctx.TOKEN_REF().getText());
		Optional o = (Optional) ctx.elementOptions().accept(this);
		Terminal t2 = new Terminal(ctx.STRING_LITERAL().getText());
		Sequence seq1 = makeSequence(Arrays.asList(t1, o));
		Sequence seq2 = makeSequence(Arrays.asList(t2, o));
		Choice choice = makeChoice(Arrays.asList(seq1, seq2));
		return choice;
	}

	@Override
	public Expression visitLexerCommand(LexerCommandContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.lexerCommandName().accept(this);
		Terminal t1 = new Terminal(ctx.LPAREN().getText());
		Nonterminal n2 = (Nonterminal) ctx.lexerCommandExpr().accept(this);
		Terminal t2 = new Terminal(ctx.RPAREN().getText());
		Sequence seq = makeSequence(Arrays.asList(n1, t1, n2, t2));
		Choice choice = makeChoice(Arrays.asList(seq, n1));
		return choice;
	}

	@Override
	public Expression visitThrowsSpec(ThrowsSpecContext ctx) {
		Terminal t1 = new Terminal(ctx.THROWS().getText());
		Nonterminal n1 = (Nonterminal) ctx.id(0).accept(this);
		Terminal t2 = new Terminal(ctx.COMMA(0).getText());
		Nonterminal n2 = (Nonterminal) ctx.id(1).accept(this);
		Star star = new Star(makeSequence(Arrays.asList(t2, n2)));
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, star));
		return sequence;
	}

	@Override
	public Expression visitLocalsSpec(LocalsSpecContext ctx) {
		Terminal t1 = new Terminal(ctx.LOCALS().getText());
		Terminal t2 = new Terminal(ctx.ARG_ACTION().getText());
		Sequence sequence = makeSequence(Arrays.asList(t1, t2));
		return sequence;
	}

	@Override
	public Expression visitAction(ActionContext ctx) {
		Terminal n1 = new Terminal(ctx.AT().getText());
		Nonterminal n2 = (Nonterminal) ctx.actionScopeName().accept(this);
		Terminal n3 = new Terminal(ctx.COLONCOLON().getText());
		Optional o = new Optional(makeSequence(Arrays.asList(n2, n3)));
		Nonterminal n4 = (Nonterminal)ctx.id().accept(this);
		Terminal n5 = new Terminal(ctx.ACTION().getText());
		Sequence sequence = makeSequence(Arrays.asList(n1, o, n4, n5));
		return sequence;
	}

	@Override
	public Expression visitModeSpec(ModeSpecContext ctx) {
		Terminal n1 = new Terminal(ctx.MODE().getText());
		Nonterminal n2 = (Nonterminal) ctx.id().accept(this);
		Terminal n3 = new Terminal(ctx.SEMI().getText());
		Plus p = new Plus(ctx.ruleSpec(0).accept(this));
		Sequence sequence = makeSequence(Arrays.asList(n1, n2, n3, p));
		return sequence;		
	}

	@Override
	public Expression visitElements(ElementsContext ctx) {
		return new Plus(ctx.element(0).accept(this));
	}

	@Override
	public Expression visitOption(OptionContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.id().accept(this);
		Terminal t = new Terminal(ctx.ASSIGN().getText());
		Nonterminal n2 = (Nonterminal) ctx.optionValue().accept(this);
		Sequence sequence = makeSequence(Arrays.asList(n1, t, n2));
		return sequence;
	}

	@Override
	public Expression visitElement(ElementContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.labeledElement().accept(this);
		Nonterminal n2 = (Nonterminal) ctx.ebnfSuffix().accept(this);
		Empty e = new Empty();
		Choice ch = makeChoice(Arrays.asList(n2, e));
		Sequence seq1 = makeSequence(Arrays.asList(n1, ch));
		Nonterminal n3 = (Nonterminal) ctx.atom().accept(this);
		Sequence seq2 = makeSequence(Arrays.asList(n3, ch));
		Nonterminal n4 = (Nonterminal) ctx.ebnf().accept(this);
		Terminal t = new Terminal(ctx.ACTION().getText());
		Optional o = new Optional(new Terminal(ctx.QUESTION().getText()));
		Sequence seq3 =  makeSequence(Arrays.asList(t, o));
		Choice choice = makeChoice(Arrays.asList(seq1, seq2, n4, seq3));
		return choice;
	}

	@Override
	public Expression visitElementOptions(ElementOptionsContext ctx) {
		Terminal t1 = new Terminal(ctx.LT().getText());
		Nonterminal n1 = (Nonterminal) ctx.elementOption(0).accept(this);
		Terminal t2 = new Terminal(ctx.COMMA(0).getText());
		Nonterminal n2 = (Nonterminal) ctx.elementOption(1).accept(this);
		Star star = new Star(makeSequence(Arrays.asList(t2, n2)));
		Terminal t3 = new Terminal(ctx.GT().getText());
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, star, t3));
		return sequence;
	}

	@Override
	public Expression visitLexerElement(LexerElementContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.labeledLexerElement().accept(this);
		Optional o = (Optional) ctx.ebnfSuffix().accept(this);
		Sequence seq1 = makeSequence(Arrays.asList(n1, o));
		Nonterminal n2 = (Nonterminal) ctx.lexerAtom().accept(this);
		Sequence seq2 = makeSequence(Arrays.asList(n2, o));
		Nonterminal n3 = (Nonterminal) ctx.lexerBlock().accept(this);
		Sequence seq3 = makeSequence(Arrays.asList(n3, o));
		Terminal t = new Terminal(ctx.ACTION().getText());
		Optional o1 = new Optional(new Terminal(ctx.QUESTION().getText()));
		Sequence seq4 = makeSequence(Arrays.asList(t, o1));
		Choice choice = makeChoice(Arrays.asList(seq1, seq2, seq3, seq4));
		return choice;
	}

	@Override
	public Expression visitParserRuleSpec(ParserRuleSpecContext ctx) {
		Optional o1 = new Optional(new Terminal(ctx.DOC_COMMENT().getText()));
		Optional o2 = (Optional) ctx.ruleModifiers().accept(this);
		Terminal t1 = new Terminal(ctx.RULE_REF().getText());
		Optional o3 = new Optional(new Terminal(ctx.ARG_ACTION().getText()));
		Optional o4 = (Optional) ctx.ruleReturns().accept(this);
		Optional o5 = (Optional) ctx.throwsSpec().accept(this);
		Optional o6 = (Optional) ctx.localsSpec().accept(this);
		Star star = (Star) ctx.rulePrequel(0).accept(this);
		Terminal t2 = new Terminal(ctx.COLON().getText());
		Nonterminal n1 = (Nonterminal) ctx.ruleBlock().accept(this);
		Terminal t3 = new Terminal(ctx.SEMI().getText());
		Nonterminal n2 = (Nonterminal) ctx.exceptionGroup().accept(this);
		Sequence sequence = makeSequence(Arrays.asList(o1, o2, t1, o3, o4, o5, o6, star, t2, n1, t3, n2));
		return sequence;
	}

	@Override
	public Expression visitAlternative(AlternativeContext ctx) {
		Nonterminal n = (Nonterminal) ctx.elements().accept(this);
		Empty e = new Empty();
		Choice choice = makeChoice(Arrays.asList(n, e));
		return choice;
	}

	@Override
	public Expression visitGrammarType(GrammarTypeContext ctx) {
		Terminal t1 = new Terminal(ctx.LEXER().getText());
		Terminal t2 = new Terminal(ctx.GRAMMAR().getText());
		Sequence seq1 = makeSequence(Arrays.asList(t1, t2));
		Terminal t3 = new Terminal(ctx.PARSER().getText());
		Sequence seq2 = makeSequence(Arrays.asList(t3, t2));
		Choice choice = makeChoice(Arrays.asList(seq1, seq2, t3));
		return choice;		
	}

	@Override
	public Expression visitRuleAction(RuleActionContext ctx) {
		Terminal t1 = new Terminal(ctx.AT().getText());
		Nonterminal n1 = (Nonterminal) ctx.id().accept(this);
		Terminal t2 = new Terminal(ctx.ACTION().getText());
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, t2));
		return sequence;
	}

	@Override
	public Expression visitEbnfSuffix(EbnfSuffixContext ctx) {
		Terminal t1 = new Terminal(ctx.QUESTION(0).getText());
		Optional o= new Optional(new Terminal(ctx.QUESTION(1).getText()));
		Sequence seq1 = makeSequence(Arrays.asList(t1, o));
		Terminal t2 = new Terminal(ctx.STAR().getText());
		Sequence seq2 = makeSequence(Arrays.asList(t2, o));
		Terminal t3 = new Terminal(ctx.PLUS().getText());
		Sequence seq3 = makeSequence(Arrays.asList(t3, o));
		Choice choice = makeChoice(Arrays.asList(seq1, seq2, seq3));
		return choice;
	}

	@Override
	public Expression visitRulePrequel(RulePrequelContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.optionsSpec().accept(this);
		Nonterminal n2 = (Nonterminal) ctx.ruleAction().accept(this);
		Choice choice = makeChoice(Arrays.asList(n1, n2));
		return choice;
	}

	@Override
	public Expression visitExceptionGroup(ExceptionGroupContext ctx) {
		Star star = (Star) ctx.exceptionHandler(0).accept(this);
		Optional o = (Optional) ctx.finallyClause().accept(this);
		Sequence sequence = makeSequence(Arrays.asList(star, o));
		return sequence;
	}

	@Override
	public Expression visitLexerBlock(LexerBlockContext ctx) {
		Terminal t1 = new Terminal(ctx.LPAREN().getText());
		Nonterminal n1 = (Nonterminal) ctx.lexerAltList().accept(this);
		Terminal t2 = new Terminal(ctx.RPAREN().getText());
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, t2));
		return sequence;
	}

	@Override
	public Expression visitSetElement(SetElementContext ctx) {
		Terminal t1 = new Terminal(ctx.TOKEN_REF().getText());
		Terminal t2 = new Terminal(ctx.STRING_LITERAL().getText());
		Nonterminal n1 = (Nonterminal) ctx.range().accept(this);
		Terminal t3 = new Terminal(ctx.LEXER_CHAR_SET().getText());
		Choice choice = makeChoice(Arrays.asList(t1, t2, n1, t3));
		return choice;
	}

	@Override
	public Expression visitBlockSet(BlockSetContext ctx) {
		Terminal t1 = new Terminal(ctx.RPAREN().getText());
		Nonterminal n1 = (Nonterminal) ctx.setElement(0).accept(this);
		Terminal t2 = new Terminal(ctx.OR(0).getText());
		Nonterminal n2 = (Nonterminal) ctx.setElement(1).accept(this);
		Star star = new Star(makeSequence(Arrays.asList(t2, n2)));
		Terminal t3 = new Terminal(ctx.RPAREN().getText());
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, star, t3));
		return sequence;
	}

	@Override
	public Expression visitActionScopeName(ActionScopeNameContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.id().accept(this);
		Terminal t1 = new Terminal(ctx.LEXER().getText());
		Terminal t2 = new Terminal(ctx.PARSER().getText());
		Choice choice = makeChoice(Arrays.asList(n1, t1, t2));
		return choice;
	}

	@Override
	public Expression visitLabeledAlt(LabeledAltContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.alternative().accept(this);
		Terminal t = new Terminal(ctx.POUND().getText());
		Nonterminal n2 = (Nonterminal) ctx.id().accept(this);
		Optional o = new Optional(makeSequence(Arrays.asList(t, n2)));
		Sequence sequence = makeSequence(Arrays.asList(n1, o));
		return sequence;
	}

	@Override
	public Expression visitLexerAtom(LexerAtomContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.range().accept(this);
		Nonterminal n2 = (Nonterminal) ctx.terminal().accept(this); 
		Terminal t1 = new Terminal(ctx.RULE_REF().getText());
		Nonterminal n3 = (Nonterminal) ctx.notSet().accept(this);
		Terminal t2 = new Terminal(ctx.LEXER_CHAR_SET().getText());
		Terminal t3 = new Terminal(ctx.DOT().getText());
		Optional o = new Optional(ctx.elementOptions().accept(this));
		Sequence seq = makeSequence(Arrays.asList(t3, o));
		Choice choice = makeChoice(Arrays.asList(n1, n2, t1, n3, t2, seq));
		return choice;
	}

	@Override
	public Expression visitLabeledElement(LabeledElementContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.id().accept(this);
		Terminal t1 = new Terminal(ctx.ASSIGN().getText());
		Terminal t2 = new Terminal(ctx.PLUS_ASSIGN().getText());
		Choice ch1 = makeChoice(Arrays.asList(t1, t2));
		Nonterminal n2 = (Nonterminal) ctx.atom().accept(this);
		Nonterminal n3 = (Nonterminal) ctx.block().accept(this);
		Choice ch2 = makeChoice(Arrays.asList(n2, n3));
		Sequence sequence = makeSequence(Arrays.asList(n1, ch1, ch2));
		return sequence;
	}

	@Override
	public Expression visitLexerRuleBlock(LexerRuleBlockContext ctx) {
		return ctx.lexerAltList().accept(this);
	}

	@Override
	public Expression visitFinallyClause(FinallyClauseContext ctx) {
		Terminal t1 = new Terminal(ctx.FINALLY().getText());
		Terminal t2 = new Terminal(ctx.ACTION().getText());
		Sequence sequence = makeSequence(Arrays.asList(t1, t2));
		return sequence;
	}

	@Override
	public Expression visitGrammarSpec(GrammarSpecContext ctx) {
		Optional o = new Optional(new Terminal(ctx.DOC_COMMENT().getText()));
		Nonterminal n1 = (Nonterminal) ctx.grammarType().accept(this);
		Nonterminal n2 = (Nonterminal) ctx.id().accept(this);
		Terminal t1 = new Terminal(ctx.SEMI().getText());
		Star s1 = (Star) ctx.prequelConstruct(0).accept(this);
		Nonterminal n3 = (Nonterminal) ctx.rules().accept(this);
		Star s2 = (Star) ctx.modeSpec(0).accept(this);
		Terminal t2 = new Terminal(ctx.EOF().getText());
		Sequence sequence = makeSequence(Arrays.asList(o, n1, n2, t1, s1, n3, s2, t2));
		return sequence;
	}

	@Override
	public Expression visitDelegateGrammar(DelegateGrammarContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.id(0).accept(this);
		Terminal t = new Terminal(ctx.ASSIGN().getText());
		Nonterminal n2 = (Nonterminal) ctx.id(1).accept(this);
		Sequence seq = makeSequence(Arrays.asList(n1, t, n2));
		Choice choice = makeChoice(Arrays.asList(seq, n1));
		return choice;
	}

	@Override
	public Expression visitLexerElements(LexerElementsContext ctx) {
		return new Plus(ctx.lexerElement(0).accept(this));
	}

	@Override
	public Expression visitRange(RangeContext ctx) {
		Terminal t1 = new Terminal(ctx.STRING_LITERAL(0).getText());
		Terminal t2 = new Terminal(ctx.RANGE().getText());
		Terminal t3 = new Terminal(ctx.STRING_LITERAL(1).getText());
		Sequence sequence = makeSequence(Arrays.asList(t1, t2, t3));
		return sequence;
	}

	@Override
	public Expression visitLexerCommandName(LexerCommandNameContext ctx) {
		Nonterminal n = (Nonterminal) ctx.id().accept(this);
		Terminal t = new Terminal(ctx.MODE().getText());
		Choice choice = makeChoice(Arrays.asList(n, t));
		return choice;
	}

	@Override
	public Expression visitBlock(BlockContext ctx) {
		Terminal t1 = new Terminal(ctx.LPAREN().getText());
		Optional o1 = (Optional) ctx.optionsSpec().accept(this);
		Star star = (Star) ctx.ruleAction(0).accept(this);
		Terminal t2 = new Terminal(ctx.COLON().getText());
		Optional o2 = new Optional(makeSequence(Arrays.asList(o1, star, t2)));
		Nonterminal n = (Nonterminal) ctx.altList().accept(this);
		Terminal t3 = new Terminal(ctx.RPAREN().getText());
		Sequence sequence = makeSequence(Arrays.asList(t1, o2, n, t3));
		return sequence;
	}

	@Override
	public Expression visitLexerRule(LexerRuleContext ctx) {
		Optional o1 = new Optional(new Terminal(ctx.DOC_COMMENT().getText()));
		Optional o2 = new Optional(new Terminal(ctx.FRAGMENT().getText()));
		Terminal t1 = new Terminal(ctx.TOKEN_REF().getText());
		Terminal t2 = new Terminal(ctx.COLON().getText());
		Nonterminal n = (Nonterminal) ctx.lexerRuleBlock().accept(this);
		Terminal t3 = new Terminal(ctx.SEMI().getText());
		Sequence sequence = makeSequence(Arrays.asList(o1, o2, t1, t2, n, t3));
		return sequence;
	}

	@Override
	public Expression visitLabeledLexerElement(LabeledLexerElementContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.id().accept(this);
		Terminal t1 = new Terminal(ctx.ASSIGN().getText());
		Terminal t2 = new Terminal(ctx.PLUS_ASSIGN().getText());
		Choice ch1 =  makeChoice(Arrays.asList(t1, t2));
		Nonterminal n2 = (Nonterminal) ctx.lexerAtom().accept(this);
		Nonterminal n3 = (Nonterminal) ctx.block().accept(this);
		Choice ch2 =  makeChoice(Arrays.asList(n2, n3));
		Sequence sequence = makeSequence(Arrays.asList(n1, ch1, ch2));
		return sequence;
	}

	@Override
	public Expression visitDelegateGrammars(DelegateGrammarsContext ctx) {
		Terminal t1 = new Terminal(ctx.IMPORT().getText());
		Nonterminal n1 = (Nonterminal) ctx.delegateGrammar(0).accept(this);
		Terminal t2 = new Terminal(ctx.COMMA(0).getText());
		Nonterminal n2 = (Nonterminal) ctx.delegateGrammar(1).accept(this);
		Star star = new Star(makeSequence(Arrays.asList(t2, n2)));
		Terminal t3 = new Terminal(ctx.SEMI().getText());
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, star, t3));
		return sequence;
	}

	@Override
	public Expression visitRuleref(RulerefContext ctx) {
		Terminal t1 = new Terminal(ctx.RULE_REF().getText());
		Optional o = new Optional(new Terminal(ctx.ARG_ACTION().getText()));
		Sequence sequence = makeSequence(Arrays.asList(t1, o));
		return sequence;
	}

	@Override
	public Expression visitBlockSuffix(BlockSuffixContext ctx) {
		return ctx.ebnfSuffix().accept(this);
	}

	@Override
	public Expression visitId(IdContext ctx) {
		Terminal t1 = new Terminal(ctx.RULE_REF().getText());
		Terminal t2 = new Terminal(ctx.TOKEN_REF().getText());
		Choice choice = makeChoice(Arrays.asList(t1, t2));
		return choice;
	}

	@Override
	public Expression visitElementOption(ElementOptionContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.id(0).accept(this);
		Terminal t1 = new Terminal(ctx.ASSIGN().getText());
		Nonterminal n2 =  (Nonterminal) ctx.id(1).accept(this);
		Terminal t2 = new Terminal(ctx.STRING_LITERAL().getText());
		Choice ch = makeChoice(Arrays.asList(n2, t2));
		Sequence seq = makeSequence(Arrays.asList(n1, t1, ch));
		Choice choice = makeChoice(Arrays.asList(n1, seq));
		return choice;
	}

	@Override
	public Expression visitExceptionHandler(ExceptionHandlerContext ctx) {
		Terminal t1 = new Terminal(ctx.CATCH().getText());
		Terminal t2 = new Terminal(ctx.ARG_ACTION().getText());
		Terminal t3 = new Terminal(ctx.ACTION().getText());
		Sequence sequence = makeSequence(Arrays.asList(t1, t2, t3));
		return sequence;
	}

	@Override
	public Expression visitTokensSpec(TokensSpecContext ctx) {
		Terminal t1 = new Terminal(ctx.TOKENS().getText());
		Nonterminal n1 = (Nonterminal) ctx.id(0).accept(this);
		Terminal t2 = new Terminal(ctx.COMMA(0).getText());
		Nonterminal n2 = (Nonterminal) ctx.id(1).accept(this);
		Star star = new Star(makeSequence(Arrays.asList(t2, n2)));
		Optional o = new Optional(new Terminal(ctx.COMMA(1).getText()));
		Terminal t3 = new Terminal(ctx.RBRACE().getText());
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, star, o, t3));
		return sequence;
	}

	@Override
	public Expression visitRuleReturns(RuleReturnsContext ctx) {
		Terminal t1 = new Terminal(ctx.RETURNS().getText());
		Terminal t2 = new Terminal(ctx.ARG_ACTION().getText());
		Sequence sequence = makeSequence(Arrays.asList(t1, t2));
		return sequence;
	}

	@Override
	public Expression visitOptionsSpec(OptionsSpecContext ctx) {
		Terminal t1 = new Terminal(ctx.OPTIONS().getText());
		Nonterminal n = (Nonterminal) ctx.option(0).accept(this);
		Terminal t2 = new Terminal(ctx.SEMI(0).getText());
		Star star = new Star(makeSequence(Arrays.asList(n, t2)));
		Terminal t3 = new Terminal(ctx.RBRACE().getText());
		Sequence sequence = makeSequence(Arrays.asList(t1, star, t3));
		return sequence;
	}

	@Override
	public Expression visitPrequelConstruct(PrequelConstructContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.optionsSpec().accept(this);
		Nonterminal n2 = (Nonterminal) ctx.delegateGrammars().accept(this);
		Nonterminal n3 = (Nonterminal) ctx.tokensSpec().accept(this);
		Nonterminal n4 = (Nonterminal) ctx.action().accept(this);
		Choice choice = makeChoice(Arrays.asList(n1, n2, n3, n4));
		return choice;
	}

	@Override
	public Expression visitAltList(AltListContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.alternative(0).accept(this);
		Terminal t = new Terminal(ctx.OR(0).getText());
		Nonterminal n2 = (Nonterminal) ctx.alternative(1).accept(this);
		Star star = new Star(makeSequence(Arrays.asList(t, n2)));
		Sequence sequence = makeSequence(Arrays.asList(n1, star));
		return sequence;
	}

	@Override
	public Expression visitRules(RulesContext ctx) {
		return new Plus(ctx.ruleSpec(0).accept(this));
	}

	@Override
	public Expression visitOptionValue(OptionValueContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.id(0).accept(this);
		Terminal t1 = new Terminal(ctx.DOT(0).getText());
		Nonterminal n2 = (Nonterminal) ctx.id(1).accept(this);
		Star star = new Star(makeSequence(Arrays.asList(t1, n2)));
		Sequence seq = makeSequence(Arrays.asList(n1, star));
		Terminal t2 = new Terminal(ctx.STRING_LITERAL().getText());
		Terminal t3 = new Terminal(ctx.ACTION().getText());
		Terminal t4 = new Terminal(ctx.INT().getText());
		Choice choice = makeChoice(Arrays.asList(seq, t2, t3, t4));
		return choice;
	}

	@Override
	public Expression visitLexerAlt(LexerAltContext ctx) {
		Optional o1 = (Optional) ctx.lexerElements().accept(this);
		Optional o2 = (Optional) ctx.lexerCommands().accept(this);
		Sequence sequence = makeSequence(Arrays.asList(o1, o2));
		return sequence;
	}

	@Override
	public Expression visitRuleModifiers(RuleModifiersContext ctx) {
		return new Plus(ctx.ruleModifier(0).accept(this));
	}

	@Override
	public Expression visitEbnf(EbnfContext ctx) {
		Nonterminal n1 = (Nonterminal) ctx.block().accept(this);
		Optional o = (Optional) ctx.blockSuffix().accept(this);
		Sequence sequence = makeSequence(Arrays.asList(n1, o));
		return sequence;
	}

	@Override
	public Expression visitLexerCommandExpr(LexerCommandExprContext ctx) {
		Nonterminal n = (Nonterminal) ctx.id().accept(this);
		Terminal t = new Terminal(ctx.INT().getText());
		Choice choice = makeChoice(Arrays.asList(n, t));
		return choice;
	}

}
