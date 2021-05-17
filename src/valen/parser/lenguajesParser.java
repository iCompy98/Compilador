// Generated from lenguajes.g4 by ANTLR 4.8
package valen.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lenguajesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, INTEGER=2, IMPRIME=3, CONDICION=4, ONO=5, SIGNO=6, O_LOG=7, NEG=8, 
		A_LL=9, C_LL=10, IGUAL=11, POR=12, DIV=13, SUMA=14, RESTA=15, COMA=16, 
		INT=17, ID=18, STRING=19, PAR_A=20, PAR_C=21, NUEVALINEA=22, WS=23;
	public static final int
		RULE_cascaron = 0, RULE_plural = 1, RULE_inicio = 2, RULE_condicional = 3, 
		RULE_cond = 4, RULE_model_cond = 5, RULE_model_ono = 6, RULE_expr = 7, 
		RULE_prod_muldiv = 8, RULE_prod_sumres = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"cascaron", "plural", "inicio", "condicional", "cond", "model_cond", 
			"model_ono", "expr", "prod_muldiv", "prod_sumres"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'int'", "'imprimir'", "'si'", "'no'", null, null, 
			"'!'", "'{'", "'}'", "'='", "'*'", "'/'", "'+'", "'-'", "','", null, 
			null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "INTEGER", "IMPRIME", "CONDICION", "ONO", "SIGNO", "O_LOG", 
			"NEG", "A_LL", "C_LL", "IGUAL", "POR", "DIV", "SUMA", "RESTA", "COMA", 
			"INT", "ID", "STRING", "PAR_A", "PAR_C", "NUEVALINEA", "WS"
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
	public String getGrammarFileName() { return "lenguajes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lenguajesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CascaronContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(lenguajesParser.CLASS, 0); }
		public TerminalNode A_LL() { return getToken(lenguajesParser.A_LL, 0); }
		public PluralContext plural() {
			return getRuleContext(PluralContext.class,0);
		}
		public TerminalNode C_LL() { return getToken(lenguajesParser.C_LL, 0); }
		public CascaronContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascaron; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitCascaron(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CascaronContext cascaron() throws RecognitionException {
		CascaronContext _localctx = new CascaronContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cascaron);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(CLASS);
			setState(21);
			match(A_LL);
			setState(22);
			plural();
			setState(23);
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
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitPlural(this);
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
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				inicio();
				}
				}
				setState(28); 
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
		public TerminalNode NUEVALINEA() { return getToken(lenguajesParser.NUEVALINEA, 0); }
		public EspacioContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitEspacio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsignacionContext extends InicioContext {
		public TerminalNode ID() { return getToken(lenguajesParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(lenguajesParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUEVALINEA() { return getToken(lenguajesParser.NUEVALINEA, 0); }
		public AsignacionContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionContext extends InicioContext {
		public TerminalNode INTEGER() { return getToken(lenguajesParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(lenguajesParser.ID, 0); }
		public TerminalNode NUEVALINEA() { return getToken(lenguajesParser.NUEVALINEA, 0); }
		public TerminalNode IGUAL() { return getToken(lenguajesParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpresionExpresionContext extends InicioContext {
		public TerminalNode IMPRIME() { return getToken(lenguajesParser.IMPRIME, 0); }
		public TerminalNode PAR_A() { return getToken(lenguajesParser.PAR_A, 0); }
		public TerminalNode PAR_C() { return getToken(lenguajesParser.PAR_C, 0); }
		public TerminalNode NUEVALINEA() { return getToken(lenguajesParser.NUEVALINEA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(lenguajesParser.STRING, 0); }
		public ImpresionExpresionContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitImpresionExpresion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionesContext extends InicioContext {
		public Model_condContext model_cond() {
			return getRuleContext(Model_condContext.class,0);
		}
		public TerminalNode NUEVALINEA() { return getToken(lenguajesParser.NUEVALINEA, 0); }
		public CondicionesContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitCondiciones(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionMultipleContext extends InicioContext {
		public TerminalNode INTEGER() { return getToken(lenguajesParser.INTEGER, 0); }
		public List<TerminalNode> ID() { return getTokens(lenguajesParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lenguajesParser.ID, i);
		}
		public TerminalNode NUEVALINEA() { return getToken(lenguajesParser.NUEVALINEA, 0); }
		public List<TerminalNode> COMA() { return getTokens(lenguajesParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(lenguajesParser.COMA, i);
		}
		public DeclaracionMultipleContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitDeclaracionMultiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inicio);
		int _la;
		try {
			int _alt;
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new EspacioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(NUEVALINEA);
				}
				break;
			case 2:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(ID);
				setState(32);
				match(IGUAL);
				setState(33);
				expr(0);
				setState(34);
				match(NUEVALINEA);
				}
				break;
			case 3:
				_localctx = new ImpresionExpresionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(IMPRIME);
				setState(37);
				match(PAR_A);
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case ID:
				case PAR_A:
					{
					setState(38);
					expr(0);
					}
					break;
				case STRING:
					{
					setState(39);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(42);
				match(PAR_C);
				setState(43);
				match(NUEVALINEA);
				}
				break;
			case 4:
				_localctx = new DeclaracionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(INTEGER);
				setState(45);
				match(ID);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(46);
					match(IGUAL);
					setState(47);
					expr(0);
					}
				}

				setState(50);
				match(NUEVALINEA);
				}
				break;
			case 5:
				_localctx = new DeclaracionMultipleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				match(INTEGER);
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(52);
						match(ID);
						setState(53);
						match(COMA);
						}
						} 
					}
					setState(58);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(59);
				match(ID);
				setState(60);
				match(NUEVALINEA);
				}
				break;
			case 6:
				_localctx = new CondicionesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				model_cond();
				setState(62);
				match(NUEVALINEA);
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

	public static class CondicionalContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_A() { return getToken(lenguajesParser.PAR_A, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(lenguajesParser.PAR_C, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicional);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(PAR_A);
				setState(68);
				cond();
				setState(69);
				match(PAR_C);
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
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public TerminalNode NEG() { return getToken(lenguajesParser.NEG, 0); }
		public List<TerminalNode> SIGNO() { return getTokens(lenguajesParser.SIGNO); }
		public TerminalNode SIGNO(int i) {
			return getToken(lenguajesParser.SIGNO, i);
		}
		public List<TerminalNode> O_LOG() { return getTokens(lenguajesParser.O_LOG); }
		public TerminalNode O_LOG(int i) {
			return getToken(lenguajesParser.O_LOG, i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEG) {
				{
				setState(73);
				match(NEG);
				}
			}

			setState(76);
			condicional();
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SIGNO) {
					{
					{
					setState(77);
					match(SIGNO);
					setState(78);
					condicional();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==O_LOG) {
					{
					{
					setState(84);
					match(O_LOG);
					setState(85);
					condicional();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		public TerminalNode CONDICION() { return getToken(lenguajesParser.CONDICION, 0); }
		public TerminalNode PAR_A() { return getToken(lenguajesParser.PAR_A, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(lenguajesParser.PAR_C, 0); }
		public TerminalNode A_LL() { return getToken(lenguajesParser.A_LL, 0); }
		public PluralContext plural() {
			return getRuleContext(PluralContext.class,0);
		}
		public TerminalNode C_LL() { return getToken(lenguajesParser.C_LL, 0); }
		public Model_onoContext model_ono() {
			return getRuleContext(Model_onoContext.class,0);
		}
		public Model_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitModel_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_condContext model_cond() throws RecognitionException {
		Model_condContext _localctx = new Model_condContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_model_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(CONDICION);
			setState(94);
			match(PAR_A);
			setState(95);
			cond();
			setState(96);
			match(PAR_C);
			setState(97);
			match(A_LL);
			setState(98);
			plural();
			setState(99);
			match(C_LL);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONO) {
				{
				setState(100);
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
		public TerminalNode ONO() { return getToken(lenguajesParser.ONO, 0); }
		public TerminalNode A_LL() { return getToken(lenguajesParser.A_LL, 0); }
		public PluralContext plural() {
			return getRuleContext(PluralContext.class,0);
		}
		public TerminalNode C_LL() { return getToken(lenguajesParser.C_LL, 0); }
		public Model_condContext model_cond() {
			return getRuleContext(Model_condContext.class,0);
		}
		public Model_onoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_ono; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitModel_ono(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_onoContext model_ono() throws RecognitionException {
		Model_onoContext _localctx = new Model_onoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_model_ono);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ONO);
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_LL:
				{
				setState(104);
				match(A_LL);
				setState(105);
				plural();
				setState(106);
				match(C_LL);
				}
				break;
			case CONDICION:
				{
				setState(108);
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
		public TerminalNode PAR_A() { return getToken(lenguajesParser.PAR_A, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(lenguajesParser.PAR_C, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitParentesis(this);
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
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitSumRes(this);
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
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(lenguajesParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(lenguajesParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitInt(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(112);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(ID);
				}
				break;
			case PAR_A:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(PAR_A);
				setState(115);
				expr(0);
				setState(116);
				match(PAR_C);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(121);
						prod_muldiv();
						setState(122);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(124);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(125);
						prod_sumres();
						setState(126);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public TerminalNode POR() { return getToken(lenguajesParser.POR, 0); }
		public TerminalNode DIV() { return getToken(lenguajesParser.DIV, 0); }
		public Prod_muldivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prod_muldiv; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitProd_muldiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prod_muldivContext prod_muldiv() throws RecognitionException {
		Prod_muldivContext _localctx = new Prod_muldivContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prod_muldiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		public TerminalNode SUMA() { return getToken(lenguajesParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(lenguajesParser.RESTA, 0); }
		public Prod_sumresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prod_sumres; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajesVisitor ) return ((lenguajesVisitor<? extends T>)visitor).visitProd_sumres(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prod_sumresContext prod_sumres() throws RecognitionException {
		Prod_sumresContext _localctx = new Prod_sumresContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prod_sumres);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u008c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\3\6\3\35\n\3\r\3\16\3\36\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4+\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\4"+
		"\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\5\6M\n\6\3\6\3\6\3\6\7\6R\n\6\f\6\16\6U"+
		"\13\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\5\6^\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\ty\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0083\n\t\f\t"+
		"\16\t\u0086\13\t\3\n\3\n\3\13\3\13\3\13\2\3\20\f\2\4\6\b\n\f\16\20\22"+
		"\24\2\4\3\2\16\17\3\2\20\21\2\u0095\2\26\3\2\2\2\4\34\3\2\2\2\6B\3\2\2"+
		"\2\bI\3\2\2\2\nL\3\2\2\2\f_\3\2\2\2\16i\3\2\2\2\20x\3\2\2\2\22\u0087\3"+
		"\2\2\2\24\u0089\3\2\2\2\26\27\7\3\2\2\27\30\7\13\2\2\30\31\5\4\3\2\31"+
		"\32\7\f\2\2\32\3\3\2\2\2\33\35\5\6\4\2\34\33\3\2\2\2\35\36\3\2\2\2\36"+
		"\34\3\2\2\2\36\37\3\2\2\2\37\5\3\2\2\2 C\7\30\2\2!\"\7\24\2\2\"#\7\r\2"+
		"\2#$\5\20\t\2$%\7\30\2\2%C\3\2\2\2&\'\7\5\2\2\'*\7\26\2\2(+\5\20\t\2)"+
		"+\7\25\2\2*(\3\2\2\2*)\3\2\2\2+,\3\2\2\2,-\7\27\2\2-C\7\30\2\2./\7\4\2"+
		"\2/\62\7\24\2\2\60\61\7\r\2\2\61\63\5\20\t\2\62\60\3\2\2\2\62\63\3\2\2"+
		"\2\63\64\3\2\2\2\64C\7\30\2\2\65:\7\4\2\2\66\67\7\24\2\2\679\7\22\2\2"+
		"8\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\24"+
		"\2\2>C\7\30\2\2?@\5\f\7\2@A\7\30\2\2AC\3\2\2\2B \3\2\2\2B!\3\2\2\2B&\3"+
		"\2\2\2B.\3\2\2\2B\65\3\2\2\2B?\3\2\2\2C\7\3\2\2\2DJ\5\20\t\2EF\7\26\2"+
		"\2FG\5\n\6\2GH\7\27\2\2HJ\3\2\2\2ID\3\2\2\2IE\3\2\2\2J\t\3\2\2\2KM\7\n"+
		"\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2N]\5\b\5\2OP\7\b\2\2PR\5\b\5\2QO\3\2"+
		"\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T^\3\2\2\2US\3\2\2\2VW\7\t\2\2WY\5\b"+
		"\5\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]S\3"+
		"\2\2\2]Z\3\2\2\2^\13\3\2\2\2_`\7\6\2\2`a\7\26\2\2ab\5\n\6\2bc\7\27\2\2"+
		"cd\7\13\2\2de\5\4\3\2eg\7\f\2\2fh\5\16\b\2gf\3\2\2\2gh\3\2\2\2h\r\3\2"+
		"\2\2io\7\7\2\2jk\7\13\2\2kl\5\4\3\2lm\7\f\2\2mp\3\2\2\2np\5\f\7\2oj\3"+
		"\2\2\2on\3\2\2\2p\17\3\2\2\2qr\b\t\1\2ry\7\23\2\2sy\7\24\2\2tu\7\26\2"+
		"\2uv\5\20\t\2vw\7\27\2\2wy\3\2\2\2xq\3\2\2\2xs\3\2\2\2xt\3\2\2\2y\u0084"+
		"\3\2\2\2z{\f\7\2\2{|\5\22\n\2|}\5\20\t\b}\u0083\3\2\2\2~\177\f\6\2\2\177"+
		"\u0080\5\24\13\2\u0080\u0081\5\20\t\7\u0081\u0083\3\2\2\2\u0082z\3\2\2"+
		"\2\u0082~\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\21\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\t\2\2\2\u0088"+
		"\23\3\2\2\2\u0089\u008a\t\3\2\2\u008a\25\3\2\2\2\21\36*\62:BILSZ]gox\u0082"+
		"\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}