// Generated from Abnf.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AbnfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AbnfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AbnfParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull AbnfParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link AbnfParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(@NotNull AbnfParser.RepeatContext ctx);

	/**
	 * Visit a parse tree produced by {@link AbnfParser#rule_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_(@NotNull AbnfParser.Rule_Context ctx);

	/**
	 * Visit a parse tree produced by {@link AbnfParser#rulelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulelist(@NotNull AbnfParser.RulelistContext ctx);

	/**
	 * Visit a parse tree produced by {@link AbnfParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(@NotNull AbnfParser.GroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link AbnfParser#alternation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternation(@NotNull AbnfParser.AlternationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AbnfParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(@NotNull AbnfParser.ConcatenationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AbnfParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(@NotNull AbnfParser.ElementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link AbnfParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(@NotNull AbnfParser.OptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AbnfParser#repetition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetition(@NotNull AbnfParser.RepetitionContext ctx);
}