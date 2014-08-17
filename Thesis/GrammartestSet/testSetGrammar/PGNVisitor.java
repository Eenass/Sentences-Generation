// Generated from PGN.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PGNParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PGNVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PGNParser#game_termination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGame_termination(@NotNull PGNParser.Game_terminationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull PGNParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNParser#tag_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_section(@NotNull PGNParser.Tag_sectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNParser#tag_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_value(@NotNull PGNParser.Tag_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNParser#tag_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_pair(@NotNull PGNParser.Tag_pairContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNParser#movetext_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovetext_section(@NotNull PGNParser.Movetext_sectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNParser#move_number_indication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove_number_indication(@NotNull PGNParser.Move_number_indicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNParser#pgn_game}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgn_game(@NotNull PGNParser.Pgn_gameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNParser#san_move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSan_move(@NotNull PGNParser.San_moveContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNParser#tag_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_name(@NotNull PGNParser.Tag_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull PGNParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNParser#recursive_variation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursive_variation(@NotNull PGNParser.Recursive_variationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNParser#element_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_sequence(@NotNull PGNParser.Element_sequenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link PGNParser#pgn_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgn_database(@NotNull PGNParser.Pgn_databaseContext ctx);
}