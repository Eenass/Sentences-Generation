// Generated from ExtractedICalendar.g4 by ANTLR 4.1
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
public class ExtractedICalendarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_FOLD=1, WSP=2, ESCAPED_CHAR=3, CRLF=4, CONTROL=5, A=6, B=7, C=8, 
		D=9, E=10, F=11, G=12, H=13, I=14, J=15, K=16, L=17, M=18, N=19, O=20, 
		P=21, Q=22, R=23, S=24, T=25, U=26, V=27, W=28, X=29, Y=30, Z=31, EXCLAMATION=32, 
		DQUOTE=33, HASH=34, DOLLAR=35, X25=36, AMP=37, X27=38, X28=39, X29=40, 
		X2A=41, PLUS=42, COMMA=43, MINUS=44, DOT=45, FSLASH=46, D0=47, D1=48, 
		D2=49, D3=50, D4=51, D5=52, D6=53, D7=54, D8=55, D9=56, COL=57, SCOL=58, 
		X3C=59, ASSIGN=60, X3E=61, X3F=62, X40=63, X5B=64, BSLASH=65, X5D=66, 
		CARET=67, USCORE=68, X60=69, X7B=70, X7C=71, X7D=72, X7E=73, NON_US_ASCII=74;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"LINE_FOLD", "WSP", "ESCAPED_CHAR", "CRLF", "CONTROL", "'a'", "'b'", "'c'", 
		"'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", 
		"'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", 
		"'x'", "'y'", "'z'", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'", "'?'", "'@'", "'['", "'\\'", "']'", "'^'", "'_'", 
		"'`'", "'{'", "'|'", "'}'", "'~'", "NON_US_ASCII"
	};
	public static final String[] ruleNames = {
		"LINE_FOLD", "WSP", "ESCAPED_CHAR", "CRLF", "CONTROL", "A", "B", "C", 
		"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
		"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "EXCLAMATION", "DQUOTE", 
		"HASH", "DOLLAR", "X25", "AMP", "X27", "X28", "X29", "X2A", "PLUS", "COMMA", 
		"MINUS", "DOT", "FSLASH", "D0", "D1", "D2", "D3", "D4", "D5", "D6", "D7", 
		"D8", "D9", "COL", "SCOL", "X3C", "ASSIGN", "X3E", "X3F", "X40", "X5B", 
		"BSLASH", "X5D", "CARET", "USCORE", "X60", "X7B", "X7C", "X7D", "X7E", 
		"NON_US_ASCII"
	};


	public ExtractedICalendarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExtractedICalendar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2L\u0134\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\u00a5\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3"+
		"?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3"+
		"J\3K\3K\2L\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1"+
		"\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1"+
		"= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60"+
		"\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s;\1u<\1w=\1y"+
		">\1{?\1}@\1\177A\1\u0081B\1\u0083C\1\u0085D\1\u0087E\1\u0089F\1\u008b"+
		"G\1\u008dH\1\u008fI\1\u0091J\1\u0093K\1\u0095L\1\3\2\5\4\2\13\13\"\"\4"+
		"\2\f\f\17\17\6\2\2\2\r\r\20\20\u0081\u0081\u0136\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\5\u009a"+
		"\3\2\2\2\7\u00a4\3\2\2\2\t\u00a6\3\2\2\2\13\u00a8\3\2\2\2\r\u00aa\3\2"+
		"\2\2\17\u00ac\3\2\2\2\21\u00ae\3\2\2\2\23\u00b0\3\2\2\2\25\u00b2\3\2\2"+
		"\2\27\u00b4\3\2\2\2\31\u00b6\3\2\2\2\33\u00b8\3\2\2\2\35\u00ba\3\2\2\2"+
		"\37\u00bc\3\2\2\2!\u00be\3\2\2\2#\u00c0\3\2\2\2%\u00c2\3\2\2\2\'\u00c4"+
		"\3\2\2\2)\u00c6\3\2\2\2+\u00c8\3\2\2\2-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61"+
		"\u00ce\3\2\2\2\63\u00d0\3\2\2\2\65\u00d2\3\2\2\2\67\u00d4\3\2\2\29\u00d6"+
		"\3\2\2\2;\u00d8\3\2\2\2=\u00da\3\2\2\2?\u00dc\3\2\2\2A\u00de\3\2\2\2C"+
		"\u00e0\3\2\2\2E\u00e2\3\2\2\2G\u00e4\3\2\2\2I\u00e6\3\2\2\2K\u00e8\3\2"+
		"\2\2M\u00ea\3\2\2\2O\u00ec\3\2\2\2Q\u00ee\3\2\2\2S\u00f0\3\2\2\2U\u00f2"+
		"\3\2\2\2W\u00f4\3\2\2\2Y\u00f6\3\2\2\2[\u00f8\3\2\2\2]\u00fa\3\2\2\2_"+
		"\u00fc\3\2\2\2a\u00fe\3\2\2\2c\u0100\3\2\2\2e\u0102\3\2\2\2g\u0104\3\2"+
		"\2\2i\u0106\3\2\2\2k\u0108\3\2\2\2m\u010a\3\2\2\2o\u010c\3\2\2\2q\u010e"+
		"\3\2\2\2s\u0110\3\2\2\2u\u0112\3\2\2\2w\u0114\3\2\2\2y\u0116\3\2\2\2{"+
		"\u0118\3\2\2\2}\u011a\3\2\2\2\177\u011c\3\2\2\2\u0081\u011e\3\2\2\2\u0083"+
		"\u0120\3\2\2\2\u0085\u0122\3\2\2\2\u0087\u0124\3\2\2\2\u0089\u0126\3\2"+
		"\2\2\u008b\u0128\3\2\2\2\u008d\u012a\3\2\2\2\u008f\u012c\3\2\2\2\u0091"+
		"\u012e\3\2\2\2\u0093\u0130\3\2\2\2\u0095\u0132\3\2\2\2\u0097\u0098\5\t"+
		"\5\2\u0098\u0099\5\5\3\2\u0099\4\3\2\2\2\u009a\u009b\t\2\2\2\u009b\6\3"+
		"\2\2\2\u009c\u009d\7^\2\2\u009d\u00a5\7^\2\2\u009e\u009f\7^\2\2\u009f"+
		"\u00a5\7=\2\2\u00a0\u00a1\7^\2\2\u00a1\u00a5\7.\2\2\u00a2\u00a3\7^\2\2"+
		"\u00a3\u00a5\5\'\24\2\u00a4\u009c\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a0"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\b\3\2\2\2\u00a6\u00a7\t\3\2\2\u00a7"+
		"\n\3\2\2\2\u00a8\u00a9\t\4\2\2\u00a9\f\3\2\2\2\u00aa\u00ab\7c\2\2\u00ab"+
		"\16\3\2\2\2\u00ac\u00ad\7d\2\2\u00ad\20\3\2\2\2\u00ae\u00af\7e\2\2\u00af"+
		"\22\3\2\2\2\u00b0\u00b1\7f\2\2\u00b1\24\3\2\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"\26\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5\30\3\2\2\2\u00b6\u00b7\7i\2\2\u00b7"+
		"\32\3\2\2\2\u00b8\u00b9\7j\2\2\u00b9\34\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb"+
		"\36\3\2\2\2\u00bc\u00bd\7l\2\2\u00bd \3\2\2\2\u00be\u00bf\7m\2\2\u00bf"+
		"\"\3\2\2\2\u00c0\u00c1\7n\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7o\2\2\u00c3"+
		"&\3\2\2\2\u00c4\u00c5\7p\2\2\u00c5(\3\2\2\2\u00c6\u00c7\7q\2\2\u00c7*"+
		"\3\2\2\2\u00c8\u00c9\7r\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7s\2\2\u00cb.\3"+
		"\2\2\2\u00cc\u00cd\7t\2\2\u00cd\60\3\2\2\2\u00ce\u00cf\7u\2\2\u00cf\62"+
		"\3\2\2\2\u00d0\u00d1\7v\2\2\u00d1\64\3\2\2\2\u00d2\u00d3\7w\2\2\u00d3"+
		"\66\3\2\2\2\u00d4\u00d5\7x\2\2\u00d58\3\2\2\2\u00d6\u00d7\7y\2\2\u00d7"+
		":\3\2\2\2\u00d8\u00d9\7z\2\2\u00d9<\3\2\2\2\u00da\u00db\7{\2\2\u00db>"+
		"\3\2\2\2\u00dc\u00dd\7|\2\2\u00dd@\3\2\2\2\u00de\u00df\7#\2\2\u00dfB\3"+
		"\2\2\2\u00e0\u00e1\7$\2\2\u00e1D\3\2\2\2\u00e2\u00e3\7%\2\2\u00e3F\3\2"+
		"\2\2\u00e4\u00e5\7&\2\2\u00e5H\3\2\2\2\u00e6\u00e7\7\'\2\2\u00e7J\3\2"+
		"\2\2\u00e8\u00e9\7(\2\2\u00e9L\3\2\2\2\u00ea\u00eb\7)\2\2\u00ebN\3\2\2"+
		"\2\u00ec\u00ed\7*\2\2\u00edP\3\2\2\2\u00ee\u00ef\7+\2\2\u00efR\3\2\2\2"+
		"\u00f0\u00f1\7,\2\2\u00f1T\3\2\2\2\u00f2\u00f3\7-\2\2\u00f3V\3\2\2\2\u00f4"+
		"\u00f5\7.\2\2\u00f5X\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7Z\3\2\2\2\u00f8\u00f9"+
		"\7\60\2\2\u00f9\\\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fb^\3\2\2\2\u00fc\u00fd"+
		"\7\62\2\2\u00fd`\3\2\2\2\u00fe\u00ff\7\63\2\2\u00ffb\3\2\2\2\u0100\u0101"+
		"\7\64\2\2\u0101d\3\2\2\2\u0102\u0103\7\65\2\2\u0103f\3\2\2\2\u0104\u0105"+
		"\7\66\2\2\u0105h\3\2\2\2\u0106\u0107\7\67\2\2\u0107j\3\2\2\2\u0108\u0109"+
		"\78\2\2\u0109l\3\2\2\2\u010a\u010b\79\2\2\u010bn\3\2\2\2\u010c\u010d\7"+
		":\2\2\u010dp\3\2\2\2\u010e\u010f\7;\2\2\u010fr\3\2\2\2\u0110\u0111\7<"+
		"\2\2\u0111t\3\2\2\2\u0112\u0113\7=\2\2\u0113v\3\2\2\2\u0114\u0115\7>\2"+
		"\2\u0115x\3\2\2\2\u0116\u0117\7?\2\2\u0117z\3\2\2\2\u0118\u0119\7@\2\2"+
		"\u0119|\3\2\2\2\u011a\u011b\7A\2\2\u011b~\3\2\2\2\u011c\u011d\7B\2\2\u011d"+
		"\u0080\3\2\2\2\u011e\u011f\7]\2\2\u011f\u0082\3\2\2\2\u0120\u0121\7^\2"+
		"\2\u0121\u0084\3\2\2\2\u0122\u0123\7_\2\2\u0123\u0086\3\2\2\2\u0124\u0125"+
		"\7`\2\2\u0125\u0088\3\2\2\2\u0126\u0127\7a\2\2\u0127\u008a\3\2\2\2\u0128"+
		"\u0129\7b\2\2\u0129\u008c\3\2\2\2\u012a\u012b\7}\2\2\u012b\u008e\3\2\2"+
		"\2\u012c\u012d\7~\2\2\u012d\u0090\3\2\2\2\u012e\u012f\7\177\2\2\u012f"+
		"\u0092\3\2\2\2\u0130\u0131\7\u0080\2\2\u0131\u0094\3\2\2\2\u0132\u0133"+
		"\13\2\2\2\u0133\u0096\3\2\2\2\4\2\u00a4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}