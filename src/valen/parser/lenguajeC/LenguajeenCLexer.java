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
		LIB=1, CLASS=2, INTEGER=3, IMPRIME=4, CONDICION=5, ONO=6, WHILE=7, SIGNO=8, 
		O_LOG=9, NEG=10, A_LL=11, C_LL=12, IGUAL=13, POR=14, DIV=15, SUMA=16, 
		RESTA=17, COMA=18, ID=19, INT=20, STRING=21, PAR_A=22, PAR_C=23, NUEVALINEA=24, 
		WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LIB", "CLASS", "INTEGER", "IMPRIME", "CONDICION", "ONO", "WHILE", "SIGNO", 
			"O_LOG", "NEG", "A_LL", "C_LL", "IGUAL", "POR", "DIV", "SUMA", "RESTA", 
			"COMA", "ID", "INT", "STRING", "ESC", "PAR_A", "PAR_C", "NUEVALINEA", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include <stdio.h>'", "'void main()'", "'int'", "'printf'", "'if'", 
			"'else'", "'while'", null, null, "'!'", "'{'", "'}'", "'='", "'*'", "'/'", 
			"'+'", "'-'", "','", null, null, null, "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LIB", "CLASS", "INTEGER", "IMPRIME", "CONDICION", "ONO", "WHILE", 
			"SIGNO", "O_LOG", "NEG", "A_LL", "C_LL", "IGUAL", "POR", "DIV", "SUMA", 
			"RESTA", "COMA", "ID", "INT", "STRING", "PAR_A", "PAR_C", "NUEVALINEA", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00b7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\ty\n\t\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\6\24\u0095\n\24\r\24\16\24\u0096\3\24\5\24\u009a\n\24\3\25\6\25\u009d"+
		"\n\25\r\25\16\25\u009e\3\26\3\26\3\26\7\26\u00a4\n\26\f\26\16\26\u00a7"+
		"\13\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\u00a5\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\30\61\31\63"+
		"\32\65\33\3\2\b\4\2>>@@\3\2c|\5\2\62;C\\c|\3\2\62;\b\2$$^^ddppttvv\4\2"+
		"\13\f\"\"\2\u00bf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5J\3\2\2\2"+
		"\7V\3\2\2\2\tZ\3\2\2\2\13a\3\2\2\2\rd\3\2\2\2\17i\3\2\2\2\21x\3\2\2\2"+
		"\23~\3\2\2\2\25\u0080\3\2\2\2\27\u0082\3\2\2\2\31\u0084\3\2\2\2\33\u0086"+
		"\3\2\2\2\35\u0088\3\2\2\2\37\u008a\3\2\2\2!\u008c\3\2\2\2#\u008e\3\2\2"+
		"\2%\u0090\3\2\2\2\'\u0099\3\2\2\2)\u009c\3\2\2\2+\u00a0\3\2\2\2-\u00aa"+
		"\3\2\2\2/\u00ad\3\2\2\2\61\u00af\3\2\2\2\63\u00b1\3\2\2\2\65\u00b3\3\2"+
		"\2\2\678\7%\2\289\7k\2\29:\7p\2\2:;\7e\2\2;<\7n\2\2<=\7w\2\2=>\7f\2\2"+
		">?\7g\2\2?@\7\"\2\2@A\7>\2\2AB\7u\2\2BC\7v\2\2CD\7f\2\2DE\7k\2\2EF\7q"+
		"\2\2FG\7\60\2\2GH\7j\2\2HI\7@\2\2I\4\3\2\2\2JK\7x\2\2KL\7q\2\2LM\7k\2"+
		"\2MN\7f\2\2NO\7\"\2\2OP\7o\2\2PQ\7c\2\2QR\7k\2\2RS\7p\2\2ST\7*\2\2TU\7"+
		"+\2\2U\6\3\2\2\2VW\7k\2\2WX\7p\2\2XY\7v\2\2Y\b\3\2\2\2Z[\7r\2\2[\\\7t"+
		"\2\2\\]\7k\2\2]^\7p\2\2^_\7v\2\2_`\7h\2\2`\n\3\2\2\2ab\7k\2\2bc\7h\2\2"+
		"c\f\3\2\2\2de\7g\2\2ef\7n\2\2fg\7u\2\2gh\7g\2\2h\16\3\2\2\2ij\7y\2\2j"+
		"k\7j\2\2kl\7k\2\2lm\7n\2\2mn\7g\2\2n\20\3\2\2\2op\7?\2\2py\7?\2\2qr\7"+
		"#\2\2ry\7?\2\2st\7>\2\2ty\7?\2\2uv\7@\2\2vy\7?\2\2wy\t\2\2\2xo\3\2\2\2"+
		"xq\3\2\2\2xs\3\2\2\2xu\3\2\2\2xw\3\2\2\2y\22\3\2\2\2z{\7(\2\2{\177\7("+
		"\2\2|}\7~\2\2}\177\7~\2\2~z\3\2\2\2~|\3\2\2\2\177\24\3\2\2\2\u0080\u0081"+
		"\7#\2\2\u0081\26\3\2\2\2\u0082\u0083\7}\2\2\u0083\30\3\2\2\2\u0084\u0085"+
		"\7\177\2\2\u0085\32\3\2\2\2\u0086\u0087\7?\2\2\u0087\34\3\2\2\2\u0088"+
		"\u0089\7,\2\2\u0089\36\3\2\2\2\u008a\u008b\7\61\2\2\u008b \3\2\2\2\u008c"+
		"\u008d\7-\2\2\u008d\"\3\2\2\2\u008e\u008f\7/\2\2\u008f$\3\2\2\2\u0090"+
		"\u0091\7.\2\2\u0091&\3\2\2\2\u0092\u0094\t\3\2\2\u0093\u0095\t\4\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u009a\3\2\2\2\u0098\u009a\t\3\2\2\u0099\u0092\3\2\2\2\u0099"+
		"\u0098\3\2\2\2\u009a(\3\2\2\2\u009b\u009d\t\5\2\2\u009c\u009b\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f*\3"+
		"\2\2\2\u00a0\u00a5\7$\2\2\u00a1\u00a4\5-\27\2\u00a2\u00a4\13\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7$\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7^\2\2\u00ab\u00ac\t\6\2\2\u00ac"+
		".\3\2\2\2\u00ad\u00ae\7*\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7+\2\2\u00b0"+
		"\62\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\t\7\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\b\33\2\2\u00b6\66\3\2\2\2\n\2x~\u0096\u0099"+
		"\u009e\u00a3\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}