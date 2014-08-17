// Generated from Erlang.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ErlangParser}.
 */
public interface ErlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ErlangParser#functionClause}.
	 * @param ctx the parse tree
	 */
	void enterFunctionClause(@NotNull ErlangParser.FunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#functionClause}.
	 * @param ctx the parse tree
	 */
	void exitFunctionClause(@NotNull ErlangParser.FunctionClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#ruleClause}.
	 * @param ctx the parse tree
	 */
	void enterRuleClause(@NotNull ErlangParser.RuleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ruleClause}.
	 * @param ctx the parse tree
	 */
	void exitRuleClause(@NotNull ErlangParser.RuleClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#binaryType}.
	 * @param ctx the parse tree
	 */
	void enterBinaryType(@NotNull ErlangParser.BinaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binaryType}.
	 * @param ctx the parse tree
	 */
	void exitBinaryType(@NotNull ErlangParser.BinaryTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(@NotNull ErlangParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(@NotNull ErlangParser.MultOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#topType100}.
	 * @param ctx the parse tree
	 */
	void enterTopType100(@NotNull ErlangParser.TopType100Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#topType100}.
	 * @param ctx the parse tree
	 */
	void exitTopType100(@NotNull ErlangParser.TopType100Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(@NotNull ErlangParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(@NotNull ErlangParser.TupleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#receiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterReceiveExpr(@NotNull ErlangParser.ReceiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#receiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitReceiveExpr(@NotNull ErlangParser.ReceiveExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(@NotNull ErlangParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(@NotNull ErlangParser.AddOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(@NotNull ErlangParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(@NotNull ErlangParser.ExprsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitSizeExpr(@NotNull ErlangParser.BitSizeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitSizeExpr(@NotNull ErlangParser.BitSizeExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#crClause}.
	 * @param ctx the parse tree
	 */
	void enterCrClause(@NotNull ErlangParser.CrClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#crClause}.
	 * @param ctx the parse tree
	 */
	void exitCrClause(@NotNull ErlangParser.CrClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeSigs}.
	 * @param ctx the parse tree
	 */
	void enterTypeSigs(@NotNull ErlangParser.TypeSigsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeSigs}.
	 * @param ctx the parse tree
	 */
	void exitTypeSigs(@NotNull ErlangParser.TypeSigsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(@NotNull ErlangParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(@NotNull ErlangParser.FormContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokFloat}.
	 * @param ctx the parse tree
	 */
	void enterTokFloat(@NotNull ErlangParser.TokFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokFloat}.
	 * @param ctx the parse tree
	 */
	void exitTokFloat(@NotNull ErlangParser.TokFloatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokChar}.
	 * @param ctx the parse tree
	 */
	void enterTokChar(@NotNull ErlangParser.TokCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokChar}.
	 * @param ctx the parse tree
	 */
	void exitTokChar(@NotNull ErlangParser.TokCharContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#atomOrVar}.
	 * @param ctx the parse tree
	 */
	void enterAtomOrVar(@NotNull ErlangParser.AtomOrVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#atomOrVar}.
	 * @param ctx the parse tree
	 */
	void exitAtomOrVar(@NotNull ErlangParser.AtomOrVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(@NotNull ErlangParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(@NotNull ErlangParser.TailContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#lcExpr}.
	 * @param ctx the parse tree
	 */
	void enterLcExpr(@NotNull ErlangParser.LcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#lcExpr}.
	 * @param ctx the parse tree
	 */
	void exitLcExpr(@NotNull ErlangParser.LcExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#recordExpr}.
	 * @param ctx the parse tree
	 */
	void enterRecordExpr(@NotNull ErlangParser.RecordExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#recordExpr}.
	 * @param ctx the parse tree
	 */
	void exitRecordExpr(@NotNull ErlangParser.RecordExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOp(@NotNull ErlangParser.PrefixOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOp(@NotNull ErlangParser.PrefixOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#typedAttrVal}.
	 * @param ctx the parse tree
	 */
	void enterTypedAttrVal(@NotNull ErlangParser.TypedAttrValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typedAttrVal}.
	 * @param ctx the parse tree
	 */
	void exitTypedAttrVal(@NotNull ErlangParser.TypedAttrValContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#topType}.
	 * @param ctx the parse tree
	 */
	void enterTopType(@NotNull ErlangParser.TopTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#topType}.
	 * @param ctx the parse tree
	 */
	void exitTopType(@NotNull ErlangParser.TopTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokInteger}.
	 * @param ctx the parse tree
	 */
	void enterTokInteger(@NotNull ErlangParser.TokIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokInteger}.
	 * @param ctx the parse tree
	 */
	void exitTokInteger(@NotNull ErlangParser.TokIntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokAtom}.
	 * @param ctx the parse tree
	 */
	void enterTokAtom(@NotNull ErlangParser.TokAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokAtom}.
	 * @param ctx the parse tree
	 */
	void exitTokAtom(@NotNull ErlangParser.TokAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(@NotNull ErlangParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(@NotNull ErlangParser.BinaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#recordField}.
	 * @param ctx the parse tree
	 */
	void enterRecordField(@NotNull ErlangParser.RecordFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#recordField}.
	 * @param ctx the parse tree
	 */
	void exitRecordField(@NotNull ErlangParser.RecordFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(@NotNull ErlangParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(@NotNull ErlangParser.CompOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokVar}.
	 * @param ctx the parse tree
	 */
	void enterTokVar(@NotNull ErlangParser.TokVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokVar}.
	 * @param ctx the parse tree
	 */
	void exitTokVar(@NotNull ErlangParser.TokVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#type300}.
	 * @param ctx the parse tree
	 */
	void enterType300(@NotNull ErlangParser.Type300Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type300}.
	 * @param ctx the parse tree
	 */
	void exitType300(@NotNull ErlangParser.Type300Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#funClauses}.
	 * @param ctx the parse tree
	 */
	void enterFunClauses(@NotNull ErlangParser.FunClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funClauses}.
	 * @param ctx the parse tree
	 */
	void exitFunClauses(@NotNull ErlangParser.FunClausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#lcExprs}.
	 * @param ctx the parse tree
	 */
	void enterLcExprs(@NotNull ErlangParser.LcExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#lcExprs}.
	 * @param ctx the parse tree
	 */
	void exitLcExprs(@NotNull ErlangParser.LcExprsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#type400}.
	 * @param ctx the parse tree
	 */
	void enterType400(@NotNull ErlangParser.Type400Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type400}.
	 * @param ctx the parse tree
	 */
	void exitType400(@NotNull ErlangParser.Type400Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void enterIfClause(@NotNull ErlangParser.IfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void exitIfClause(@NotNull ErlangParser.IfClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(@NotNull ErlangParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(@NotNull ErlangParser.IfExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(@NotNull ErlangParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(@NotNull ErlangParser.GuardContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#tryClauses}.
	 * @param ctx the parse tree
	 */
	void enterTryClauses(@NotNull ErlangParser.TryClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tryClauses}.
	 * @param ctx the parse tree
	 */
	void exitTryClauses(@NotNull ErlangParser.TryClausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr150}.
	 * @param ctx the parse tree
	 */
	void enterExpr150(@NotNull ErlangParser.Expr150Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr150}.
	 * @param ctx the parse tree
	 */
	void exitExpr150(@NotNull ErlangParser.Expr150Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#fieldTypes}.
	 * @param ctx the parse tree
	 */
	void enterFieldTypes(@NotNull ErlangParser.FieldTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#fieldTypes}.
	 * @param ctx the parse tree
	 */
	void exitFieldTypes(@NotNull ErlangParser.FieldTypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#type500}.
	 * @param ctx the parse tree
	 */
	void enterType500(@NotNull ErlangParser.Type500Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type500}.
	 * @param ctx the parse tree
	 */
	void exitType500(@NotNull ErlangParser.Type500Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#binUnitType}.
	 * @param ctx the parse tree
	 */
	void enterBinUnitType(@NotNull ErlangParser.BinUnitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binUnitType}.
	 * @param ctx the parse tree
	 */
	void exitBinUnitType(@NotNull ErlangParser.BinUnitTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#optBitTypeList}.
	 * @param ctx the parse tree
	 */
	void enterOptBitTypeList(@NotNull ErlangParser.OptBitTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#optBitTypeList}.
	 * @param ctx the parse tree
	 */
	void exitOptBitTypeList(@NotNull ErlangParser.OptBitTypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#clauseBody}.
	 * @param ctx the parse tree
	 */
	void enterClauseBody(@NotNull ErlangParser.ClauseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#clauseBody}.
	 * @param ctx the parse tree
	 */
	void exitClauseBody(@NotNull ErlangParser.ClauseBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#binElements}.
	 * @param ctx the parse tree
	 */
	void enterBinElements(@NotNull ErlangParser.BinElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binElements}.
	 * @param ctx the parse tree
	 */
	void exitBinElements(@NotNull ErlangParser.BinElementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeGuards}.
	 * @param ctx the parse tree
	 */
	void enterTypeGuards(@NotNull ErlangParser.TypeGuardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeGuards}.
	 * @param ctx the parse tree
	 */
	void exitTypeGuards(@NotNull ErlangParser.TypeGuardsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void enterFieldType(@NotNull ErlangParser.FieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void exitFieldType(@NotNull ErlangParser.FieldTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#attrVal}.
	 * @param ctx the parse tree
	 */
	void enterAttrVal(@NotNull ErlangParser.AttrValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#attrVal}.
	 * @param ctx the parse tree
	 */
	void exitAttrVal(@NotNull ErlangParser.AttrValContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#typedExprs}.
	 * @param ctx the parse tree
	 */
	void enterTypedExprs(@NotNull ErlangParser.TypedExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typedExprs}.
	 * @param ctx the parse tree
	 */
	void exitTypedExprs(@NotNull ErlangParser.TypedExprsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#recordFields}.
	 * @param ctx the parse tree
	 */
	void enterRecordFields(@NotNull ErlangParser.RecordFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#recordFields}.
	 * @param ctx the parse tree
	 */
	void exitRecordFields(@NotNull ErlangParser.RecordFieldsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#ruleClauses}.
	 * @param ctx the parse tree
	 */
	void enterRuleClauses(@NotNull ErlangParser.RuleClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ruleClauses}.
	 * @param ctx the parse tree
	 */
	void exitRuleClauses(@NotNull ErlangParser.RuleClausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeGuard}.
	 * @param ctx the parse tree
	 */
	void enterTypeGuard(@NotNull ErlangParser.TypeGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeGuard}.
	 * @param ctx the parse tree
	 */
	void exitTypeGuard(@NotNull ErlangParser.TypeGuardContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(@NotNull ErlangParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(@NotNull ErlangParser.BitExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(@NotNull ErlangParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(@NotNull ErlangParser.TypeSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#funType}.
	 * @param ctx the parse tree
	 */
	void enterFunType(@NotNull ErlangParser.FunTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funType}.
	 * @param ctx the parse tree
	 */
	void exitFunType(@NotNull ErlangParser.FunTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#clauseArgs}.
	 * @param ctx the parse tree
	 */
	void enterClauseArgs(@NotNull ErlangParser.ClauseArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#clauseArgs}.
	 * @param ctx the parse tree
	 */
	void exitClauseArgs(@NotNull ErlangParser.ClauseArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void enterListComprehension(@NotNull ErlangParser.ListComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void exitListComprehension(@NotNull ErlangParser.ListComprehensionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#ifClauses}.
	 * @param ctx the parse tree
	 */
	void enterIfClauses(@NotNull ErlangParser.IfClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ifClauses}.
	 * @param ctx the parse tree
	 */
	void exitIfClauses(@NotNull ErlangParser.IfClausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#binBaseType}.
	 * @param ctx the parse tree
	 */
	void enterBinBaseType(@NotNull ErlangParser.BinBaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binBaseType}.
	 * @param ctx the parse tree
	 */
	void exitBinBaseType(@NotNull ErlangParser.BinBaseTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr100}.
	 * @param ctx the parse tree
	 */
	void enterExpr100(@NotNull ErlangParser.Expr100Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr100}.
	 * @param ctx the parse tree
	 */
	void exitExpr100(@NotNull ErlangParser.Expr100Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#typedRecordFields}.
	 * @param ctx the parse tree
	 */
	void enterTypedRecordFields(@NotNull ErlangParser.TypedRecordFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typedRecordFields}.
	 * @param ctx the parse tree
	 */
	void exitTypedRecordFields(@NotNull ErlangParser.TypedRecordFieldsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr600}.
	 * @param ctx the parse tree
	 */
	void enterExpr600(@NotNull ErlangParser.Expr600Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr600}.
	 * @param ctx the parse tree
	 */
	void exitExpr600(@NotNull ErlangParser.Expr600Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr500}.
	 * @param ctx the parse tree
	 */
	void enterExpr500(@NotNull ErlangParser.Expr500Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr500}.
	 * @param ctx the parse tree
	 */
	void exitExpr500(@NotNull ErlangParser.Expr500Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr200}.
	 * @param ctx the parse tree
	 */
	void enterExpr200(@NotNull ErlangParser.Expr200Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr200}.
	 * @param ctx the parse tree
	 */
	void exitExpr200(@NotNull ErlangParser.Expr200Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ErlangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ErlangParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeSig}.
	 * @param ctx the parse tree
	 */
	void enterTypeSig(@NotNull ErlangParser.TypeSigContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeSig}.
	 * @param ctx the parse tree
	 */
	void exitTypeSig(@NotNull ErlangParser.TypeSigContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull ErlangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull ErlangParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#specFun}.
	 * @param ctx the parse tree
	 */
	void enterSpecFun(@NotNull ErlangParser.SpecFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#specFun}.
	 * @param ctx the parse tree
	 */
	void exitSpecFun(@NotNull ErlangParser.SpecFunContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpr(@NotNull ErlangParser.CaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpr(@NotNull ErlangParser.CaseExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#crClauses}.
	 * @param ctx the parse tree
	 */
	void enterCrClauses(@NotNull ErlangParser.CrClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#crClauses}.
	 * @param ctx the parse tree
	 */
	void exitCrClauses(@NotNull ErlangParser.CrClausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#funClause}.
	 * @param ctx the parse tree
	 */
	void enterFunClause(@NotNull ErlangParser.FunClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funClause}.
	 * @param ctx the parse tree
	 */
	void exitFunClause(@NotNull ErlangParser.FunClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr400}.
	 * @param ctx the parse tree
	 */
	void enterExpr400(@NotNull ErlangParser.Expr400Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr400}.
	 * @param ctx the parse tree
	 */
	void exitExpr400(@NotNull ErlangParser.Expr400Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull ErlangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull ErlangParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr700}.
	 * @param ctx the parse tree
	 */
	void enterExpr700(@NotNull ErlangParser.Expr700Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr700}.
	 * @param ctx the parse tree
	 */
	void exitExpr700(@NotNull ErlangParser.Expr700Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#integerOrVar}.
	 * @param ctx the parse tree
	 */
	void enterIntegerOrVar(@NotNull ErlangParser.IntegerOrVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#integerOrVar}.
	 * @param ctx the parse tree
	 */
	void exitIntegerOrVar(@NotNull ErlangParser.IntegerOrVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#bitTypeList}.
	 * @param ctx the parse tree
	 */
	void enterBitTypeList(@NotNull ErlangParser.BitTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#bitTypeList}.
	 * @param ctx the parse tree
	 */
	void exitBitTypeList(@NotNull ErlangParser.BitTypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr800}.
	 * @param ctx the parse tree
	 */
	void enterExpr800(@NotNull ErlangParser.Expr800Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr800}.
	 * @param ctx the parse tree
	 */
	void exitExpr800(@NotNull ErlangParser.Expr800Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr300}.
	 * @param ctx the parse tree
	 */
	void enterExpr300(@NotNull ErlangParser.Expr300Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr300}.
	 * @param ctx the parse tree
	 */
	void exitExpr300(@NotNull ErlangParser.Expr300Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#typedExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypedExpr(@NotNull ErlangParser.TypedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typedExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypedExpr(@NotNull ErlangParser.TypedExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void enterOptBitSizeExpr(@NotNull ErlangParser.OptBitSizeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void exitOptBitSizeExpr(@NotNull ErlangParser.OptBitSizeExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#binElement}.
	 * @param ctx the parse tree
	 */
	void enterBinElement(@NotNull ErlangParser.BinElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binElement}.
	 * @param ctx the parse tree
	 */
	void exitBinElement(@NotNull ErlangParser.BinElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#bitType}.
	 * @param ctx the parse tree
	 */
	void enterBitType(@NotNull ErlangParser.BitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#bitType}.
	 * @param ctx the parse tree
	 */
	void exitBitType(@NotNull ErlangParser.BitTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#exprMax}.
	 * @param ctx the parse tree
	 */
	void enterExprMax(@NotNull ErlangParser.ExprMaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#exprMax}.
	 * @param ctx the parse tree
	 */
	void exitExprMax(@NotNull ErlangParser.ExprMaxContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	void enterRuleBody(@NotNull ErlangParser.RuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	void exitRuleBody(@NotNull ErlangParser.RuleBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokString}.
	 * @param ctx the parse tree
	 */
	void enterTokString(@NotNull ErlangParser.TokStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokString}.
	 * @param ctx the parse tree
	 */
	void exitTokString(@NotNull ErlangParser.TokStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr160}.
	 * @param ctx the parse tree
	 */
	void enterExpr160(@NotNull ErlangParser.Expr160Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr160}.
	 * @param ctx the parse tree
	 */
	void exitExpr160(@NotNull ErlangParser.Expr160Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#type200}.
	 * @param ctx the parse tree
	 */
	void enterType200(@NotNull ErlangParser.Type200Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type200}.
	 * @param ctx the parse tree
	 */
	void exitType200(@NotNull ErlangParser.Type200Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#clauseGuard}.
	 * @param ctx the parse tree
	 */
	void enterClauseGuard(@NotNull ErlangParser.ClauseGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#clauseGuard}.
	 * @param ctx the parse tree
	 */
	void exitClauseGuard(@NotNull ErlangParser.ClauseGuardContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#funExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunExpr(@NotNull ErlangParser.FunExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunExpr(@NotNull ErlangParser.FunExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull ErlangParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull ErlangParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ErlangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ErlangParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTryExpr(@NotNull ErlangParser.TryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTryExpr(@NotNull ErlangParser.TryExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#recordTuple}.
	 * @param ctx the parse tree
	 */
	void enterRecordTuple(@NotNull ErlangParser.RecordTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#recordTuple}.
	 * @param ctx the parse tree
	 */
	void exitRecordTuple(@NotNull ErlangParser.RecordTupleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(@NotNull ErlangParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(@NotNull ErlangParser.AtomicContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#tryClause}.
	 * @param ctx the parse tree
	 */
	void enterTryClause(@NotNull ErlangParser.TryClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tryClause}.
	 * @param ctx the parse tree
	 */
	void exitTryClause(@NotNull ErlangParser.TryClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#topTypes}.
	 * @param ctx the parse tree
	 */
	void enterTopTypes(@NotNull ErlangParser.TopTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#topTypes}.
	 * @param ctx the parse tree
	 */
	void exitTopTypes(@NotNull ErlangParser.TopTypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#funType100}.
	 * @param ctx the parse tree
	 */
	void enterFunType100(@NotNull ErlangParser.FunType100Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funType100}.
	 * @param ctx the parse tree
	 */
	void exitFunType100(@NotNull ErlangParser.FunType100Context ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#binaryComprehension}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComprehension(@NotNull ErlangParser.BinaryComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binaryComprehension}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComprehension(@NotNull ErlangParser.BinaryComprehensionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterForms(@NotNull ErlangParser.FormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitForms(@NotNull ErlangParser.FormsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#listOp}.
	 * @param ctx the parse tree
	 */
	void enterListOp(@NotNull ErlangParser.ListOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#listOp}.
	 * @param ctx the parse tree
	 */
	void exitListOp(@NotNull ErlangParser.ListOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull ErlangParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull ErlangParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull ErlangParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull ErlangParser.ArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ErlangParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void enterTryCatch(@NotNull ErlangParser.TryCatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void exitTryCatch(@NotNull ErlangParser.TryCatchContext ctx);
}