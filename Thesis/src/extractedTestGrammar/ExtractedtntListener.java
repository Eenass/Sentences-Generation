// Generated from Extractedtnt.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedtntParser}.
 */
public interface ExtractedtntListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedtntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ExtractedtntParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedtntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ExtractedtntParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedtntParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull ExtractedtntParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedtntParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull ExtractedtntParser.AtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedtntParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(@NotNull ExtractedtntParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedtntParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(@NotNull ExtractedtntParser.EquationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedtntParser#exists}.
	 * @param ctx the parse tree
	 */
	void enterExists(@NotNull ExtractedtntParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedtntParser#exists}.
	 * @param ctx the parse tree
	 */
	void exitExists(@NotNull ExtractedtntParser.ExistsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedtntParser#forevery}.
	 * @param ctx the parse tree
	 */
	void enterForevery(@NotNull ExtractedtntParser.ForeveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedtntParser#forevery}.
	 * @param ctx the parse tree
	 */
	void exitForevery(@NotNull ExtractedtntParser.ForeveryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedtntParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull ExtractedtntParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedtntParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull ExtractedtntParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedtntParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ExtractedtntParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedtntParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ExtractedtntParser.VariableContext ctx);
}