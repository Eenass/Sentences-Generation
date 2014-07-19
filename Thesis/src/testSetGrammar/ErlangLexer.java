// Generated from Erlang.g4 by ANTLR 4.1
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
public class ErlangLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__62=1, T__61=2, T__60=3, T__59=4, T__58=5, T__57=6, T__56=7, T__55=8, 
		T__54=9, T__53=10, T__52=11, T__51=12, T__50=13, T__49=14, T__48=15, T__47=16, 
		T__46=17, T__45=18, T__44=19, T__43=20, T__42=21, T__41=22, T__40=23, 
		T__39=24, T__38=25, T__37=26, T__36=27, T__35=28, T__34=29, T__33=30, 
		T__32=31, T__31=32, T__30=33, T__29=34, T__28=35, T__27=36, T__26=37, 
		T__25=38, T__24=39, T__23=40, T__22=41, T__21=42, T__20=43, T__19=44, 
		T__18=45, T__17=46, T__16=47, T__15=48, T__14=49, T__13=50, T__12=51, 
		T__11=52, T__10=53, T__9=54, T__8=55, T__7=56, T__6=57, T__5=58, T__4=59, 
		T__3=60, T__2=61, T__1=62, T__0=63, TokAtom=64, TokVar=65, TokFloat=66, 
		TokInteger=67, TokChar=68, TokString=69, AttrName=70, Comment=71, WS=72;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'bsr'", "'=<'", "'['", "'*'", "'or'", "'--'", "'<'", "'<='", "'<<'", 
		"'andalso'", "'=:='", "'band'", "'}'", "'after'", "'case'", "'->'", "'bnot'", 
		"'xor'", "')'", "':-'", "'orelse'", "'::'", "'='", "'bxor'", "'fun'", 
		"'div'", "'bor'", "'begin'", "'rem'", "'when'", "'|'", "'!'", "'..'", 
		"']'", "'of'", "','", "'receive'", "'-'", "'not'", "':'", "'('", "'if'", 
		"'=/='", "'try'", "'{'", "'...'", "'and'", "'catch'", "'<-'", "'++'", 
		"'>>'", "'.'", "'+'", "'bsl'", "';'", "'||'", "'>'", "'/='", "'/'", "'=='", 
		"'#'", "'>='", "'end'", "TokAtom", "TokVar", "TokFloat", "TokInteger", 
		"TokChar", "TokString", "AttrName", "Comment", "WS"
	};
	public static final String[] ruleNames = {
		"T__62", "T__61", "T__60", "T__59", "T__58", "T__57", "T__56", "T__55", 
		"T__54", "T__53", "T__52", "T__51", "T__50", "T__49", "T__48", "T__47", 
		"T__46", "T__45", "T__44", "T__43", "T__42", "T__41", "T__40", "T__39", 
		"T__38", "T__37", "T__36", "T__35", "T__34", "T__33", "T__32", "T__31", 
		"T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", "T__23", 
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "TokAtom", "TokVar", "TokFloat", 
		"TokInteger", "TokChar", "TokString", "AttrName", "Comment", "WS"
	};


	public ErlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Erlang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 70: Comment_action((RuleContext)_localctx, actionIndex); break;

		case 71: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void Comment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2J\u01ee\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\38\38\39\39\39\3:\3:\3;\3;\3;\3<\3<\3=\3=\3=\3>\3>\3?\3?\3?\3@\3@\3@"+
		"\3@\3A\3A\7A\u016e\nA\fA\16A\u0171\13A\3A\3A\3A\3A\5A\u0177\nA\3A\7A\u017a"+
		"\nA\fA\16A\u017d\13A\3A\5A\u0180\nA\3B\3B\7B\u0184\nB\fB\16B\u0187\13"+
		"B\3C\5C\u018a\nC\3C\6C\u018d\nC\rC\16C\u018e\3C\3C\6C\u0193\nC\rC\16C"+
		"\u0194\3C\3C\5C\u0199\nC\3C\6C\u019c\nC\rC\16C\u019d\5C\u01a0\nC\3D\5"+
		"D\u01a3\nD\3D\6D\u01a6\nD\rD\16D\u01a7\3D\3D\6D\u01ac\nD\rD\16D\u01ad"+
		"\5D\u01b0\nD\3E\3E\5E\u01b4\nE\3E\3E\3E\3E\3E\5E\u01bb\nE\3F\3F\3F\3F"+
		"\5F\u01c1\nF\3F\7F\u01c4\nF\fF\16F\u01c7\13F\3F\3F\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\5G\u01d8\nG\3H\3H\7H\u01dc\nH\fH\16H\u01df\13H\3H"+
		"\5H\u01e2\nH\3H\3H\3H\3H\3I\6I\u01e9\nI\rI\16I\u01ea\3I\3I\2J\3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1"+
		"/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$"+
		"\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63"+
		"\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s;\1u<\1w=\1y>\1{?\1}@\1\177A\1"+
		"\u0081B\1\u0083C\1\u0085D\1\u0087E\1\u0089F\1\u008bG\1\u008dH\1\u008f"+
		"I\2\u0091J\3\3\2\17\4\2BBc|\6\2\62;B\\aac|\3\2^^\4\2))^^\4\2C\\aa\6\2"+
		"\62;C\\aac|\3\2\62;\4\2GGgg\4\2--//\5\2\62;C\\c|\4\2\f\f\17\17\4\2$$^"+
		"^\5\2\13\f\17\17\"\"\u0206\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093"+
		"\3\2\2\2\5\u0097\3\2\2\2\7\u009a\3\2\2\2\t\u009c\3\2\2\2\13\u009e\3\2"+
		"\2\2\r\u00a1\3\2\2\2\17\u00a4\3\2\2\2\21\u00a6\3\2\2\2\23\u00a9\3\2\2"+
		"\2\25\u00ac\3\2\2\2\27\u00b4\3\2\2\2\31\u00b8\3\2\2\2\33\u00bd\3\2\2\2"+
		"\35\u00bf\3\2\2\2\37\u00c5\3\2\2\2!\u00ca\3\2\2\2#\u00cd\3\2\2\2%\u00d2"+
		"\3\2\2\2\'\u00d6\3\2\2\2)\u00d8\3\2\2\2+\u00db\3\2\2\2-\u00e2\3\2\2\2"+
		"/\u00e5\3\2\2\2\61\u00e7\3\2\2\2\63\u00ec\3\2\2\2\65\u00f0\3\2\2\2\67"+
		"\u00f4\3\2\2\29\u00f8\3\2\2\2;\u00fe\3\2\2\2=\u0102\3\2\2\2?\u0107\3\2"+
		"\2\2A\u0109\3\2\2\2C\u010b\3\2\2\2E\u010e\3\2\2\2G\u0110\3\2\2\2I\u0113"+
		"\3\2\2\2K\u0115\3\2\2\2M\u011d\3\2\2\2O\u011f\3\2\2\2Q\u0123\3\2\2\2S"+
		"\u0125\3\2\2\2U\u0127\3\2\2\2W\u012a\3\2\2\2Y\u012e\3\2\2\2[\u0132\3\2"+
		"\2\2]\u0134\3\2\2\2_\u0138\3\2\2\2a\u013c\3\2\2\2c\u0142\3\2\2\2e\u0145"+
		"\3\2\2\2g\u0148\3\2\2\2i\u014b\3\2\2\2k\u014d\3\2\2\2m\u014f\3\2\2\2o"+
		"\u0153\3\2\2\2q\u0155\3\2\2\2s\u0158\3\2\2\2u\u015a\3\2\2\2w\u015d\3\2"+
		"\2\2y\u015f\3\2\2\2{\u0162\3\2\2\2}\u0164\3\2\2\2\177\u0167\3\2\2\2\u0081"+
		"\u017f\3\2\2\2\u0083\u0181\3\2\2\2\u0085\u0189\3\2\2\2\u0087\u01a2\3\2"+
		"\2\2\u0089\u01b1\3\2\2\2\u008b\u01bc\3\2\2\2\u008d\u01ca\3\2\2\2\u008f"+
		"\u01d9\3\2\2\2\u0091\u01e8\3\2\2\2\u0093\u0094\7d\2\2\u0094\u0095\7u\2"+
		"\2\u0095\u0096\7t\2\2\u0096\4\3\2\2\2\u0097\u0098\7?\2\2\u0098\u0099\7"+
		">\2\2\u0099\6\3\2\2\2\u009a\u009b\7]\2\2\u009b\b\3\2\2\2\u009c\u009d\7"+
		",\2\2\u009d\n\3\2\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7t\2\2\u00a0\f\3"+
		"\2\2\2\u00a1\u00a2\7/\2\2\u00a2\u00a3\7/\2\2\u00a3\16\3\2\2\2\u00a4\u00a5"+
		"\7>\2\2\u00a5\20\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8\7?\2\2\u00a8\22"+
		"\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\u00ab\7>\2\2\u00ab\24\3\2\2\2\u00ac"+
		"\u00ad\7c\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7c\2\2"+
		"\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7q\2\2\u00b3\26\3\2"+
		"\2\2\u00b4\u00b5\7?\2\2\u00b5\u00b6\7<\2\2\u00b6\u00b7\7?\2\2\u00b7\30"+
		"\3\2\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"\u00bc\7f\2\2\u00bc\32\3\2\2\2\u00bd\u00be\7\177\2\2\u00be\34\3\2\2\2"+
		"\u00bf\u00c0\7c\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3"+
		"\7g\2\2\u00c3\u00c4\7t\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7"+
		"\7c\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7g\2\2\u00c9 \3\2\2\2\u00ca\u00cb"+
		"\7/\2\2\u00cb\u00cc\7@\2\2\u00cc\"\3\2\2\2\u00cd\u00ce\7d\2\2\u00ce\u00cf"+
		"\7p\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7v\2\2\u00d1$\3\2\2\2\u00d2\u00d3"+
		"\7z\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t\2\2\u00d5&\3\2\2\2\u00d6\u00d7"+
		"\7+\2\2\u00d7(\3\2\2\2\u00d8\u00d9\7<\2\2\u00d9\u00da\7/\2\2\u00da*\3"+
		"\2\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7n\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7g\2\2\u00e1,\3\2\2\2\u00e2"+
		"\u00e3\7<\2\2\u00e3\u00e4\7<\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7?\2\2\u00e6"+
		"\60\3\2\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9\7z\2\2\u00e9\u00ea\7q\2\2\u00ea"+
		"\u00eb\7t\2\2\u00eb\62\3\2\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee\7w\2\2\u00ee"+
		"\u00ef\7p\2\2\u00ef\64\3\2\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7k\2\2\u00f2"+
		"\u00f3\7x\2\2\u00f3\66\3\2\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7q\2\2\u00f6"+
		"\u00f7\7t\2\2\u00f78\3\2\2\2\u00f8\u00f9\7d\2\2\u00f9\u00fa\7g\2\2\u00fa"+
		"\u00fb\7i\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7p\2\2\u00fd:\3\2\2\2\u00fe"+
		"\u00ff\7t\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7o\2\2\u0101<\3\2\2\2\u0102"+
		"\u0103\7y\2\2\u0103\u0104\7j\2\2\u0104\u0105\7g\2\2\u0105\u0106\7p\2\2"+
		"\u0106>\3\2\2\2\u0107\u0108\7~\2\2\u0108@\3\2\2\2\u0109\u010a\7#\2\2\u010a"+
		"B\3\2\2\2\u010b\u010c\7\60\2\2\u010c\u010d\7\60\2\2\u010dD\3\2\2\2\u010e"+
		"\u010f\7_\2\2\u010fF\3\2\2\2\u0110\u0111\7q\2\2\u0111\u0112\7h\2\2\u0112"+
		"H\3\2\2\2\u0113\u0114\7.\2\2\u0114J\3\2\2\2\u0115\u0116\7t\2\2\u0116\u0117"+
		"\7g\2\2\u0117\u0118\7e\2\2\u0118\u0119\7g\2\2\u0119\u011a\7k\2\2\u011a"+
		"\u011b\7x\2\2\u011b\u011c\7g\2\2\u011cL\3\2\2\2\u011d\u011e\7/\2\2\u011e"+
		"N\3\2\2\2\u011f\u0120\7p\2\2\u0120\u0121\7q\2\2\u0121\u0122\7v\2\2\u0122"+
		"P\3\2\2\2\u0123\u0124\7<\2\2\u0124R\3\2\2\2\u0125\u0126\7*\2\2\u0126T"+
		"\3\2\2\2\u0127\u0128\7k\2\2\u0128\u0129\7h\2\2\u0129V\3\2\2\2\u012a\u012b"+
		"\7?\2\2\u012b\u012c\7\61\2\2\u012c\u012d\7?\2\2\u012dX\3\2\2\2\u012e\u012f"+
		"\7v\2\2\u012f\u0130\7t\2\2\u0130\u0131\7{\2\2\u0131Z\3\2\2\2\u0132\u0133"+
		"\7}\2\2\u0133\\\3\2\2\2\u0134\u0135\7\60\2\2\u0135\u0136\7\60\2\2\u0136"+
		"\u0137\7\60\2\2\u0137^\3\2\2\2\u0138\u0139\7c\2\2\u0139\u013a\7p\2\2\u013a"+
		"\u013b\7f\2\2\u013b`\3\2\2\2\u013c\u013d\7e\2\2\u013d\u013e\7c\2\2\u013e"+
		"\u013f\7v\2\2\u013f\u0140\7e\2\2\u0140\u0141\7j\2\2\u0141b\3\2\2\2\u0142"+
		"\u0143\7>\2\2\u0143\u0144\7/\2\2\u0144d\3\2\2\2\u0145\u0146\7-\2\2\u0146"+
		"\u0147\7-\2\2\u0147f\3\2\2\2\u0148\u0149\7@\2\2\u0149\u014a\7@\2\2\u014a"+
		"h\3\2\2\2\u014b\u014c\7\60\2\2\u014cj\3\2\2\2\u014d\u014e\7-\2\2\u014e"+
		"l\3\2\2\2\u014f\u0150\7d\2\2\u0150\u0151\7u\2\2\u0151\u0152\7n\2\2\u0152"+
		"n\3\2\2\2\u0153\u0154\7=\2\2\u0154p\3\2\2\2\u0155\u0156\7~\2\2\u0156\u0157"+
		"\7~\2\2\u0157r\3\2\2\2\u0158\u0159\7@\2\2\u0159t\3\2\2\2\u015a\u015b\7"+
		"\61\2\2\u015b\u015c\7?\2\2\u015cv\3\2\2\2\u015d\u015e\7\61\2\2\u015ex"+
		"\3\2\2\2\u015f\u0160\7?\2\2\u0160\u0161\7?\2\2\u0161z\3\2\2\2\u0162\u0163"+
		"\7%\2\2\u0163|\3\2\2\2\u0164\u0165\7@\2\2\u0165\u0166\7?\2\2\u0166~\3"+
		"\2\2\2\u0167\u0168\7g\2\2\u0168\u0169\7p\2\2\u0169\u016a\7f\2\2\u016a"+
		"\u0080\3\2\2\2\u016b\u016f\t\2\2\2\u016c\u016e\t\3\2\2\u016d\u016c\3\2"+
		"\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0180\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u017b\7)\2\2\u0173\u0176\7^\2"+
		"\2\u0174\u0177\n\4\2\2\u0175\u0177\7^\2\2\u0176\u0174\3\2\2\2\u0176\u0175"+
		"\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u017a\n\5\2\2\u0179\u0173\3\2\2\2\u0179"+
		"\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180\7)\2\2\u017f"+
		"\u016b\3\2\2\2\u017f\u0172\3\2\2\2\u0180\u0082\3\2\2\2\u0181\u0185\t\6"+
		"\2\2\u0182\u0184\t\7\2\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0084\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0188\u018a\7/\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018c\3\2\2\2\u018b\u018d\t\b\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0192\7\60\2\2\u0191\u0193\t\b\2\2\u0192\u0191\3\2\2\2\u0193\u0194\3"+
		"\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u019f\3\2\2\2\u0196"+
		"\u0198\t\t\2\2\u0197\u0199\t\n\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\u019b\3\2\2\2\u019a\u019c\t\b\2\2\u019b\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2"+
		"\2\2\u019f\u0196\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u0086\3\2\2\2\u01a1"+
		"\u01a3\7/\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2"+
		"\2\2\u01a4\u01a6\t\b\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01af\3\2\2\2\u01a9\u01ab\7%"+
		"\2\2\u01aa\u01ac\t\13\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01a9\3\2"+
		"\2\2\u01af\u01b0\3\2\2\2\u01b0\u0088\3\2\2\2\u01b1\u01ba\7&\2\2\u01b2"+
		"\u01b4\7^\2\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\u01bb\n\f\2\2\u01b6\u01b7\7^\2\2\u01b7\u01b8\t\b\2\2\u01b8"+
		"\u01b9\t\b\2\2\u01b9\u01bb\t\b\2\2\u01ba\u01b3\3\2\2\2\u01ba\u01b6\3\2"+
		"\2\2\u01bb\u008a\3\2\2\2\u01bc\u01c5\7$\2\2\u01bd\u01c0\7^\2\2\u01be\u01c1"+
		"\n\4\2\2\u01bf\u01c1\7^\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c4\n\r\2\2\u01c3\u01bd\3\2\2\2\u01c3\u01c2\3\2"+
		"\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7$\2\2\u01c9\u008c\3\2"+
		"\2\2\u01ca\u01d7\7/\2\2\u01cb\u01cc\7u\2\2\u01cc\u01cd\7r\2\2\u01cd\u01ce"+
		"\7g\2\2\u01ce\u01d8\7e\2\2\u01cf\u01d0\7e\2\2\u01d0\u01d1\7c\2\2\u01d1"+
		"\u01d2\7n\2\2\u01d2\u01d3\7n\2\2\u01d3\u01d4\7d\2\2\u01d4\u01d5\7c\2\2"+
		"\u01d5\u01d6\7e\2\2\u01d6\u01d8\7m\2\2\u01d7\u01cb\3\2\2\2\u01d7\u01cf"+
		"\3\2\2\2\u01d8\u008e\3\2\2\2\u01d9\u01dd\7\'\2\2\u01da\u01dc\n\f\2\2\u01db"+
		"\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e2\7\17\2\2\u01e1"+
		"\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7\f"+
		"\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\bH\2\2\u01e6\u0090\3\2\2\2\u01e7"+
		"\u01e9\t\16\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3"+
		"\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\bI\3\2\u01ed"+
		"\u0092\3\2\2\2\34\2\u016f\u0176\u0179\u017b\u017f\u0185\u0189\u018e\u0194"+
		"\u0198\u019d\u019f\u01a2\u01a7\u01ad\u01af\u01b3\u01ba\u01c0\u01c3\u01c5"+
		"\u01d7\u01dd\u01e1\u01ea";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}