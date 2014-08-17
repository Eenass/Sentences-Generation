// Generated from fasta.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fastaParser}.
 */
public interface fastaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fastaParser#commentline}.
	 * @param ctx the parse tree
	 */
	void enterCommentline(@NotNull fastaParser.CommentlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link fastaParser#commentline}.
	 * @param ctx the parse tree
	 */
	void exitCommentline(@NotNull fastaParser.CommentlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link fastaParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(@NotNull fastaParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link fastaParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(@NotNull fastaParser.SequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link fastaParser#sequencelines}.
	 * @param ctx the parse tree
	 */
	void enterSequencelines(@NotNull fastaParser.SequencelinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link fastaParser#sequencelines}.
	 * @param ctx the parse tree
	 */
	void exitSequencelines(@NotNull fastaParser.SequencelinesContext ctx);

	/**
	 * Enter a parse tree produced by {@link fastaParser#descriptionline}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionline(@NotNull fastaParser.DescriptionlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link fastaParser#descriptionline}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionline(@NotNull fastaParser.DescriptionlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link fastaParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(@NotNull fastaParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fastaParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(@NotNull fastaParser.SectionContext ctx);
}