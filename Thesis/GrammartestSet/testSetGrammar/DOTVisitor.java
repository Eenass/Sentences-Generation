// Generated from DOT.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DOTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DOTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DOTParser#attr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_stmt(@NotNull DOTParser.Attr_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(@NotNull DOTParser.PortContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#edgeop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeop(@NotNull DOTParser.EdgeopContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(@NotNull DOTParser.Stmt_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull DOTParser.StmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#edgeRHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeRHS(@NotNull DOTParser.EdgeRHSContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#node_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_id(@NotNull DOTParser.Node_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull DOTParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#subgraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubgraph(@NotNull DOTParser.SubgraphContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph(@NotNull DOTParser.GraphContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#a_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_list(@NotNull DOTParser.A_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#attr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_list(@NotNull DOTParser.Attr_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#edge_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_stmt(@NotNull DOTParser.Edge_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#node_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_stmt(@NotNull DOTParser.Node_stmtContext ctx);
}