// Generated from Extractedtnt.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedtntParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedtntVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedtntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ExtractedtntParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedtntParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull ExtractedtntParser.AtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedtntParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(@NotNull ExtractedtntParser.EquationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedtntParser#exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(@NotNull ExtractedtntParser.ExistsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedtntParser#forevery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForevery(@NotNull ExtractedtntParser.ForeveryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedtntParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull ExtractedtntParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedtntParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull ExtractedtntParser.VariableContext ctx);
}