// Generated from Extractedbnf.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedbnfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedbnfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedbnfParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull ExtractedbnfParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedbnfParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull ExtractedbnfParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedbnfParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull ExtractedbnfParser.TextContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedbnfParser#captext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptext(@NotNull ExtractedbnfParser.CaptextContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedbnfParser#optional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional(@NotNull ExtractedbnfParser.OptionalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedbnfParser#alternatives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternatives(@NotNull ExtractedbnfParser.AlternativesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedbnfParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(@NotNull ExtractedbnfParser.AlternativeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedbnfParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(@NotNull ExtractedbnfParser.RhsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedbnfParser#rule_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_(@NotNull ExtractedbnfParser.Rule_Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedbnfParser#rulelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulelist(@NotNull ExtractedbnfParser.RulelistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedbnfParser#oneormore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneormore(@NotNull ExtractedbnfParser.OneormoreContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedbnfParser#zeroormore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroormore(@NotNull ExtractedbnfParser.ZeroormoreContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedbnfParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(@NotNull ExtractedbnfParser.LhsContext ctx);
}