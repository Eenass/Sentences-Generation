// Generated from ExtractedSampleGrammar.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedSampleGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedSampleGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedSampleGrammarParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD(@NotNull ExtractedSampleGrammarParser.DContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSampleGrammarParser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(@NotNull ExtractedSampleGrammarParser.BContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSampleGrammarParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(@NotNull ExtractedSampleGrammarParser.SContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSampleGrammarParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC(@NotNull ExtractedSampleGrammarParser.CContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSampleGrammarParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(@NotNull ExtractedSampleGrammarParser.AContext ctx);
}