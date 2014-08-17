// Generated from logo.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link logoParser}.
 */
public interface logoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link logoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull logoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull logoParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDeref(@NotNull logoParser.DerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDeref(@NotNull logoParser.DerefContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#setxy}.
	 * @param ctx the parse tree
	 */
	void enterSetxy(@NotNull logoParser.SetxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#setxy}.
	 * @param ctx the parse tree
	 */
	void exitSetxy(@NotNull logoParser.SetxyContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#stop}.
	 * @param ctx the parse tree
	 */
	void enterStop(@NotNull logoParser.StopContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#stop}.
	 * @param ctx the parse tree
	 */
	void exitStop(@NotNull logoParser.StopContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#home}.
	 * @param ctx the parse tree
	 */
	void enterHome(@NotNull logoParser.HomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#home}.
	 * @param ctx the parse tree
	 */
	void exitHome(@NotNull logoParser.HomeContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(@NotNull logoParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(@NotNull logoParser.MultiplyingExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#ht}.
	 * @param ctx the parse tree
	 */
	void enterHt(@NotNull logoParser.HtContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#ht}.
	 * @param ctx the parse tree
	 */
	void exitHt(@NotNull logoParser.HtContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull logoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull logoParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull logoParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull logoParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#lt}.
	 * @param ctx the parse tree
	 */
	void enterLt(@NotNull logoParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#lt}.
	 * @param ctx the parse tree
	 */
	void exitLt(@NotNull logoParser.LtContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(@NotNull logoParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(@NotNull logoParser.RepeatContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull logoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull logoParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(@NotNull logoParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(@NotNull logoParser.ProcedureDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#signExpression}.
	 * @param ctx the parse tree
	 */
	void enterSignExpression(@NotNull logoParser.SignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#signExpression}.
	 * @param ctx the parse tree
	 */
	void exitSignExpression(@NotNull logoParser.SignExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#bk}.
	 * @param ctx the parse tree
	 */
	void enterBk(@NotNull logoParser.BkContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#bk}.
	 * @param ctx the parse tree
	 */
	void exitBk(@NotNull logoParser.BkContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#procedureInvocation}.
	 * @param ctx the parse tree
	 */
	void enterProcedureInvocation(@NotNull logoParser.ProcedureInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#procedureInvocation}.
	 * @param ctx the parse tree
	 */
	void exitProcedureInvocation(@NotNull logoParser.ProcedureInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull logoParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull logoParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull logoParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull logoParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull logoParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull logoParser.FuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#fore}.
	 * @param ctx the parse tree
	 */
	void enterFore(@NotNull logoParser.ForeContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#fore}.
	 * @param ctx the parse tree
	 */
	void exitFore(@NotNull logoParser.ForeContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#st}.
	 * @param ctx the parse tree
	 */
	void enterSt(@NotNull logoParser.StContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#st}.
	 * @param ctx the parse tree
	 */
	void exitSt(@NotNull logoParser.StContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(@NotNull logoParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(@NotNull logoParser.ComparisonOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandom(@NotNull logoParser.RandomContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandom(@NotNull logoParser.RandomContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull logoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull logoParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull logoParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull logoParser.LabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void enterStringliteral(@NotNull logoParser.StringliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void exitStringliteral(@NotNull logoParser.StringliteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#fd}.
	 * @param ctx the parse tree
	 */
	void enterFd(@NotNull logoParser.FdContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#fd}.
	 * @param ctx the parse tree
	 */
	void exitFd(@NotNull logoParser.FdContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull logoParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull logoParser.ComparisonContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull logoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull logoParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#cs}.
	 * @param ctx the parse tree
	 */
	void enterCs(@NotNull logoParser.CsContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#cs}.
	 * @param ctx the parse tree
	 */
	void exitCs(@NotNull logoParser.CsContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#pd}.
	 * @param ctx the parse tree
	 */
	void enterPd(@NotNull logoParser.PdContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#pd}.
	 * @param ctx the parse tree
	 */
	void exitPd(@NotNull logoParser.PdContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull logoParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull logoParser.CmdContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#ife}.
	 * @param ctx the parse tree
	 */
	void enterIfe(@NotNull logoParser.IfeContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#ife}.
	 * @param ctx the parse tree
	 */
	void exitIfe(@NotNull logoParser.IfeContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarations(@NotNull logoParser.ParameterDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarations(@NotNull logoParser.ParameterDeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#pu}.
	 * @param ctx the parse tree
	 */
	void enterPu(@NotNull logoParser.PuContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#pu}.
	 * @param ctx the parse tree
	 */
	void exitPu(@NotNull logoParser.PuContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#rt}.
	 * @param ctx the parse tree
	 */
	void enterRt(@NotNull logoParser.RtContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#rt}.
	 * @param ctx the parse tree
	 */
	void exitRt(@NotNull logoParser.RtContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull logoParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull logoParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link logoParser#make}.
	 * @param ctx the parse tree
	 */
	void enterMake(@NotNull logoParser.MakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link logoParser#make}.
	 * @param ctx the parse tree
	 */
	void exitMake(@NotNull logoParser.MakeContext ctx);
}