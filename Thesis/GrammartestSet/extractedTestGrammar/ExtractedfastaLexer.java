// Generated from Extractedfasta.g4 by ANTLR 4.1
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
public class ExtractedfastaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENTLINE=1, DESCRIPTIONLINE=2, TEXT=3, EOL=4, DIGIT=5, LETTER=6, SYMBOL=7, 
		SEQUENCELINE=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COMMENTLINE", "DESCRIPTIONLINE", "TEXT", "'\n'", "'0'", "'A'", "SYMBOL", 
		"SEQUENCELINE"
	};
	public static final String[] ruleNames = {
		"COMMENTLINE", "DESCRIPTIONLINE", "TEXT", "EOL", "DIGIT", "LETTER", "SYMBOL", 
		"SEQUENCELINE"
	};


	public ExtractedfastaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Extractedfasta.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\n*\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\5\4\36\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\2\n\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\3\2"+
		"\3\t\2\"\"(+-\61<<]]__aa+\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5"+
		"\26\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13!\3\2\2\2\r#\3\2\2\2\17%\3\2\2"+
		"\2\21\'\3\2\2\2\23\24\7=\2\2\24\25\5\t\5\2\25\4\3\2\2\2\26\27\7@\2\2\27"+
		"\30\5\7\4\2\30\31\5\t\5\2\31\6\3\2\2\2\32\36\5\13\6\2\33\36\5\r\7\2\34"+
		"\36\5\17\b\2\35\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\b\3\2\2\2\37"+
		" \7\f\2\2 \n\3\2\2\2!\"\7\62\2\2\"\f\3\2\2\2#$\7C\2\2$\16\3\2\2\2%&\t"+
		"\2\2\2&\20\3\2\2\2\'(\5\r\7\2()\5\t\5\2)\22\3\2\2\2\4\2\35";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}