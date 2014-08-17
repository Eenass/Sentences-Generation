// Generated from ExtractedIRI.g4 by ANTLR 4.1
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
public class ExtractedIRIParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UCSCHAR=1, IPRIVATE=2, D0=3, D1=4, D2=5, D3=6, D4=7, D5=8, D6=9, D7=10, 
		D8=11, D9=12, A=13, B=14, C=15, D=16, E=17, F=18, G=19, H=20, I=21, J=22, 
		K=23, L=24, M=25, N=26, O=27, P=28, Q=29, R=30, S=31, T=32, U=33, V=34, 
		W=35, X=36, Y=37, Z=38, COL2=39, COL=40, DOT=41, PERCENT=42, HYPHEN=43, 
		TILDE=44, USCORE=45, EXCL=46, DOLLAR=47, AMP=48, SQUOTE=49, OPAREN=50, 
		CPAREN=51, STAR=52, PLUS=53, COMMA=54, SCOL=55, EQUALS=56, FSLASH2=57, 
		FSLASH=58, QMARK=59, HASH=60, OBRACK=61, CBRACK=62, AT=63;
	public static final String[] tokenNames = {
		"<INVALID>", "UCSCHAR", "IPRIVATE", "'0'", "'1'", "'2'", "'3'", "'4'", 
		"'5'", "'6'", "'7'", "'8'", "'9'", "'a'", "'b'", "'c'", "'d'", "'e'", 
		"'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", 
		"'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", 
		"'z'", "'::'", "':'", "'.'", "'%'", "'-'", "'~'", "'_'", "'!'", "'$'", 
		"'&'", "'''", "'('", "')'", "'*'", "'+'", "','", "';'", "'='", "'//'", 
		"'/'", "'?'", "'#'", "'['", "']'", "'@'"
	};
	public static final int
		RULE_parse = 0, RULE_iri = 1, RULE_ihier_part = 2, RULE_iri_reference = 3, 
		RULE_absolute_iri = 4, RULE_irelative_ref = 5, RULE_irelative_part = 6, 
		RULE_iauthority = 7, RULE_iuserinfo = 8, RULE_ihost = 9, RULE_ireg_name = 10, 
		RULE_ipath = 11, RULE_ipath_abempty = 12, RULE_ipath_absolute = 13, RULE_ipath_noscheme = 14, 
		RULE_ipath_rootless = 15, RULE_ipath_empty = 16, RULE_isegment = 17, RULE_isegment_nz = 18, 
		RULE_isegment_nz_nc = 19, RULE_ipchar = 20, RULE_iquery = 21, RULE_ifragment = 22, 
		RULE_iunreserved = 23, RULE_scheme = 24, RULE_port = 25, RULE_ip_literal = 26, 
		RULE_ip_v_future = 27, RULE_ip_v6_address = 28, RULE_h16 = 29, RULE_ls32 = 30, 
		RULE_ip_v4_address = 31, RULE_dec_octet = 32, RULE_pct_encoded = 33, RULE_unreserved = 34, 
		RULE_reserved = 35, RULE_gen_delims = 36, RULE_sub_delims = 37, RULE_alpha = 38, 
		RULE_hexdig = 39, RULE_digit = 40, RULE_non_zero_digit = 41;
	public static final String[] ruleNames = {
		"parse", "iri", "ihier_part", "iri_reference", "absolute_iri", "irelative_ref", 
		"irelative_part", "iauthority", "iuserinfo", "ihost", "ireg_name", "ipath", 
		"ipath_abempty", "ipath_absolute", "ipath_noscheme", "ipath_rootless", 
		"ipath_empty", "isegment", "isegment_nz", "isegment_nz_nc", "ipchar", 
		"iquery", "ifragment", "iunreserved", "scheme", "port", "ip_literal", 
		"ip_v_future", "ip_v6_address", "h16", "ls32", "ip_v4_address", "dec_octet", 
		"pct_encoded", "unreserved", "reserved", "gen_delims", "sub_delims", "alpha", 
		"hexdig", "digit", "non_zero_digit"
	};

	@Override
	public String getGrammarFileName() { return "ExtractedIRI.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExtractedIRIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExtractedIRIParser.EOF, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); iri();
			setState(85); match(EOF);
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

	public static class IriContext extends ParserRuleContext {
		public IqueryContext iquery() {
			return getRuleContext(IqueryContext.class,0);
		}
		public Ihier_partContext ihier_part() {
			return getRuleContext(Ihier_partContext.class,0);
		}
		public IfragmentContext ifragment() {
			return getRuleContext(IfragmentContext.class,0);
		}
		public SchemeContext scheme() {
			return getRuleContext(SchemeContext.class,0);
		}
		public IriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IriContext iri() throws RecognitionException {
		IriContext _localctx = new IriContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_iri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); scheme();
			setState(88); match(COL);
			setState(89); ihier_part();
			setState(92);
			_la = _input.LA(1);
			if (_la==QMARK) {
				{
				setState(90); match(QMARK);
				setState(91); iquery();
				}
			}

			setState(96);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(94); match(HASH);
				setState(95); ifragment();
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

	public static class Ihier_partContext extends ParserRuleContext {
		public Ipath_emptyContext ipath_empty() {
			return getRuleContext(Ipath_emptyContext.class,0);
		}
		public Ipath_abemptyContext ipath_abempty() {
			return getRuleContext(Ipath_abemptyContext.class,0);
		}
		public Ipath_rootlessContext ipath_rootless() {
			return getRuleContext(Ipath_rootlessContext.class,0);
		}
		public Ipath_absoluteContext ipath_absolute() {
			return getRuleContext(Ipath_absoluteContext.class,0);
		}
		public IauthorityContext iauthority() {
			return getRuleContext(IauthorityContext.class,0);
		}
		public Ihier_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ihier_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIhier_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIhier_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIhier_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ihier_partContext ihier_part() throws RecognitionException {
		Ihier_partContext _localctx = new Ihier_partContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ihier_part);
		try {
			setState(105);
			switch (_input.LA(1)) {
			case FSLASH2:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); match(FSLASH2);
				setState(99); iauthority();
				setState(100); ipath_abempty();
				}
				break;
			case FSLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); ipath_absolute();
				}
				break;
			case UCSCHAR:
			case D0:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case J:
			case K:
			case L:
			case M:
			case N:
			case O:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case U:
			case V:
			case W:
			case X:
			case Y:
			case Z:
			case COL:
			case DOT:
			case PERCENT:
			case HYPHEN:
			case TILDE:
			case USCORE:
			case EXCL:
			case DOLLAR:
			case AMP:
			case SQUOTE:
			case OPAREN:
			case CPAREN:
			case STAR:
			case PLUS:
			case COMMA:
			case SCOL:
			case EQUALS:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(103); ipath_rootless();
				}
				break;
			case EOF:
			case QMARK:
			case HASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(104); ipath_empty();
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

	public static class Iri_referenceContext extends ParserRuleContext {
		public Irelative_refContext irelative_ref() {
			return getRuleContext(Irelative_refContext.class,0);
		}
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public Iri_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iri_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIri_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIri_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIri_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iri_referenceContext iri_reference() throws RecognitionException {
		Iri_referenceContext _localctx = new Iri_referenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_iri_reference);
		try {
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); iri();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); irelative_ref();
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

	public static class Absolute_iriContext extends ParserRuleContext {
		public IqueryContext iquery() {
			return getRuleContext(IqueryContext.class,0);
		}
		public Ihier_partContext ihier_part() {
			return getRuleContext(Ihier_partContext.class,0);
		}
		public SchemeContext scheme() {
			return getRuleContext(SchemeContext.class,0);
		}
		public Absolute_iriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absolute_iri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterAbsolute_iri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitAbsolute_iri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitAbsolute_iri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Absolute_iriContext absolute_iri() throws RecognitionException {
		Absolute_iriContext _localctx = new Absolute_iriContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_absolute_iri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); scheme();
			setState(112); match(COL);
			setState(113); ihier_part();
			setState(116);
			_la = _input.LA(1);
			if (_la==QMARK) {
				{
				setState(114); match(QMARK);
				setState(115); iquery();
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

	public static class Irelative_refContext extends ParserRuleContext {
		public IqueryContext iquery() {
			return getRuleContext(IqueryContext.class,0);
		}
		public Irelative_partContext irelative_part() {
			return getRuleContext(Irelative_partContext.class,0);
		}
		public IfragmentContext ifragment() {
			return getRuleContext(IfragmentContext.class,0);
		}
		public Irelative_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irelative_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIrelative_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIrelative_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIrelative_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Irelative_refContext irelative_ref() throws RecognitionException {
		Irelative_refContext _localctx = new Irelative_refContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_irelative_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); irelative_part();
			setState(121);
			_la = _input.LA(1);
			if (_la==QMARK) {
				{
				setState(119); match(QMARK);
				setState(120); iquery();
				}
			}

			setState(125);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(123); match(HASH);
				setState(124); ifragment();
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

	public static class Irelative_partContext extends ParserRuleContext {
		public Ipath_emptyContext ipath_empty() {
			return getRuleContext(Ipath_emptyContext.class,0);
		}
		public Ipath_abemptyContext ipath_abempty() {
			return getRuleContext(Ipath_abemptyContext.class,0);
		}
		public Ipath_noschemeContext ipath_noscheme() {
			return getRuleContext(Ipath_noschemeContext.class,0);
		}
		public Ipath_absoluteContext ipath_absolute() {
			return getRuleContext(Ipath_absoluteContext.class,0);
		}
		public IauthorityContext iauthority() {
			return getRuleContext(IauthorityContext.class,0);
		}
		public Irelative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irelative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIrelative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIrelative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIrelative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Irelative_partContext irelative_part() throws RecognitionException {
		Irelative_partContext _localctx = new Irelative_partContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_irelative_part);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case FSLASH2:
				enterOuterAlt(_localctx, 1);
				{
				setState(127); match(FSLASH2);
				setState(128); iauthority();
				setState(129); ipath_abempty();
				}
				break;
			case FSLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); ipath_absolute();
				}
				break;
			case UCSCHAR:
			case D0:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case J:
			case K:
			case L:
			case M:
			case N:
			case O:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case U:
			case V:
			case W:
			case X:
			case Y:
			case Z:
			case DOT:
			case PERCENT:
			case HYPHEN:
			case TILDE:
			case USCORE:
			case EXCL:
			case DOLLAR:
			case AMP:
			case SQUOTE:
			case OPAREN:
			case CPAREN:
			case STAR:
			case PLUS:
			case COMMA:
			case SCOL:
			case EQUALS:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(132); ipath_noscheme();
				}
				break;
			case EOF:
			case QMARK:
			case HASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(133); ipath_empty();
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

	public static class IauthorityContext extends ParserRuleContext {
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public IuserinfoContext iuserinfo() {
			return getRuleContext(IuserinfoContext.class,0);
		}
		public IhostContext ihost() {
			return getRuleContext(IhostContext.class,0);
		}
		public IauthorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iauthority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIauthority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIauthority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIauthority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IauthorityContext iauthority() throws RecognitionException {
		IauthorityContext _localctx = new IauthorityContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_iauthority);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(136); iuserinfo();
				setState(137); match(AT);
				}
				break;
			}
			setState(141); ihost();
			setState(144);
			_la = _input.LA(1);
			if (_la==COL) {
				{
				setState(142); match(COL);
				setState(143); port();
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

	public static class IuserinfoContext extends ParserRuleContext {
		public List<IunreservedContext> iunreserved() {
			return getRuleContexts(IunreservedContext.class);
		}
		public List<Pct_encodedContext> pct_encoded() {
			return getRuleContexts(Pct_encodedContext.class);
		}
		public IunreservedContext iunreserved(int i) {
			return getRuleContext(IunreservedContext.class,i);
		}
		public Sub_delimsContext sub_delims(int i) {
			return getRuleContext(Sub_delimsContext.class,i);
		}
		public Pct_encodedContext pct_encoded(int i) {
			return getRuleContext(Pct_encodedContext.class,i);
		}
		public List<Sub_delimsContext> sub_delims() {
			return getRuleContexts(Sub_delimsContext.class);
		}
		public IuserinfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iuserinfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIuserinfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIuserinfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIuserinfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IuserinfoContext iuserinfo() throws RecognitionException {
		IuserinfoContext _localctx = new IuserinfoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_iuserinfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UCSCHAR) | (1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << COL) | (1L << DOT) | (1L << PERCENT) | (1L << HYPHEN) | (1L << TILDE) | (1L << USCORE) | (1L << EXCL) | (1L << DOLLAR) | (1L << AMP) | (1L << SQUOTE) | (1L << OPAREN) | (1L << CPAREN) | (1L << STAR) | (1L << PLUS) | (1L << COMMA) | (1L << SCOL) | (1L << EQUALS))) != 0)) {
				{
				setState(150);
				switch (_input.LA(1)) {
				case UCSCHAR:
				case D0:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case A:
				case B:
				case C:
				case D:
				case E:
				case F:
				case G:
				case H:
				case I:
				case J:
				case K:
				case L:
				case M:
				case N:
				case O:
				case P:
				case Q:
				case R:
				case S:
				case T:
				case U:
				case V:
				case W:
				case X:
				case Y:
				case Z:
				case DOT:
				case HYPHEN:
				case TILDE:
				case USCORE:
					{
					setState(146); iunreserved();
					}
					break;
				case PERCENT:
					{
					setState(147); pct_encoded();
					}
					break;
				case EXCL:
				case DOLLAR:
				case AMP:
				case SQUOTE:
				case OPAREN:
				case CPAREN:
				case STAR:
				case PLUS:
				case COMMA:
				case SCOL:
				case EQUALS:
					{
					setState(148); sub_delims();
					}
					break;
				case COL:
					{
					setState(149); match(COL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(154);
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

	public static class IhostContext extends ParserRuleContext {
		public Ireg_nameContext ireg_name() {
			return getRuleContext(Ireg_nameContext.class,0);
		}
		public Ip_v4_addressContext ip_v4_address() {
			return getRuleContext(Ip_v4_addressContext.class,0);
		}
		public Ip_literalContext ip_literal() {
			return getRuleContext(Ip_literalContext.class,0);
		}
		public IhostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ihost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIhost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIhost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIhost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IhostContext ihost() throws RecognitionException {
		IhostContext _localctx = new IhostContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ihost);
		try {
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155); ip_literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); ip_v4_address();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157); ireg_name();
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

	public static class Ireg_nameContext extends ParserRuleContext {
		public List<IunreservedContext> iunreserved() {
			return getRuleContexts(IunreservedContext.class);
		}
		public List<Pct_encodedContext> pct_encoded() {
			return getRuleContexts(Pct_encodedContext.class);
		}
		public IunreservedContext iunreserved(int i) {
			return getRuleContext(IunreservedContext.class,i);
		}
		public Sub_delimsContext sub_delims(int i) {
			return getRuleContext(Sub_delimsContext.class,i);
		}
		public Pct_encodedContext pct_encoded(int i) {
			return getRuleContext(Pct_encodedContext.class,i);
		}
		public List<Sub_delimsContext> sub_delims() {
			return getRuleContexts(Sub_delimsContext.class);
		}
		public Ireg_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ireg_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIreg_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIreg_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIreg_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ireg_nameContext ireg_name() throws RecognitionException {
		Ireg_nameContext _localctx = new Ireg_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ireg_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UCSCHAR) | (1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << DOT) | (1L << PERCENT) | (1L << HYPHEN) | (1L << TILDE) | (1L << USCORE) | (1L << EXCL) | (1L << DOLLAR) | (1L << AMP) | (1L << SQUOTE) | (1L << OPAREN) | (1L << CPAREN) | (1L << STAR) | (1L << PLUS) | (1L << COMMA) | (1L << SCOL) | (1L << EQUALS))) != 0)) {
				{
				setState(163);
				switch (_input.LA(1)) {
				case UCSCHAR:
				case D0:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case A:
				case B:
				case C:
				case D:
				case E:
				case F:
				case G:
				case H:
				case I:
				case J:
				case K:
				case L:
				case M:
				case N:
				case O:
				case P:
				case Q:
				case R:
				case S:
				case T:
				case U:
				case V:
				case W:
				case X:
				case Y:
				case Z:
				case DOT:
				case HYPHEN:
				case TILDE:
				case USCORE:
					{
					setState(160); iunreserved();
					}
					break;
				case PERCENT:
					{
					setState(161); pct_encoded();
					}
					break;
				case EXCL:
				case DOLLAR:
				case AMP:
				case SQUOTE:
				case OPAREN:
				case CPAREN:
				case STAR:
				case PLUS:
				case COMMA:
				case SCOL:
				case EQUALS:
					{
					setState(162); sub_delims();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(167);
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

	public static class IpathContext extends ParserRuleContext {
		public Ipath_emptyContext ipath_empty() {
			return getRuleContext(Ipath_emptyContext.class,0);
		}
		public Ipath_abemptyContext ipath_abempty() {
			return getRuleContext(Ipath_abemptyContext.class,0);
		}
		public Ipath_rootlessContext ipath_rootless() {
			return getRuleContext(Ipath_rootlessContext.class,0);
		}
		public Ipath_noschemeContext ipath_noscheme() {
			return getRuleContext(Ipath_noschemeContext.class,0);
		}
		public Ipath_absoluteContext ipath_absolute() {
			return getRuleContext(Ipath_absoluteContext.class,0);
		}
		public IpathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIpath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIpath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IpathContext ipath() throws RecognitionException {
		IpathContext _localctx = new IpathContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ipath);
		try {
			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168); ipath_abempty();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); ipath_absolute();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170); ipath_noscheme();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171); ipath_rootless();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172); ipath_empty();
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

	public static class Ipath_abemptyContext extends ParserRuleContext {
		public IsegmentContext isegment(int i) {
			return getRuleContext(IsegmentContext.class,i);
		}
		public List<IsegmentContext> isegment() {
			return getRuleContexts(IsegmentContext.class);
		}
		public Ipath_abemptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipath_abempty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIpath_abempty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIpath_abempty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIpath_abempty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipath_abemptyContext ipath_abempty() throws RecognitionException {
		Ipath_abemptyContext _localctx = new Ipath_abemptyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ipath_abempty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FSLASH) {
				{
				{
				setState(175); match(FSLASH);
				setState(176); isegment();
				}
				}
				setState(181);
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

	public static class Ipath_absoluteContext extends ParserRuleContext {
		public IsegmentContext isegment(int i) {
			return getRuleContext(IsegmentContext.class,i);
		}
		public List<IsegmentContext> isegment() {
			return getRuleContexts(IsegmentContext.class);
		}
		public Isegment_nzContext isegment_nz() {
			return getRuleContext(Isegment_nzContext.class,0);
		}
		public Ipath_absoluteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipath_absolute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIpath_absolute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIpath_absolute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIpath_absolute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipath_absoluteContext ipath_absolute() throws RecognitionException {
		Ipath_absoluteContext _localctx = new Ipath_absoluteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ipath_absolute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(FSLASH);
			setState(191);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UCSCHAR) | (1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << COL) | (1L << DOT) | (1L << PERCENT) | (1L << HYPHEN) | (1L << TILDE) | (1L << USCORE) | (1L << EXCL) | (1L << DOLLAR) | (1L << AMP) | (1L << SQUOTE) | (1L << OPAREN) | (1L << CPAREN) | (1L << STAR) | (1L << PLUS) | (1L << COMMA) | (1L << SCOL) | (1L << EQUALS) | (1L << AT))) != 0)) {
				{
				setState(183); isegment_nz();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FSLASH) {
					{
					{
					setState(184); match(FSLASH);
					setState(185); isegment();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Ipath_noschemeContext extends ParserRuleContext {
		public IsegmentContext isegment(int i) {
			return getRuleContext(IsegmentContext.class,i);
		}
		public Isegment_nz_ncContext isegment_nz_nc() {
			return getRuleContext(Isegment_nz_ncContext.class,0);
		}
		public List<IsegmentContext> isegment() {
			return getRuleContexts(IsegmentContext.class);
		}
		public Ipath_noschemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipath_noscheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIpath_noscheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIpath_noscheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIpath_noscheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipath_noschemeContext ipath_noscheme() throws RecognitionException {
		Ipath_noschemeContext _localctx = new Ipath_noschemeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ipath_noscheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); isegment_nz_nc();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FSLASH) {
				{
				{
				setState(194); match(FSLASH);
				setState(195); isegment();
				}
				}
				setState(200);
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

	public static class Ipath_rootlessContext extends ParserRuleContext {
		public IsegmentContext isegment(int i) {
			return getRuleContext(IsegmentContext.class,i);
		}
		public List<IsegmentContext> isegment() {
			return getRuleContexts(IsegmentContext.class);
		}
		public Isegment_nzContext isegment_nz() {
			return getRuleContext(Isegment_nzContext.class,0);
		}
		public Ipath_rootlessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipath_rootless; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIpath_rootless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIpath_rootless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIpath_rootless(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipath_rootlessContext ipath_rootless() throws RecognitionException {
		Ipath_rootlessContext _localctx = new Ipath_rootlessContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ipath_rootless);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); isegment_nz();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FSLASH) {
				{
				{
				setState(202); match(FSLASH);
				setState(203); isegment();
				}
				}
				setState(208);
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

	public static class Ipath_emptyContext extends ParserRuleContext {
		public Ipath_emptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipath_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIpath_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIpath_empty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIpath_empty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipath_emptyContext ipath_empty() throws RecognitionException {
		Ipath_emptyContext _localctx = new Ipath_emptyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ipath_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class IsegmentContext extends ParserRuleContext {
		public IpcharContext ipchar(int i) {
			return getRuleContext(IpcharContext.class,i);
		}
		public List<IpcharContext> ipchar() {
			return getRuleContexts(IpcharContext.class);
		}
		public IsegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIsegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIsegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIsegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsegmentContext isegment() throws RecognitionException {
		IsegmentContext _localctx = new IsegmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_isegment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UCSCHAR) | (1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << COL) | (1L << DOT) | (1L << PERCENT) | (1L << HYPHEN) | (1L << TILDE) | (1L << USCORE) | (1L << EXCL) | (1L << DOLLAR) | (1L << AMP) | (1L << SQUOTE) | (1L << OPAREN) | (1L << CPAREN) | (1L << STAR) | (1L << PLUS) | (1L << COMMA) | (1L << SCOL) | (1L << EQUALS) | (1L << AT))) != 0)) {
				{
				{
				setState(211); ipchar();
				}
				}
				setState(216);
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

	public static class Isegment_nzContext extends ParserRuleContext {
		public IpcharContext ipchar(int i) {
			return getRuleContext(IpcharContext.class,i);
		}
		public List<IpcharContext> ipchar() {
			return getRuleContexts(IpcharContext.class);
		}
		public Isegment_nzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isegment_nz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIsegment_nz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIsegment_nz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIsegment_nz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Isegment_nzContext isegment_nz() throws RecognitionException {
		Isegment_nzContext _localctx = new Isegment_nzContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_isegment_nz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217); ipchar();
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UCSCHAR) | (1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << COL) | (1L << DOT) | (1L << PERCENT) | (1L << HYPHEN) | (1L << TILDE) | (1L << USCORE) | (1L << EXCL) | (1L << DOLLAR) | (1L << AMP) | (1L << SQUOTE) | (1L << OPAREN) | (1L << CPAREN) | (1L << STAR) | (1L << PLUS) | (1L << COMMA) | (1L << SCOL) | (1L << EQUALS) | (1L << AT))) != 0) );
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

	public static class Isegment_nz_ncContext extends ParserRuleContext {
		public List<IunreservedContext> iunreserved() {
			return getRuleContexts(IunreservedContext.class);
		}
		public List<Pct_encodedContext> pct_encoded() {
			return getRuleContexts(Pct_encodedContext.class);
		}
		public IunreservedContext iunreserved(int i) {
			return getRuleContext(IunreservedContext.class,i);
		}
		public Sub_delimsContext sub_delims(int i) {
			return getRuleContext(Sub_delimsContext.class,i);
		}
		public Pct_encodedContext pct_encoded(int i) {
			return getRuleContext(Pct_encodedContext.class,i);
		}
		public List<Sub_delimsContext> sub_delims() {
			return getRuleContexts(Sub_delimsContext.class);
		}
		public Isegment_nz_ncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isegment_nz_nc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIsegment_nz_nc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIsegment_nz_nc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIsegment_nz_nc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Isegment_nz_ncContext isegment_nz_nc() throws RecognitionException {
		Isegment_nz_ncContext _localctx = new Isegment_nz_ncContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_isegment_nz_nc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(226);
				switch (_input.LA(1)) {
				case UCSCHAR:
				case D0:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case A:
				case B:
				case C:
				case D:
				case E:
				case F:
				case G:
				case H:
				case I:
				case J:
				case K:
				case L:
				case M:
				case N:
				case O:
				case P:
				case Q:
				case R:
				case S:
				case T:
				case U:
				case V:
				case W:
				case X:
				case Y:
				case Z:
				case DOT:
				case HYPHEN:
				case TILDE:
				case USCORE:
					{
					setState(222); iunreserved();
					}
					break;
				case PERCENT:
					{
					setState(223); pct_encoded();
					}
					break;
				case EXCL:
				case DOLLAR:
				case AMP:
				case SQUOTE:
				case OPAREN:
				case CPAREN:
				case STAR:
				case PLUS:
				case COMMA:
				case SCOL:
				case EQUALS:
					{
					setState(224); sub_delims();
					}
					break;
				case AT:
					{
					setState(225); match(AT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UCSCHAR) | (1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << DOT) | (1L << PERCENT) | (1L << HYPHEN) | (1L << TILDE) | (1L << USCORE) | (1L << EXCL) | (1L << DOLLAR) | (1L << AMP) | (1L << SQUOTE) | (1L << OPAREN) | (1L << CPAREN) | (1L << STAR) | (1L << PLUS) | (1L << COMMA) | (1L << SCOL) | (1L << EQUALS) | (1L << AT))) != 0) );
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

	public static class IpcharContext extends ParserRuleContext {
		public IunreservedContext iunreserved() {
			return getRuleContext(IunreservedContext.class,0);
		}
		public Pct_encodedContext pct_encoded() {
			return getRuleContext(Pct_encodedContext.class,0);
		}
		public Sub_delimsContext sub_delims() {
			return getRuleContext(Sub_delimsContext.class,0);
		}
		public IpcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIpchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIpchar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIpchar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IpcharContext ipchar() throws RecognitionException {
		IpcharContext _localctx = new IpcharContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ipchar);
		int _la;
		try {
			setState(234);
			switch (_input.LA(1)) {
			case UCSCHAR:
			case D0:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case J:
			case K:
			case L:
			case M:
			case N:
			case O:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case U:
			case V:
			case W:
			case X:
			case Y:
			case Z:
			case DOT:
			case HYPHEN:
			case TILDE:
			case USCORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(230); iunreserved();
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); pct_encoded();
				}
				break;
			case EXCL:
			case DOLLAR:
			case AMP:
			case SQUOTE:
			case OPAREN:
			case CPAREN:
			case STAR:
			case PLUS:
			case COMMA:
			case SCOL:
			case EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(232); sub_delims();
				}
				break;
			case COL:
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				_la = _input.LA(1);
				if ( !(_la==COL || _la==AT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class IqueryContext extends ParserRuleContext {
		public List<TerminalNode> IPRIVATE() { return getTokens(ExtractedIRIParser.IPRIVATE); }
		public IpcharContext ipchar(int i) {
			return getRuleContext(IpcharContext.class,i);
		}
		public TerminalNode IPRIVATE(int i) {
			return getToken(ExtractedIRIParser.IPRIVATE, i);
		}
		public List<IpcharContext> ipchar() {
			return getRuleContexts(IpcharContext.class);
		}
		public IqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IqueryContext iquery() throws RecognitionException {
		IqueryContext _localctx = new IqueryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_iquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UCSCHAR) | (1L << IPRIVATE) | (1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << COL) | (1L << DOT) | (1L << PERCENT) | (1L << HYPHEN) | (1L << TILDE) | (1L << USCORE) | (1L << EXCL) | (1L << DOLLAR) | (1L << AMP) | (1L << SQUOTE) | (1L << OPAREN) | (1L << CPAREN) | (1L << STAR) | (1L << PLUS) | (1L << COMMA) | (1L << SCOL) | (1L << EQUALS) | (1L << FSLASH) | (1L << QMARK) | (1L << AT))) != 0)) {
				{
				setState(238);
				switch (_input.LA(1)) {
				case UCSCHAR:
				case D0:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case A:
				case B:
				case C:
				case D:
				case E:
				case F:
				case G:
				case H:
				case I:
				case J:
				case K:
				case L:
				case M:
				case N:
				case O:
				case P:
				case Q:
				case R:
				case S:
				case T:
				case U:
				case V:
				case W:
				case X:
				case Y:
				case Z:
				case COL:
				case DOT:
				case PERCENT:
				case HYPHEN:
				case TILDE:
				case USCORE:
				case EXCL:
				case DOLLAR:
				case AMP:
				case SQUOTE:
				case OPAREN:
				case CPAREN:
				case STAR:
				case PLUS:
				case COMMA:
				case SCOL:
				case EQUALS:
				case AT:
					{
					setState(236); ipchar();
					}
					break;
				case IPRIVATE:
				case FSLASH:
				case QMARK:
					{
					setState(237);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IPRIVATE) | (1L << FSLASH) | (1L << QMARK))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(242);
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

	public static class IfragmentContext extends ParserRuleContext {
		public IpcharContext ipchar(int i) {
			return getRuleContext(IpcharContext.class,i);
		}
		public List<IpcharContext> ipchar() {
			return getRuleContexts(IpcharContext.class);
		}
		public IfragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIfragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIfragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIfragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfragmentContext ifragment() throws RecognitionException {
		IfragmentContext _localctx = new IfragmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifragment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UCSCHAR) | (1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << COL) | (1L << DOT) | (1L << PERCENT) | (1L << HYPHEN) | (1L << TILDE) | (1L << USCORE) | (1L << EXCL) | (1L << DOLLAR) | (1L << AMP) | (1L << SQUOTE) | (1L << OPAREN) | (1L << CPAREN) | (1L << STAR) | (1L << PLUS) | (1L << COMMA) | (1L << SCOL) | (1L << EQUALS) | (1L << FSLASH) | (1L << QMARK) | (1L << AT))) != 0)) {
				{
				setState(245);
				switch (_input.LA(1)) {
				case UCSCHAR:
				case D0:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case A:
				case B:
				case C:
				case D:
				case E:
				case F:
				case G:
				case H:
				case I:
				case J:
				case K:
				case L:
				case M:
				case N:
				case O:
				case P:
				case Q:
				case R:
				case S:
				case T:
				case U:
				case V:
				case W:
				case X:
				case Y:
				case Z:
				case COL:
				case DOT:
				case PERCENT:
				case HYPHEN:
				case TILDE:
				case USCORE:
				case EXCL:
				case DOLLAR:
				case AMP:
				case SQUOTE:
				case OPAREN:
				case CPAREN:
				case STAR:
				case PLUS:
				case COMMA:
				case SCOL:
				case EQUALS:
				case AT:
					{
					setState(243); ipchar();
					}
					break;
				case FSLASH:
				case QMARK:
					{
					setState(244);
					_la = _input.LA(1);
					if ( !(_la==FSLASH || _la==QMARK) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(249);
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

	public static class IunreservedContext extends ParserRuleContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public AlphaContext alpha() {
			return getRuleContext(AlphaContext.class,0);
		}
		public TerminalNode UCSCHAR() { return getToken(ExtractedIRIParser.UCSCHAR, 0); }
		public IunreservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iunreserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIunreserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIunreserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIunreserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IunreservedContext iunreserved() throws RecognitionException {
		IunreservedContext _localctx = new IunreservedContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_iunreserved);
		int _la;
		try {
			setState(253);
			switch (_input.LA(1)) {
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case J:
			case K:
			case L:
			case M:
			case N:
			case O:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case U:
			case V:
			case W:
			case X:
			case Y:
			case Z:
				enterOuterAlt(_localctx, 1);
				{
				setState(250); alpha();
				}
				break;
			case D0:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); digit();
				}
				break;
			case UCSCHAR:
			case DOT:
			case HYPHEN:
			case TILDE:
			case USCORE:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UCSCHAR) | (1L << DOT) | (1L << HYPHEN) | (1L << TILDE) | (1L << USCORE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class SchemeContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public AlphaContext alpha(int i) {
			return getRuleContext(AlphaContext.class,i);
		}
		public List<AlphaContext> alpha() {
			return getRuleContexts(AlphaContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public SchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitScheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitScheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeContext scheme() throws RecognitionException {
		SchemeContext _localctx = new SchemeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_scheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); alpha();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << DOT) | (1L << HYPHEN) | (1L << PLUS))) != 0)) {
				{
				setState(259);
				switch (_input.LA(1)) {
				case A:
				case B:
				case C:
				case D:
				case E:
				case F:
				case G:
				case H:
				case I:
				case J:
				case K:
				case L:
				case M:
				case N:
				case O:
				case P:
				case Q:
				case R:
				case S:
				case T:
				case U:
				case V:
				case W:
				case X:
				case Y:
				case Z:
					{
					setState(256); alpha();
					}
					break;
				case D0:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
					{
					setState(257); digit();
					}
					break;
				case DOT:
				case HYPHEN:
				case PLUS:
					{
					setState(258);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << HYPHEN) | (1L << PLUS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(263);
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

	public static class PortContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitPort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitPort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9))) != 0)) {
				{
				{
				setState(264); digit();
				}
				}
				setState(269);
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

	public static class Ip_literalContext extends ParserRuleContext {
		public Ip_v6_addressContext ip_v6_address() {
			return getRuleContext(Ip_v6_addressContext.class,0);
		}
		public Ip_v_futureContext ip_v_future() {
			return getRuleContext(Ip_v_futureContext.class,0);
		}
		public Ip_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIp_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ip_literalContext ip_literal() throws RecognitionException {
		Ip_literalContext _localctx = new Ip_literalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ip_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(OBRACK);
			setState(273);
			switch (_input.LA(1)) {
			case D0:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case COL2:
				{
				setState(271); ip_v6_address();
				}
				break;
			case V:
				{
				setState(272); ip_v_future();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(275); match(CBRACK);
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

	public static class Ip_v_futureContext extends ParserRuleContext {
		public TerminalNode V() { return getToken(ExtractedIRIParser.V, 0); }
		public List<UnreservedContext> unreserved() {
			return getRuleContexts(UnreservedContext.class);
		}
		public UnreservedContext unreserved(int i) {
			return getRuleContext(UnreservedContext.class,i);
		}
		public Sub_delimsContext sub_delims(int i) {
			return getRuleContext(Sub_delimsContext.class,i);
		}
		public HexdigContext hexdig(int i) {
			return getRuleContext(HexdigContext.class,i);
		}
		public List<Sub_delimsContext> sub_delims() {
			return getRuleContexts(Sub_delimsContext.class);
		}
		public List<HexdigContext> hexdig() {
			return getRuleContexts(HexdigContext.class);
		}
		public Ip_v_futureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_v_future; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIp_v_future(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIp_v_future(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIp_v_future(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ip_v_futureContext ip_v_future() throws RecognitionException {
		Ip_v_futureContext _localctx = new Ip_v_futureContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ip_v_future);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(V);
			setState(279); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(278); hexdig();
				}
				}
				setState(281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F))) != 0) );
			setState(283); match(DOT);
			setState(287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(287);
				switch (_input.LA(1)) {
				case D0:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case A:
				case B:
				case C:
				case D:
				case E:
				case F:
				case G:
				case H:
				case I:
				case J:
				case K:
				case L:
				case M:
				case N:
				case O:
				case P:
				case Q:
				case R:
				case S:
				case T:
				case U:
				case V:
				case W:
				case X:
				case Y:
				case Z:
				case DOT:
				case HYPHEN:
				case TILDE:
				case USCORE:
					{
					setState(284); unreserved();
					}
					break;
				case EXCL:
				case DOLLAR:
				case AMP:
				case SQUOTE:
				case OPAREN:
				case CPAREN:
				case STAR:
				case PLUS:
				case COMMA:
				case SCOL:
				case EQUALS:
					{
					setState(285); sub_delims();
					}
					break;
				case COL:
					{
					setState(286); match(COL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << COL) | (1L << DOT) | (1L << HYPHEN) | (1L << TILDE) | (1L << USCORE) | (1L << EXCL) | (1L << DOLLAR) | (1L << AMP) | (1L << SQUOTE) | (1L << OPAREN) | (1L << CPAREN) | (1L << STAR) | (1L << PLUS) | (1L << COMMA) | (1L << SCOL) | (1L << EQUALS))) != 0) );
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

	public static class Ip_v6_addressContext extends ParserRuleContext {
		public H16Context h16(int i) {
			return getRuleContext(H16Context.class,i);
		}
		public List<H16Context> h16() {
			return getRuleContexts(H16Context.class);
		}
		public Ls32Context ls32() {
			return getRuleContext(Ls32Context.class,0);
		}
		public Ip_v6_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_v6_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIp_v6_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIp_v6_address(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIp_v6_address(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ip_v6_addressContext ip_v6_address() throws RecognitionException {
		Ip_v6_addressContext _localctx = new Ip_v6_addressContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ip_v6_address);
		int _la;
		try {
			setState(481);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291); h16();
				setState(292); match(COL);
				setState(293); h16();
				setState(294); match(COL);
				setState(295); h16();
				setState(296); match(COL);
				setState(297); h16();
				setState(298); match(COL);
				setState(299); h16();
				setState(300); match(COL);
				setState(301); h16();
				setState(302); match(COL);
				setState(303); ls32();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); match(COL2);
				setState(306); h16();
				setState(307); match(COL);
				setState(308); h16();
				setState(309); match(COL);
				setState(310); h16();
				setState(311); match(COL);
				setState(312); h16();
				setState(313); match(COL);
				setState(314); h16();
				setState(315); match(COL);
				setState(316); ls32();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F))) != 0)) {
					{
					setState(318); h16();
					}
				}

				setState(321); match(COL2);
				setState(322); h16();
				setState(323); match(COL);
				setState(324); h16();
				setState(325); match(COL);
				setState(326); h16();
				setState(327); match(COL);
				setState(328); h16();
				setState(329); match(COL);
				setState(330); ls32();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F))) != 0)) {
					{
					setState(335);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(332); h16();
						setState(333); match(COL);
						}
						break;
					}
					setState(337); h16();
					}
				}

				setState(340); match(COL2);
				setState(341); h16();
				setState(342); match(COL);
				setState(343); h16();
				setState(344); match(COL);
				setState(345); h16();
				setState(346); match(COL);
				setState(347); ls32();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F))) != 0)) {
					{
					setState(357);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(352);
						switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
						case 1:
							{
							setState(349); h16();
							setState(350); match(COL);
							}
							break;
						}
						setState(354); h16();
						setState(355); match(COL);
						}
						break;
					}
					setState(359); h16();
					}
				}

				setState(362); match(COL2);
				setState(363); h16();
				setState(364); match(COL);
				setState(365); h16();
				setState(366); match(COL);
				setState(367); ls32();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(385);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F))) != 0)) {
					{
					setState(382);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(377);
						switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
						case 1:
							{
							setState(372);
							switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
							case 1:
								{
								setState(369); h16();
								setState(370); match(COL);
								}
								break;
							}
							setState(374); h16();
							setState(375); match(COL);
							}
							break;
						}
						setState(379); h16();
						setState(380); match(COL);
						}
						break;
					}
					setState(384); h16();
					}
				}

				setState(387); match(COL2);
				setState(388); h16();
				setState(389); match(COL);
				setState(390); ls32();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(413);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F))) != 0)) {
					{
					setState(410);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(405);
						switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
						case 1:
							{
							setState(400);
							switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
							case 1:
								{
								setState(395);
								switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
								case 1:
									{
									setState(392); h16();
									setState(393); match(COL);
									}
									break;
								}
								setState(397); h16();
								setState(398); match(COL);
								}
								break;
							}
							setState(402); h16();
							setState(403); match(COL);
							}
							break;
						}
						setState(407); h16();
						setState(408); match(COL);
						}
						break;
					}
					setState(412); h16();
					}
				}

				setState(415); match(COL2);
				setState(416); ls32();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(443);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F))) != 0)) {
					{
					setState(440);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						setState(435);
						switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
						case 1:
							{
							setState(430);
							switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
							case 1:
								{
								setState(425);
								switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
								case 1:
									{
									setState(420);
									switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
									case 1:
										{
										setState(417); h16();
										setState(418); match(COL);
										}
										break;
									}
									setState(422); h16();
									setState(423); match(COL);
									}
									break;
								}
								setState(427); h16();
								setState(428); match(COL);
								}
								break;
							}
							setState(432); h16();
							setState(433); match(COL);
							}
							break;
						}
						setState(437); h16();
						setState(438); match(COL);
						}
						break;
					}
					setState(442); h16();
					}
				}

				setState(445); match(COL2);
				setState(446); h16();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(478);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F))) != 0)) {
					{
					setState(475);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(470);
						switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
						case 1:
							{
							setState(465);
							switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
							case 1:
								{
								setState(460);
								switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
								case 1:
									{
									setState(455);
									switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
									case 1:
										{
										setState(450);
										switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
										case 1:
											{
											setState(447); h16();
											setState(448); match(COL);
											}
											break;
										}
										setState(452); h16();
										setState(453); match(COL);
										}
										break;
									}
									setState(457); h16();
									setState(458); match(COL);
									}
									break;
								}
								setState(462); h16();
								setState(463); match(COL);
								}
								break;
							}
							setState(467); h16();
							setState(468); match(COL);
							}
							break;
						}
						setState(472); h16();
						setState(473); match(COL);
						}
						break;
					}
					setState(477); h16();
					}
				}

				setState(480); match(COL2);
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

	public static class H16Context extends ParserRuleContext {
		public HexdigContext hexdig(int i) {
			return getRuleContext(HexdigContext.class,i);
		}
		public List<HexdigContext> hexdig() {
			return getRuleContexts(HexdigContext.class);
		}
		public H16Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h16; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterH16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitH16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitH16(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H16Context h16() throws RecognitionException {
		H16Context _localctx = new H16Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_h16);
		try {
			setState(496);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483); hexdig();
				setState(484); hexdig();
				setState(485); hexdig();
				setState(486); hexdig();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488); hexdig();
				setState(489); hexdig();
				setState(490); hexdig();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492); hexdig();
				setState(493); hexdig();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(495); hexdig();
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

	public static class Ls32Context extends ParserRuleContext {
		public H16Context h16(int i) {
			return getRuleContext(H16Context.class,i);
		}
		public List<H16Context> h16() {
			return getRuleContexts(H16Context.class);
		}
		public Ip_v4_addressContext ip_v4_address() {
			return getRuleContext(Ip_v4_addressContext.class,0);
		}
		public Ls32Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ls32; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterLs32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitLs32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitLs32(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ls32Context ls32() throws RecognitionException {
		Ls32Context _localctx = new Ls32Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_ls32);
		try {
			setState(503);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498); h16();
				setState(499); match(COL);
				setState(500); h16();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502); ip_v4_address();
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

	public static class Ip_v4_addressContext extends ParserRuleContext {
		public Dec_octetContext dec_octet(int i) {
			return getRuleContext(Dec_octetContext.class,i);
		}
		public List<Dec_octetContext> dec_octet() {
			return getRuleContexts(Dec_octetContext.class);
		}
		public Ip_v4_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_v4_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterIp_v4_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitIp_v4_address(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitIp_v4_address(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ip_v4_addressContext ip_v4_address() throws RecognitionException {
		Ip_v4_addressContext _localctx = new Ip_v4_addressContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ip_v4_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505); dec_octet();
			setState(506); match(DOT);
			setState(507); dec_octet();
			setState(508); match(DOT);
			setState(509); dec_octet();
			setState(510); match(DOT);
			setState(511); dec_octet();
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

	public static class Dec_octetContext extends ParserRuleContext {
		public TerminalNode D4() { return getToken(ExtractedIRIParser.D4, 0); }
		public TerminalNode D1() { return getToken(ExtractedIRIParser.D1, 0); }
		public TerminalNode D5(int i) {
			return getToken(ExtractedIRIParser.D5, i);
		}
		public TerminalNode D3() { return getToken(ExtractedIRIParser.D3, 0); }
		public TerminalNode D0() { return getToken(ExtractedIRIParser.D0, 0); }
		public Non_zero_digitContext non_zero_digit() {
			return getRuleContext(Non_zero_digitContext.class,0);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public TerminalNode D2(int i) {
			return getToken(ExtractedIRIParser.D2, i);
		}
		public List<TerminalNode> D5() { return getTokens(ExtractedIRIParser.D5); }
		public List<TerminalNode> D2() { return getTokens(ExtractedIRIParser.D2); }
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Dec_octetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_octet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterDec_octet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitDec_octet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitDec_octet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_octetContext dec_octet() throws RecognitionException {
		Dec_octetContext _localctx = new Dec_octetContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dec_octet);
		int _la;
		try {
			setState(527);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513); digit();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514); non_zero_digit();
				setState(515); digit();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(517); match(D1);
				setState(518); digit();
				setState(519); digit();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(521); match(D2);
				setState(522);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(523); digit();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(524); match(D2);
				setState(525); match(D5);
				setState(526);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D0) | (1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class Pct_encodedContext extends ParserRuleContext {
		public HexdigContext hexdig(int i) {
			return getRuleContext(HexdigContext.class,i);
		}
		public List<HexdigContext> hexdig() {
			return getRuleContexts(HexdigContext.class);
		}
		public Pct_encodedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pct_encoded; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterPct_encoded(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitPct_encoded(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitPct_encoded(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pct_encodedContext pct_encoded() throws RecognitionException {
		Pct_encodedContext _localctx = new Pct_encodedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_pct_encoded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); match(PERCENT);
			setState(530); hexdig();
			setState(531); hexdig();
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

	public static class UnreservedContext extends ParserRuleContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public AlphaContext alpha() {
			return getRuleContext(AlphaContext.class,0);
		}
		public UnreservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterUnreserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitUnreserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitUnreserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnreservedContext unreserved() throws RecognitionException {
		UnreservedContext _localctx = new UnreservedContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_unreserved);
		int _la;
		try {
			setState(536);
			switch (_input.LA(1)) {
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case J:
			case K:
			case L:
			case M:
			case N:
			case O:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case U:
			case V:
			case W:
			case X:
			case Y:
			case Z:
				enterOuterAlt(_localctx, 1);
				{
				setState(533); alpha();
				}
				break;
			case D0:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
				enterOuterAlt(_localctx, 2);
				{
				setState(534); digit();
				}
				break;
			case DOT:
			case HYPHEN:
			case TILDE:
			case USCORE:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << HYPHEN) | (1L << TILDE) | (1L << USCORE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class ReservedContext extends ParserRuleContext {
		public Sub_delimsContext sub_delims() {
			return getRuleContext(Sub_delimsContext.class,0);
		}
		public Gen_delimsContext gen_delims() {
			return getRuleContext(Gen_delimsContext.class,0);
		}
		public ReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedContext reserved() throws RecognitionException {
		ReservedContext _localctx = new ReservedContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_reserved);
		try {
			setState(540);
			switch (_input.LA(1)) {
			case COL:
			case FSLASH:
			case QMARK:
			case HASH:
			case OBRACK:
			case CBRACK:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(538); gen_delims();
				}
				break;
			case EXCL:
			case DOLLAR:
			case AMP:
			case SQUOTE:
			case OPAREN:
			case CPAREN:
			case STAR:
			case PLUS:
			case COMMA:
			case SCOL:
			case EQUALS:
				enterOuterAlt(_localctx, 2);
				{
				setState(539); sub_delims();
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

	public static class Gen_delimsContext extends ParserRuleContext {
		public Gen_delimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen_delims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterGen_delims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitGen_delims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitGen_delims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gen_delimsContext gen_delims() throws RecognitionException {
		Gen_delimsContext _localctx = new Gen_delimsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_gen_delims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COL) | (1L << FSLASH) | (1L << QMARK) | (1L << HASH) | (1L << OBRACK) | (1L << CBRACK) | (1L << AT))) != 0)) ) {
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

	public static class Sub_delimsContext extends ParserRuleContext {
		public Sub_delimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_delims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterSub_delims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitSub_delims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitSub_delims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_delimsContext sub_delims() throws RecognitionException {
		Sub_delimsContext _localctx = new Sub_delimsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sub_delims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCL) | (1L << DOLLAR) | (1L << AMP) | (1L << SQUOTE) | (1L << OPAREN) | (1L << CPAREN) | (1L << STAR) | (1L << PLUS) | (1L << COMMA) | (1L << SCOL) | (1L << EQUALS))) != 0)) ) {
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

	public static class AlphaContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(ExtractedIRIParser.O, 0); }
		public TerminalNode W() { return getToken(ExtractedIRIParser.W, 0); }
		public TerminalNode E() { return getToken(ExtractedIRIParser.E, 0); }
		public TerminalNode I() { return getToken(ExtractedIRIParser.I, 0); }
		public TerminalNode C() { return getToken(ExtractedIRIParser.C, 0); }
		public TerminalNode B() { return getToken(ExtractedIRIParser.B, 0); }
		public TerminalNode Z() { return getToken(ExtractedIRIParser.Z, 0); }
		public TerminalNode G() { return getToken(ExtractedIRIParser.G, 0); }
		public TerminalNode V() { return getToken(ExtractedIRIParser.V, 0); }
		public TerminalNode X() { return getToken(ExtractedIRIParser.X, 0); }
		public TerminalNode F() { return getToken(ExtractedIRIParser.F, 0); }
		public TerminalNode L() { return getToken(ExtractedIRIParser.L, 0); }
		public TerminalNode R() { return getToken(ExtractedIRIParser.R, 0); }
		public TerminalNode Q() { return getToken(ExtractedIRIParser.Q, 0); }
		public TerminalNode N() { return getToken(ExtractedIRIParser.N, 0); }
		public TerminalNode Y() { return getToken(ExtractedIRIParser.Y, 0); }
		public TerminalNode P() { return getToken(ExtractedIRIParser.P, 0); }
		public TerminalNode J() { return getToken(ExtractedIRIParser.J, 0); }
		public TerminalNode S() { return getToken(ExtractedIRIParser.S, 0); }
		public TerminalNode U() { return getToken(ExtractedIRIParser.U, 0); }
		public TerminalNode K() { return getToken(ExtractedIRIParser.K, 0); }
		public TerminalNode D() { return getToken(ExtractedIRIParser.D, 0); }
		public TerminalNode H() { return getToken(ExtractedIRIParser.H, 0); }
		public TerminalNode A() { return getToken(ExtractedIRIParser.A, 0); }
		public TerminalNode M() { return getToken(ExtractedIRIParser.M, 0); }
		public TerminalNode T() { return getToken(ExtractedIRIParser.T, 0); }
		public AlphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterAlpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitAlpha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitAlpha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_alpha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z))) != 0)) ) {
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

	public static class HexdigContext extends ParserRuleContext {
		public TerminalNode F() { return getToken(ExtractedIRIParser.F, 0); }
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public TerminalNode D() { return getToken(ExtractedIRIParser.D, 0); }
		public TerminalNode E() { return getToken(ExtractedIRIParser.E, 0); }
		public TerminalNode A() { return getToken(ExtractedIRIParser.A, 0); }
		public TerminalNode C() { return getToken(ExtractedIRIParser.C, 0); }
		public TerminalNode B() { return getToken(ExtractedIRIParser.B, 0); }
		public HexdigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexdig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterHexdig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitHexdig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitHexdig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexdigContext hexdig() throws RecognitionException {
		HexdigContext _localctx = new HexdigContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hexdig);
		int _la;
		try {
			setState(550);
			switch (_input.LA(1)) {
			case D0:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
				enterOuterAlt(_localctx, 1);
				{
				setState(548); digit();
				}
				break;
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class DigitContext extends ParserRuleContext {
		public Non_zero_digitContext non_zero_digit() {
			return getRuleContext(Non_zero_digitContext.class,0);
		}
		public TerminalNode D0() { return getToken(ExtractedIRIParser.D0, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_digit);
		try {
			setState(554);
			switch (_input.LA(1)) {
			case D0:
				enterOuterAlt(_localctx, 1);
				{
				setState(552); match(D0);
				}
				break;
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
				enterOuterAlt(_localctx, 2);
				{
				setState(553); non_zero_digit();
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

	public static class Non_zero_digitContext extends ParserRuleContext {
		public TerminalNode D4() { return getToken(ExtractedIRIParser.D4, 0); }
		public TerminalNode D7() { return getToken(ExtractedIRIParser.D7, 0); }
		public TerminalNode D1() { return getToken(ExtractedIRIParser.D1, 0); }
		public TerminalNode D3() { return getToken(ExtractedIRIParser.D3, 0); }
		public TerminalNode D5() { return getToken(ExtractedIRIParser.D5, 0); }
		public TerminalNode D2() { return getToken(ExtractedIRIParser.D2, 0); }
		public TerminalNode D6() { return getToken(ExtractedIRIParser.D6, 0); }
		public TerminalNode D8() { return getToken(ExtractedIRIParser.D8, 0); }
		public TerminalNode D9() { return getToken(ExtractedIRIParser.D9, 0); }
		public Non_zero_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_zero_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).enterNon_zero_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedIRIListener ) ((ExtractedIRIListener)listener).exitNon_zero_digit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedIRIVisitor ) return ((ExtractedIRIVisitor<? extends T>)visitor).visitNon_zero_digit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_zero_digitContext non_zero_digit() throws RecognitionException {
		Non_zero_digitContext _localctx = new Non_zero_digitContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_non_zero_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D1) | (1L << D2) | (1L << D3) | (1L << D4) | (1L << D5) | (1L << D6) | (1L << D7) | (1L << D8) | (1L << D9))) != 0)) ) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3A\u0231\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\3\3\3\5\3c\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\5\5p\n\5\3\6\3\6\3\6\3\6\3\6\5\6w\n\6"+
		"\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0089\n\b\3\t\3\t\3\t\5\t\u008e\n\t\3\t\3\t\3\t\5\t\u0093\n\t\3"+
		"\n\3\n\3\n\3\n\7\n\u0099\n\n\f\n\16\n\u009c\13\n\3\13\3\13\3\13\5\13\u00a1"+
		"\n\13\3\f\3\f\3\f\7\f\u00a6\n\f\f\f\16\f\u00a9\13\f\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00b0\n\r\3\16\3\16\7\16\u00b4\n\16\f\16\16\16\u00b7\13\16\3\17"+
		"\3\17\3\17\3\17\7\17\u00bd\n\17\f\17\16\17\u00c0\13\17\5\17\u00c2\n\17"+
		"\3\20\3\20\3\20\7\20\u00c7\n\20\f\20\16\20\u00ca\13\20\3\21\3\21\3\21"+
		"\7\21\u00cf\n\21\f\21\16\21\u00d2\13\21\3\22\3\22\3\23\7\23\u00d7\n\23"+
		"\f\23\16\23\u00da\13\23\3\24\6\24\u00dd\n\24\r\24\16\24\u00de\3\25\3\25"+
		"\3\25\3\25\6\25\u00e5\n\25\r\25\16\25\u00e6\3\26\3\26\3\26\3\26\5\26\u00ed"+
		"\n\26\3\27\3\27\7\27\u00f1\n\27\f\27\16\27\u00f4\13\27\3\30\3\30\7\30"+
		"\u00f8\n\30\f\30\16\30\u00fb\13\30\3\31\3\31\3\31\5\31\u0100\n\31\3\32"+
		"\3\32\3\32\3\32\7\32\u0106\n\32\f\32\16\32\u0109\13\32\3\33\7\33\u010c"+
		"\n\33\f\33\16\33\u010f\13\33\3\34\3\34\3\34\5\34\u0114\n\34\3\34\3\34"+
		"\3\35\3\35\6\35\u011a\n\35\r\35\16\35\u011b\3\35\3\35\3\35\3\35\6\35\u0122"+
		"\n\35\r\35\16\35\u0123\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u0142\n\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0152\n\36\3\36\5\36\u0155"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0163\n\36\3\36\3\36\3\36\5\36\u0168\n\36\3\36\5\36\u016b\n\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0177\n\36\3\36\3\36"+
		"\3\36\5\36\u017c\n\36\3\36\3\36\3\36\5\36\u0181\n\36\3\36\5\36\u0184\n"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u018e\n\36\3\36\3\36"+
		"\3\36\5\36\u0193\n\36\3\36\3\36\3\36\5\36\u0198\n\36\3\36\3\36\3\36\5"+
		"\36\u019d\n\36\3\36\5\36\u01a0\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u01a7"+
		"\n\36\3\36\3\36\3\36\5\36\u01ac\n\36\3\36\3\36\3\36\5\36\u01b1\n\36\3"+
		"\36\3\36\3\36\5\36\u01b6\n\36\3\36\3\36\3\36\5\36\u01bb\n\36\3\36\5\36"+
		"\u01be\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u01c5\n\36\3\36\3\36\3\36\5"+
		"\36\u01ca\n\36\3\36\3\36\3\36\5\36\u01cf\n\36\3\36\3\36\3\36\5\36\u01d4"+
		"\n\36\3\36\3\36\3\36\5\36\u01d9\n\36\3\36\3\36\3\36\5\36\u01de\n\36\3"+
		"\36\5\36\u01e1\n\36\3\36\5\36\u01e4\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01f3\n\37\3 \3 \3 \3 \3 \5 "+
		"\u01fa\n \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u0212\n\"\3#\3#\3#\3#\3$\3$\3$\5$\u021b\n$\3"+
		"%\3%\5%\u021f\n%\3&\3&\3\'\3\'\3(\3(\3)\3)\5)\u0229\n)\3*\3*\5*\u022d"+
		"\n*\3+\3+\3+\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRT\2\17\4\2**AA\4\2\4\4<=\3\2<=\5\2\3\3++-/\5\2++-"+
		"-\67\67\3\2\5\t\3\2\5\n\4\2++-/\4\2**<A\3\2\60:\3\2\17(\3\2\17\24\3\2"+
		"\6\16\u026f\2V\3\2\2\2\4Y\3\2\2\2\6k\3\2\2\2\bo\3\2\2\2\nq\3\2\2\2\fx"+
		"\3\2\2\2\16\u0088\3\2\2\2\20\u008d\3\2\2\2\22\u009a\3\2\2\2\24\u00a0\3"+
		"\2\2\2\26\u00a7\3\2\2\2\30\u00af\3\2\2\2\32\u00b5\3\2\2\2\34\u00b8\3\2"+
		"\2\2\36\u00c3\3\2\2\2 \u00cb\3\2\2\2\"\u00d3\3\2\2\2$\u00d8\3\2\2\2&\u00dc"+
		"\3\2\2\2(\u00e4\3\2\2\2*\u00ec\3\2\2\2,\u00f2\3\2\2\2.\u00f9\3\2\2\2\60"+
		"\u00ff\3\2\2\2\62\u0101\3\2\2\2\64\u010d\3\2\2\2\66\u0110\3\2\2\28\u0117"+
		"\3\2\2\2:\u01e3\3\2\2\2<\u01f2\3\2\2\2>\u01f9\3\2\2\2@\u01fb\3\2\2\2B"+
		"\u0211\3\2\2\2D\u0213\3\2\2\2F\u021a\3\2\2\2H\u021e\3\2\2\2J\u0220\3\2"+
		"\2\2L\u0222\3\2\2\2N\u0224\3\2\2\2P\u0228\3\2\2\2R\u022c\3\2\2\2T\u022e"+
		"\3\2\2\2VW\5\4\3\2WX\7\2\2\3X\3\3\2\2\2YZ\5\62\32\2Z[\7*\2\2[^\5\6\4\2"+
		"\\]\7=\2\2]_\5,\27\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`a\7>\2\2ac\5.\30\2"+
		"b`\3\2\2\2bc\3\2\2\2c\5\3\2\2\2de\7;\2\2ef\5\20\t\2fg\5\32\16\2gl\3\2"+
		"\2\2hl\5\34\17\2il\5 \21\2jl\5\"\22\2kd\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj"+
		"\3\2\2\2l\7\3\2\2\2mp\5\4\3\2np\5\f\7\2om\3\2\2\2on\3\2\2\2p\t\3\2\2\2"+
		"qr\5\62\32\2rs\7*\2\2sv\5\6\4\2tu\7=\2\2uw\5,\27\2vt\3\2\2\2vw\3\2\2\2"+
		"w\13\3\2\2\2x{\5\16\b\2yz\7=\2\2z|\5,\27\2{y\3\2\2\2{|\3\2\2\2|\177\3"+
		"\2\2\2}~\7>\2\2~\u0080\5.\30\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\r"+
		"\3\2\2\2\u0081\u0082\7;\2\2\u0082\u0083\5\20\t\2\u0083\u0084\5\32\16\2"+
		"\u0084\u0089\3\2\2\2\u0085\u0089\5\34\17\2\u0086\u0089\5\36\20\2\u0087"+
		"\u0089\5\"\22\2\u0088\u0081\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0087\3\2\2\2\u0089\17\3\2\2\2\u008a\u008b\5\22\n\2\u008b"+
		"\u008c\7A\2\2\u008c\u008e\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0092\5\24\13\2\u0090\u0091\7*\2\2\u0091"+
		"\u0093\5\64\33\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\21\3\2"+
		"\2\2\u0094\u0099\5\60\31\2\u0095\u0099\5D#\2\u0096\u0099\5L\'\2\u0097"+
		"\u0099\7*\2\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\23\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a1\5\66\34"+
		"\2\u009e\u00a1\5@!\2\u009f\u00a1\5\26\f\2\u00a0\u009d\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a6\5\60\31\2\u00a3"+
		"\u00a6\5D#\2\u00a4\u00a6\5L\'\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2"+
		"\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00b0\5\32\16\2\u00ab"+
		"\u00b0\5\34\17\2\u00ac\u00b0\5\36\20\2\u00ad\u00b0\5 \21\2\u00ae\u00b0"+
		"\5\"\22\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2"+
		"\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\31\3\2\2\2\u00b1\u00b2"+
		"\7<\2\2\u00b2\u00b4\5$\23\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b5\3\2\2"+
		"\2\u00b8\u00c1\7<\2\2\u00b9\u00be\5&\24\2\u00ba\u00bb\7<\2\2\u00bb\u00bd"+
		"\5$\23\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00b9\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\35\3\2\2\2\u00c3\u00c8\5(\25\2\u00c4\u00c5"+
		"\7<\2\2\u00c5\u00c7\5$\23\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\37\3\2\2\2\u00ca\u00c8\3\2\2"+
		"\2\u00cb\u00d0\5&\24\2\u00cc\u00cd\7<\2\2\u00cd\u00cf\5$\23\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"!\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4#\3\2\2\2\u00d5"+
		"\u00d7\5*\26\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9%\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd"+
		"\5*\26\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\'\3\2\2\2\u00e0\u00e5\5\60\31\2\u00e1\u00e5\5D#\2"+
		"\u00e2\u00e5\5L\'\2\u00e3\u00e5\7A\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7)\3\2\2\2\u00e8\u00ed\5\60\31"+
		"\2\u00e9\u00ed\5D#\2\u00ea\u00ed\5L\'\2\u00eb\u00ed\t\2\2\2\u00ec\u00e8"+
		"\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"+\3\2\2\2\u00ee\u00f1\5*\26\2\u00ef\u00f1\t\3\2\2\u00f0\u00ee\3\2\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3-\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\5*\26\2\u00f6"+
		"\u00f8\t\4\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa/\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u0100\5N(\2\u00fd\u0100\5R*\2\u00fe\u0100\t\5\2\2\u00ff"+
		"\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\61\3\2\2"+
		"\2\u0101\u0107\5N(\2\u0102\u0106\5N(\2\u0103\u0106\5R*\2\u0104\u0106\t"+
		"\6\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\63\3\2\2"+
		"\2\u0109\u0107\3\2\2\2\u010a\u010c\5R*\2\u010b\u010a\3\2\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\65\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0113\7?\2\2\u0111\u0114\5:\36\2\u0112\u0114\58\35"+
		"\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116"+
		"\7@\2\2\u0116\67\3\2\2\2\u0117\u0119\7$\2\2\u0118\u011a\5P)\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u0121\7+\2\2\u011e\u0122\5F$\2\u011f\u0122\5L\'\2"+
		"\u0120\u0122\7*\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"9\3\2\2\2\u0125\u0126\5<\37\2\u0126\u0127\7*\2\2\u0127\u0128\5<\37\2\u0128"+
		"\u0129\7*\2\2\u0129\u012a\5<\37\2\u012a\u012b\7*\2\2\u012b\u012c\5<\37"+
		"\2\u012c\u012d\7*\2\2\u012d\u012e\5<\37\2\u012e\u012f\7*\2\2\u012f\u0130"+
		"\5<\37\2\u0130\u0131\7*\2\2\u0131\u0132\5> \2\u0132\u01e4\3\2\2\2\u0133"+
		"\u0134\7)\2\2\u0134\u0135\5<\37\2\u0135\u0136\7*\2\2\u0136\u0137\5<\37"+
		"\2\u0137\u0138\7*\2\2\u0138\u0139\5<\37\2\u0139\u013a\7*\2\2\u013a\u013b"+
		"\5<\37\2\u013b\u013c\7*\2\2\u013c\u013d\5<\37\2\u013d\u013e\7*\2\2\u013e"+
		"\u013f\5> \2\u013f\u01e4\3\2\2\2\u0140\u0142\5<\37\2\u0141\u0140\3\2\2"+
		"\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7)\2\2\u0144\u0145"+
		"\5<\37\2\u0145\u0146\7*\2\2\u0146\u0147\5<\37\2\u0147\u0148\7*\2\2\u0148"+
		"\u0149\5<\37\2\u0149\u014a\7*\2\2\u014a\u014b\5<\37\2\u014b\u014c\7*\2"+
		"\2\u014c\u014d\5> \2\u014d\u01e4\3\2\2\2\u014e\u014f\5<\37\2\u014f\u0150"+
		"\7*\2\2\u0150\u0152\3\2\2\2\u0151\u014e\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0155\5<\37\2\u0154\u0151\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7)\2\2\u0157\u0158\5<\37\2\u0158"+
		"\u0159\7*\2\2\u0159\u015a\5<\37\2\u015a\u015b\7*\2\2\u015b\u015c\5<\37"+
		"\2\u015c\u015d\7*\2\2\u015d\u015e\5> \2\u015e\u01e4\3\2\2\2\u015f\u0160"+
		"\5<\37\2\u0160\u0161\7*\2\2\u0161\u0163\3\2\2\2\u0162\u015f\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\5<\37\2\u0165\u0166\7*"+
		"\2\2\u0166\u0168\3\2\2\2\u0167\u0162\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016b\5<\37\2\u016a\u0167\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7)\2\2\u016d\u016e\5<\37\2\u016e"+
		"\u016f\7*\2\2\u016f\u0170\5<\37\2\u0170\u0171\7*\2\2\u0171\u0172\5> \2"+
		"\u0172\u01e4\3\2\2\2\u0173\u0174\5<\37\2\u0174\u0175\7*\2\2\u0175\u0177"+
		"\3\2\2\2\u0176\u0173\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\5<\37\2\u0179\u017a\7*\2\2\u017a\u017c\3\2\2\2\u017b\u0176\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\5<\37\2\u017e"+
		"\u017f\7*\2\2\u017f\u0181\3\2\2\2\u0180\u017b\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0184\5<\37\2\u0183\u0180\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7)\2\2\u0186\u0187\5<\37"+
		"\2\u0187\u0188\7*\2\2\u0188\u0189\5> \2\u0189\u01e4\3\2\2\2\u018a\u018b"+
		"\5<\37\2\u018b\u018c\7*\2\2\u018c\u018e\3\2\2\2\u018d\u018a\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\5<\37\2\u0190\u0191\7*"+
		"\2\2\u0191\u0193\3\2\2\2\u0192\u018d\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\5<\37\2\u0195\u0196\7*\2\2\u0196\u0198\3\2"+
		"\2\2\u0197\u0192\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019a\5<\37\2\u019a\u019b\7*\2\2\u019b\u019d\3\2\2\2\u019c\u0197\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\5<\37\2\u019f"+
		"\u019c\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\7)"+
		"\2\2\u01a2\u01e4\5> \2\u01a3\u01a4\5<\37\2\u01a4\u01a5\7*\2\2\u01a5\u01a7"+
		"\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01a9\5<\37\2\u01a9\u01aa\7*\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a6\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\5<\37\2\u01ae"+
		"\u01af\7*\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\5<\37\2\u01b3\u01b4\7*\2\2\u01b4"+
		"\u01b6\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7\u01b8\5<\37\2\u01b8\u01b9\7*\2\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01b5\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\5<"+
		"\37\2\u01bd\u01ba\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c0\7)\2\2\u01c0\u01e4\5<\37\2\u01c1\u01c2\5<\37\2\u01c2\u01c3\7*\2"+
		"\2\u01c3\u01c5\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6"+
		"\3\2\2\2\u01c6\u01c7\5<\37\2\u01c7\u01c8\7*\2\2\u01c8\u01ca\3\2\2\2\u01c9"+
		"\u01c4\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\5<"+
		"\37\2\u01cc\u01cd\7*\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01c9\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\5<\37\2\u01d1\u01d2\7*"+
		"\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d6\5<\37\2\u01d6\u01d7\7*\2\2\u01d7\u01d9\3\2"+
		"\2\2\u01d8\u01d3\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\5<\37\2\u01db\u01dc\7*\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d8\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\5<\37\2\u01e0"+
		"\u01dd\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\7)"+
		"\2\2\u01e3\u0125\3\2\2\2\u01e3\u0133\3\2\2\2\u01e3\u0141\3\2\2\2\u01e3"+
		"\u0154\3\2\2\2\u01e3\u016a\3\2\2\2\u01e3\u0183\3\2\2\2\u01e3\u019f\3\2"+
		"\2\2\u01e3\u01bd\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e4;\3\2\2\2\u01e5\u01e6"+
		"\5P)\2\u01e6\u01e7\5P)\2\u01e7\u01e8\5P)\2\u01e8\u01e9\5P)\2\u01e9\u01f3"+
		"\3\2\2\2\u01ea\u01eb\5P)\2\u01eb\u01ec\5P)\2\u01ec\u01ed\5P)\2\u01ed\u01f3"+
		"\3\2\2\2\u01ee\u01ef\5P)\2\u01ef\u01f0\5P)\2\u01f0\u01f3\3\2\2\2\u01f1"+
		"\u01f3\5P)\2\u01f2\u01e5\3\2\2\2\u01f2\u01ea\3\2\2\2\u01f2\u01ee\3\2\2"+
		"\2\u01f2\u01f1\3\2\2\2\u01f3=\3\2\2\2\u01f4\u01f5\5<\37\2\u01f5\u01f6"+
		"\7*\2\2\u01f6\u01f7\5<\37\2\u01f7\u01fa\3\2\2\2\u01f8\u01fa\5@!\2\u01f9"+
		"\u01f4\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa?\3\2\2\2\u01fb\u01fc\5B\"\2\u01fc"+
		"\u01fd\7+\2\2\u01fd\u01fe\5B\"\2\u01fe\u01ff\7+\2\2\u01ff\u0200\5B\"\2"+
		"\u0200\u0201\7+\2\2\u0201\u0202\5B\"\2\u0202A\3\2\2\2\u0203\u0212\5R*"+
		"\2\u0204\u0205\5T+\2\u0205\u0206\5R*\2\u0206\u0212\3\2\2\2\u0207\u0208"+
		"\7\6\2\2\u0208\u0209\5R*\2\u0209\u020a\5R*\2\u020a\u0212\3\2\2\2\u020b"+
		"\u020c\7\7\2\2\u020c\u020d\t\7\2\2\u020d\u0212\5R*\2\u020e\u020f\7\7\2"+
		"\2\u020f\u0210\7\n\2\2\u0210\u0212\t\b\2\2\u0211\u0203\3\2\2\2\u0211\u0204"+
		"\3\2\2\2\u0211\u0207\3\2\2\2\u0211\u020b\3\2\2\2\u0211\u020e\3\2\2\2\u0212"+
		"C\3\2\2\2\u0213\u0214\7,\2\2\u0214\u0215\5P)\2\u0215\u0216\5P)\2\u0216"+
		"E\3\2\2\2\u0217\u021b\5N(\2\u0218\u021b\5R*\2\u0219\u021b\t\t\2\2\u021a"+
		"\u0217\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021bG\3\2\2\2"+
		"\u021c\u021f\5J&\2\u021d\u021f\5L\'\2\u021e\u021c\3\2\2\2\u021e\u021d"+
		"\3\2\2\2\u021fI\3\2\2\2\u0220\u0221\t\n\2\2\u0221K\3\2\2\2\u0222\u0223"+
		"\t\13\2\2\u0223M\3\2\2\2\u0224\u0225\t\f\2\2\u0225O\3\2\2\2\u0226\u0229"+
		"\5R*\2\u0227\u0229\t\r\2\2\u0228\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229"+
		"Q\3\2\2\2\u022a\u022d\7\5\2\2\u022b\u022d\5T+\2\u022c\u022a\3\2\2\2\u022c"+
		"\u022b\3\2\2\2\u022dS\3\2\2\2\u022e\u022f\t\16\2\2\u022fU\3\2\2\2L^bk"+
		"ov{\177\u0088\u008d\u0092\u0098\u009a\u00a0\u00a5\u00a7\u00af\u00b5\u00be"+
		"\u00c1\u00c8\u00d0\u00d8\u00de\u00e4\u00e6\u00ec\u00f0\u00f2\u00f7\u00f9"+
		"\u00ff\u0105\u0107\u010d\u0113\u011b\u0121\u0123\u0141\u0151\u0154\u0162"+
		"\u0167\u016a\u0176\u017b\u0180\u0183\u018d\u0192\u0197\u019c\u019f\u01a6"+
		"\u01ab\u01b0\u01b5\u01ba\u01bd\u01c4\u01c9\u01ce\u01d3\u01d8\u01dd\u01e0"+
		"\u01e3\u01f2\u01f9\u0211\u021a\u021e\u0228\u022c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}