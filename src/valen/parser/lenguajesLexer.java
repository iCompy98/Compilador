// Generated from lenguajes.g4 by ANTLR 4.8
package valen.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lenguajesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, INTEGER=2, IMPRIME=3, CONDICION=4, ONO=5, SIGNO=6, A_LL=7, C_LL=8, 
		IGUAL=9, POR=10, DIV=11, SUMA=12, RESTA=13, COMA=14, INT=15, ID=16, STRING=17, 
		PAR_A=18, PAR_C=19, NUEVALINEA=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "INTEGER", "IMPRIME", "CONDICION", "ONO", "SIGNO", "A_LL", "C_LL", 
			"IGUAL", "POR", "DIV", "SUMA", "RESTA", "COMA", "INT", "ID", "STRING", 
			"ESC", "PAR_A", "PAR_C", "NUEVALINEA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'int'", "'imprimir'", "'si'", "'no'", null, "'{'", 
			"'}'", "'='", "'*'", "'/'", "'+'", "'-'", "','", null, null, null, "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "INTEGER", "IMPRIME", "CONDICION", "ONO", "SIGNO", "A_LL", 
			"C_LL", "IGUAL", "POR", "DIV", "SUMA", "RESTA", "COMA", "INT", "ID", 
			"STRING", "PAR_A", "PAR_C", "NUEVALINEA", "WS"
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


	public lenguajesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lenguajes.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\6\20g\n\20\r\20\16\20h\3\21\3\21\6\21m\n\21\r\21\16\21n\3\22\3\22"+
		"\3\22\7\22t\n\22\f\22\16\22w\13\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3u\2\30\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\24"+
		")\25+\26-\27\3\2\b\3\2\62;\3\2c|\5\2\62;C\\c|\b\2$$^^ddppttvv\4\2\f\f"+
		"\17\17\4\2\13\13\"\"\2\u008c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\3/\3\2\2\2\58\3\2\2\2\7<\3\2\2\2\tE\3\2\2\2\13H\3\2\2\2\rS\3\2"+
		"\2\2\17U\3\2\2\2\21W\3\2\2\2\23Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3"+
		"\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37f\3\2\2\2!j\3\2\2\2#p\3\2\2\2%z\3\2\2"+
		"\2\'}\3\2\2\2)\177\3\2\2\2+\u0081\3\2\2\2-\u0083\3\2\2\2/\60\7r\2\2\60"+
		"\61\7t\2\2\61\62\7q\2\2\62\63\7i\2\2\63\64\7t\2\2\64\65\7c\2\2\65\66\7"+
		"o\2\2\66\67\7c\2\2\67\4\3\2\2\289\7k\2\29:\7p\2\2:;\7v\2\2;\6\3\2\2\2"+
		"<=\7k\2\2=>\7o\2\2>?\7r\2\2?@\7t\2\2@A\7k\2\2AB\7o\2\2BC\7k\2\2CD\7t\2"+
		"\2D\b\3\2\2\2EF\7u\2\2FG\7k\2\2G\n\3\2\2\2HI\7p\2\2IJ\7q\2\2J\f\3\2\2"+
		"\2KL\7?\2\2LT\7?\2\2MN\7#\2\2NT\7?\2\2OP\7>\2\2PT\7?\2\2QR\7@\2\2RT\7"+
		"?\2\2SK\3\2\2\2SM\3\2\2\2SO\3\2\2\2SQ\3\2\2\2T\16\3\2\2\2UV\7}\2\2V\20"+
		"\3\2\2\2WX\7\177\2\2X\22\3\2\2\2YZ\7?\2\2Z\24\3\2\2\2[\\\7,\2\2\\\26\3"+
		"\2\2\2]^\7\61\2\2^\30\3\2\2\2_`\7-\2\2`\32\3\2\2\2ab\7/\2\2b\34\3\2\2"+
		"\2cd\7.\2\2d\36\3\2\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2i \3\2\2\2jl\t\3\2\2km\t\4\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2"+
		"\2\2o\"\3\2\2\2pu\7$\2\2qt\5%\23\2rt\13\2\2\2sq\3\2\2\2sr\3\2\2\2tw\3"+
		"\2\2\2uv\3\2\2\2us\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7$\2\2y$\3\2\2\2z{\7"+
		"^\2\2{|\t\5\2\2|&\3\2\2\2}~\7*\2\2~(\3\2\2\2\177\u0080\7+\2\2\u0080*\3"+
		"\2\2\2\u0081\u0082\t\6\2\2\u0082,\3\2\2\2\u0083\u0084\t\7\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0086\b\27\2\2\u0086.\3\2\2\2\b\2Shnsu\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}