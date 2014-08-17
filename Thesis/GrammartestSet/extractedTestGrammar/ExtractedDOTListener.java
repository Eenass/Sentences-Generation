// Generated from ExtractedDOT.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedDOTParser}.
 */
public interface ExtractedDOTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttr_stmt(@NotNull ExtractedDOTParser.Attr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttr_stmt(@NotNull ExtractedDOTParser.Attr_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(@NotNull ExtractedDOTParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(@NotNull ExtractedDOTParser.PortContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#edgeop}.
	 * @param ctx the parse tree
	 */
	void enterEdgeop(@NotNull ExtractedDOTParser.EdgeopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#edgeop}.
	 * @param ctx the parse tree
	 */
	void exitEdgeop(@NotNull ExtractedDOTParser.EdgeopContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(@NotNull ExtractedDOTParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(@NotNull ExtractedDOTParser.Stmt_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull ExtractedDOTParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull ExtractedDOTParser.StmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	void enterEdgeRHS(@NotNull ExtractedDOTParser.EdgeRHSContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	void exitEdgeRHS(@NotNull ExtractedDOTParser.EdgeRHSContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#node_id}.
	 * @param ctx the parse tree
	 */
	void enterNode_id(@NotNull ExtractedDOTParser.Node_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#node_id}.
	 * @param ctx the parse tree
	 */
	void exitNode_id(@NotNull ExtractedDOTParser.Node_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull ExtractedDOTParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull ExtractedDOTParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#subgraph}.
	 * @param ctx the parse tree
	 */
	void enterSubgraph(@NotNull ExtractedDOTParser.SubgraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#subgraph}.
	 * @param ctx the parse tree
	 */
	void exitSubgraph(@NotNull ExtractedDOTParser.SubgraphContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(@NotNull ExtractedDOTParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(@NotNull ExtractedDOTParser.GraphContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#a_list}.
	 * @param ctx the parse tree
	 */
	void enterA_list(@NotNull ExtractedDOTParser.A_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#a_list}.
	 * @param ctx the parse tree
	 */
	void exitA_list(@NotNull ExtractedDOTParser.A_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void enterAttr_list(@NotNull ExtractedDOTParser.Attr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void exitAttr_list(@NotNull ExtractedDOTParser.Attr_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEdge_stmt(@NotNull ExtractedDOTParser.Edge_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEdge_stmt(@NotNull ExtractedDOTParser.Edge_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedDOTParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNode_stmt(@NotNull ExtractedDOTParser.Node_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedDOTParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNode_stmt(@NotNull ExtractedDOTParser.Node_stmtContext ctx);
}