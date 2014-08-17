// Generated from ExtractedJSON.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedJSONParser}.
 */
public interface ExtractedJSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedJSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(@NotNull ExtractedJSONParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(@NotNull ExtractedJSONParser.PairContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJSONParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(@NotNull ExtractedJSONParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJSONParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(@NotNull ExtractedJSONParser.JsonContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ExtractedJSONParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ExtractedJSONParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJSONParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull ExtractedJSONParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJSONParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull ExtractedJSONParser.ObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJSONParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull ExtractedJSONParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJSONParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull ExtractedJSONParser.ArrayContext ctx);
}