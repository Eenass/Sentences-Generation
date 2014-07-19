// Generated from tnt.g4 by ANTLR 4.1
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
public class tntParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, ZERO=8, SUCCESSOR=9, 
		A=10, B=11, C=12, D=13, E=14, PRIME=15, FOREVERY=16, EXISTS=17, WS=18;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'+'", "'*'", "'('", "':'", "'='", "'~'", "'0'", "'S'", 
		"'a'", "'b'", "'c'", "'d'", "'e'", "'''", "'A'", "'E'", "WS"
	};
	public static final int
		RULE_equation = 0, RULE_atom = 1, RULE_number = 2, RULE_variable = 3, 
		RULE_expression = 4, RULE_forevery = 5, RULE_exists = 6;
	public static final String[] ruleNames = {
		"equation", "atom", "number", "variable", "expression", "forevery", "exists"
	};

	@Override
	public String getGrammarFileName() { return "tnt.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public tntParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EquationContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tntVisitor ) return ((tntVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); expression(0);
			setState(15); match(6);
			setState(16); expression(0);
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

	public static class AtomContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tntVisitor ) return ((tntVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_atom);
		try {
			setState(20);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18); number();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19); variable();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(tntParser.ZERO, 0); }
		public TerminalNode SUCCESSOR(int i) {
			return getToken(tntParser.SUCCESSOR, i);
		}
		public List<TerminalNode> SUCCESSOR() { return getTokens(tntParser.SUCCESSOR); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tntVisitor ) return ((tntVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUCCESSOR) {
				{
				{
				setState(22); match(SUCCESSOR);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28); match(ZERO);
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> PRIME() { return getTokens(tntParser.PRIME); }
		public TerminalNode D() { return getToken(tntParser.D, 0); }
		public TerminalNode E() { return getToken(tntParser.E, 0); }
		public TerminalNode SUCCESSOR(int i) {
			return getToken(tntParser.SUCCESSOR, i);
		}
		public TerminalNode A() { return getToken(tntParser.A, 0); }
		public TerminalNode PRIME(int i) {
			return getToken(tntParser.PRIME, i);
		}
		public TerminalNode C() { return getToken(tntParser.C, 0); }
		public TerminalNode B() { return getToken(tntParser.B, 0); }
		public List<TerminalNode> SUCCESSOR() { return getTokens(tntParser.SUCCESSOR); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tntVisitor ) return ((tntVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUCCESSOR) {
				{
				{
				setState(30); match(SUCCESSOR);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(37); match(PRIME);
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExistsContext exists() {
			return getRuleContext(ExistsContext.class,0);
		}
		public ForeveryContext forevery() {
			return getRuleContext(ForeveryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tntVisitor ) return ((tntVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			switch (_input.LA(1)) {
			case 7:
				{
				setState(44); match(7);
				setState(45); expression(3);
				}
				break;
			case FOREVERY:
				{
				setState(46); forevery();
				setState(47); expression(2);
				}
				break;
			case EXISTS:
				{
				setState(49); exists();
				setState(50); expression(1);
				}
				break;
			case ZERO:
			case SUCCESSOR:
			case A:
			case B:
			case C:
			case D:
			case E:
				{
				setState(52); atom();
				}
				break;
			case 4:
				{
				setState(53); match(4);
				setState(54); expression(0);
				setState(55); match(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(59);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(60); match(2);
						setState(61); expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(63); match(3);
						setState(64); expression(6);
						}
						break;
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ForeveryContext extends ParserRuleContext {
		public TerminalNode FOREVERY() { return getToken(tntParser.FOREVERY, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ForeveryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forevery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).enterForevery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).exitForevery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tntVisitor ) return ((tntVisitor<? extends T>)visitor).visitForevery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeveryContext forevery() throws RecognitionException {
		ForeveryContext _localctx = new ForeveryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forevery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(FOREVERY);
			setState(71); variable();
			setState(72); match(5);
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

	public static class ExistsContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(tntParser.EXISTS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tntListener ) ((tntListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tntVisitor ) return ((tntVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsContext exists() throws RecognitionException {
		ExistsContext _localctx = new ExistsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(EXISTS);
			setState(75); variable();
			setState(76); match(5);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\24Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3\5\3"+
		"\27\n\3\3\4\7\4\32\n\4\f\4\16\4\35\13\4\3\4\3\4\3\5\7\5\"\n\5\f\5\16\5"+
		"%\13\5\3\5\3\5\7\5)\n\5\f\5\16\5,\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6<\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6D\n\6\f\6"+
		"\16\6G\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\2\t\2\4\6\b\n\f\16\2\3"+
		"\3\2\f\20S\2\20\3\2\2\2\4\26\3\2\2\2\6\33\3\2\2\2\b#\3\2\2\2\n;\3\2\2"+
		"\2\fH\3\2\2\2\16L\3\2\2\2\20\21\5\n\6\2\21\22\7\b\2\2\22\23\5\n\6\2\23"+
		"\3\3\2\2\2\24\27\5\6\4\2\25\27\5\b\5\2\26\24\3\2\2\2\26\25\3\2\2\2\27"+
		"\5\3\2\2\2\30\32\7\13\2\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33"+
		"\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\n\2\2\37\7\3\2\2\2 \""+
		"\7\13\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2"+
		"&*\t\2\2\2\')\7\21\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\t\3\2"+
		"\2\2,*\3\2\2\2-.\b\6\1\2./\7\t\2\2/<\5\n\6\2\60\61\5\f\7\2\61\62\5\n\6"+
		"\2\62<\3\2\2\2\63\64\5\16\b\2\64\65\5\n\6\2\65<\3\2\2\2\66<\5\4\3\2\67"+
		"8\7\6\2\289\5\n\6\29:\7\3\2\2:<\3\2\2\2;-\3\2\2\2;\60\3\2\2\2;\63\3\2"+
		"\2\2;\66\3\2\2\2;\67\3\2\2\2<E\3\2\2\2=>\6\6\2\3>?\7\4\2\2?D\5\n\6\2@"+
		"A\6\6\3\3AB\7\5\2\2BD\5\n\6\2C=\3\2\2\2C@\3\2\2\2DG\3\2\2\2EC\3\2\2\2"+
		"EF\3\2\2\2F\13\3\2\2\2GE\3\2\2\2HI\7\22\2\2IJ\5\b\5\2JK\7\7\2\2K\r\3\2"+
		"\2\2LM\7\23\2\2MN\5\b\5\2NO\7\7\2\2O\17\3\2\2\2\t\26\33#*;CE";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}