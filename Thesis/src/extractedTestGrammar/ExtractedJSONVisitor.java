// Generated from ExtractedJSON.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedJSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedJSONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedJSONParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(@NotNull ExtractedJSONParser.PairContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJSONParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(@NotNull ExtractedJSONParser.JsonContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull ExtractedJSONParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJSONParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(@NotNull ExtractedJSONParser.ObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJSONParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull ExtractedJSONParser.ArrayContext ctx);
}