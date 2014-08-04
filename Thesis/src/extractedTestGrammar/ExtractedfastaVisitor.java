// Generated from Extractedfasta.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedfastaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedfastaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedfastaParser#commentline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentline(@NotNull ExtractedfastaParser.CommentlineContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedfastaParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(@NotNull ExtractedfastaParser.SequenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedfastaParser#sequencelines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequencelines(@NotNull ExtractedfastaParser.SequencelinesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedfastaParser#descriptionline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionline(@NotNull ExtractedfastaParser.DescriptionlineContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedfastaParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(@NotNull ExtractedfastaParser.SectionContext ctx);
}