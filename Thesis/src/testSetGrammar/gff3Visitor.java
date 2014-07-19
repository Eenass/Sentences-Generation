// Generated from gff3.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gff3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gff3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gff3Parser#seqid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqid(@NotNull gff3Parser.SeqidContext ctx);

	/**
	 * Visit a parse tree produced by {@link gff3Parser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(@NotNull gff3Parser.DocumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link gff3Parser#commentline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentline(@NotNull gff3Parser.CommentlineContext ctx);

	/**
	 * Visit a parse tree produced by {@link gff3Parser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(@NotNull gff3Parser.SourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link gff3Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull gff3Parser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link gff3Parser#strand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrand(@NotNull gff3Parser.StrandContext ctx);

	/**
	 * Visit a parse tree produced by {@link gff3Parser#score}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScore(@NotNull gff3Parser.ScoreContext ctx);

	/**
	 * Visit a parse tree produced by {@link gff3Parser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull gff3Parser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link gff3Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull gff3Parser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link gff3Parser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(@NotNull gff3Parser.AttributesContext ctx);

	/**
	 * Visit a parse tree produced by {@link gff3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull gff3Parser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link gff3Parser#dataline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataline(@NotNull gff3Parser.DatalineContext ctx);

	/**
	 * Visit a parse tree produced by {@link gff3Parser#phase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhase(@NotNull gff3Parser.PhaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link gff3Parser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(@NotNull gff3Parser.EndContext ctx);
}