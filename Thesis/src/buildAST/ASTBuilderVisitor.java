package buildAST;

import grammarParser.ANTLRv4Parser.AltListContext;
import grammarParser.ANTLRv4Parser.AlternativeContext;
import grammarParser.ANTLRv4Parser.AtomContext;
import grammarParser.ANTLRv4Parser.BlockContext;
import grammarParser.ANTLRv4Parser.BlockSetContext;
import grammarParser.ANTLRv4Parser.BlockSuffixContext;
import grammarParser.ANTLRv4Parser.EbnfContext;
import grammarParser.ANTLRv4Parser.EbnfSuffixContext;
import grammarParser.ANTLRv4Parser.ElementContext;
import grammarParser.ANTLRv4Parser.ElementsContext;
import grammarParser.ANTLRv4Parser.GrammarSpecContext;
import grammarParser.ANTLRv4Parser.IdContext;
import grammarParser.ANTLRv4Parser.LabeledAltContext;
import grammarParser.ANTLRv4Parser.LabeledElementContext;
import grammarParser.ANTLRv4Parser.LabeledLexerElementContext;
import grammarParser.ANTLRv4Parser.LexerAltContext;
import grammarParser.ANTLRv4Parser.LexerAltListContext;
import grammarParser.ANTLRv4Parser.LexerAtomContext;
import grammarParser.ANTLRv4Parser.LexerBlockContext;
import grammarParser.ANTLRv4Parser.LexerElementContext;
import grammarParser.ANTLRv4Parser.LexerElementsContext;
import grammarParser.ANTLRv4Parser.LexerRuleBlockContext;
import grammarParser.ANTLRv4Parser.LexerRuleContext;
import grammarParser.ANTLRv4Parser.NotSetContext;
import grammarParser.ANTLRv4Parser.ParserRuleSpecContext;
import grammarParser.ANTLRv4Parser.RangeContext;
import grammarParser.ANTLRv4Parser.RuleAltListContext;
import grammarParser.ANTLRv4Parser.RuleBlockContext;
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
import gtojava.Terminal;

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
	

	@Override
	public Expression visitGrammarSpec(GrammarSpecContext ctx) {
		Sequence sequence = new Sequence();
		if(ctx.rules() != null){
			for(int i = 0; i < ctx.rules().getChildCount(); i++){
				sequence.addExpr(ctx.rules().getChild(i).accept(this));
			}
		}
		return sequence;
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
		Nonterminal n = new Nonterminal(ctx.RULE_REF().getText());
		Expression exp = ctx.ruleBlock().accept(this);
		grammar.addProductionRule(new ProductionRule(n, exp));
		return exp;
	}
	
	@Override
	public Expression visitRuleBlock(RuleBlockContext ctx) {
		return ctx.ruleAltList().accept(this);
	}
	
	@Override
	public Expression visitRuleAltList(RuleAltListContext ctx) {
		Choice choice = new Choice();
		Expression result = new Empty();
		if(ctx.labeledAlt().size() > 1){
			for(int i = 0; i <ctx.labeledAlt().size(); i++){
				choice.addExpr(ctx.labeledAlt(i).accept(this));
			}	
			result = choice;
		}
		else{
			result = ctx.labeledAlt(0).accept(this);
		}
		return result;
	}
	
	@Override
	public Expression visitLabeledAlt(LabeledAltContext ctx) {
		return ctx.alternative().accept(this);		
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
		Sequence sequence = new Sequence();
		Expression result = new Empty();
		if(ctx.element().size() > 1){
			for(int i = 0; i < ctx.element().size(); i++){
				sequence.addExpr(ctx.element(i).accept(this));
			}
			result = sequence;
		}
		else{
			result = ctx.element(0).accept(this);
		}
		return result;
	}

	@Override
	public Expression visitElement(ElementContext ctx) {
		Expression result = new Empty();
		if(ctx.labeledElement() != null){
			if(ctx.ebnfSuffix() != null){
				Expression temp = ctx.ebnfSuffix().accept(this);
				if(temp.getClass() == (new Optional().getClass())){
					result = new Optional(ctx.labeledElement().accept(this));
				}
				else if(temp.getClass() == (new Star().getClass())){
					result = new Star(ctx.labeledElement().accept(this));
				}
				else if(temp.getClass() == (new Plus().getClass())){
					result = new Plus(ctx.labeledElement().accept(this));
				}
			}
			else{
				result = ctx.labeledElement().accept(this);
			}
		}
		else if(ctx.atom() != null){
			if(ctx.ebnfSuffix() != null){
				Expression temp = ctx.ebnfSuffix().accept(this);
				if(temp.getClass() == (new Optional().getClass())){
					result = new Optional(ctx.atom().accept(this));
				}
				else if(temp.getClass() == (new Star().getClass())){
					result = new Star(ctx.atom().accept(this));
				}
				else if(temp.getClass() == (new Plus().getClass())){
					result = new Plus(ctx.atom().accept(this));
				}
			}
			else{
				result = ctx.atom().accept(this);
			}
		}
		else if(ctx.ebnf() != null){
			result = ctx.ebnf().accept(this);
		}
		else if(ctx.ACTION() != null){
			Terminal t = new Terminal(ctx.ACTION().getText());
			grammar.addTerminal(t);
			result = new Optional(t);
		}
		return result;
	}

	@Override
	public Expression visitAtom(AtomContext ctx) {
		Expression result = new Empty();
		if(ctx.range() != null){
			result = ctx.range().accept(this);
		}
		else if(ctx.terminal() != null){
			result = ctx.terminal().accept(this);
		}
		else if(ctx.ruleref() != null){
			result = ctx.ruleref().accept(this);
		}
		else if(ctx.notSet() != null){
			result = ctx.notSet().accept(this);
		}
		else if(ctx.DOT() != null){
			result = new Terminal(ctx.DOT().getText());
		}
		return result;
	}
	
	@Override
	public Expression visitEbnf(EbnfContext ctx) {
		Expression result = new Empty();
		if(ctx.block() != null){
			if(ctx.blockSuffix() != null){
				Expression temp = ctx.blockSuffix().accept(this);
				if(temp.getClass() == (new Optional().getClass())){
					result = new Optional(ctx.block().accept(this));
				}
				else if(temp.getClass() == (new Star().getClass())){
					result = new Star(ctx.block().accept(this));
				}
				else if(temp.getClass() == (new Plus().getClass())){
					result = new Plus(ctx.block().accept(this));
				}
			}
			else{
				result = ctx.block().accept(this);
			}
		}
		return result;
	}
	
	@Override
	public Expression visitBlockSuffix(BlockSuffixContext ctx) {
		return ctx.ebnfSuffix().accept(this);
	}
	@Override
	public Expression visitRange(RangeContext ctx) {
		Sequence sequence = new Sequence();
		Terminal t1 = new Terminal(ctx.STRING_LITERAL(0).getText());
		grammar.addTerminal(t1);
		sequence.addExpr(t1);
		sequence.addExpr(new Terminal(ctx.RANGE().getText())); 
		Terminal t2 = new Terminal(ctx.STRING_LITERAL(1).getText());
		grammar.addTerminal(t2);
		sequence.addExpr(t2);
		return sequence;
	}
	
	@Override
	public Expression visitTerminal(TerminalContext ctx) {
		Expression result = new Empty();
		if(ctx.TOKEN_REF() != null){
			if(ctx.TOKEN_REF().getText().equals("EOF")){
				result = new Terminal("EOF");
			}
			else{
				result = new Nonterminal(ctx.TOKEN_REF().getText());
			}	
		}
		else if(ctx.STRING_LITERAL() != null){
			Terminal t = new Terminal(ctx.STRING_LITERAL().getText());
			grammar.addTerminal(t);
			result = t;
		}
		return result;
	}
	

	@Override
	public Expression visitRuleref(RulerefContext ctx) {
		return new Nonterminal(ctx.RULE_REF().getText());
	}

	@Override
	public Expression visitEbnfSuffix(EbnfSuffixContext ctx) {
		Expression result = new Empty();
		if(ctx.QUESTION(0) != null){
			result = new Optional();
		}
		else if(ctx.STAR() != null){
			result = new Star();
		}
		else if(ctx.PLUS() != null){
			result = new Plus();
		}
		return result;
	}

	@Override
	public Expression visitNotSet(NotSetContext ctx) {
		Sequence sequence = new Sequence();
		Terminal t = new Terminal(ctx.NOT().getText());
		grammar.addTerminal(t);
		if(ctx.setElement() != null){
			sequence.addExpr(t);
			sequence.addExpr(ctx.setElement().accept(this));
		}
		else if(ctx.blockSet() != null){
			sequence.addExpr(t);
			sequence.addExpr(ctx.blockSet().accept(this));
		}
		return sequence;
	}
	
	@Override
	public Expression visitSetElement(SetElementContext ctx) {
		Expression result = new Empty();
		if(ctx.TOKEN_REF() != null){
			result = new Nonterminal(ctx.TOKEN_REF().getText());
		}
		if(ctx.STRING_LITERAL() != null){
			Terminal t = new Terminal(ctx.STRING_LITERAL().getText());
			grammar.addTerminal(t);
			result = t;
		}
		else if(ctx.range() != null){
			result = ctx.range().accept(this);
		}
		else if(ctx.LEXER_CHAR_SET() != null){
			Terminal t = new Terminal(ctx.LEXER_CHAR_SET().getText());
			grammar.addTerminal(t);
			result = t;
		}
		return result;
	}

	@Override
	public Expression visitBlockSet(BlockSetContext ctx) {
		Choice choice = new Choice();
		Sequence sequence = new Sequence();
		Terminal t1 = new Terminal(ctx.LPAREN().getText());
		grammar.addTerminal(t1);
		sequence.addExpr(t1);
		if(ctx.setElement().size() > 1){
			for(int i = 0; i < ctx.setElement().size(); i++){
				choice.addExpr(ctx.setElement(i).accept(this));
			}
			sequence.addExpr(choice);
		}
		else{
			sequence.addExpr(ctx.setElement(0).accept(this));
		}
		Terminal t2 = new Terminal(ctx.RPAREN().getText());
		grammar.addTerminal(t2);
		sequence.addExpr(t2);
		return sequence;
	}
	
	@Override
	public Expression visitLabeledElement(LabeledElementContext ctx) {
		Sequence sequence = new Sequence();
		sequence.addExpr(ctx.id().accept(this));
		if(ctx.ASSIGN() != null){
			Terminal t = new Terminal(ctx.ASSIGN().getText());
			grammar.addTerminal(t);
			sequence.addExpr(t);
		}
		else if(ctx.PLUS_ASSIGN() != null){
			Terminal t = new Terminal(ctx.PLUS_ASSIGN().getText());
			grammar.addTerminal(t);
			sequence.addExpr(t);
		}
		if(ctx.atom() != null){
			sequence.addExpr(ctx.atom().accept(this));
		}
		else if(ctx.block() != null){
			sequence.addExpr(ctx.block().accept(this));
		}
		return sequence;
	}


	@Override
	public Expression visitLexerRule(LexerRuleContext ctx) {
		Nonterminal n = new Nonterminal(ctx.TOKEN_REF().getText());
		Expression result = new Empty();
		result = ctx.lexerRuleBlock().accept(this);
		grammar.addProductionRule(new ProductionRule(n, result));
		return result;
	}
	
	@Override
	public Expression visitLexerRuleBlock(LexerRuleBlockContext ctx) {
		return ctx.lexerAltList().accept(this);
	}
	
	@Override
	public Expression visitLexerAltList(LexerAltListContext ctx) {
		Choice choice = new Choice();
		Expression result = new Empty();
		if(ctx.lexerAlt().size() > 1){
			for(int i = 0; i < ctx.lexerAlt().size(); i++){
				choice.addExpr(ctx.lexerAlt(i).accept(this));
			}
			result = choice;
		}
		else{
			result = ctx.lexerAlt(0).accept(this);
		}
		return result;
	}
	
	@Override
	public Expression visitLexerAlt(LexerAltContext ctx) {
		return ctx.lexerElements().accept(this);
	}
	
	@Override
	public Expression visitLexerElements(LexerElementsContext ctx) {
		Expression result = new Empty();
		Sequence sequence = new Sequence();
		if(ctx.lexerElement().size() > 1){
			for(int i = 0; i < ctx.lexerElement().size(); i++){
				sequence.addExpr(ctx.lexerElement(i).accept(this));
			}
			result = sequence;
		}
		else{
			result = ctx.lexerElement(0).accept(this);
		}
		return result;
	}
	
	@Override
	public Expression visitLexerElement(LexerElementContext ctx) {
		Expression result = new Empty();
		if(ctx.labeledLexerElement() != null){
			 if(ctx.ebnfSuffix() != null){
				Expression temp = ctx.ebnfSuffix().accept(this);
				if(temp.getClass() == (new Optional().getClass())){
					result = new Optional(ctx.labeledLexerElement().accept(this));
				}
				else if(temp.getClass() == (new Star().getClass())){
					result = new Star(ctx.labeledLexerElement().accept(this));
				}
				else if(temp.getClass() == (new Plus().getClass())){
					result = new Plus(ctx.labeledLexerElement().accept(this));
				}
			}
			else{
				result = ctx.labeledLexerElement().accept(this);
			}
		}
		else if(ctx.lexerAtom() != null){
			 if(ctx.ebnfSuffix() != null){
				Expression temp = ctx.ebnfSuffix().accept(this);
				if(temp.getClass() == (new Optional().getClass())){
					result = new Optional(ctx.lexerAtom().accept(this));
				}
				else if(temp.getClass() == (new Star().getClass())){
					result = new Star(ctx.lexerAtom().accept(this));
				}
				else if(temp.getClass() == (new Plus().getClass())){
					result = new Plus(ctx.lexerAtom().accept(this));
				}
			}
			else{
				result = ctx.lexerAtom().accept(this);
			}
		}
		else if(ctx.lexerBlock() != null){
			 if(ctx.ebnfSuffix() != null){
				Expression temp = ctx.ebnfSuffix().accept(this);
				if(temp.getClass() == (new Optional().getClass())){
					result = new Optional(ctx.lexerBlock().accept(this));
				}
				else if(temp.getClass() == (new Star().getClass())){
					result = new Star(ctx.lexerBlock().accept(this));
				}
				else if(temp.getClass() == (new Plus().getClass())){
					result = new Plus(ctx.lexerBlock().accept(this));
				}
			}
			else{
				result = ctx.lexerBlock().accept(this);
			}
		}
		else if(ctx.ACTION() != null){
			result = new Empty();
		}
		return result;
		
	}
	
	@Override
	public Expression visitLabeledLexerElement(LabeledLexerElementContext ctx) {
		Sequence sequence = new Sequence();
		sequence.addExpr(ctx.id().accept(this));
		if(ctx.ASSIGN() != null){
			Terminal t1 = new Terminal(ctx.ASSIGN().getText());
			grammar.addTerminal(t1);
			sequence.addExpr(t1);
		}
		else if(ctx.PLUS_ASSIGN() != null){
			Terminal t2 = new Terminal(ctx.PLUS_ASSIGN().getText());
			grammar.addTerminal(t2);
			sequence.addExpr(t2);
		}
		if(ctx.lexerAtom() != null){
			sequence.addExpr(ctx.lexerAtom().accept(this));
		}
		else if(ctx.block() != null){
			sequence.addExpr(ctx.block().accept(this));
		}
		return sequence;
	}

	@Override
	public Expression visitLexerAtom(LexerAtomContext ctx) {
		Expression result = new Empty();
		if(ctx.range() != null){
			result = ctx.range().accept(this);
		}
		else if(ctx.terminal() != null){
			result = ctx.terminal().accept(this);
		}
		else if(ctx.RULE_REF() != null){
			result = new Nonterminal(ctx.RULE_REF().getText());
		}
		else if(ctx.notSet() != null){
			result = ctx.notSet().accept(this);
		}
		else if(ctx.LEXER_CHAR_SET() != null){
			Terminal t = new Terminal(ctx.LEXER_CHAR_SET().getText());
			grammar.addTerminal(t);
			result = t;
		}
		else if(ctx.DOT() != null){
			Terminal t = new Terminal(ctx.DOT().getText());
			grammar.addTerminal(t);
			result = t;
		}
		return result;
	}
	
	@Override
	public Expression visitLexerBlock(LexerBlockContext ctx) {
		Sequence sequence = new Sequence();
		Terminal t1 = new Terminal(ctx.LPAREN().getText());
		grammar.addTerminal(t1);
		sequence.addExpr(t1);
		sequence.addExpr(ctx.lexerAltList().accept(this));
		Terminal t2 = new Terminal(ctx.RPAREN().getText());
		grammar.addTerminal(t2);
		sequence.addExpr(t2);
		return sequence;
	}
	
	@Override
	public Expression visitId(IdContext ctx) {
		Expression result = new Empty();
		if(ctx.RULE_REF() != null){
			result = new Nonterminal(ctx.RULE_REF().getText());
		}
		if(ctx.TOKEN_REF() != null){
			result = new Nonterminal(ctx.TOKEN_REF().getText());
		}
		return result;
	}

	@Override
	public Expression visitBlock(BlockContext ctx) {
		Sequence sequence = new Sequence();
		Terminal t1 = new Terminal(ctx.LPAREN().getText());
		grammar.addTerminal(t1);
		sequence.addExpr(t1);
		sequence.addExpr(ctx.altList().accept(this));
		Terminal t2 = new Terminal(ctx.RPAREN().getText());
		grammar.addTerminal(t2);
		sequence.addExpr(t2);
		return sequence;
	}

	@Override
	public Expression visitAltList(AltListContext ctx) {
		Choice choice = new Choice();
		Expression result = new Empty();
		if(ctx.alternative().size() > 1){
			for(int i = 0; i < ctx.alternative().size(); i++){
				choice.addExpr(ctx.alternative(i).accept(this));
			}
			result = choice;
		}
		else {
			result = ctx.alternative(0).accept(this);
		}			
		return result;
	}

}
