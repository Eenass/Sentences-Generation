// Generated from ExtractedCSV.g4 by ANTLR 4.1
package testGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedCSVParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedCSVVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedCSVParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(@NotNull ExtractedCSVParser.FieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCSVParser#hdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHdr(@NotNull ExtractedCSVParser.HdrContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCSVParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(@NotNull ExtractedCSVParser.FileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCSVParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(@NotNull ExtractedCSVParser.RowContext ctx);
}