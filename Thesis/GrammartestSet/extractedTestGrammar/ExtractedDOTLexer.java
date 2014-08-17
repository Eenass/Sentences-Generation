// Generated from ExtractedDOT.g4 by ANTLR 4.1
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
public class ExtractedDOTLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, STRICT=11, GRAPH=12, DIGRAPH=13, NODE=14, EDGE=15, SUBGRAPH=16, 
		NUMBER=17, DIGIT=18, STRING=19, ID=20, LETTER=21, HTML_STRING=22, TAG=23, 
		COMMENT=24, LINE_COMMENT=25, PREPROC=26, WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'->'", "'{'", "','", "'['", "':'", "'--'", "'='", "'}'", "';'", 
		"STRICT", "GRAPH", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", "NUMBER", "'0'", 
		"STRING", "ID", "'a'", "HTML_STRING", "TAG", "COMMENT", "LINE_COMMENT", 
		"PREPROC", "'\n'"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "STRICT", "GRAPH", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", "NUMBER", 
		"DIGIT", "STRING", "ID", "LETTER", "HTML_STRING", "TAG", "COMMENT", "LINE_COMMENT", 
		"PREPROC", "WS"
	};


	public ExtractedDOTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExtractedDOT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\35\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22{\n\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\2\35\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1"+
		"\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\1\3\2\2\u009b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3"+
		"\2\2\2\7>\3\2\2\2\t@\3\2\2\2\13B\3\2\2\2\rD\3\2\2\2\17F\3\2\2\2\21I\3"+
		"\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27O\3\2\2\2\31V\3\2\2\2\33\\\3\2\2\2\35"+
		"d\3\2\2\2\37i\3\2\2\2!n\3\2\2\2#z\3\2\2\2%|\3\2\2\2\'~\3\2\2\2)\u0081"+
		"\3\2\2\2+\u0083\3\2\2\2-\u0085\3\2\2\2/\u0088\3\2\2\2\61\u008b\3\2\2\2"+
		"\63\u0091\3\2\2\2\65\u0096\3\2\2\2\67\u0099\3\2\2\29:\7_\2\2:\4\3\2\2"+
		"\2;<\7/\2\2<=\7@\2\2=\6\3\2\2\2>?\7}\2\2?\b\3\2\2\2@A\7.\2\2A\n\3\2\2"+
		"\2BC\7]\2\2C\f\3\2\2\2DE\7<\2\2E\16\3\2\2\2FG\7/\2\2GH\7/\2\2H\20\3\2"+
		"\2\2IJ\7?\2\2J\22\3\2\2\2KL\7\177\2\2L\24\3\2\2\2MN\7=\2\2N\26\3\2\2\2"+
		"OP\7U\2\2PQ\7V\2\2QR\7T\2\2RS\7K\2\2ST\7E\2\2TU\7V\2\2U\30\3\2\2\2VW\7"+
		"I\2\2WX\7T\2\2XY\7C\2\2YZ\7R\2\2Z[\7J\2\2[\32\3\2\2\2\\]\7F\2\2]^\7K\2"+
		"\2^_\7I\2\2_`\7T\2\2`a\7C\2\2ab\7R\2\2bc\7J\2\2c\34\3\2\2\2de\7P\2\2e"+
		"f\7Q\2\2fg\7F\2\2gh\7G\2\2h\36\3\2\2\2ij\7G\2\2jk\7F\2\2kl\7I\2\2lm\7"+
		"G\2\2m \3\2\2\2no\7U\2\2op\7W\2\2pq\7D\2\2qr\7I\2\2rs\7T\2\2st\7C\2\2"+
		"tu\7R\2\2uv\7J\2\2v\"\3\2\2\2wx\7\60\2\2x{\5%\23\2y{\5%\23\2zw\3\2\2\2"+
		"zy\3\2\2\2{$\3\2\2\2|}\7\62\2\2}&\3\2\2\2~\177\7$\2\2\177\u0080\7$\2\2"+
		"\u0080(\3\2\2\2\u0081\u0082\5+\26\2\u0082*\3\2\2\2\u0083\u0084\7c\2\2"+
		"\u0084,\3\2\2\2\u0085\u0086\7>\2\2\u0086\u0087\7@\2\2\u0087.\3\2\2\2\u0088"+
		"\u0089\7>\2\2\u0089\u008a\7@\2\2\u008a\60\3\2\2\2\u008b\u008c\7\61\2\2"+
		"\u008c\u008d\7,\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7,\2\2\u008f\u0090"+
		"\7\61\2\2\u0090\62\3\2\2\2\u0091\u0092\7\61\2\2\u0092\u0093\7\61\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\7\f\2\2\u0095\64\3\2\2\2\u0096\u0097\7%\2\2"+
		"\u0097\u0098\7\f\2\2\u0098\66\3\2\2\2\u0099\u009a\7\f\2\2\u009a8\3\2\2"+
		"\2\4\2z";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}