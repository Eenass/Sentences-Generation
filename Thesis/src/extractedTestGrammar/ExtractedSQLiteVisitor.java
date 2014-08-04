// Generated from ExtractedSQLite.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedSQLiteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedSQLiteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(@NotNull ExtractedSQLiteParser.Insert_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(@NotNull ExtractedSQLiteParser.Sql_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(@NotNull ExtractedSQLiteParser.Table_or_index_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_operator(@NotNull ExtractedSQLiteParser.Compound_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(@NotNull ExtractedSQLiteParser.Indexed_columnContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(@NotNull ExtractedSQLiteParser.Create_index_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(@NotNull ExtractedSQLiteParser.Rollback_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(@NotNull ExtractedSQLiteParser.Column_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(@NotNull ExtractedSQLiteParser.Qualified_table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(@NotNull ExtractedSQLiteParser.Savepoint_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(@NotNull ExtractedSQLiteParser.Result_columnContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(@NotNull ExtractedSQLiteParser.Error_messageContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(@NotNull ExtractedSQLiteParser.Select_coreContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger_stmt(@NotNull ExtractedSQLiteParser.Create_trigger_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(@NotNull ExtractedSQLiteParser.Function_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(@NotNull ExtractedSQLiteParser.Sql_stmt_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(@NotNull ExtractedSQLiteParser.Drop_table_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(@NotNull ExtractedSQLiteParser.Any_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(@NotNull ExtractedSQLiteParser.Database_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(@NotNull ExtractedSQLiteParser.Module_argumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(@NotNull ExtractedSQLiteParser.Join_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_stmt(@NotNull ExtractedSQLiteParser.Vacuum_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(@NotNull ExtractedSQLiteParser.Factored_select_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(@NotNull ExtractedSQLiteParser.Transaction_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(@NotNull ExtractedSQLiteParser.Cte_table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(@NotNull ExtractedSQLiteParser.Unary_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(@NotNull ExtractedSQLiteParser.Common_table_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger_stmt(@NotNull ExtractedSQLiteParser.Drop_trigger_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(@NotNull ExtractedSQLiteParser.New_table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull ExtractedSQLiteParser.Type_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(@NotNull ExtractedSQLiteParser.Table_aliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(@NotNull ExtractedSQLiteParser.Module_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(@NotNull ExtractedSQLiteParser.Commit_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(@NotNull ExtractedSQLiteParser.Trigger_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(@NotNull ExtractedSQLiteParser.Create_table_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(@NotNull ExtractedSQLiteParser.Pragma_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(@NotNull ExtractedSQLiteParser.Column_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_stmt(@NotNull ExtractedSQLiteParser.Savepoint_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#detach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetach_stmt(@NotNull ExtractedSQLiteParser.Detach_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(@NotNull ExtractedSQLiteParser.Column_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(@NotNull ExtractedSQLiteParser.Table_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(@NotNull ExtractedSQLiteParser.Column_aliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(@NotNull ExtractedSQLiteParser.Delete_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#release_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_stmt(@NotNull ExtractedSQLiteParser.Release_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(@NotNull ExtractedSQLiteParser.Foreign_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt(@NotNull ExtractedSQLiteParser.Create_view_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull ExtractedSQLiteParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(@NotNull ExtractedSQLiteParser.Signed_numberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt_limited(@NotNull ExtractedSQLiteParser.Delete_stmt_limitedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(@NotNull ExtractedSQLiteParser.Index_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(@NotNull ExtractedSQLiteParser.Select_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_virtual_table_stmt(@NotNull ExtractedSQLiteParser.Create_virtual_table_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(@NotNull ExtractedSQLiteParser.Alter_table_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#attach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach_stmt(@NotNull ExtractedSQLiteParser.Attach_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#pragma_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_stmt(@NotNull ExtractedSQLiteParser.Pragma_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull ExtractedSQLiteParser.Table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull ExtractedSQLiteParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(@NotNull ExtractedSQLiteParser.Join_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#reindex_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_stmt(@NotNull ExtractedSQLiteParser.Reindex_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull ExtractedSQLiteParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#begin_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_stmt(@NotNull ExtractedSQLiteParser.Begin_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(@NotNull ExtractedSQLiteParser.Table_or_subqueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(@NotNull ExtractedSQLiteParser.ErrorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(@NotNull ExtractedSQLiteParser.Ordering_termContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(@NotNull ExtractedSQLiteParser.KeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(@NotNull ExtractedSQLiteParser.With_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(@NotNull ExtractedSQLiteParser.Pragma_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(@NotNull ExtractedSQLiteParser.Select_or_valuesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_stmt(@NotNull ExtractedSQLiteParser.Simple_select_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(@NotNull ExtractedSQLiteParser.View_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(@NotNull ExtractedSQLiteParser.Join_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(@NotNull ExtractedSQLiteParser.Foreign_key_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(@NotNull ExtractedSQLiteParser.Literal_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_stmt(@NotNull ExtractedSQLiteParser.Drop_index_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_select_stmt(@NotNull ExtractedSQLiteParser.Compound_select_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt_limited(@NotNull ExtractedSQLiteParser.Update_stmt_limitedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(@NotNull ExtractedSQLiteParser.Collation_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(@NotNull ExtractedSQLiteParser.Update_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_stmt(@NotNull ExtractedSQLiteParser.Drop_view_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#raise_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_function(@NotNull ExtractedSQLiteParser.Raise_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(@NotNull ExtractedSQLiteParser.Conflict_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSQLiteParser#analyze_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_stmt(@NotNull ExtractedSQLiteParser.Analyze_stmtContext ctx);
}