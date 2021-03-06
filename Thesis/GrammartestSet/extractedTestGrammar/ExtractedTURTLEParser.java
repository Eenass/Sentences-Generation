// Generated from ExtractedTURTLE.g4 by ANTLR 4.1
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
public class ExtractedTURTLEParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, NumericLiteral=14, BooleanLiteral=15, 
		String=16, BlankNode=17, WS=18, PN_PREFIX=19, IRIREF=20, PNAME_NS=21, 
		PrefixedName=22, PNAME_LN=23, BLANK_NODE_LABEL=24, LANGTAG=25, INTEGER=26, 
		DECIMAL=27, DOUBLE=28, EXPONENT=29, STRING_LITERAL_LONG_SINGLE_QUOTE=30, 
		STRING_LITERAL_LONG_QUOTE=31, STRING_LITERAL_QUOTE=32, STRING_LITERAL_SINGLE_QUOTE=33, 
		UCHAR=34, ECHAR=35, ANON_WS=36, ANON=37, SC=38, PN_CHARS_BASE=39, PN_CHARS_U=40, 
		PN_CHARS=41, PN_LOCAL=42, PLX=43, PERCENT=44, HEX=45, PN_LOCAL_ESC=46;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'PREFIX'", "'a'", "')'", "'.'", "','", "'['", "'('", 
		"'@base'", "';'", "'BASE'", "'@prefix'", "'^^'", "NumericLiteral", "BooleanLiteral", 
		"String", "BlankNode", "WS", "PN_PREFIX", "IRIREF", "':'", "PrefixedName", 
		"PNAME_LN", "BLANK_NODE_LABEL", "LANGTAG", "'0'", "DECIMAL", "DOUBLE", 
		"EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", "STRING_LITERAL_LONG_QUOTE", 
		"STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", "UCHAR", "ECHAR", 
		"ANON_WS", "ANON", "'$'", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", "PN_LOCAL", 
		"PLX", "PERCENT", "HEX", "PN_LOCAL_ESC"
	};
	public static final int
		RULE_turtleDoc = 0, RULE_statement = 1, RULE_directive = 2, RULE_prefixID = 3, 
		RULE_base = 4, RULE_sparqlBase = 5, RULE_sparqlPrefix = 6, RULE_triples = 7, 
		RULE_predicateObjectList = 8, RULE_objectList = 9, RULE_verb = 10, RULE_subject = 11, 
		RULE_predicate = 12, RULE_object = 13, RULE_literal = 14, RULE_blankNodePropertyList = 15, 
		RULE_collection = 16, RULE_rdfLiteral = 17, RULE_iri = 18;
	public static final String[] ruleNames = {
		"turtleDoc", "statement", "directive", "prefixID", "base", "sparqlBase", 
		"sparqlPrefix", "triples", "predicateObjectList", "objectList", "verb", 
		"subject", "predicate", "object", "literal", "blankNodePropertyList", 
		"collection", "rdfLiteral", "iri"
	};

	@Override
	public String getGrammarFileName() { return "ExtractedTURTLE.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExtractedTURTLEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TurtleDocContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TurtleDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turtleDoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterTurtleDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitTurtleDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitTurtleDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurtleDocContext turtleDoc() throws RecognitionException {
		TurtleDocContext _localctx = new TurtleDocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_turtleDoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 12) | (1L << BlankNode) | (1L << IRIREF) | (1L << PrefixedName))) != 0)) {
				{
				{
				setState(38); statement();
				}
				}
				setState(43);
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

	public static class StatementContext extends ParserRuleContext {
		public TriplesContext triples() {
			return getRuleContext(TriplesContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(48);
			switch (_input.LA(1)) {
			case 2:
			case 9:
			case 11:
			case 12:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); directive();
				}
				break;
			case 7:
			case 8:
			case BlankNode:
			case IRIREF:
			case PrefixedName:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); triples();
				setState(46); match(5);
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

	public static class DirectiveContext extends ParserRuleContext {
		public SparqlBaseContext sparqlBase() {
			return getRuleContext(SparqlBaseContext.class,0);
		}
		public SparqlPrefixContext sparqlPrefix() {
			return getRuleContext(SparqlPrefixContext.class,0);
		}
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public PrefixIDContext prefixID() {
			return getRuleContext(PrefixIDContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_directive);
		try {
			setState(54);
			switch (_input.LA(1)) {
			case 12:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); prefixID();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); base();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 3);
				{
				setState(52); sparqlPrefix();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 4);
				{
				setState(53); sparqlBase();
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

	public static class PrefixIDContext extends ParserRuleContext {
		public TerminalNode PNAME_NS() { return getToken(ExtractedTURTLEParser.PNAME_NS, 0); }
		public TerminalNode IRIREF() { return getToken(ExtractedTURTLEParser.IRIREF, 0); }
		public PrefixIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterPrefixID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitPrefixID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitPrefixID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixIDContext prefixID() throws RecognitionException {
		PrefixIDContext _localctx = new PrefixIDContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefixID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(12);
			setState(57); match(PNAME_NS);
			setState(58); match(IRIREF);
			setState(59); match(5);
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

	public static class BaseContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(ExtractedTURTLEParser.IRIREF, 0); }
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(9);
			setState(62); match(IRIREF);
			setState(63); match(5);
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

	public static class SparqlBaseContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(ExtractedTURTLEParser.IRIREF, 0); }
		public SparqlBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterSparqlBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitSparqlBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitSparqlBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SparqlBaseContext sparqlBase() throws RecognitionException {
		SparqlBaseContext _localctx = new SparqlBaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sparqlBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(11);
			setState(66); match(IRIREF);
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

	public static class SparqlPrefixContext extends ParserRuleContext {
		public TerminalNode PNAME_NS() { return getToken(ExtractedTURTLEParser.PNAME_NS, 0); }
		public TerminalNode IRIREF() { return getToken(ExtractedTURTLEParser.IRIREF, 0); }
		public SparqlPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterSparqlPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitSparqlPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitSparqlPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SparqlPrefixContext sparqlPrefix() throws RecognitionException {
		SparqlPrefixContext _localctx = new SparqlPrefixContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sparqlPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(2);
			setState(69); match(PNAME_NS);
			setState(70); match(IRIREF);
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

	public static class TriplesContext extends ParserRuleContext {
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public PredicateObjectListContext predicateObjectList() {
			return getRuleContext(PredicateObjectListContext.class,0);
		}
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public TriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterTriples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitTriples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitTriples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriplesContext triples() throws RecognitionException {
		TriplesContext _localctx = new TriplesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_triples);
		int _la;
		try {
			setState(79);
			switch (_input.LA(1)) {
			case 8:
			case BlankNode:
			case IRIREF:
			case PrefixedName:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); subject();
				setState(73); predicateObjectList();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); blankNodePropertyList();
				setState(77);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << IRIREF) | (1L << PrefixedName))) != 0)) {
					{
					setState(76); predicateObjectList();
					}
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

	public static class PredicateObjectListContext extends ParserRuleContext {
		public List<VerbContext> verb() {
			return getRuleContexts(VerbContext.class);
		}
		public VerbContext verb(int i) {
			return getRuleContext(VerbContext.class,i);
		}
		public ObjectListContext objectList(int i) {
			return getRuleContext(ObjectListContext.class,i);
		}
		public List<ObjectListContext> objectList() {
			return getRuleContexts(ObjectListContext.class);
		}
		public PredicateObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateObjectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterPredicateObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitPredicateObjectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitPredicateObjectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateObjectListContext predicateObjectList() throws RecognitionException {
		PredicateObjectListContext _localctx = new PredicateObjectListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_predicateObjectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); verb();
			setState(82); objectList();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==10) {
				{
				{
				setState(83); match(10);
				setState(87);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << IRIREF) | (1L << PrefixedName))) != 0)) {
					{
					setState(84); verb();
					setState(85); objectList();
					}
				}

				}
				}
				setState(93);
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

	public static class ObjectListContext extends ParserRuleContext {
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitObjectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitObjectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectListContext objectList() throws RecognitionException {
		ObjectListContext _localctx = new ObjectListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_objectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); object();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6) {
				{
				{
				setState(95); match(6);
				setState(96); object();
				}
				}
				setState(101);
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

	public static class VerbContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitVerb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_verb);
		try {
			setState(104);
			switch (_input.LA(1)) {
			case IRIREF:
			case PrefixedName:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); predicate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); match(3);
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

	public static class SubjectContext extends ParserRuleContext {
		public TerminalNode BlankNode() { return getToken(ExtractedTURTLEParser.BlankNode, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_subject);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case IRIREF:
			case PrefixedName:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); iri();
				}
				break;
			case BlankNode:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); match(BlankNode);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 3);
				{
				setState(108); collection();
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

	public static class PredicateContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); iri();
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

	public static class ObjectContext extends ParserRuleContext {
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public TerminalNode BlankNode() { return getToken(ExtractedTURTLEParser.BlankNode, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_object);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case IRIREF:
			case PrefixedName:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); iri();
				}
				break;
			case BlankNode:
				enterOuterAlt(_localctx, 2);
				{
				setState(114); match(BlankNode);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 3);
				{
				setState(115); collection();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 4);
				{
				setState(116); blankNodePropertyList();
				}
				break;
			case NumericLiteral:
			case BooleanLiteral:
			case String:
				enterOuterAlt(_localctx, 5);
				{
				setState(117); literal();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NumericLiteral() { return getToken(ExtractedTURTLEParser.NumericLiteral, 0); }
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(ExtractedTURTLEParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		try {
			setState(123);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); rdfLiteral();
				}
				break;
			case NumericLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); match(NumericLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(122); match(BooleanLiteral);
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

	public static class BlankNodePropertyListContext extends ParserRuleContext {
		public PredicateObjectListContext predicateObjectList() {
			return getRuleContext(PredicateObjectListContext.class,0);
		}
		public BlankNodePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNodePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterBlankNodePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitBlankNodePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitBlankNodePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlankNodePropertyListContext blankNodePropertyList() throws RecognitionException {
		BlankNodePropertyListContext _localctx = new BlankNodePropertyListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blankNodePropertyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(7);
			setState(126); predicateObjectList();
			setState(127); match(1);
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

	public static class CollectionContext extends ParserRuleContext {
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitCollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitCollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(8);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 8) | (1L << NumericLiteral) | (1L << BooleanLiteral) | (1L << String) | (1L << BlankNode) | (1L << IRIREF) | (1L << PrefixedName))) != 0)) {
				{
				{
				setState(130); object();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136); match(4);
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

	public static class RdfLiteralContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(ExtractedTURTLEParser.String, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode LANGTAG() { return getToken(ExtractedTURTLEParser.LANGTAG, 0); }
		public RdfLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterRdfLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitRdfLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitRdfLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RdfLiteralContext rdfLiteral() throws RecognitionException {
		RdfLiteralContext _localctx = new RdfLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rdfLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(String);
			setState(142);
			switch (_input.LA(1)) {
			case LANGTAG:
				{
				setState(139); match(LANGTAG);
				}
				break;
			case 13:
				{
				setState(140); match(13);
				setState(141); iri();
				}
				break;
			case 1:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 10:
			case NumericLiteral:
			case BooleanLiteral:
			case String:
			case BlankNode:
			case IRIREF:
			case PrefixedName:
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

	public static class IriContext extends ParserRuleContext {
		public TerminalNode PrefixedName() { return getToken(ExtractedTURTLEParser.PrefixedName, 0); }
		public TerminalNode IRIREF() { return getToken(ExtractedTURTLEParser.IRIREF, 0); }
		public IriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).enterIri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtractedTURTLEListener ) ((ExtractedTURTLEListener)listener).exitIri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtractedTURTLEVisitor ) return ((ExtractedTURTLEVisitor<? extends T>)visitor).visitIri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IriContext iri() throws RecognitionException {
		IriContext _localctx = new IriContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_iri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==IRIREF || _la==PrefixedName) ) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\60\u0095\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\3\3\3\5\3\63"+
		"\n\3\3\4\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tP\n\t\5\tR\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\nZ\n\n\7\n\\\n\n\f\n\16\n_\13\n\3\13\3\13\3\13\7\13"+
		"d\n\13\f\13\16\13g\13\13\3\f\3\f\5\fk\n\f\3\r\3\r\3\r\5\rp\n\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\5\17y\n\17\3\20\3\20\3\20\5\20~\n\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\7\22\u0086\n\22\f\22\16\22\u0089\13\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\5\23\u0091\n\23\3\24\3\24\3\24\2\25\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\3\4\2\26\26\30\30\u0097\2+\3\2"+
		"\2\2\4\62\3\2\2\2\68\3\2\2\2\b:\3\2\2\2\n?\3\2\2\2\fC\3\2\2\2\16F\3\2"+
		"\2\2\20Q\3\2\2\2\22S\3\2\2\2\24`\3\2\2\2\26j\3\2\2\2\30o\3\2\2\2\32q\3"+
		"\2\2\2\34x\3\2\2\2\36}\3\2\2\2 \177\3\2\2\2\"\u0083\3\2\2\2$\u008c\3\2"+
		"\2\2&\u0092\3\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2"+
		",\3\3\2\2\2-+\3\2\2\2.\63\5\6\4\2/\60\5\20\t\2\60\61\7\7\2\2\61\63\3\2"+
		"\2\2\62.\3\2\2\2\62/\3\2\2\2\63\5\3\2\2\2\649\5\b\5\2\659\5\n\6\2\669"+
		"\5\16\b\2\679\5\f\7\28\64\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\2"+
		"9\7\3\2\2\2:;\7\16\2\2;<\7\27\2\2<=\7\26\2\2=>\7\7\2\2>\t\3\2\2\2?@\7"+
		"\13\2\2@A\7\26\2\2AB\7\7\2\2B\13\3\2\2\2CD\7\r\2\2DE\7\26\2\2E\r\3\2\2"+
		"\2FG\7\4\2\2GH\7\27\2\2HI\7\26\2\2I\17\3\2\2\2JK\5\30\r\2KL\5\22\n\2L"+
		"R\3\2\2\2MO\5 \21\2NP\5\22\n\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QJ\3\2\2\2"+
		"QM\3\2\2\2R\21\3\2\2\2ST\5\26\f\2T]\5\24\13\2UY\7\f\2\2VW\5\26\f\2WX\5"+
		"\24\13\2XZ\3\2\2\2YV\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[U\3\2\2\2\\_\3\2\2\2"+
		"][\3\2\2\2]^\3\2\2\2^\23\3\2\2\2_]\3\2\2\2`e\5\34\17\2ab\7\b\2\2bd\5\34"+
		"\17\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\25\3\2\2\2ge\3\2\2\2hk"+
		"\5\32\16\2ik\7\5\2\2jh\3\2\2\2ji\3\2\2\2k\27\3\2\2\2lp\5&\24\2mp\7\23"+
		"\2\2np\5\"\22\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\31\3\2\2\2qr\5&\24\2r\33"+
		"\3\2\2\2sy\5&\24\2ty\7\23\2\2uy\5\"\22\2vy\5 \21\2wy\5\36\20\2xs\3\2\2"+
		"\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\35\3\2\2\2z~\5$\23\2{~\7\20"+
		"\2\2|~\7\21\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\37\3\2\2\2\177\u0080\7"+
		"\t\2\2\u0080\u0081\5\22\n\2\u0081\u0082\7\3\2\2\u0082!\3\2\2\2\u0083\u0087"+
		"\7\n\2\2\u0084\u0086\5\34\17\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008b\7\6\2\2\u008b#\3\2\2\2\u008c\u0090\7\22\2\2\u008d"+
		"\u0091\7\33\2\2\u008e\u008f\7\17\2\2\u008f\u0091\5&\24\2\u0090\u008d\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091%\3\2\2\2\u0092\u0093"+
		"\t\2\2\2\u0093\'\3\2\2\2\20+\628OQY]ejox}\u0087\u0090";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}