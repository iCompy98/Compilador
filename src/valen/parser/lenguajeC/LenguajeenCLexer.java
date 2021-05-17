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
		CLASS=1, INTEGER=2, IMPRIME=3, CONDICION=4, ONO=5, WHILE=6, SIGNO=7, O_LOG=8, 
		NEG=9, A_LL=10, C_LL=11, IGUAL=12, POR=13, DIV=14, SUMA=15, RESTA=16, 
		COMA=17, ID=18, INT=19, STRING=20, PAR_A=21, PAR_C=22, NUEVALINEA=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "INTEGER", "IMPRIME", "CONDICION", "ONO", "WHILE", "SIGNO", 
			"O_LOG", "NEG", "A_LL", "C_LL", "IGUAL", "POR", "DIV", "SUMA", "RESTA", 
			"COMA", "ID", "INT", "STRING", "ESC", "PAR_A", "PAR_C", "NUEVALINEA", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void main()'", "'int'", "'printf'", "'if'", "'else'", "'while'", 
			null, null, "'!'", "'{'", "'}'", "'='", "'*'", "'/'", "'+'", "'-'", "','", 
			null, null, null, "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "INTEGER", "IMPRIME", "CONDICION", "ONO", "WHILE", "SIGNO", 
			"O_LOG", "NEG", "A_LL", "C_LL", "IGUAL", "POR", "DIV", "SUMA", "RESTA", 
			"COMA", "ID", "INT", "STRING", "PAR_A", "PAR_C", "NUEVALINEA", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bd\n\b"+
		"\3\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\6\23\u0080\n\23\r\23"+
		"\16\23\u0081\3\23\5\23\u0085\n\23\3\24\6\24\u0088\n\24\r\24\16\24\u0089"+
		"\3\25\3\25\3\25\7\25\u008f\n\25\f\25\16\25\u0092\13\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\u0090\2"+
		"\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\2-\27/\30\61\31\63\32\3\2\b\4\2>>@@\3"+
		"\2c|\5\2\62;C\\c|\3\2\62;\b\2$$^^ddppttvv\4\2\13\f\"\"\2\u00aa\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\3\65\3\2\2\2\5A\3\2\2\2\7E\3\2\2\2\tL\3\2\2\2\13O\3\2\2\2\rT"+
		"\3\2\2\2\17c\3\2\2\2\21i\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31"+
		"q\3\2\2\2\33s\3\2\2\2\35u\3\2\2\2\37w\3\2\2\2!y\3\2\2\2#{\3\2\2\2%\u0084"+
		"\3\2\2\2\'\u0087\3\2\2\2)\u008b\3\2\2\2+\u0095\3\2\2\2-\u0098\3\2\2\2"+
		"/\u009a\3\2\2\2\61\u009c\3\2\2\2\63\u009e\3\2\2\2\65\66\7x\2\2\66\67\7"+
		"q\2\2\678\7k\2\289\7f\2\29:\7\"\2\2:;\7o\2\2;<\7c\2\2<=\7k\2\2=>\7p\2"+
		"\2>?\7*\2\2?@\7+\2\2@\4\3\2\2\2AB\7k\2\2BC\7p\2\2CD\7v\2\2D\6\3\2\2\2"+
		"EF\7r\2\2FG\7t\2\2GH\7k\2\2HI\7p\2\2IJ\7v\2\2JK\7h\2\2K\b\3\2\2\2LM\7"+
		"k\2\2MN\7h\2\2N\n\3\2\2\2OP\7g\2\2PQ\7n\2\2QR\7u\2\2RS\7g\2\2S\f\3\2\2"+
		"\2TU\7y\2\2UV\7j\2\2VW\7k\2\2WX\7n\2\2XY\7g\2\2Y\16\3\2\2\2Z[\7?\2\2["+
		"d\7?\2\2\\]\7#\2\2]d\7?\2\2^_\7>\2\2_d\7?\2\2`a\7@\2\2ad\7?\2\2bd\t\2"+
		"\2\2cZ\3\2\2\2c\\\3\2\2\2c^\3\2\2\2c`\3\2\2\2cb\3\2\2\2d\20\3\2\2\2ef"+
		"\7(\2\2fj\7(\2\2gh\7~\2\2hj\7~\2\2ie\3\2\2\2ig\3\2\2\2j\22\3\2\2\2kl\7"+
		"#\2\2l\24\3\2\2\2mn\7}\2\2n\26\3\2\2\2op\7\177\2\2p\30\3\2\2\2qr\7?\2"+
		"\2r\32\3\2\2\2st\7,\2\2t\34\3\2\2\2uv\7\61\2\2v\36\3\2\2\2wx\7-\2\2x "+
		"\3\2\2\2yz\7/\2\2z\"\3\2\2\2{|\7.\2\2|$\3\2\2\2}\177\t\3\2\2~\u0080\t"+
		"\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0085\t\3\2\2\u0084}\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085&\3\2\2\2\u0086\u0088\t\5\2\2\u0087\u0086\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a(\3"+
		"\2\2\2\u008b\u0090\7$\2\2\u008c\u008f\5+\26\2\u008d\u008f\13\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\7$\2\2\u0094*\3\2\2\2\u0095\u0096\7^\2\2\u0096\u0097\t\6\2\2\u0097"+
		",\3\2\2\2\u0098\u0099\7*\2\2\u0099.\3\2\2\2\u009a\u009b\7+\2\2\u009b\60"+
		"\3\2\2\2\u009c\u009d\7=\2\2\u009d\62\3\2\2\2\u009e\u009f\t\7\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\b\32\2\2\u00a1\64\3\2\2\2\n\2ci\u0081\u0084"+
		"\u0089\u008e\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}