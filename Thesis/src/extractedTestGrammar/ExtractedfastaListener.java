// Generated from Extractedfasta.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedfastaParser}.
 */
public interface ExtractedfastaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedfastaParser#commentline}.
	 * @param ctx the parse tree
	 */
	void enterCommentline(@NotNull ExtractedfastaParser.CommentlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedfastaParser#commentline}.
	 * @param ctx the parse tree
	 */
	void exitCommentline(@NotNull ExtractedfastaParser.CommentlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedfastaParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(@NotNull ExtractedfastaParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedfastaParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(@NotNull ExtractedfastaParser.SequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedfastaParser#sequencelines}.
	 * @param ctx the parse tree
	 */
	void enterSequencelines(@NotNull ExtractedfastaParser.SequencelinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedfastaParser#sequencelines}.
	 * @param ctx the parse tree
	 */
	void exitSequencelines(@NotNull ExtractedfastaParser.SequencelinesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedfastaParser#descriptionline}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionline(@NotNull ExtractedfastaParser.DescriptionlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedfastaParser#descriptionline}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionline(@NotNull ExtractedfastaParser.DescriptionlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedfastaParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(@NotNull ExtractedfastaParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedfastaParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(@NotNull ExtractedfastaParser.SectionContext ctx);
}