// Generated from Extractedgff3.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Extractedgff3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Extractedgff3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#seqid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqid(@NotNull Extractedgff3Parser.SeqidContext ctx);

	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(@NotNull Extractedgff3Parser.DocumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#commentline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentline(@NotNull Extractedgff3Parser.CommentlineContext ctx);

	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(@NotNull Extractedgff3Parser.SourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull Extractedgff3Parser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#strand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrand(@NotNull Extractedgff3Parser.StrandContext ctx);

	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#score}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScore(@NotNull Extractedgff3Parser.ScoreContext ctx);

	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull Extractedgff3Parser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull Extractedgff3Parser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(@NotNull Extractedgff3Parser.AttributesContext ctx);

	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull Extractedgff3Parser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#dataline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataline(@NotNull Extractedgff3Parser.DatalineContext ctx);

	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#phase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhase(@NotNull Extractedgff3Parser.PhaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Extractedgff3Parser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(@NotNull Extractedgff3Parser.EndContext ctx);
}