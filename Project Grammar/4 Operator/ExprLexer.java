// Generated from Expr.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, Identifier=37, INT=38, 
		CHAR=39, UNSG=40, FLOAT=41, DOUBLE=42, Whitespace=43, Newline=44, BlockComment=45, 
		LineComment=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "Identifier", "IdentifierNondigit", "Nondigit", 
		"Digit", "INT", "CHAR", "UNSG", "FLOAT", "DOUBLE", "Whitespace", "Newline", 
		"BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "','", "'int'", "'float'", "'bool'", "'double'", "'char'", 
		"'&'", "'|'", "'^'", "'<<'", "'>>'", "'~'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'++'", "'--'", "'+1'", "'-1'", "'=='", "'!='", "'>'", "'<'", "'>='", 
		"'<='", "'||'", "'&&'", "'!'", "'('", "')'", "'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Identifier", "INT", "CHAR", "UNSG", "FLOAT", "DOUBLE", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u0125\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3&\7&\u00ce\n&\f&\16&\u00d1\13&\3\'\3\'\3(\3(\3)\3)\3*\6"+
		"*\u00da\n*\r*\16*\u00db\3+\3+\3+\3+\3,\6,\u00e3\n,\r,\16,\u00e4\3-\6-"+
		"\u00e8\n-\r-\16-\u00e9\3-\3-\6-\u00ee\n-\r-\16-\u00ef\3.\6.\u00f3\n.\r"+
		".\16.\u00f4\3.\3.\6.\u00f9\n.\r.\16.\u00fa\3/\6/\u00fe\n/\r/\16/\u00ff"+
		"\3/\3/\3\60\3\60\5\60\u0106\n\60\3\60\5\60\u0109\n\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\7\61\u0111\n\61\f\61\16\61\u0114\13\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\7\62\u011f\n\62\f\62\16\62\u0122\13\62\3"+
		"\62\3\62\3\u0112\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q\2S(U)W*Y+[,]-_.a/c\60\3"+
		"\2\6\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\u012e\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2"+
		"\2\2\tk\3\2\2\2\13o\3\2\2\2\ru\3\2\2\2\17z\3\2\2\2\21\u0081\3\2\2\2\23"+
		"\u0086\3\2\2\2\25\u0088\3\2\2\2\27\u008a\3\2\2\2\31\u008c\3\2\2\2\33\u008f"+
		"\3\2\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0096\3\2\2\2#\u0098\3\2\2"+
		"\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2+\u00a1\3\2\2\2-\u00a4"+
		"\3\2\2\2/\u00a7\3\2\2\2\61\u00aa\3\2\2\2\63\u00ad\3\2\2\2\65\u00b0\3\2"+
		"\2\2\67\u00b2\3\2\2\29\u00b4\3\2\2\2;\u00b7\3\2\2\2=\u00ba\3\2\2\2?\u00bd"+
		"\3\2\2\2A\u00c0\3\2\2\2C\u00c2\3\2\2\2E\u00c4\3\2\2\2G\u00c6\3\2\2\2I"+
		"\u00c8\3\2\2\2K\u00ca\3\2\2\2M\u00d2\3\2\2\2O\u00d4\3\2\2\2Q\u00d6\3\2"+
		"\2\2S\u00d9\3\2\2\2U\u00dd\3\2\2\2W\u00e2\3\2\2\2Y\u00e7\3\2\2\2[\u00f2"+
		"\3\2\2\2]\u00fd\3\2\2\2_\u0108\3\2\2\2a\u010c\3\2\2\2c\u011a\3\2\2\2e"+
		"f\7=\2\2f\4\3\2\2\2gh\7?\2\2h\6\3\2\2\2ij\7.\2\2j\b\3\2\2\2kl\7k\2\2l"+
		"m\7p\2\2mn\7v\2\2n\n\3\2\2\2op\7h\2\2pq\7n\2\2qr\7q\2\2rs\7c\2\2st\7v"+
		"\2\2t\f\3\2\2\2uv\7d\2\2vw\7q\2\2wx\7q\2\2xy\7n\2\2y\16\3\2\2\2z{\7f\2"+
		"\2{|\7q\2\2|}\7w\2\2}~\7d\2\2~\177\7n\2\2\177\u0080\7g\2\2\u0080\20\3"+
		"\2\2\2\u0081\u0082\7e\2\2\u0082\u0083\7j\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7t\2\2\u0085\22\3\2\2\2\u0086\u0087\7(\2\2\u0087\24\3\2\2\2\u0088"+
		"\u0089\7~\2\2\u0089\26\3\2\2\2\u008a\u008b\7`\2\2\u008b\30\3\2\2\2\u008c"+
		"\u008d\7>\2\2\u008d\u008e\7>\2\2\u008e\32\3\2\2\2\u008f\u0090\7@\2\2\u0090"+
		"\u0091\7@\2\2\u0091\34\3\2\2\2\u0092\u0093\7\u0080\2\2\u0093\36\3\2\2"+
		"\2\u0094\u0095\7-\2\2\u0095 \3\2\2\2\u0096\u0097\7/\2\2\u0097\"\3\2\2"+
		"\2\u0098\u0099\7,\2\2\u0099$\3\2\2\2\u009a\u009b\7\61\2\2\u009b&\3\2\2"+
		"\2\u009c\u009d\7\'\2\2\u009d(\3\2\2\2\u009e\u009f\7-\2\2\u009f\u00a0\7"+
		"-\2\2\u00a0*\3\2\2\2\u00a1\u00a2\7/\2\2\u00a2\u00a3\7/\2\2\u00a3,\3\2"+
		"\2\2\u00a4\u00a5\7-\2\2\u00a5\u00a6\7\63\2\2\u00a6.\3\2\2\2\u00a7\u00a8"+
		"\7/\2\2\u00a8\u00a9\7\63\2\2\u00a9\60\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab"+
		"\u00ac\7?\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\7?\2\2\u00af"+
		"\64\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1\66\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3"+
		"8\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\u00b6\7?\2\2\u00b6:\3\2\2\2\u00b7\u00b8"+
		"\7>\2\2\u00b8\u00b9\7?\2\2\u00b9<\3\2\2\2\u00ba\u00bb\7~\2\2\u00bb\u00bc"+
		"\7~\2\2\u00bc>\3\2\2\2\u00bd\u00be\7(\2\2\u00be\u00bf\7(\2\2\u00bf@\3"+
		"\2\2\2\u00c0\u00c1\7#\2\2\u00c1B\3\2\2\2\u00c2\u00c3\7*\2\2\u00c3D\3\2"+
		"\2\2\u00c4\u00c5\7+\2\2\u00c5F\3\2\2\2\u00c6\u00c7\7A\2\2\u00c7H\3\2\2"+
		"\2\u00c8\u00c9\7<\2\2\u00c9J\3\2\2\2\u00ca\u00cf\5M\'\2\u00cb\u00ce\5"+
		"M\'\2\u00cc\u00ce\5Q)\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0L\3\2\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d2\u00d3\5O(\2\u00d3N\3\2\2\2\u00d4\u00d5\t\2"+
		"\2\2\u00d5P\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7R\3\2\2\2\u00d8\u00da\t\3"+
		"\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dcT\3\2\2\2\u00dd\u00de\7)\2\2\u00de\u00df\13\2\2\2"+
		"\u00df\u00e0\7)\2\2\u00e0V\3\2\2\2\u00e1\u00e3\t\3\2\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"X\3\2\2\2\u00e6\u00e8\5S*\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\7\60"+
		"\2\2\u00ec\u00ee\5S*\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0Z\3\2\2\2\u00f1\u00f3\5S*\2\u00f2\u00f1"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f8\7\60\2\2\u00f7\u00f9\5S*\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\\\3\2\2\2\u00fc\u00fe\t\4\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\b/\2\2\u0102^\3\2\2\2\u0103\u0105\7\17\2\2\u0104\u0106\7\f\2\2\u0105"+
		"\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0109\7\f"+
		"\2\2\u0108\u0103\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\b\60\2\2\u010b`\3\2\2\2\u010c\u010d\7\61\2\2\u010d\u010e\7,\2\2"+
		"\u010e\u0112\3\2\2\2\u010f\u0111\13\2\2\2\u0110\u010f\3\2\2\2\u0111\u0114"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0116\7,\2\2\u0116\u0117\7\61\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u0119\b\61\2\2\u0119b\3\2\2\2\u011a\u011b\7\61\2\2\u011b\u011c"+
		"\7\61\2\2\u011c\u0120\3\2\2\2\u011d\u011f\n\5\2\2\u011e\u011d\3\2\2\2"+
		"\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\b\62\2\2\u0124d\3\2\2\2\20\2"+
		"\u00cd\u00cf\u00db\u00e4\u00e9\u00ef\u00f4\u00fa\u00ff\u0105\u0108\u0112"+
		"\u0120\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}