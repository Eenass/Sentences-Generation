// Generated from asm6502.g4 by ANTLR 4.1
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
public class asm6502Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, ASSEMBLER_INSTRUCTION=9, 
		OPCODE=10, NAME=11, NUMBER=12, COMMENT=13, STRING=14, EOL=15, WS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "','", "'+'", "'*'", "'-'", "':'", "'('", "'#'", "ASSEMBLER_INSTRUCTION", 
		"OPCODE", "NAME", "NUMBER", "COMMENT", "STRING", "EOL", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_instruction = 2, RULE_assemblerinstruction = 3, 
		RULE_assembleropcode = 4, RULE_lbl = 5, RULE_argumentlist = 6, RULE_label = 7, 
		RULE_argument = 8, RULE_prefix = 9, RULE_string = 10, RULE_name = 11, 
		RULE_number = 12, RULE_comment = 13, RULE_opcode = 14;
	public static final String[] ruleNames = {
		"prog", "line", "instruction", "assemblerinstruction", "assembleropcode", 
		"lbl", "argumentlist", "label", "argument", "prefix", "string", "name", 
		"number", "comment", "opcode"
	};

	@Override
	public String getGrammarFileName() { return "asm6502.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public asm6502Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(asm6502Parser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(asm6502Parser.EOL, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 7) | (1L << 8) | (1L << ASSEMBLER_INSTRUCTION) | (1L << OPCODE) | (1L << NAME) | (1L << NUMBER) | (1L << COMMENT) | (1L << STRING))) != 0)) {
					{
					setState(30); line();
					}
				}

				setState(33); match(EOL);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 7) | (1L << 8) | (1L << ASSEMBLER_INSTRUCTION) | (1L << OPCODE) | (1L << NAME) | (1L << NUMBER) | (1L << COMMENT) | (1L << STRING) | (1L << EOL))) != 0) );
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
		public AssemblerinstructionContext assemblerinstruction() {
			return getRuleContext(AssemblerinstructionContext.class,0);
		}
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); comment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); instruction();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40); assemblerinstruction();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41); lbl();
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

	public static class InstructionContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public OpcodeContext opcode() {
			return getRuleContext(OpcodeContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitInstruction(this);
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
			setState(45);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(44); label();
				}
			}

			setState(47); opcode();
			setState(49);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 7) | (1L << 8) | (1L << NAME) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(48); argumentlist();
				}
			}

			setState(52);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(51); comment();
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

	public static class AssemblerinstructionContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public AssembleropcodeContext assembleropcode() {
			return getRuleContext(AssembleropcodeContext.class,0);
		}
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public AssemblerinstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerinstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterAssemblerinstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitAssemblerinstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitAssemblerinstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblerinstructionContext assemblerinstruction() throws RecognitionException {
		AssemblerinstructionContext _localctx = new AssemblerinstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assemblerinstruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 7) | (1L << 8) | (1L << NAME) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(54); argument();
				}
			}

			setState(57); assembleropcode();
			setState(59);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 7) | (1L << 8) | (1L << NAME) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(58); argumentlist();
				}
			}

			setState(62);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(61); comment();
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

	public static class AssembleropcodeContext extends ParserRuleContext {
		public TerminalNode ASSEMBLER_INSTRUCTION() { return getToken(asm6502Parser.ASSEMBLER_INSTRUCTION, 0); }
		public AssembleropcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembleropcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterAssembleropcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitAssembleropcode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitAssembleropcode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssembleropcodeContext assembleropcode() throws RecognitionException {
		AssembleropcodeContext _localctx = new AssembleropcodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assembleropcode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(ASSEMBLER_INSTRUCTION);
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

	public static class LblContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterLbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitLbl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitLbl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LblContext lbl() throws RecognitionException {
		LblContext _localctx = new LblContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lbl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); label();
			setState(67); match(6);
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

	public static class ArgumentlistContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public ArgumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterArgumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitArgumentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitArgumentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); argument();
			setState(72);
			_la = _input.LA(1);
			if (_la==2) {
				{
				setState(70); match(2);
				setState(71); argumentlist();
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

	public static class LabelContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); name();
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

	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argument);
		int _la;
		try {
			setState(93);
			switch (_input.LA(1)) {
			case 4:
			case 8:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				_la = _input.LA(1);
				if (_la==8) {
					{
					setState(76); prefix();
					}
				}

				setState(83);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(79); number();
					}
					break;
				case NAME:
					{
					setState(80); name();
					}
					break;
				case STRING:
					{
					setState(81); string();
					}
					break;
				case 4:
					{
					setState(82); match(4);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(87);
				_la = _input.LA(1);
				if (_la==3 || _la==5) {
					{
					setState(85);
					_la = _input.LA(1);
					if ( !(_la==3 || _la==5) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(86); number();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); match(7);
				setState(90); argument();
				setState(91); match(1);
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

	public static class PrefixContext extends ParserRuleContext {
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(8);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(asm6502Parser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(STRING);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(asm6502Parser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(NAME);
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
		public TerminalNode NUMBER() { return getToken(asm6502Parser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(NUMBER);
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
		public TerminalNode COMMENT() { return getToken(asm6502Parser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(COMMENT);
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
		public TerminalNode OPCODE() { return getToken(asm6502Parser.OPCODE, 0); }
		public OpcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterOpcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitOpcode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm6502Visitor ) return ((asm6502Visitor<? extends T>)visitor).visitOpcode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcodeContext opcode() throws RecognitionException {
		OpcodeContext _localctx = new OpcodeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_opcode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(OPCODE);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\22n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\5\2\"\n\2\3\2\6\2%\n"+
		"\2\r\2\16\2&\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\5\4\60\n\4\3\4\3\4\5\4\64\n"+
		"\4\3\4\5\4\67\n\4\3\5\5\5:\n\5\3\5\3\5\5\5>\n\5\3\5\5\5A\n\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\5\bK\n\b\3\t\3\t\3\n\5\nP\n\n\3\n\3\n\3\n\3\n\5"+
		"\nV\n\n\3\n\3\n\5\nZ\n\n\3\n\3\n\3\n\3\n\5\n`\n\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36\2\3\4\2\5\5\7\7p\2$\3\2\2\2\4,\3\2\2\2\6/\3\2\2\2\b9\3"+
		"\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16G\3\2\2\2\20L\3\2\2\2\22_\3\2\2\2\24a\3"+
		"\2\2\2\26c\3\2\2\2\30e\3\2\2\2\32g\3\2\2\2\34i\3\2\2\2\36k\3\2\2\2 \""+
		"\5\4\3\2! \3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#%\7\21\2\2$!\3\2\2\2%&\3\2\2"+
		"\2&$\3\2\2\2&\'\3\2\2\2\'\3\3\2\2\2(-\5\34\17\2)-\5\6\4\2*-\5\b\5\2+-"+
		"\5\f\7\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2.\60\5\20\t"+
		"\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\63\5\36\20\2\62\64\5\16\b\2"+
		"\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5\34\17\2\66\65\3\2\2"+
		"\2\66\67\3\2\2\2\67\7\3\2\2\28:\5\22\n\298\3\2\2\29:\3\2\2\2:;\3\2\2\2"+
		";=\5\n\6\2<>\5\16\b\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\5\34\17\2@?\3\2"+
		"\2\2@A\3\2\2\2A\t\3\2\2\2BC\7\13\2\2C\13\3\2\2\2DE\5\20\t\2EF\7\b\2\2"+
		"F\r\3\2\2\2GJ\5\22\n\2HI\7\4\2\2IK\5\16\b\2JH\3\2\2\2JK\3\2\2\2K\17\3"+
		"\2\2\2LM\5\30\r\2M\21\3\2\2\2NP\5\24\13\2ON\3\2\2\2OP\3\2\2\2PU\3\2\2"+
		"\2QV\5\32\16\2RV\5\30\r\2SV\5\26\f\2TV\7\6\2\2UQ\3\2\2\2UR\3\2\2\2US\3"+
		"\2\2\2UT\3\2\2\2VY\3\2\2\2WX\t\2\2\2XZ\5\32\16\2YW\3\2\2\2YZ\3\2\2\2Z"+
		"`\3\2\2\2[\\\7\t\2\2\\]\5\22\n\2]^\7\3\2\2^`\3\2\2\2_O\3\2\2\2_[\3\2\2"+
		"\2`\23\3\2\2\2ab\7\n\2\2b\25\3\2\2\2cd\7\20\2\2d\27\3\2\2\2ef\7\r\2\2"+
		"f\31\3\2\2\2gh\7\16\2\2h\33\3\2\2\2ij\7\17\2\2j\35\3\2\2\2kl\7\f\2\2l"+
		"\37\3\2\2\2\20!&,/\63\669=@JOUY_";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}