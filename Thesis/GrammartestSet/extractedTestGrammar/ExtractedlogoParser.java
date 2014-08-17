// Generated from Extractedlogo.g4 by ANTLR 4.1
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
public class ExtractedlogoParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__41=1, T__40=2, T__39=3, T__38=4, T__37=5, T__36=6, T__35=7, T__34=8, 
		T__33=9, T__32=10, T__31=11, T__30=12, T__29=13, T__28=14, T__27=15, T__26=16, 
		T__25=17, T__24=18, T__23=19, T__22=20, T__21=21, T__20=22, T__19=23, 
		T__18=24, T__17=25, T__16=26, T__15=27, T__14=28, T__13=29, T__12=30, 
		T__11=31, T__10=32, T__9=33, T__8=34, T__7=35, T__6=36, T__5=37, T__4=38, 
		T__3=39, T__2=40, T__1=41, T__0=42, STRING=43, NUMBER=44, COMMENT=45, 
		EOL=46, WS=47;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'left'", "'stop'", "'random'", "'hideturtle'", "','", 
		"'backward'", "'*'", "'-'", "'['", "':'", "'if'", "'forward'", "'<'", 
		"'pd'", "'to'", "'label'", "'cs'", "'pendown'", "'showturtle'", "'\"'", 
		"'clearscreen'", "'lt'", "'ht'", "'penup'", "'rt'", "'+'", "'fd'", "'print'", 
		"'setxy'", "'for'", "'='", "'pu'", "'repeat'", "'bk'", "'make'", "'st'", 
		"'>'", "'right'", "'/'", "'end'", "'home'", "'a'", "'0'", "';'", "EOL", 
		"WS"
	};
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_cmd = 2, RULE_procedureInvocation = 3, 
		RULE_procedureDeclaration = 4, RULE_parameterDeclarations = 5, RULE_func = 6, 
		RULE_repeat = 7, RULE_block = 8, RULE_ife = 9, RULE_comparison = 10, RULE_comparisonOperator = 11, 
		RULE_make = 12, RULE_print = 13, RULE_name = 14, RULE_stringliteral = 15, 
		RULE_value = 16, RULE_signExpression = 17, RULE_multiplyingExpression = 18, 
		RULE_expression = 19, RULE_deref = 20, RULE_fd = 21, RULE_bk = 22, RULE_rt = 23, 
		RULE_lt = 24, RULE_cs = 25, RULE_pu = 26, RULE_pd = 27, RULE_ht = 28, 
		RULE_st = 29, RULE_home = 30, RULE_stop = 31, RULE_label = 32, RULE_setxy = 33, 
		RULE_random = 34, RULE_fore = 35, RULE_number = 36, RULE_comment = 37;
	public static final String[] ruleNames = {
		"prog", "line", "cmd", "procedureInvocation", "procedureDeclaration", 
		"parameterDeclarations", "func", "repeat", "block", "ife", "comparison", 
		"comparisonOperator", "make", "print", "name", "stringliteral", "value", 
		"signExpression", "multiplyingExpression", "expression", "deref", "fd", 
		"bk", "rt", "lt", "cs", "pu", "pd", "ht", "st", "home", "stop", "label", 
		"setxy", "random", "fore", "number", "comment"
	};

	@Override
	public String getGrammarFileName() { return "Extractedlogo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExtractedlogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(ExtractedlogoParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(ExtractedlogoParser.EOL, i);
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
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitProg(this);
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
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 7) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 39) | (1L << 42) | (1L << STRING) | (1L << COMMENT))) != 0)) {
					{
					setState(76); line();
					}
				}

				setState(79); match(EOL);
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 7) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 39) | (1L << 42) | (1L << STRING) | (1L << COMMENT) | (1L << EOL))) != 0) );
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
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			setState(94);
			switch (_input.LA(1)) {
			case 2:
			case 3:
			case 5:
			case 7:
			case 12:
			case 13:
			case 15:
			case 17:
			case 18:
			case 19:
			case 20:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 28:
			case 29:
			case 30:
			case 31:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
			case 39:
			case 42:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84); cmd();
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 7) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 39) | (1L << 42) | (1L << STRING))) != 0) );
				setState(90);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(89); comment();
					}
				}

				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); comment();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 3);
				{
				setState(93); procedureDeclaration();
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

	public static class CmdContext extends ParserRuleContext {
		public HomeContext home() {
			return getRuleContext(HomeContext.class,0);
		}
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public HtContext ht() {
			return getRuleContext(HtContext.class,0);
		}
		public StContext st() {
			return getRuleContext(StContext.class,0);
		}
		public MakeContext make() {
			return getRuleContext(MakeContext.class,0);
		}
		public BkContext bk() {
			return getRuleContext(BkContext.class,0);
		}
		public ForeContext fore() {
			return getRuleContext(ForeContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StopContext stop() {
			return getRuleContext(StopContext.class,0);
		}
		public IfeContext ife() {
			return getRuleContext(IfeContext.class,0);
		}
		public LtContext lt() {
			return getRuleContext(LtContext.class,0);
		}
		public SetxyContext setxy() {
			return getRuleContext(SetxyContext.class,0);
		}
		public ProcedureInvocationContext procedureInvocation() {
			return getRuleContext(ProcedureInvocationContext.class,0);
		}
		public PuContext pu() {
			return getRuleContext(PuContext.class,0);
		}
		public FdContext fd() {
			return getRuleContext(FdContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public CsContext cs() {
			return getRuleContext(CsContext.class,0);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case 34:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); repeat();
				}
				break;
			case 13:
			case 28:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); fd();
				}
				break;
			case 7:
			case 35:
				enterOuterAlt(_localctx, 3);
				{
				setState(98); bk();
				}
				break;
			case 26:
			case 39:
				enterOuterAlt(_localctx, 4);
				{
				setState(99); rt();
				}
				break;
			case 2:
			case 23:
				enterOuterAlt(_localctx, 5);
				{
				setState(100); lt();
				}
				break;
			case 18:
			case 22:
				enterOuterAlt(_localctx, 6);
				{
				setState(101); cs();
				}
				break;
			case 25:
			case 33:
				enterOuterAlt(_localctx, 7);
				{
				setState(102); pu();
				}
				break;
			case 15:
			case 19:
				enterOuterAlt(_localctx, 8);
				{
				setState(103); pd();
				}
				break;
			case 5:
			case 24:
				enterOuterAlt(_localctx, 9);
				{
				setState(104); ht();
				}
				break;
			case 20:
			case 37:
				enterOuterAlt(_localctx, 10);
				{
				setState(105); st();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 11);
				{
				setState(106); home();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 12);
				{
				setState(107); label();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 13);
				{
				setState(108); setxy();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 14);
				{
				setState(109); make();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 15);
				{
				setState(110); print();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 16);
				{
				setState(111); procedureInvocation();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 17);
				{
				setState(112); ife();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 18);
				{
				setState(113); stop();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 19);
				{
				setState(114); fore();
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

	public static class ProcedureInvocationContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ProcedureInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterProcedureInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitProcedureInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitProcedureInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureInvocationContext procedureInvocation() throws RecognitionException {
		ProcedureInvocationContext _localctx = new ProcedureInvocationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedureInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); name();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 9) | (1L << 11) | (1L << 27) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(118); expression();
				}
				}
				setState(123);
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

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<ParameterDeclarationsContext> parameterDeclarations() {
			return getRuleContexts(ParameterDeclarationsContext.class);
		}
		public List<TerminalNode> EOL() { return getTokens(ExtractedlogoParser.EOL); }
		public ParameterDeclarationsContext parameterDeclarations(int i) {
			return getRuleContext(ParameterDeclarationsContext.class,i);
		}
		public TerminalNode EOL(int i) {
			return getToken(ExtractedlogoParser.EOL, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(16);
			setState(125); name();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==11) {
				{
				{
				setState(126); parameterDeclarations();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(132); match(EOL);
				}
				break;
			}
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 7) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 39) | (1L << 42) | (1L << STRING) | (1L << COMMENT))) != 0)) {
					{
					setState(135); line();
					}
				}

				setState(138); match(EOL);
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 7) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 39) | (1L << 42) | (1L << STRING) | (1L << COMMENT) | (1L << EOL))) != 0) );
			setState(143); match(41);
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

	public static class ParameterDeclarationsContext extends ParserRuleContext {
		public List<ParameterDeclarationsContext> parameterDeclarations() {
			return getRuleContexts(ParameterDeclarationsContext.class);
		}
		public ParameterDeclarationsContext parameterDeclarations(int i) {
			return getRuleContext(ParameterDeclarationsContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParameterDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterParameterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitParameterDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitParameterDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationsContext parameterDeclarations() throws RecognitionException {
		ParameterDeclarationsContext _localctx = new ParameterDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterDeclarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(11);
			setState(146); name();
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(147); match(6);
					setState(148); parameterDeclarations();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class FuncContext extends ParserRuleContext {
		public RandomContext random() {
			return getRuleContext(RandomContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); random();
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

	public static class RepeatContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(34);
			setState(157); number();
			setState(158); block();
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

	public static class BlockContext extends ParserRuleContext {
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(10);
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161); cmd();
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 7) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 39) | (1L << 42) | (1L << STRING))) != 0) );
			setState(166); match(1);
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

	public static class IfeContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ife; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterIfe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitIfe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitIfe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfeContext ife() throws RecognitionException {
		IfeContext _localctx = new IfeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ife);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(12);
			setState(169); comparison();
			setState(170); block();
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

	public static class ComparisonContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); expression();
			setState(173); comparisonOperator();
			setState(174); expression();
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 32) | (1L << 38))) != 0)) ) {
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

	public static class MakeContext extends ParserRuleContext {
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_make; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterMake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitMake(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitMake(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MakeContext make() throws RecognitionException {
		MakeContext _localctx = new MakeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_make);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(36);
			setState(179); stringliteral();
			setState(180); value();
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

	public static class PrintContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(29);
			setState(183); value();
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
		public TerminalNode STRING() { return getToken(ExtractedlogoParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(STRING);
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

	public static class StringliteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ExtractedlogoParser.STRING, 0); }
		public StringliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterStringliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitStringliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitStringliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringliteralContext stringliteral() throws RecognitionException {
		StringliteralContext _localctx = new StringliteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stringliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(21);
			setState(188); match(STRING);
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

	public static class ValueContext extends ParserRuleContext {
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190); stringliteral();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191); expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192); deref();
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

	public static class SignExpressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public SignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterSignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitSignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitSignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignExpressionContext signExpression() throws RecognitionException {
		SignExpressionContext _localctx = new SignExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_signExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==9 || _la==27) {
				{
				{
				setState(195);
				_la = _input.LA(1);
				if ( !(_la==9 || _la==27) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(201); number();
				}
				break;
			case 11:
				{
				setState(202); deref();
				}
				break;
			case 4:
				{
				setState(203); func();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<SignExpressionContext> signExpression() {
			return getRuleContexts(SignExpressionContext.class);
		}
		public SignExpressionContext signExpression(int i) {
			return getRuleContext(SignExpressionContext.class,i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitMultiplyingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitMultiplyingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplyingExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206); signExpression();
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					_la = _input.LA(1);
					if ( !(_la==8 || _la==40) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(208); signExpression();
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214); multiplyingExpression();
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					_la = _input.LA(1);
					if ( !(_la==9 || _la==27) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(216); multiplyingExpression();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class DerefContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterDeref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitDeref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitDeref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerefContext deref() throws RecognitionException {
		DerefContext _localctx = new DerefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(11);
			setState(223); name();
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

	public static class FdContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterFd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitFd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitFd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FdContext fd() throws RecognitionException {
		FdContext _localctx = new FdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==13 || _la==28) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(226); expression();
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

	public static class BkContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterBk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitBk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitBk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BkContext bk() throws RecognitionException {
		BkContext _localctx = new BkContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==7 || _la==35) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(229); expression();
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

	public static class RtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterRt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitRt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitRt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RtContext rt() throws RecognitionException {
		RtContext _localctx = new RtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !(_la==26 || _la==39) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(232); expression();
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

	public static class LtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtContext lt() throws RecognitionException {
		LtContext _localctx = new LtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(_la==2 || _la==23) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(235); expression();
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

	public static class CsContext extends ParserRuleContext {
		public CsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterCs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitCs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitCs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsContext cs() throws RecognitionException {
		CsContext _localctx = new CsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==18 || _la==22) ) {
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

	public static class PuContext extends ParserRuleContext {
		public PuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterPu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitPu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitPu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuContext pu() throws RecognitionException {
		PuContext _localctx = new PuContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !(_la==25 || _la==33) ) {
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

	public static class PdContext extends ParserRuleContext {
		public PdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterPd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitPd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitPd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PdContext pd() throws RecognitionException {
		PdContext _localctx = new PdContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !(_la==15 || _la==19) ) {
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

	public static class HtContext extends ParserRuleContext {
		public HtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ht; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterHt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitHt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitHt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtContext ht() throws RecognitionException {
		HtContext _localctx = new HtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ht);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==5 || _la==24) ) {
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

	public static class StContext extends ParserRuleContext {
		public StContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StContext st() throws RecognitionException {
		StContext _localctx = new StContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==20 || _la==37) ) {
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

	public static class HomeContext extends ParserRuleContext {
		public HomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterHome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitHome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitHome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HomeContext home() throws RecognitionException {
		HomeContext _localctx = new HomeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_home);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); match(42);
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

	public static class StopContext extends ParserRuleContext {
		public StopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitStop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitStop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StopContext stop() throws RecognitionException {
		StopContext _localctx = new StopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(3);
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
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); match(17);
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

	public static class SetxyContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SetxyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setxy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterSetxy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitSetxy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitSetxy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetxyContext setxy() throws RecognitionException {
		SetxyContext _localctx = new SetxyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_setxy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(30);
			setState(254); expression();
			setState(255); expression();
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

	public static class RandomContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RandomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterRandom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitRandom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitRandom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RandomContext random() throws RecognitionException {
		RandomContext _localctx = new RandomContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_random);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(4);
			setState(258); expression();
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

	public static class ForeContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ForeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterFore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitFore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitFore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeContext fore() throws RecognitionException {
		ForeContext _localctx = new ForeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(31);
			setState(261); match(10);
			setState(262); name();
			setState(263); expression();
			setState(264); expression();
			setState(265); expression();
			setState(266); match(1);
			setState(267); block();
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
		public TerminalNode NUMBER() { return getToken(ExtractedlogoParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269); match(NUMBER);
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
		public TerminalNode COMMENT() { return getToken(ExtractedlogoParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedlogoListener ) ((ExtractedlogoListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedlogoVisitor ) return ((ExtractedlogoVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(COMMENT);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\61\u0114\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\5\2P\n\2\3\2\6\2S\n\2"+
		"\r\2\16\2T\3\3\6\3X\n\3\r\3\16\3Y\3\3\5\3]\n\3\3\3\3\3\5\3a\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4v\n\4\3\5\3\5\7\5z\n\5\f\5\16\5}\13\5\3\6\3\6\3\6\7\6\u0082\n\6\f"+
		"\6\16\6\u0085\13\6\3\6\5\6\u0088\n\6\3\6\5\6\u008b\n\6\3\6\6\6\u008e\n"+
		"\6\r\6\16\6\u008f\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u0098\n\7\f\7\16\7\u009b"+
		"\13\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\6\n\u00a5\n\n\r\n\16\n\u00a6\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00c4\n\22"+
		"\3\23\7\23\u00c7\n\23\f\23\16\23\u00ca\13\23\3\23\3\23\3\23\5\23\u00cf"+
		"\n\23\3\24\3\24\3\24\7\24\u00d4\n\24\f\24\16\24\u00d7\13\24\3\25\3\25"+
		"\3\25\7\25\u00dc\n\25\f\25\16\25\u00df\13\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\2(\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\16\5\2\20\20\"\""+
		"((\4\2\13\13\35\35\4\2\n\n**\4\2\17\17\36\36\4\2\t\t%%\4\2\34\34))\4\2"+
		"\4\4\31\31\4\2\24\24\30\30\4\2\33\33##\4\2\21\21\25\25\4\2\7\7\32\32\4"+
		"\2\26\26\'\'\u0113\2R\3\2\2\2\4`\3\2\2\2\6u\3\2\2\2\bw\3\2\2\2\n~\3\2"+
		"\2\2\f\u0093\3\2\2\2\16\u009c\3\2\2\2\20\u009e\3\2\2\2\22\u00a2\3\2\2"+
		"\2\24\u00aa\3\2\2\2\26\u00ae\3\2\2\2\30\u00b2\3\2\2\2\32\u00b4\3\2\2\2"+
		"\34\u00b8\3\2\2\2\36\u00bb\3\2\2\2 \u00bd\3\2\2\2\"\u00c3\3\2\2\2$\u00c8"+
		"\3\2\2\2&\u00d0\3\2\2\2(\u00d8\3\2\2\2*\u00e0\3\2\2\2,\u00e3\3\2\2\2."+
		"\u00e6\3\2\2\2\60\u00e9\3\2\2\2\62\u00ec\3\2\2\2\64\u00ef\3\2\2\2\66\u00f1"+
		"\3\2\2\28\u00f3\3\2\2\2:\u00f5\3\2\2\2<\u00f7\3\2\2\2>\u00f9\3\2\2\2@"+
		"\u00fb\3\2\2\2B\u00fd\3\2\2\2D\u00ff\3\2\2\2F\u0103\3\2\2\2H\u0106\3\2"+
		"\2\2J\u010f\3\2\2\2L\u0111\3\2\2\2NP\5\4\3\2ON\3\2\2\2OP\3\2\2\2PQ\3\2"+
		"\2\2QS\7\60\2\2RO\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\3\3\2\2\2VX\5"+
		"\6\4\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[]\5L\'\2\\["+
		"\3\2\2\2\\]\3\2\2\2]a\3\2\2\2^a\5L\'\2_a\5\n\6\2`W\3\2\2\2`^\3\2\2\2`"+
		"_\3\2\2\2a\5\3\2\2\2bv\5\20\t\2cv\5,\27\2dv\5.\30\2ev\5\60\31\2fv\5\62"+
		"\32\2gv\5\64\33\2hv\5\66\34\2iv\58\35\2jv\5:\36\2kv\5<\37\2lv\5> \2mv"+
		"\5B\"\2nv\5D#\2ov\5\32\16\2pv\5\34\17\2qv\5\b\5\2rv\5\24\13\2sv\5@!\2"+
		"tv\5H%\2ub\3\2\2\2uc\3\2\2\2ud\3\2\2\2ue\3\2\2\2uf\3\2\2\2ug\3\2\2\2u"+
		"h\3\2\2\2ui\3\2\2\2uj\3\2\2\2uk\3\2\2\2ul\3\2\2\2um\3\2\2\2un\3\2\2\2"+
		"uo\3\2\2\2up\3\2\2\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\7\3\2\2"+
		"\2w{\5\36\20\2xz\5(\25\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\t\3"+
		"\2\2\2}{\3\2\2\2~\177\7\22\2\2\177\u0083\5\36\20\2\u0080\u0082\5\f\7\2"+
		"\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\60\2\2"+
		"\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089\u008b"+
		"\5\4\3\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\7\60\2\2\u008d\u008a\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7+\2\2\u0092"+
		"\13\3\2\2\2\u0093\u0094\7\r\2\2\u0094\u0099\5\36\20\2\u0095\u0096\7\b"+
		"\2\2\u0096\u0098\5\f\7\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\r\3\2\2\2\u009b\u0099\3\2\2\2"+
		"\u009c\u009d\5F$\2\u009d\17\3\2\2\2\u009e\u009f\7$\2\2\u009f\u00a0\5J"+
		"&\2\u00a0\u00a1\5\22\n\2\u00a1\21\3\2\2\2\u00a2\u00a4\7\f\2\2\u00a3\u00a5"+
		"\5\6\4\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\3\2\2\u00a9\23\3\2\2"+
		"\2\u00aa\u00ab\7\16\2\2\u00ab\u00ac\5\26\f\2\u00ac\u00ad\5\22\n\2\u00ad"+
		"\25\3\2\2\2\u00ae\u00af\5(\25\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\5(\25"+
		"\2\u00b1\27\3\2\2\2\u00b2\u00b3\t\2\2\2\u00b3\31\3\2\2\2\u00b4\u00b5\7"+
		"&\2\2\u00b5\u00b6\5 \21\2\u00b6\u00b7\5\"\22\2\u00b7\33\3\2\2\2\u00b8"+
		"\u00b9\7\37\2\2\u00b9\u00ba\5\"\22\2\u00ba\35\3\2\2\2\u00bb\u00bc\7-\2"+
		"\2\u00bc\37\3\2\2\2\u00bd\u00be\7\27\2\2\u00be\u00bf\7-\2\2\u00bf!\3\2"+
		"\2\2\u00c0\u00c4\5 \21\2\u00c1\u00c4\5(\25\2\u00c2\u00c4\5*\26\2\u00c3"+
		"\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4#\3\2\2\2"+
		"\u00c5\u00c7\t\3\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ce\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cf\5J&\2\u00cc\u00cf\5*\26\2\u00cd\u00cf\5\16\b\2\u00ce\u00cb\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf%\3\2\2\2\u00d0\u00d5"+
		"\5$\23\2\u00d1\u00d2\t\4\2\2\u00d2\u00d4\5$\23\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\'\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d8\u00dd\5&\24\2\u00d9\u00da\t\3\2\2\u00da\u00dc"+
		"\5&\24\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de)\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\r\2\2"+
		"\u00e1\u00e2\5\36\20\2\u00e2+\3\2\2\2\u00e3\u00e4\t\5\2\2\u00e4\u00e5"+
		"\5(\25\2\u00e5-\3\2\2\2\u00e6\u00e7\t\6\2\2\u00e7\u00e8\5(\25\2\u00e8"+
		"/\3\2\2\2\u00e9\u00ea\t\7\2\2\u00ea\u00eb\5(\25\2\u00eb\61\3\2\2\2\u00ec"+
		"\u00ed\t\b\2\2\u00ed\u00ee\5(\25\2\u00ee\63\3\2\2\2\u00ef\u00f0\t\t\2"+
		"\2\u00f0\65\3\2\2\2\u00f1\u00f2\t\n\2\2\u00f2\67\3\2\2\2\u00f3\u00f4\t"+
		"\13\2\2\u00f49\3\2\2\2\u00f5\u00f6\t\f\2\2\u00f6;\3\2\2\2\u00f7\u00f8"+
		"\t\r\2\2\u00f8=\3\2\2\2\u00f9\u00fa\7,\2\2\u00fa?\3\2\2\2\u00fb\u00fc"+
		"\7\5\2\2\u00fcA\3\2\2\2\u00fd\u00fe\7\23\2\2\u00feC\3\2\2\2\u00ff\u0100"+
		"\7 \2\2\u0100\u0101\5(\25\2\u0101\u0102\5(\25\2\u0102E\3\2\2\2\u0103\u0104"+
		"\7\6\2\2\u0104\u0105\5(\25\2\u0105G\3\2\2\2\u0106\u0107\7!\2\2\u0107\u0108"+
		"\7\f\2\2\u0108\u0109\5\36\20\2\u0109\u010a\5(\25\2\u010a\u010b\5(\25\2"+
		"\u010b\u010c\5(\25\2\u010c\u010d\7\3\2\2\u010d\u010e\5\22\n\2\u010eI\3"+
		"\2\2\2\u010f\u0110\7.\2\2\u0110K\3\2\2\2\u0111\u0112\7/\2\2\u0112M\3\2"+
		"\2\2\24OTY\\`u{\u0083\u0087\u008a\u008f\u0099\u00a6\u00c3\u00c8\u00ce"+
		"\u00d5\u00dd";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}