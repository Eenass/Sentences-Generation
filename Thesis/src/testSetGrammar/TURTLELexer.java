// Generated from TURTLE.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TURTLELexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'PREFIX'", "'a'", "')'", "'.'", "','", "'['", "'('", "'@base'", 
		"';'", "'BASE'", "'@prefix'", "'^^'", "NumericLiteral", "BooleanLiteral", 
		"String", "BlankNode", "WS", "PN_PREFIX", "IRIREF", "PNAME_NS", "PrefixedName", 
		"PNAME_LN", "BLANK_NODE_LABEL", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", 
		"EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", "STRING_LITERAL_LONG_QUOTE", 
		"STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", "UCHAR", "ECHAR", 
		"ANON_WS", "ANON", "SC", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", "PN_LOCAL", 
		"PLX", "PERCENT", "HEX", "PN_LOCAL_ESC"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "NumericLiteral", "BooleanLiteral", "String", 
		"BlankNode", "WS", "PN_PREFIX", "IRIREF", "PNAME_NS", "PrefixedName", 
		"PNAME_LN", "BLANK_NODE_LABEL", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", 
		"EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", "STRING_LITERAL_LONG_QUOTE", 
		"STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", "UCHAR", "ECHAR", 
		"ANON_WS", "ANON", "SC", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", "PN_LOCAL", 
		"PLX", "PERCENT", "HEX", "PN_LOCAL_ESC"
	};


	public TURTLELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TURTLE.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 17: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\60\u01cd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\5\17\u0090\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u009b\n\20\3\21\3\21\3\21\3\21\5\21\u00a1\n\21\3\22\3"+
		"\22\5\22\u00a5\n\22\3\23\6\23\u00a8\n\23\r\23\16\23\u00a9\3\23\3\23\3"+
		"\24\3\24\3\24\7\24\u00b1\n\24\f\24\16\24\u00b4\13\24\3\24\5\24\u00b7\n"+
		"\24\3\25\3\25\3\25\3\25\7\25\u00bd\n\25\f\25\16\25\u00c0\13\25\3\25\3"+
		"\25\3\26\5\26\u00c5\n\26\3\26\3\26\3\27\3\27\5\27\u00cb\n\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u00d5\n\31\3\31\3\31\7\31\u00d9\n"+
		"\31\f\31\16\31\u00dc\13\31\3\31\5\31\u00df\n\31\3\32\3\32\6\32\u00e3\n"+
		"\32\r\32\16\32\u00e4\3\32\3\32\6\32\u00e9\n\32\r\32\16\32\u00ea\7\32\u00ed"+
		"\n\32\f\32\16\32\u00f0\13\32\3\33\5\33\u00f3\n\33\3\33\6\33\u00f6\n\33"+
		"\r\33\16\33\u00f7\3\34\5\34\u00fb\n\34\3\34\7\34\u00fe\n\34\f\34\16\34"+
		"\u0101\13\34\3\34\3\34\6\34\u0105\n\34\r\34\16\34\u0106\3\35\5\35\u010a"+
		"\n\35\3\35\6\35\u010d\n\35\r\35\16\35\u010e\3\35\3\35\7\35\u0113\n\35"+
		"\f\35\16\35\u0116\13\35\3\35\3\35\3\35\6\35\u011b\n\35\r\35\16\35\u011c"+
		"\3\35\3\35\6\35\u0121\n\35\r\35\16\35\u0122\3\35\5\35\u0126\n\35\3\36"+
		"\3\36\5\36\u012a\n\36\3\36\6\36\u012d\n\36\r\36\16\36\u012e\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u0138\n\37\3\37\3\37\3\37\3\37\5\37\u013e"+
		"\n\37\7\37\u0140\n\37\f\37\16\37\u0143\13\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \5 \u0150\n \3 \3 \3 \3 \5 \u0156\n \7 \u0158\n \f \16"+
		" \u015b\13 \3 \3 \3 \3 \3!\3!\3!\3!\3!\7!\u0166\n!\f!\16!\u0169\13!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u0172\n\"\f\"\16\"\u0175\13\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u018d\n#"+
		"\3$\3$\3$\3%\3%\3&\3&\7&\u0196\n&\f&\16&\u0199\13&\3&\3&\3\'\6\'\u019e"+
		"\n\'\r\'\16\'\u019f\3(\3(\3)\3)\5)\u01a6\n)\3*\3*\5*\u01aa\n*\3+\3+\3"+
		"+\5+\u01af\n+\3+\3+\3+\7+\u01b4\n+\f+\16+\u01b7\13+\3+\3+\3+\5+\u01bc"+
		"\n+\5+\u01be\n+\3,\3,\5,\u01c2\n,\3-\3-\3-\3-\3.\5.\u01c9\n.\3/\3/\3/"+
		"\2\60\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f"+
		"\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\2\'\25\1)\26"+
		"\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?"+
		"!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1\3"+
		"\2\25\5\2\13\f\16\17\"\"\b\2%%\'(\60\61<<BB^^\3\2\62;\4\2C\\c|\5\2\62"+
		";C\\c|\4\2--//\4\2GGgg\5\2))^^``\4\2$$^^\7\2\f\f\17\17$$))^^\6\2\f\f\17"+
		"\17))^^\n\2$$))^^ddhhppttvv\5\2\13\f\17\17\"\"\4\2YY^^\17\2C\\c|\u00c2"+
		"\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072"+
		"\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\7\2//\62;\u00b9"+
		"\u00b9\u0302\u0371\u2041\u2042\4\2\60\60<<\5\2\62;CHch\t\2##%\61==??A"+
		"Baa\u0080\u0080\u0212\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7h\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2\rn\3\2"+
		"\2\2\17p\3\2\2\2\21r\3\2\2\2\23t\3\2\2\2\25z\3\2\2\2\27|\3\2\2\2\31\u0081"+
		"\3\2\2\2\33\u0089\3\2\2\2\35\u008f\3\2\2\2\37\u009a\3\2\2\2!\u00a0\3\2"+
		"\2\2#\u00a4\3\2\2\2%\u00a7\3\2\2\2\'\u00ad\3\2\2\2)\u00b8\3\2\2\2+\u00c4"+
		"\3\2\2\2-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61\u00cf\3\2\2\2\63\u00e0\3\2\2"+
		"\2\65\u00f2\3\2\2\2\67\u00fa\3\2\2\29\u0109\3\2\2\2;\u0127\3\2\2\2=\u0130"+
		"\3\2\2\2?\u0148\3\2\2\2A\u0160\3\2\2\2C\u016c\3\2\2\2E\u018c\3\2\2\2G"+
		"\u018e\3\2\2\2I\u0191\3\2\2\2K\u0193\3\2\2\2M\u019d\3\2\2\2O\u01a1\3\2"+
		"\2\2Q\u01a5\3\2\2\2S\u01a9\3\2\2\2U\u01ae\3\2\2\2W\u01c1\3\2\2\2Y\u01c3"+
		"\3\2\2\2[\u01c8\3\2\2\2]\u01ca\3\2\2\2_`\7_\2\2`\4\3\2\2\2ab\7R\2\2bc"+
		"\7T\2\2cd\7G\2\2de\7H\2\2ef\7K\2\2fg\7Z\2\2g\6\3\2\2\2hi\7c\2\2i\b\3\2"+
		"\2\2jk\7+\2\2k\n\3\2\2\2lm\7\60\2\2m\f\3\2\2\2no\7.\2\2o\16\3\2\2\2pq"+
		"\7]\2\2q\20\3\2\2\2rs\7*\2\2s\22\3\2\2\2tu\7B\2\2uv\7d\2\2vw\7c\2\2wx"+
		"\7u\2\2xy\7g\2\2y\24\3\2\2\2z{\7=\2\2{\26\3\2\2\2|}\7D\2\2}~\7C\2\2~\177"+
		"\7U\2\2\177\u0080\7G\2\2\u0080\30\3\2\2\2\u0081\u0082\7B\2\2\u0082\u0083"+
		"\7r\2\2\u0083\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086\7h\2\2\u0086"+
		"\u0087\7k\2\2\u0087\u0088\7z\2\2\u0088\32\3\2\2\2\u0089\u008a\7`\2\2\u008a"+
		"\u008b\7`\2\2\u008b\34\3\2\2\2\u008c\u0090\5\65\33\2\u008d\u0090\5\67"+
		"\34\2\u008e\u0090\59\35\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\36\3\2\2\2\u0091\u0092\7v\2\2\u0092\u0093\7t\2\2"+
		"\u0093\u0094\7w\2\2\u0094\u009b\7g\2\2\u0095\u0096\7h\2\2\u0096\u0097"+
		"\7c\2\2\u0097\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099\u009b\7g\2\2\u009a"+
		"\u0091\3\2\2\2\u009a\u0095\3\2\2\2\u009b \3\2\2\2\u009c\u00a1\5A!\2\u009d"+
		"\u00a1\5C\"\2\u009e\u00a1\5=\37\2\u009f\u00a1\5? \2\u00a0\u009c\3\2\2"+
		"\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\""+
		"\3\2\2\2\u00a2\u00a5\5\61\31\2\u00a3\u00a5\5K&\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5$\3\2\2\2\u00a6\u00a8\t\2\2\2\u00a7\u00a6\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\b\23\2\2\u00ac&\3\2\2\2\u00ad\u00b6\5O(\2\u00ae\u00b1"+
		"\5S*\2\u00af\u00b1\7\60\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\5S*\2\u00b6\u00b2\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7(\3\2\2\2\u00b8\u00be\7>\2\2\u00b9\u00bd\5S*\2\u00ba\u00bd"+
		"\t\3\2\2\u00bb\u00bd\5E#\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7@\2\2\u00c2"+
		"*\3\2\2\2\u00c3\u00c5\5\'\24\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7<\2\2\u00c7,\3\2\2\2\u00c8\u00cb\5/"+
		"\30\2\u00c9\u00cb\5+\26\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		".\3\2\2\2\u00cc\u00cd\5+\26\2\u00cd\u00ce\5U+\2\u00ce\60\3\2\2\2\u00cf"+
		"\u00d0\7a\2\2\u00d0\u00d1\7<\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d5\5Q)\2"+
		"\u00d3\u00d5\t\4\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00de"+
		"\3\2\2\2\u00d6\u00d9\5S*\2\u00d7\u00d9\7\60\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\5S*\2\u00de\u00da"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\62\3\2\2\2\u00e0\u00e2\7B\2\2\u00e1"+
		"\u00e3\t\5\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ee\3\2\2\2\u00e6\u00e8\7/\2\2\u00e7"+
		"\u00e9\t\6\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\64\3\2\2"+
		"\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\t\7\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6\t\4\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\66\3\2\2"+
		"\2\u00f9\u00fb\t\7\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00ff"+
		"\3\2\2\2\u00fc\u00fe\t\4\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u0104\7\60\2\2\u0103\u0105\t\4\2\2\u0104\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u01078\3\2\2\2"+
		"\u0108\u010a\t\7\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0125"+
		"\3\2\2\2\u010b\u010d\t\4\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0114\7\60"+
		"\2\2\u0111\u0113\t\4\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0117\u0126\5;\36\2\u0118\u011a\7\60\2\2\u0119\u011b\t\4\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u0126\5;\36\2\u011f\u0121\t\4\2\2\u0120"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u0126\5;\36\2\u0125\u010c\3\2\2\2\u0125"+
		"\u0118\3\2\2\2\u0125\u0120\3\2\2\2\u0126:\3\2\2\2\u0127\u0129\t\b\2\2"+
		"\u0128\u012a\t\7\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c"+
		"\3\2\2\2\u012b\u012d\t\4\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f<\3\2\2\2\u0130\u0131\7)\2\2\u0131"+
		"\u0132\7)\2\2\u0132\u0133\7)\2\2\u0133\u0141\3\2\2\2\u0134\u0138\7)\2"+
		"\2\u0135\u0136\7)\2\2\u0136\u0138\7)\2\2\u0137\u0134\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013d\3\2\2\2\u0139\u013e\t\t\2\2\u013a"+
		"\u013e\5G$\2\u013b\u013e\5E#\2\u013c\u013e\7$\2\2\u013d\u0139\3\2\2\2"+
		"\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0140"+
		"\3\2\2\2\u013f\u0137\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7)"+
		"\2\2\u0145\u0146\7)\2\2\u0146\u0147\7)\2\2\u0147>\3\2\2\2\u0148\u0149"+
		"\7$\2\2\u0149\u014a\7$\2\2\u014a\u014b\7$\2\2\u014b\u0159\3\2\2\2\u014c"+
		"\u0150\7$\2\2\u014d\u014e\7$\2\2\u014e\u0150\7$\2\2\u014f\u014c\3\2\2"+
		"\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0155\3\2\2\2\u0151\u0156"+
		"\n\n\2\2\u0152\u0156\5G$\2\u0153\u0156\5E#\2\u0154\u0156\7)\2\2\u0155"+
		"\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2"+
		"\2\2\u0156\u0158\3\2\2\2\u0157\u014f\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u015d\7$\2\2\u015d\u015e\7$\2\2\u015e\u015f\7$\2\2\u015f@\3"+
		"\2\2\2\u0160\u0167\7$\2\2\u0161\u0166\n\13\2\2\u0162\u0166\7)\2\2\u0163"+
		"\u0164\7^\2\2\u0164\u0166\7$\2\2\u0165\u0161\3\2\2\2\u0165\u0162\3\2\2"+
		"\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7$\2\2\u016b"+
		"B\3\2\2\2\u016c\u0173\7)\2\2\u016d\u0172\n\f\2\2\u016e\u0172\5G$\2\u016f"+
		"\u0172\5E#\2\u0170\u0172\7$\2\2\u0171\u016d\3\2\2\2\u0171\u016e\3\2\2"+
		"\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0177\7)\2\2\u0177D\3\2\2\2\u0178\u0179\7^\2\2\u0179\u017a\7w\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\5[.\2\u017c\u017d\5[.\2\u017d\u017e\5[.\2\u017e"+
		"\u017f\5[.\2\u017f\u018d\3\2\2\2\u0180\u0181\7^\2\2\u0181\u0182\7W\2\2"+
		"\u0182\u0183\3\2\2\2\u0183\u0184\5[.\2\u0184\u0185\5[.\2\u0185\u0186\5"+
		"[.\2\u0186\u0187\5[.\2\u0187\u0188\5[.\2\u0188\u0189\5[.\2\u0189\u018a"+
		"\5[.\2\u018a\u018b\5[.\2\u018b\u018d\3\2\2\2\u018c\u0178\3\2\2\2\u018c"+
		"\u0180\3\2\2\2\u018dF\3\2\2\2\u018e\u018f\7^\2\2\u018f\u0190\t\r\2\2\u0190"+
		"H\3\2\2\2\u0191\u0192\t\16\2\2\u0192J\3\2\2\2\u0193\u0197\7]\2\2\u0194"+
		"\u0196\5I%\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2"+
		"\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b"+
		"\7_\2\2\u019bL\3\2\2\2\u019c\u019e\t\17\2\2\u019d\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0N\3\2\2\2"+
		"\u01a1\u01a2\t\20\2\2\u01a2P\3\2\2\2\u01a3\u01a6\5O(\2\u01a4\u01a6\7a"+
		"\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6R\3\2\2\2\u01a7\u01aa"+
		"\5Q)\2\u01a8\u01aa\t\21\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"T\3\2\2\2\u01ab\u01af\5Q)\2\u01ac\u01af\4\62<\2\u01ad\u01af\5W,\2\u01ae"+
		"\u01ab\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u01bd\3\2"+
		"\2\2\u01b0\u01b4\5S*\2\u01b1\u01b4\t\22\2\2\u01b2\u01b4\5W,\2\u01b3\u01b0"+
		"\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01bb\3\2\2\2\u01b7\u01b5\3\2"+
		"\2\2\u01b8\u01bc\5S*\2\u01b9\u01bc\7<\2\2\u01ba\u01bc\5W,\2\u01bb\u01b8"+
		"\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd"+
		"\u01b5\3\2\2\2\u01bd\u01be\3\2\2\2\u01beV\3\2\2\2\u01bf\u01c2\5Y-\2\u01c0"+
		"\u01c2\5]/\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2X\3\2\2\2\u01c3"+
		"\u01c4\7\'\2\2\u01c4\u01c5\5[.\2\u01c5\u01c6\5[.\2\u01c6Z\3\2\2\2\u01c7"+
		"\u01c9\t\23\2\2\u01c8\u01c7\3\2\2\2\u01c9\\\3\2\2\2\u01ca\u01cb\7^\2\2"+
		"\u01cb\u01cc\t\24\2\2\u01cc^\3\2\2\2:\2\u008f\u009a\u00a0\u00a4\u00a7"+
		"\u00a9\u00b0\u00b2\u00b6\u00bc\u00be\u00c4\u00ca\u00d4\u00d8\u00da\u00de"+
		"\u00e4\u00ea\u00ee\u00f2\u00f7\u00fa\u00ff\u0106\u0109\u010e\u0114\u011c"+
		"\u0122\u0125\u0129\u012e\u0137\u013d\u0141\u014f\u0155\u0159\u0165\u0167"+
		"\u0171\u0173\u018c\u0197\u019f\u01a5\u01a9\u01ae\u01b3\u01b5\u01bb\u01bd"+
		"\u01c1\u01c8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}