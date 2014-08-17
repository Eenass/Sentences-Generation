// Generated from gff3.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gff3Parser}.
 */
public interface gff3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gff3Parser#seqid}.
	 * @param ctx the parse tree
	 */
	void enterSeqid(@NotNull gff3Parser.SeqidContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#seqid}.
	 * @param ctx the parse tree
	 */
	void exitSeqid(@NotNull gff3Parser.SeqidContext ctx);

	/**
	 * Enter a parse tree produced by {@link gff3Parser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(@NotNull gff3Parser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(@NotNull gff3Parser.DocumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link gff3Parser#commentline}.
	 * @param ctx the parse tree
	 */
	void enterCommentline(@NotNull gff3Parser.CommentlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#commentline}.
	 * @param ctx the parse tree
	 */
	void exitCommentline(@NotNull gff3Parser.CommentlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link gff3Parser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(@NotNull gff3Parser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(@NotNull gff3Parser.SourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link gff3Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull gff3Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull gff3Parser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link gff3Parser#strand}.
	 * @param ctx the parse tree
	 */
	void enterStrand(@NotNull gff3Parser.StrandContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#strand}.
	 * @param ctx the parse tree
	 */
	void exitStrand(@NotNull gff3Parser.StrandContext ctx);

	/**
	 * Enter a parse tree produced by {@link gff3Parser#score}.
	 * @param ctx the parse tree
	 */
	void enterScore(@NotNull gff3Parser.ScoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#score}.
	 * @param ctx the parse tree
	 */
	void exitScore(@NotNull gff3Parser.ScoreContext ctx);

	/**
	 * Enter a parse tree produced by {@link gff3Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull gff3Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull gff3Parser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link gff3Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull gff3Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull gff3Parser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link gff3Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(@NotNull gff3Parser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(@NotNull gff3Parser.AttributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link gff3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull gff3Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull gff3Parser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link gff3Parser#dataline}.
	 * @param ctx the parse tree
	 */
	void enterDataline(@NotNull gff3Parser.DatalineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#dataline}.
	 * @param ctx the parse tree
	 */
	void exitDataline(@NotNull gff3Parser.DatalineContext ctx);

	/**
	 * Enter a parse tree produced by {@link gff3Parser#phase}.
	 * @param ctx the parse tree
	 */
	void enterPhase(@NotNull gff3Parser.PhaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#phase}.
	 * @param ctx the parse tree
	 */
	void exitPhase(@NotNull gff3Parser.PhaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link gff3Parser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(@NotNull gff3Parser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(@NotNull gff3Parser.EndContext ctx);
}