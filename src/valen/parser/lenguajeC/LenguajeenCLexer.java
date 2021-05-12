// Generated from LenguajeenC.g4 by ANTLR 4.8
package valen.parser.lenguajeC;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajeenCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, INTEGER=2, IMPRIME=3, CONDICION=4, ONO=5, SIGNO=6, O_LOG=7, NEG=8, 
		A_LL=9, C_LL=10, IGUAL=11, POR=12, DIV=13, SUMA=14, RESTA=15, COMA=16, 
		ID=17, INT=18, STRING=19, PAR_A=20, PAR_C=21, NUEVALINEA=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "INTEGER", "IMPRIME", "CONDICION", "ONO", "SIGNO", "O_LOG", 
			"NEG", "A_LL", "C_LL", "IGUAL", "POR", "DIV", "SUMA", "RESTA", "COMA", 
			"ID", "INT", "STRING", "ESC", "PAR_A", "PAR_C", "NUEVALINEA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void main()'", "'int'", "'System.out.println'", "'if'", "'else'", 
			null, null, "'!'", "'{'", "'}'", "'='", "'*'", "'/'", "'+'", "'-'", "','", 
			null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "INTEGER", "IMPRIME", "CONDICION", "ONO", "SIGNO", "O_LOG", 
			"NEG", "A_LL", "C_LL", "IGUAL", "POR", "DIV", "SUMA", "RESTA", "COMA", 
			"ID", "INT", "STRING", "PAR_A", "PAR_C", "NUEVALINEA", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public LenguajeenCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LenguajeenC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\6\22\u0084"+
		"\n\22\r\22\16\22\u0085\3\22\5\22\u0089\n\22\3\23\6\23\u008c\n\23\r\23"+
		"\16\23\u008d\3\24\3\24\3\24\7\24\u0093\n\24\f\24\16\24\u0096\13\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\u0094\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\26-\27/\30\61\31\3\2\t\4\2>>@"+
		"@\3\2c|\5\2\62;C\\c|\3\2\62;\b\2$$^^ddppttvv\4\2\f\f\17\17\4\2\13\13\""+
		"\"\2\u00ae\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\3\63\3\2\2\2\5?\3\2\2\2\7C\3\2\2\2\tV\3\2\2\2\13Y\3\2\2"+
		"\2\rg\3\2\2\2\17m\3\2\2\2\21o\3\2\2\2\23q\3\2\2\2\25s\3\2\2\2\27u\3\2"+
		"\2\2\31w\3\2\2\2\33y\3\2\2\2\35{\3\2\2\2\37}\3\2\2\2!\177\3\2\2\2#\u0088"+
		"\3\2\2\2%\u008b\3\2\2\2\'\u008f\3\2\2\2)\u0099\3\2\2\2+\u009c\3\2\2\2"+
		"-\u009e\3\2\2\2/\u00a0\3\2\2\2\61\u00a2\3\2\2\2\63\64\7x\2\2\64\65\7q"+
		"\2\2\65\66\7k\2\2\66\67\7f\2\2\678\7\"\2\289\7o\2\29:\7c\2\2:;\7k\2\2"+
		";<\7p\2\2<=\7*\2\2=>\7+\2\2>\4\3\2\2\2?@\7k\2\2@A\7p\2\2AB\7v\2\2B\6\3"+
		"\2\2\2CD\7U\2\2DE\7{\2\2EF\7u\2\2FG\7v\2\2GH\7g\2\2HI\7o\2\2IJ\7\60\2"+
		"\2JK\7q\2\2KL\7w\2\2LM\7v\2\2MN\7\60\2\2NO\7r\2\2OP\7t\2\2PQ\7k\2\2QR"+
		"\7p\2\2RS\7v\2\2ST\7n\2\2TU\7p\2\2U\b\3\2\2\2VW\7k\2\2WX\7h\2\2X\n\3\2"+
		"\2\2YZ\7g\2\2Z[\7n\2\2[\\\7u\2\2\\]\7g\2\2]\f\3\2\2\2^_\7?\2\2_h\7?\2"+
		"\2`a\7#\2\2ah\7?\2\2bc\7>\2\2ch\7?\2\2de\7@\2\2eh\7?\2\2fh\t\2\2\2g^\3"+
		"\2\2\2g`\3\2\2\2gb\3\2\2\2gd\3\2\2\2gf\3\2\2\2h\16\3\2\2\2ij\7(\2\2jn"+
		"\7(\2\2kl\7~\2\2ln\7~\2\2mi\3\2\2\2mk\3\2\2\2n\20\3\2\2\2op\7#\2\2p\22"+
		"\3\2\2\2qr\7}\2\2r\24\3\2\2\2st\7\177\2\2t\26\3\2\2\2uv\7?\2\2v\30\3\2"+
		"\2\2wx\7,\2\2x\32\3\2\2\2yz\7\61\2\2z\34\3\2\2\2{|\7-\2\2|\36\3\2\2\2"+
		"}~\7/\2\2~ \3\2\2\2\177\u0080\7.\2\2\u0080\"\3\2\2\2\u0081\u0083\t\3\2"+
		"\2\u0082\u0084\t\4\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0089\t\3\2\2\u0088"+
		"\u0081\3\2\2\2\u0088\u0087\3\2\2\2\u0089$\3\2\2\2\u008a\u008c\t\5\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e&\3\2\2\2\u008f\u0094\7$\2\2\u0090\u0093\5)\25\2\u0091\u0093"+
		"\13\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2"+
		"\u0094\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0097\u0098\7$\2\2\u0098(\3\2\2\2\u0099\u009a\7^\2\2\u009a\u009b"+
		"\t\6\2\2\u009b*\3\2\2\2\u009c\u009d\7*\2\2\u009d,\3\2\2\2\u009e\u009f"+
		"\7+\2\2\u009f.\3\2\2\2\u00a0\u00a1\t\7\2\2\u00a1\60\3\2\2\2\u00a2\u00a3"+
		"\t\b\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\31\2\2\u00a5\62\3\2\2\2\n\2"+
		"gm\u0085\u0088\u008d\u0092\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}