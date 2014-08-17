// Generated from ExtractedClojure.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedClojureParser}.
 */
public interface ExtractedClojureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedClojureParser#special_form}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_form(@NotNull ExtractedClojureParser.Special_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedClojureParser#special_form}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_form(@NotNull ExtractedClojureParser.Special_formContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedClojureParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(@NotNull ExtractedClojureParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedClojureParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(@NotNull ExtractedClojureParser.LambdaContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(@NotNull ExtractedClojureParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(@NotNull ExtractedClojureParser.FormContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void enterVar_quote(@NotNull ExtractedClojureParser.Var_quoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void exitVar_quote(@NotNull ExtractedClojureParser.Var_quoteContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterReader_macro(@NotNull ExtractedClojureParser.Reader_macroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitReader_macro(@NotNull ExtractedClojureParser.Reader_macroContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(@NotNull ExtractedClojureParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(@NotNull ExtractedClojureParser.RegexContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(@NotNull ExtractedClojureParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(@NotNull ExtractedClojureParser.VectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedClojureParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull ExtractedClojureParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedClojureParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull ExtractedClojureParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedClojureParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(@NotNull ExtractedClojureParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedClojureParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(@NotNull ExtractedClojureParser.MapContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedClojureParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull ExtractedClojureParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedClojureParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull ExtractedClojureParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	void enterMeta_data(@NotNull ExtractedClojureParser.Meta_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	void exitMeta_data(@NotNull ExtractedClojureParser.Meta_dataContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ExtractedClojureParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ExtractedClojureParser.LiteralContext ctx);
}