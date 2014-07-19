// Generated from Erlang.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ErlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ErlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ErlangParser#functionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionClause(@NotNull ErlangParser.FunctionClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#ruleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClause(@NotNull ErlangParser.RuleClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#binaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryType(@NotNull ErlangParser.BinaryTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOp(@NotNull ErlangParser.MultOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#topType100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopType100(@NotNull ErlangParser.TopType100Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(@NotNull ErlangParser.TupleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#receiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveExpr(@NotNull ErlangParser.ReceiveExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(@NotNull ErlangParser.AddOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(@NotNull ErlangParser.ExprsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitSizeExpr(@NotNull ErlangParser.BitSizeExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#crClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrClause(@NotNull ErlangParser.CrClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeSigs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSigs(@NotNull ErlangParser.TypeSigsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(@NotNull ErlangParser.FormContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokFloat(@NotNull ErlangParser.TokFloatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokChar(@NotNull ErlangParser.TokCharContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#atomOrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomOrVar(@NotNull ErlangParser.AtomOrVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTail(@NotNull ErlangParser.TailContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#lcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcExpr(@NotNull ErlangParser.LcExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#recordExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordExpr(@NotNull ErlangParser.RecordExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#prefixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOp(@NotNull ErlangParser.PrefixOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#typedAttrVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedAttrVal(@NotNull ErlangParser.TypedAttrValContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#topType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopType(@NotNull ErlangParser.TopTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokInteger(@NotNull ErlangParser.TokIntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokAtom(@NotNull ErlangParser.TokAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(@NotNull ErlangParser.BinaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#recordField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordField(@NotNull ErlangParser.RecordFieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(@NotNull ErlangParser.CompOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokVar(@NotNull ErlangParser.TokVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#type300}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType300(@NotNull ErlangParser.Type300Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#funClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunClauses(@NotNull ErlangParser.FunClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#lcExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcExprs(@NotNull ErlangParser.LcExprsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#type400}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType400(@NotNull ErlangParser.Type400Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#ifClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfClause(@NotNull ErlangParser.IfClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(@NotNull ErlangParser.IfExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(@NotNull ErlangParser.GuardContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#tryClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryClauses(@NotNull ErlangParser.TryClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr150}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr150(@NotNull ErlangParser.Expr150Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#fieldTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldTypes(@NotNull ErlangParser.FieldTypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#type500}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType500(@NotNull ErlangParser.Type500Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#binUnitType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinUnitType(@NotNull ErlangParser.BinUnitTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#optBitTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptBitTypeList(@NotNull ErlangParser.OptBitTypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#clauseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseBody(@NotNull ErlangParser.ClauseBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#binElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinElements(@NotNull ErlangParser.BinElementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeGuards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeGuards(@NotNull ErlangParser.TypeGuardsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#fieldType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldType(@NotNull ErlangParser.FieldTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#attrVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrVal(@NotNull ErlangParser.AttrValContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#typedExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedExprs(@NotNull ErlangParser.TypedExprsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#recordFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordFields(@NotNull ErlangParser.RecordFieldsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#ruleClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClauses(@NotNull ErlangParser.RuleClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeGuard(@NotNull ErlangParser.TypeGuardContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(@NotNull ErlangParser.BitExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(@NotNull ErlangParser.TypeSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#funType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunType(@NotNull ErlangParser.FunTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#clauseArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseArgs(@NotNull ErlangParser.ClauseArgsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#listComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListComprehension(@NotNull ErlangParser.ListComprehensionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#ifClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfClauses(@NotNull ErlangParser.IfClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#binBaseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinBaseType(@NotNull ErlangParser.BinBaseTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr100(@NotNull ErlangParser.Expr100Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#typedRecordFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedRecordFields(@NotNull ErlangParser.TypedRecordFieldsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr600}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr600(@NotNull ErlangParser.Expr600Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr500}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr500(@NotNull ErlangParser.Expr500Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr200}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr200(@NotNull ErlangParser.Expr200Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull ErlangParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeSig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSig(@NotNull ErlangParser.TypeSigContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull ErlangParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#specFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecFun(@NotNull ErlangParser.SpecFunContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#caseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpr(@NotNull ErlangParser.CaseExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#crClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrClauses(@NotNull ErlangParser.CrClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#funClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunClause(@NotNull ErlangParser.FunClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr400}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr400(@NotNull ErlangParser.Expr400Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull ErlangParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr700}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr700(@NotNull ErlangParser.Expr700Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#integerOrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerOrVar(@NotNull ErlangParser.IntegerOrVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#bitTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitTypeList(@NotNull ErlangParser.BitTypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr800}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr800(@NotNull ErlangParser.Expr800Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr300}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr300(@NotNull ErlangParser.Expr300Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#typedExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedExpr(@NotNull ErlangParser.TypedExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptBitSizeExpr(@NotNull ErlangParser.OptBitSizeExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#binElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinElement(@NotNull ErlangParser.BinElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#bitType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitType(@NotNull ErlangParser.BitTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#exprMax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMax(@NotNull ErlangParser.ExprMaxContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#ruleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleBody(@NotNull ErlangParser.RuleBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokString(@NotNull ErlangParser.TokStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr160}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr160(@NotNull ErlangParser.Expr160Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#type200}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType200(@NotNull ErlangParser.Type200Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#clauseGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseGuard(@NotNull ErlangParser.ClauseGuardContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#funExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunExpr(@NotNull ErlangParser.FunExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull ErlangParser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull ErlangParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#tryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpr(@NotNull ErlangParser.TryExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#recordTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordTuple(@NotNull ErlangParser.RecordTupleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic(@NotNull ErlangParser.AtomicContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#tryClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryClause(@NotNull ErlangParser.TryClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#topTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopTypes(@NotNull ErlangParser.TopTypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#funType100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunType100(@NotNull ErlangParser.FunType100Context ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#binaryComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComprehension(@NotNull ErlangParser.BinaryComprehensionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForms(@NotNull ErlangParser.FormsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#listOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOp(@NotNull ErlangParser.ListOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull ErlangParser.ListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull ErlangParser.ArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ErlangParser#tryCatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatch(@NotNull ErlangParser.TryCatchContext ctx);
}