// Generated from creole.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class creoleParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, HASH=8, LBRACKET=9, 
		RBRACKET=10, LBRACE=11, RBRACE=12, TEXT=13, WS=14, CR=15, NOWIKI=16, RSLASH=17;
	public static final String[] tokenNames = {
		"<INVALID>", "'----'", "'\\\\'", "'**'", "'*'", "'|='", "'='", "'|'", 
		"'#'", "'[['", "']]'", "'{{'", "'}}'", "TEXT", "WS", "CR", "NOWIKI", "'/'"
	};
	public static final int
		RULE_document = 0, RULE_line = 1, RULE_markup = 2, RULE_text = 3, RULE_bold = 4, 
		RULE_italics = 5, RULE_href = 6, RULE_image = 7, RULE_hline = 8, RULE_listitem = 9, 
		RULE_tableheader = 10, RULE_tablerow = 11, RULE_title = 12, RULE_nowiki = 13;
	public static final String[] ruleNames = {
		"document", "line", "markup", "text", "bold", "italics", "href", "image", 
		"hline", "listitem", "tableheader", "tablerow", "title", "nowiki"
	};

	@Override
	public String getGrammarFileName() { return "creole.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public creoleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode CR(int i) {
			return getToken(creoleParser.CR, i);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> CR() { return getTokens(creoleParser.CR); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << HASH) | (1L << LBRACKET) | (1L << LBRACE) | (1L << TEXT) | (1L << CR) | (1L << NOWIKI) | (1L << RSLASH))) != 0)) {
				{
				{
				setState(29);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << HASH) | (1L << LBRACKET) | (1L << LBRACE) | (1L << TEXT) | (1L << NOWIKI) | (1L << RSLASH))) != 0)) {
					{
					setState(28); line();
					}
				}

				setState(31); match(CR);
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

	public static class LineContext extends ParserRuleContext {
		public MarkupContext markup(int i) {
			return getRuleContext(MarkupContext.class,i);
		}
		public List<MarkupContext> markup() {
			return getRuleContexts(MarkupContext.class);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37); markup();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << HASH) | (1L << LBRACKET) | (1L << LBRACE) | (1L << TEXT) | (1L << NOWIKI) | (1L << RSLASH))) != 0) );
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

	public static class MarkupContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public HlineContext hline() {
			return getRuleContext(HlineContext.class,0);
		}
		public HrefContext href() {
			return getRuleContext(HrefContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ItalicsContext italics() {
			return getRuleContext(ItalicsContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TableheaderContext tableheader() {
			return getRuleContext(TableheaderContext.class,0);
		}
		public ListitemContext listitem() {
			return getRuleContext(ListitemContext.class,0);
		}
		public NowikiContext nowiki() {
			return getRuleContext(NowikiContext.class,0);
		}
		public TablerowContext tablerow() {
			return getRuleContext(TablerowContext.class,0);
		}
		public BoldContext bold() {
			return getRuleContext(BoldContext.class,0);
		}
		public MarkupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterMarkup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitMarkup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitMarkup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkupContext markup() throws RecognitionException {
		MarkupContext _localctx = new MarkupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_markup);
		try {
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); bold();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43); italics();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44); href();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45); title();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46); hline();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47); text();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(48); listitem();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(49); image();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(50); tablerow();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(51); tableheader();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(52); nowiki();
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

	public static class TextContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public List<TerminalNode> RSLASH() { return getTokens(creoleParser.RSLASH); }
		public TerminalNode TEXT(int i) {
			return getToken(creoleParser.TEXT, i);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<TerminalNode> TEXT() { return getTokens(creoleParser.TEXT); }
		public TerminalNode RSLASH(int i) {
			return getToken(creoleParser.RSLASH, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(55);
					_la = _input.LA(1);
					if ( !(_la==TEXT || _la==RSLASH) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(58); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(60); match(2);
					setState(61); text();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class BoldContext extends ParserRuleContext {
		public MarkupContext markup(int i) {
			return getRuleContext(MarkupContext.class,i);
		}
		public List<MarkupContext> markup() {
			return getRuleContexts(MarkupContext.class);
		}
		public BoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterBold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitBold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitBold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoldContext bold() throws RecognitionException {
		BoldContext _localctx = new BoldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bold);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(3);
			setState(69); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(68); markup();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(73); match(3);
				}
				break;
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

	public static class ItalicsContext extends ParserRuleContext {
		public MarkupContext markup(int i) {
			return getRuleContext(MarkupContext.class,i);
		}
		public List<TerminalNode> RSLASH() { return getTokens(creoleParser.RSLASH); }
		public List<MarkupContext> markup() {
			return getRuleContexts(MarkupContext.class);
		}
		public TerminalNode RSLASH(int i) {
			return getToken(creoleParser.RSLASH, i);
		}
		public ItalicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterItalics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitItalics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitItalics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItalicsContext italics() throws RecognitionException {
		ItalicsContext _localctx = new ItalicsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_italics);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(RSLASH);
			setState(77); match(RSLASH);
			setState(79); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(78); markup();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(83); match(RSLASH);
			setState(84); match(RSLASH);
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

	public static class HrefContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(creoleParser.LBRACE, 0); }
		public MarkupContext markup(int i) {
			return getRuleContext(MarkupContext.class,i);
		}
		public List<MarkupContext> markup() {
			return getRuleContexts(MarkupContext.class);
		}
		public TerminalNode RBRACE() { return getToken(creoleParser.RBRACE, 0); }
		public TerminalNode LBRACKET() { return getToken(creoleParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(creoleParser.RBRACKET, 0); }
		public HrefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_href; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterHref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitHref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitHref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HrefContext href() throws RecognitionException {
		HrefContext _localctx = new HrefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_href);
		int _la;
		try {
			setState(108);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); match(LBRACKET);
				setState(87); text();
				setState(94);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(88); match(7);
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(89); markup();
						}
						}
						setState(92); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << HASH) | (1L << LBRACKET) | (1L << LBRACE) | (1L << TEXT) | (1L << NOWIKI) | (1L << RSLASH))) != 0) );
					}
				}

				setState(96); match(RBRACKET);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); match(LBRACE);
				setState(99); text();
				setState(100); match(7);
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101); markup();
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << HASH) | (1L << LBRACKET) | (1L << LBRACE) | (1L << TEXT) | (1L << NOWIKI) | (1L << RSLASH))) != 0) );
				setState(106); match(RBRACE);
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

	public static class ImageContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(creoleParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(creoleParser.RBRACE, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(LBRACE);
			setState(111); text();
			setState(112); match(RBRACE);
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

	public static class HlineContext extends ParserRuleContext {
		public HlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterHline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitHline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitHline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HlineContext hline() throws RecognitionException {
		HlineContext _localctx = new HlineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(1);
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

	public static class ListitemContext extends ParserRuleContext {
		public MarkupContext markup() {
			return getRuleContext(MarkupContext.class,0);
		}
		public ListitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterListitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitListitem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitListitem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListitemContext listitem() throws RecognitionException {
		ListitemContext _localctx = new ListitemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listitem);
		try {
			int _alt;
			setState(128);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(117); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(116); match(4);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(119); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(121); markup();
				}
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(123); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(122); match(HASH);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(125); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(127); markup();
				}
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

	public static class TableheaderContext extends ParserRuleContext {
		public MarkupContext markup(int i) {
			return getRuleContext(MarkupContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(creoleParser.WS); }
		public List<MarkupContext> markup() {
			return getRuleContexts(MarkupContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(creoleParser.WS, i);
		}
		public TableheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterTableheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitTableheader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitTableheader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableheaderContext tableheader() throws RecognitionException {
		TableheaderContext _localctx = new TableheaderContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tableheader);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130); match(5);
				setState(132); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(131); markup();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(134); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==5 );
			setState(140); match(7);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(141); match(WS);
				}
				}
				setState(146);
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

	public static class TablerowContext extends ParserRuleContext {
		public MarkupContext markup(int i) {
			return getRuleContext(MarkupContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(creoleParser.WS); }
		public List<MarkupContext> markup() {
			return getRuleContexts(MarkupContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(creoleParser.WS, i);
		}
		public TablerowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablerow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterTablerow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitTablerow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitTablerow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablerowContext tablerow() throws RecognitionException {
		TablerowContext _localctx = new TablerowContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tablerow);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(147); match(7);
					setState(149); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(148); markup();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(151); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					} while ( _alt!=2 && _alt!=-1 );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(155); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(157); match(7);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(158); match(WS);
				}
				}
				setState(163);
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

	public static class TitleContext extends ParserRuleContext {
		public MarkupContext markup() {
			return getRuleContext(MarkupContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_title);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(164); match(6);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(167); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(169); markup();
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(170); match(6);
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class NowikiContext extends ParserRuleContext {
		public TerminalNode NOWIKI() { return getToken(creoleParser.NOWIKI, 0); }
		public NowikiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nowiki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).enterNowiki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creoleListener ) ((creoleListener)listener).exitNowiki(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof creoleVisitor ) return ((creoleVisitor<? extends T>)visitor).visitNowiki(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NowikiContext nowiki() throws RecognitionException {
		NowikiContext _localctx = new NowikiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nowiki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(NOWIKI);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\23\u00b5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\3\6\3)\n\3\r\3\16\3*\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\48\n\4\3\5\6\5;\n\5\r\5\16\5<\3\5\3\5\7\5A\n\5\f\5\16\5D"+
		"\13\5\3\6\3\6\6\6H\n\6\r\6\16\6I\3\6\5\6M\n\6\3\7\3\7\3\7\6\7R\n\7\r\7"+
		"\16\7S\3\7\3\7\3\7\3\b\3\b\3\b\3\b\6\b]\n\b\r\b\16\b^\5\ba\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\6\bi\n\b\r\b\16\bj\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\6\13x\n\13\r\13\16\13y\3\13\3\13\6\13~\n\13\r\13\16\13\177"+
		"\3\13\5\13\u0083\n\13\3\f\3\f\6\f\u0087\n\f\r\f\16\f\u0088\6\f\u008b\n"+
		"\f\r\f\16\f\u008c\3\f\3\f\7\f\u0091\n\f\f\f\16\f\u0094\13\f\3\r\3\r\6"+
		"\r\u0098\n\r\r\r\16\r\u0099\6\r\u009c\n\r\r\r\16\r\u009d\3\r\3\r\7\r\u00a2"+
		"\n\r\f\r\16\r\u00a5\13\r\3\16\6\16\u00a8\n\16\r\16\16\16\u00a9\3\16\3"+
		"\16\7\16\u00ae\n\16\f\16\16\16\u00b1\13\16\3\17\3\17\3\17\2\20\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\2\3\4\2\17\17\23\23\u00c7\2$\3\2\2\2\4(\3"+
		"\2\2\2\6\67\3\2\2\2\b:\3\2\2\2\nE\3\2\2\2\fN\3\2\2\2\16n\3\2\2\2\20p\3"+
		"\2\2\2\22t\3\2\2\2\24\u0082\3\2\2\2\26\u008a\3\2\2\2\30\u009b\3\2\2\2"+
		"\32\u00a7\3\2\2\2\34\u00b2\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2\37 \3\2\2"+
		"\2 !\3\2\2\2!#\7\21\2\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3"+
		"\3\2\2\2&$\3\2\2\2\')\5\6\4\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2"+
		"+\5\3\2\2\2,8\5\n\6\2-8\5\f\7\2.8\5\16\b\2/8\5\32\16\2\608\5\22\n\2\61"+
		"8\5\b\5\2\628\5\24\13\2\638\5\20\t\2\648\5\30\r\2\658\5\26\f\2\668\5\34"+
		"\17\2\67,\3\2\2\2\67-\3\2\2\2\67.\3\2\2\2\67/\3\2\2\2\67\60\3\2\2\2\67"+
		"\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67"+
		"\66\3\2\2\28\7\3\2\2\29;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2"+
		"\2=B\3\2\2\2>?\7\4\2\2?A\5\b\5\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2"+
		"\2C\t\3\2\2\2DB\3\2\2\2EG\7\5\2\2FH\5\6\4\2GF\3\2\2\2HI\3\2\2\2IG\3\2"+
		"\2\2IJ\3\2\2\2JL\3\2\2\2KM\7\5\2\2LK\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NO\7"+
		"\23\2\2OQ\7\23\2\2PR\5\6\4\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T"+
		"U\3\2\2\2UV\7\23\2\2VW\7\23\2\2W\r\3\2\2\2XY\7\13\2\2Y`\5\b\5\2Z\\\7\t"+
		"\2\2[]\5\6\4\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`Z\3"+
		"\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\f\2\2co\3\2\2\2de\7\r\2\2ef\5\b\5\2fh\7"+
		"\t\2\2gi\5\6\4\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7"+
		"\16\2\2mo\3\2\2\2nX\3\2\2\2nd\3\2\2\2o\17\3\2\2\2pq\7\r\2\2qr\5\b\5\2"+
		"rs\7\16\2\2s\21\3\2\2\2tu\7\3\2\2u\23\3\2\2\2vx\7\6\2\2wv\3\2\2\2xy\3"+
		"\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{\u0083\5\6\4\2|~\7\n\2\2}|\3\2\2"+
		"\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0083\5\6\4\2\u0082w\3\2\2\2\u0082}\3\2\2\2\u0083\25\3\2\2\2\u0084\u0086"+
		"\7\7\2\2\u0085\u0087\5\6\4\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0084\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0092\7\t\2\2\u008f\u0091\7\20\2\2\u0090\u008f\3"+
		"\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\27\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\7\t\2\2\u0096\u0098\5\6\4"+
		"\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0095\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\7\t"+
		"\2\2\u00a0\u00a2\7\20\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\31\3\2\2\2\u00a5\u00a3\3\2\2"+
		"\2\u00a6\u00a8\7\b\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00af\5\6\4\2\u00ac"+
		"\u00ae\7\b\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\33\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3"+
		"\7\22\2\2\u00b3\35\3\2\2\2\32\37$*\67<BILS^`jny\177\u0082\u0088\u008c"+
		"\u0092\u0099\u009d\u00a3\u00a9\u00af";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}