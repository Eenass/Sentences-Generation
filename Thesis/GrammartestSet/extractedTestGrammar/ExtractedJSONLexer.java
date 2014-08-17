// Generated from ExtractedJSON.g4 by ANTLR 4.1
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
public class ExtractedJSONLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		STRING=10, ESC=11, UNICODE=12, HEX=13, NUMBER=14, INT=15, EXP=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'{'", "'null'", "','", "'['", "':'", "'false'", "'}'", "'true'", 
		"STRING", "ESC", "UNICODE", "'0'", "NUMBER", "INT", "EXP", "'\n'"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"STRING", "ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP", "WS"
	};


	public ExtractedJSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExtractedJSON.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\23b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\5\fH\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17Z\n\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\2\23\3\3\1"+
		"\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31"+
		"\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1\3\2\2d\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3"+
		"\2\2\2\7)\3\2\2\2\t.\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\64\3\2\2\2"+
		"\21:\3\2\2\2\23<\3\2\2\2\25A\3\2\2\2\27D\3\2\2\2\31I\3\2\2\2\33O\3\2\2"+
		"\2\35Y\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#`\3\2\2\2%&\7_\2\2&\4\3\2\2\2\'("+
		"\7}\2\2(\6\3\2\2\2)*\7p\2\2*+\7w\2\2+,\7n\2\2,-\7n\2\2-\b\3\2\2\2./\7"+
		".\2\2/\n\3\2\2\2\60\61\7]\2\2\61\f\3\2\2\2\62\63\7<\2\2\63\16\3\2\2\2"+
		"\64\65\7h\2\2\65\66\7c\2\2\66\67\7n\2\2\678\7u\2\289\7g\2\29\20\3\2\2"+
		"\2:;\7\177\2\2;\22\3\2\2\2<=\7v\2\2=>\7t\2\2>?\7w\2\2?@\7g\2\2@\24\3\2"+
		"\2\2AB\7$\2\2BC\7$\2\2C\26\3\2\2\2DG\7^\2\2EH\7$\2\2FH\5\31\r\2GE\3\2"+
		"\2\2GF\3\2\2\2H\30\3\2\2\2IJ\7w\2\2JK\5\33\16\2KL\5\33\16\2LM\5\33\16"+
		"\2MN\5\33\16\2N\32\3\2\2\2OP\7\62\2\2P\34\3\2\2\2QR\5\37\20\2RS\7\60\2"+
		"\2ST\5\37\20\2TZ\3\2\2\2UV\5\37\20\2VW\5!\21\2WZ\3\2\2\2XZ\5\37\20\2Y"+
		"Q\3\2\2\2YU\3\2\2\2YX\3\2\2\2Z\36\3\2\2\2[\\\4\62\63\2\\ \3\2\2\2]^\7"+
		"G\2\2^_\5\37\20\2_\"\3\2\2\2`a\7\f\2\2a$\3\2\2\2\5\2GY";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}