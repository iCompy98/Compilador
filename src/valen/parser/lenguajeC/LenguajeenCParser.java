// Generated from LenguajeenC.g4 by ANTLR 4.8
package valen.parser.lenguajeC;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajeenCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, INTEGER=2, IMPRIME=3, CONDICION=4, ONO=5, SIGNO=6, O_LOG=7, NEG=8, 
		A_LL=9, C_LL=10, IGUAL=11, POR=12, DIV=13, SUMA=14, RESTA=15, COMA=16, 
		ID=17, INT=18, STRING=19, PAR_A=20, PAR_C=21, NUEVALINEA=22, WS=23;
	public static final int
		RULE_cascaron = 0, RULE_plural = 1, RULE_inicio = 2, RULE_comparacion = 3, 
		RULE_parentesis_comp = 4, RULE_cond_logic = 5, RULE_cond = 6, RULE_model_cond = 7, 
		RULE_model_ono = 8, RULE_expr = 9, RULE_prod_muldiv = 10, RULE_prod_sumres = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"cascaron", "plural", "inicio", "comparacion", "parentesis_comp", "cond_logic", 
			"cond", "model_cond", "model_ono", "expr", "prod_muldiv", "prod_sumres"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void main()'", "'int'", "'printf'", "'if'", "'else'", null, null, 
			"'!'", "'{'", "'}'", "'='", "'*'", "'/'", "'+'", "'-'", "','", null, 
			null, null, "'('", "')'", "';'"
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

	@Override
	public String getGrammarFileName() { return "LenguajeenC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajeenCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CascaronContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(LenguajeenCParser.CLASS, 0); }
		public TerminalNode A_LL() { return getToken(LenguajeenCParser.A_LL, 0); }
		public PluralContext plural() {
			return getRuleContext(PluralContext.class,0);
		}
		public TerminalNode C_LL() { return getToken(LenguajeenCParser.C_LL, 0); }
		public CascaronContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascaron; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitCascaron(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CascaronContext cascaron() throws RecognitionException {
		CascaronContext _localctx = new CascaronContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cascaron);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(CLASS);
			setState(25);
			match(A_LL);
			setState(26);
			plural();
			setState(27);
			match(C_LL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PluralContext extends ParserRuleContext {
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public PluralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plural; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitPlural(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluralContext plural() throws RecognitionException {
		PluralContext _localctx = new PluralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_plural);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				inicio();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << IMPRIME) | (1L << CONDICION) | (1L << ID) | (1L << NUEVALINEA))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InicioContext extends ParserRuleContext {
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	 
		public InicioContext() { }
		public void copyFrom(InicioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EspacioContext extends InicioContext {
		public TerminalNode NUEVALINEA() { return getToken(LenguajeenCParser.NUEVALINEA, 0); }
		public EspacioContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitEspacio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsignacionContext extends InicioContext {
		public TerminalNode ID() { return getToken(LenguajeenCParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajeenCParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUEVALINEA() { return getToken(LenguajeenCParser.NUEVALINEA, 0); }
		public AsignacionContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionContext extends InicioContext {
		public TerminalNode INTEGER() { return getToken(LenguajeenCParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(LenguajeenCParser.ID, 0); }
		public TerminalNode NUEVALINEA() { return getToken(LenguajeenCParser.NUEVALINEA, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajeenCParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpresionExpresionContext extends InicioContext {
		public TerminalNode IMPRIME() { return getToken(LenguajeenCParser.IMPRIME, 0); }
		public TerminalNode PAR_A() { return getToken(LenguajeenCParser.PAR_A, 0); }
		public TerminalNode PAR_C() { return getToken(LenguajeenCParser.PAR_C, 0); }
		public TerminalNode NUEVALINEA() { return getToken(LenguajeenCParser.NUEVALINEA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LenguajeenCParser.STRING, 0); }
		public ImpresionExpresionContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitImpresionExpresion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionesContext extends InicioContext {
		public Model_condContext model_cond() {
			return getRuleContext(Model_condContext.class,0);
		}
		public CondicionesContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitCondiciones(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionMultipleContext extends InicioContext {
		public TerminalNode INTEGER() { return getToken(LenguajeenCParser.INTEGER, 0); }
		public List<TerminalNode> ID() { return getTokens(LenguajeenCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LenguajeenCParser.ID, i);
		}
		public TerminalNode NUEVALINEA() { return getToken(LenguajeenCParser.NUEVALINEA, 0); }
		public List<TerminalNode> COMA() { return getTokens(LenguajeenCParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(LenguajeenCParser.COMA, i);
		}
		public DeclaracionMultipleContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitDeclaracionMultiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inicio);
		int _la;
		try {
			int _alt;
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new EspacioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(NUEVALINEA);
				}
				break;
			case 2:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(ID);
				setState(36);
				match(IGUAL);
				setState(37);
				expr(0);
				setState(38);
				match(NUEVALINEA);
				}
				break;
			case 3:
				_localctx = new ImpresionExpresionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(IMPRIME);
				setState(41);
				match(PAR_A);
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case INT:
				case PAR_A:
					{
					setState(42);
					expr(0);
					}
					break;
				case STRING:
					{
					setState(43);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(46);
				match(PAR_C);
				setState(47);
				match(NUEVALINEA);
				}
				break;
			case 4:
				_localctx = new DeclaracionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(INTEGER);
				setState(49);
				match(ID);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(50);
					match(IGUAL);
					setState(51);
					expr(0);
					}
				}

				setState(54);
				match(NUEVALINEA);
				}
				break;
			case 5:
				_localctx = new DeclaracionMultipleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(INTEGER);
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(56);
						match(ID);
						setState(57);
						match(COMA);
						}
						} 
					}
					setState(62);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(63);
				match(ID);
				setState(64);
				match(NUEVALINEA);
				}
				break;
			case 6:
				_localctx = new CondicionesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				model_cond();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparacionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SIGNO() { return getToken(LenguajeenCParser.SIGNO, 0); }
		public Parentesis_compContext parentesis_comp() {
			return getRuleContext(Parentesis_compContext.class,0);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comparacion);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				expr(0);
				setState(69);
				match(SIGNO);
				setState(70);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				parentesis_comp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parentesis_compContext extends ParserRuleContext {
		public TerminalNode PAR_A() { return getToken(LenguajeenCParser.PAR_A, 0); }
		public TerminalNode PAR_C() { return getToken(LenguajeenCParser.PAR_C, 0); }
		public Cond_logicContext cond_logic() {
			return getRuleContext(Cond_logicContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public Parentesis_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentesis_comp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitParentesis_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parentesis_compContext parentesis_comp() throws RecognitionException {
		Parentesis_compContext _localctx = new Parentesis_compContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parentesis_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(PAR_A);
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(76);
				cond_logic();
				}
				break;
			case 2:
				{
				setState(77);
				comparacion();
				}
				break;
			}
			setState(80);
			match(PAR_C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_logicContext extends ParserRuleContext {
		public List<ComparacionContext> comparacion() {
			return getRuleContexts(ComparacionContext.class);
		}
		public ComparacionContext comparacion(int i) {
			return getRuleContext(ComparacionContext.class,i);
		}
		public List<TerminalNode> O_LOG() { return getTokens(LenguajeenCParser.O_LOG); }
		public TerminalNode O_LOG(int i) {
			return getToken(LenguajeenCParser.O_LOG, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Cond_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_logic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitCond_logic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_logicContext cond_logic() throws RecognitionException {
		Cond_logicContext _localctx = new Cond_logicContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cond_logic);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				comparacion();
				setState(83);
				match(O_LOG);
				setState(84);
				comparacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				expr(0);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==O_LOG) {
					{
					{
					setState(87);
					match(O_LOG);
					setState(88);
					expr(0);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public Parentesis_compContext parentesis_comp() {
			return getRuleContext(Parentesis_compContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cond_logicContext cond_logic() {
			return getRuleContext(Cond_logicContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode NEG() { return getToken(LenguajeenCParser.NEG, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEG) {
				{
				setState(96);
				match(NEG);
				}
			}

			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(99);
				parentesis_comp();
				}
				break;
			case 2:
				{
				setState(100);
				expr(0);
				}
				break;
			case 3:
				{
				setState(101);
				cond_logic();
				}
				break;
			case 4:
				{
				setState(102);
				comparacion();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_condContext extends ParserRuleContext {
		public TerminalNode CONDICION() { return getToken(LenguajeenCParser.CONDICION, 0); }
		public TerminalNode PAR_A() { return getToken(LenguajeenCParser.PAR_A, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(LenguajeenCParser.PAR_C, 0); }
		public TerminalNode A_LL() { return getToken(LenguajeenCParser.A_LL, 0); }
		public PluralContext plural() {
			return getRuleContext(PluralContext.class,0);
		}
		public TerminalNode C_LL() { return getToken(LenguajeenCParser.C_LL, 0); }
		public Model_onoContext model_ono() {
			return getRuleContext(Model_onoContext.class,0);
		}
		public Model_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitModel_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_condContext model_cond() throws RecognitionException {
		Model_condContext _localctx = new Model_condContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_model_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(CONDICION);
			setState(106);
			match(PAR_A);
			setState(107);
			cond();
			setState(108);
			match(PAR_C);
			setState(109);
			match(A_LL);
			setState(110);
			plural();
			setState(111);
			match(C_LL);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONO) {
				{
				setState(112);
				model_ono();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_onoContext extends ParserRuleContext {
		public TerminalNode ONO() { return getToken(LenguajeenCParser.ONO, 0); }
		public TerminalNode A_LL() { return getToken(LenguajeenCParser.A_LL, 0); }
		public PluralContext plural() {
			return getRuleContext(PluralContext.class,0);
		}
		public TerminalNode C_LL() { return getToken(LenguajeenCParser.C_LL, 0); }
		public Model_condContext model_cond() {
			return getRuleContext(Model_condContext.class,0);
		}
		public Model_onoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_ono; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitModel_ono(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_onoContext model_ono() throws RecognitionException {
		Model_onoContext _localctx = new Model_onoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_model_ono);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ONO);
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_LL:
				{
				setState(116);
				match(A_LL);
				setState(117);
				plural();
				setState(118);
				match(C_LL);
				}
				break;
			case CONDICION:
				{
				setState(120);
				model_cond();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentesisContext extends ExprContext {
		public TerminalNode PAR_A() { return getToken(LenguajeenCParser.PAR_A, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(LenguajeenCParser.PAR_C, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumResContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Prod_sumresContext prod_sumres() {
			return getRuleContext(Prod_sumresContext.class,0);
		}
		public SumResContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitSumRes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Prod_muldivContext prod_muldiv() {
			return getRuleContext(Prod_muldivContext.class,0);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LenguajeenCParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LenguajeenCParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(124);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(ID);
				}
				break;
			case PAR_A:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(PAR_A);
				setState(127);
				expr(0);
				setState(128);
				match(PAR_C);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						prod_muldiv();
						setState(134);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(137);
						prod_sumres();
						setState(138);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Prod_muldivContext extends ParserRuleContext {
		public TerminalNode POR() { return getToken(LenguajeenCParser.POR, 0); }
		public TerminalNode DIV() { return getToken(LenguajeenCParser.DIV, 0); }
		public Prod_muldivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prod_muldiv; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitProd_muldiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prod_muldivContext prod_muldiv() throws RecognitionException {
		Prod_muldivContext _localctx = new Prod_muldivContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prod_muldiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==POR || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prod_sumresContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(LenguajeenCParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(LenguajeenCParser.RESTA, 0); }
		public Prod_sumresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prod_sumres; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitProd_sumres(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prod_sumresContext prod_sumres() throws RecognitionException {
		Prod_sumresContext _localctx = new Prod_sumresContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prod_sumres);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==SUMA || _la==RESTA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0098\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\3\6\3!\n\3\r\3\16\3\"\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\67\n\4\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\3\4\3\4\5\4E\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\5\6Q\n\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\5\7a\n\7\3\b\5\bd\n\b\3\b"+
		"\3\b\3\b\3\b\5\bj\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n|\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0085"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008f\n\13\f\13\16"+
		"\13\u0092\13\13\3\f\3\f\3\r\3\r\3\r\2\3\24\16\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\2\4\3\2\16\17\3\2\20\21\2\u00a2\2\32\3\2\2\2\4 \3\2\2\2\6D\3\2"+
		"\2\2\bK\3\2\2\2\nM\3\2\2\2\f`\3\2\2\2\16c\3\2\2\2\20k\3\2\2\2\22u\3\2"+
		"\2\2\24\u0084\3\2\2\2\26\u0093\3\2\2\2\30\u0095\3\2\2\2\32\33\7\3\2\2"+
		"\33\34\7\13\2\2\34\35\5\4\3\2\35\36\7\f\2\2\36\3\3\2\2\2\37!\5\6\4\2 "+
		"\37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\5\3\2\2\2$E\7\30\2\2%&\7"+
		"\23\2\2&\'\7\r\2\2\'(\5\24\13\2()\7\30\2\2)E\3\2\2\2*+\7\5\2\2+.\7\26"+
		"\2\2,/\5\24\13\2-/\7\25\2\2.,\3\2\2\2.-\3\2\2\2/\60\3\2\2\2\60\61\7\27"+
		"\2\2\61E\7\30\2\2\62\63\7\4\2\2\63\66\7\23\2\2\64\65\7\r\2\2\65\67\5\24"+
		"\13\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28E\7\30\2\29>\7\4\2\2:;\7"+
		"\23\2\2;=\7\22\2\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@"+
		">\3\2\2\2AB\7\23\2\2BE\7\30\2\2CE\5\20\t\2D$\3\2\2\2D%\3\2\2\2D*\3\2\2"+
		"\2D\62\3\2\2\2D9\3\2\2\2DC\3\2\2\2E\7\3\2\2\2FG\5\24\13\2GH\7\b\2\2HI"+
		"\5\24\13\2IL\3\2\2\2JL\5\n\6\2KF\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MP\7\26\2"+
		"\2NQ\5\f\7\2OQ\5\b\5\2PN\3\2\2\2PO\3\2\2\2QR\3\2\2\2RS\7\27\2\2S\13\3"+
		"\2\2\2TU\5\b\5\2UV\7\t\2\2VW\5\b\5\2Wa\3\2\2\2X]\5\24\13\2YZ\7\t\2\2Z"+
		"\\\5\24\13\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2"+
		"\2\2`T\3\2\2\2`X\3\2\2\2a\r\3\2\2\2bd\7\n\2\2cb\3\2\2\2cd\3\2\2\2di\3"+
		"\2\2\2ej\5\n\6\2fj\5\24\13\2gj\5\f\7\2hj\5\b\5\2ie\3\2\2\2if\3\2\2\2i"+
		"g\3\2\2\2ih\3\2\2\2j\17\3\2\2\2kl\7\6\2\2lm\7\26\2\2mn\5\16\b\2no\7\27"+
		"\2\2op\7\13\2\2pq\5\4\3\2qs\7\f\2\2rt\5\22\n\2sr\3\2\2\2st\3\2\2\2t\21"+
		"\3\2\2\2u{\7\7\2\2vw\7\13\2\2wx\5\4\3\2xy\7\f\2\2y|\3\2\2\2z|\5\20\t\2"+
		"{v\3\2\2\2{z\3\2\2\2|\23\3\2\2\2}~\b\13\1\2~\u0085\7\24\2\2\177\u0085"+
		"\7\23\2\2\u0080\u0081\7\26\2\2\u0081\u0082\5\24\13\2\u0082\u0083\7\27"+
		"\2\2\u0083\u0085\3\2\2\2\u0084}\3\2\2\2\u0084\177\3\2\2\2\u0084\u0080"+
		"\3\2\2\2\u0085\u0090\3\2\2\2\u0086\u0087\f\7\2\2\u0087\u0088\5\26\f\2"+
		"\u0088\u0089\5\24\13\b\u0089\u008f\3\2\2\2\u008a\u008b\f\6\2\2\u008b\u008c"+
		"\5\30\r\2\u008c\u008d\5\24\13\7\u008d\u008f\3\2\2\2\u008e\u0086\3\2\2"+
		"\2\u008e\u008a\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\25\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\t\2\2\2\u0094"+
		"\27\3\2\2\2\u0095\u0096\t\3\2\2\u0096\31\3\2\2\2\22\".\66>DKP]`cis{\u0084"+
		"\u008e\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}