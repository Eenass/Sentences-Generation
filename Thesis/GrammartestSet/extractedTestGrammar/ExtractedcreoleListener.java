// Generated from Extractedcreole.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedcreoleParser}.
 */
public interface ExtractedcreoleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#tableheader}.
	 * @param ctx the parse tree
	 */
	void enterTableheader(@NotNull ExtractedcreoleParser.TableheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#tableheader}.
	 * @param ctx the parse tree
	 */
	void exitTableheader(@NotNull ExtractedcreoleParser.TableheaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#markup}.
	 * @param ctx the parse tree
	 */
	void enterMarkup(@NotNull ExtractedcreoleParser.MarkupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#markup}.
	 * @param ctx the parse tree
	 */
	void exitMarkup(@NotNull ExtractedcreoleParser.MarkupContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(@NotNull ExtractedcreoleParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(@NotNull ExtractedcreoleParser.TextContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#italics}.
	 * @param ctx the parse tree
	 */
	void enterItalics(@NotNull ExtractedcreoleParser.ItalicsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#italics}.
	 * @param ctx the parse tree
	 */
	void exitItalics(@NotNull ExtractedcreoleParser.ItalicsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#tablerow}.
	 * @param ctx the parse tree
	 */
	void enterTablerow(@NotNull ExtractedcreoleParser.TablerowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#tablerow}.
	 * @param ctx the parse tree
	 */
	void exitTablerow(@NotNull ExtractedcreoleParser.TablerowContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#hline}.
	 * @param ctx the parse tree
	 */
	void enterHline(@NotNull ExtractedcreoleParser.HlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#hline}.
	 * @param ctx the parse tree
	 */
	void exitHline(@NotNull ExtractedcreoleParser.HlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull ExtractedcreoleParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull ExtractedcreoleParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(@NotNull ExtractedcreoleParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(@NotNull ExtractedcreoleParser.ImageContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#listitem}.
	 * @param ctx the parse tree
	 */
	void enterListitem(@NotNull ExtractedcreoleParser.ListitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#listitem}.
	 * @param ctx the parse tree
	 */
	void exitListitem(@NotNull ExtractedcreoleParser.ListitemContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#nowiki}.
	 * @param ctx the parse tree
	 */
	void enterNowiki(@NotNull ExtractedcreoleParser.NowikiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#nowiki}.
	 * @param ctx the parse tree
	 */
	void exitNowiki(@NotNull ExtractedcreoleParser.NowikiContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(@NotNull ExtractedcreoleParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(@NotNull ExtractedcreoleParser.TitleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(@NotNull ExtractedcreoleParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(@NotNull ExtractedcreoleParser.DocumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#bold}.
	 * @param ctx the parse tree
	 */
	void enterBold(@NotNull ExtractedcreoleParser.BoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#bold}.
	 * @param ctx the parse tree
	 */
	void exitBold(@NotNull ExtractedcreoleParser.BoldContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedcreoleParser#href}.
	 * @param ctx the parse tree
	 */
	void enterHref(@NotNull ExtractedcreoleParser.HrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedcreoleParser#href}.
	 * @param ctx the parse tree
	 */
	void exitHref(@NotNull ExtractedcreoleParser.HrefContext ctx);
}