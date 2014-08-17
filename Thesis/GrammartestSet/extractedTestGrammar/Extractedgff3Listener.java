// Generated from Extractedgff3.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Extractedgff3Parser}.
 */
public interface Extractedgff3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#seqid}.
	 * @param ctx the parse tree
	 */
	void enterSeqid(@NotNull Extractedgff3Parser.SeqidContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#seqid}.
	 * @param ctx the parse tree
	 */
	void exitSeqid(@NotNull Extractedgff3Parser.SeqidContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(@NotNull Extractedgff3Parser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(@NotNull Extractedgff3Parser.DocumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#commentline}.
	 * @param ctx the parse tree
	 */
	void enterCommentline(@NotNull Extractedgff3Parser.CommentlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#commentline}.
	 * @param ctx the parse tree
	 */
	void exitCommentline(@NotNull Extractedgff3Parser.CommentlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(@NotNull Extractedgff3Parser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(@NotNull Extractedgff3Parser.SourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull Extractedgff3Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull Extractedgff3Parser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#strand}.
	 * @param ctx the parse tree
	 */
	void enterStrand(@NotNull Extractedgff3Parser.StrandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#strand}.
	 * @param ctx the parse tree
	 */
	void exitStrand(@NotNull Extractedgff3Parser.StrandContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#score}.
	 * @param ctx the parse tree
	 */
	void enterScore(@NotNull Extractedgff3Parser.ScoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#score}.
	 * @param ctx the parse tree
	 */
	void exitScore(@NotNull Extractedgff3Parser.ScoreContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull Extractedgff3Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull Extractedgff3Parser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull Extractedgff3Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull Extractedgff3Parser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(@NotNull Extractedgff3Parser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(@NotNull Extractedgff3Parser.AttributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull Extractedgff3Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull Extractedgff3Parser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#dataline}.
	 * @param ctx the parse tree
	 */
	void enterDataline(@NotNull Extractedgff3Parser.DatalineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#dataline}.
	 * @param ctx the parse tree
	 */
	void exitDataline(@NotNull Extractedgff3Parser.DatalineContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#phase}.
	 * @param ctx the parse tree
	 */
	void enterPhase(@NotNull Extractedgff3Parser.PhaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#phase}.
	 * @param ctx the parse tree
	 */
	void exitPhase(@NotNull Extractedgff3Parser.PhaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedgff3Parser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(@NotNull Extractedgff3Parser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedgff3Parser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(@NotNull Extractedgff3Parser.EndContext ctx);
}