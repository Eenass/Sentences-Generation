// Generated from ExtractedTURTLE.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExtractedTURTLELexer extends Lexer {
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
		"String", "BlankNode", "WS", "PN_PREFIX", "IRIREF", "':'", "PrefixedName", 
		"PNAME_LN", "BLANK_NODE_LABEL", "LANGTAG", "'0'", "DECIMAL", "DOUBLE", 
		"EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", "STRING_LITERAL_LONG_QUOTE", 
		"STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", "UCHAR", "ECHAR", 
		"ANON_WS", "ANON", "'$'", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", "PN_LOCAL", 
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


	public ExtractedTURTLELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExtractedTURTLE.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\60\u0124\b\1\4\2"+
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
		"\22\5\22\u00a5\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\5\27\u00b2\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u00bc"+
		"\n\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u00ce\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00fd\n#\3$\3$"+
		"\3$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\5)\u010d\n)\3*\3*\5*\u0111\n*\3"+
		"+\3+\3+\5+\u0116\n+\3,\3,\5,\u011a\n,\3-\3-\3-\3-\3.\3.\3/\3/\3/\2\60"+
		"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27"+
		"\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\""+
		"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1\3\2\t\4"+
		"\2\f\f\"\"\5\2\13\f\17\17\"\"\17\2CCcc\u00c2\u00c2\u00da\u00da\u00fa\u00fa"+
		"\u0372\u0372\u0381\u0381\u200e\u200e\u2072\u2072\u2c02\u2c02\u3003\u3003"+
		"\uf902\uf902\ufdf2\ufdf2\7\2//\62\62\u00b9\u00b9\u0302\u0302\u2041\u2041"+
		"\4\2\62\62<<\5\2\62\62CCcc\t\2##%\61==??ABaa\u0080\u0080\u0134\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7"+
		"h\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17p\3\2\2\2\21r\3\2\2\2\23"+
		"t\3\2\2\2\25z\3\2\2\2\27|\3\2\2\2\31\u0081\3\2\2\2\33\u0089\3\2\2\2\35"+
		"\u008f\3\2\2\2\37\u009a\3\2\2\2!\u00a0\3\2\2\2#\u00a4\3\2\2\2%\u00a6\3"+
		"\2\2\2\'\u00a8\3\2\2\2)\u00aa\3\2\2\2+\u00ad\3\2\2\2-\u00b1\3\2\2\2/\u00b3"+
		"\3\2\2\2\61\u00b6\3\2\2\2\63\u00bd\3\2\2\2\65\u00c0\3\2\2\2\67\u00c2\3"+
		"\2\2\29\u00cd\3\2\2\2;\u00cf\3\2\2\2=\u00d2\3\2\2\2?\u00da\3\2\2\2A\u00e2"+
		"\3\2\2\2C\u00e5\3\2\2\2E\u00fc\3\2\2\2G\u00fe\3\2\2\2I\u0101\3\2\2\2K"+
		"\u0103\3\2\2\2M\u0106\3\2\2\2O\u0108\3\2\2\2Q\u010c\3\2\2\2S\u0110\3\2"+
		"\2\2U\u0115\3\2\2\2W\u0119\3\2\2\2Y\u011b\3\2\2\2[\u011f\3\2\2\2]\u0121"+
		"\3\2\2\2_`\7_\2\2`\4\3\2\2\2ab\7R\2\2bc\7T\2\2cd\7G\2\2de\7H\2\2ef\7K"+
		"\2\2fg\7Z\2\2g\6\3\2\2\2hi\7c\2\2i\b\3\2\2\2jk\7+\2\2k\n\3\2\2\2lm\7\60"+
		"\2\2m\f\3\2\2\2no\7.\2\2o\16\3\2\2\2pq\7]\2\2q\20\3\2\2\2rs\7*\2\2s\22"+
		"\3\2\2\2tu\7B\2\2uv\7d\2\2vw\7c\2\2wx\7u\2\2xy\7g\2\2y\24\3\2\2\2z{\7"+
		"=\2\2{\26\3\2\2\2|}\7D\2\2}~\7C\2\2~\177\7U\2\2\177\u0080\7G\2\2\u0080"+
		"\30\3\2\2\2\u0081\u0082\7B\2\2\u0082\u0083\7r\2\2\u0083\u0084\7t\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7h\2\2\u0086\u0087\7k\2\2\u0087\u0088\7z\2\2"+
		"\u0088\32\3\2\2\2\u0089\u008a\7`\2\2\u008a\u008b\7`\2\2\u008b\34\3\2\2"+
		"\2\u008c\u0090\5\65\33\2\u008d\u0090\5\67\34\2\u008e\u0090\59\35\2\u008f"+
		"\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\36\3\2\2"+
		"\2\u0091\u0092\7v\2\2\u0092\u0093\7t\2\2\u0093\u0094\7w\2\2\u0094\u009b"+
		"\7g\2\2\u0095\u0096\7h\2\2\u0096\u0097\7c\2\2\u0097\u0098\7n\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009b\7g\2\2\u009a\u0091\3\2\2\2\u009a\u0095\3\2\2"+
		"\2\u009b \3\2\2\2\u009c\u00a1\5A!\2\u009d\u00a1\5C\"\2\u009e\u00a1\5="+
		"\37\2\u009f\u00a1\5? \2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\"\3\2\2\2\u00a2\u00a5\5\61\31"+
		"\2\u00a3\u00a5\5K&\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5$\3"+
		"\2\2\2\u00a6\u00a7\t\2\2\2\u00a7&\3\2\2\2\u00a8\u00a9\5O(\2\u00a9(\3\2"+
		"\2\2\u00aa\u00ab\7>\2\2\u00ab\u00ac\7@\2\2\u00ac*\3\2\2\2\u00ad\u00ae"+
		"\7<\2\2\u00ae,\3\2\2\2\u00af\u00b2\5/\30\2\u00b0\u00b2\5+\26\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2.\3\2\2\2\u00b3\u00b4\5+\26\2\u00b4"+
		"\u00b5\5U+\2\u00b5\60\3\2\2\2\u00b6\u00b7\7a\2\2\u00b7\u00b8\7<\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00bc\5Q)\2\u00ba\u00bc\7\62\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7B\2\2\u00be\u00bf"+
		"\7c\2\2\u00bf\64\3\2\2\2\u00c0\u00c1\7\62\2\2\u00c1\66\3\2\2\2\u00c2\u00c3"+
		"\7\60\2\2\u00c3\u00c4\7\62\2\2\u00c48\3\2\2\2\u00c5\u00c6\7\62\2\2\u00c6"+
		"\u00c7\7\60\2\2\u00c7\u00ce\5;\36\2\u00c8\u00c9\7\60\2\2\u00c9\u00ca\7"+
		"\62\2\2\u00ca\u00ce\5;\36\2\u00cb\u00cc\7\62\2\2\u00cc\u00ce\5;\36\2\u00cd"+
		"\u00c5\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce:\3\2\2\2"+
		"\u00cf\u00d0\7g\2\2\u00d0\u00d1\7\62\2\2\u00d1<\3\2\2\2\u00d2\u00d3\7"+
		")\2\2\u00d3\u00d4\7)\2\2\u00d4\u00d5\7)\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\7)\2\2\u00d7\u00d8\7)\2\2\u00d8\u00d9\7)\2\2\u00d9>\3\2\2\2\u00da"+
		"\u00db\7$\2\2\u00db\u00dc\7$\2\2\u00dc\u00dd\7$\2\2\u00dd\u00de\3\2\2"+
		"\2\u00de\u00df\7$\2\2\u00df\u00e0\7$\2\2\u00e0\u00e1\7$\2\2\u00e1@\3\2"+
		"\2\2\u00e2\u00e3\7$\2\2\u00e3\u00e4\7$\2\2\u00e4B\3\2\2\2\u00e5\u00e6"+
		"\7)\2\2\u00e6\u00e7\7)\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7^\2\2\u00e9\u00ea"+
		"\7w\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\5[.\2\u00ec\u00ed\5[.\2\u00ed"+
		"\u00ee\5[.\2\u00ee\u00ef\5[.\2\u00ef\u00fd\3\2\2\2\u00f0\u00f1\7^\2\2"+
		"\u00f1\u00f2\7W\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\5[.\2\u00f4\u00f5"+
		"\5[.\2\u00f5\u00f6\5[.\2\u00f6\u00f7\5[.\2\u00f7\u00f8\5[.\2\u00f8\u00f9"+
		"\5[.\2\u00f9\u00fa\5[.\2\u00fa\u00fb\5[.\2\u00fb\u00fd\3\2\2\2\u00fc\u00e8"+
		"\3\2\2\2\u00fc\u00f0\3\2\2\2\u00fdF\3\2\2\2\u00fe\u00ff\7^\2\2\u00ff\u0100"+
		"\7v\2\2\u0100H\3\2\2\2\u0101\u0102\t\3\2\2\u0102J\3\2\2\2\u0103\u0104"+
		"\7]\2\2\u0104\u0105\7_\2\2\u0105L\3\2\2\2\u0106\u0107\7&\2\2\u0107N\3"+
		"\2\2\2\u0108\u0109\t\4\2\2\u0109P\3\2\2\2\u010a\u010d\5O(\2\u010b\u010d"+
		"\7a\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010dR\3\2\2\2\u010e\u0111"+
		"\5Q)\2\u010f\u0111\t\5\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111"+
		"T\3\2\2\2\u0112\u0116\5Q)\2\u0113\u0116\t\6\2\2\u0114\u0116\5W,\2\u0115"+
		"\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116V\3\2\2\2"+
		"\u0117\u011a\5Y-\2\u0118\u011a\5]/\2\u0119\u0117\3\2\2\2\u0119\u0118\3"+
		"\2\2\2\u011aX\3\2\2\2\u011b\u011c\7\'\2\2\u011c\u011d\5[.\2\u011d\u011e"+
		"\5[.\2\u011eZ\3\2\2\2\u011f\u0120\t\7\2\2\u0120\\\3\2\2\2\u0121\u0122"+
		"\7^\2\2\u0122\u0123\t\b\2\2\u0123^\3\2\2\2\17\2\u008f\u009a\u00a0\u00a4"+
		"\u00b1\u00bb\u00cd\u00fc\u010c\u0110\u0115\u0119";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}