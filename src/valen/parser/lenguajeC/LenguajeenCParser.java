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
		LIB=1, CLASS=2, INTEGER=3, IMPRIME=4, CONDICION=5, ONO=6, WHILE=7, SIGNO=8, 
		O_LOG=9, NEG=10, A_LL=11, C_LL=12, IGUAL=13, POR=14, DIV=15, SUMA=16, 
		RESTA=17, COMA=18, ID=19, INT=20, STRING=21, PAR_A=22, PAR_C=23, NUEVALINEA=24, 
		WS=25;
	public static final int
		RULE_cascaron = 0, RULE_plural = 1, RULE_inicio = 2, RULE_model_while = 3, 
		RULE_condicional = 4, RULE_cond = 5, RULE_model_cond = 6, RULE_model_ono = 7, 
		RULE_expr = 8, RULE_prod_muldiv = 9, RULE_prod_sumres = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"cascaron", "plural", "inicio", "model_while", "condicional", "cond", 
			"model_cond", "model_ono", "expr", "prod_muldiv", "prod_sumres"
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
		public TerminalNode LIB() { return getToken(LenguajeenCParser.LIB, 0); }
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
			setState(22);
			match(LIB);
			setState(23);
			match(CLASS);
			setState(24);
			match(A_LL);
			setState(25);
			plural();
			setState(26);
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				inicio();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << IMPRIME) | (1L << CONDICION) | (1L << WHILE) | (1L << ID) | (1L << NUEVALINEA))) != 0) );
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
	public static class CicloWhileContext extends InicioContext {
		public Model_whileContext model_while() {
			return getRuleContext(Model_whileContext.class,0);
		}
		public CicloWhileContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitCicloWhile(this);
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
				setState(33);
				match(NUEVALINEA);
				}
				break;
			case 2:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(ID);
				setState(35);
				match(IGUAL);
				setState(36);
				expr(0);
				setState(37);
				match(NUEVALINEA);
				}
				break;
			case 3:
				_localctx = new ImpresionExpresionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(IMPRIME);
				setState(40);
				match(PAR_A);
				setState(43);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case INT:
				case PAR_A:
					{
					setState(41);
					expr(0);
					}
					break;
				case STRING:
					{
					setState(42);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(45);
				match(PAR_C);
				setState(46);
				match(NUEVALINEA);
				}
				break;
			case 4:
				_localctx = new DeclaracionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(INTEGER);
				setState(48);
				match(ID);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(49);
					match(IGUAL);
					setState(50);
					expr(0);
					}
				}

				setState(53);
				match(NUEVALINEA);
				}
				break;
			case 5:
				_localctx = new DeclaracionMultipleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				match(INTEGER);
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(55);
						match(ID);
						setState(56);
						match(COMA);
						}
						} 
					}
					setState(61);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(62);
				match(ID);
				setState(63);
				match(NUEVALINEA);
				}
				break;
			case 6:
				_localctx = new CondicionesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				model_cond();
				}
				break;
			case 7:
				_localctx = new CicloWhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				model_while();
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

	public static class Model_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LenguajeenCParser.WHILE, 0); }
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
		public Model_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitModel_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_whileContext model_while() throws RecognitionException {
		Model_whileContext _localctx = new Model_whileContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_model_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(WHILE);
			setState(69);
			match(PAR_A);
			setState(70);
			cond();
			setState(71);
			match(PAR_C);
			setState(72);
			match(A_LL);
			setState(73);
			plural();
			setState(74);
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

	public static class CondicionalContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_A() { return getToken(LenguajeenCParser.PAR_A, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(LenguajeenCParser.PAR_C, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeenCVisitor ) return ((LenguajeenCVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicional);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(PAR_A);
				setState(78);
				cond();
				setState(79);
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
		public TerminalNode NEG() { return getToken(LenguajeenCParser.NEG, 0); }
		public List<TerminalNode> SIGNO() { return getTokens(LenguajeenCParser.SIGNO); }
		public TerminalNode SIGNO(int i) {
			return getToken(LenguajeenCParser.SIGNO, i);
		}
		public List<TerminalNode> O_LOG() { return getTokens(LenguajeenCParser.O_LOG); }
		public TerminalNode O_LOG(int i) {
			return getToken(LenguajeenCParser.O_LOG, i);
		}
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
		enterRule(_localctx, 10, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEG) {
				{
				setState(83);
				match(NEG);
				}
			}

			setState(86);
			condicional();
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SIGNO) {
					{
					{
					setState(87);
					match(SIGNO);
					setState(88);
					condicional();
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==O_LOG) {
					{
					{
					setState(94);
					match(O_LOG);
					setState(95);
					condicional();
					}
					}
					setState(100);
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
		enterRule(_localctx, 12, RULE_model_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(CONDICION);
			setState(104);
			match(PAR_A);
			setState(105);
			cond();
			setState(106);
			match(PAR_C);
			setState(107);
			match(A_LL);
			setState(108);
			plural();
			setState(109);
			match(C_LL);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONO) {
				{
				setState(110);
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
		enterRule(_localctx, 14, RULE_model_ono);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ONO);
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_LL:
				{
				setState(114);
				match(A_LL);
				setState(115);
				plural();
				setState(116);
				match(C_LL);
				}
				break;
			case CONDICION:
				{
				setState(118);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(122);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(ID);
				}
				break;
			case PAR_A:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(PAR_A);
				setState(125);
				expr(0);
				setState(126);
				match(PAR_C);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(131);
						prod_muldiv();
						setState(132);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(135);
						prod_sumres();
						setState(136);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(142);
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
		enterRule(_localctx, 18, RULE_prod_muldiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		enterRule(_localctx, 20, RULE_prod_sumres);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		case 8:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3 \n\3\r\3\16\3!\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4.\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\66"+
		"\n\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3\4\3\4\5\4E\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6T\n\6\3\7\5\7"+
		"W\n\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7\7\7c\n\7\f\7\16\7f"+
		"\13\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\br\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tz\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0083\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\3\13\3\13\3"+
		"\f\3\f\3\f\2\3\22\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\20\21\3\2\22\23"+
		"\2\u009f\2\30\3\2\2\2\4\37\3\2\2\2\6D\3\2\2\2\bF\3\2\2\2\nS\3\2\2\2\f"+
		"V\3\2\2\2\16i\3\2\2\2\20s\3\2\2\2\22\u0082\3\2\2\2\24\u0091\3\2\2\2\26"+
		"\u0093\3\2\2\2\30\31\7\3\2\2\31\32\7\4\2\2\32\33\7\r\2\2\33\34\5\4\3\2"+
		"\34\35\7\16\2\2\35\3\3\2\2\2\36 \5\6\4\2\37\36\3\2\2\2 !\3\2\2\2!\37\3"+
		"\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#E\7\32\2\2$%\7\25\2\2%&\7\17\2\2&\'\5\22"+
		"\n\2\'(\7\32\2\2(E\3\2\2\2)*\7\6\2\2*-\7\30\2\2+.\5\22\n\2,.\7\27\2\2"+
		"-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/\60\7\31\2\2\60E\7\32\2\2\61\62\7\5\2\2"+
		"\62\65\7\25\2\2\63\64\7\17\2\2\64\66\5\22\n\2\65\63\3\2\2\2\65\66\3\2"+
		"\2\2\66\67\3\2\2\2\67E\7\32\2\28=\7\5\2\29:\7\25\2\2:<\7\24\2\2;9\3\2"+
		"\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\25\2\2AE\7"+
		"\32\2\2BE\5\16\b\2CE\5\b\5\2D#\3\2\2\2D$\3\2\2\2D)\3\2\2\2D\61\3\2\2\2"+
		"D8\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\7\3\2\2\2FG\7\t\2\2GH\7\30\2\2HI\5\f\7"+
		"\2IJ\7\31\2\2JK\7\r\2\2KL\5\4\3\2LM\7\16\2\2M\t\3\2\2\2NT\5\22\n\2OP\7"+
		"\30\2\2PQ\5\f\7\2QR\7\31\2\2RT\3\2\2\2SN\3\2\2\2SO\3\2\2\2T\13\3\2\2\2"+
		"UW\7\f\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2Xg\5\n\6\2YZ\7\n\2\2Z\\\5\n\6"+
		"\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^h\3\2\2\2_]\3\2\2\2`a\7\13"+
		"\2\2ac\5\n\6\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eh\3\2\2\2fd\3\2"+
		"\2\2g]\3\2\2\2gd\3\2\2\2h\r\3\2\2\2ij\7\7\2\2jk\7\30\2\2kl\5\f\7\2lm\7"+
		"\31\2\2mn\7\r\2\2no\5\4\3\2oq\7\16\2\2pr\5\20\t\2qp\3\2\2\2qr\3\2\2\2"+
		"r\17\3\2\2\2sy\7\b\2\2tu\7\r\2\2uv\5\4\3\2vw\7\16\2\2wz\3\2\2\2xz\5\16"+
		"\b\2yt\3\2\2\2yx\3\2\2\2z\21\3\2\2\2{|\b\n\1\2|\u0083\7\26\2\2}\u0083"+
		"\7\25\2\2~\177\7\30\2\2\177\u0080\5\22\n\2\u0080\u0081\7\31\2\2\u0081"+
		"\u0083\3\2\2\2\u0082{\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0083\u008e"+
		"\3\2\2\2\u0084\u0085\f\7\2\2\u0085\u0086\5\24\13\2\u0086\u0087\5\22\n"+
		"\b\u0087\u008d\3\2\2\2\u0088\u0089\f\6\2\2\u0089\u008a\5\26\f\2\u008a"+
		"\u008b\5\22\n\7\u008b\u008d\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0088\3"+
		"\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\23\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\t\2\2\2\u0092\25\3\2\2\2\u0093"+
		"\u0094\t\3\2\2\u0094\27\3\2\2\2\21!-\65=DSV]dgqy\u0082\u008c\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}