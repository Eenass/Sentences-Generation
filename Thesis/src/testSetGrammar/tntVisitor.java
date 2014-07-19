// Generated from tnt.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tntParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tntVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull tntParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tntParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull tntParser.AtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link tntParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(@NotNull tntParser.EquationContext ctx);

	/**
	 * Visit a parse tree produced by {@link tntParser#exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(@NotNull tntParser.ExistsContext ctx);

	/**
	 * Visit a parse tree produced by {@link tntParser#forevery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForevery(@NotNull tntParser.ForeveryContext ctx);

	/**
	 * Visit a parse tree produced by {@link tntParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull tntParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link tntParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull tntParser.VariableContext ctx);
}