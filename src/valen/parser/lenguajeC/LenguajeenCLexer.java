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
			null, "'void main()'", "'int'", "'print'", "'if'", "'else'", null, null, 
			"'!'", "'{'", "'}'", "'='", "'*'", "'/'", "'+'", "'-'", "','", null, 
			null, null, "'('", "')'"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\5\ba\n\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\6\22w\n\22\r\22\16\22x\3\22\5\22|\n\22\3\23\6\23\177\n\23\r\23"+
		"\16\23\u0080\3\24\3\24\3\24\7\24\u0086\n\24\f\24\16\24\u0089\13\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\u0087\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\26-\27/\30\61\31\3\2\t\4\2>>@"+
		"@\3\2c|\5\2\62;C\\c|\3\2\62;\b\2$$^^ddppttvv\4\2\f\f\17\17\4\2\13\13\""+
		"\"\2\u00a1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\3\63\3\2\2\2\5?\3\2\2\2\7C\3\2\2\2\tI\3\2\2\2\13L\3\2\2"+
		"\2\rZ\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27h\3\2"+
		"\2\2\31j\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37p\3\2\2\2!r\3\2\2\2#{\3\2\2"+
		"\2%~\3\2\2\2\'\u0082\3\2\2\2)\u008c\3\2\2\2+\u008f\3\2\2\2-\u0091\3\2"+
		"\2\2/\u0093\3\2\2\2\61\u0095\3\2\2\2\63\64\7x\2\2\64\65\7q\2\2\65\66\7"+
		"k\2\2\66\67\7f\2\2\678\7\"\2\289\7o\2\29:\7c\2\2:;\7k\2\2;<\7p\2\2<=\7"+
		"*\2\2=>\7+\2\2>\4\3\2\2\2?@\7k\2\2@A\7p\2\2AB\7v\2\2B\6\3\2\2\2CD\7r\2"+
		"\2DE\7t\2\2EF\7k\2\2FG\7p\2\2GH\7v\2\2H\b\3\2\2\2IJ\7k\2\2JK\7h\2\2K\n"+
		"\3\2\2\2LM\7g\2\2MN\7n\2\2NO\7u\2\2OP\7g\2\2P\f\3\2\2\2QR\7?\2\2R[\7?"+
		"\2\2ST\7#\2\2T[\7?\2\2UV\7>\2\2V[\7?\2\2WX\7@\2\2X[\7?\2\2Y[\t\2\2\2Z"+
		"Q\3\2\2\2ZS\3\2\2\2ZU\3\2\2\2ZW\3\2\2\2ZY\3\2\2\2[\16\3\2\2\2\\]\7(\2"+
		"\2]a\7(\2\2^_\7~\2\2_a\7~\2\2`\\\3\2\2\2`^\3\2\2\2a\20\3\2\2\2bc\7#\2"+
		"\2c\22\3\2\2\2de\7}\2\2e\24\3\2\2\2fg\7\177\2\2g\26\3\2\2\2hi\7?\2\2i"+
		"\30\3\2\2\2jk\7,\2\2k\32\3\2\2\2lm\7\61\2\2m\34\3\2\2\2no\7-\2\2o\36\3"+
		"\2\2\2pq\7/\2\2q \3\2\2\2rs\7.\2\2s\"\3\2\2\2tv\t\3\2\2uw\t\4\2\2vu\3"+
		"\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2z|\t\3\2\2{t\3\2\2\2{z\3"+
		"\2\2\2|$\3\2\2\2}\177\t\5\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081&\3\2\2\2\u0082\u0087\7$\2\2\u0083\u0086\5"+
		")\25\2\u0084\u0086\13\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7$\2\2\u008b(\3\2\2\2\u008c\u008d"+
		"\7^\2\2\u008d\u008e\t\6\2\2\u008e*\3\2\2\2\u008f\u0090\7*\2\2\u0090,\3"+
		"\2\2\2\u0091\u0092\7+\2\2\u0092.\3\2\2\2\u0093\u0094\t\7\2\2\u0094\60"+
		"\3\2\2\2\u0095\u0096\t\b\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\31\2\2"+
		"\u0098\62\3\2\2\2\n\2Z`x{\u0080\u0085\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}