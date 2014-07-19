// Generated from WebIDL.g4 by ANTLR 4.1
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
public class WebIDLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__61=1, T__60=2, T__59=3, T__58=4, T__57=5, T__56=6, T__55=7, T__54=8, 
		T__53=9, T__52=10, T__51=11, T__50=12, T__49=13, T__48=14, T__47=15, T__46=16, 
		T__45=17, T__44=18, T__43=19, T__42=20, T__41=21, T__40=22, T__39=23, 
		T__38=24, T__37=25, T__36=26, T__35=27, T__34=28, T__33=29, T__32=30, 
		T__31=31, T__30=32, T__29=33, T__28=34, T__27=35, T__26=36, T__25=37, 
		T__24=38, T__23=39, T__22=40, T__21=41, T__20=42, T__19=43, T__18=44, 
		T__17=45, T__16=46, T__15=47, T__14=48, T__13=49, T__12=50, T__11=51, 
		T__10=52, T__9=53, T__8=54, T__7=55, T__6=56, T__5=57, T__4=58, T__3=59, 
		T__2=60, T__1=61, T__0=62, INTEGER_WEBIDL=63, FLOAT_WEBIDL=64, IDENTIFIER_WEBIDL=65, 
		STRING_WEBIDL=66, WHITESPACE_WEBIDL=67, COMMENT_WEBIDL=68, OTHER_WEBIDL=69;
	public static final String[] tokenNames = {
		"<INVALID>", "'interface'", "'setter'", "'attribute'", "'['", "'or'", 
		"'<'", "'serializer'", "'false'", "'optional'", "'creator'", "'double'", 
		"'partial'", "'}'", "'boolean'", "'float'", "'any'", "'legacycaller'", 
		"')'", "'NaN'", "'unsigned'", "'object'", "'='", "'const'", "'null'", 
		"'exception'", "'enum'", "'long'", "']'", "'short'", "'callback'", "','", 
		"'-'", "':'", "'('", "'-Infinity'", "'?'", "'RegExp'", "'void'", "'stringifier'", 
		"'...'", "'{'", "'readonly'", "'getter'", "'unrestricted'", "'true'", 
		"'static'", "'iterator'", "'sequence'", "'byte'", "'octet'", "'.'", "'Infinity'", 
		"'deleter'", "'Date'", "'typedef'", "';'", "'>'", "'dictionary'", "'implements'", 
		"'inherit'", "'DOMString'", "'ByteString'", "INTEGER_WEBIDL", "FLOAT_WEBIDL", 
		"IDENTIFIER_WEBIDL", "STRING_WEBIDL", "WHITESPACE_WEBIDL", "COMMENT_WEBIDL", 
		"OTHER_WEBIDL"
	};
	public static final int
		RULE_webIDL = 0, RULE_definitions = 1, RULE_definition = 2, RULE_callbackOrInterface = 3, 
		RULE_callbackRestOrInterface = 4, RULE_interface_ = 5, RULE_partial = 6, 
		RULE_partialDefinition = 7, RULE_partialInterface = 8, RULE_interfaceMembers = 9, 
		RULE_interfaceMember = 10, RULE_dictionary = 11, RULE_dictionaryMembers = 12, 
		RULE_dictionaryMember = 13, RULE_partialDictionary = 14, RULE_default_ = 15, 
		RULE_defaultValue = 16, RULE_exception = 17, RULE_exceptionMembers = 18, 
		RULE_inheritance = 19, RULE_enum_ = 20, RULE_enumValueList = 21, RULE_enumValueListComma = 22, 
		RULE_enumValueListString = 23, RULE_callbackRest = 24, RULE_typedef = 25, 
		RULE_implementsStatement = 26, RULE_const_ = 27, RULE_constValue = 28, 
		RULE_booleanLiteral = 29, RULE_floatLiteral = 30, RULE_attributeOrOperationOrIterator = 31, 
		RULE_serializer = 32, RULE_serializerRest = 33, RULE_serializationPattern = 34, 
		RULE_serializationPatternMap = 35, RULE_serializationPatternList = 36, 
		RULE_identifiers = 37, RULE_stringifier = 38, RULE_stringifierRest = 39, 
		RULE_staticMember = 40, RULE_staticMemberRest = 41, RULE_attribute = 42, 
		RULE_attributeRest = 43, RULE_inherit = 44, RULE_readOnly = 45, RULE_operationOrIterator = 46, 
		RULE_specialOperation = 47, RULE_specials = 48, RULE_special = 49, RULE_operationOrIteratorRest = 50, 
		RULE_iteratorRest = 51, RULE_optionalIteratorInterfaceOrObject = 52, RULE_optionalIteratorInterface = 53, 
		RULE_operationRest = 54, RULE_optionalIdentifier = 55, RULE_argumentList = 56, 
		RULE_arguments = 57, RULE_argument = 58, RULE_optionalOrRequiredArgument = 59, 
		RULE_argumentName = 60, RULE_ellipsis = 61, RULE_exceptionMember = 62, 
		RULE_exceptionField = 63, RULE_extendedAttributeList = 64, RULE_extendedAttributes = 65, 
		RULE_extendedAttribute = 66, RULE_extendedAttributeRest = 67, RULE_extendedAttributeInner = 68, 
		RULE_other = 69, RULE_argumentNameKeyword = 70, RULE_otherOrComma = 71, 
		RULE_type = 72, RULE_singleType = 73, RULE_unionType = 74, RULE_unionMemberType = 75, 
		RULE_unionMemberTypes = 76, RULE_nonAnyType = 77, RULE_constType = 78, 
		RULE_primitiveType = 79, RULE_unrestrictedFloatType = 80, RULE_floatType = 81, 
		RULE_unsignedIntegerType = 82, RULE_integerType = 83, RULE_optionalLong = 84, 
		RULE_typeSuffix = 85, RULE_typeSuffixStartingWithArray = 86, RULE_null_ = 87, 
		RULE_returnType = 88, RULE_extendedAttributeNoArgs = 89, RULE_extendedAttributeArgList = 90, 
		RULE_extendedAttributeIdent = 91, RULE_extendedAttributeNamedArgList = 92, 
		RULE_extendedAttributeTypePair = 93;
	public static final String[] ruleNames = {
		"webIDL", "definitions", "definition", "callbackOrInterface", "callbackRestOrInterface", 
		"interface_", "partial", "partialDefinition", "partialInterface", "interfaceMembers", 
		"interfaceMember", "dictionary", "dictionaryMembers", "dictionaryMember", 
		"partialDictionary", "default_", "defaultValue", "exception", "exceptionMembers", 
		"inheritance", "enum_", "enumValueList", "enumValueListComma", "enumValueListString", 
		"callbackRest", "typedef", "implementsStatement", "const_", "constValue", 
		"booleanLiteral", "floatLiteral", "attributeOrOperationOrIterator", "serializer", 
		"serializerRest", "serializationPattern", "serializationPatternMap", "serializationPatternList", 
		"identifiers", "stringifier", "stringifierRest", "staticMember", "staticMemberRest", 
		"attribute", "attributeRest", "inherit", "readOnly", "operationOrIterator", 
		"specialOperation", "specials", "special", "operationOrIteratorRest", 
		"iteratorRest", "optionalIteratorInterfaceOrObject", "optionalIteratorInterface", 
		"operationRest", "optionalIdentifier", "argumentList", "arguments", "argument", 
		"optionalOrRequiredArgument", "argumentName", "ellipsis", "exceptionMember", 
		"exceptionField", "extendedAttributeList", "extendedAttributes", "extendedAttribute", 
		"extendedAttributeRest", "extendedAttributeInner", "other", "argumentNameKeyword", 
		"otherOrComma", "type", "singleType", "unionType", "unionMemberType", 
		"unionMemberTypes", "nonAnyType", "constType", "primitiveType", "unrestrictedFloatType", 
		"floatType", "unsignedIntegerType", "integerType", "optionalLong", "typeSuffix", 
		"typeSuffixStartingWithArray", "null_", "returnType", "extendedAttributeNoArgs", 
		"extendedAttributeArgList", "extendedAttributeIdent", "extendedAttributeNamedArgList", 
		"extendedAttributeTypePair"
	};

	@Override
	public String getGrammarFileName() { return "WebIDL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public WebIDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WebIDLContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(WebIDLParser.EOF, 0); }
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public WebIDLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_webIDL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterWebIDL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitWebIDL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitWebIDL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WebIDLContext webIDL() throws RecognitionException {
		WebIDLContext _localctx = new WebIDLContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_webIDL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); definitions();
			setState(189); match(EOF);
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

	public static class DefinitionsContext extends ParserRuleContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		try {
			setState(196);
			switch (_input.LA(1)) {
			case 1:
			case 4:
			case 12:
			case 25:
			case 26:
			case 30:
			case 55:
			case 58:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); extendedAttributeList();
				setState(192); definition();
				setState(193); definitions();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DefinitionContext extends ParserRuleContext {
		public ImplementsStatementContext implementsStatement() {
			return getRuleContext(ImplementsStatementContext.class,0);
		}
		public DictionaryContext dictionary() {
			return getRuleContext(DictionaryContext.class,0);
		}
		public PartialContext partial() {
			return getRuleContext(PartialContext.class,0);
		}
		public Enum_Context enum_() {
			return getRuleContext(Enum_Context.class,0);
		}
		public ExceptionContext exception() {
			return getRuleContext(ExceptionContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public CallbackOrInterfaceContext callbackOrInterface() {
			return getRuleContext(CallbackOrInterfaceContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			setState(205);
			switch (_input.LA(1)) {
			case 1:
			case 30:
				enterOuterAlt(_localctx, 1);
				{
				setState(198); callbackOrInterface();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 2);
				{
				setState(199); partial();
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 3);
				{
				setState(200); dictionary();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 4);
				{
				setState(201); exception();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 5);
				{
				setState(202); enum_();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 6);
				{
				setState(203); typedef();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 7);
				{
				setState(204); implementsStatement();
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

	public static class CallbackOrInterfaceContext extends ParserRuleContext {
		public Interface_Context interface_() {
			return getRuleContext(Interface_Context.class,0);
		}
		public CallbackRestOrInterfaceContext callbackRestOrInterface() {
			return getRuleContext(CallbackRestOrInterfaceContext.class,0);
		}
		public CallbackOrInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callbackOrInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterCallbackOrInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitCallbackOrInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitCallbackOrInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallbackOrInterfaceContext callbackOrInterface() throws RecognitionException {
		CallbackOrInterfaceContext _localctx = new CallbackOrInterfaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_callbackOrInterface);
		try {
			setState(210);
			switch (_input.LA(1)) {
			case 30:
				enterOuterAlt(_localctx, 1);
				{
				setState(207); match(30);
				setState(208); callbackRestOrInterface();
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 2);
				{
				setState(209); interface_();
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

	public static class CallbackRestOrInterfaceContext extends ParserRuleContext {
		public Interface_Context interface_() {
			return getRuleContext(Interface_Context.class,0);
		}
		public CallbackRestContext callbackRest() {
			return getRuleContext(CallbackRestContext.class,0);
		}
		public CallbackRestOrInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callbackRestOrInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterCallbackRestOrInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitCallbackRestOrInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitCallbackRestOrInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallbackRestOrInterfaceContext callbackRestOrInterface() throws RecognitionException {
		CallbackRestOrInterfaceContext _localctx = new CallbackRestOrInterfaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_callbackRestOrInterface);
		try {
			setState(214);
			switch (_input.LA(1)) {
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(212); callbackRest();
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 2);
				{
				setState(213); interface_();
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

	public static class Interface_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public InterfaceMembersContext interfaceMembers() {
			return getRuleContext(InterfaceMembersContext.class,0);
		}
		public Interface_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInterface_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInterface_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitInterface_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_Context interface_() throws RecognitionException {
		Interface_Context _localctx = new Interface_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_interface_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); match(1);
			setState(217); match(IDENTIFIER_WEBIDL);
			setState(218); inheritance();
			setState(219); match(41);
			setState(220); interfaceMembers();
			setState(221); match(13);
			setState(222); match(56);
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

	public static class PartialContext extends ParserRuleContext {
		public PartialDefinitionContext partialDefinition() {
			return getRuleContext(PartialDefinitionContext.class,0);
		}
		public PartialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPartial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPartial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitPartial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialContext partial() throws RecognitionException {
		PartialContext _localctx = new PartialContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_partial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(12);
			setState(225); partialDefinition();
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

	public static class PartialDefinitionContext extends ParserRuleContext {
		public PartialInterfaceContext partialInterface() {
			return getRuleContext(PartialInterfaceContext.class,0);
		}
		public PartialDictionaryContext partialDictionary() {
			return getRuleContext(PartialDictionaryContext.class,0);
		}
		public PartialDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPartialDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPartialDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitPartialDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialDefinitionContext partialDefinition() throws RecognitionException {
		PartialDefinitionContext _localctx = new PartialDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_partialDefinition);
		try {
			setState(229);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); partialInterface();
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 2);
				{
				setState(228); partialDictionary();
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

	public static class PartialInterfaceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public InterfaceMembersContext interfaceMembers() {
			return getRuleContext(InterfaceMembersContext.class,0);
		}
		public PartialInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPartialInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPartialInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitPartialInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialInterfaceContext partialInterface() throws RecognitionException {
		PartialInterfaceContext _localctx = new PartialInterfaceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_partialInterface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(1);
			setState(232); match(IDENTIFIER_WEBIDL);
			setState(233); match(41);
			setState(234); interfaceMembers();
			setState(235); match(13);
			setState(236); match(56);
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

	public static class InterfaceMembersContext extends ParserRuleContext {
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public InterfaceMemberContext interfaceMember() {
			return getRuleContext(InterfaceMemberContext.class,0);
		}
		public InterfaceMembersContext interfaceMembers() {
			return getRuleContext(InterfaceMembersContext.class,0);
		}
		public InterfaceMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInterfaceMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInterfaceMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitInterfaceMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMembersContext interfaceMembers() throws RecognitionException {
		InterfaceMembersContext _localctx = new InterfaceMembersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interfaceMembers);
		try {
			setState(243);
			switch (_input.LA(1)) {
			case 2:
			case 3:
			case 4:
			case 7:
			case 10:
			case 11:
			case 14:
			case 15:
			case 16:
			case 17:
			case 20:
			case 21:
			case 23:
			case 27:
			case 29:
			case 34:
			case 37:
			case 38:
			case 39:
			case 42:
			case 43:
			case 44:
			case 46:
			case 48:
			case 49:
			case 50:
			case 53:
			case 54:
			case 60:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(238); extendedAttributeList();
				setState(239); interfaceMember();
				setState(240); interfaceMembers();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class InterfaceMemberContext extends ParserRuleContext {
		public Const_Context const_() {
			return getRuleContext(Const_Context.class,0);
		}
		public AttributeOrOperationOrIteratorContext attributeOrOperationOrIterator() {
			return getRuleContext(AttributeOrOperationOrIteratorContext.class,0);
		}
		public InterfaceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInterfaceMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInterfaceMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitInterfaceMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberContext interfaceMember() throws RecognitionException {
		InterfaceMemberContext _localctx = new InterfaceMemberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceMember);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				setState(245); const_();
				}
				break;
			case 2:
			case 3:
			case 7:
			case 10:
			case 11:
			case 14:
			case 15:
			case 16:
			case 17:
			case 20:
			case 21:
			case 27:
			case 29:
			case 34:
			case 37:
			case 38:
			case 39:
			case 42:
			case 43:
			case 44:
			case 46:
			case 48:
			case 49:
			case 50:
			case 53:
			case 54:
			case 60:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(246); attributeOrOperationOrIterator();
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

	public static class DictionaryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public DictionaryMembersContext dictionaryMembers() {
			return getRuleContext(DictionaryMembersContext.class,0);
		}
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public DictionaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDictionary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDictionary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryContext dictionary() throws RecognitionException {
		DictionaryContext _localctx = new DictionaryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dictionary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(58);
			setState(250); match(IDENTIFIER_WEBIDL);
			setState(251); inheritance();
			setState(252); match(41);
			setState(253); dictionaryMembers();
			setState(254); match(13);
			setState(255); match(56);
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

	public static class DictionaryMembersContext extends ParserRuleContext {
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public DictionaryMembersContext dictionaryMembers() {
			return getRuleContext(DictionaryMembersContext.class,0);
		}
		public DictionaryMemberContext dictionaryMember() {
			return getRuleContext(DictionaryMemberContext.class,0);
		}
		public DictionaryMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDictionaryMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDictionaryMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDictionaryMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryMembersContext dictionaryMembers() throws RecognitionException {
		DictionaryMembersContext _localctx = new DictionaryMembersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dictionaryMembers);
		try {
			setState(262);
			switch (_input.LA(1)) {
			case 4:
			case 11:
			case 14:
			case 15:
			case 16:
			case 20:
			case 21:
			case 27:
			case 29:
			case 34:
			case 37:
			case 44:
			case 48:
			case 49:
			case 50:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); extendedAttributeList();
				setState(258); dictionaryMember();
				setState(259); dictionaryMembers();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DictionaryMemberContext extends ParserRuleContext {
		public Default_Context default_() {
			return getRuleContext(Default_Context.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DictionaryMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDictionaryMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDictionaryMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDictionaryMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryMemberContext dictionaryMember() throws RecognitionException {
		DictionaryMemberContext _localctx = new DictionaryMemberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dictionaryMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); type();
			setState(265); match(IDENTIFIER_WEBIDL);
			setState(266); default_();
			setState(267); match(56);
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

	public static class PartialDictionaryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public DictionaryMembersContext dictionaryMembers() {
			return getRuleContext(DictionaryMembersContext.class,0);
		}
		public PartialDictionaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialDictionary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPartialDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPartialDictionary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitPartialDictionary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialDictionaryContext partialDictionary() throws RecognitionException {
		PartialDictionaryContext _localctx = new PartialDictionaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partialDictionary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269); match(58);
			setState(270); match(IDENTIFIER_WEBIDL);
			setState(271); match(41);
			setState(272); dictionaryMembers();
			setState(273); match(13);
			setState(274); match(56);
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

	public static class Default_Context extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public Default_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDefault_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDefault_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDefault_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_Context default_() throws RecognitionException {
		Default_Context _localctx = new Default_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_default_);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case 22:
				enterOuterAlt(_localctx, 1);
				{
				setState(276); match(22);
				setState(277); defaultValue();
				}
				break;
			case 18:
			case 31:
			case 56:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DefaultValueContext extends ParserRuleContext {
		public ConstValueContext constValue() {
			return getRuleContext(ConstValueContext.class,0);
		}
		public TerminalNode STRING_WEBIDL() { return getToken(WebIDLParser.STRING_WEBIDL, 0); }
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_defaultValue);
		try {
			setState(283);
			switch (_input.LA(1)) {
			case 8:
			case 19:
			case 24:
			case 35:
			case 45:
			case 52:
			case INTEGER_WEBIDL:
			case FLOAT_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(281); constValue();
				}
				break;
			case STRING_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); match(STRING_WEBIDL);
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

	public static class ExceptionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ExceptionMembersContext exceptionMembers() {
			return getRuleContext(ExceptionMembersContext.class,0);
		}
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public ExceptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitException(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitException(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionContext exception() throws RecognitionException {
		ExceptionContext _localctx = new ExceptionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exception);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(25);
			setState(286); match(IDENTIFIER_WEBIDL);
			setState(287); inheritance();
			setState(288); match(41);
			setState(289); exceptionMembers();
			setState(290); match(13);
			setState(291); match(56);
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

	public static class ExceptionMembersContext extends ParserRuleContext {
		public ExceptionMemberContext exceptionMember() {
			return getRuleContext(ExceptionMemberContext.class,0);
		}
		public ExceptionMembersContext exceptionMembers() {
			return getRuleContext(ExceptionMembersContext.class,0);
		}
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public ExceptionMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExceptionMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExceptionMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExceptionMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionMembersContext exceptionMembers() throws RecognitionException {
		ExceptionMembersContext _localctx = new ExceptionMembersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exceptionMembers);
		try {
			setState(298);
			switch (_input.LA(1)) {
			case 4:
			case 11:
			case 14:
			case 15:
			case 16:
			case 20:
			case 21:
			case 23:
			case 27:
			case 29:
			case 34:
			case 37:
			case 44:
			case 48:
			case 49:
			case 50:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(293); extendedAttributeList();
				setState(294); exceptionMember();
				setState(295); exceptionMembers();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class InheritanceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public InheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInheritance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitInheritance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inheritance);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case 33:
				enterOuterAlt(_localctx, 1);
				{
				setState(300); match(33);
				setState(301); match(IDENTIFIER_WEBIDL);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Enum_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public EnumValueListContext enumValueList() {
			return getRuleContext(EnumValueListContext.class,0);
		}
		public Enum_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEnum_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEnum_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitEnum_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_Context enum_() throws RecognitionException {
		Enum_Context _localctx = new Enum_Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_enum_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(26);
			setState(306); match(IDENTIFIER_WEBIDL);
			setState(307); match(41);
			setState(308); enumValueList();
			setState(309); match(13);
			setState(310); match(56);
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

	public static class EnumValueListContext extends ParserRuleContext {
		public TerminalNode STRING_WEBIDL() { return getToken(WebIDLParser.STRING_WEBIDL, 0); }
		public EnumValueListCommaContext enumValueListComma() {
			return getRuleContext(EnumValueListCommaContext.class,0);
		}
		public EnumValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEnumValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEnumValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitEnumValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueListContext enumValueList() throws RecognitionException {
		EnumValueListContext _localctx = new EnumValueListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumValueList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); match(STRING_WEBIDL);
			setState(313); enumValueListComma();
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

	public static class EnumValueListCommaContext extends ParserRuleContext {
		public EnumValueListStringContext enumValueListString() {
			return getRuleContext(EnumValueListStringContext.class,0);
		}
		public EnumValueListCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueListComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEnumValueListComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEnumValueListComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitEnumValueListComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueListCommaContext enumValueListComma() throws RecognitionException {
		EnumValueListCommaContext _localctx = new EnumValueListCommaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumValueListComma);
		try {
			setState(318);
			switch (_input.LA(1)) {
			case 31:
				enterOuterAlt(_localctx, 1);
				{
				setState(315); match(31);
				setState(316); enumValueListString();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class EnumValueListStringContext extends ParserRuleContext {
		public TerminalNode STRING_WEBIDL() { return getToken(WebIDLParser.STRING_WEBIDL, 0); }
		public EnumValueListCommaContext enumValueListComma() {
			return getRuleContext(EnumValueListCommaContext.class,0);
		}
		public EnumValueListStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueListString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEnumValueListString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEnumValueListString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitEnumValueListString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueListStringContext enumValueListString() throws RecognitionException {
		EnumValueListStringContext _localctx = new EnumValueListStringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumValueListString);
		try {
			setState(323);
			switch (_input.LA(1)) {
			case STRING_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(320); match(STRING_WEBIDL);
				setState(321); enumValueListComma();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CallbackRestContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public CallbackRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callbackRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterCallbackRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitCallbackRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitCallbackRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallbackRestContext callbackRest() throws RecognitionException {
		CallbackRestContext _localctx = new CallbackRestContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_callbackRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); match(IDENTIFIER_WEBIDL);
			setState(326); match(22);
			setState(327); returnType();
			setState(328); match(34);
			setState(329); argumentList();
			setState(330); match(18);
			setState(331); match(56);
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

	public static class TypedefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterTypedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitTypedef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitTypedef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); match(55);
			setState(334); extendedAttributeList();
			setState(335); type();
			setState(336); match(IDENTIFIER_WEBIDL);
			setState(337); match(56);
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

	public static class ImplementsStatementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER_WEBIDL() { return getTokens(WebIDLParser.IDENTIFIER_WEBIDL); }
		public TerminalNode IDENTIFIER_WEBIDL(int i) {
			return getToken(WebIDLParser.IDENTIFIER_WEBIDL, i);
		}
		public ImplementsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterImplementsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitImplementsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitImplementsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsStatementContext implementsStatement() throws RecognitionException {
		ImplementsStatementContext _localctx = new ImplementsStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_implementsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(IDENTIFIER_WEBIDL);
			setState(340); match(59);
			setState(341); match(IDENTIFIER_WEBIDL);
			setState(342); match(56);
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

	public static class Const_Context extends ParserRuleContext {
		public ConstTypeContext constType() {
			return getRuleContext(ConstTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ConstValueContext constValue() {
			return getRuleContext(ConstValueContext.class,0);
		}
		public Const_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterConst_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitConst_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitConst_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_Context const_() throws RecognitionException {
		Const_Context _localctx = new Const_Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_const_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); match(23);
			setState(345); constType();
			setState(346); match(IDENTIFIER_WEBIDL);
			setState(347); match(22);
			setState(348); constValue();
			setState(349); match(56);
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

	public static class ConstValueContext extends ParserRuleContext {
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode INTEGER_WEBIDL() { return getToken(WebIDLParser.INTEGER_WEBIDL, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public ConstValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterConstValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitConstValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitConstValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstValueContext constValue() throws RecognitionException {
		ConstValueContext _localctx = new ConstValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constValue);
		try {
			setState(355);
			switch (_input.LA(1)) {
			case 8:
			case 45:
				enterOuterAlt(_localctx, 1);
				{
				setState(351); booleanLiteral();
				}
				break;
			case 19:
			case 35:
			case 52:
			case FLOAT_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(352); floatLiteral();
				}
				break;
			case INTEGER_WEBIDL:
				enterOuterAlt(_localctx, 3);
				{
				setState(353); match(INTEGER_WEBIDL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 4);
				{
				setState(354); match(24);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !(_la==8 || _la==45) ) {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_WEBIDL() { return getToken(WebIDLParser.FLOAT_WEBIDL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !(((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (19 - 19)) | (1L << (35 - 19)) | (1L << (52 - 19)) | (1L << (FLOAT_WEBIDL - 19)))) != 0)) ) {
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

	public static class AttributeOrOperationOrIteratorContext extends ParserRuleContext {
		public StringifierContext stringifier() {
			return getRuleContext(StringifierContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public StaticMemberContext staticMember() {
			return getRuleContext(StaticMemberContext.class,0);
		}
		public SerializerContext serializer() {
			return getRuleContext(SerializerContext.class,0);
		}
		public OperationOrIteratorContext operationOrIterator() {
			return getRuleContext(OperationOrIteratorContext.class,0);
		}
		public AttributeOrOperationOrIteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOrOperationOrIterator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterAttributeOrOperationOrIterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitAttributeOrOperationOrIterator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitAttributeOrOperationOrIterator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeOrOperationOrIteratorContext attributeOrOperationOrIterator() throws RecognitionException {
		AttributeOrOperationOrIteratorContext _localctx = new AttributeOrOperationOrIteratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_attributeOrOperationOrIterator);
		try {
			setState(366);
			switch (_input.LA(1)) {
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(361); serializer();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 2);
				{
				setState(362); stringifier();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 3);
				{
				setState(363); staticMember();
				}
				break;
			case 3:
			case 42:
			case 60:
				enterOuterAlt(_localctx, 4);
				{
				setState(364); attribute();
				}
				break;
			case 2:
			case 10:
			case 11:
			case 14:
			case 15:
			case 16:
			case 17:
			case 20:
			case 21:
			case 27:
			case 29:
			case 34:
			case 37:
			case 38:
			case 43:
			case 44:
			case 48:
			case 49:
			case 50:
			case 53:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 5);
				{
				setState(365); operationOrIterator();
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

	public static class SerializerContext extends ParserRuleContext {
		public SerializerRestContext serializerRest() {
			return getRuleContext(SerializerRestContext.class,0);
		}
		public SerializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSerializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerializerContext serializer() throws RecognitionException {
		SerializerContext _localctx = new SerializerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_serializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); match(7);
			setState(369); serializerRest();
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

	public static class SerializerRestContext extends ParserRuleContext {
		public SerializationPatternContext serializationPattern() {
			return getRuleContext(SerializationPatternContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public SerializerRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializerRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializerRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializerRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSerializerRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerializerRestContext serializerRest() throws RecognitionException {
		SerializerRestContext _localctx = new SerializerRestContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_serializerRest);
		try {
			setState(375);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371); operationRest();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372); match(22);
				setState(373); serializationPattern();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class SerializationPatternContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public SerializationPatternMapContext serializationPatternMap() {
			return getRuleContext(SerializationPatternMapContext.class,0);
		}
		public SerializationPatternListContext serializationPatternList() {
			return getRuleContext(SerializationPatternListContext.class,0);
		}
		public SerializationPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializationPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializationPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializationPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSerializationPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerializationPatternContext serializationPattern() throws RecognitionException {
		SerializationPatternContext _localctx = new SerializationPatternContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_serializationPattern);
		try {
			setState(386);
			switch (_input.LA(1)) {
			case 41:
				enterOuterAlt(_localctx, 1);
				{
				setState(377); match(41);
				setState(378); serializationPatternMap();
				setState(379); match(13);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				setState(381); match(4);
				setState(382); serializationPatternList();
				setState(383); match(28);
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 3);
				{
				setState(385); match(IDENTIFIER_WEBIDL);
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

	public static class SerializationPatternMapContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public SerializationPatternMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializationPatternMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializationPatternMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializationPatternMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSerializationPatternMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerializationPatternMapContext serializationPatternMap() throws RecognitionException {
		SerializationPatternMapContext _localctx = new SerializationPatternMapContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_serializationPatternMap);
		try {
			setState(394);
			switch (_input.LA(1)) {
			case 43:
				enterOuterAlt(_localctx, 1);
				{
				setState(388); match(43);
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 2);
				{
				setState(389); match(60);
				setState(390); identifiers();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 3);
				{
				setState(391); match(IDENTIFIER_WEBIDL);
				setState(392); identifiers();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class SerializationPatternListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public SerializationPatternListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializationPatternList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializationPatternList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializationPatternList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSerializationPatternList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerializationPatternListContext serializationPatternList() throws RecognitionException {
		SerializationPatternListContext _localctx = new SerializationPatternListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_serializationPatternList);
		try {
			setState(400);
			switch (_input.LA(1)) {
			case 43:
				enterOuterAlt(_localctx, 1);
				{
				setState(396); match(43);
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(397); match(IDENTIFIER_WEBIDL);
				setState(398); identifiers();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class IdentifiersContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public IdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiersContext identifiers() throws RecognitionException {
		IdentifiersContext _localctx = new IdentifiersContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_identifiers);
		try {
			setState(406);
			switch (_input.LA(1)) {
			case 31:
				enterOuterAlt(_localctx, 1);
				{
				setState(402); match(31);
				setState(403); match(IDENTIFIER_WEBIDL);
				setState(404); identifiers();
				}
				break;
			case 13:
			case 28:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StringifierContext extends ParserRuleContext {
		public StringifierRestContext stringifierRest() {
			return getRuleContext(StringifierRestContext.class,0);
		}
		public StringifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterStringifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitStringifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitStringifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringifierContext stringifier() throws RecognitionException {
		StringifierContext _localctx = new StringifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_stringifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); match(39);
			setState(409); stringifierRest();
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

	public static class StringifierRestContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public AttributeRestContext attributeRest() {
			return getRuleContext(AttributeRestContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public StringifierRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringifierRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterStringifierRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitStringifierRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitStringifierRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringifierRestContext stringifierRest() throws RecognitionException {
		StringifierRestContext _localctx = new StringifierRestContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_stringifierRest);
		try {
			setState(416);
			switch (_input.LA(1)) {
			case 3:
			case 42:
				enterOuterAlt(_localctx, 1);
				{
				setState(411); attributeRest();
				}
				break;
			case 11:
			case 14:
			case 15:
			case 16:
			case 20:
			case 21:
			case 27:
			case 29:
			case 34:
			case 37:
			case 38:
			case 44:
			case 48:
			case 49:
			case 50:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(412); returnType();
				setState(413); operationRest();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 3);
				{
				setState(415); match(56);
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

	public static class StaticMemberContext extends ParserRuleContext {
		public StaticMemberRestContext staticMemberRest() {
			return getRuleContext(StaticMemberRestContext.class,0);
		}
		public StaticMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterStaticMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitStaticMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitStaticMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticMemberContext staticMember() throws RecognitionException {
		StaticMemberContext _localctx = new StaticMemberContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_staticMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); match(46);
			setState(419); staticMemberRest();
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

	public static class StaticMemberRestContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public AttributeRestContext attributeRest() {
			return getRuleContext(AttributeRestContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public StaticMemberRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticMemberRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterStaticMemberRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitStaticMemberRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitStaticMemberRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticMemberRestContext staticMemberRest() throws RecognitionException {
		StaticMemberRestContext _localctx = new StaticMemberRestContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_staticMemberRest);
		try {
			setState(425);
			switch (_input.LA(1)) {
			case 3:
			case 42:
				enterOuterAlt(_localctx, 1);
				{
				setState(421); attributeRest();
				}
				break;
			case 11:
			case 14:
			case 15:
			case 16:
			case 20:
			case 21:
			case 27:
			case 29:
			case 34:
			case 37:
			case 38:
			case 44:
			case 48:
			case 49:
			case 50:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(422); returnType();
				setState(423); operationRest();
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

	public static class AttributeContext extends ParserRuleContext {
		public InheritContext inherit() {
			return getRuleContext(InheritContext.class,0);
		}
		public AttributeRestContext attributeRest() {
			return getRuleContext(AttributeRestContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); inherit();
			setState(428); attributeRest();
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

	public static class AttributeRestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ReadOnlyContext readOnly() {
			return getRuleContext(ReadOnlyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributeRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterAttributeRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitAttributeRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitAttributeRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeRestContext attributeRest() throws RecognitionException {
		AttributeRestContext _localctx = new AttributeRestContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_attributeRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); readOnly();
			setState(431); match(3);
			setState(432); type();
			setState(433); match(IDENTIFIER_WEBIDL);
			setState(434); match(56);
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

	public static class InheritContext extends ParserRuleContext {
		public InheritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInherit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInherit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitInherit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritContext inherit() throws RecognitionException {
		InheritContext _localctx = new InheritContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_inherit);
		try {
			setState(438);
			switch (_input.LA(1)) {
			case 60:
				enterOuterAlt(_localctx, 1);
				{
				setState(436); match(60);
				}
				break;
			case 3:
			case 42:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ReadOnlyContext extends ParserRuleContext {
		public ReadOnlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readOnly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReadOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReadOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitReadOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadOnlyContext readOnly() throws RecognitionException {
		ReadOnlyContext _localctx = new ReadOnlyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_readOnly);
		try {
			setState(442);
			switch (_input.LA(1)) {
			case 42:
				enterOuterAlt(_localctx, 1);
				{
				setState(440); match(42);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OperationOrIteratorContext extends ParserRuleContext {
		public SpecialOperationContext specialOperation() {
			return getRuleContext(SpecialOperationContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public OperationOrIteratorRestContext operationOrIteratorRest() {
			return getRuleContext(OperationOrIteratorRestContext.class,0);
		}
		public OperationOrIteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationOrIterator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOperationOrIterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOperationOrIterator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOperationOrIterator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationOrIteratorContext operationOrIterator() throws RecognitionException {
		OperationOrIteratorContext _localctx = new OperationOrIteratorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_operationOrIterator);
		try {
			setState(448);
			switch (_input.LA(1)) {
			case 11:
			case 14:
			case 15:
			case 16:
			case 20:
			case 21:
			case 27:
			case 29:
			case 34:
			case 37:
			case 38:
			case 44:
			case 48:
			case 49:
			case 50:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(444); returnType();
				setState(445); operationOrIteratorRest();
				}
				break;
			case 2:
			case 10:
			case 17:
			case 43:
			case 53:
				enterOuterAlt(_localctx, 2);
				{
				setState(447); specialOperation();
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

	public static class SpecialOperationContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public SpecialsContext specials() {
			return getRuleContext(SpecialsContext.class,0);
		}
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public SpecialOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSpecialOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSpecialOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSpecialOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialOperationContext specialOperation() throws RecognitionException {
		SpecialOperationContext _localctx = new SpecialOperationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_specialOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); special();
			setState(451); specials();
			setState(452); returnType();
			setState(453); operationRest();
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

	public static class SpecialsContext extends ParserRuleContext {
		public SpecialsContext specials() {
			return getRuleContext(SpecialsContext.class,0);
		}
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public SpecialsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specials; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSpecials(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSpecials(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSpecials(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialsContext specials() throws RecognitionException {
		SpecialsContext _localctx = new SpecialsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_specials);
		try {
			setState(459);
			switch (_input.LA(1)) {
			case 2:
			case 10:
			case 17:
			case 43:
			case 53:
				enterOuterAlt(_localctx, 1);
				{
				setState(455); special();
				setState(456); specials();
				}
				break;
			case 11:
			case 14:
			case 15:
			case 16:
			case 20:
			case 21:
			case 27:
			case 29:
			case 34:
			case 37:
			case 38:
			case 44:
			case 48:
			case 49:
			case 50:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SpecialContext extends ParserRuleContext {
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSpecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 10) | (1L << 17) | (1L << 43) | (1L << 53))) != 0)) ) {
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

	public static class OperationOrIteratorRestContext extends ParserRuleContext {
		public IteratorRestContext iteratorRest() {
			return getRuleContext(IteratorRestContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public OperationOrIteratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationOrIteratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOperationOrIteratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOperationOrIteratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOperationOrIteratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationOrIteratorRestContext operationOrIteratorRest() throws RecognitionException {
		OperationOrIteratorRestContext _localctx = new OperationOrIteratorRestContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_operationOrIteratorRest);
		try {
			setState(465);
			switch (_input.LA(1)) {
			case 47:
				enterOuterAlt(_localctx, 1);
				{
				setState(463); iteratorRest();
				}
				break;
			case 34:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(464); operationRest();
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

	public static class IteratorRestContext extends ParserRuleContext {
		public OptionalIteratorInterfaceOrObjectContext optionalIteratorInterfaceOrObject() {
			return getRuleContext(OptionalIteratorInterfaceOrObjectContext.class,0);
		}
		public IteratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterIteratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitIteratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitIteratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteratorRestContext iteratorRest() throws RecognitionException {
		IteratorRestContext _localctx = new IteratorRestContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_iteratorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); match(47);
			setState(468); optionalIteratorInterfaceOrObject();
			setState(469); match(56);
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

	public static class OptionalIteratorInterfaceOrObjectContext extends ParserRuleContext {
		public OptionalIteratorInterfaceContext optionalIteratorInterface() {
			return getRuleContext(OptionalIteratorInterfaceContext.class,0);
		}
		public OptionalIteratorInterfaceOrObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalIteratorInterfaceOrObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOptionalIteratorInterfaceOrObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOptionalIteratorInterfaceOrObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOptionalIteratorInterfaceOrObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalIteratorInterfaceOrObjectContext optionalIteratorInterfaceOrObject() throws RecognitionException {
		OptionalIteratorInterfaceOrObjectContext _localctx = new OptionalIteratorInterfaceOrObjectContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_optionalIteratorInterfaceOrObject);
		try {
			setState(473);
			switch (_input.LA(1)) {
			case 22:
			case 56:
				enterOuterAlt(_localctx, 1);
				{
				setState(471); optionalIteratorInterface();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 2);
				{
				setState(472); match(21);
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

	public static class OptionalIteratorInterfaceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public OptionalIteratorInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalIteratorInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOptionalIteratorInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOptionalIteratorInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOptionalIteratorInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalIteratorInterfaceContext optionalIteratorInterface() throws RecognitionException {
		OptionalIteratorInterfaceContext _localctx = new OptionalIteratorInterfaceContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_optionalIteratorInterface);
		try {
			setState(478);
			switch (_input.LA(1)) {
			case 22:
				enterOuterAlt(_localctx, 1);
				{
				setState(475); match(22);
				setState(476); match(IDENTIFIER_WEBIDL);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OperationRestContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public OptionalIdentifierContext optionalIdentifier() {
			return getRuleContext(OptionalIdentifierContext.class,0);
		}
		public OperationRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOperationRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOperationRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOperationRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationRestContext operationRest() throws RecognitionException {
		OperationRestContext _localctx = new OperationRestContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_operationRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); optionalIdentifier();
			setState(481); match(34);
			setState(482); argumentList();
			setState(483); match(18);
			setState(484); match(56);
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

	public static class OptionalIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public OptionalIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOptionalIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOptionalIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOptionalIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalIdentifierContext optionalIdentifier() throws RecognitionException {
		OptionalIdentifierContext _localctx = new OptionalIdentifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_optionalIdentifier);
		try {
			setState(488);
			switch (_input.LA(1)) {
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(486); match(IDENTIFIER_WEBIDL);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_argumentList);
		try {
			setState(494);
			switch (_input.LA(1)) {
			case 4:
			case 9:
			case 11:
			case 14:
			case 15:
			case 16:
			case 20:
			case 21:
			case 27:
			case 29:
			case 34:
			case 37:
			case 44:
			case 48:
			case 49:
			case 50:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(490); argument();
				setState(491); arguments();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arguments);
		try {
			setState(501);
			switch (_input.LA(1)) {
			case 31:
				enterOuterAlt(_localctx, 1);
				{
				setState(496); match(31);
				setState(497); argument();
				setState(498); arguments();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgumentContext extends ParserRuleContext {
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public OptionalOrRequiredArgumentContext optionalOrRequiredArgument() {
			return getRuleContext(OptionalOrRequiredArgumentContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503); extendedAttributeList();
			setState(504); optionalOrRequiredArgument();
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

	public static class OptionalOrRequiredArgumentContext extends ParserRuleContext {
		public Default_Context default_() {
			return getRuleContext(Default_Context.class,0);
		}
		public ArgumentNameContext argumentName() {
			return getRuleContext(ArgumentNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EllipsisContext ellipsis() {
			return getRuleContext(EllipsisContext.class,0);
		}
		public OptionalOrRequiredArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalOrRequiredArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOptionalOrRequiredArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOptionalOrRequiredArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOptionalOrRequiredArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalOrRequiredArgumentContext optionalOrRequiredArgument() throws RecognitionException {
		OptionalOrRequiredArgumentContext _localctx = new OptionalOrRequiredArgumentContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_optionalOrRequiredArgument);
		try {
			setState(515);
			switch (_input.LA(1)) {
			case 9:
				enterOuterAlt(_localctx, 1);
				{
				setState(506); match(9);
				setState(507); type();
				setState(508); argumentName();
				setState(509); default_();
				}
				break;
			case 11:
			case 14:
			case 15:
			case 16:
			case 20:
			case 21:
			case 27:
			case 29:
			case 34:
			case 37:
			case 44:
			case 48:
			case 49:
			case 50:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(511); type();
				setState(512); ellipsis();
				setState(513); argumentName();
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

	public static class ArgumentNameContext extends ParserRuleContext {
		public ArgumentNameKeywordContext argumentNameKeyword() {
			return getRuleContext(ArgumentNameKeywordContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ArgumentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArgumentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArgumentName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitArgumentName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentNameContext argumentName() throws RecognitionException {
		ArgumentNameContext _localctx = new ArgumentNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_argumentName);
		try {
			setState(519);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 3:
			case 7:
			case 10:
			case 12:
			case 17:
			case 23:
			case 25:
			case 26:
			case 30:
			case 39:
			case 43:
			case 44:
			case 46:
			case 53:
			case 55:
			case 58:
			case 59:
			case 60:
				enterOuterAlt(_localctx, 1);
				{
				setState(517); argumentNameKeyword();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(518); match(IDENTIFIER_WEBIDL);
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

	public static class EllipsisContext extends ParserRuleContext {
		public EllipsisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ellipsis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEllipsis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEllipsis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitEllipsis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EllipsisContext ellipsis() throws RecognitionException {
		EllipsisContext _localctx = new EllipsisContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_ellipsis);
		try {
			setState(523);
			switch (_input.LA(1)) {
			case 40:
				enterOuterAlt(_localctx, 1);
				{
				setState(521); match(40);
				}
				break;
			case 1:
			case 2:
			case 3:
			case 7:
			case 10:
			case 12:
			case 17:
			case 23:
			case 25:
			case 26:
			case 30:
			case 39:
			case 43:
			case 44:
			case 46:
			case 53:
			case 55:
			case 58:
			case 59:
			case 60:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExceptionMemberContext extends ParserRuleContext {
		public ExceptionFieldContext exceptionField() {
			return getRuleContext(ExceptionFieldContext.class,0);
		}
		public Const_Context const_() {
			return getRuleContext(Const_Context.class,0);
		}
		public ExceptionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExceptionMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExceptionMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExceptionMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionMemberContext exceptionMember() throws RecognitionException {
		ExceptionMemberContext _localctx = new ExceptionMemberContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_exceptionMember);
		try {
			setState(527);
			switch (_input.LA(1)) {
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				setState(525); const_();
				}
				break;
			case 11:
			case 14:
			case 15:
			case 16:
			case 20:
			case 21:
			case 27:
			case 29:
			case 34:
			case 37:
			case 44:
			case 48:
			case 49:
			case 50:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(526); exceptionField();
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

	public static class ExceptionFieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExceptionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExceptionField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExceptionField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExceptionField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionFieldContext exceptionField() throws RecognitionException {
		ExceptionFieldContext _localctx = new ExceptionFieldContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_exceptionField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); type();
			setState(530); match(IDENTIFIER_WEBIDL);
			setState(531); match(56);
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

	public static class ExtendedAttributeListContext extends ParserRuleContext {
		public ExtendedAttributeContext extendedAttribute() {
			return getRuleContext(ExtendedAttributeContext.class,0);
		}
		public ExtendedAttributesContext extendedAttributes() {
			return getRuleContext(ExtendedAttributesContext.class,0);
		}
		public ExtendedAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeListContext extendedAttributeList() throws RecognitionException {
		ExtendedAttributeListContext _localctx = new ExtendedAttributeListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_extendedAttributeList);
		try {
			setState(539);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(533); match(4);
				setState(534); extendedAttribute();
				setState(535); extendedAttributes();
				setState(536); match(28);
				}
				break;
			case 1:
			case 2:
			case 3:
			case 7:
			case 9:
			case 10:
			case 11:
			case 12:
			case 14:
			case 15:
			case 16:
			case 17:
			case 20:
			case 21:
			case 23:
			case 25:
			case 26:
			case 27:
			case 29:
			case 30:
			case 34:
			case 37:
			case 38:
			case 39:
			case 42:
			case 43:
			case 44:
			case 46:
			case 48:
			case 49:
			case 50:
			case 53:
			case 54:
			case 55:
			case 58:
			case 60:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExtendedAttributesContext extends ParserRuleContext {
		public ExtendedAttributeContext extendedAttribute() {
			return getRuleContext(ExtendedAttributeContext.class,0);
		}
		public ExtendedAttributesContext extendedAttributes() {
			return getRuleContext(ExtendedAttributesContext.class,0);
		}
		public ExtendedAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributesContext extendedAttributes() throws RecognitionException {
		ExtendedAttributesContext _localctx = new ExtendedAttributesContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_extendedAttributes);
		try {
			setState(546);
			switch (_input.LA(1)) {
			case 31:
				enterOuterAlt(_localctx, 1);
				{
				setState(541); match(31);
				setState(542); extendedAttribute();
				setState(543); extendedAttributes();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExtendedAttributeContext extends ParserRuleContext {
		public ExtendedAttributeRestContext extendedAttributeRest() {
			return getRuleContext(ExtendedAttributeRestContext.class,0);
		}
		public ExtendedAttributeInnerContext extendedAttributeInner() {
			return getRuleContext(ExtendedAttributeInnerContext.class,0);
		}
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public ExtendedAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeContext extendedAttribute() throws RecognitionException {
		ExtendedAttributeContext _localctx = new ExtendedAttributeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_extendedAttribute);
		try {
			setState(566);
			switch (_input.LA(1)) {
			case 34:
				enterOuterAlt(_localctx, 1);
				{
				setState(548); match(34);
				setState(549); extendedAttributeInner();
				setState(550); match(18);
				setState(551); extendedAttributeRest();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				setState(553); match(4);
				setState(554); extendedAttributeInner();
				setState(555); match(28);
				setState(556); extendedAttributeRest();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 3);
				{
				setState(558); match(41);
				setState(559); extendedAttributeInner();
				setState(560); match(13);
				setState(561); extendedAttributeRest();
				}
				break;
			case 1:
			case 2:
			case 3:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 14:
			case 15:
			case 16:
			case 17:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 29:
			case 30:
			case 32:
			case 33:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 43:
			case 44:
			case 45:
			case 46:
			case 48:
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
			case 60:
			case 61:
			case 62:
			case INTEGER_WEBIDL:
			case FLOAT_WEBIDL:
			case IDENTIFIER_WEBIDL:
			case STRING_WEBIDL:
			case OTHER_WEBIDL:
				enterOuterAlt(_localctx, 4);
				{
				setState(563); other();
				setState(564); extendedAttributeRest();
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

	public static class ExtendedAttributeRestContext extends ParserRuleContext {
		public ExtendedAttributeContext extendedAttribute() {
			return getRuleContext(ExtendedAttributeContext.class,0);
		}
		public ExtendedAttributeRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeRestContext extendedAttributeRest() throws RecognitionException {
		ExtendedAttributeRestContext _localctx = new ExtendedAttributeRestContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_extendedAttributeRest);
		try {
			setState(570);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 14:
			case 15:
			case 16:
			case 17:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 29:
			case 30:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 43:
			case 44:
			case 45:
			case 46:
			case 48:
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
			case 60:
			case 61:
			case 62:
			case INTEGER_WEBIDL:
			case FLOAT_WEBIDL:
			case IDENTIFIER_WEBIDL:
			case STRING_WEBIDL:
			case OTHER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(568); extendedAttribute();
				}
				break;
			case 28:
			case 31:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExtendedAttributeInnerContext extends ParserRuleContext {
		public List<ExtendedAttributeInnerContext> extendedAttributeInner() {
			return getRuleContexts(ExtendedAttributeInnerContext.class);
		}
		public ExtendedAttributeInnerContext extendedAttributeInner(int i) {
			return getRuleContext(ExtendedAttributeInnerContext.class,i);
		}
		public OtherOrCommaContext otherOrComma() {
			return getRuleContext(OtherOrCommaContext.class,0);
		}
		public ExtendedAttributeInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeInnerContext extendedAttributeInner() throws RecognitionException {
		ExtendedAttributeInnerContext _localctx = new ExtendedAttributeInnerContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_extendedAttributeInner);
		try {
			setState(591);
			switch (_input.LA(1)) {
			case 34:
				enterOuterAlt(_localctx, 1);
				{
				setState(572); match(34);
				setState(573); extendedAttributeInner();
				setState(574); match(18);
				setState(575); extendedAttributeInner();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				setState(577); match(4);
				setState(578); extendedAttributeInner();
				setState(579); match(28);
				setState(580); extendedAttributeInner();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 3);
				{
				setState(582); match(41);
				setState(583); extendedAttributeInner();
				setState(584); match(13);
				setState(585); extendedAttributeInner();
				}
				break;
			case 1:
			case 2:
			case 3:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 14:
			case 15:
			case 16:
			case 17:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 43:
			case 44:
			case 45:
			case 46:
			case 48:
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
			case 60:
			case 61:
			case 62:
			case INTEGER_WEBIDL:
			case FLOAT_WEBIDL:
			case IDENTIFIER_WEBIDL:
			case STRING_WEBIDL:
			case OTHER_WEBIDL:
				enterOuterAlt(_localctx, 4);
				{
				setState(587); otherOrComma();
				setState(588); extendedAttributeInner();
				}
				break;
			case 13:
			case 18:
			case 28:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class OtherContext extends ParserRuleContext {
		public ArgumentNameKeywordContext argumentNameKeyword() {
			return getRuleContext(ArgumentNameKeywordContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public TerminalNode FLOAT_WEBIDL() { return getToken(WebIDLParser.FLOAT_WEBIDL, 0); }
		public TerminalNode INTEGER_WEBIDL() { return getToken(WebIDLParser.INTEGER_WEBIDL, 0); }
		public TerminalNode STRING_WEBIDL() { return getToken(WebIDLParser.STRING_WEBIDL, 0); }
		public TerminalNode OTHER_WEBIDL() { return getToken(WebIDLParser.OTHER_WEBIDL, 0); }
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_other);
		try {
			setState(631);
			switch (_input.LA(1)) {
			case INTEGER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(593); match(INTEGER_WEBIDL);
				}
				break;
			case FLOAT_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(594); match(FLOAT_WEBIDL);
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 3);
				{
				setState(595); match(IDENTIFIER_WEBIDL);
				}
				break;
			case STRING_WEBIDL:
				enterOuterAlt(_localctx, 4);
				{
				setState(596); match(STRING_WEBIDL);
				}
				break;
			case OTHER_WEBIDL:
				enterOuterAlt(_localctx, 5);
				{
				setState(597); match(OTHER_WEBIDL);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 6);
				{
				setState(598); match(32);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 7);
				{
				setState(599); match(51);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 8);
				{
				setState(600); match(40);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 9);
				{
				setState(601); match(33);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 10);
				{
				setState(602); match(56);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 11);
				{
				setState(603); match(6);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 12);
				{
				setState(604); match(22);
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 13);
				{
				setState(605); match(57);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 14);
				{
				setState(606); match(36);
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 15);
				{
				setState(607); match(62);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 16);
				{
				setState(608); match(54);
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 17);
				{
				setState(609); match(61);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 18);
				{
				setState(610); match(52);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(611); match(19);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 20);
				{
				setState(612); match(37);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 21);
				{
				setState(613); match(16);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 22);
				{
				setState(614); match(14);
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 23);
				{
				setState(615); match(49);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 24);
				{
				setState(616); match(11);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 25);
				{
				setState(617); match(8);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 26);
				{
				setState(618); match(15);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(619); match(27);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 28);
				{
				setState(620); match(24);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 29);
				{
				setState(621); match(21);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 30);
				{
				setState(622); match(50);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 31);
				{
				setState(623); match(5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 32);
				{
				setState(624); match(9);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 33);
				{
				setState(625); match(48);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 34);
				{
				setState(626); match(29);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 35);
				{
				setState(627); match(45);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 36);
				{
				setState(628); match(20);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 37);
				{
				setState(629); match(38);
				}
				break;
			case 1:
			case 2:
			case 3:
			case 7:
			case 10:
			case 12:
			case 17:
			case 23:
			case 25:
			case 26:
			case 30:
			case 39:
			case 43:
			case 44:
			case 46:
			case 53:
			case 55:
			case 58:
			case 59:
			case 60:
				enterOuterAlt(_localctx, 38);
				{
				setState(630); argumentNameKeyword();
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

	public static class ArgumentNameKeywordContext extends ParserRuleContext {
		public ArgumentNameKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentNameKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArgumentNameKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArgumentNameKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitArgumentNameKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentNameKeywordContext argumentNameKeyword() throws RecognitionException {
		ArgumentNameKeywordContext _localctx = new ArgumentNameKeywordContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_argumentNameKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 17) | (1L << 23) | (1L << 25) | (1L << 26) | (1L << 30) | (1L << 39) | (1L << 43) | (1L << 44) | (1L << 46) | (1L << 53) | (1L << 55) | (1L << 58) | (1L << 59) | (1L << 60))) != 0)) ) {
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

	public static class OtherOrCommaContext extends ParserRuleContext {
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public OtherOrCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherOrComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOtherOrComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOtherOrComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOtherOrComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherOrCommaContext otherOrComma() throws RecognitionException {
		OtherOrCommaContext _localctx = new OtherOrCommaContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_otherOrComma);
		try {
			setState(637);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 3:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 14:
			case 15:
			case 16:
			case 17:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 29:
			case 30:
			case 32:
			case 33:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 43:
			case 44:
			case 45:
			case 46:
			case 48:
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
			case 60:
			case 61:
			case 62:
			case INTEGER_WEBIDL:
			case FLOAT_WEBIDL:
			case IDENTIFIER_WEBIDL:
			case STRING_WEBIDL:
			case OTHER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(635); other();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 2);
				{
				setState(636); match(31);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_type);
		try {
			setState(643);
			switch (_input.LA(1)) {
			case 11:
			case 14:
			case 15:
			case 16:
			case 20:
			case 21:
			case 27:
			case 29:
			case 37:
			case 44:
			case 48:
			case 49:
			case 50:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(639); singleType();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 2);
				{
				setState(640); unionType();
				setState(641); typeSuffix();
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

	public static class SingleTypeContext extends ParserRuleContext {
		public TypeSuffixStartingWithArrayContext typeSuffixStartingWithArray() {
			return getRuleContext(TypeSuffixStartingWithArrayContext.class,0);
		}
		public NonAnyTypeContext nonAnyType() {
			return getRuleContext(NonAnyTypeContext.class,0);
		}
		public SingleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSingleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSingleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSingleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeContext singleType() throws RecognitionException {
		SingleTypeContext _localctx = new SingleTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_singleType);
		try {
			setState(648);
			switch (_input.LA(1)) {
			case 11:
			case 14:
			case 15:
			case 20:
			case 21:
			case 27:
			case 29:
			case 37:
			case 44:
			case 48:
			case 49:
			case 50:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(645); nonAnyType();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 2);
				{
				setState(646); match(16);
				setState(647); typeSuffixStartingWithArray();
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

	public static class UnionTypeContext extends ParserRuleContext {
		public UnionMemberTypesContext unionMemberTypes() {
			return getRuleContext(UnionMemberTypesContext.class,0);
		}
		public UnionMemberTypeContext unionMemberType(int i) {
			return getRuleContext(UnionMemberTypeContext.class,i);
		}
		public List<UnionMemberTypeContext> unionMemberType() {
			return getRuleContexts(UnionMemberTypeContext.class);
		}
		public UnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_unionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650); match(34);
			setState(651); unionMemberType();
			setState(652); match(5);
			setState(653); unionMemberType();
			setState(654); unionMemberTypes();
			setState(655); match(18);
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

	public static class UnionMemberTypeContext extends ParserRuleContext {
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public NonAnyTypeContext nonAnyType() {
			return getRuleContext(NonAnyTypeContext.class,0);
		}
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public UnionMemberTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMemberType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnionMemberType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnionMemberType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitUnionMemberType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionMemberTypeContext unionMemberType() throws RecognitionException {
		UnionMemberTypeContext _localctx = new UnionMemberTypeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_unionMemberType);
		try {
			setState(665);
			switch (_input.LA(1)) {
			case 11:
			case 14:
			case 15:
			case 20:
			case 21:
			case 27:
			case 29:
			case 37:
			case 44:
			case 48:
			case 49:
			case 50:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(657); nonAnyType();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 2);
				{
				setState(658); unionType();
				setState(659); typeSuffix();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 3);
				{
				setState(661); match(16);
				setState(662); match(4);
				setState(663); match(28);
				setState(664); typeSuffix();
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

	public static class UnionMemberTypesContext extends ParserRuleContext {
		public UnionMemberTypesContext unionMemberTypes() {
			return getRuleContext(UnionMemberTypesContext.class,0);
		}
		public UnionMemberTypeContext unionMemberType() {
			return getRuleContext(UnionMemberTypeContext.class,0);
		}
		public UnionMemberTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMemberTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnionMemberTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnionMemberTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitUnionMemberTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionMemberTypesContext unionMemberTypes() throws RecognitionException {
		UnionMemberTypesContext _localctx = new UnionMemberTypesContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_unionMemberTypes);
		try {
			setState(672);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(667); match(5);
				setState(668); unionMemberType();
				setState(669); unionMemberTypes();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class NonAnyTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public Null_Context null_() {
			return getRuleContext(Null_Context.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public NonAnyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonAnyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterNonAnyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitNonAnyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitNonAnyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonAnyTypeContext nonAnyType() throws RecognitionException {
		NonAnyTypeContext _localctx = new NonAnyTypeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_nonAnyType);
		try {
			setState(695);
			switch (_input.LA(1)) {
			case 11:
			case 14:
			case 15:
			case 20:
			case 27:
			case 29:
			case 44:
			case 49:
			case 50:
				enterOuterAlt(_localctx, 1);
				{
				setState(674); primitiveType();
				setState(675); typeSuffix();
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 2);
				{
				setState(677); match(62);
				setState(678); typeSuffix();
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 3);
				{
				setState(679); match(61);
				setState(680); typeSuffix();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 4);
				{
				setState(681); match(IDENTIFIER_WEBIDL);
				setState(682); typeSuffix();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 5);
				{
				setState(683); match(48);
				setState(684); match(6);
				setState(685); type();
				setState(686); match(57);
				setState(687); null_();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 6);
				{
				setState(689); match(21);
				setState(690); typeSuffix();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 7);
				{
				setState(691); match(54);
				setState(692); typeSuffix();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 8);
				{
				setState(693); match(37);
				setState(694); typeSuffix();
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

	public static class ConstTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public Null_Context null_() {
			return getRuleContext(Null_Context.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ConstTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterConstType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitConstType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitConstType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstTypeContext constType() throws RecognitionException {
		ConstTypeContext _localctx = new ConstTypeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_constType);
		try {
			setState(702);
			switch (_input.LA(1)) {
			case 11:
			case 14:
			case 15:
			case 20:
			case 27:
			case 29:
			case 44:
			case 49:
			case 50:
				enterOuterAlt(_localctx, 1);
				{
				setState(697); primitiveType();
				setState(698); null_();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(700); match(IDENTIFIER_WEBIDL);
				setState(701); null_();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public UnrestrictedFloatTypeContext unrestrictedFloatType() {
			return getRuleContext(UnrestrictedFloatTypeContext.class,0);
		}
		public UnsignedIntegerTypeContext unsignedIntegerType() {
			return getRuleContext(UnsignedIntegerTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_primitiveType);
		try {
			setState(709);
			switch (_input.LA(1)) {
			case 20:
			case 27:
			case 29:
				enterOuterAlt(_localctx, 1);
				{
				setState(704); unsignedIntegerType();
				}
				break;
			case 11:
			case 15:
			case 44:
				enterOuterAlt(_localctx, 2);
				{
				setState(705); unrestrictedFloatType();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 3);
				{
				setState(706); match(14);
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 4);
				{
				setState(707); match(49);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 5);
				{
				setState(708); match(50);
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

	public static class UnrestrictedFloatTypeContext extends ParserRuleContext {
		public FloatTypeContext floatType() {
			return getRuleContext(FloatTypeContext.class,0);
		}
		public UnrestrictedFloatTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unrestrictedFloatType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnrestrictedFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnrestrictedFloatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitUnrestrictedFloatType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnrestrictedFloatTypeContext unrestrictedFloatType() throws RecognitionException {
		UnrestrictedFloatTypeContext _localctx = new UnrestrictedFloatTypeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_unrestrictedFloatType);
		try {
			setState(714);
			switch (_input.LA(1)) {
			case 44:
				enterOuterAlt(_localctx, 1);
				{
				setState(711); match(44);
				setState(712); floatType();
				}
				break;
			case 11:
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(713); floatType();
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

	public static class FloatTypeContext extends ParserRuleContext {
		public FloatTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitFloatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatTypeContext floatType() throws RecognitionException {
		FloatTypeContext _localctx = new FloatTypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_floatType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_la = _input.LA(1);
			if ( !(_la==11 || _la==15) ) {
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

	public static class UnsignedIntegerTypeContext extends ParserRuleContext {
		public IntegerTypeContext integerType() {
			return getRuleContext(IntegerTypeContext.class,0);
		}
		public UnsignedIntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedIntegerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnsignedIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnsignedIntegerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitUnsignedIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedIntegerTypeContext unsignedIntegerType() throws RecognitionException {
		UnsignedIntegerTypeContext _localctx = new UnsignedIntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_unsignedIntegerType);
		try {
			setState(721);
			switch (_input.LA(1)) {
			case 20:
				enterOuterAlt(_localctx, 1);
				{
				setState(718); match(20);
				setState(719); integerType();
				}
				break;
			case 27:
			case 29:
				enterOuterAlt(_localctx, 2);
				{
				setState(720); integerType();
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

	public static class IntegerTypeContext extends ParserRuleContext {
		public OptionalLongContext optionalLong() {
			return getRuleContext(OptionalLongContext.class,0);
		}
		public IntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitIntegerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerTypeContext integerType() throws RecognitionException {
		IntegerTypeContext _localctx = new IntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_integerType);
		try {
			setState(726);
			switch (_input.LA(1)) {
			case 29:
				enterOuterAlt(_localctx, 1);
				{
				setState(723); match(29);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 2);
				{
				setState(724); match(27);
				setState(725); optionalLong();
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

	public static class OptionalLongContext extends ParserRuleContext {
		public OptionalLongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalLong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOptionalLong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOptionalLong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOptionalLong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalLongContext optionalLong() throws RecognitionException {
		OptionalLongContext _localctx = new OptionalLongContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_optionalLong);
		try {
			setState(730);
			switch (_input.LA(1)) {
			case 27:
				enterOuterAlt(_localctx, 1);
				{
				setState(728); match(27);
				}
				break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 7:
			case 10:
			case 12:
			case 17:
			case 18:
			case 23:
			case 25:
			case 26:
			case 30:
			case 31:
			case 34:
			case 36:
			case 39:
			case 40:
			case 43:
			case 44:
			case 46:
			case 47:
			case 53:
			case 55:
			case 57:
			case 58:
			case 59:
			case 60:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TypeSuffixContext extends ParserRuleContext {
		public TypeSuffixStartingWithArrayContext typeSuffixStartingWithArray() {
			return getRuleContext(TypeSuffixStartingWithArrayContext.class,0);
		}
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public TypeSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterTypeSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitTypeSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitTypeSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSuffixContext typeSuffix() throws RecognitionException {
		TypeSuffixContext _localctx = new TypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_typeSuffix);
		try {
			setState(738);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(732); match(4);
				setState(733); match(28);
				setState(734); typeSuffix();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 2);
				{
				setState(735); match(36);
				setState(736); typeSuffixStartingWithArray();
				}
				break;
			case 1:
			case 2:
			case 3:
			case 5:
			case 7:
			case 10:
			case 12:
			case 17:
			case 18:
			case 23:
			case 25:
			case 26:
			case 30:
			case 31:
			case 34:
			case 39:
			case 40:
			case 43:
			case 44:
			case 46:
			case 47:
			case 53:
			case 55:
			case 57:
			case 58:
			case 59:
			case 60:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TypeSuffixStartingWithArrayContext extends ParserRuleContext {
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public TypeSuffixStartingWithArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSuffixStartingWithArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterTypeSuffixStartingWithArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitTypeSuffixStartingWithArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitTypeSuffixStartingWithArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSuffixStartingWithArrayContext typeSuffixStartingWithArray() throws RecognitionException {
		TypeSuffixStartingWithArrayContext _localctx = new TypeSuffixStartingWithArrayContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_typeSuffixStartingWithArray);
		try {
			setState(744);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(740); match(4);
				setState(741); match(28);
				setState(742); typeSuffix();
				}
				break;
			case 1:
			case 2:
			case 3:
			case 5:
			case 7:
			case 10:
			case 12:
			case 17:
			case 18:
			case 23:
			case 25:
			case 26:
			case 30:
			case 31:
			case 34:
			case 39:
			case 40:
			case 43:
			case 44:
			case 46:
			case 47:
			case 53:
			case 55:
			case 57:
			case 58:
			case 59:
			case 60:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Null_Context extends ParserRuleContext {
		public Null_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterNull_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitNull_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitNull_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_Context null_() throws RecognitionException {
		Null_Context _localctx = new Null_Context(_ctx, getState());
		enterRule(_localctx, 174, RULE_null_);
		try {
			setState(748);
			switch (_input.LA(1)) {
			case 36:
				enterOuterAlt(_localctx, 1);
				{
				setState(746); match(36);
				}
				break;
			case 1:
			case 2:
			case 3:
			case 5:
			case 7:
			case 10:
			case 12:
			case 17:
			case 18:
			case 23:
			case 25:
			case 26:
			case 30:
			case 31:
			case 34:
			case 39:
			case 40:
			case 43:
			case 44:
			case 46:
			case 47:
			case 53:
			case 55:
			case 57:
			case 58:
			case 59:
			case 60:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_returnType);
		try {
			setState(752);
			switch (_input.LA(1)) {
			case 11:
			case 14:
			case 15:
			case 16:
			case 20:
			case 21:
			case 27:
			case 29:
			case 34:
			case 37:
			case 44:
			case 48:
			case 49:
			case 50:
			case 54:
			case 61:
			case 62:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(750); type();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 2);
				{
				setState(751); match(38);
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

	public static class ExtendedAttributeNoArgsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ExtendedAttributeNoArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeNoArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeNoArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeNoArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeNoArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeNoArgsContext extendedAttributeNoArgs() throws RecognitionException {
		ExtendedAttributeNoArgsContext _localctx = new ExtendedAttributeNoArgsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_extendedAttributeNoArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754); match(IDENTIFIER_WEBIDL);
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

	public static class ExtendedAttributeArgListContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ExtendedAttributeArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeArgListContext extendedAttributeArgList() throws RecognitionException {
		ExtendedAttributeArgListContext _localctx = new ExtendedAttributeArgListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_extendedAttributeArgList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756); match(IDENTIFIER_WEBIDL);
			setState(757); match(34);
			setState(758); argumentList();
			setState(759); match(18);
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

	public static class ExtendedAttributeIdentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER_WEBIDL() { return getTokens(WebIDLParser.IDENTIFIER_WEBIDL); }
		public TerminalNode IDENTIFIER_WEBIDL(int i) {
			return getToken(WebIDLParser.IDENTIFIER_WEBIDL, i);
		}
		public ExtendedAttributeIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeIdentContext extendedAttributeIdent() throws RecognitionException {
		ExtendedAttributeIdentContext _localctx = new ExtendedAttributeIdentContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_extendedAttributeIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761); match(IDENTIFIER_WEBIDL);
			setState(762); match(22);
			setState(763); match(IDENTIFIER_WEBIDL);
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

	public static class ExtendedAttributeNamedArgListContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER_WEBIDL() { return getTokens(WebIDLParser.IDENTIFIER_WEBIDL); }
		public TerminalNode IDENTIFIER_WEBIDL(int i) {
			return getToken(WebIDLParser.IDENTIFIER_WEBIDL, i);
		}
		public ExtendedAttributeNamedArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeNamedArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeNamedArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeNamedArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeNamedArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeNamedArgListContext extendedAttributeNamedArgList() throws RecognitionException {
		ExtendedAttributeNamedArgListContext _localctx = new ExtendedAttributeNamedArgListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_extendedAttributeNamedArgList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765); match(IDENTIFIER_WEBIDL);
			setState(766); match(22);
			setState(767); match(IDENTIFIER_WEBIDL);
			setState(768); match(34);
			setState(769); argumentList();
			setState(770); match(18);
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

	public static class ExtendedAttributeTypePairContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public ExtendedAttributeTypePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeTypePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeTypePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeTypePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeTypePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeTypePairContext extendedAttributeTypePair() throws RecognitionException {
		ExtendedAttributeTypePairContext _localctx = new ExtendedAttributeTypePairContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_extendedAttributeTypePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772); match(34);
			setState(773); type();
			setState(774); match(31);
			setState(775); type();
			setState(776); match(18);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3G\u030d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00c7\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u00d0\n\4\3\5\3\5\3\5\5\5\u00d5\n\5\3\6\3\6\5\6\u00d9\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\t\u00e8\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u00f6\n\13\3\f\3\f\5"+
		"\f\u00fa\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0109\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\5\21\u011a\n\21\3\22\3\22\5\22\u011e\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u012d"+
		"\n\24\3\25\3\25\3\25\5\25\u0132\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0141\n\30\3\31\3\31\3\31\5\31\u0146"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\5\36\u0166\n\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\5!\u0171"+
		"\n!\3\"\3\"\3\"\3#\3#\3#\3#\5#\u017a\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$"+
		"\u0185\n$\3%\3%\3%\3%\3%\3%\5%\u018d\n%\3&\3&\3&\3&\5&\u0193\n&\3\'\3"+
		"\'\3\'\3\'\5\'\u0199\n\'\3(\3(\3(\3)\3)\3)\3)\3)\5)\u01a3\n)\3*\3*\3*"+
		"\3+\3+\3+\3+\5+\u01ac\n+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\5.\u01b9\n."+
		"\3/\3/\5/\u01bd\n/\3\60\3\60\3\60\3\60\5\60\u01c3\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u01ce\n\62\3\63\3\63\3\64\3\64\5\64"+
		"\u01d4\n\64\3\65\3\65\3\65\3\65\3\66\3\66\5\66\u01dc\n\66\3\67\3\67\3"+
		"\67\5\67\u01e1\n\67\38\38\38\38\38\38\39\39\59\u01eb\n9\3:\3:\3:\3:\5"+
		":\u01f1\n:\3;\3;\3;\3;\3;\5;\u01f8\n;\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\5=\u0206\n=\3>\3>\5>\u020a\n>\3?\3?\5?\u020e\n?\3@\3@\5@\u0212\n"+
		"@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\5B\u021e\nB\3C\3C\3C\3C\3C\5C\u0225\n"+
		"C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0239\nD\3"+
		"E\3E\5E\u023d\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\5F\u0252\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u027a"+
		"\nG\3H\3H\3I\3I\5I\u0280\nI\3J\3J\3J\3J\5J\u0286\nJ\3K\3K\3K\5K\u028b"+
		"\nK\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\5M\u029c\nM\3N\3N\3N"+
		"\3N\3N\5N\u02a3\nN\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\5O\u02ba\nO\3P\3P\3P\3P\3P\5P\u02c1\nP\3Q\3Q\3Q\3Q\3Q\5Q"+
		"\u02c8\nQ\3R\3R\3R\5R\u02cd\nR\3S\3S\3T\3T\3T\5T\u02d4\nT\3U\3U\3U\5U"+
		"\u02d9\nU\3V\3V\5V\u02dd\nV\3W\3W\3W\3W\3W\3W\5W\u02e5\nW\3X\3X\3X\3X"+
		"\5X\u02eb\nX\3Y\3Y\5Y\u02ef\nY\3Z\3Z\5Z\u02f3\nZ\3[\3[\3\\\3\\\3\\\3\\"+
		"\3\\\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\2`\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\2\7\4\2\n"+
		"\n//\6\2\25\25%%\66\66BB\7\2\4\4\f\f\23\23--\67\67\20\2\3\5\t\t\f\f\16"+
		"\16\23\23\31\31\33\34  ))-.\60\60\67\6799<>\4\2\r\r\21\21\u032d\2\u00be"+
		"\3\2\2\2\4\u00c6\3\2\2\2\6\u00cf\3\2\2\2\b\u00d4\3\2\2\2\n\u00d8\3\2\2"+
		"\2\f\u00da\3\2\2\2\16\u00e2\3\2\2\2\20\u00e7\3\2\2\2\22\u00e9\3\2\2\2"+
		"\24\u00f5\3\2\2\2\26\u00f9\3\2\2\2\30\u00fb\3\2\2\2\32\u0108\3\2\2\2\34"+
		"\u010a\3\2\2\2\36\u010f\3\2\2\2 \u0119\3\2\2\2\"\u011d\3\2\2\2$\u011f"+
		"\3\2\2\2&\u012c\3\2\2\2(\u0131\3\2\2\2*\u0133\3\2\2\2,\u013a\3\2\2\2."+
		"\u0140\3\2\2\2\60\u0145\3\2\2\2\62\u0147\3\2\2\2\64\u014f\3\2\2\2\66\u0155"+
		"\3\2\2\28\u015a\3\2\2\2:\u0165\3\2\2\2<\u0167\3\2\2\2>\u0169\3\2\2\2@"+
		"\u0170\3\2\2\2B\u0172\3\2\2\2D\u0179\3\2\2\2F\u0184\3\2\2\2H\u018c\3\2"+
		"\2\2J\u0192\3\2\2\2L\u0198\3\2\2\2N\u019a\3\2\2\2P\u01a2\3\2\2\2R\u01a4"+
		"\3\2\2\2T\u01ab\3\2\2\2V\u01ad\3\2\2\2X\u01b0\3\2\2\2Z\u01b8\3\2\2\2\\"+
		"\u01bc\3\2\2\2^\u01c2\3\2\2\2`\u01c4\3\2\2\2b\u01cd\3\2\2\2d\u01cf\3\2"+
		"\2\2f\u01d3\3\2\2\2h\u01d5\3\2\2\2j\u01db\3\2\2\2l\u01e0\3\2\2\2n\u01e2"+
		"\3\2\2\2p\u01ea\3\2\2\2r\u01f0\3\2\2\2t\u01f7\3\2\2\2v\u01f9\3\2\2\2x"+
		"\u0205\3\2\2\2z\u0209\3\2\2\2|\u020d\3\2\2\2~\u0211\3\2\2\2\u0080\u0213"+
		"\3\2\2\2\u0082\u021d\3\2\2\2\u0084\u0224\3\2\2\2\u0086\u0238\3\2\2\2\u0088"+
		"\u023c\3\2\2\2\u008a\u0251\3\2\2\2\u008c\u0279\3\2\2\2\u008e\u027b\3\2"+
		"\2\2\u0090\u027f\3\2\2\2\u0092\u0285\3\2\2\2\u0094\u028a\3\2\2\2\u0096"+
		"\u028c\3\2\2\2\u0098\u029b\3\2\2\2\u009a\u02a2\3\2\2\2\u009c\u02b9\3\2"+
		"\2\2\u009e\u02c0\3\2\2\2\u00a0\u02c7\3\2\2\2\u00a2\u02cc\3\2\2\2\u00a4"+
		"\u02ce\3\2\2\2\u00a6\u02d3\3\2\2\2\u00a8\u02d8\3\2\2\2\u00aa\u02dc\3\2"+
		"\2\2\u00ac\u02e4\3\2\2\2\u00ae\u02ea\3\2\2\2\u00b0\u02ee\3\2\2\2\u00b2"+
		"\u02f2\3\2\2\2\u00b4\u02f4\3\2\2\2\u00b6\u02f6\3\2\2\2\u00b8\u02fb\3\2"+
		"\2\2\u00ba\u02ff\3\2\2\2\u00bc\u0306\3\2\2\2\u00be\u00bf\5\4\3\2\u00bf"+
		"\u00c0\7\2\2\3\u00c0\3\3\2\2\2\u00c1\u00c2\5\u0082B\2\u00c2\u00c3\5\6"+
		"\4\2\u00c3\u00c4\5\4\3\2\u00c4\u00c7\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c1\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\5\3\2\2\2\u00c8\u00d0\5\b\5\2"+
		"\u00c9\u00d0\5\16\b\2\u00ca\u00d0\5\30\r\2\u00cb\u00d0\5$\23\2\u00cc\u00d0"+
		"\5*\26\2\u00cd\u00d0\5\64\33\2\u00ce\u00d0\5\66\34\2\u00cf\u00c8\3\2\2"+
		"\2\u00cf\u00c9\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cc"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\7\3\2\2\2\u00d1"+
		"\u00d2\7 \2\2\u00d2\u00d5\5\n\6\2\u00d3\u00d5\5\f\7\2\u00d4\u00d1\3\2"+
		"\2\2\u00d4\u00d3\3\2\2\2\u00d5\t\3\2\2\2\u00d6\u00d9\5\62\32\2\u00d7\u00d9"+
		"\5\f\7\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\13\3\2\2\2\u00da"+
		"\u00db\7\3\2\2\u00db\u00dc\7C\2\2\u00dc\u00dd\5(\25\2\u00dd\u00de\7+\2"+
		"\2\u00de\u00df\5\24\13\2\u00df\u00e0\7\17\2\2\u00e0\u00e1\7:\2\2\u00e1"+
		"\r\3\2\2\2\u00e2\u00e3\7\16\2\2\u00e3\u00e4\5\20\t\2\u00e4\17\3\2\2\2"+
		"\u00e5\u00e8\5\22\n\2\u00e6\u00e8\5\36\20\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\21\3\2\2\2\u00e9\u00ea\7\3\2\2\u00ea\u00eb\7C\2\2"+
		"\u00eb\u00ec\7+\2\2\u00ec\u00ed\5\24\13\2\u00ed\u00ee\7\17\2\2\u00ee\u00ef"+
		"\7:\2\2\u00ef\23\3\2\2\2\u00f0\u00f1\5\u0082B\2\u00f1\u00f2\5\26\f\2\u00f2"+
		"\u00f3\5\24\13\2\u00f3\u00f6\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f0\3"+
		"\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\25\3\2\2\2\u00f7\u00fa\58\35\2\u00f8"+
		"\u00fa\5@!\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\27\3\2\2\2"+
		"\u00fb\u00fc\7<\2\2\u00fc\u00fd\7C\2\2\u00fd\u00fe\5(\25\2\u00fe\u00ff"+
		"\7+\2\2\u00ff\u0100\5\32\16\2\u0100\u0101\7\17\2\2\u0101\u0102\7:\2\2"+
		"\u0102\31\3\2\2\2\u0103\u0104\5\u0082B\2\u0104\u0105\5\34\17\2\u0105\u0106"+
		"\5\32\16\2\u0106\u0109\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0103\3\2\2\2"+
		"\u0108\u0107\3\2\2\2\u0109\33\3\2\2\2\u010a\u010b\5\u0092J\2\u010b\u010c"+
		"\7C\2\2\u010c\u010d\5 \21\2\u010d\u010e\7:\2\2\u010e\35\3\2\2\2\u010f"+
		"\u0110\7<\2\2\u0110\u0111\7C\2\2\u0111\u0112\7+\2\2\u0112\u0113\5\32\16"+
		"\2\u0113\u0114\7\17\2\2\u0114\u0115\7:\2\2\u0115\37\3\2\2\2\u0116\u0117"+
		"\7\30\2\2\u0117\u011a\5\"\22\2\u0118\u011a\3\2\2\2\u0119\u0116\3\2\2\2"+
		"\u0119\u0118\3\2\2\2\u011a!\3\2\2\2\u011b\u011e\5:\36\2\u011c\u011e\7"+
		"D\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e#\3\2\2\2\u011f\u0120"+
		"\7\33\2\2\u0120\u0121\7C\2\2\u0121\u0122\5(\25\2\u0122\u0123\7+\2\2\u0123"+
		"\u0124\5&\24\2\u0124\u0125\7\17\2\2\u0125\u0126\7:\2\2\u0126%\3\2\2\2"+
		"\u0127\u0128\5\u0082B\2\u0128\u0129\5~@\2\u0129\u012a\5&\24\2\u012a\u012d"+
		"\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u0127\3\2\2\2\u012c\u012b\3\2\2\2\u012d"+
		"\'\3\2\2\2\u012e\u012f\7#\2\2\u012f\u0132\7C\2\2\u0130\u0132\3\2\2\2\u0131"+
		"\u012e\3\2\2\2\u0131\u0130\3\2\2\2\u0132)\3\2\2\2\u0133\u0134\7\34\2\2"+
		"\u0134\u0135\7C\2\2\u0135\u0136\7+\2\2\u0136\u0137\5,\27\2\u0137\u0138"+
		"\7\17\2\2\u0138\u0139\7:\2\2\u0139+\3\2\2\2\u013a\u013b\7D\2\2\u013b\u013c"+
		"\5.\30\2\u013c-\3\2\2\2\u013d\u013e\7!\2\2\u013e\u0141\5\60\31\2\u013f"+
		"\u0141\3\2\2\2\u0140\u013d\3\2\2\2\u0140\u013f\3\2\2\2\u0141/\3\2\2\2"+
		"\u0142\u0143\7D\2\2\u0143\u0146\5.\30\2\u0144\u0146\3\2\2\2\u0145\u0142"+
		"\3\2\2\2\u0145\u0144\3\2\2\2\u0146\61\3\2\2\2\u0147\u0148\7C\2\2\u0148"+
		"\u0149\7\30\2\2\u0149\u014a\5\u00b2Z\2\u014a\u014b\7$\2\2\u014b\u014c"+
		"\5r:\2\u014c\u014d\7\24\2\2\u014d\u014e\7:\2\2\u014e\63\3\2\2\2\u014f"+
		"\u0150\79\2\2\u0150\u0151\5\u0082B\2\u0151\u0152\5\u0092J\2\u0152\u0153"+
		"\7C\2\2\u0153\u0154\7:\2\2\u0154\65\3\2\2\2\u0155\u0156\7C\2\2\u0156\u0157"+
		"\7=\2\2\u0157\u0158\7C\2\2\u0158\u0159\7:\2\2\u0159\67\3\2\2\2\u015a\u015b"+
		"\7\31\2\2\u015b\u015c\5\u009eP\2\u015c\u015d\7C\2\2\u015d\u015e\7\30\2"+
		"\2\u015e\u015f\5:\36\2\u015f\u0160\7:\2\2\u01609\3\2\2\2\u0161\u0166\5"+
		"<\37\2\u0162\u0166\5> \2\u0163\u0166\7A\2\2\u0164\u0166\7\32\2\2\u0165"+
		"\u0161\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2"+
		"\2\2\u0166;\3\2\2\2\u0167\u0168\t\2\2\2\u0168=\3\2\2\2\u0169\u016a\t\3"+
		"\2\2\u016a?\3\2\2\2\u016b\u0171\5B\"\2\u016c\u0171\5N(\2\u016d\u0171\5"+
		"R*\2\u016e\u0171\5V,\2\u016f\u0171\5^\60\2\u0170\u016b\3\2\2\2\u0170\u016c"+
		"\3\2\2\2\u0170\u016d\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171"+
		"A\3\2\2\2\u0172\u0173\7\t\2\2\u0173\u0174\5D#\2\u0174C\3\2\2\2\u0175\u017a"+
		"\5n8\2\u0176\u0177\7\30\2\2\u0177\u017a\5F$\2\u0178\u017a\3\2\2\2\u0179"+
		"\u0175\3\2\2\2\u0179\u0176\3\2\2\2\u0179\u0178\3\2\2\2\u017aE\3\2\2\2"+
		"\u017b\u017c\7+\2\2\u017c\u017d\5H%\2\u017d\u017e\7\17\2\2\u017e\u0185"+
		"\3\2\2\2\u017f\u0180\7\6\2\2\u0180\u0181\5J&\2\u0181\u0182\7\36\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0185\7C\2\2\u0184\u017b\3\2\2\2\u0184\u017f\3\2"+
		"\2\2\u0184\u0183\3\2\2\2\u0185G\3\2\2\2\u0186\u018d\7-\2\2\u0187\u0188"+
		"\7>\2\2\u0188\u018d\5L\'\2\u0189\u018a\7C\2\2\u018a\u018d\5L\'\2\u018b"+
		"\u018d\3\2\2\2\u018c\u0186\3\2\2\2\u018c\u0187\3\2\2\2\u018c\u0189\3\2"+
		"\2\2\u018c\u018b\3\2\2\2\u018dI\3\2\2\2\u018e\u0193\7-\2\2\u018f\u0190"+
		"\7C\2\2\u0190\u0193\5L\'\2\u0191\u0193\3\2\2\2\u0192\u018e\3\2\2\2\u0192"+
		"\u018f\3\2\2\2\u0192\u0191\3\2\2\2\u0193K\3\2\2\2\u0194\u0195\7!\2\2\u0195"+
		"\u0196\7C\2\2\u0196\u0199\5L\'\2\u0197\u0199\3\2\2\2\u0198\u0194\3\2\2"+
		"\2\u0198\u0197\3\2\2\2\u0199M\3\2\2\2\u019a\u019b\7)\2\2\u019b\u019c\5"+
		"P)\2\u019cO\3\2\2\2\u019d\u01a3\5X-\2\u019e\u019f\5\u00b2Z\2\u019f\u01a0"+
		"\5n8\2\u01a0\u01a3\3\2\2\2\u01a1\u01a3\7:\2\2\u01a2\u019d\3\2\2\2\u01a2"+
		"\u019e\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3Q\3\2\2\2\u01a4\u01a5\7\60\2\2"+
		"\u01a5\u01a6\5T+\2\u01a6S\3\2\2\2\u01a7\u01ac\5X-\2\u01a8\u01a9\5\u00b2"+
		"Z\2\u01a9\u01aa\5n8\2\u01aa\u01ac\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01a8"+
		"\3\2\2\2\u01acU\3\2\2\2\u01ad\u01ae\5Z.\2\u01ae\u01af\5X-\2\u01afW\3\2"+
		"\2\2\u01b0\u01b1\5\\/\2\u01b1\u01b2\7\5\2\2\u01b2\u01b3\5\u0092J\2\u01b3"+
		"\u01b4\7C\2\2\u01b4\u01b5\7:\2\2\u01b5Y\3\2\2\2\u01b6\u01b9\7>\2\2\u01b7"+
		"\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9[\3\2\2\2"+
		"\u01ba\u01bd\7,\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb"+
		"\3\2\2\2\u01bd]\3\2\2\2\u01be\u01bf\5\u00b2Z\2\u01bf\u01c0\5f\64\2\u01c0"+
		"\u01c3\3\2\2\2\u01c1\u01c3\5`\61\2\u01c2\u01be\3\2\2\2\u01c2\u01c1\3\2"+
		"\2\2\u01c3_\3\2\2\2\u01c4\u01c5\5d\63\2\u01c5\u01c6\5b\62\2\u01c6\u01c7"+
		"\5\u00b2Z\2\u01c7\u01c8\5n8\2\u01c8a\3\2\2\2\u01c9\u01ca\5d\63\2\u01ca"+
		"\u01cb\5b\62\2\u01cb\u01ce\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01c9\3\2"+
		"\2\2\u01cd\u01cc\3\2\2\2\u01cec\3\2\2\2\u01cf\u01d0\t\4\2\2\u01d0e\3\2"+
		"\2\2\u01d1\u01d4\5h\65\2\u01d2\u01d4\5n8\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2"+
		"\3\2\2\2\u01d4g\3\2\2\2\u01d5\u01d6\7\61\2\2\u01d6\u01d7\5j\66\2\u01d7"+
		"\u01d8\7:\2\2\u01d8i\3\2\2\2\u01d9\u01dc\5l\67\2\u01da\u01dc\7\27\2\2"+
		"\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dck\3\2\2\2\u01dd\u01de\7"+
		"\30\2\2\u01de\u01e1\7C\2\2\u01df\u01e1\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e0"+
		"\u01df\3\2\2\2\u01e1m\3\2\2\2\u01e2\u01e3\5p9\2\u01e3\u01e4\7$\2\2\u01e4"+
		"\u01e5\5r:\2\u01e5\u01e6\7\24\2\2\u01e6\u01e7\7:\2\2\u01e7o\3\2\2\2\u01e8"+
		"\u01eb\7C\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2"+
		"\2\2\u01ebq\3\2\2\2\u01ec\u01ed\5v<\2\u01ed\u01ee\5t;\2\u01ee\u01f1\3"+
		"\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ec\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"s\3\2\2\2\u01f2\u01f3\7!\2\2\u01f3\u01f4\5v<\2\u01f4\u01f5\5t;\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f2\3\2\2\2\u01f7\u01f6\3\2"+
		"\2\2\u01f8u\3\2\2\2\u01f9\u01fa\5\u0082B\2\u01fa\u01fb\5x=\2\u01fbw\3"+
		"\2\2\2\u01fc\u01fd\7\13\2\2\u01fd\u01fe\5\u0092J\2\u01fe\u01ff\5z>\2\u01ff"+
		"\u0200\5 \21\2\u0200\u0206\3\2\2\2\u0201\u0202\5\u0092J\2\u0202\u0203"+
		"\5|?\2\u0203\u0204\5z>\2\u0204\u0206\3\2\2\2\u0205\u01fc\3\2\2\2\u0205"+
		"\u0201\3\2\2\2\u0206y\3\2\2\2\u0207\u020a\5\u008eH\2\u0208\u020a\7C\2"+
		"\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020a{\3\2\2\2\u020b\u020e"+
		"\7*\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020e"+
		"}\3\2\2\2\u020f\u0212\58\35\2\u0210\u0212\5\u0080A\2\u0211\u020f\3\2\2"+
		"\2\u0211\u0210\3\2\2\2\u0212\177\3\2\2\2\u0213\u0214\5\u0092J\2\u0214"+
		"\u0215\7C\2\2\u0215\u0216\7:\2\2\u0216\u0081\3\2\2\2\u0217\u0218\7\6\2"+
		"\2\u0218\u0219\5\u0086D\2\u0219\u021a\5\u0084C\2\u021a\u021b\7\36\2\2"+
		"\u021b\u021e\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u0217\3\2\2\2\u021d\u021c"+
		"\3\2\2\2\u021e\u0083\3\2\2\2\u021f\u0220\7!\2\2\u0220\u0221\5\u0086D\2"+
		"\u0221\u0222\5\u0084C\2\u0222\u0225\3\2\2\2\u0223\u0225\3\2\2\2\u0224"+
		"\u021f\3\2\2\2\u0224\u0223\3\2\2\2\u0225\u0085\3\2\2\2\u0226\u0227\7$"+
		"\2\2\u0227\u0228\5\u008aF\2\u0228\u0229\7\24\2\2\u0229\u022a\5\u0088E"+
		"\2\u022a\u0239\3\2\2\2\u022b\u022c\7\6\2\2\u022c\u022d\5\u008aF\2\u022d"+
		"\u022e\7\36\2\2\u022e\u022f\5\u0088E\2\u022f\u0239\3\2\2\2\u0230\u0231"+
		"\7+\2\2\u0231\u0232\5\u008aF\2\u0232\u0233\7\17\2\2\u0233\u0234\5\u0088"+
		"E\2\u0234\u0239\3\2\2\2\u0235\u0236\5\u008cG\2\u0236\u0237\5\u0088E\2"+
		"\u0237\u0239\3\2\2\2\u0238\u0226\3\2\2\2\u0238\u022b\3\2\2\2\u0238\u0230"+
		"\3\2\2\2\u0238\u0235\3\2\2\2\u0239\u0087\3\2\2\2\u023a\u023d\5\u0086D"+
		"\2\u023b\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023d\u0089"+
		"\3\2\2\2\u023e\u023f\7$\2\2\u023f\u0240\5\u008aF\2\u0240\u0241\7\24\2"+
		"\2\u0241\u0242\5\u008aF\2\u0242\u0252\3\2\2\2\u0243\u0244\7\6\2\2\u0244"+
		"\u0245\5\u008aF\2\u0245\u0246\7\36\2\2\u0246\u0247\5\u008aF\2\u0247\u0252"+
		"\3\2\2\2\u0248\u0249\7+\2\2\u0249\u024a\5\u008aF\2\u024a\u024b\7\17\2"+
		"\2\u024b\u024c\5\u008aF\2\u024c\u0252\3\2\2\2\u024d\u024e\5\u0090I\2\u024e"+
		"\u024f\5\u008aF\2\u024f\u0252\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u023e"+
		"\3\2\2\2\u0251\u0243\3\2\2\2\u0251\u0248\3\2\2\2\u0251\u024d\3\2\2\2\u0251"+
		"\u0250\3\2\2\2\u0252\u008b\3\2\2\2\u0253\u027a\7A\2\2\u0254\u027a\7B\2"+
		"\2\u0255\u027a\7C\2\2\u0256\u027a\7D\2\2\u0257\u027a\7G\2\2\u0258\u027a"+
		"\7\"\2\2\u0259\u027a\7\65\2\2\u025a\u027a\7*\2\2\u025b\u027a\7#\2\2\u025c"+
		"\u027a\7:\2\2\u025d\u027a\7\b\2\2\u025e\u027a\7\30\2\2\u025f\u027a\7;"+
		"\2\2\u0260\u027a\7&\2\2\u0261\u027a\7@\2\2\u0262\u027a\78\2\2\u0263\u027a"+
		"\7?\2\2\u0264\u027a\7\66\2\2\u0265\u027a\7\25\2\2\u0266\u027a\7\'\2\2"+
		"\u0267\u027a\7\22\2\2\u0268\u027a\7\20\2\2\u0269\u027a\7\63\2\2\u026a"+
		"\u027a\7\r\2\2\u026b\u027a\7\n\2\2\u026c\u027a\7\21\2\2\u026d\u027a\7"+
		"\35\2\2\u026e\u027a\7\32\2\2\u026f\u027a\7\27\2\2\u0270\u027a\7\64\2\2"+
		"\u0271\u027a\7\7\2\2\u0272\u027a\7\13\2\2\u0273\u027a\7\62\2\2\u0274\u027a"+
		"\7\37\2\2\u0275\u027a\7/\2\2\u0276\u027a\7\26\2\2\u0277\u027a\7(\2\2\u0278"+
		"\u027a\5\u008eH\2\u0279\u0253\3\2\2\2\u0279\u0254\3\2\2\2\u0279\u0255"+
		"\3\2\2\2\u0279\u0256\3\2\2\2\u0279\u0257\3\2\2\2\u0279\u0258\3\2\2\2\u0279"+
		"\u0259\3\2\2\2\u0279\u025a\3\2\2\2\u0279\u025b\3\2\2\2\u0279\u025c\3\2"+
		"\2\2\u0279\u025d\3\2\2\2\u0279\u025e\3\2\2\2\u0279\u025f\3\2\2\2\u0279"+
		"\u0260\3\2\2\2\u0279\u0261\3\2\2\2\u0279\u0262\3\2\2\2\u0279\u0263\3\2"+
		"\2\2\u0279\u0264\3\2\2\2\u0279\u0265\3\2\2\2\u0279\u0266\3\2\2\2\u0279"+
		"\u0267\3\2\2\2\u0279\u0268\3\2\2\2\u0279\u0269\3\2\2\2\u0279\u026a\3\2"+
		"\2\2\u0279\u026b\3\2\2\2\u0279\u026c\3\2\2\2\u0279\u026d\3\2\2\2\u0279"+
		"\u026e\3\2\2\2\u0279\u026f\3\2\2\2\u0279\u0270\3\2\2\2\u0279\u0271\3\2"+
		"\2\2\u0279\u0272\3\2\2\2\u0279\u0273\3\2\2\2\u0279\u0274\3\2\2\2\u0279"+
		"\u0275\3\2\2\2\u0279\u0276\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u0278\3\2"+
		"\2\2\u027a\u008d\3\2\2\2\u027b\u027c\t\5\2\2\u027c\u008f\3\2\2\2\u027d"+
		"\u0280\5\u008cG\2\u027e\u0280\7!\2\2\u027f\u027d\3\2\2\2\u027f\u027e\3"+
		"\2\2\2\u0280\u0091\3\2\2\2\u0281\u0286\5\u0094K\2\u0282\u0283\5\u0096"+
		"L\2\u0283\u0284\5\u00acW\2\u0284\u0286\3\2\2\2\u0285\u0281\3\2\2\2\u0285"+
		"\u0282\3\2\2\2\u0286\u0093\3\2\2\2\u0287\u028b\5\u009cO\2\u0288\u0289"+
		"\7\22\2\2\u0289\u028b\5\u00aeX\2\u028a\u0287\3\2\2\2\u028a\u0288\3\2\2"+
		"\2\u028b\u0095\3\2\2\2\u028c\u028d\7$\2\2\u028d\u028e\5\u0098M\2\u028e"+
		"\u028f\7\7\2\2\u028f\u0290\5\u0098M\2\u0290\u0291\5\u009aN\2\u0291\u0292"+
		"\7\24\2\2\u0292\u0097\3\2\2\2\u0293\u029c\5\u009cO\2\u0294\u0295\5\u0096"+
		"L\2\u0295\u0296\5\u00acW\2\u0296\u029c\3\2\2\2\u0297\u0298\7\22\2\2\u0298"+
		"\u0299\7\6\2\2\u0299\u029a\7\36\2\2\u029a\u029c\5\u00acW\2\u029b\u0293"+
		"\3\2\2\2\u029b\u0294\3\2\2\2\u029b\u0297\3\2\2\2\u029c\u0099\3\2\2\2\u029d"+
		"\u029e\7\7\2\2\u029e\u029f\5\u0098M\2\u029f\u02a0\5\u009aN\2\u02a0\u02a3"+
		"\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u029d\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3"+
		"\u009b\3\2\2\2\u02a4\u02a5\5\u00a0Q\2\u02a5\u02a6\5\u00acW\2\u02a6\u02ba"+
		"\3\2\2\2\u02a7\u02a8\7@\2\2\u02a8\u02ba\5\u00acW\2\u02a9\u02aa\7?\2\2"+
		"\u02aa\u02ba\5\u00acW\2\u02ab\u02ac\7C\2\2\u02ac\u02ba\5\u00acW\2\u02ad"+
		"\u02ae\7\62\2\2\u02ae\u02af\7\b\2\2\u02af\u02b0\5\u0092J\2\u02b0\u02b1"+
		"\7;\2\2\u02b1\u02b2\5\u00b0Y\2\u02b2\u02ba\3\2\2\2\u02b3\u02b4\7\27\2"+
		"\2\u02b4\u02ba\5\u00acW\2\u02b5\u02b6\78\2\2\u02b6\u02ba\5\u00acW\2\u02b7"+
		"\u02b8\7\'\2\2\u02b8\u02ba\5\u00acW\2\u02b9\u02a4\3\2\2\2\u02b9\u02a7"+
		"\3\2\2\2\u02b9\u02a9\3\2\2\2\u02b9\u02ab\3\2\2\2\u02b9\u02ad\3\2\2\2\u02b9"+
		"\u02b3\3\2\2\2\u02b9\u02b5\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u009d\3\2"+
		"\2\2\u02bb\u02bc\5\u00a0Q\2\u02bc\u02bd\5\u00b0Y\2\u02bd\u02c1\3\2\2\2"+
		"\u02be\u02bf\7C\2\2\u02bf\u02c1\5\u00b0Y\2\u02c0\u02bb\3\2\2\2\u02c0\u02be"+
		"\3\2\2\2\u02c1\u009f\3\2\2\2\u02c2\u02c8\5\u00a6T\2\u02c3\u02c8\5\u00a2"+
		"R\2\u02c4\u02c8\7\20\2\2\u02c5\u02c8\7\63\2\2\u02c6\u02c8\7\64\2\2\u02c7"+
		"\u02c2\3\2\2\2\u02c7\u02c3\3\2\2\2\u02c7\u02c4\3\2\2\2\u02c7\u02c5\3\2"+
		"\2\2\u02c7\u02c6\3\2\2\2\u02c8\u00a1\3\2\2\2\u02c9\u02ca\7.\2\2\u02ca"+
		"\u02cd\5\u00a4S\2\u02cb\u02cd\5\u00a4S\2\u02cc\u02c9\3\2\2\2\u02cc\u02cb"+
		"\3\2\2\2\u02cd\u00a3\3\2\2\2\u02ce\u02cf\t\6\2\2\u02cf\u00a5\3\2\2\2\u02d0"+
		"\u02d1\7\26\2\2\u02d1\u02d4\5\u00a8U\2\u02d2\u02d4\5\u00a8U\2\u02d3\u02d0"+
		"\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4\u00a7\3\2\2\2\u02d5\u02d9\7\37\2\2"+
		"\u02d6\u02d7\7\35\2\2\u02d7\u02d9\5\u00aaV\2\u02d8\u02d5\3\2\2\2\u02d8"+
		"\u02d6\3\2\2\2\u02d9\u00a9\3\2\2\2\u02da\u02dd\7\35\2\2\u02db\u02dd\3"+
		"\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02db\3\2\2\2\u02dd\u00ab\3\2\2\2\u02de"+
		"\u02df\7\6\2\2\u02df\u02e0\7\36\2\2\u02e0\u02e5\5\u00acW\2\u02e1\u02e2"+
		"\7&\2\2\u02e2\u02e5\5\u00aeX\2\u02e3\u02e5\3\2\2\2\u02e4\u02de\3\2\2\2"+
		"\u02e4\u02e1\3\2\2\2\u02e4\u02e3\3\2\2\2\u02e5\u00ad\3\2\2\2\u02e6\u02e7"+
		"\7\6\2\2\u02e7\u02e8\7\36\2\2\u02e8\u02eb\5\u00acW\2\u02e9\u02eb\3\2\2"+
		"\2\u02ea\u02e6\3\2\2\2\u02ea\u02e9\3\2\2\2\u02eb\u00af\3\2\2\2\u02ec\u02ef"+
		"\7&\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ed\3\2\2\2\u02ef"+
		"\u00b1\3\2\2\2\u02f0\u02f3\5\u0092J\2\u02f1\u02f3\7(\2\2\u02f2\u02f0\3"+
		"\2\2\2\u02f2\u02f1\3\2\2\2\u02f3\u00b3\3\2\2\2\u02f4\u02f5\7C\2\2\u02f5"+
		"\u00b5\3\2\2\2\u02f6\u02f7\7C\2\2\u02f7\u02f8\7$\2\2\u02f8\u02f9\5r:\2"+
		"\u02f9\u02fa\7\24\2\2\u02fa\u00b7\3\2\2\2\u02fb\u02fc\7C\2\2\u02fc\u02fd"+
		"\7\30\2\2\u02fd\u02fe\7C\2\2\u02fe\u00b9\3\2\2\2\u02ff\u0300\7C\2\2\u0300"+
		"\u0301\7\30\2\2\u0301\u0302\7C\2\2\u0302\u0303\7$\2\2\u0303\u0304\5r:"+
		"\2\u0304\u0305\7\24\2\2\u0305\u00bb\3\2\2\2\u0306\u0307\7$\2\2\u0307\u0308"+
		"\5\u0092J\2\u0308\u0309\7!\2\2\u0309\u030a\5\u0092J\2\u030a\u030b\7\24"+
		"\2\2\u030b\u00bd\3\2\2\2=\u00c6\u00cf\u00d4\u00d8\u00e7\u00f5\u00f9\u0108"+
		"\u0119\u011d\u012c\u0131\u0140\u0145\u0165\u0170\u0179\u0184\u018c\u0192"+
		"\u0198\u01a2\u01ab\u01b8\u01bc\u01c2\u01cd\u01d3\u01db\u01e0\u01ea\u01f0"+
		"\u01f7\u0205\u0209\u020d\u0211\u021d\u0224\u0238\u023c\u0251\u0279\u027f"+
		"\u0285\u028a\u029b\u02a2\u02b9\u02c0\u02c7\u02cc\u02d3\u02d8\u02dc\u02e4"+
		"\u02ea\u02ee\u02f2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}