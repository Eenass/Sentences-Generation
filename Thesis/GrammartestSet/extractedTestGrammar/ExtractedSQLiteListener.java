// Generated from ExtractedSQLite.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedSQLiteParser}.
 */
public interface ExtractedSQLiteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(@NotNull ExtractedSQLiteParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(@NotNull ExtractedSQLiteParser.Insert_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(@NotNull ExtractedSQLiteParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(@NotNull ExtractedSQLiteParser.Sql_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(@NotNull ExtractedSQLiteParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(@NotNull ExtractedSQLiteParser.Table_or_index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(@NotNull ExtractedSQLiteParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(@NotNull ExtractedSQLiteParser.Compound_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(@NotNull ExtractedSQLiteParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(@NotNull ExtractedSQLiteParser.Indexed_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(@NotNull ExtractedSQLiteParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(@NotNull ExtractedSQLiteParser.Create_index_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(@NotNull ExtractedSQLiteParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(@NotNull ExtractedSQLiteParser.Rollback_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull ExtractedSQLiteParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull ExtractedSQLiteParser.Column_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(@NotNull ExtractedSQLiteParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(@NotNull ExtractedSQLiteParser.Qualified_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(@NotNull ExtractedSQLiteParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(@NotNull ExtractedSQLiteParser.Savepoint_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(@NotNull ExtractedSQLiteParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(@NotNull ExtractedSQLiteParser.Result_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(@NotNull ExtractedSQLiteParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(@NotNull ExtractedSQLiteParser.Error_messageContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(@NotNull ExtractedSQLiteParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(@NotNull ExtractedSQLiteParser.Select_coreContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(@NotNull ExtractedSQLiteParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(@NotNull ExtractedSQLiteParser.Create_trigger_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull ExtractedSQLiteParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull ExtractedSQLiteParser.Function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(@NotNull ExtractedSQLiteParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(@NotNull ExtractedSQLiteParser.Sql_stmt_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(@NotNull ExtractedSQLiteParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(@NotNull ExtractedSQLiteParser.Drop_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(@NotNull ExtractedSQLiteParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(@NotNull ExtractedSQLiteParser.Any_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(@NotNull ExtractedSQLiteParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(@NotNull ExtractedSQLiteParser.Database_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(@NotNull ExtractedSQLiteParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(@NotNull ExtractedSQLiteParser.Module_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(@NotNull ExtractedSQLiteParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(@NotNull ExtractedSQLiteParser.Join_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(@NotNull ExtractedSQLiteParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(@NotNull ExtractedSQLiteParser.Vacuum_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(@NotNull ExtractedSQLiteParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(@NotNull ExtractedSQLiteParser.Factored_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(@NotNull ExtractedSQLiteParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(@NotNull ExtractedSQLiteParser.Transaction_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(@NotNull ExtractedSQLiteParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(@NotNull ExtractedSQLiteParser.Cte_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull ExtractedSQLiteParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull ExtractedSQLiteParser.Unary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(@NotNull ExtractedSQLiteParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(@NotNull ExtractedSQLiteParser.Common_table_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(@NotNull ExtractedSQLiteParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(@NotNull ExtractedSQLiteParser.Drop_trigger_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(@NotNull ExtractedSQLiteParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(@NotNull ExtractedSQLiteParser.New_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull ExtractedSQLiteParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull ExtractedSQLiteParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(@NotNull ExtractedSQLiteParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(@NotNull ExtractedSQLiteParser.Table_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(@NotNull ExtractedSQLiteParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(@NotNull ExtractedSQLiteParser.Module_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(@NotNull ExtractedSQLiteParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(@NotNull ExtractedSQLiteParser.Commit_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(@NotNull ExtractedSQLiteParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(@NotNull ExtractedSQLiteParser.Trigger_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(@NotNull ExtractedSQLiteParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(@NotNull ExtractedSQLiteParser.Create_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(@NotNull ExtractedSQLiteParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(@NotNull ExtractedSQLiteParser.Pragma_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(@NotNull ExtractedSQLiteParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(@NotNull ExtractedSQLiteParser.Column_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(@NotNull ExtractedSQLiteParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(@NotNull ExtractedSQLiteParser.Savepoint_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(@NotNull ExtractedSQLiteParser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(@NotNull ExtractedSQLiteParser.Detach_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(@NotNull ExtractedSQLiteParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(@NotNull ExtractedSQLiteParser.Column_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(@NotNull ExtractedSQLiteParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(@NotNull ExtractedSQLiteParser.Table_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(@NotNull ExtractedSQLiteParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(@NotNull ExtractedSQLiteParser.Column_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(@NotNull ExtractedSQLiteParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(@NotNull ExtractedSQLiteParser.Delete_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(@NotNull ExtractedSQLiteParser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(@NotNull ExtractedSQLiteParser.Release_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(@NotNull ExtractedSQLiteParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(@NotNull ExtractedSQLiteParser.Foreign_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(@NotNull ExtractedSQLiteParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(@NotNull ExtractedSQLiteParser.Create_view_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ExtractedSQLiteParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ExtractedSQLiteParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(@NotNull ExtractedSQLiteParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(@NotNull ExtractedSQLiteParser.Signed_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(@NotNull ExtractedSQLiteParser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(@NotNull ExtractedSQLiteParser.Delete_stmt_limitedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull ExtractedSQLiteParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull ExtractedSQLiteParser.Index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(@NotNull ExtractedSQLiteParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(@NotNull ExtractedSQLiteParser.Select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(@NotNull ExtractedSQLiteParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(@NotNull ExtractedSQLiteParser.Create_virtual_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(@NotNull ExtractedSQLiteParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(@NotNull ExtractedSQLiteParser.Alter_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(@NotNull ExtractedSQLiteParser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(@NotNull ExtractedSQLiteParser.Attach_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(@NotNull ExtractedSQLiteParser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(@NotNull ExtractedSQLiteParser.Pragma_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull ExtractedSQLiteParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull ExtractedSQLiteParser.Table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull ExtractedSQLiteParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull ExtractedSQLiteParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(@NotNull ExtractedSQLiteParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(@NotNull ExtractedSQLiteParser.Join_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(@NotNull ExtractedSQLiteParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(@NotNull ExtractedSQLiteParser.Reindex_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull ExtractedSQLiteParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull ExtractedSQLiteParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(@NotNull ExtractedSQLiteParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(@NotNull ExtractedSQLiteParser.Begin_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(@NotNull ExtractedSQLiteParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(@NotNull ExtractedSQLiteParser.Table_or_subqueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(@NotNull ExtractedSQLiteParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(@NotNull ExtractedSQLiteParser.ErrorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(@NotNull ExtractedSQLiteParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(@NotNull ExtractedSQLiteParser.Ordering_termContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull ExtractedSQLiteParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull ExtractedSQLiteParser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(@NotNull ExtractedSQLiteParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(@NotNull ExtractedSQLiteParser.With_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(@NotNull ExtractedSQLiteParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(@NotNull ExtractedSQLiteParser.Pragma_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(@NotNull ExtractedSQLiteParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(@NotNull ExtractedSQLiteParser.Select_or_valuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(@NotNull ExtractedSQLiteParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(@NotNull ExtractedSQLiteParser.Simple_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(@NotNull ExtractedSQLiteParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(@NotNull ExtractedSQLiteParser.View_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(@NotNull ExtractedSQLiteParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(@NotNull ExtractedSQLiteParser.Join_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(@NotNull ExtractedSQLiteParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(@NotNull ExtractedSQLiteParser.Foreign_key_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(@NotNull ExtractedSQLiteParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(@NotNull ExtractedSQLiteParser.Literal_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(@NotNull ExtractedSQLiteParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(@NotNull ExtractedSQLiteParser.Drop_index_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(@NotNull ExtractedSQLiteParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(@NotNull ExtractedSQLiteParser.Compound_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(@NotNull ExtractedSQLiteParser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(@NotNull ExtractedSQLiteParser.Update_stmt_limitedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(@NotNull ExtractedSQLiteParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(@NotNull ExtractedSQLiteParser.Collation_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(@NotNull ExtractedSQLiteParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(@NotNull ExtractedSQLiteParser.Update_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(@NotNull ExtractedSQLiteParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(@NotNull ExtractedSQLiteParser.Drop_view_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(@NotNull ExtractedSQLiteParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(@NotNull ExtractedSQLiteParser.Raise_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(@NotNull ExtractedSQLiteParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(@NotNull ExtractedSQLiteParser.Conflict_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSQLiteParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(@NotNull ExtractedSQLiteParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSQLiteParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(@NotNull ExtractedSQLiteParser.Analyze_stmtContext ctx);
}