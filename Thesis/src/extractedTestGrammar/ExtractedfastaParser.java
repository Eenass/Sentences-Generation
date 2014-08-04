// Generated from Extractedfasta.g4 by ANTLR 4.1
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
public class ExtractedfastaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENTLINE=1, DESCRIPTIONLINE=2, TEXT=3, EOL=4, DIGIT=5, LETTER=6, SYMBOL=7, 
		SEQUENCELINE=8;
	public static final String[] tokenNames = {
		"<INVALID>", "COMMENTLINE", "DESCRIPTIONLINE", "TEXT", "'\n'", "'0'", 
		"'A'", "SYMBOL", "SEQUENCELINE"
	};
	public static final int
		RULE_sequence = 0, RULE_section = 1, RULE_sequencelines = 2, RULE_descriptionline = 3, 
		RULE_commentline = 4;
	public static final String[] ruleNames = {
		"sequence", "section", "sequencelines", "descriptionline", "commentline"
	};

	@Override
	public String getGrammarFileName() { return "Extractedfasta.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExtractedfastaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SequenceContext extends ParserRuleContext {
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedfastaListener ) ((ExtractedfastaListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedfastaListener ) ((ExtractedfastaListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedfastaVisitor ) return ((ExtractedfastaVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10); section();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENTLINE) | (1L << DESCRIPTIONLINE) | (1L << SEQUENCELINE))) != 0) );
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

	public static class SectionContext extends ParserRuleContext {
		public SequencelinesContext sequencelines() {
			return getRuleContext(SequencelinesContext.class,0);
		}
		public DescriptionlineContext descriptionline() {
			return getRuleContext(DescriptionlineContext.class,0);
		}
		public CommentlineContext commentline() {
			return getRuleContext(CommentlineContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedfastaListener ) ((ExtractedfastaListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedfastaListener ) ((ExtractedfastaListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedfastaVisitor ) return ((ExtractedfastaVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_section);
		try {
			setState(18);
			switch (_input.LA(1)) {
			case DESCRIPTIONLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(15); descriptionline();
				}
				break;
			case SEQUENCELINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(16); sequencelines();
				}
				break;
			case COMMENTLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(17); commentline();
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

	public static class SequencelinesContext extends ParserRuleContext {
		public TerminalNode SEQUENCELINE(int i) {
			return getToken(ExtractedfastaParser.SEQUENCELINE, i);
		}
		public List<TerminalNode> SEQUENCELINE() { return getTokens(ExtractedfastaParser.SEQUENCELINE); }
		public SequencelinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequencelines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedfastaListener ) ((ExtractedfastaListener)listener).enterSequencelines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedfastaListener ) ((ExtractedfastaListener)listener).exitSequencelines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedfastaVisitor ) return ((ExtractedfastaVisitor<? extends T>)visitor).visitSequencelines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequencelinesContext sequencelines() throws RecognitionException {
		SequencelinesContext _localctx = new SequencelinesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sequencelines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(20); match(SEQUENCELINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(23); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class DescriptionlineContext extends ParserRuleContext {
		public TerminalNode DESCRIPTIONLINE() { return getToken(ExtractedfastaParser.DESCRIPTIONLINE, 0); }
		public DescriptionlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedfastaListener ) ((ExtractedfastaListener)listener).enterDescriptionline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedfastaListener ) ((ExtractedfastaListener)listener).exitDescriptionline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedfastaVisitor ) return ((ExtractedfastaVisitor<? extends T>)visitor).visitDescriptionline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionlineContext descriptionline() throws RecognitionException {
		DescriptionlineContext _localctx = new DescriptionlineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_descriptionline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(DESCRIPTIONLINE);
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

	public static class CommentlineContext extends ParserRuleContext {
		public TerminalNode COMMENTLINE() { return getToken(ExtractedfastaParser.COMMENTLINE, 0); }
		public CommentlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedfastaListener ) ((ExtractedfastaListener)listener).enterCommentline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedfastaListener ) ((ExtractedfastaListener)listener).exitCommentline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedfastaVisitor ) return ((ExtractedfastaVisitor<? extends T>)visitor).visitCommentline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentlineContext commentline() throws RecognitionException {
		CommentlineContext _localctx = new CommentlineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_commentline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); match(COMMENTLINE);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\n \4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\5\3"+
		"\25\n\3\3\4\6\4\30\n\4\r\4\16\4\31\3\5\3\5\3\6\3\6\3\6\2\7\2\4\6\b\n\2"+
		"\2\36\2\r\3\2\2\2\4\24\3\2\2\2\6\27\3\2\2\2\b\33\3\2\2\2\n\35\3\2\2\2"+
		"\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20"+
		"\3\3\2\2\2\21\25\5\b\5\2\22\25\5\6\4\2\23\25\5\n\6\2\24\21\3\2\2\2\24"+
		"\22\3\2\2\2\24\23\3\2\2\2\25\5\3\2\2\2\26\30\7\n\2\2\27\26\3\2\2\2\30"+
		"\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\7\3\2\2\2\33\34\7\4\2\2\34"+
		"\t\3\2\2\2\35\36\7\3\2\2\36\13\3\2\2\2\5\17\24\31";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}