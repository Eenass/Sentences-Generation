// Generated from gff3.g4 by ANTLR 4.1
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
public class gff3Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, COMMENTLINE=5, EOL=6, TEXT=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'\t'", "'##gff-version 3\n'", "'='", "';'", "COMMENTLINE", "EOL", "TEXT"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "COMMENTLINE", "EOL", "TEXT", "CHAR", 
		"DIGIT", "SYMBOL"
	};


	public gff3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gff3.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\tI\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6\61\n\6\f\6\16\6\64\13\6\3\6\3\6"+
		"\3\7\5\79\n\7\3\7\3\7\3\b\3\b\3\b\6\b@\n\b\r\b\16\bA\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\62\f\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\2\1\23"+
		"\2\1\25\2\1\3\2\5\4\2C\\c|\3\2\62;\t\2\"#&\',\60<<AB`a~~J\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7*\3\2\2\2\t,\3\2\2\2\13.\3\2\2\2\r8\3"+
		"\2\2\2\17?\3\2\2\2\21C\3\2\2\2\23E\3\2\2\2\25G\3\2\2\2\27\30\7\13\2\2"+
		"\30\4\3\2\2\2\31\32\7%\2\2\32\33\7%\2\2\33\34\7i\2\2\34\35\7h\2\2\35\36"+
		"\7h\2\2\36\37\7/\2\2\37 \7x\2\2 !\7g\2\2!\"\7t\2\2\"#\7u\2\2#$\7k\2\2"+
		"$%\7q\2\2%&\7p\2\2&\'\7\"\2\2\'(\7\65\2\2()\7\f\2\2)\6\3\2\2\2*+\7?\2"+
		"\2+\b\3\2\2\2,-\7=\2\2-\n\3\2\2\2.\62\7%\2\2/\61\13\2\2\2\60/\3\2\2\2"+
		"\61\64\3\2\2\2\62\63\3\2\2\2\62\60\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2"+
		"\65\66\5\r\7\2\66\f\3\2\2\2\679\7\17\2\28\67\3\2\2\289\3\2\2\29:\3\2\2"+
		"\2:;\7\f\2\2;\16\3\2\2\2<@\5\21\t\2=@\5\25\13\2>@\5\23\n\2?<\3\2\2\2?"+
		"=\3\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\20\3\2\2\2CD\t\2\2"+
		"\2D\22\3\2\2\2EF\t\3\2\2F\24\3\2\2\2GH\t\4\2\2H\26\3\2\2\2\7\2\628?A";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}