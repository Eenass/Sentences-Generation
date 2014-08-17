package buildAST;

import grammarDatastructure.Choice;
import grammarDatastructure.Empty;
import grammarDatastructure.Expression;
import grammarDatastructure.Grammar;
import grammarDatastructure.Nonterminal;
import grammarDatastructure.Optional;
import grammarDatastructure.Plus;
import grammarDatastructure.ProductionRule;
import grammarDatastructure.Sequence;
import grammarDatastructure.Star;
import grammarDatastructure.Terminal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.tree.TerminalNode;

import antlrGrammarParser.ANTLRv4ParserBaseVisitor;
import antlrGrammarParser.ANTLRv4Parser.AltListContext;
import antlrGrammarParser.ANTLRv4Parser.AlternativeContext;
import antlrGrammarParser.ANTLRv4Parser.AtomContext;
import antlrGrammarParser.ANTLRv4Parser.BlockContext;
import antlrGrammarParser.ANTLRv4Parser.BlockSetContext;
import antlrGrammarParser.ANTLRv4Parser.BlockSuffixContext;
import antlrGrammarParser.ANTLRv4Parser.EbnfContext;
import antlrGrammarParser.ANTLRv4Parser.EbnfSuffixContext;
import antlrGrammarParser.ANTLRv4Parser.ElementContext;
import antlrGrammarParser.ANTLRv4Parser.ElementsContext;
import antlrGrammarParser.ANTLRv4Parser.GrammarSpecContext;
import antlrGrammarParser.ANTLRv4Parser.IdContext;
import antlrGrammarParser.ANTLRv4Parser.LabeledAltContext;
import antlrGrammarParser.ANTLRv4Parser.LabeledElementContext;
import antlrGrammarParser.ANTLRv4Parser.LabeledLexerElementContext;
import antlrGrammarParser.ANTLRv4Parser.LexerAltContext;
import antlrGrammarParser.ANTLRv4Parser.LexerAltListContext;
import antlrGrammarParser.ANTLRv4Parser.LexerAtomContext;
import antlrGrammarParser.ANTLRv4Parser.LexerBlockContext;
import antlrGrammarParser.ANTLRv4Parser.LexerElementContext;
import antlrGrammarParser.ANTLRv4Parser.LexerElementsContext;
import antlrGrammarParser.ANTLRv4Parser.LexerRuleBlockContext;
import antlrGrammarParser.ANTLRv4Parser.LexerRuleContext;
import antlrGrammarParser.ANTLRv4Parser.NotSetContext;
import antlrGrammarParser.ANTLRv4Parser.ParserRuleSpecContext;
import antlrGrammarParser.ANTLRv4Parser.RangeContext;
import antlrGrammarParser.ANTLRv4Parser.RuleAltListContext;
import antlrGrammarParser.ANTLRv4Parser.RuleBlockContext;
import antlrGrammarParser.ANTLRv4Parser.RuleSpecContext;
import antlrGrammarParser.ANTLRv4Parser.RulerefContext;
import antlrGrammarParser.ANTLRv4Parser.SetElementContext;
import antlrGrammarParser.ANTLRv4Parser.TerminalContext;

public class ASTBuilderVisitor extends ANTLRv4ParserBaseVisitor<Expression>{
	
	private Grammar grammar;
	
	public ASTBuilderVisitor() {
		this.grammar = new Grammar();
	}

	public Grammar getGrammar() {
		return grammar;
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
		ProductionRule rule = new ProductionRule(n, exp);
		this.grammar.addProductionRule(rule);
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
			this.grammar.addterminal(t);
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
			Terminal t = new Terminal(ctx.DOT().getText());
			result = t;
			this.grammar.addterminal(t);
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
		Terminal t1 = new Terminal(ctx.STRING_LITERAL(0).getText());
		this.grammar.addterminal(t1);
		return t1;
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
			this.grammar.addterminal(t);
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
		this.grammar.addterminal(t);
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
			this.grammar.addterminal(t);
			result = t;
		}
		else if(ctx.range() != null){
			result = ctx.range().accept(this);
		}
		else if(ctx.LEXER_CHAR_SET() != null){
			String s = reduceCharSet(ctx.LEXER_CHAR_SET());
			Terminal t = new Terminal(s);
			this.grammar.addterminal(t);
			result = t;
		}
		return result;
	}

	private String reduceCharSet(TerminalNode lexer_CHAR_SET) {
		String text = lexer_CHAR_SET.getText();
		Pattern p = Pattern.compile("[a-zA-Z]");
		Matcher m = p.matcher(text);
		String result = "";
		if(text.contains("\\u") && text.contains("-")){
			String[] l = text.split("-", 2);
			result = "\'" + l[0].substring(1) + "\'";
		}
		else if(text.contains("\\u") && text.length() == 8){
			String[] l = text.split("]", 2);
			result = "\'" + l[0].substring(1) + "\'";
		}
		else if(text.contains("\"\\") && !m.find()){
			result = "\'" + "\"\\\\" + "\'";
		}
		else if(text.contains("\'\\") && !m.find()){
			result = "\'" + "\\'\\\\" + "\'";
		}
		else if(text.contains("\\")){
			if(text.contains("\\n")){
				result = "\'"+  "\\n" + "\'";
			}
			else if(text.contains("\\r")){
				result = "\'" + "\\r" + "\'";
			}
			else if(text.contains("\\t")){
				result = "\'" + "\\t" + "\'";
			}
			else if(text.contains("\\W")){
				result = "'$'";
			}
			else{
				String[] l = text.split("");
				if(l[2].equals("\'")){
					l[2] = "\\\'";
				}
				result = "\'" + l[2] + "\'";
			}
		}
		else{
			String[] l = text.split("");
			result = "\'" + l[2] + "\'";
		}
		return result;
	}

	@Override
	public Expression visitBlockSet(BlockSetContext ctx) {
		Choice choice = new Choice();
		Sequence sequence = new Sequence();
		Terminal t1 = new Terminal(ctx.LPAREN().getText());
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
		sequence.addExpr(t2);
		return sequence;
	}
	
	@Override
	public Expression visitLabeledElement(LabeledElementContext ctx) {
		Sequence sequence = new Sequence();
		sequence.addExpr(ctx.id().accept(this));
		if(ctx.ASSIGN() != null){
			Terminal t = new Terminal(ctx.ASSIGN().getText());
			this.grammar.addterminal(t);
			sequence.addExpr(t);
		}
		else if(ctx.PLUS_ASSIGN() != null){
			Terminal t = new Terminal(ctx.PLUS_ASSIGN().getText());
			this.grammar.addterminal(t);
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
		ProductionRule rule = new ProductionRule(n, result);
		this.grammar.addProductionRule(rule);
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
				Expression accept = ctx.lexerAlt(i).accept(this);
				if(!accept.getClass().equals(Empty.class)){
					choice.addExpr(accept);
				}	
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
				Expression accept = ctx.lexerElement(i).accept(this);
				sequence.addExpr(accept);
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
					result = new Empty();
				}
				else if(temp.getClass() == (new Star().getClass())){
					result = new Empty();
				}
				else if(temp.getClass() == (new Plus().getClass())){
					result = ctx.labeledLexerElement().accept(this);
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
					result = new Empty();
				}
				else if(temp.getClass() == (new Star().getClass())){
					result = new Empty();
				}
				else if(temp.getClass() == (new Plus().getClass())){
					result = ctx.lexerAtom().accept(this);
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
					result = new Empty();
				}
				else if(temp.getClass() == (new Star().getClass())){
					result = new Empty();
				}
				else if(temp.getClass() == (new Plus().getClass())){
					result = ctx.lexerBlock().accept(this);
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
			this.grammar.addterminal(t1);
			sequence.addExpr(t1);
		}
		else if(ctx.PLUS_ASSIGN() != null){
			Terminal t2 = new Terminal(ctx.PLUS_ASSIGN().getText());
			this.grammar.addterminal(t2);
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
			String s = reduceCharSet(ctx.LEXER_CHAR_SET());
			Terminal t = new Terminal(s);
			this.grammar.addterminal(t);
			result = t;
		}
		else if(ctx.DOT() != null){
			Terminal t = new Terminal(ctx.DOT().getText());
			this.grammar.addterminal(t);
			result = t;
		}
		return result;
	}
	
	@Override
	public Expression visitLexerBlock(LexerBlockContext ctx) {
		Sequence sequence = new Sequence();
		Terminal t1 = new Terminal(ctx.LPAREN().getText());
		sequence.addExpr(t1);
		sequence.addExpr(ctx.lexerAltList().accept(this));
		Terminal t2 = new Terminal(ctx.RPAREN().getText());
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
		sequence.addExpr(t1);
		sequence.addExpr(ctx.altList().accept(this));
		Terminal t2 = new Terminal(ctx.RPAREN().getText());
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
