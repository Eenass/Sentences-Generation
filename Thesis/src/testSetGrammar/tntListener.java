// Generated from tnt.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tntParser}.
 */
public interface tntListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull tntParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull tntParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link tntParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull tntParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull tntParser.AtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link tntParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(@NotNull tntParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(@NotNull tntParser.EquationContext ctx);

	/**
	 * Enter a parse tree produced by {@link tntParser#exists}.
	 * @param ctx the parse tree
	 */
	void enterExists(@NotNull tntParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#exists}.
	 * @param ctx the parse tree
	 */
	void exitExists(@NotNull tntParser.ExistsContext ctx);

	/**
	 * Enter a parse tree produced by {@link tntParser#forevery}.
	 * @param ctx the parse tree
	 */
	void enterForevery(@NotNull tntParser.ForeveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#forevery}.
	 * @param ctx the parse tree
	 */
	void exitForevery(@NotNull tntParser.ForeveryContext ctx);

	/**
	 * Enter a parse tree produced by {@link tntParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull tntParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull tntParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link tntParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull tntParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull tntParser.VariableContext ctx);
}