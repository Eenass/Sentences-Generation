// Generated from creole.g4 by ANTLR 4.1
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
public class creoleLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, HASH=8, LBRACKET=9, 
		RBRACKET=10, LBRACE=11, RBRACE=12, TEXT=13, WS=14, CR=15, NOWIKI=16, RSLASH=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'----'", "'\\\\'", "'**'", "'*'", "'|='", "'='", "'|'", "'#'", "'[['", 
		"']]'", "'{{'", "'}}'", "TEXT", "WS", "CR", "NOWIKI", "'/'"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "HASH", "LBRACKET", 
		"RBRACKET", "LBRACE", "RBRACE", "TEXT", "WS", "CR", "NOWIKI", "RSLASH", 
		"LETTERS", "DIGITS", "SYMBOL"
	};


	public creoleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "creole.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\23p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\6\16R\n\16\r\16\16\16"+
		"S\3\17\3\17\3\20\5\20Y\n\20\3\21\3\21\3\21\3\21\3\21\7\21`\n\21\f\21\16"+
		"\21c\13\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3a\26\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f"+
		"\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\2\1\'\2\1)\2\1"+
		"\3\2\7\4\2\13\13\"\"\3\3\f\f\4\2C\\c|\3\2\62;\b\2$$)+-\60<=^^\u0080\u0080"+
		"q\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\3+\3\2\2\2\5\60\3\2\2\2\7\63\3\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r;"+
		"\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25D\3\2\2\2\27G\3\2\2\2\31"+
		"J\3\2\2\2\33Q\3\2\2\2\35U\3\2\2\2\37X\3\2\2\2!Z\3\2\2\2#h\3\2\2\2%j\3"+
		"\2\2\2\'l\3\2\2\2)n\3\2\2\2+,\7/\2\2,-\7/\2\2-.\7/\2\2./\7/\2\2/\4\3\2"+
		"\2\2\60\61\7^\2\2\61\62\7^\2\2\62\6\3\2\2\2\63\64\7,\2\2\64\65\7,\2\2"+
		"\65\b\3\2\2\2\66\67\7,\2\2\67\n\3\2\2\289\7~\2\29:\7?\2\2:\f\3\2\2\2;"+
		"<\7?\2\2<\16\3\2\2\2=>\7~\2\2>\20\3\2\2\2?@\7%\2\2@\22\3\2\2\2AB\7]\2"+
		"\2BC\7]\2\2C\24\3\2\2\2DE\7_\2\2EF\7_\2\2F\26\3\2\2\2GH\7}\2\2HI\7}\2"+
		"\2I\30\3\2\2\2JK\7\177\2\2KL\7\177\2\2L\32\3\2\2\2MR\5%\23\2NR\5\'\24"+
		"\2OR\5)\25\2PR\5\35\17\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2RS\3\2"+
		"\2\2SQ\3\2\2\2ST\3\2\2\2T\34\3\2\2\2UV\t\2\2\2V\36\3\2\2\2WY\t\3\2\2X"+
		"W\3\2\2\2Y \3\2\2\2Z[\7}\2\2[\\\7}\2\2\\]\7}\2\2]a\3\2\2\2^`\13\2\2\2"+
		"_^\3\2\2\2`c\3\2\2\2ab\3\2\2\2a_\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\177\2"+
		"\2ef\7\177\2\2fg\7\177\2\2g\"\3\2\2\2hi\7\61\2\2i$\3\2\2\2jk\t\4\2\2k"+
		"&\3\2\2\2lm\t\5\2\2m(\3\2\2\2no\t\6\2\2o*\3\2\2\2\7\2QSXa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}