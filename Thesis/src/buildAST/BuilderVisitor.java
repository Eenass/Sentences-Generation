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

import java.util.ArrayList;
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
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.parserRuleSpec() != null){
			n1.setName(ctx.parserRuleSpec().getText());
		}
		if(ctx.lexerRule() != null){
			n2.setName(ctx.lexerRule().getText());
		}
		Choice  choice = makeChoice(Arrays.asList(n1, n2));
		return choice;
	}

	@Override
	public Choice visitAtom(AtomContext ctx) {
		Nonterminal n1, n2, n3, n4;
		n1 = n2 = n3 = n4 = new Nonterminal("");
		if(ctx.range() != null){
			n1.setName(ctx.range().getText());
		}
		if(ctx.terminal() != null){
			n2.setName(ctx.terminal().getText());
		}
		if(ctx.ruleref() != null){
			n3.setName(ctx.ruleref().getText());
		}
		if(ctx.notSet() != null){
			n4.setName(ctx.notSet().getText());
		}
		Terminal t = new Terminal("");
		if(ctx.DOT() != null){
			t.setTerminal(ctx.DOT().getText());
		}
		Optional o = new Optional(new Empty());
		if(ctx.elementOptions() != null){
			o = (Optional) ctx.elementOptions().accept(this);
		}
		Sequence seq = makeSequence(Arrays.asList(t, o));
		Choice choice = makeChoice(Arrays.asList(n1, n2, n3, n4, seq));
		return choice;
	}

	@Override
	public Expression visitRuleBlock(RuleBlockContext ctx) {
		if(ctx.ruleAltList() != null){
			return ctx.ruleAltList().accept(this);
		}
		return new Empty();
	}

	@Override
	public Expression visitNotSet(NotSetContext ctx) {
		Terminal t = new Terminal("");
		if(ctx.NOT() != null){
			t.setTerminal(ctx.NOT().getText());
		}
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.setElement() != null){
			n1.setName(ctx.setElement().getText());
		}
		if(ctx.blockSet() != null){
			n2.setName(ctx.blockSet().getText());
		}
		Sequence seq1 = makeSequence(Arrays.asList(t, n1));
		Sequence seq2 = makeSequence(Arrays.asList(t, n2));
		Choice choice = makeChoice(Arrays.asList(seq1, seq2));
		return choice;
	}

	@Override
	public Expression visitLexerCommands(LexerCommandsContext ctx) {
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		if(ctx.RARROW() != null){
			t1.setTerminal(ctx.RARROW().getText());
		}
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.lexerCommand(0) != null){
			n1.setName(ctx.lexerCommand(0).getText());
		}
		if(ctx.COMMA(0) != null){
			t2.setTerminal(ctx.COMMA(0).getText());
		}
		if(ctx.lexerCommand(1) != null){
			n2.setName(ctx.lexerCommand(1).getText());
		}
		Star star = new Star(makeSequence(Arrays.asList(t2, n2)));
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, star));
		return sequence;
	}

	@Override
	public Expression visitLexerAltList(LexerAltListContext ctx) {
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.lexerAlt(0) != null){
			n1.setName(ctx.lexerAlt(0).getText());
		}
		Terminal t = new Terminal("");
		if(ctx.OR(0) != null){
			t.setTerminal(ctx.OR(0).getText());
		}
		if(ctx.lexerAlt(1) != null){
			n2.setName(ctx.lexerAlt(1).getText());
		}
		Star star = new Star(makeSequence(Arrays.asList(t, n2)));
		Sequence sequence = makeSequence(Arrays.asList(n1, star));
		return sequence;
	}

	@Override
	public Expression visitRuleModifier(RuleModifierContext ctx) {
		Terminal t1, t2, t3, t4;
		t1 = t2 = t3 = t4 = new Terminal("");
		if(ctx.PUBLIC() != null){
			t1.setTerminal(ctx.PUBLIC().getText());
		}
		if(ctx.PRIVATE() != null){
			t2.setTerminal(ctx.PRIVATE().getText());
		}
		if(ctx.PROTECTED() != null){
			t3.setTerminal(ctx.PROTECTED().getText());
		}
		if(ctx.FRAGMENT() != null){
			t4.setTerminal(ctx.FRAGMENT().getText());
		}
		Choice choice = makeChoice(Arrays.asList(t1, t2, t3, t4));
		return choice;
	}

	@Override
	public Expression visitRuleAltList(RuleAltListContext ctx) {
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.labeledAlt(0) != null){
			n1.setName(ctx.labeledAlt(0).getText());
		}
		Terminal t = new Terminal("");
		if(ctx.OR(0) != null){
			t.setTerminal(ctx.OR(0).getText());
		}
		if(ctx.labeledAlt(1) != null){
			n2.setName(ctx.labeledAlt(1).getText());
		}
		Star star = new Star(makeSequence(Arrays.asList(t, n2)));
		Sequence sequence = makeSequence(Arrays.asList(n1, star));
		return sequence;
	}

	@Override
	public Expression visitTerminal(TerminalContext ctx) {
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		if(ctx.TOKEN_REF() != null){
			t1.setTerminal(ctx.TOKEN_REF().getText());
		}
		Optional o = new Optional(new Empty());
		if(ctx.elementOptions() != null){
			o.setExpr(ctx.elementOptions().accept(this));
		}
		if(ctx.STRING_LITERAL() != null){
			t2.setTerminal(ctx.STRING_LITERAL().getText());
		}
		Sequence seq1 = makeSequence(Arrays.asList(t1, o));
		Sequence seq2 = makeSequence(Arrays.asList(t2, o));
		Choice choice = makeChoice(Arrays.asList(seq1, seq2));
		return choice;
	}

	@Override
	public Expression visitLexerCommand(LexerCommandContext ctx) {
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		if(ctx.lexerCommandName() != null){
			n1.setName(ctx.lexerCommandName().getText());
		}
		if(ctx.LPAREN() != null){
			t1.setTerminal(ctx.LPAREN().getText());
		}
		if(ctx.lexerCommandExpr() != null){
			n2.setName(ctx.lexerCommandExpr().getText());
		}
		if(ctx.RPAREN() != null){
			t2.setTerminal(ctx.RPAREN().getText());
		}
		Sequence seq = makeSequence(Arrays.asList(n1, t1, n2, t2));
		Choice choice = makeChoice(Arrays.asList(seq, n1));
		return choice;
	}

	@Override
	public Expression visitThrowsSpec(ThrowsSpecContext ctx) {
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.THROWS() != null){
			t1.setTerminal(ctx.THROWS().getText());
		}
		if(ctx.id(0) != null){
			n1.setName(ctx.id(0).getText());
		}
		if(ctx.COMMA(0) != null){
			t2 = new Terminal(ctx.COMMA(0).getText());
		}
		if(ctx.id(1) != null){
			n2.setName(ctx.id(1).getText());
		}
		Star star = new Star(makeSequence(Arrays.asList(t2, n2)));
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, star));
		return sequence;
	}

	@Override
	public Expression visitLocalsSpec(LocalsSpecContext ctx) {
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		if(ctx.LOCALS() != null){
			t1.setTerminal(ctx.LOCALS().getText());
		}
		if(ctx.ARG_ACTION() != null){
			t2.setTerminal(ctx.ARG_ACTION().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, t2));
		return sequence;
	}

	@Override
	public Expression visitAction(ActionContext ctx) {
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		Nonterminal n1 , n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.AT() != null){
			t1.setTerminal(ctx.AT().getText());
		}
		if(ctx.actionScopeName() != null){
			n1.setName(ctx.actionScopeName().getText());
		}
		if(ctx.COLONCOLON() != null){
			t2.setTerminal(ctx.COLONCOLON().getText());
		}
		Optional o = new Optional(makeSequence(Arrays.asList(n1, t2)));
		if(ctx.id() != null){
			n2.setName(ctx.id().getText());
		}
		if(ctx.ACTION() != null){
			t3.setTerminal(ctx.ACTION().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, o, n2, t3));
		return sequence;
	}

	@Override
	public Expression visitModeSpec(ModeSpecContext ctx) {
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		if(ctx.MODE() != null){
			t1.setTerminal(ctx.MODE().getText());
		}
		Nonterminal n = new Nonterminal("");
		if(ctx.id() != null){
			n.setName(ctx.id().getText());
		}
		if(ctx.SEMI() != null){
			t2.setTerminal(ctx.SEMI().getText());
		}
		Plus p = new Plus(new Empty());
		if(ctx.ruleSpec(0) != null){
			p = (Plus) ctx.ruleSpec(0).accept(this);
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, n, t2, p));
		return sequence;		
	}

	@Override
	public Expression visitElements(ElementsContext ctx) {
		Plus p = new Plus(new Empty());
		if(ctx.element(0) != null){
			p = (Plus) ctx.element(0).accept(this);
		}
		return p;
	}

	@Override
	public Expression visitOption(OptionContext ctx) {
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.id() != null){
			n1.setName(ctx.id().getText());
		}
		Terminal t = new Terminal("");
		if(ctx.ASSIGN() != null){
			t.setTerminal(ctx.ASSIGN().getText());
		}
		if(ctx.optionValue() != null){
			n2.setName(ctx.optionValue().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(n1, t, n2));
		return sequence;
	}

	@Override
	public Expression visitElement(ElementContext ctx) {
		Nonterminal n1 , n2, n3, n4;
		n1 = n2 = n3 = n4 = new Nonterminal("");
		if(ctx.labeledElement() != null){
			n1.setName(ctx.labeledElement().getText());
		}
		if(ctx.ebnfSuffix() != null){
			n2.setName(ctx.ebnfSuffix().getText());
		}	
		Empty e = new Empty();
		Choice ch = makeChoice(Arrays.asList(n2, e));
		Sequence seq1 = makeSequence(Arrays.asList(n1, ch));
		if(ctx.atom() != null){
			n3.setName(ctx.atom().getText());
		}
		Sequence seq2 = makeSequence(Arrays.asList(n3, ch));
		if(ctx.ebnf() != null){
			n4.setName(ctx.ebnf().getText());
		}
		Terminal t = new Terminal("");
		if(ctx.ACTION() != null){
			t.setTerminal(ctx.ACTION().getText());
		}
		Optional o = new Optional(new Empty());
		if(ctx.QUESTION() != null){
			o.setExpr(new Terminal(ctx.QUESTION().getText()));
		}
		Sequence seq3 =  makeSequence(Arrays.asList(t, o));
		Choice choice = makeChoice(Arrays.asList(seq1, seq2, n4, seq3));
		return choice;
	}

	@Override
	public Expression visitElementOptions(ElementOptionsContext ctx) {
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.LT() != null){
			t1.setTerminal(ctx.LT().getText());
		}
		if(ctx.elementOption(0) != null){
			n1.setName(ctx.elementOption(0).getText());
		}
		if(ctx.COMMA(0) != null){
			t2.setTerminal(ctx.COMMA(0).getText());
		}
		if(ctx.elementOption(1) != null){
			n2.setName(ctx.elementOption(1).getText());
		}
		Star star = new Star(makeSequence(Arrays.asList(t2, n2)));
		if(ctx.GT() != null){
			t3.setTerminal(ctx.GT().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, star, t3));
		return sequence;
	}

	@Override
	public Expression visitLexerElement(LexerElementContext ctx) {
		Nonterminal n1, n2, n3;
		n1 = n2 = n3 = new Nonterminal("");
		if(ctx.labeledLexerElement() != null){
			n1.setName(ctx.labeledLexerElement().getText());
		}
		Optional o1, o2;
		o1 = o2 = new Optional(new Empty());
		if(ctx.ebnfSuffix() != null){
			o1 = (Optional) ctx.ebnfSuffix().accept(this);
		}
		Sequence seq1 = makeSequence(Arrays.asList(n1, o1));
		if(ctx.lexerAtom() != null){
			n2.setName(ctx.lexerAtom().getText());
		}
		Sequence seq2 = makeSequence(Arrays.asList(n2, o1));
		if(ctx.lexerBlock() != null){
			n3.setName(ctx.lexerBlock().getText());
		}
		Sequence seq3 = makeSequence(Arrays.asList(n3, o1));
		Terminal t = new Terminal("");
		if(ctx.ACTION() != null){
			t.setTerminal(ctx.ACTION().getText());
		}
		if(ctx.QUESTION() != null){
			o2.setExpr(new Terminal(ctx.QUESTION().getText()));
		}
		Sequence seq4 = makeSequence(Arrays.asList(t, o2));
		Choice choice = makeChoice(Arrays.asList(seq1, seq2, seq3, seq4));
		return choice;
	}

	@Override
	public Expression visitParserRuleSpec(ParserRuleSpecContext ctx) {
		Optional o1, o2, o3, o4, o5, o6;
		o1 = o2 = o3 = o4 = o5 = o6 =  new Optional(new Empty());
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.DOC_COMMENT() != null){
			o1 = new Optional(new Terminal(ctx.DOC_COMMENT().getText()));
		}	
		if(ctx.ruleModifiers() != null){
			o2 = (Optional) ctx.ruleModifiers().accept(this);
		}
		if(ctx.RULE_REF() != null){
			t1.setTerminal(ctx.RULE_REF().getText());
		}
		if(ctx.ARG_ACTION() != null){
			o3 = new Optional(new Terminal(ctx.ARG_ACTION().getText()));
		}
		if(ctx.ruleReturns() != null){
			o4= (Optional) ctx.ruleReturns().accept(this);
		}
		if(ctx.throwsSpec() != null){
			o5 = (Optional) ctx.throwsSpec().accept(this);
		}
		if(ctx.localsSpec() != null){
			o6 = (Optional) ctx.localsSpec().accept(this);
		}
		Star star = new Star(new Empty());
		if(!(ctx.rulePrequel().isEmpty())){
			star = (Star) ctx.rulePrequel(0).accept(this);
		}
		if(ctx.COLON() != null){
			t2.setTerminal(ctx.COLON().getText());
		}
		if(ctx.ruleBlock() != null){
			n1.setName(ctx.ruleBlock().getText());
		}
		if(ctx.SEMI() != null){
			t3.setTerminal(ctx.SEMI().getText());
		}
		if(ctx.exceptionGroup() != null){
			n2.setName(ctx.exceptionGroup().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(o1, o2, t1, o3, o4, o5, o6, star, t2, n1, t3, n2));
		return sequence;
	}

	@Override
	public Expression visitAlternative(AlternativeContext ctx) {
		Nonterminal n = new Nonterminal("");
		if(ctx.elements() != null){
			n.setName(ctx.elements().getText());
		}
		Empty e = new Empty();
		Choice choice = makeChoice(Arrays.asList(n, e));
		return choice;
	}

	@Override
	public Expression visitGrammarType(GrammarTypeContext ctx) {
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		if(ctx.LEXER() != null){
			t1.setTerminal(ctx.LEXER().getText());
		}
		if(ctx.GRAMMAR() != null){
			t2.setTerminal(ctx.GRAMMAR().getText());
		}
		Sequence seq1 = makeSequence(Arrays.asList(t1, t2));
		if(ctx.PARSER() != null){
			t3.setTerminal(ctx.PARSER().getText());
		}
		Sequence seq2 = makeSequence(Arrays.asList(t3, t2));
		Choice choice = makeChoice(Arrays.asList(seq1, seq2, t3));
		return choice;		
	}

	@Override
	public Expression visitRuleAction(RuleActionContext ctx) {
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		if(ctx.AT() != null){
			t1.setTerminal(ctx.AT().getText());
		}
		Nonterminal n = new Nonterminal("");
		if(ctx.id() != null){
			n.setName(ctx.id().getText());
		}
		if(ctx.ACTION() != null){
			t2.setTerminal(ctx.ACTION().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, n, t2));
		return sequence;
	}

	@Override
	public Expression visitEbnfSuffix(EbnfSuffixContext ctx) {
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		if(ctx.QUESTION(0) != null){
			t1.setTerminal(ctx.QUESTION(0).getText());
		}
		Optional o = new Optional(new Empty());
		if(ctx.QUESTION(1) != null){
			o.setExpr(new Terminal(ctx.QUESTION(1).getText()));
		}
		Sequence seq1 = makeSequence(Arrays.asList(t1, o));
		if(ctx.STAR() != null){
			t2.setTerminal(ctx.STAR().getText());
		}
		Sequence seq2 = makeSequence(Arrays.asList(t2, o));
		if(ctx.PLUS() != null){
			t3.setTerminal(ctx.PLUS().getText());
		}
		Sequence seq3 = makeSequence(Arrays.asList(t3, o));
		Choice choice = makeChoice(Arrays.asList(seq1, seq2, seq3));
		return choice;
	}

	@Override
	public Expression visitRulePrequel(RulePrequelContext ctx) {
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.optionsSpec() != null){
			n1.setName(ctx.optionsSpec().getText());
		}
		if(ctx.ruleAction() != null){
			n2.setName(ctx.ruleAction().getText());
		}
		Choice choice = makeChoice(Arrays.asList(n1, n2));
		return choice;
	}

	@Override
	public Expression visitExceptionGroup(ExceptionGroupContext ctx) {
		Star star = new Star(new Empty());
		if(ctx.exceptionHandler(0) != null){
			star = (Star) ctx.exceptionHandler(0).accept(this);
		}
		Optional o = new Optional(new Empty());
		if(ctx.finallyClause() != null){
			o = (Optional) ctx.finallyClause().accept(this);
		}
		Sequence sequence = makeSequence(Arrays.asList(star, o));
		return sequence;
	}

	@Override
	public Expression visitLexerBlock(LexerBlockContext ctx) {
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		if(ctx.LPAREN() != null){
			t1.setTerminal(ctx.LPAREN().getText());
		}
		Nonterminal n = new Nonterminal("");
		if(ctx.lexerAltList() != null){
			n.setName(ctx.lexerAltList().getText());
		}
		if(ctx.RPAREN() != null){
			t2.setTerminal(ctx.RPAREN().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, n, t2));
		return sequence;
	}

	@Override
	public Expression visitSetElement(SetElementContext ctx) {
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		if(ctx.TOKEN_REF() != null){
			t1.setTerminal(ctx.TOKEN_REF().getText());
		}
		if(ctx.STRING_LITERAL() != null){
			t2.setTerminal(ctx.STRING_LITERAL().getText());
		}
		Nonterminal n = new Nonterminal("");
		if(ctx.range() != null){
			n.setName(ctx.range().getText());
		}
		if(ctx.LEXER_CHAR_SET() != null){
			t3.setTerminal(ctx.LEXER_CHAR_SET().getText());
		}
		Choice choice = makeChoice(Arrays.asList(t1, t2, n, t3));
		return choice;
	}

	@Override
	public Expression visitBlockSet(BlockSetContext ctx) {
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.RPAREN() != null){
			t1.setTerminal(ctx.RPAREN().getText());
		}
		if(ctx.setElement(0) != null){
			n1.setName(ctx.setElement(0).getText());
		}
		if(ctx.OR(0) != null){
			t2.setTerminal(ctx.OR(0).getText());
		}
		if(ctx.setElement(1) != null){
			n2.setName(ctx.setElement(1).getText());
		}
		Star star = new Star(makeSequence(Arrays.asList(t2, n2)));
		if(ctx.RPAREN() != null){
			t3.setTerminal(ctx.RPAREN().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, star, t3));
		return sequence;
	}

	@Override
	public Expression visitActionScopeName(ActionScopeNameContext ctx) {
		Nonterminal n = new Nonterminal("");
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		if(ctx.id() != null){
			n.setName(ctx.id().getText());
		}
		if(ctx.LEXER() != null){
			t1.setTerminal(ctx.LEXER().getText());
		}
		if(ctx.PARSER() != null){
			t2.setTerminal(ctx.PARSER().getText());
		}
		Choice choice = makeChoice(Arrays.asList(n, t1, t2));
		return choice;
	}

	@Override
	public Expression visitLabeledAlt(LabeledAltContext ctx) {
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.alternative() != null){
			n1.setName(ctx.alternative().getText());
		}
		Terminal t = new Terminal("");
		if(ctx.POUND() != null){
			t.setTerminal(ctx.POUND().getText());
		}
		if(ctx.id() != null){
			n2.setName(ctx.id().getText());
		}
		Optional o = new Optional(makeSequence(Arrays.asList(t, n2)));
		Sequence sequence = makeSequence(Arrays.asList(n1, o));
		return sequence;
	}

	@Override
	public Expression visitLexerAtom(LexerAtomContext ctx) {
		Nonterminal n1, n2, n3;
		n1 = n2 = n3 = new Nonterminal("");
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		if(ctx.range() != null){
			n1.setName(ctx.range().getText());
		}
		if(ctx.terminal() != null){
			n2.setName(ctx.terminal().getText()); 
		}
		if(ctx.RULE_REF() != null){
			t1.setTerminal(ctx.RULE_REF().getText());
		}
		if(ctx.notSet() != null){
			n3.setName(ctx.notSet().getText());
		}
		if(ctx.LEXER_CHAR_SET() != null){
			t2.setTerminal(ctx.LEXER_CHAR_SET().getText());
		}
		if(ctx.DOT() != null){
			t3.setTerminal(ctx.DOT().getText());
		}
		Optional o = new Optional(new Empty());
		if(ctx.elementOptions() != null){
			o = (Optional) ctx.elementOptions().accept(this);
		}
		Sequence seq = makeSequence(Arrays.asList(t3, o));
		Choice choice = makeChoice(Arrays.asList(n1, n2, t1, n3, t2, seq));
		return choice;
	}

	@Override
	public Expression visitLabeledElement(LabeledElementContext ctx) {
		Nonterminal n1, n2, n3;
		n1 = n2 = n3 = new Nonterminal("");
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		if(ctx.id() != null){
			n1.setName(ctx.id().getText());
		}
		if(ctx.ASSIGN() != null){
			t1.setTerminal(ctx.ASSIGN().getText());
		}
		if(ctx.PLUS_ASSIGN() != null){
			t2.setTerminal(ctx.PLUS_ASSIGN().getText());
		}
		Choice ch1 = makeChoice(Arrays.asList(t1, t2));
		if(ctx.atom() != null){
			n2.setName(ctx.atom().getText());
		}
		if(ctx.block() != null){
			n3.setName(ctx.block().getText());
		}
		Choice ch2 = makeChoice(Arrays.asList(n2, n3));
		Sequence sequence = makeSequence(Arrays.asList(n1, ch1, ch2));
		return sequence;
	}

	@Override
	public Expression visitLexerRuleBlock(LexerRuleBlockContext ctx) {
		if(ctx.lexerAltList() != null){
			return ctx.lexerAltList().accept(this);
		}
		return new Empty();
	}

	@Override
	public Expression visitFinallyClause(FinallyClauseContext ctx) {
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		if(ctx.FINALLY() != null){
			t1.setTerminal(ctx.FINALLY().getText());
		}
		if(ctx.ACTION() != null){
			t2.setTerminal(ctx.ACTION().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, t2));
		return sequence;
	}

	@Override
	public Expression visitGrammarSpec(GrammarSpecContext ctx) {
		Nonterminal n1, n2, n3;
		n1 = n2 = n3 = new Nonterminal("");
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		Star s1, s2;
		s1 = s2 = new Star(new Empty());
		Optional o = new Optional(new Empty());
		if(ctx.DOC_COMMENT() != null){
			o.setExpr(new Terminal(ctx.DOC_COMMENT().getText()));
		}
		if(ctx.grammarType() != null){
			n1.setName(ctx.grammarType().getText());
		}
		if(ctx.id() != null){
			n2.setName(ctx.id().getText());
		}
		if(ctx.SEMI() != null){
			t1.setTerminal(ctx.SEMI().getText());
		}
		if(!(ctx.prequelConstruct().isEmpty())){
			s1 = (Star) ctx.prequelConstruct(0).accept(this);
		}	
		if(ctx.rules() != null){
			n3.setName(ctx.rules().getText());
		}
		if(!(ctx.modeSpec().isEmpty())){
			s2 = (Star) ctx.modeSpec(0).accept(this);
		}
		if(ctx.EOF() != null){
			t2.setTerminal(ctx.EOF().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(o, n1, n2, t1, s1, n3, s2, t2));
		return sequence;
	}

	@Override
	public Expression visitDelegateGrammar(DelegateGrammarContext ctx) {
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.id(0) != null){
			n1.setName(ctx.id(0).getText());
		}
		Terminal t = new Terminal("");
		if(ctx.ASSIGN() != null){
			t.setTerminal(ctx.ASSIGN().getText());
		}
		if(ctx.id(1) != null){
			n2.setName(ctx.id(1).getText());
		}
		Sequence seq = makeSequence(Arrays.asList(n1, t, n2));
		Choice choice = makeChoice(Arrays.asList(seq, n1));
		return choice;
	}

	@Override
	public Expression visitLexerElements(LexerElementsContext ctx) {
		Plus p = new Plus(new Empty());
		if(ctx.lexerElement(0) != null){
			p = (Plus) ctx.lexerElement(0).accept(this);
		}
		return p;
	}

	@Override
	public Expression visitRange(RangeContext ctx) {
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		if(ctx.STRING_LITERAL(0) != null){
			t1.setTerminal(ctx.STRING_LITERAL(0).getText());
		}
		if(ctx.RANGE() != null){
			t2.setTerminal(ctx.RANGE().getText());
		}
		if(ctx.STRING_LITERAL(1) != null){
			t3.setTerminal(ctx.STRING_LITERAL(1).getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, t2, t3));
		return sequence;
	}

	@Override
	public Expression visitLexerCommandName(LexerCommandNameContext ctx) {
		Nonterminal n = new Nonterminal("");
		if(ctx.id() != null){
			n.setName(ctx.id().getText());
		}
		Terminal t = new Terminal("");
		if(ctx.MODE() != null){
			t.setTerminal(ctx.MODE().getText());
		}
		Choice choice = makeChoice(Arrays.asList(n, t));
		return choice;
	}

	@Override
	public Expression visitBlock(BlockContext ctx) {
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		if(ctx.LPAREN() != null){
			t1.setTerminal(ctx.LPAREN().getText());
		}
		Optional o1, o2;
		o1 = o2 = new Optional(new Empty());
		if(ctx.optionsSpec() != null){
			o1.setExpr(ctx.optionsSpec().accept(this));
		}
		Star star = new Star(new Empty());
		if(ctx.ruleAction(0) != null){
			star = (Star) ctx.ruleAction(0).accept(this);
		}
		if(ctx.COLON() != null){
			t2.setTerminal(ctx.COLON().getText());
		}
		o2.setExpr(makeSequence(Arrays.asList(o1, star, t2)));
		Nonterminal n = new Nonterminal("");
		if(ctx.altList() != null){
			n.setName(ctx.altList().getText());
		}
		if(ctx.RPAREN() != null){
			t3.setTerminal(ctx.RPAREN().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, o2, n, t3));
		return sequence;
	}

	@Override
	public Expression visitLexerRule(LexerRuleContext ctx) {
		Optional o1, o2;
		o1 = o2 = new Optional(new Empty());
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		if(ctx.DOC_COMMENT() != null){
			o1.setExpr(new Terminal(ctx.DOC_COMMENT().getText()));
		}
		if(ctx.FRAGMENT() != null){
			o2.setExpr(new Terminal(ctx.FRAGMENT().getText()));
		}
		if(ctx.TOKEN_REF() != null){
			t1.setTerminal(ctx.TOKEN_REF().getText());
		}
		if(ctx.COLON() != null){
			t2.setTerminal(ctx.COLON().getText());
		}
		Nonterminal n = new Nonterminal("");
		if(ctx.lexerRuleBlock() != null){
			n.setName(ctx.lexerRuleBlock().getText());
		}
		if(ctx.SEMI() != null){
			t3.setTerminal(ctx.SEMI().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(o1, o2, t1, t2, n, t3));
		return sequence;
	}

	@Override
	public Expression visitLabeledLexerElement(LabeledLexerElementContext ctx) {
		Nonterminal n1, n2, n3;
		n1 = n2 = n3 = new Nonterminal("");
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		if(ctx.id() != null){
			n1.setName(ctx.id().getText());
		}
		if(ctx.ASSIGN() != null){
			t1.setTerminal(ctx.ASSIGN().getText());
		}
		if(ctx.PLUS_ASSIGN() != null){
			t2.setTerminal(ctx.PLUS_ASSIGN().getText());
		}
		Choice ch1 =  makeChoice(Arrays.asList(t1, t2));
		if(ctx.lexerAtom() != null){
			n2.setName(ctx.lexerAtom().getText());
		}
		if(ctx.block() != null){
			n3.setName(ctx.block().getText());
		}
		Choice ch2 =  makeChoice(Arrays.asList(n2, n3));
		Sequence sequence = makeSequence(Arrays.asList(n1, ch1, ch2));
		return sequence;
	}

	@Override
	public Expression visitDelegateGrammars(DelegateGrammarsContext ctx) {
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.IMPORT() != null){
			t1.setTerminal(ctx.IMPORT().getText());
		}
		if(ctx.delegateGrammar(0) != null){
			n1.setName(ctx.delegateGrammar(0).getText());
		}
		if(ctx.COMMA(0) != null){
			t2.setTerminal(ctx.COMMA(0).getText());
		}
		if(ctx.delegateGrammar(1) != null){
			n2.setName(ctx.delegateGrammar(1).getText());
		}
		Star star = new Star(makeSequence(Arrays.asList(t2, n2)));
		if(ctx.SEMI() != null){
			t3.setTerminal(ctx.SEMI().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, star, t3));
		return sequence;
	}

	@Override
	public Expression visitRuleref(RulerefContext ctx) {
		Terminal t = new Terminal("");
		if(ctx.RULE_REF() != null){
			t.setTerminal(ctx.RULE_REF().getText());
		}
		Optional o = new Optional(new Empty());
		if(ctx.ARG_ACTION() != null){
			o.setExpr(new Terminal(ctx.ARG_ACTION().getText()));
		}
		Sequence sequence = makeSequence(Arrays.asList(t, o));
		return sequence;
	}

	@Override
	public Expression visitBlockSuffix(BlockSuffixContext ctx) {
		if(ctx.ebnfSuffix() != null){
			return ctx.ebnfSuffix().accept(this);
		}
		return new Empty();
	}

	@Override
	public Expression visitId(IdContext ctx) {
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		if(ctx.RULE_REF() != null){
			t1.setTerminal(ctx.RULE_REF().getText());
		}
		if(ctx.TOKEN_REF() != null){
			t2.setTerminal(ctx.TOKEN_REF().getText());
		}
		Choice choice = makeChoice(Arrays.asList(t1, t2));
		return choice;
	}

	@Override
	public Expression visitElementOption(ElementOptionContext ctx) {
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		if(ctx.id(0) != null){
			n1.setName(ctx.id(0).getText());
		}
		if(ctx.ASSIGN() != null){
			t1.setTerminal(ctx.ASSIGN().getText());
		}
		if(ctx.id(1) != null){
			n2.setName(ctx.id(1).getText());
		}
		if(ctx.STRING_LITERAL() != null){
			t2.setTerminal(ctx.STRING_LITERAL().getText());
		}
		Choice ch = makeChoice(Arrays.asList(n2, t2));
		Sequence seq = makeSequence(Arrays.asList(n1, t1, ch));
		Choice choice = makeChoice(Arrays.asList(n1, seq));
		return choice;
	}

	@Override
	public Expression visitExceptionHandler(ExceptionHandlerContext ctx) {
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		if(ctx.CATCH() != null){
			t1.setTerminal(ctx.CATCH().getText());
		}
		if(ctx.ARG_ACTION() != null){
			t2.setTerminal(ctx.ARG_ACTION().getText());
		}
		if(ctx.ACTION() != null){
			t3.setTerminal(ctx.ACTION().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, t2, t3));
		return sequence;
	}

	@Override
	public Expression visitTokensSpec(TokensSpecContext ctx) {
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.TOKENS() != null){
			t1.setTerminal(ctx.TOKENS().getText());
		}
		if(ctx.id(0) != null){
			n1.setName(ctx.id(0).getText());
		}
		if(ctx.COMMA(0) != null){
			t2.setTerminal(ctx.COMMA(0).getText());
		}
		if(ctx.id(1) != null){
			n2.setName(ctx.id(1).getText());
		}
		Star star = new Star(makeSequence(Arrays.asList(t2, n2)));
		Optional o = new Optional(new Empty());
		if(ctx.COMMA(1) != null){
			o.setExpr(new Terminal(ctx.COMMA(1).getText()));
		}
		if(ctx.RBRACE() != null){
			t3.setTerminal(ctx.RBRACE().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, n1, star, o, t3));
		return sequence;
	}

	@Override
	public Expression visitRuleReturns(RuleReturnsContext ctx) {		
		Terminal t1, t2;
		t1 = t2 = new Terminal("");
		if(ctx.RETURNS() != null){
			t1.setTerminal(ctx.RETURNS().getText());
		}
		if(ctx.ARG_ACTION() != null){
			t2.setTerminal(ctx.ARG_ACTION().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, t2));
		return sequence;
	}

	@Override
	public Expression visitOptionsSpec(OptionsSpecContext ctx) {
		Terminal t1, t2, t3;
		t1 = t2 = t3 = new Terminal("");
		if(ctx.OPTIONS() != null){
			t1.setTerminal(ctx.OPTIONS().getText());
		}
		Nonterminal n = new Nonterminal("");
		if(ctx.option(0) != null){
			n.setName(ctx.option(0).getText());
		}
		if(ctx.SEMI(0) != null){
			t2.setTerminal(ctx.SEMI(0).getText());
		}
		Star star = new Star(makeSequence(Arrays.asList(n, t2)));
		if(ctx.RBRACE() != null){
			t3.setTerminal(ctx.RBRACE().getText());
		}
		Sequence sequence = makeSequence(Arrays.asList(t1, star, t3));
		return sequence;
	}

	@Override
	public Expression visitPrequelConstruct(PrequelConstructContext ctx) {
		Nonterminal n1, n2, n3, n4;
		n1 = n2 = n3 = n4 = new Nonterminal("");
		if(ctx.optionsSpec() != null){
			n1.setName(ctx.optionsSpec().getText());
		}
		if(ctx.delegateGrammars() != null){ 
			n2.setName(ctx.delegateGrammars().getText());		
		}
		if(ctx.tokensSpec() != null){
			n3.setName(ctx.tokensSpec().getText());
		}
		if(ctx.action() != null){
			n4.setName(ctx.action().getText());
		}
		Choice choice = makeChoice(Arrays.asList(n1, n2, n3, n4));
		return choice;
	}

	@Override
	public Expression visitAltList(AltListContext ctx) {
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		if(ctx.alternative(0) != null){
			n1.setName(ctx.alternative(0).getText());
		}
		Terminal t = new Terminal("");
		if(ctx.OR(0) != null){
			t.setTerminal(ctx.OR(0).getText());
		}
		if(ctx.alternative(1) != null){
			n2.setName(ctx.alternative(1).getText());
		}
		Star star = new Star(makeSequence(Arrays.asList(t, n2)));
		Sequence sequence = makeSequence(Arrays.asList(n1, star));
		return sequence;
	}

	@Override
	public Expression visitRules(RulesContext ctx) {
		Plus p = new Plus(new Empty());
		if(ctx.ruleSpec(0) != null){
			p = (Plus) ctx.ruleSpec(0).accept(this);
		}
		return p;
	}

	@Override
	public Expression visitOptionValue(OptionValueContext ctx) {
		Nonterminal n1, n2;
		n1 = n2 = new Nonterminal("");
		Terminal t1, t2, t3, t4;
		t1 = t2 = t3 = t4 = new Terminal("");
		if(ctx.id(0) != null){
			n1.setName(ctx.id(0).getText());
		}
		if(ctx.DOT(0) != null){
			t1.setTerminal(ctx.DOT(0).getText());
		}
		if(ctx.id(1) != null){
			n2.setName(ctx.id(1).getText());
		}
		Star star = new Star(makeSequence(Arrays.asList(t1, n2)));
		Sequence seq = makeSequence(Arrays.asList(n1, star));
		if(ctx.STRING_LITERAL() != null){
			t2.setTerminal(ctx.STRING_LITERAL().getText());
		}
		if(ctx.ACTION() != null){
			t3.setTerminal(ctx.ACTION().getText());
		}
		if(ctx.INT() != null){
			t4.setTerminal(ctx.INT().getText());
		}
		Choice choice = makeChoice(Arrays.asList(seq, t2, t3, t4));
		return choice;
	}

	@Override
	public Expression visitLexerAlt(LexerAltContext ctx) {
		Optional o1, o2;
		o1 = o2 = new Optional(new Empty());
		if(ctx.lexerElements() != null){
			o1.setExpr(ctx.lexerElements().accept(this));
		}
		if(ctx.lexerCommands() != null){
			o2.setExpr(ctx.lexerCommands().accept(this));
		}
		Sequence sequence = makeSequence(Arrays.asList(o1, o2));
		return sequence;
	}

	@Override
	public Expression visitRuleModifiers(RuleModifiersContext ctx) {
		Plus p = new Plus(new Empty());
		if(ctx.ruleModifier(0) != null){
			p = (Plus) ctx.ruleModifier(0).accept(this);
		}
		return p;
	}

	@Override
	public Expression visitEbnf(EbnfContext ctx) {
		Nonterminal n = new Nonterminal("");
		if(ctx.block() != null){
			n.setName(ctx.block().getText());
		}
		Optional o = new Optional(new Empty());
		if(ctx.blockSuffix() != null){
			o.setExpr(ctx.blockSuffix().accept(this));
		}
		Sequence sequence = makeSequence(Arrays.asList(n, o));
		return sequence;
	}

	@Override
	public Expression visitLexerCommandExpr(LexerCommandExprContext ctx) {
		Nonterminal n = new Nonterminal("");
		if(ctx.id() != null){
			n.setName(ctx.id().getText());
		}
		Terminal t = new Terminal("");
		if(ctx.INT() != null){
			t.setTerminal(ctx.INT().getText());
		}
		Choice choice = makeChoice(Arrays.asList(n, t));
		return choice;
	}

}
