// Generated from ExtractedAbnf.g4 by ANTLR 4.1
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
public class ExtractedAbnfLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, NumberValue=9, 
		BinaryValue=10, DecimalValue=11, HexValue=12, ProseValue=13, ID=14, INT=15, 
		COMMENT=16, WS=17, STRING=18, BIT=19, DIGIT=20, HEX_DIGIT=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'=/'", "')'", "'*'", "'['", "'('", "'/'", "'='", "NumberValue", 
		"BinaryValue", "DecimalValue", "HexValue", "ProseValue", "ID", "INT", 
		"COMMENT", "WS", "STRING", "BIT", "DIGIT", "HEX_DIGIT"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NumberValue", 
		"BinaryValue", "DecimalValue", "HexValue", "ProseValue", "ID", "INT", 
		"COMMENT", "WS", "STRING", "BIT", "DIGIT", "HEX_DIGIT"
	};


	public ExtractedAbnfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExtractedAbnf.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\27b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\nC\n\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\2"+
		"\27\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1"+
		"+\27\1\3\2\5\4\2CCcc\5\2\13\f\17\17\"\"\5\2\62\62CCccc\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\62\3\2\2\2\t"+
		"\64\3\2\2\2\13\66\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2"+
		"\2\25D\3\2\2\2\27G\3\2\2\2\31J\3\2\2\2\33M\3\2\2\2\35P\3\2\2\2\37R\3\2"+
		"\2\2!T\3\2\2\2#W\3\2\2\2%Y\3\2\2\2\'\\\3\2\2\2)^\3\2\2\2+`\3\2\2\2-.\7"+
		"_\2\2.\4\3\2\2\2/\60\7?\2\2\60\61\7\61\2\2\61\6\3\2\2\2\62\63\7+\2\2\63"+
		"\b\3\2\2\2\64\65\7,\2\2\65\n\3\2\2\2\66\67\7]\2\2\67\f\3\2\2\289\7*\2"+
		"\29\16\3\2\2\2:;\7\61\2\2;\20\3\2\2\2<=\7?\2\2=\22\3\2\2\2>B\7\'\2\2?"+
		"C\5\25\13\2@C\5\27\f\2AC\5\31\r\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\24\3"+
		"\2\2\2DE\7d\2\2EF\5\'\24\2F\26\3\2\2\2GH\7f\2\2HI\5)\25\2I\30\3\2\2\2"+
		"JK\7z\2\2KL\5+\26\2L\32\3\2\2\2MN\7>\2\2NO\7@\2\2O\34\3\2\2\2PQ\t\2\2"+
		"\2Q\36\3\2\2\2RS\7\62\2\2S \3\2\2\2TU\7=\2\2UV\7\f\2\2V\"\3\2\2\2WX\t"+
		"\3\2\2X$\3\2\2\2YZ\7$\2\2Z[\7$\2\2[&\3\2\2\2\\]\7\62\2\2](\3\2\2\2^_\7"+
		"\62\2\2_*\3\2\2\2`a\t\4\2\2a,\3\2\2\2\4\2B";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}