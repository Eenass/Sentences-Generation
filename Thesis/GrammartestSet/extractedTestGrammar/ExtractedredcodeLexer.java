// Generated from Extractedredcode.g4 by ANTLR 4.1
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
public class ExtractedredcodeLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		A=10, B=11, AB=12, BA=13, F=14, X=15, I=16, DAT=17, MOV=18, ADD=19, SUB=20, 
		MUL=21, DIV=22, MOD=23, JMP=24, JMZ=25, JMN=26, DJN=27, CMP=28, SLT=29, 
		DJZ=30, SPL=31, ORG=32, NUMBER=33, COMMENT=34, EOL=35, WS=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'>'", "'.'", "','", "'+'", "'-'", "'@'", "'<'", "'#'", "'$'", "'A'", 
		"'B'", "'AB'", "'BA'", "'F'", "'X'", "'I'", "'DAT'", "'MOV'", "'ADD'", 
		"'SUB'", "'MUL'", "'DIV'", "'MOD'", "'JMP'", "'JMZ'", "'JMN'", "'DJN'", 
		"'CMP'", "'SLT'", "'DJZ'", "'SPL'", "'ORG'", "'0'", "';'", "'\n'", "'\t'"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"A", "B", "AB", "BA", "F", "X", "I", "DAT", "MOV", "ADD", "SUB", "MUL", 
		"DIV", "MOD", "JMP", "JMZ", "JMN", "DJN", "CMP", "SLT", "DJZ", "SPL", 
		"ORG", "NUMBER", "COMMENT", "EOL", "WS"
	};


	public ExtractedredcodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Extractedredcode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2&\u00b5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\2&\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n"+
		"\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%"+
		"\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19"+
		"\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1\3\2\2\u00b4\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3"+
		"\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17W\3\2"+
		"\2\2\21Y\3\2\2\2\23[\3\2\2\2\25]\3\2\2\2\27_\3\2\2\2\31a\3\2\2\2\33d\3"+
		"\2\2\2\35g\3\2\2\2\37i\3\2\2\2!k\3\2\2\2#m\3\2\2\2%q\3\2\2\2\'u\3\2\2"+
		"\2)y\3\2\2\2+}\3\2\2\2-\u0081\3\2\2\2/\u0085\3\2\2\2\61\u0089\3\2\2\2"+
		"\63\u008d\3\2\2\2\65\u0091\3\2\2\2\67\u0095\3\2\2\29\u0099\3\2\2\2;\u009d"+
		"\3\2\2\2=\u00a1\3\2\2\2?\u00a5\3\2\2\2A\u00a9\3\2\2\2C\u00ad\3\2\2\2E"+
		"\u00af\3\2\2\2G\u00b1\3\2\2\2I\u00b3\3\2\2\2KL\7@\2\2L\4\3\2\2\2MN\7\60"+
		"\2\2N\6\3\2\2\2OP\7.\2\2P\b\3\2\2\2QR\7-\2\2R\n\3\2\2\2ST\7/\2\2T\f\3"+
		"\2\2\2UV\7B\2\2V\16\3\2\2\2WX\7>\2\2X\20\3\2\2\2YZ\7%\2\2Z\22\3\2\2\2"+
		"[\\\7&\2\2\\\24\3\2\2\2]^\7C\2\2^\26\3\2\2\2_`\7D\2\2`\30\3\2\2\2ab\7"+
		"C\2\2bc\7D\2\2c\32\3\2\2\2de\7D\2\2ef\7C\2\2f\34\3\2\2\2gh\7H\2\2h\36"+
		"\3\2\2\2ij\7Z\2\2j \3\2\2\2kl\7K\2\2l\"\3\2\2\2mn\7F\2\2no\7C\2\2op\7"+
		"V\2\2p$\3\2\2\2qr\7O\2\2rs\7Q\2\2st\7X\2\2t&\3\2\2\2uv\7C\2\2vw\7F\2\2"+
		"wx\7F\2\2x(\3\2\2\2yz\7U\2\2z{\7W\2\2{|\7D\2\2|*\3\2\2\2}~\7O\2\2~\177"+
		"\7W\2\2\177\u0080\7N\2\2\u0080,\3\2\2\2\u0081\u0082\7F\2\2\u0082\u0083"+
		"\7K\2\2\u0083\u0084\7X\2\2\u0084.\3\2\2\2\u0085\u0086\7O\2\2\u0086\u0087"+
		"\7Q\2\2\u0087\u0088\7F\2\2\u0088\60\3\2\2\2\u0089\u008a\7L\2\2\u008a\u008b"+
		"\7O\2\2\u008b\u008c\7R\2\2\u008c\62\3\2\2\2\u008d\u008e\7L\2\2\u008e\u008f"+
		"\7O\2\2\u008f\u0090\7\\\2\2\u0090\64\3\2\2\2\u0091\u0092\7L\2\2\u0092"+
		"\u0093\7O\2\2\u0093\u0094\7P\2\2\u0094\66\3\2\2\2\u0095\u0096\7F\2\2\u0096"+
		"\u0097\7L\2\2\u0097\u0098\7P\2\2\u00988\3\2\2\2\u0099\u009a\7E\2\2\u009a"+
		"\u009b\7O\2\2\u009b\u009c\7R\2\2\u009c:\3\2\2\2\u009d\u009e\7U\2\2\u009e"+
		"\u009f\7N\2\2\u009f\u00a0\7V\2\2\u00a0<\3\2\2\2\u00a1\u00a2\7F\2\2\u00a2"+
		"\u00a3\7L\2\2\u00a3\u00a4\7\\\2\2\u00a4>\3\2\2\2\u00a5\u00a6\7U\2\2\u00a6"+
		"\u00a7\7R\2\2\u00a7\u00a8\7N\2\2\u00a8@\3\2\2\2\u00a9\u00aa\7Q\2\2\u00aa"+
		"\u00ab\7T\2\2\u00ab\u00ac\7I\2\2\u00acB\3\2\2\2\u00ad\u00ae\7\62\2\2\u00ae"+
		"D\3\2\2\2\u00af\u00b0\7=\2\2\u00b0F\3\2\2\2\u00b1\u00b2\7\f\2\2\u00b2"+
		"H\3\2\2\2\u00b3\u00b4\7\13\2\2\u00b4J\3\2\2\2\3\2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}