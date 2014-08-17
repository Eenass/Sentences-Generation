// Generated from bnf.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bnfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bnfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bnfParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull bnfParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link bnfParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull bnfParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link bnfParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull bnfParser.TextContext ctx);

	/**
	 * Visit a parse tree produced by {@link bnfParser#captext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptext(@NotNull bnfParser.CaptextContext ctx);

	/**
	 * Visit a parse tree produced by {@link bnfParser#optional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional(@NotNull bnfParser.OptionalContext ctx);

	/**
	 * Visit a parse tree produced by {@link bnfParser#alternatives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternatives(@NotNull bnfParser.AlternativesContext ctx);

	/**
	 * Visit a parse tree produced by {@link bnfParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(@NotNull bnfParser.AlternativeContext ctx);

	/**
	 * Visit a parse tree produced by {@link bnfParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(@NotNull bnfParser.RhsContext ctx);

	/**
	 * Visit a parse tree produced by {@link bnfParser#rule_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_(@NotNull bnfParser.Rule_Context ctx);

	/**
	 * Visit a parse tree produced by {@link bnfParser#rulelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulelist(@NotNull bnfParser.RulelistContext ctx);

	/**
	 * Visit a parse tree produced by {@link bnfParser#oneormore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneormore(@NotNull bnfParser.OneormoreContext ctx);

	/**
	 * Visit a parse tree produced by {@link bnfParser#zeroormore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroormore(@NotNull bnfParser.ZeroormoreContext ctx);

	/**
	 * Visit a parse tree produced by {@link bnfParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(@NotNull bnfParser.LhsContext ctx);
}