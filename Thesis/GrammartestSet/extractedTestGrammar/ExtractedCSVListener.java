// Generated from ExtractedCSV.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedCSVParser}.
 */
public interface ExtractedCSVListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedCSVParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull ExtractedCSVParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCSVParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull ExtractedCSVParser.FieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCSVParser#hdr}.
	 * @param ctx the parse tree
	 */
	void enterHdr(@NotNull ExtractedCSVParser.HdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCSVParser#hdr}.
	 * @param ctx the parse tree
	 */
	void exitHdr(@NotNull ExtractedCSVParser.HdrContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCSVParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull ExtractedCSVParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCSVParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull ExtractedCSVParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCSVParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(@NotNull ExtractedCSVParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCSVParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(@NotNull ExtractedCSVParser.RowContext ctx);
}