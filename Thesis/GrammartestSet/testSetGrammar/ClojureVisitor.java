// Generated from Clojure.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClojureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClojureVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClojureParser#special_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_form(@NotNull ClojureParser.Special_formContext ctx);

	/**
	 * Visit a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(@NotNull ClojureParser.LambdaContext ctx);

	/**
	 * Visit a parse tree produced by {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(@NotNull ClojureParser.FormContext ctx);

	/**
	 * Visit a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_quote(@NotNull ClojureParser.Var_quoteContext ctx);

	/**
	 * Visit a parse tree produced by {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReader_macro(@NotNull ClojureParser.Reader_macroContext ctx);

	/**
	 * Visit a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegex(@NotNull ClojureParser.RegexContext ctx);

	/**
	 * Visit a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(@NotNull ClojureParser.VectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(@NotNull ClojureParser.FileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(@NotNull ClojureParser.MapContext ctx);

	/**
	 * Visit a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull ClojureParser.ListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeta_data(@NotNull ClojureParser.Meta_dataContext ctx);

	/**
	 * Visit a parse tree produced by {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull ClojureParser.LiteralContext ctx);
}