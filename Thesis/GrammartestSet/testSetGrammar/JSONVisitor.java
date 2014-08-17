// Generated from JSON.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(@NotNull JSONParser.PairContext ctx);

	/**
	 * Visit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(@NotNull JSONParser.JsonContext ctx);

	/**
	 * Visit a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull JSONParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link JSONParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(@NotNull JSONParser.ObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull JSONParser.ArrayContext ctx);
}