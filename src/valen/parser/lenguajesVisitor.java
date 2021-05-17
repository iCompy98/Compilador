// Generated from lenguajes.g4 by ANTLR 4.8
package valen.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lenguajesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lenguajesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lenguajesParser#cascaron}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascaron(lenguajesParser.CascaronContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajesParser#plural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlural(lenguajesParser.PluralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code espacio}
	 * labeled alternative in {@link lenguajesParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspacio(lenguajesParser.EspacioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link lenguajesParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(lenguajesParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impresionExpresion}
	 * labeled alternative in {@link lenguajesParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresionExpresion(lenguajesParser.ImpresionExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link lenguajesParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(lenguajesParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionMultiple}
	 * labeled alternative in {@link lenguajesParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionMultiple(lenguajesParser.DeclaracionMultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condiciones}
	 * labeled alternative in {@link lenguajesParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiciones(lenguajesParser.CondicionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cicloWhile}
	 * labeled alternative in {@link lenguajesParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloWhile(lenguajesParser.CicloWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajesParser#model_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_while(lenguajesParser.Model_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajesParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(lenguajesParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajesParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(lenguajesParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajesParser#model_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_cond(lenguajesParser.Model_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajesParser#model_ono}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_ono(lenguajesParser.Model_onoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link lenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(lenguajesParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumRes}
	 * labeled alternative in {@link lenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(lenguajesParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link lenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(lenguajesParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link lenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(lenguajesParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link lenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(lenguajesParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajesParser#prod_muldiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd_muldiv(lenguajesParser.Prod_muldivContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajesParser#prod_sumres}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd_sumres(lenguajesParser.Prod_sumresContext ctx);
}