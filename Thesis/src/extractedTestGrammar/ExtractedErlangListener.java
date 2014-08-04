// Generated from ExtractedErlang.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedErlangParser}.
 */
public interface ExtractedErlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#functionClause}.
	 * @param ctx the parse tree
	 */
	void enterFunctionClause(@NotNull ExtractedErlangParser.FunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#functionClause}.
	 * @param ctx the parse tree
	 */
	void exitFunctionClause(@NotNull ExtractedErlangParser.FunctionClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#ruleClause}.
	 * @param ctx the parse tree
	 */
	void enterRuleClause(@NotNull ExtractedErlangParser.RuleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#ruleClause}.
	 * @param ctx the parse tree
	 */
	void exitRuleClause(@NotNull ExtractedErlangParser.RuleClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#binaryType}.
	 * @param ctx the parse tree
	 */
	void enterBinaryType(@NotNull ExtractedErlangParser.BinaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#binaryType}.
	 * @param ctx the parse tree
	 */
	void exitBinaryType(@NotNull ExtractedErlangParser.BinaryTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(@NotNull ExtractedErlangParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(@NotNull ExtractedErlangParser.MultOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#topType100}.
	 * @param ctx the parse tree
	 */
	void enterTopType100(@NotNull ExtractedErlangParser.TopType100Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#topType100}.
	 * @param ctx the parse tree
	 */
	void exitTopType100(@NotNull ExtractedErlangParser.TopType100Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(@NotNull ExtractedErlangParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(@NotNull ExtractedErlangParser.TupleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#receiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterReceiveExpr(@NotNull ExtractedErlangParser.ReceiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#receiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitReceiveExpr(@NotNull ExtractedErlangParser.ReceiveExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(@NotNull ExtractedErlangParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(@NotNull ExtractedErlangParser.AddOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(@NotNull ExtractedErlangParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(@NotNull ExtractedErlangParser.ExprsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitSizeExpr(@NotNull ExtractedErlangParser.BitSizeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitSizeExpr(@NotNull ExtractedErlangParser.BitSizeExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#crClause}.
	 * @param ctx the parse tree
	 */
	void enterCrClause(@NotNull ExtractedErlangParser.CrClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#crClause}.
	 * @param ctx the parse tree
	 */
	void exitCrClause(@NotNull ExtractedErlangParser.CrClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#typeSigs}.
	 * @param ctx the parse tree
	 */
	void enterTypeSigs(@NotNull ExtractedErlangParser.TypeSigsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#typeSigs}.
	 * @param ctx the parse tree
	 */
	void exitTypeSigs(@NotNull ExtractedErlangParser.TypeSigsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(@NotNull ExtractedErlangParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(@NotNull ExtractedErlangParser.FormContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#tokFloat}.
	 * @param ctx the parse tree
	 */
	void enterTokFloat(@NotNull ExtractedErlangParser.TokFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#tokFloat}.
	 * @param ctx the parse tree
	 */
	void exitTokFloat(@NotNull ExtractedErlangParser.TokFloatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#tokChar}.
	 * @param ctx the parse tree
	 */
	void enterTokChar(@NotNull ExtractedErlangParser.TokCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#tokChar}.
	 * @param ctx the parse tree
	 */
	void exitTokChar(@NotNull ExtractedErlangParser.TokCharContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#atomOrVar}.
	 * @param ctx the parse tree
	 */
	void enterAtomOrVar(@NotNull ExtractedErlangParser.AtomOrVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#atomOrVar}.
	 * @param ctx the parse tree
	 */
	void exitAtomOrVar(@NotNull ExtractedErlangParser.AtomOrVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(@NotNull ExtractedErlangParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(@NotNull ExtractedErlangParser.TailContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#lcExpr}.
	 * @param ctx the parse tree
	 */
	void enterLcExpr(@NotNull ExtractedErlangParser.LcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#lcExpr}.
	 * @param ctx the parse tree
	 */
	void exitLcExpr(@NotNull ExtractedErlangParser.LcExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#recordExpr}.
	 * @param ctx the parse tree
	 */
	void enterRecordExpr(@NotNull ExtractedErlangParser.RecordExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#recordExpr}.
	 * @param ctx the parse tree
	 */
	void exitRecordExpr(@NotNull ExtractedErlangParser.RecordExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOp(@NotNull ExtractedErlangParser.PrefixOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOp(@NotNull ExtractedErlangParser.PrefixOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#typedAttrVal}.
	 * @param ctx the parse tree
	 */
	void enterTypedAttrVal(@NotNull ExtractedErlangParser.TypedAttrValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#typedAttrVal}.
	 * @param ctx the parse tree
	 */
	void exitTypedAttrVal(@NotNull ExtractedErlangParser.TypedAttrValContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#topType}.
	 * @param ctx the parse tree
	 */
	void enterTopType(@NotNull ExtractedErlangParser.TopTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#topType}.
	 * @param ctx the parse tree
	 */
	void exitTopType(@NotNull ExtractedErlangParser.TopTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#tokInteger}.
	 * @param ctx the parse tree
	 */
	void enterTokInteger(@NotNull ExtractedErlangParser.TokIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#tokInteger}.
	 * @param ctx the parse tree
	 */
	void exitTokInteger(@NotNull ExtractedErlangParser.TokIntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#tokAtom}.
	 * @param ctx the parse tree
	 */
	void enterTokAtom(@NotNull ExtractedErlangParser.TokAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#tokAtom}.
	 * @param ctx the parse tree
	 */
	void exitTokAtom(@NotNull ExtractedErlangParser.TokAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(@NotNull ExtractedErlangParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(@NotNull ExtractedErlangParser.BinaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#recordField}.
	 * @param ctx the parse tree
	 */
	void enterRecordField(@NotNull ExtractedErlangParser.RecordFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#recordField}.
	 * @param ctx the parse tree
	 */
	void exitRecordField(@NotNull ExtractedErlangParser.RecordFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(@NotNull ExtractedErlangParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(@NotNull ExtractedErlangParser.CompOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#tokVar}.
	 * @param ctx the parse tree
	 */
	void enterTokVar(@NotNull ExtractedErlangParser.TokVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#tokVar}.
	 * @param ctx the parse tree
	 */
	void exitTokVar(@NotNull ExtractedErlangParser.TokVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#type300}.
	 * @param ctx the parse tree
	 */
	void enterType300(@NotNull ExtractedErlangParser.Type300Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#type300}.
	 * @param ctx the parse tree
	 */
	void exitType300(@NotNull ExtractedErlangParser.Type300Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#funClauses}.
	 * @param ctx the parse tree
	 */
	void enterFunClauses(@NotNull ExtractedErlangParser.FunClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#funClauses}.
	 * @param ctx the parse tree
	 */
	void exitFunClauses(@NotNull ExtractedErlangParser.FunClausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#lcExprs}.
	 * @param ctx the parse tree
	 */
	void enterLcExprs(@NotNull ExtractedErlangParser.LcExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#lcExprs}.
	 * @param ctx the parse tree
	 */
	void exitLcExprs(@NotNull ExtractedErlangParser.LcExprsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#type400}.
	 * @param ctx the parse tree
	 */
	void enterType400(@NotNull ExtractedErlangParser.Type400Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#type400}.
	 * @param ctx the parse tree
	 */
	void exitType400(@NotNull ExtractedErlangParser.Type400Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void enterIfClause(@NotNull ExtractedErlangParser.IfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void exitIfClause(@NotNull ExtractedErlangParser.IfClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(@NotNull ExtractedErlangParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(@NotNull ExtractedErlangParser.IfExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(@NotNull ExtractedErlangParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(@NotNull ExtractedErlangParser.GuardContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#tryClauses}.
	 * @param ctx the parse tree
	 */
	void enterTryClauses(@NotNull ExtractedErlangParser.TryClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#tryClauses}.
	 * @param ctx the parse tree
	 */
	void exitTryClauses(@NotNull ExtractedErlangParser.TryClausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#expr150}.
	 * @param ctx the parse tree
	 */
	void enterExpr150(@NotNull ExtractedErlangParser.Expr150Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#expr150}.
	 * @param ctx the parse tree
	 */
	void exitExpr150(@NotNull ExtractedErlangParser.Expr150Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#fieldTypes}.
	 * @param ctx the parse tree
	 */
	void enterFieldTypes(@NotNull ExtractedErlangParser.FieldTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#fieldTypes}.
	 * @param ctx the parse tree
	 */
	void exitFieldTypes(@NotNull ExtractedErlangParser.FieldTypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#type500}.
	 * @param ctx the parse tree
	 */
	void enterType500(@NotNull ExtractedErlangParser.Type500Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#type500}.
	 * @param ctx the parse tree
	 */
	void exitType500(@NotNull ExtractedErlangParser.Type500Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#binUnitType}.
	 * @param ctx the parse tree
	 */
	void enterBinUnitType(@NotNull ExtractedErlangParser.BinUnitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#binUnitType}.
	 * @param ctx the parse tree
	 */
	void exitBinUnitType(@NotNull ExtractedErlangParser.BinUnitTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#optBitTypeList}.
	 * @param ctx the parse tree
	 */
	void enterOptBitTypeList(@NotNull ExtractedErlangParser.OptBitTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#optBitTypeList}.
	 * @param ctx the parse tree
	 */
	void exitOptBitTypeList(@NotNull ExtractedErlangParser.OptBitTypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#clauseBody}.
	 * @param ctx the parse tree
	 */
	void enterClauseBody(@NotNull ExtractedErlangParser.ClauseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#clauseBody}.
	 * @param ctx the parse tree
	 */
	void exitClauseBody(@NotNull ExtractedErlangParser.ClauseBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#binElements}.
	 * @param ctx the parse tree
	 */
	void enterBinElements(@NotNull ExtractedErlangParser.BinElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#binElements}.
	 * @param ctx the parse tree
	 */
	void exitBinElements(@NotNull ExtractedErlangParser.BinElementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#typeGuards}.
	 * @param ctx the parse tree
	 */
	void enterTypeGuards(@NotNull ExtractedErlangParser.TypeGuardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#typeGuards}.
	 * @param ctx the parse tree
	 */
	void exitTypeGuards(@NotNull ExtractedErlangParser.TypeGuardsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void enterFieldType(@NotNull ExtractedErlangParser.FieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void exitFieldType(@NotNull ExtractedErlangParser.FieldTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#attrVal}.
	 * @param ctx the parse tree
	 */
	void enterAttrVal(@NotNull ExtractedErlangParser.AttrValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#attrVal}.
	 * @param ctx the parse tree
	 */
	void exitAttrVal(@NotNull ExtractedErlangParser.AttrValContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#typedExprs}.
	 * @param ctx the parse tree
	 */
	void enterTypedExprs(@NotNull ExtractedErlangParser.TypedExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#typedExprs}.
	 * @param ctx the parse tree
	 */
	void exitTypedExprs(@NotNull ExtractedErlangParser.TypedExprsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#recordFields}.
	 * @param ctx the parse tree
	 */
	void enterRecordFields(@NotNull ExtractedErlangParser.RecordFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#recordFields}.
	 * @param ctx the parse tree
	 */
	void exitRecordFields(@NotNull ExtractedErlangParser.RecordFieldsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#ruleClauses}.
	 * @param ctx the parse tree
	 */
	void enterRuleClauses(@NotNull ExtractedErlangParser.RuleClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#ruleClauses}.
	 * @param ctx the parse tree
	 */
	void exitRuleClauses(@NotNull ExtractedErlangParser.RuleClausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#typeGuard}.
	 * @param ctx the parse tree
	 */
	void enterTypeGuard(@NotNull ExtractedErlangParser.TypeGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#typeGuard}.
	 * @param ctx the parse tree
	 */
	void exitTypeGuard(@NotNull ExtractedErlangParser.TypeGuardContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(@NotNull ExtractedErlangParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(@NotNull ExtractedErlangParser.BitExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(@NotNull ExtractedErlangParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(@NotNull ExtractedErlangParser.TypeSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#funType}.
	 * @param ctx the parse tree
	 */
	void enterFunType(@NotNull ExtractedErlangParser.FunTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#funType}.
	 * @param ctx the parse tree
	 */
	void exitFunType(@NotNull ExtractedErlangParser.FunTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#clauseArgs}.
	 * @param ctx the parse tree
	 */
	void enterClauseArgs(@NotNull ExtractedErlangParser.ClauseArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#clauseArgs}.
	 * @param ctx the parse tree
	 */
	void exitClauseArgs(@NotNull ExtractedErlangParser.ClauseArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void enterListComprehension(@NotNull ExtractedErlangParser.ListComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void exitListComprehension(@NotNull ExtractedErlangParser.ListComprehensionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#ifClauses}.
	 * @param ctx the parse tree
	 */
	void enterIfClauses(@NotNull ExtractedErlangParser.IfClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#ifClauses}.
	 * @param ctx the parse tree
	 */
	void exitIfClauses(@NotNull ExtractedErlangParser.IfClausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#binBaseType}.
	 * @param ctx the parse tree
	 */
	void enterBinBaseType(@NotNull ExtractedErlangParser.BinBaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#binBaseType}.
	 * @param ctx the parse tree
	 */
	void exitBinBaseType(@NotNull ExtractedErlangParser.BinBaseTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#expr100}.
	 * @param ctx the parse tree
	 */
	void enterExpr100(@NotNull ExtractedErlangParser.Expr100Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#expr100}.
	 * @param ctx the parse tree
	 */
	void exitExpr100(@NotNull ExtractedErlangParser.Expr100Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#typedRecordFields}.
	 * @param ctx the parse tree
	 */
	void enterTypedRecordFields(@NotNull ExtractedErlangParser.TypedRecordFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#typedRecordFields}.
	 * @param ctx the parse tree
	 */
	void exitTypedRecordFields(@NotNull ExtractedErlangParser.TypedRecordFieldsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#expr600}.
	 * @param ctx the parse tree
	 */
	void enterExpr600(@NotNull ExtractedErlangParser.Expr600Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#expr600}.
	 * @param ctx the parse tree
	 */
	void exitExpr600(@NotNull ExtractedErlangParser.Expr600Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#expr500}.
	 * @param ctx the parse tree
	 */
	void enterExpr500(@NotNull ExtractedErlangParser.Expr500Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#expr500}.
	 * @param ctx the parse tree
	 */
	void exitExpr500(@NotNull ExtractedErlangParser.Expr500Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#expr200}.
	 * @param ctx the parse tree
	 */
	void enterExpr200(@NotNull ExtractedErlangParser.Expr200Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#expr200}.
	 * @param ctx the parse tree
	 */
	void exitExpr200(@NotNull ExtractedErlangParser.Expr200Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ExtractedErlangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ExtractedErlangParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#typeSig}.
	 * @param ctx the parse tree
	 */
	void enterTypeSig(@NotNull ExtractedErlangParser.TypeSigContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#typeSig}.
	 * @param ctx the parse tree
	 */
	void exitTypeSig(@NotNull ExtractedErlangParser.TypeSigContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull ExtractedErlangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull ExtractedErlangParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#specFun}.
	 * @param ctx the parse tree
	 */
	void enterSpecFun(@NotNull ExtractedErlangParser.SpecFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#specFun}.
	 * @param ctx the parse tree
	 */
	void exitSpecFun(@NotNull ExtractedErlangParser.SpecFunContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpr(@NotNull ExtractedErlangParser.CaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpr(@NotNull ExtractedErlangParser.CaseExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#crClauses}.
	 * @param ctx the parse tree
	 */
	void enterCrClauses(@NotNull ExtractedErlangParser.CrClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#crClauses}.
	 * @param ctx the parse tree
	 */
	void exitCrClauses(@NotNull ExtractedErlangParser.CrClausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#funClause}.
	 * @param ctx the parse tree
	 */
	void enterFunClause(@NotNull ExtractedErlangParser.FunClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#funClause}.
	 * @param ctx the parse tree
	 */
	void exitFunClause(@NotNull ExtractedErlangParser.FunClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#expr400}.
	 * @param ctx the parse tree
	 */
	void enterExpr400(@NotNull ExtractedErlangParser.Expr400Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#expr400}.
	 * @param ctx the parse tree
	 */
	void exitExpr400(@NotNull ExtractedErlangParser.Expr400Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull ExtractedErlangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull ExtractedErlangParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#expr700}.
	 * @param ctx the parse tree
	 */
	void enterExpr700(@NotNull ExtractedErlangParser.Expr700Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#expr700}.
	 * @param ctx the parse tree
	 */
	void exitExpr700(@NotNull ExtractedErlangParser.Expr700Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#integerOrVar}.
	 * @param ctx the parse tree
	 */
	void enterIntegerOrVar(@NotNull ExtractedErlangParser.IntegerOrVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#integerOrVar}.
	 * @param ctx the parse tree
	 */
	void exitIntegerOrVar(@NotNull ExtractedErlangParser.IntegerOrVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#bitTypeList}.
	 * @param ctx the parse tree
	 */
	void enterBitTypeList(@NotNull ExtractedErlangParser.BitTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#bitTypeList}.
	 * @param ctx the parse tree
	 */
	void exitBitTypeList(@NotNull ExtractedErlangParser.BitTypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#expr800}.
	 * @param ctx the parse tree
	 */
	void enterExpr800(@NotNull ExtractedErlangParser.Expr800Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#expr800}.
	 * @param ctx the parse tree
	 */
	void exitExpr800(@NotNull ExtractedErlangParser.Expr800Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#expr300}.
	 * @param ctx the parse tree
	 */
	void enterExpr300(@NotNull ExtractedErlangParser.Expr300Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#expr300}.
	 * @param ctx the parse tree
	 */
	void exitExpr300(@NotNull ExtractedErlangParser.Expr300Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#typedExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypedExpr(@NotNull ExtractedErlangParser.TypedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#typedExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypedExpr(@NotNull ExtractedErlangParser.TypedExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void enterOptBitSizeExpr(@NotNull ExtractedErlangParser.OptBitSizeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void exitOptBitSizeExpr(@NotNull ExtractedErlangParser.OptBitSizeExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#binElement}.
	 * @param ctx the parse tree
	 */
	void enterBinElement(@NotNull ExtractedErlangParser.BinElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#binElement}.
	 * @param ctx the parse tree
	 */
	void exitBinElement(@NotNull ExtractedErlangParser.BinElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#bitType}.
	 * @param ctx the parse tree
	 */
	void enterBitType(@NotNull ExtractedErlangParser.BitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#bitType}.
	 * @param ctx the parse tree
	 */
	void exitBitType(@NotNull ExtractedErlangParser.BitTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#exprMax}.
	 * @param ctx the parse tree
	 */
	void enterExprMax(@NotNull ExtractedErlangParser.ExprMaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#exprMax}.
	 * @param ctx the parse tree
	 */
	void exitExprMax(@NotNull ExtractedErlangParser.ExprMaxContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	void enterRuleBody(@NotNull ExtractedErlangParser.RuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	void exitRuleBody(@NotNull ExtractedErlangParser.RuleBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#tokString}.
	 * @param ctx the parse tree
	 */
	void enterTokString(@NotNull ExtractedErlangParser.TokStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#tokString}.
	 * @param ctx the parse tree
	 */
	void exitTokString(@NotNull ExtractedErlangParser.TokStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#expr160}.
	 * @param ctx the parse tree
	 */
	void enterExpr160(@NotNull ExtractedErlangParser.Expr160Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#expr160}.
	 * @param ctx the parse tree
	 */
	void exitExpr160(@NotNull ExtractedErlangParser.Expr160Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#type200}.
	 * @param ctx the parse tree
	 */
	void enterType200(@NotNull ExtractedErlangParser.Type200Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#type200}.
	 * @param ctx the parse tree
	 */
	void exitType200(@NotNull ExtractedErlangParser.Type200Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#clauseGuard}.
	 * @param ctx the parse tree
	 */
	void enterClauseGuard(@NotNull ExtractedErlangParser.ClauseGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#clauseGuard}.
	 * @param ctx the parse tree
	 */
	void exitClauseGuard(@NotNull ExtractedErlangParser.ClauseGuardContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#funExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunExpr(@NotNull ExtractedErlangParser.FunExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#funExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunExpr(@NotNull ExtractedErlangParser.FunExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull ExtractedErlangParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull ExtractedErlangParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ExtractedErlangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ExtractedErlangParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTryExpr(@NotNull ExtractedErlangParser.TryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTryExpr(@NotNull ExtractedErlangParser.TryExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#recordTuple}.
	 * @param ctx the parse tree
	 */
	void enterRecordTuple(@NotNull ExtractedErlangParser.RecordTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#recordTuple}.
	 * @param ctx the parse tree
	 */
	void exitRecordTuple(@NotNull ExtractedErlangParser.RecordTupleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(@NotNull ExtractedErlangParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(@NotNull ExtractedErlangParser.AtomicContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#tryClause}.
	 * @param ctx the parse tree
	 */
	void enterTryClause(@NotNull ExtractedErlangParser.TryClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#tryClause}.
	 * @param ctx the parse tree
	 */
	void exitTryClause(@NotNull ExtractedErlangParser.TryClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#topTypes}.
	 * @param ctx the parse tree
	 */
	void enterTopTypes(@NotNull ExtractedErlangParser.TopTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#topTypes}.
	 * @param ctx the parse tree
	 */
	void exitTopTypes(@NotNull ExtractedErlangParser.TopTypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#funType100}.
	 * @param ctx the parse tree
	 */
	void enterFunType100(@NotNull ExtractedErlangParser.FunType100Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#funType100}.
	 * @param ctx the parse tree
	 */
	void exitFunType100(@NotNull ExtractedErlangParser.FunType100Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#binaryComprehension}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComprehension(@NotNull ExtractedErlangParser.BinaryComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#binaryComprehension}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComprehension(@NotNull ExtractedErlangParser.BinaryComprehensionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterForms(@NotNull ExtractedErlangParser.FormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitForms(@NotNull ExtractedErlangParser.FormsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#listOp}.
	 * @param ctx the parse tree
	 */
	void enterListOp(@NotNull ExtractedErlangParser.ListOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#listOp}.
	 * @param ctx the parse tree
	 */
	void exitListOp(@NotNull ExtractedErlangParser.ListOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull ExtractedErlangParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull ExtractedErlangParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull ExtractedErlangParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull ExtractedErlangParser.ArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedErlangParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void enterTryCatch(@NotNull ExtractedErlangParser.TryCatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedErlangParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void exitTryCatch(@NotNull ExtractedErlangParser.TryCatchContext ctx);
}