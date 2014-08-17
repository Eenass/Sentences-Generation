// Generated from ExtractedClojure.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedClojureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedClojureVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedClojureParser#special_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_form(@NotNull ExtractedClojureParser.Special_formContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedClojureParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(@NotNull ExtractedClojureParser.LambdaContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(@NotNull ExtractedClojureParser.FormContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedClojureParser#var_quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_quote(@NotNull ExtractedClojureParser.Var_quoteContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReader_macro(@NotNull ExtractedClojureParser.Reader_macroContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedClojureParser#regex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegex(@NotNull ExtractedClojureParser.RegexContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedClojureParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(@NotNull ExtractedClojureParser.VectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedClojureParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(@NotNull ExtractedClojureParser.FileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedClojureParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(@NotNull ExtractedClojureParser.MapContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedClojureParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull ExtractedClojureParser.ListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedClojureParser#meta_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeta_data(@NotNull ExtractedClojureParser.Meta_dataContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull ExtractedClojureParser.LiteralContext ctx);
}