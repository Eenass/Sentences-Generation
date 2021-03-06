// Generated from ExtractedLittle.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedLittleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedLittleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedLittleParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(@NotNull ExtractedLittleParser.EContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedLittleParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(@NotNull ExtractedLittleParser.SContext ctx);
}