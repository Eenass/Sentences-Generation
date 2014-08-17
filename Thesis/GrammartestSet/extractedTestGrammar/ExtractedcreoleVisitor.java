// Generated from Extractedcreole.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedcreoleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedcreoleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#tableheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableheader(@NotNull ExtractedcreoleParser.TableheaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#markup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkup(@NotNull ExtractedcreoleParser.MarkupContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull ExtractedcreoleParser.TextContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#italics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalics(@NotNull ExtractedcreoleParser.ItalicsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#tablerow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablerow(@NotNull ExtractedcreoleParser.TablerowContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#hline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHline(@NotNull ExtractedcreoleParser.HlineContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull ExtractedcreoleParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(@NotNull ExtractedcreoleParser.ImageContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#listitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListitem(@NotNull ExtractedcreoleParser.ListitemContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#nowiki}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNowiki(@NotNull ExtractedcreoleParser.NowikiContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(@NotNull ExtractedcreoleParser.TitleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(@NotNull ExtractedcreoleParser.DocumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBold(@NotNull ExtractedcreoleParser.BoldContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedcreoleParser#href}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHref(@NotNull ExtractedcreoleParser.HrefContext ctx);
}