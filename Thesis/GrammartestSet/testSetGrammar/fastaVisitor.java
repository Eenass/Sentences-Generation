// Generated from fasta.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fastaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fastaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fastaParser#commentline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentline(@NotNull fastaParser.CommentlineContext ctx);

	/**
	 * Visit a parse tree produced by {@link fastaParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(@NotNull fastaParser.SequenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link fastaParser#sequencelines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequencelines(@NotNull fastaParser.SequencelinesContext ctx);

	/**
	 * Visit a parse tree produced by {@link fastaParser#descriptionline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionline(@NotNull fastaParser.DescriptionlineContext ctx);

	/**
	 * Visit a parse tree produced by {@link fastaParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(@NotNull fastaParser.SectionContext ctx);
}