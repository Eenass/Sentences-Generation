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
import gtojava.ASTNode;
import gtojava.Choice;
import gtojava.Expression;

public class BuilderVisitor extends ANTLRv4ParserBaseVisitor<ASTNode>{

	@Override
	public Choice visitRuleSpec(RuleSpecContext ctx) {
		Choice choice = new Choice();
		for(int i = 0; i < ctx.getChildCount(); i++){
			choice.addExpr((Expression) ctx.getChild(i).accept(this));
		}
		return choice;
	}

	@Override
	public ASTNode visitAtom(AtomContext ctx) {
		Choice choice = new Choice();
		for(int i = 0; i < ctx.getChildCount(); i++){
			choice.addExpr((Expression) ctx.getChild(i).accept(this));
		}
		return choice;
	}

	@Override
	public ASTNode visitRuleBlock(RuleBlockContext ctx) {
		return ctx.ruleAltList().accept(this);
	}

	@Override
	public ASTNode visitNotSet(NotSetContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNotSet(ctx);
	}

	@Override
	public ASTNode visitLexerCommands(LexerCommandsContext ctx) {
		String str = ctx.RARROW().getText();
		return super.visitLexerCommands(ctx);
	}

	@Override
	public ASTNode visitLexerAltList(LexerAltListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLexerAltList(ctx);
	}

	@Override
	public ASTNode visitRuleModifier(RuleModifierContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRuleModifier(ctx);
	}

	@Override
	public ASTNode visitRuleAltList(RuleAltListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRuleAltList(ctx);
	}

	@Override
	public ASTNode visitTerminal(TerminalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTerminal(ctx);
	}

	@Override
	public ASTNode visitLexerCommand(LexerCommandContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLexerCommand(ctx);
	}

	@Override
	public ASTNode visitThrowsSpec(ThrowsSpecContext ctx) {
		// TODO Auto-generated method stub
		return super.visitThrowsSpec(ctx);
	}

	@Override
	public ASTNode visitLocalsSpec(LocalsSpecContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLocalsSpec(ctx);
	}

	@Override
	public ASTNode visitAction(ActionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAction(ctx);
	}

	@Override
	public ASTNode visitModeSpec(ModeSpecContext ctx) {
		// TODO Auto-generated method stub
		return super.visitModeSpec(ctx);
	}

	@Override
	public ASTNode visitElements(ElementsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElements(ctx);
	}

	@Override
	public ASTNode visitOption(OptionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOption(ctx);
	}

	@Override
	public ASTNode visitElement(ElementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElement(ctx);
	}

	@Override
	public ASTNode visitElementOptions(ElementOptionsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElementOptions(ctx);
	}

	@Override
	public ASTNode visitLexerElement(LexerElementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLexerElement(ctx);
	}

	@Override
	public ASTNode visitParserRuleSpec(ParserRuleSpecContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParserRuleSpec(ctx);
	}

	@Override
	public ASTNode visitAlternative(AlternativeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAlternative(ctx);
	}

	@Override
	public ASTNode visitGrammarType(GrammarTypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitGrammarType(ctx);
	}

	@Override
	public ASTNode visitRuleAction(RuleActionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRuleAction(ctx);
	}

	@Override
	public ASTNode visitEbnfSuffix(EbnfSuffixContext ctx) {
		// TODO Auto-generated method stub
		return super.visitEbnfSuffix(ctx);
	}

	@Override
	public ASTNode visitRulePrequel(RulePrequelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRulePrequel(ctx);
	}

	@Override
	public ASTNode visitExceptionGroup(ExceptionGroupContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExceptionGroup(ctx);
	}

	@Override
	public ASTNode visitLexerBlock(LexerBlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLexerBlock(ctx);
	}

	@Override
	public ASTNode visitSetElement(SetElementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSetElement(ctx);
	}

	@Override
	public ASTNode visitBlockSet(BlockSetContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlockSet(ctx);
	}

	@Override
	public ASTNode visitActionScopeName(ActionScopeNameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitActionScopeName(ctx);
	}

	@Override
	public ASTNode visitLabeledAlt(LabeledAltContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLabeledAlt(ctx);
	}

	@Override
	public ASTNode visitLexerAtom(LexerAtomContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLexerAtom(ctx);
	}

	@Override
	public ASTNode visitLabeledElement(LabeledElementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLabeledElement(ctx);
	}

	@Override
	public ASTNode visitLexerRuleBlock(LexerRuleBlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLexerRuleBlock(ctx);
	}

	@Override
	public ASTNode visitFinallyClause(FinallyClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFinallyClause(ctx);
	}

	@Override
	public ASTNode visitGrammarSpec(GrammarSpecContext ctx) {
		// TODO Auto-generated method stub
		return super.visitGrammarSpec(ctx);
	}

	@Override
	public ASTNode visitDelegateGrammar(DelegateGrammarContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDelegateGrammar(ctx);
	}

	@Override
	public ASTNode visitLexerElements(LexerElementsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLexerElements(ctx);
	}

	@Override
	public ASTNode visitRange(RangeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRange(ctx);
	}

	@Override
	public ASTNode visitLexerCommandName(LexerCommandNameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLexerCommandName(ctx);
	}

	@Override
	public ASTNode visitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlock(ctx);
	}

	@Override
	public ASTNode visitLexerRule(LexerRuleContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLexerRule(ctx);
	}

	@Override
	public ASTNode visitLabeledLexerElement(LabeledLexerElementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLabeledLexerElement(ctx);
	}

	@Override
	public ASTNode visitDelegateGrammars(DelegateGrammarsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDelegateGrammars(ctx);
	}

	@Override
	public ASTNode visitRuleref(RulerefContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRuleref(ctx);
	}

	@Override
	public ASTNode visitBlockSuffix(BlockSuffixContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlockSuffix(ctx);
	}

	@Override
	public ASTNode visitId(IdContext ctx) {
		// TODO Auto-generated method stub
		return super.visitId(ctx);
	}

	@Override
	public ASTNode visitElementOption(ElementOptionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElementOption(ctx);
	}

	@Override
	public ASTNode visitExceptionHandler(ExceptionHandlerContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExceptionHandler(ctx);
	}

	@Override
	public ASTNode visitTokensSpec(TokensSpecContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTokensSpec(ctx);
	}

	@Override
	public ASTNode visitRuleReturns(RuleReturnsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRuleReturns(ctx);
	}

	@Override
	public ASTNode visitOptionsSpec(OptionsSpecContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOptionsSpec(ctx);
	}

	@Override
	public ASTNode visitPrequelConstruct(PrequelConstructContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrequelConstruct(ctx);
	}

	@Override
	public ASTNode visitAltList(AltListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAltList(ctx);
	}

	@Override
	public ASTNode visitRules(RulesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRules(ctx);
	}

	@Override
	public ASTNode visitOptionValue(OptionValueContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOptionValue(ctx);
	}

	@Override
	public ASTNode visitLexerAlt(LexerAltContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLexerAlt(ctx);
	}

	@Override
	public ASTNode visitRuleModifiers(RuleModifiersContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRuleModifiers(ctx);
	}

	@Override
	public ASTNode visitEbnf(EbnfContext ctx) {
		// TODO Auto-generated method stub
		return super.visitEbnf(ctx);
	}

	@Override
	public ASTNode visitLexerCommandExpr(LexerCommandExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLexerCommandExpr(ctx);
	}

	public BuilderVisitor() {
		// TODO Auto-generated constructor stub
	}

}
