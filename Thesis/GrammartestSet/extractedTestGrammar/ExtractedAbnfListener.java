// Generated from ExtractedAbnf.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedAbnfParser}.
 */
public interface ExtractedAbnfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedAbnfParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull ExtractedAbnfParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedAbnfParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull ExtractedAbnfParser.ElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedAbnfParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(@NotNull ExtractedAbnfParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedAbnfParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(@NotNull ExtractedAbnfParser.RepeatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedAbnfParser#rule_}.
	 * @param ctx the parse tree
	 */
	void enterRule_(@NotNull ExtractedAbnfParser.Rule_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedAbnfParser#rule_}.
	 * @param ctx the parse tree
	 */
	void exitRule_(@NotNull ExtractedAbnfParser.Rule_Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedAbnfParser#rulelist}.
	 * @param ctx the parse tree
	 */
	void enterRulelist(@NotNull ExtractedAbnfParser.RulelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedAbnfParser#rulelist}.
	 * @param ctx the parse tree
	 */
	void exitRulelist(@NotNull ExtractedAbnfParser.RulelistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedAbnfParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(@NotNull ExtractedAbnfParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedAbnfParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(@NotNull ExtractedAbnfParser.GroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedAbnfParser#alternation}.
	 * @param ctx the parse tree
	 */
	void enterAlternation(@NotNull ExtractedAbnfParser.AlternationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedAbnfParser#alternation}.
	 * @param ctx the parse tree
	 */
	void exitAlternation(@NotNull ExtractedAbnfParser.AlternationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedAbnfParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(@NotNull ExtractedAbnfParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedAbnfParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(@NotNull ExtractedAbnfParser.ConcatenationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedAbnfParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(@NotNull ExtractedAbnfParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedAbnfParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(@NotNull ExtractedAbnfParser.ElementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedAbnfParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(@NotNull ExtractedAbnfParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedAbnfParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(@NotNull ExtractedAbnfParser.OptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedAbnfParser#repetition}.
	 * @param ctx the parse tree
	 */
	void enterRepetition(@NotNull ExtractedAbnfParser.RepetitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedAbnfParser#repetition}.
	 * @param ctx the parse tree
	 */
	void exitRepetition(@NotNull ExtractedAbnfParser.RepetitionContext ctx);
}