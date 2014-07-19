// Generated from creole.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link creoleParser}.
 */
public interface creoleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link creoleParser#tableheader}.
	 * @param ctx the parse tree
	 */
	void enterTableheader(@NotNull creoleParser.TableheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#tableheader}.
	 * @param ctx the parse tree
	 */
	void exitTableheader(@NotNull creoleParser.TableheaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link creoleParser#markup}.
	 * @param ctx the parse tree
	 */
	void enterMarkup(@NotNull creoleParser.MarkupContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#markup}.
	 * @param ctx the parse tree
	 */
	void exitMarkup(@NotNull creoleParser.MarkupContext ctx);

	/**
	 * Enter a parse tree produced by {@link creoleParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(@NotNull creoleParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(@NotNull creoleParser.TextContext ctx);

	/**
	 * Enter a parse tree produced by {@link creoleParser#italics}.
	 * @param ctx the parse tree
	 */
	void enterItalics(@NotNull creoleParser.ItalicsContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#italics}.
	 * @param ctx the parse tree
	 */
	void exitItalics(@NotNull creoleParser.ItalicsContext ctx);

	/**
	 * Enter a parse tree produced by {@link creoleParser#tablerow}.
	 * @param ctx the parse tree
	 */
	void enterTablerow(@NotNull creoleParser.TablerowContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#tablerow}.
	 * @param ctx the parse tree
	 */
	void exitTablerow(@NotNull creoleParser.TablerowContext ctx);

	/**
	 * Enter a parse tree produced by {@link creoleParser#hline}.
	 * @param ctx the parse tree
	 */
	void enterHline(@NotNull creoleParser.HlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#hline}.
	 * @param ctx the parse tree
	 */
	void exitHline(@NotNull creoleParser.HlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link creoleParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull creoleParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull creoleParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link creoleParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(@NotNull creoleParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(@NotNull creoleParser.ImageContext ctx);

	/**
	 * Enter a parse tree produced by {@link creoleParser#listitem}.
	 * @param ctx the parse tree
	 */
	void enterListitem(@NotNull creoleParser.ListitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#listitem}.
	 * @param ctx the parse tree
	 */
	void exitListitem(@NotNull creoleParser.ListitemContext ctx);

	/**
	 * Enter a parse tree produced by {@link creoleParser#nowiki}.
	 * @param ctx the parse tree
	 */
	void enterNowiki(@NotNull creoleParser.NowikiContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#nowiki}.
	 * @param ctx the parse tree
	 */
	void exitNowiki(@NotNull creoleParser.NowikiContext ctx);

	/**
	 * Enter a parse tree produced by {@link creoleParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(@NotNull creoleParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(@NotNull creoleParser.TitleContext ctx);

	/**
	 * Enter a parse tree produced by {@link creoleParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(@NotNull creoleParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(@NotNull creoleParser.DocumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link creoleParser#bold}.
	 * @param ctx the parse tree
	 */
	void enterBold(@NotNull creoleParser.BoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#bold}.
	 * @param ctx the parse tree
	 */
	void exitBold(@NotNull creoleParser.BoldContext ctx);

	/**
	 * Enter a parse tree produced by {@link creoleParser#href}.
	 * @param ctx the parse tree
	 */
	void enterHref(@NotNull creoleParser.HrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#href}.
	 * @param ctx the parse tree
	 */
	void exitHref(@NotNull creoleParser.HrefContext ctx);
}