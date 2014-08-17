// Generated from ExtractedDOT.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedDOTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedDOTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#attr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_stmt(@NotNull ExtractedDOTParser.Attr_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(@NotNull ExtractedDOTParser.PortContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#edgeop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeop(@NotNull ExtractedDOTParser.EdgeopContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(@NotNull ExtractedDOTParser.Stmt_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull ExtractedDOTParser.StmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#edgeRHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeRHS(@NotNull ExtractedDOTParser.EdgeRHSContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#node_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_id(@NotNull ExtractedDOTParser.Node_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull ExtractedDOTParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#subgraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubgraph(@NotNull ExtractedDOTParser.SubgraphContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph(@NotNull ExtractedDOTParser.GraphContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#a_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_list(@NotNull ExtractedDOTParser.A_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#attr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_list(@NotNull ExtractedDOTParser.Attr_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#edge_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_stmt(@NotNull ExtractedDOTParser.Edge_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedDOTParser#node_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_stmt(@NotNull ExtractedDOTParser.Node_stmtContext ctx);
}