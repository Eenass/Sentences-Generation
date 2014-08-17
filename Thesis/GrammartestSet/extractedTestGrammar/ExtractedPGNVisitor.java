// Generated from ExtractedPGN.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedPGNParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedPGNVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#game_termination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGame_termination(@NotNull ExtractedPGNParser.Game_terminationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull ExtractedPGNParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#tag_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_section(@NotNull ExtractedPGNParser.Tag_sectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#tag_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_value(@NotNull ExtractedPGNParser.Tag_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#tag_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_pair(@NotNull ExtractedPGNParser.Tag_pairContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#movetext_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovetext_section(@NotNull ExtractedPGNParser.Movetext_sectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#move_number_indication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove_number_indication(@NotNull ExtractedPGNParser.Move_number_indicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#pgn_game}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgn_game(@NotNull ExtractedPGNParser.Pgn_gameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#san_move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSan_move(@NotNull ExtractedPGNParser.San_moveContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#tag_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_name(@NotNull ExtractedPGNParser.Tag_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull ExtractedPGNParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#recursive_variation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursive_variation(@NotNull ExtractedPGNParser.Recursive_variationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#element_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_sequence(@NotNull ExtractedPGNParser.Element_sequenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedPGNParser#pgn_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgn_database(@NotNull ExtractedPGNParser.Pgn_databaseContext ctx);
}