// Generated from LenguajeenC.g4 by ANTLR 4.8
package valen.parser.lenguajeC;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LenguajeenCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LenguajeenCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LenguajeenCParser#cascaron}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascaron(LenguajeenCParser.CascaronContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenCParser#plural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlural(LenguajeenCParser.PluralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code espacio}
	 * labeled alternative in {@link LenguajeenCParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspacio(LenguajeenCParser.EspacioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link LenguajeenCParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LenguajeenCParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impresionExpresion}
	 * labeled alternative in {@link LenguajeenCParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresionExpresion(LenguajeenCParser.ImpresionExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link LenguajeenCParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LenguajeenCParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionMultiple}
	 * labeled alternative in {@link LenguajeenCParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionMultiple(LenguajeenCParser.DeclaracionMultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condiciones}
	 * labeled alternative in {@link LenguajeenCParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiciones(LenguajeenCParser.CondicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenCParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(LenguajeenCParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenCParser#parentesis_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis_comp(LenguajeenCParser.Parentesis_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenCParser#cond_logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_logic(LenguajeenCParser.Cond_logicContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenCParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(LenguajeenCParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenCParser#model_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_cond(LenguajeenCParser.Model_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenCParser#model_ono}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_ono(LenguajeenCParser.Model_onoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link LenguajeenCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(LenguajeenCParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumRes}
	 * labeled alternative in {@link LenguajeenCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(LenguajeenCParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LenguajeenCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(LenguajeenCParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LenguajeenCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LenguajeenCParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LenguajeenCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LenguajeenCParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenCParser#prod_muldiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd_muldiv(LenguajeenCParser.Prod_muldivContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeenCParser#prod_sumres}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd_sumres(LenguajeenCParser.Prod_sumresContext ctx);
}