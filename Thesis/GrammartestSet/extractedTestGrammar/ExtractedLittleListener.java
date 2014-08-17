// Generated from ExtractedLittle.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedLittleParser}.
 */
public interface ExtractedLittleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedLittleParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(@NotNull ExtractedLittleParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedLittleParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(@NotNull ExtractedLittleParser.EContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedLittleParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(@NotNull ExtractedLittleParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedLittleParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(@NotNull ExtractedLittleParser.SContext ctx);
}