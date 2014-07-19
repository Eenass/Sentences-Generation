// Generated from creole.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link creoleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface creoleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link creoleParser#tableheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableheader(@NotNull creoleParser.TableheaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link creoleParser#markup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkup(@NotNull creoleParser.MarkupContext ctx);

	/**
	 * Visit a parse tree produced by {@link creoleParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull creoleParser.TextContext ctx);

	/**
	 * Visit a parse tree produced by {@link creoleParser#italics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalics(@NotNull creoleParser.ItalicsContext ctx);

	/**
	 * Visit a parse tree produced by {@link creoleParser#tablerow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablerow(@NotNull creoleParser.TablerowContext ctx);

	/**
	 * Visit a parse tree produced by {@link creoleParser#hline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHline(@NotNull creoleParser.HlineContext ctx);

	/**
	 * Visit a parse tree produced by {@link creoleParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull creoleParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link creoleParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(@NotNull creoleParser.ImageContext ctx);

	/**
	 * Visit a parse tree produced by {@link creoleParser#listitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListitem(@NotNull creoleParser.ListitemContext ctx);

	/**
	 * Visit a parse tree produced by {@link creoleParser#nowiki}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNowiki(@NotNull creoleParser.NowikiContext ctx);

	/**
	 * Visit a parse tree produced by {@link creoleParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(@NotNull creoleParser.TitleContext ctx);

	/**
	 * Visit a parse tree produced by {@link creoleParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(@NotNull creoleParser.DocumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link creoleParser#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBold(@NotNull creoleParser.BoldContext ctx);

	/**
	 * Visit a parse tree produced by {@link creoleParser#href}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHref(@NotNull creoleParser.HrefContext ctx);
}