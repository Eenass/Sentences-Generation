// Generated from ExtractedClojure.g4 by ANTLR 4.1
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
public class ExtractedClojureParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, STRING=18, NUMBER=19, CHARACTER=20, NIL=21, BOOLEAN=22, KEYWORD=23, 
		SYMBOL=24, PARAM_NAME=25, NAME=26, SYMBOL_HEAD=27, SYMBOL_REST=28, WS=29, 
		COMMENT=30;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'^'", "'&'", "')'", "'`'", "'['", "'('", "'@'", "'#''", 
		"'~@'", "'#^'", "'''", "'{'", "'#('", "'~'", "'}'", "'#'", "STRING", "'0'", 
		"CHARACTER", "'nil'", "BOOLEAN", "KEYWORD", "SYMBOL", "'%'", "NAME", "SYMBOL_HEAD", 
		"SYMBOL_REST", "'\n'", "';'"
	};
	public static final int
		RULE_file = 0, RULE_form = 1, RULE_list = 2, RULE_vector = 3, RULE_map = 4, 
		RULE_special_form = 5, RULE_lambda = 6, RULE_meta_data = 7, RULE_var_quote = 8, 
		RULE_regex = 9, RULE_reader_macro = 10, RULE_literal = 11;
	public static final String[] ruleNames = {
		"file", "form", "list", "vector", "map", "special_form", "lambda", "meta_data", 
		"var_quote", "regex", "reader_macro", "literal"
	};

	@Override
	public String getGrammarFileName() { return "ExtractedClojure.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExtractedClojureParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedClojureVisitor ) return ((ExtractedClojureVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(24); list();
				}
				}
				setState(29);
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

	public static class FormContext extends ParserRuleContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public Reader_macroContext reader_macro() {
			return getRuleContext(Reader_macroContext.class,0);
		}
		public TerminalNode SYMBOL() { return getToken(ExtractedClojureParser.SYMBOL, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).exitForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedClojureVisitor ) return ((ExtractedClojureVisitor<? extends T>)visitor).visitForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_form);
		try {
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); list();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32); vector();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33); map();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34); reader_macro();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(35); match(9);
				setState(36); match(SYMBOL);
				}
				break;
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

	public static class ListContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedClojureVisitor ) return ((ExtractedClojureVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(7);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << STRING) | (1L << NUMBER) | (1L << CHARACTER) | (1L << NIL) | (1L << BOOLEAN) | (1L << KEYWORD) | (1L << SYMBOL) | (1L << PARAM_NAME))) != 0)) {
				{
				{
				setState(40); form();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46); match(4);
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

	public static class VectorContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedClojureVisitor ) return ((ExtractedClojureVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(6);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << STRING) | (1L << NUMBER) | (1L << CHARACTER) | (1L << NIL) | (1L << BOOLEAN) | (1L << KEYWORD) | (1L << SYMBOL) | (1L << PARAM_NAME))) != 0)) {
				{
				{
				setState(49); form();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55); match(1);
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

	public static class MapContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedClojureVisitor ) return ((ExtractedClojureVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(13);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << STRING) | (1L << NUMBER) | (1L << CHARACTER) | (1L << NIL) | (1L << BOOLEAN) | (1L << KEYWORD) | (1L << SYMBOL) | (1L << PARAM_NAME))) != 0)) {
				{
				{
				setState(58); form();
				setState(59); form();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66); match(16);
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

	public static class Special_formContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public Special_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).enterSpecial_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).exitSpecial_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedClojureVisitor ) return ((ExtractedClojureVisitor<? extends T>)visitor).visitSpecial_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_formContext special_form() throws RecognitionException {
		Special_formContext _localctx = new Special_formContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_special_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 8) | (1L << 10) | (1L << 12) | (1L << 15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(69); form();
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

	public static class LambdaContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedClojureVisitor ) return ((ExtractedClojureVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(14);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << STRING) | (1L << NUMBER) | (1L << CHARACTER) | (1L << NIL) | (1L << BOOLEAN) | (1L << KEYWORD) | (1L << SYMBOL) | (1L << PARAM_NAME))) != 0)) {
				{
				{
				setState(72); form();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78); match(4);
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

	public static class Meta_dataContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public Meta_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).enterMeta_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).exitMeta_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedClojureVisitor ) return ((ExtractedClojureVisitor<? extends T>)visitor).visitMeta_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Meta_dataContext meta_data() throws RecognitionException {
		Meta_dataContext _localctx = new Meta_dataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_meta_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(11);
			setState(81); map();
			setState(82); form();
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

	public static class Var_quoteContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(ExtractedClojureParser.SYMBOL, 0); }
		public Var_quoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).enterVar_quote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).exitVar_quote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedClojureVisitor ) return ((ExtractedClojureVisitor<? extends T>)visitor).visitVar_quote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_quoteContext var_quote() throws RecognitionException {
		Var_quoteContext _localctx = new Var_quoteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(12);
			setState(85); match(17);
			setState(86); match(SYMBOL);
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

	public static class RegexContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ExtractedClojureParser.STRING, 0); }
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).exitRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedClojureVisitor ) return ((ExtractedClojureVisitor<? extends T>)visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_regex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(17);
			setState(89); match(STRING);
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

	public static class Reader_macroContext extends ParserRuleContext {
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public TerminalNode SYMBOL() { return getToken(ExtractedClojureParser.SYMBOL, 0); }
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public Meta_dataContext meta_data() {
			return getRuleContext(Meta_dataContext.class,0);
		}
		public Var_quoteContext var_quote() {
			return getRuleContext(Var_quoteContext.class,0);
		}
		public Special_formContext special_form() {
			return getRuleContext(Special_formContext.class,0);
		}
		public Reader_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reader_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).enterReader_macro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).exitReader_macro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedClojureVisitor ) return ((ExtractedClojureVisitor<? extends T>)visitor).visitReader_macro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reader_macroContext reader_macro() throws RecognitionException {
		Reader_macroContext _localctx = new Reader_macroContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_reader_macro);
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); lambda();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); meta_data();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93); special_form();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94); regex();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95); var_quote();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96); match(SYMBOL);
				setState(97); match(17);
				}
				break;
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(ExtractedClojureParser.SYMBOL, 0); }
		public TerminalNode BOOLEAN() { return getToken(ExtractedClojureParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(ExtractedClojureParser.CHARACTER, 0); }
		public TerminalNode KEYWORD() { return getToken(ExtractedClojureParser.KEYWORD, 0); }
		public TerminalNode NIL() { return getToken(ExtractedClojureParser.NIL, 0); }
		public TerminalNode NUMBER() { return getToken(ExtractedClojureParser.NUMBER, 0); }
		public TerminalNode PARAM_NAME() { return getToken(ExtractedClojureParser.PARAM_NAME, 0); }
		public TerminalNode STRING() { return getToken(ExtractedClojureParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedClojureListener ) ((ExtractedClojureListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedClojureVisitor ) return ((ExtractedClojureVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << CHARACTER) | (1L << NIL) | (1L << BOOLEAN) | (1L << KEYWORD) | (1L << SYMBOL) | (1L << PARAM_NAME))) != 0)) ) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3 i\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3(\n\3\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\3\5\3\5\7\5\65\n\5"+
		"\f\5\16\58\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6@\n\6\f\6\16\6C\13\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\7\bL\n\b\f\b\16\bO\13\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fe\n\f\3"+
		"\r\3\r\3\r\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\b\2\4\5\7\7\n\n\f\f"+
		"\16\16\21\21\3\2\24\33k\2\35\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b\62\3\2\2"+
		"\2\n;\3\2\2\2\fF\3\2\2\2\16I\3\2\2\2\20R\3\2\2\2\22V\3\2\2\2\24Z\3\2\2"+
		"\2\26d\3\2\2\2\30f\3\2\2\2\32\34\5\6\4\2\33\32\3\2\2\2\34\37\3\2\2\2\35"+
		"\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37\35\3\2\2\2 (\5\30\r\2!(\5\6"+
		"\4\2\"(\5\b\5\2#(\5\n\6\2$(\5\26\f\2%&\7\13\2\2&(\7\32\2\2\' \3\2\2\2"+
		"\'!\3\2\2\2\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2(\5\3\2\2\2)-"+
		"\7\t\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2"+
		"/-\3\2\2\2\60\61\7\6\2\2\61\7\3\2\2\2\62\66\7\b\2\2\63\65\5\4\3\2\64\63"+
		"\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2"+
		"\29:\7\3\2\2:\t\3\2\2\2;A\7\17\2\2<=\5\4\3\2=>\5\4\3\2>@\3\2\2\2?<\3\2"+
		"\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\22\2\2E\13"+
		"\3\2\2\2FG\t\2\2\2GH\5\4\3\2H\r\3\2\2\2IM\7\20\2\2JL\5\4\3\2KJ\3\2\2\2"+
		"LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\6\2\2Q\17\3\2\2"+
		"\2RS\7\r\2\2ST\5\n\6\2TU\5\4\3\2U\21\3\2\2\2VW\7\16\2\2WX\7\23\2\2XY\7"+
		"\32\2\2Y\23\3\2\2\2Z[\7\23\2\2[\\\7\24\2\2\\\25\3\2\2\2]e\5\16\b\2^e\5"+
		"\20\t\2_e\5\f\7\2`e\5\24\13\2ae\5\22\n\2bc\7\32\2\2ce\7\23\2\2d]\3\2\2"+
		"\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2e\27\3\2\2\2fg\t\3"+
		"\2\2g\31\3\2\2\2\t\35\'-\66AMd";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}