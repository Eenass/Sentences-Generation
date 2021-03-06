// Generated from fasta.g4 by ANTLR 4.1
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
public class fastaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENTLINE=1, DESCRIPTIONLINE=2, TEXT=3, EOL=4, SEQUENCELINE=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COMMENTLINE", "DESCRIPTIONLINE", "TEXT", "EOL", "SEQUENCELINE"
	};
	public static final String[] ruleNames = {
		"COMMENTLINE", "DESCRIPTIONLINE", "TEXT", "EOL", "DIGIT", "LETTER", "SYMBOL", 
		"SEQUENCELINE"
	};


	public fastaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fasta.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\7@\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3"+
		"\3\3\3\3\3\4\3\4\3\4\6\4+\n\4\r\4\16\4,\3\5\5\5\60\n\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\6\t;\n\t\r\t\16\t<\3\t\3\t\3\27\n\3\3\1\5\4\1\7\5"+
		"\1\t\6\1\13\2\1\r\2\1\17\2\1\21\7\1\3\2\5\3\2\62;\4\2C\\c|\t\2\"\"(+-"+
		"\61<<]]__aaC\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\21\3\2"+
		"\2\2\3\23\3\2\2\2\5\34\3\2\2\2\7*\3\2\2\2\t/\3\2\2\2\13\63\3\2\2\2\r\65"+
		"\3\2\2\2\17\67\3\2\2\2\21:\3\2\2\2\23\27\7=\2\2\24\26\13\2\2\2\25\24\3"+
		"\2\2\2\26\31\3\2\2\2\27\30\3\2\2\2\27\25\3\2\2\2\30\32\3\2\2\2\31\27\3"+
		"\2\2\2\32\33\5\t\5\2\33\4\3\2\2\2\34\35\7@\2\2\35\"\5\7\4\2\36\37\7~\2"+
		"\2\37!\5\7\4\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$"+
		"\"\3\2\2\2%&\5\t\5\2&\6\3\2\2\2\'+\5\13\6\2(+\5\r\7\2)+\5\17\b\2*\'\3"+
		"\2\2\2*(\3\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\b\3\2\2\2.\60"+
		"\7\17\2\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\f\2\2\62\n\3\2\2"+
		"\2\63\64\t\2\2\2\64\f\3\2\2\2\65\66\t\3\2\2\66\16\3\2\2\2\678\t\4\2\2"+
		"8\20\3\2\2\29;\5\r\7\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2"+
		"\2>?\5\t\5\2?\22\3\2\2\2\t\2\27\"*,/<";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}