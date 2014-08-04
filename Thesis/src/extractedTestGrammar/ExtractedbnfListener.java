// Generated from Extractedbnf.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedbnfParser}.
 */
public interface ExtractedbnfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedbnfParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull ExtractedbnfParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedbnfParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull ExtractedbnfParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedbnfParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull ExtractedbnfParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedbnfParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull ExtractedbnfParser.ElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedbnfParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(@NotNull ExtractedbnfParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedbnfParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(@NotNull ExtractedbnfParser.TextContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedbnfParser#captext}.
	 * @param ctx the parse tree
	 */
	void enterCaptext(@NotNull ExtractedbnfParser.CaptextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedbnfParser#captext}.
	 * @param ctx the parse tree
	 */
	void exitCaptext(@NotNull ExtractedbnfParser.CaptextContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedbnfParser#optional}.
	 * @param ctx the parse tree
	 */
	void enterOptional(@NotNull ExtractedbnfParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedbnfParser#optional}.
	 * @param ctx the parse tree
	 */
	void exitOptional(@NotNull ExtractedbnfParser.OptionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedbnfParser#alternatives}.
	 * @param ctx the parse tree
	 */
	void enterAlternatives(@NotNull ExtractedbnfParser.AlternativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedbnfParser#alternatives}.
	 * @param ctx the parse tree
	 */
	void exitAlternatives(@NotNull ExtractedbnfParser.AlternativesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedbnfParser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(@NotNull ExtractedbnfParser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedbnfParser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(@NotNull ExtractedbnfParser.AlternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedbnfParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(@NotNull ExtractedbnfParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedbnfParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(@NotNull ExtractedbnfParser.RhsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedbnfParser#rule_}.
	 * @param ctx the parse tree
	 */
	void enterRule_(@NotNull ExtractedbnfParser.Rule_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedbnfParser#rule_}.
	 * @param ctx the parse tree
	 */
	void exitRule_(@NotNull ExtractedbnfParser.Rule_Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedbnfParser#rulelist}.
	 * @param ctx the parse tree
	 */
	void enterRulelist(@NotNull ExtractedbnfParser.RulelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedbnfParser#rulelist}.
	 * @param ctx the parse tree
	 */
	void exitRulelist(@NotNull ExtractedbnfParser.RulelistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedbnfParser#oneormore}.
	 * @param ctx the parse tree
	 */
	void enterOneormore(@NotNull ExtractedbnfParser.OneormoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedbnfParser#oneormore}.
	 * @param ctx the parse tree
	 */
	void exitOneormore(@NotNull ExtractedbnfParser.OneormoreContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedbnfParser#zeroormore}.
	 * @param ctx the parse tree
	 */
	void enterZeroormore(@NotNull ExtractedbnfParser.ZeroormoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedbnfParser#zeroormore}.
	 * @param ctx the parse tree
	 */
	void exitZeroormore(@NotNull ExtractedbnfParser.ZeroormoreContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedbnfParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(@NotNull ExtractedbnfParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedbnfParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(@NotNull ExtractedbnfParser.LhsContext ctx);
}