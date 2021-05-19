// Generated from LenguajeenMi.g4 by ANTLR 4.8
package valen.parser.lenguajeenMi;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LenguajeenMiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LenguajeenMiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LenguajeenMiParser#cascaron}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascaron(LenguajeenMiParser.CascaronContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenMiParser#plural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlural(LenguajeenMiParser.PluralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code espacio}
	 * labeled alternative in {@link LenguajeenMiParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspacio(LenguajeenMiParser.EspacioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link LenguajeenMiParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LenguajeenMiParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impresionExpresion}
	 * labeled alternative in {@link LenguajeenMiParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresionExpresion(LenguajeenMiParser.ImpresionExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link LenguajeenMiParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LenguajeenMiParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionMultiple}
	 * labeled alternative in {@link LenguajeenMiParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionMultiple(LenguajeenMiParser.DeclaracionMultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condiciones}
	 * labeled alternative in {@link LenguajeenMiParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiciones(LenguajeenMiParser.CondicionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cicloWhile}
	 * labeled alternative in {@link LenguajeenMiParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloWhile(LenguajeenMiParser.CicloWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenMiParser#model_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_while(LenguajeenMiParser.Model_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenMiParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(LenguajeenMiParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenMiParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(LenguajeenMiParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenMiParser#model_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_cond(LenguajeenMiParser.Model_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenMiParser#model_ono}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_ono(LenguajeenMiParser.Model_onoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link LenguajeenMiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(LenguajeenMiParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumRes}
	 * labeled alternative in {@link LenguajeenMiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(LenguajeenMiParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LenguajeenMiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(LenguajeenMiParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LenguajeenMiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LenguajeenMiParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LenguajeenMiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LenguajeenMiParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenMiParser#prod_muldiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd_muldiv(LenguajeenMiParser.Prod_muldivContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenMiParser#prod_sumres}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd_sumres(LenguajeenMiParser.Prod_sumresContext ctx);
}