// Generated from Extractedredcode.g4 by ANTLR 4.1
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
public class ExtractedredcodeParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		A=10, B=11, AB=12, BA=13, F=14, X=15, I=16, DAT=17, MOV=18, ADD=19, SUB=20, 
		MUL=21, DIV=22, MOD=23, JMP=24, JMZ=25, JMN=26, DJN=27, CMP=28, SLT=29, 
		DJZ=30, SPL=31, ORG=32, NUMBER=33, COMMENT=34, EOL=35, WS=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'>'", "'.'", "','", "'+'", "'-'", "'@'", "'<'", "'#'", "'$'", 
		"'A'", "'B'", "'AB'", "'BA'", "'F'", "'X'", "'I'", "'DAT'", "'MOV'", "'ADD'", 
		"'SUB'", "'MUL'", "'DIV'", "'MOD'", "'JMP'", "'JMZ'", "'JMN'", "'DJN'", 
		"'CMP'", "'SLT'", "'DJZ'", "'SPL'", "'ORG'", "'0'", "';'", "'\n'", "'\t'"
	};
	public static final int
		RULE_file = 0, RULE_line = 1, RULE_instruction = 2, RULE_opcode = 3, RULE_modifier = 4, 
		RULE_mmode = 5, RULE_number = 6, RULE_comment = 7;
	public static final String[] ruleNames = {
		"file", "line", "instruction", "opcode", "modifier", "mmode", "number", 
		"comment"
	};

	@Override
	public String getGrammarFileName() { return "Extractedredcode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExtractedredcodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedredcodeVisitor ) return ((ExtractedredcodeVisitor<? extends T>)visitor).visitFile(this);
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
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16); line();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAT) | (1L << MOV) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << JMP) | (1L << JMZ) | (1L << JMN) | (1L << DJN) | (1L << CMP) | (1L << SLT) | (1L << DJZ) | (1L << SPL) | (1L << ORG) | (1L << COMMENT))) != 0) );
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(ExtractedredcodeParser.EOL, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedredcodeVisitor ) return ((ExtractedredcodeVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			switch (_input.LA(1)) {
			case COMMENT:
				{
				setState(21); comment();
				}
				break;
			case DAT:
			case MOV:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case MOD:
			case JMP:
			case JMZ:
			case JMN:
			case DJN:
			case CMP:
			case SLT:
			case DJZ:
			case SPL:
			case ORG:
				{
				setState(22); instruction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(25); match(EOL);
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

	public static class InstructionContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public OpcodeContext opcode() {
			return getRuleContext(OpcodeContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public MmodeContext mmode(int i) {
			return getRuleContext(MmodeContext.class,i);
		}
		public List<MmodeContext> mmode() {
			return getRuleContexts(MmodeContext.class);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedredcodeVisitor ) return ((ExtractedredcodeVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); opcode();
			setState(30);
			_la = _input.LA(1);
			if (_la==2) {
				{
				setState(28); match(2);
				setState(29); modifier();
				}
			}

			setState(33);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9))) != 0)) {
				{
				setState(32); mmode();
				}
			}

			setState(35); number();
			setState(41);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(36); match(3);
				setState(38);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9))) != 0)) {
					{
					setState(37); mmode();
					}
				}

				setState(40); number();
				}
			}

			setState(44);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(43); comment();
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

	public static class OpcodeContext extends ParserRuleContext {
		public TerminalNode DJZ() { return getToken(ExtractedredcodeParser.DJZ, 0); }
		public TerminalNode MUL() { return getToken(ExtractedredcodeParser.MUL, 0); }
		public TerminalNode CMP() { return getToken(ExtractedredcodeParser.CMP, 0); }
		public TerminalNode ORG() { return getToken(ExtractedredcodeParser.ORG, 0); }
		public TerminalNode JMP() { return getToken(ExtractedredcodeParser.JMP, 0); }
		public TerminalNode DAT() { return getToken(ExtractedredcodeParser.DAT, 0); }
		public TerminalNode ADD() { return getToken(ExtractedredcodeParser.ADD, 0); }
		public TerminalNode SPL() { return getToken(ExtractedredcodeParser.SPL, 0); }
		public TerminalNode DIV() { return getToken(ExtractedredcodeParser.DIV, 0); }
		public TerminalNode JMN() { return getToken(ExtractedredcodeParser.JMN, 0); }
		public TerminalNode MOV() { return getToken(ExtractedredcodeParser.MOV, 0); }
		public TerminalNode JMZ() { return getToken(ExtractedredcodeParser.JMZ, 0); }
		public TerminalNode DJN() { return getToken(ExtractedredcodeParser.DJN, 0); }
		public TerminalNode SLT() { return getToken(ExtractedredcodeParser.SLT, 0); }
		public TerminalNode MOD() { return getToken(ExtractedredcodeParser.MOD, 0); }
		public TerminalNode SUB() { return getToken(ExtractedredcodeParser.SUB, 0); }
		public OpcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).enterOpcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).exitOpcode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedredcodeVisitor ) return ((ExtractedredcodeVisitor<? extends T>)visitor).visitOpcode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcodeContext opcode() throws RecognitionException {
		OpcodeContext _localctx = new OpcodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_opcode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAT) | (1L << MOV) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << JMP) | (1L << JMZ) | (1L << JMN) | (1L << DJN) | (1L << CMP) | (1L << SLT) | (1L << DJZ) | (1L << SPL) | (1L << ORG))) != 0)) ) {
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode X() { return getToken(ExtractedredcodeParser.X, 0); }
		public TerminalNode F() { return getToken(ExtractedredcodeParser.F, 0); }
		public TerminalNode BA() { return getToken(ExtractedredcodeParser.BA, 0); }
		public TerminalNode AB() { return getToken(ExtractedredcodeParser.AB, 0); }
		public TerminalNode A() { return getToken(ExtractedredcodeParser.A, 0); }
		public TerminalNode I() { return getToken(ExtractedredcodeParser.I, 0); }
		public TerminalNode B() { return getToken(ExtractedredcodeParser.B, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedredcodeVisitor ) return ((ExtractedredcodeVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << B) | (1L << AB) | (1L << BA) | (1L << F) | (1L << X) | (1L << I))) != 0)) ) {
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

	public static class MmodeContext extends ParserRuleContext {
		public MmodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).enterMmode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).exitMmode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedredcodeVisitor ) return ((ExtractedredcodeVisitor<? extends T>)visitor).visitMmode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MmodeContext mmode() throws RecognitionException {
		MmodeContext _localctx = new MmodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mmode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9))) != 0)) ) {
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ExtractedredcodeParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedredcodeVisitor ) return ((ExtractedredcodeVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if (_la==4 || _la==5) {
				{
				setState(52);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==5) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(55); match(NUMBER);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ExtractedredcodeParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedredcodeListener ) ((ExtractedredcodeListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedredcodeVisitor ) return ((ExtractedredcodeVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(COMMENT);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3&>\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r\2\16"+
		"\2\25\3\3\3\3\5\3\32\n\3\3\3\3\3\3\4\3\4\3\4\5\4!\n\4\3\4\5\4$\n\4\3\4"+
		"\3\4\3\4\5\4)\n\4\3\4\5\4,\n\4\3\4\5\4/\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\5\b8\n\b\3\b\3\b\3\t\3\t\3\t\2\n\2\4\6\b\n\f\16\20\2\6\3\2\23\"\3\2"+
		"\f\22\4\2\3\3\b\13\3\2\6\7=\2\23\3\2\2\2\4\31\3\2\2\2\6\35\3\2\2\2\b\60"+
		"\3\2\2\2\n\62\3\2\2\2\f\64\3\2\2\2\16\67\3\2\2\2\20;\3\2\2\2\22\24\5\4"+
		"\3\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2"+
		"\2\2\27\32\5\20\t\2\30\32\5\6\4\2\31\27\3\2\2\2\31\30\3\2\2\2\32\33\3"+
		"\2\2\2\33\34\7%\2\2\34\5\3\2\2\2\35 \5\b\5\2\36\37\7\4\2\2\37!\5\n\6\2"+
		" \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\"$\5\f\7\2#\"\3\2\2\2#$\3\2\2\2$%\3\2"+
		"\2\2%+\5\16\b\2&(\7\5\2\2\')\5\f\7\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*,"+
		"\5\16\b\2+&\3\2\2\2+,\3\2\2\2,.\3\2\2\2-/\5\20\t\2.-\3\2\2\2./\3\2\2\2"+
		"/\7\3\2\2\2\60\61\t\2\2\2\61\t\3\2\2\2\62\63\t\3\2\2\63\13\3\2\2\2\64"+
		"\65\t\4\2\2\65\r\3\2\2\2\668\t\5\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2"+
		"\29:\7#\2\2:\17\3\2\2\2;<\7$\2\2<\21\3\2\2\2\n\25\31 #(+.\67";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}