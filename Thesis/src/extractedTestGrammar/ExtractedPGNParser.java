// Generated from ExtractedPGN.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExtractedPGNParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITE_WINS=1, BLACK_WINS=2, DRAWN_GAME=3, REST_OF_LINE_COMMENT=4, BRACE_COMMENT=5, 
		ESCAPE=6, SPACES=7, STRING=8, INTEGER=9, PERIOD=10, ASTERISK=11, LEFT_BRACKET=12, 
		RIGHT_BRACKET=13, LEFT_PARENTHESIS=14, RIGHT_PARENTHESIS=15, LEFT_ANGLE_BRACKET=16, 
		RIGHT_ANGLE_BRACKET=17, NUMERIC_ANNOTATION_GLYPH=18, SYMBOL=19, SUFFIX_ANNOTATION=20, 
		UNEXPECTED_CHAR=21;
	public static final String[] tokenNames = {
		"<INVALID>", "'1-0'", "'0-1'", "'1/2-1/2'", "';'", "BRACE_COMMENT", "'%'", 
		"'\n'", "STRING", "'0'", "'.'", "'*'", "'['", "']'", "'('", "')'", "'<'", 
		"'>'", "NUMERIC_ANNOTATION_GLYPH", "'a'", "'?'", "UNEXPECTED_CHAR"
	};
	public static final int
		RULE_parse = 0, RULE_pgn_database = 1, RULE_pgn_game = 2, RULE_tag_section = 3, 
		RULE_tag_pair = 4, RULE_tag_name = 5, RULE_tag_value = 6, RULE_movetext_section = 7, 
		RULE_element_sequence = 8, RULE_element = 9, RULE_move_number_indication = 10, 
		RULE_san_move = 11, RULE_recursive_variation = 12, RULE_game_termination = 13;
	public static final String[] ruleNames = {
		"parse", "pgn_database", "pgn_game", "tag_section", "tag_pair", "tag_name", 
		"tag_value", "movetext_section", "element_sequence", "element", "move_number_indication", 
		"san_move", "recursive_variation", "game_termination"
	};

	@Override
	public String getGrammarFileName() { return "ExtractedPGN.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExtractedPGNParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public Pgn_databaseContext pgn_database() {
			return getRuleContext(Pgn_databaseContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExtractedPGNParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); pgn_database();
			setState(29); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pgn_databaseContext extends ParserRuleContext {
		public Pgn_gameContext pgn_game(int i) {
			return getRuleContext(Pgn_gameContext.class,i);
		}
		public List<Pgn_gameContext> pgn_game() {
			return getRuleContexts(Pgn_gameContext.class);
		}
		public Pgn_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgn_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterPgn_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitPgn_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitPgn_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pgn_databaseContext pgn_database() throws RecognitionException {
		Pgn_databaseContext _localctx = new Pgn_databaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pgn_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITE_WINS) | (1L << BLACK_WINS) | (1L << DRAWN_GAME) | (1L << INTEGER) | (1L << ASTERISK) | (1L << LEFT_BRACKET) | (1L << LEFT_PARENTHESIS) | (1L << NUMERIC_ANNOTATION_GLYPH) | (1L << SYMBOL))) != 0)) {
				{
				{
				setState(31); pgn_game();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pgn_gameContext extends ParserRuleContext {
		public Tag_sectionContext tag_section() {
			return getRuleContext(Tag_sectionContext.class,0);
		}
		public Movetext_sectionContext movetext_section() {
			return getRuleContext(Movetext_sectionContext.class,0);
		}
		public Pgn_gameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgn_game; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterPgn_game(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitPgn_game(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitPgn_game(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pgn_gameContext pgn_game() throws RecognitionException {
		Pgn_gameContext _localctx = new Pgn_gameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pgn_game);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); tag_section();
			setState(38); movetext_section();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tag_sectionContext extends ParserRuleContext {
		public List<Tag_pairContext> tag_pair() {
			return getRuleContexts(Tag_pairContext.class);
		}
		public Tag_pairContext tag_pair(int i) {
			return getRuleContext(Tag_pairContext.class,i);
		}
		public Tag_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterTag_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitTag_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitTag_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_sectionContext tag_section() throws RecognitionException {
		Tag_sectionContext _localctx = new Tag_sectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tag_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(40); tag_pair();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tag_pairContext extends ParserRuleContext {
		public Tag_nameContext tag_name() {
			return getRuleContext(Tag_nameContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(ExtractedPGNParser.LEFT_BRACKET, 0); }
		public Tag_valueContext tag_value() {
			return getRuleContext(Tag_valueContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ExtractedPGNParser.RIGHT_BRACKET, 0); }
		public Tag_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterTag_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitTag_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitTag_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_pairContext tag_pair() throws RecognitionException {
		Tag_pairContext _localctx = new Tag_pairContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tag_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(LEFT_BRACKET);
			setState(47); tag_name();
			setState(48); tag_value();
			setState(49); match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tag_nameContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(ExtractedPGNParser.SYMBOL, 0); }
		public Tag_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterTag_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitTag_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitTag_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_nameContext tag_name() throws RecognitionException {
		Tag_nameContext _localctx = new Tag_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tag_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tag_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ExtractedPGNParser.STRING, 0); }
		public Tag_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterTag_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitTag_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitTag_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_valueContext tag_value() throws RecognitionException {
		Tag_valueContext _localctx = new Tag_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tag_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Movetext_sectionContext extends ParserRuleContext {
		public Element_sequenceContext element_sequence() {
			return getRuleContext(Element_sequenceContext.class,0);
		}
		public Game_terminationContext game_termination() {
			return getRuleContext(Game_terminationContext.class,0);
		}
		public Movetext_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movetext_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterMovetext_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitMovetext_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitMovetext_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Movetext_sectionContext movetext_section() throws RecognitionException {
		Movetext_sectionContext _localctx = new Movetext_sectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_movetext_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); element_sequence();
			setState(56); game_termination();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_sequenceContext extends ParserRuleContext {
		public List<Recursive_variationContext> recursive_variation() {
			return getRuleContexts(Recursive_variationContext.class);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Recursive_variationContext recursive_variation(int i) {
			return getRuleContext(Recursive_variationContext.class,i);
		}
		public Element_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterElement_sequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitElement_sequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitElement_sequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_sequenceContext element_sequence() throws RecognitionException {
		Element_sequenceContext _localctx = new Element_sequenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_element_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LEFT_PARENTHESIS) | (1L << NUMERIC_ANNOTATION_GLYPH) | (1L << SYMBOL))) != 0)) {
				{
				setState(60);
				switch (_input.LA(1)) {
				case INTEGER:
				case NUMERIC_ANNOTATION_GLYPH:
				case SYMBOL:
					{
					setState(58); element();
					}
					break;
				case LEFT_PARENTHESIS:
					{
					setState(59); recursive_variation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public Move_number_indicationContext move_number_indication() {
			return getRuleContext(Move_number_indicationContext.class,0);
		}
		public San_moveContext san_move() {
			return getRuleContext(San_moveContext.class,0);
		}
		public TerminalNode NUMERIC_ANNOTATION_GLYPH() { return getToken(ExtractedPGNParser.NUMERIC_ANNOTATION_GLYPH, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_element);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); move_number_indication();
				}
				break;
			case SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); san_move();
				}
				break;
			case NUMERIC_ANNOTATION_GLYPH:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); match(NUMERIC_ANNOTATION_GLYPH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Move_number_indicationContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ExtractedPGNParser.INTEGER, 0); }
		public TerminalNode PERIOD() { return getToken(ExtractedPGNParser.PERIOD, 0); }
		public Move_number_indicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_number_indication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterMove_number_indication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitMove_number_indication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitMove_number_indication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Move_number_indicationContext move_number_indication() throws RecognitionException {
		Move_number_indicationContext _localctx = new Move_number_indicationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_move_number_indication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(INTEGER);
			setState(72);
			_la = _input.LA(1);
			if (_la==PERIOD) {
				{
				setState(71); match(PERIOD);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class San_moveContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(ExtractedPGNParser.SYMBOL, 0); }
		public San_moveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_san_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterSan_move(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitSan_move(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitSan_move(this);
			else return visitor.visitChildren(this);
		}
	}

	public final San_moveContext san_move() throws RecognitionException {
		San_moveContext _localctx = new San_moveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_san_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Recursive_variationContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(ExtractedPGNParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(ExtractedPGNParser.RIGHT_PARENTHESIS, 0); }
		public Element_sequenceContext element_sequence() {
			return getRuleContext(Element_sequenceContext.class,0);
		}
		public Recursive_variationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_variation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterRecursive_variation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitRecursive_variation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitRecursive_variation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Recursive_variationContext recursive_variation() throws RecognitionException {
		Recursive_variationContext _localctx = new Recursive_variationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_recursive_variation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(LEFT_PARENTHESIS);
			setState(77); element_sequence();
			setState(78); match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Game_terminationContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(ExtractedPGNParser.ASTERISK, 0); }
		public TerminalNode WHITE_WINS() { return getToken(ExtractedPGNParser.WHITE_WINS, 0); }
		public TerminalNode BLACK_WINS() { return getToken(ExtractedPGNParser.BLACK_WINS, 0); }
		public TerminalNode DRAWN_GAME() { return getToken(ExtractedPGNParser.DRAWN_GAME, 0); }
		public Game_terminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game_termination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).enterGame_termination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedPGNListener ) ((ExtractedPGNListener)listener).exitGame_termination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedPGNVisitor ) return ((ExtractedPGNVisitor<? extends T>)visitor).visitGame_termination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Game_terminationContext game_termination() throws RecognitionException {
		Game_terminationContext _localctx = new Game_terminationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_game_termination);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITE_WINS) | (1L << BLACK_WINS) | (1L << DRAWN_GAME) | (1L << ASTERISK))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\27U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\7\3#\n\3\f\3\16\3&"+
		"\13\3\3\4\3\4\3\4\3\5\7\5,\n\5\f\5\16\5/\13\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\7\n?\n\n\f\n\16\nB\13\n\3\13\3\13\3\13"+
		"\5\13G\n\13\3\f\3\f\5\fK\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\4\2\3\5\r\rM\2\36\3\2\2"+
		"\2\4$\3\2\2\2\6\'\3\2\2\2\b-\3\2\2\2\n\60\3\2\2\2\f\65\3\2\2\2\16\67\3"+
		"\2\2\2\209\3\2\2\2\22@\3\2\2\2\24F\3\2\2\2\26H\3\2\2\2\30L\3\2\2\2\32"+
		"N\3\2\2\2\34R\3\2\2\2\36\37\5\4\3\2\37 \7\2\2\3 \3\3\2\2\2!#\5\6\4\2\""+
		"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&$\3\2\2\2\'(\5\b\5"+
		"\2()\5\20\t\2)\7\3\2\2\2*,\5\n\6\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2"+
		"\2\2.\t\3\2\2\2/-\3\2\2\2\60\61\7\16\2\2\61\62\5\f\7\2\62\63\5\16\b\2"+
		"\63\64\7\17\2\2\64\13\3\2\2\2\65\66\7\25\2\2\66\r\3\2\2\2\678\7\n\2\2"+
		"8\17\3\2\2\29:\5\22\n\2:;\5\34\17\2;\21\3\2\2\2<?\5\24\13\2=?\5\32\16"+
		"\2><\3\2\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\23\3\2\2\2B@\3\2"+
		"\2\2CG\5\26\f\2DG\5\30\r\2EG\7\24\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\25"+
		"\3\2\2\2HJ\7\13\2\2IK\7\f\2\2JI\3\2\2\2JK\3\2\2\2K\27\3\2\2\2LM\7\25\2"+
		"\2M\31\3\2\2\2NO\7\20\2\2OP\5\22\n\2PQ\7\21\2\2Q\33\3\2\2\2RS\t\2\2\2"+
		"S\35\3\2\2\2\b$->@FJ";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}