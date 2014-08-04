// Generated from ExtractedClojure.g4 by ANTLR 4.1
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
public class ExtractedClojureLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, STRING=18, NUMBER=19, CHARACTER=20, NIL=21, BOOLEAN=22, KEYWORD=23, 
		SYMBOL=24, PARAM_NAME=25, NAME=26, SYMBOL_HEAD=27, SYMBOL_REST=28, WS=29, 
		COMMENT=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'^'", "'&'", "')'", "'`'", "'['", "'('", "'@'", "'#''", "'~@'", 
		"'#^'", "'''", "'{'", "'#('", "'~'", "'}'", "'#'", "STRING", "'0'", "CHARACTER", 
		"'nil'", "BOOLEAN", "KEYWORD", "SYMBOL", "'%'", "NAME", "SYMBOL_HEAD", 
		"SYMBOL_REST", "'\n'", "';'"
	};
	public static final String[] ruleNames = {
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"STRING", "NUMBER", "CHARACTER", "NIL", "BOOLEAN", "KEYWORD", "SYMBOL", 
		"PARAM_NAME", "NAME", "SYMBOL_HEAD", "SYMBOL_REST", "WS", "COMMENT"
	};


	public ExtractedClojureLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExtractedClojure.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2 \u0091\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27{\n\27\3\30\3\30"+
		"\3\30\3\31\3\31\5\31\u0082\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\5\35\u008c\n\35\3\36\3\36\3\37\3\37\2 \3\3\1\5\4\1\7\5\1\t\6\1\13\7\1"+
		"\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1"+
		"\65\34\1\67\35\19\36\1;\37\1= \1\3\2\4\n\2##&&,-//>ACCaacc\5\2((\60\60"+
		"\62\62\u0093\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE\3\2\2"+
		"\2\13G\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25R\3\2"+
		"\2\2\27U\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35\\\3\2\2\2\37_\3\2\2\2!a\3"+
		"\2\2\2#c\3\2\2\2%e\3\2\2\2\'h\3\2\2\2)j\3\2\2\2+m\3\2\2\2-z\3\2\2\2/|"+
		"\3\2\2\2\61\u0081\3\2\2\2\63\u0083\3\2\2\2\65\u0085\3\2\2\2\67\u0087\3"+
		"\2\2\29\u008b\3\2\2\2;\u008d\3\2\2\2=\u008f\3\2\2\2?@\7_\2\2@\4\3\2\2"+
		"\2AB\7`\2\2B\6\3\2\2\2CD\7(\2\2D\b\3\2\2\2EF\7+\2\2F\n\3\2\2\2GH\7b\2"+
		"\2H\f\3\2\2\2IJ\7]\2\2J\16\3\2\2\2KL\7*\2\2L\20\3\2\2\2MN\7B\2\2N\22\3"+
		"\2\2\2OP\7%\2\2PQ\7)\2\2Q\24\3\2\2\2RS\7\u0080\2\2ST\7B\2\2T\26\3\2\2"+
		"\2UV\7%\2\2VW\7`\2\2W\30\3\2\2\2XY\7)\2\2Y\32\3\2\2\2Z[\7}\2\2[\34\3\2"+
		"\2\2\\]\7%\2\2]^\7*\2\2^\36\3\2\2\2_`\7\u0080\2\2` \3\2\2\2ab\7\177\2"+
		"\2b\"\3\2\2\2cd\7%\2\2d$\3\2\2\2ef\7$\2\2fg\7$\2\2g&\3\2\2\2hi\7\62\2"+
		"\2i(\3\2\2\2jk\7^\2\2kl\13\2\2\2l*\3\2\2\2mn\7p\2\2no\7k\2\2op\7n\2\2"+
		"p,\3\2\2\2qr\7v\2\2rs\7t\2\2st\7w\2\2t{\7g\2\2uv\7h\2\2vw\7c\2\2wx\7n"+
		"\2\2xy\7u\2\2y{\7g\2\2zq\3\2\2\2zu\3\2\2\2{.\3\2\2\2|}\7<\2\2}~\5\61\31"+
		"\2~\60\3\2\2\2\177\u0082\4\60\61\2\u0080\u0082\5\65\33\2\u0081\177\3\2"+
		"\2\2\u0081\u0080\3\2\2\2\u0082\62\3\2\2\2\u0083\u0084\7\'\2\2\u0084\64"+
		"\3\2\2\2\u0085\u0086\5\67\34\2\u0086\66\3\2\2\2\u0087\u0088\t\2\2\2\u0088"+
		"8\3\2\2\2\u0089\u008c\5\67\34\2\u008a\u008c\t\3\2\2\u008b\u0089\3\2\2"+
		"\2\u008b\u008a\3\2\2\2\u008c:\3\2\2\2\u008d\u008e\7\f\2\2\u008e<\3\2\2"+
		"\2\u008f\u0090\7=\2\2\u0090>\3\2\2\2\6\2z\u0081\u008b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}