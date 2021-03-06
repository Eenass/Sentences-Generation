// Generated from Extractedbnf.g4 by ANTLR 4.1
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
public class ExtractedbnfLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, ASSIGN=2, LPAREN=3, RPAREN=4, LBRACE=5, RBRACE=6, LEND=7, REND=8, 
		BAR=9, CAPTEXT=10, TEXT=11, STRINGLITERAL=12, UPPERCASE_LETTER=13, LOWERCASE_LETTER=14, 
		DIGIT=15, SYMBOL=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ID", "'::='", "')'", "'('", "'}'", "'{'", "']'", "'['", "'|'", "CAPTEXT", 
		"TEXT", "STRINGLITERAL", "'A'", "'a'", "'0'", "SYMBOL", "'\n'"
	};
	public static final String[] ruleNames = {
		"ID", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LEND", "REND", 
		"BAR", "CAPTEXT", "TEXT", "STRINGLITERAL", "UPPERCASE_LETTER", "LOWERCASE_LETTER", 
		"DIGIT", "SYMBOL", "WS"
	};


	public ExtractedbnfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Extractedbnf.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\23P\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\fB\n\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\2\23\3\3\1\5\4\1\7\5\1\t"+
		"\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1"+
		"\35\20\1\37\21\1!\22\1#\23\1\3\2\3\13\2##,,<<``\u00a3\u00a3\u0154\u0154"+
		"\u2015\u2015\u2192\u2192\u2202\u2202R\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5(\3\2\2\2\7,\3\2"+
		"\2\2\t.\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\64\3\2\2\2\21\66\3\2\2\2"+
		"\238\3\2\2\2\25:\3\2\2\2\27A\3\2\2\2\31C\3\2\2\2\33F\3\2\2\2\35H\3\2\2"+
		"\2\37J\3\2\2\2!L\3\2\2\2#N\3\2\2\2%&\7>\2\2&\'\7@\2\2\'\4\3\2\2\2()\7"+
		"<\2\2)*\7<\2\2*+\7?\2\2+\6\3\2\2\2,-\7+\2\2-\b\3\2\2\2./\7*\2\2/\n\3\2"+
		"\2\2\60\61\7\177\2\2\61\f\3\2\2\2\62\63\7}\2\2\63\16\3\2\2\2\64\65\7_"+
		"\2\2\65\20\3\2\2\2\66\67\7]\2\2\67\22\3\2\2\289\7~\2\29\24\3\2\2\2:;\5"+
		"\33\16\2;<\5\27\f\2<\26\3\2\2\2=B\5\33\16\2>B\5\35\17\2?B\5\37\20\2@B"+
		"\5!\21\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\30\3\2\2\2CD\7$\2\2"+
		"DE\7$\2\2E\32\3\2\2\2FG\7C\2\2G\34\3\2\2\2HI\7c\2\2I\36\3\2\2\2JK\7\62"+
		"\2\2K \3\2\2\2LM\t\2\2\2M\"\3\2\2\2NO\7\f\2\2O$\3\2\2\2\4\2A";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}