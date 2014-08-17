// Generated from ExtractedErlang.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedErlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedErlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#functionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionClause(@NotNull ExtractedErlangParser.FunctionClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#ruleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClause(@NotNull ExtractedErlangParser.RuleClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#binaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryType(@NotNull ExtractedErlangParser.BinaryTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOp(@NotNull ExtractedErlangParser.MultOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#topType100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopType100(@NotNull ExtractedErlangParser.TopType100Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(@NotNull ExtractedErlangParser.TupleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#receiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveExpr(@NotNull ExtractedErlangParser.ReceiveExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(@NotNull ExtractedErlangParser.AddOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(@NotNull ExtractedErlangParser.ExprsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitSizeExpr(@NotNull ExtractedErlangParser.BitSizeExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#crClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrClause(@NotNull ExtractedErlangParser.CrClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#typeSigs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSigs(@NotNull ExtractedErlangParser.TypeSigsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(@NotNull ExtractedErlangParser.FormContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#tokFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokFloat(@NotNull ExtractedErlangParser.TokFloatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#tokChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokChar(@NotNull ExtractedErlangParser.TokCharContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#atomOrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomOrVar(@NotNull ExtractedErlangParser.AtomOrVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTail(@NotNull ExtractedErlangParser.TailContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#lcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcExpr(@NotNull ExtractedErlangParser.LcExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#recordExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordExpr(@NotNull ExtractedErlangParser.RecordExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#prefixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOp(@NotNull ExtractedErlangParser.PrefixOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#typedAttrVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedAttrVal(@NotNull ExtractedErlangParser.TypedAttrValContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#topType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopType(@NotNull ExtractedErlangParser.TopTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#tokInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokInteger(@NotNull ExtractedErlangParser.TokIntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#tokAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokAtom(@NotNull ExtractedErlangParser.TokAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(@NotNull ExtractedErlangParser.BinaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#recordField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordField(@NotNull ExtractedErlangParser.RecordFieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(@NotNull ExtractedErlangParser.CompOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#tokVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokVar(@NotNull ExtractedErlangParser.TokVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#type300}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType300(@NotNull ExtractedErlangParser.Type300Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#funClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunClauses(@NotNull ExtractedErlangParser.FunClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#lcExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcExprs(@NotNull ExtractedErlangParser.LcExprsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#type400}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType400(@NotNull ExtractedErlangParser.Type400Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#ifClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfClause(@NotNull ExtractedErlangParser.IfClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(@NotNull ExtractedErlangParser.IfExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(@NotNull ExtractedErlangParser.GuardContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#tryClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryClauses(@NotNull ExtractedErlangParser.TryClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#expr150}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr150(@NotNull ExtractedErlangParser.Expr150Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#fieldTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldTypes(@NotNull ExtractedErlangParser.FieldTypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#type500}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType500(@NotNull ExtractedErlangParser.Type500Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#binUnitType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinUnitType(@NotNull ExtractedErlangParser.BinUnitTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#optBitTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptBitTypeList(@NotNull ExtractedErlangParser.OptBitTypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#clauseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseBody(@NotNull ExtractedErlangParser.ClauseBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#binElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinElements(@NotNull ExtractedErlangParser.BinElementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#typeGuards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeGuards(@NotNull ExtractedErlangParser.TypeGuardsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#fieldType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldType(@NotNull ExtractedErlangParser.FieldTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#attrVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrVal(@NotNull ExtractedErlangParser.AttrValContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#typedExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedExprs(@NotNull ExtractedErlangParser.TypedExprsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#recordFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordFields(@NotNull ExtractedErlangParser.RecordFieldsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#ruleClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClauses(@NotNull ExtractedErlangParser.RuleClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#typeGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeGuard(@NotNull ExtractedErlangParser.TypeGuardContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(@NotNull ExtractedErlangParser.BitExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(@NotNull ExtractedErlangParser.TypeSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#funType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunType(@NotNull ExtractedErlangParser.FunTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#clauseArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseArgs(@NotNull ExtractedErlangParser.ClauseArgsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#listComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListComprehension(@NotNull ExtractedErlangParser.ListComprehensionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#ifClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfClauses(@NotNull ExtractedErlangParser.IfClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#binBaseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinBaseType(@NotNull ExtractedErlangParser.BinBaseTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#expr100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr100(@NotNull ExtractedErlangParser.Expr100Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#typedRecordFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedRecordFields(@NotNull ExtractedErlangParser.TypedRecordFieldsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#expr600}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr600(@NotNull ExtractedErlangParser.Expr600Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#expr500}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr500(@NotNull ExtractedErlangParser.Expr500Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#expr200}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr200(@NotNull ExtractedErlangParser.Expr200Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull ExtractedErlangParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#typeSig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSig(@NotNull ExtractedErlangParser.TypeSigContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull ExtractedErlangParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#specFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecFun(@NotNull ExtractedErlangParser.SpecFunContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#caseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpr(@NotNull ExtractedErlangParser.CaseExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#crClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrClauses(@NotNull ExtractedErlangParser.CrClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#funClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunClause(@NotNull ExtractedErlangParser.FunClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#expr400}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr400(@NotNull ExtractedErlangParser.Expr400Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull ExtractedErlangParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#expr700}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr700(@NotNull ExtractedErlangParser.Expr700Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#integerOrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerOrVar(@NotNull ExtractedErlangParser.IntegerOrVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#bitTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitTypeList(@NotNull ExtractedErlangParser.BitTypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#expr800}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr800(@NotNull ExtractedErlangParser.Expr800Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#expr300}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr300(@NotNull ExtractedErlangParser.Expr300Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#typedExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedExpr(@NotNull ExtractedErlangParser.TypedExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptBitSizeExpr(@NotNull ExtractedErlangParser.OptBitSizeExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#binElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinElement(@NotNull ExtractedErlangParser.BinElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#bitType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitType(@NotNull ExtractedErlangParser.BitTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#exprMax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMax(@NotNull ExtractedErlangParser.ExprMaxContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#ruleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleBody(@NotNull ExtractedErlangParser.RuleBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#tokString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokString(@NotNull ExtractedErlangParser.TokStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#expr160}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr160(@NotNull ExtractedErlangParser.Expr160Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#type200}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType200(@NotNull ExtractedErlangParser.Type200Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#clauseGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseGuard(@NotNull ExtractedErlangParser.ClauseGuardContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#funExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunExpr(@NotNull ExtractedErlangParser.FunExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull ExtractedErlangParser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull ExtractedErlangParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#tryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpr(@NotNull ExtractedErlangParser.TryExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#recordTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordTuple(@NotNull ExtractedErlangParser.RecordTupleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic(@NotNull ExtractedErlangParser.AtomicContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#tryClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryClause(@NotNull ExtractedErlangParser.TryClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#topTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopTypes(@NotNull ExtractedErlangParser.TopTypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#funType100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunType100(@NotNull ExtractedErlangParser.FunType100Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#binaryComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComprehension(@NotNull ExtractedErlangParser.BinaryComprehensionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForms(@NotNull ExtractedErlangParser.FormsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#listOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOp(@NotNull ExtractedErlangParser.ListOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull ExtractedErlangParser.ListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull ExtractedErlangParser.ArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedErlangParser#tryCatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatch(@NotNull ExtractedErlangParser.TryCatchContext ctx);
}