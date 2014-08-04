// Generated from ExtractedPGN.g4 by ANTLR 4.1
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
public class ExtractedPGNLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITE_WINS=1, BLACK_WINS=2, DRAWN_GAME=3, REST_OF_LINE_COMMENT=4, BRACE_COMMENT=5, 
		ESCAPE=6, SPACES=7, STRING=8, INTEGER=9, PERIOD=10, ASTERISK=11, LEFT_BRACKET=12, 
		RIGHT_BRACKET=13, LEFT_PARENTHESIS=14, RIGHT_PARENTHESIS=15, LEFT_ANGLE_BRACKET=16, 
		RIGHT_ANGLE_BRACKET=17, NUMERIC_ANNOTATION_GLYPH=18, SYMBOL=19, SUFFIX_ANNOTATION=20, 
		UNEXPECTED_CHAR=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'1-0'", "'0-1'", "'1/2-1/2'", "';'", "BRACE_COMMENT", "'%'", "'\n'", 
		"STRING", "'0'", "'.'", "'*'", "'['", "']'", "'('", "')'", "'<'", "'>'", 
		"NUMERIC_ANNOTATION_GLYPH", "'a'", "'?'", "UNEXPECTED_CHAR"
	};
	public static final String[] ruleNames = {
		"WHITE_WINS", "BLACK_WINS", "DRAWN_GAME", "REST_OF_LINE_COMMENT", "BRACE_COMMENT", 
		"ESCAPE", "SPACES", "STRING", "INTEGER", "PERIOD", "ASTERISK", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_ANGLE_BRACKET", 
		"RIGHT_ANGLE_BRACKET", "NUMERIC_ANNOTATION_GLYPH", "SYMBOL", "SUFFIX_ANNOTATION", 
		"UNEXPECTED_CHAR"
	};


	public ExtractedPGNLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExtractedPGN.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\27d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\2\27\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f"+
		"\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26"+
		"\1+\27\1\3\2\2c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2"+
		"\2\2\5\61\3\2\2\2\7\65\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rB\3\2\2\2\17D\3"+
		"\2\2\2\21F\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2\33"+
		"Q\3\2\2\2\35S\3\2\2\2\37U\3\2\2\2!W\3\2\2\2#Y\3\2\2\2%[\3\2\2\2\'^\3\2"+
		"\2\2)`\3\2\2\2+b\3\2\2\2-.\7\63\2\2./\7/\2\2/\60\7\62\2\2\60\4\3\2\2\2"+
		"\61\62\7\62\2\2\62\63\7/\2\2\63\64\7\63\2\2\64\6\3\2\2\2\65\66\7\63\2"+
		"\2\66\67\7\61\2\2\678\7\64\2\289\7/\2\29:\7\63\2\2:;\7\61\2\2;<\7\64\2"+
		"\2<\b\3\2\2\2=>\7=\2\2>\n\3\2\2\2?@\7}\2\2@A\7\177\2\2A\f\3\2\2\2BC\7"+
		"\'\2\2C\16\3\2\2\2DE\7\f\2\2E\20\3\2\2\2FG\7$\2\2GH\7$\2\2H\22\3\2\2\2"+
		"IJ\7\62\2\2J\24\3\2\2\2KL\7\60\2\2L\26\3\2\2\2MN\7,\2\2N\30\3\2\2\2OP"+
		"\7]\2\2P\32\3\2\2\2QR\7_\2\2R\34\3\2\2\2ST\7*\2\2T\36\3\2\2\2UV\7+\2\2"+
		"V \3\2\2\2WX\7>\2\2X\"\3\2\2\2YZ\7@\2\2Z$\3\2\2\2[\\\7&\2\2\\]\7\62\2"+
		"\2]&\3\2\2\2^_\7c\2\2_(\3\2\2\2`a\7A\2\2a*\3\2\2\2bc\13\2\2\2c,\3\2\2"+
		"\2\3\2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}