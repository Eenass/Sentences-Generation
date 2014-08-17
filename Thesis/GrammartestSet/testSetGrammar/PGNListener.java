// Generated from PGN.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PGNParser}.
 */
public interface PGNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PGNParser#game_termination}.
	 * @param ctx the parse tree
	 */
	void enterGame_termination(@NotNull PGNParser.Game_terminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#game_termination}.
	 * @param ctx the parse tree
	 */
	void exitGame_termination(@NotNull PGNParser.Game_terminationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull PGNParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull PGNParser.ElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNParser#tag_section}.
	 * @param ctx the parse tree
	 */
	void enterTag_section(@NotNull PGNParser.Tag_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#tag_section}.
	 * @param ctx the parse tree
	 */
	void exitTag_section(@NotNull PGNParser.Tag_sectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNParser#tag_value}.
	 * @param ctx the parse tree
	 */
	void enterTag_value(@NotNull PGNParser.Tag_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#tag_value}.
	 * @param ctx the parse tree
	 */
	void exitTag_value(@NotNull PGNParser.Tag_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNParser#tag_pair}.
	 * @param ctx the parse tree
	 */
	void enterTag_pair(@NotNull PGNParser.Tag_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#tag_pair}.
	 * @param ctx the parse tree
	 */
	void exitTag_pair(@NotNull PGNParser.Tag_pairContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNParser#movetext_section}.
	 * @param ctx the parse tree
	 */
	void enterMovetext_section(@NotNull PGNParser.Movetext_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#movetext_section}.
	 * @param ctx the parse tree
	 */
	void exitMovetext_section(@NotNull PGNParser.Movetext_sectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNParser#move_number_indication}.
	 * @param ctx the parse tree
	 */
	void enterMove_number_indication(@NotNull PGNParser.Move_number_indicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#move_number_indication}.
	 * @param ctx the parse tree
	 */
	void exitMove_number_indication(@NotNull PGNParser.Move_number_indicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNParser#pgn_game}.
	 * @param ctx the parse tree
	 */
	void enterPgn_game(@NotNull PGNParser.Pgn_gameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#pgn_game}.
	 * @param ctx the parse tree
	 */
	void exitPgn_game(@NotNull PGNParser.Pgn_gameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNParser#san_move}.
	 * @param ctx the parse tree
	 */
	void enterSan_move(@NotNull PGNParser.San_moveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#san_move}.
	 * @param ctx the parse tree
	 */
	void exitSan_move(@NotNull PGNParser.San_moveContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNParser#tag_name}.
	 * @param ctx the parse tree
	 */
	void enterTag_name(@NotNull PGNParser.Tag_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#tag_name}.
	 * @param ctx the parse tree
	 */
	void exitTag_name(@NotNull PGNParser.Tag_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull PGNParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull PGNParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNParser#recursive_variation}.
	 * @param ctx the parse tree
	 */
	void enterRecursive_variation(@NotNull PGNParser.Recursive_variationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#recursive_variation}.
	 * @param ctx the parse tree
	 */
	void exitRecursive_variation(@NotNull PGNParser.Recursive_variationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNParser#element_sequence}.
	 * @param ctx the parse tree
	 */
	void enterElement_sequence(@NotNull PGNParser.Element_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#element_sequence}.
	 * @param ctx the parse tree
	 */
	void exitElement_sequence(@NotNull PGNParser.Element_sequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PGNParser#pgn_database}.
	 * @param ctx the parse tree
	 */
	void enterPgn_database(@NotNull PGNParser.Pgn_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#pgn_database}.
	 * @param ctx the parse tree
	 */
	void exitPgn_database(@NotNull PGNParser.Pgn_databaseContext ctx);
}