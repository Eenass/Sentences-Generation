// Generated from ExtractedPGN.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedPGNParser}.
 */
public interface ExtractedPGNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#game_termination}.
	 * @param ctx the parse tree
	 */
	void enterGame_termination(@NotNull ExtractedPGNParser.Game_terminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#game_termination}.
	 * @param ctx the parse tree
	 */
	void exitGame_termination(@NotNull ExtractedPGNParser.Game_terminationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull ExtractedPGNParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull ExtractedPGNParser.ElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#tag_section}.
	 * @param ctx the parse tree
	 */
	void enterTag_section(@NotNull ExtractedPGNParser.Tag_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#tag_section}.
	 * @param ctx the parse tree
	 */
	void exitTag_section(@NotNull ExtractedPGNParser.Tag_sectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#tag_value}.
	 * @param ctx the parse tree
	 */
	void enterTag_value(@NotNull ExtractedPGNParser.Tag_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#tag_value}.
	 * @param ctx the parse tree
	 */
	void exitTag_value(@NotNull ExtractedPGNParser.Tag_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#tag_pair}.
	 * @param ctx the parse tree
	 */
	void enterTag_pair(@NotNull ExtractedPGNParser.Tag_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#tag_pair}.
	 * @param ctx the parse tree
	 */
	void exitTag_pair(@NotNull ExtractedPGNParser.Tag_pairContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#movetext_section}.
	 * @param ctx the parse tree
	 */
	void enterMovetext_section(@NotNull ExtractedPGNParser.Movetext_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#movetext_section}.
	 * @param ctx the parse tree
	 */
	void exitMovetext_section(@NotNull ExtractedPGNParser.Movetext_sectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#move_number_indication}.
	 * @param ctx the parse tree
	 */
	void enterMove_number_indication(@NotNull ExtractedPGNParser.Move_number_indicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#move_number_indication}.
	 * @param ctx the parse tree
	 */
	void exitMove_number_indication(@NotNull ExtractedPGNParser.Move_number_indicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#pgn_game}.
	 * @param ctx the parse tree
	 */
	void enterPgn_game(@NotNull ExtractedPGNParser.Pgn_gameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#pgn_game}.
	 * @param ctx the parse tree
	 */
	void exitPgn_game(@NotNull ExtractedPGNParser.Pgn_gameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#san_move}.
	 * @param ctx the parse tree
	 */
	void enterSan_move(@NotNull ExtractedPGNParser.San_moveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#san_move}.
	 * @param ctx the parse tree
	 */
	void exitSan_move(@NotNull ExtractedPGNParser.San_moveContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#tag_name}.
	 * @param ctx the parse tree
	 */
	void enterTag_name(@NotNull ExtractedPGNParser.Tag_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#tag_name}.
	 * @param ctx the parse tree
	 */
	void exitTag_name(@NotNull ExtractedPGNParser.Tag_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull ExtractedPGNParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull ExtractedPGNParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#recursive_variation}.
	 * @param ctx the parse tree
	 */
	void enterRecursive_variation(@NotNull ExtractedPGNParser.Recursive_variationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#recursive_variation}.
	 * @param ctx the parse tree
	 */
	void exitRecursive_variation(@NotNull ExtractedPGNParser.Recursive_variationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#element_sequence}.
	 * @param ctx the parse tree
	 */
	void enterElement_sequence(@NotNull ExtractedPGNParser.Element_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#element_sequence}.
	 * @param ctx the parse tree
	 */
	void exitElement_sequence(@NotNull ExtractedPGNParser.Element_sequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedPGNParser#pgn_database}.
	 * @param ctx the parse tree
	 */
	void enterPgn_database(@NotNull ExtractedPGNParser.Pgn_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedPGNParser#pgn_database}.
	 * @param ctx the parse tree
	 */
	void exitPgn_database(@NotNull ExtractedPGNParser.Pgn_databaseContext ctx);
}