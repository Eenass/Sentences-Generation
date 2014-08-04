// Generated from ExtractedAbnf.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedAbnfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedAbnfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedAbnfParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull ExtractedAbnfParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedAbnfParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(@NotNull ExtractedAbnfParser.RepeatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedAbnfParser#rule_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_(@NotNull ExtractedAbnfParser.Rule_Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedAbnfParser#rulelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulelist(@NotNull ExtractedAbnfParser.RulelistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedAbnfParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(@NotNull ExtractedAbnfParser.GroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedAbnfParser#alternation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternation(@NotNull ExtractedAbnfParser.AlternationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedAbnfParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(@NotNull ExtractedAbnfParser.ConcatenationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedAbnfParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(@NotNull ExtractedAbnfParser.ElementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedAbnfParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(@NotNull ExtractedAbnfParser.OptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedAbnfParser#repetition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetition(@NotNull ExtractedAbnfParser.RepetitionContext ctx);
}