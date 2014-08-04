// Generated from Extractedlogo.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedlogoParser}.
 */
public interface ExtractedlogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ExtractedlogoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ExtractedlogoParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDeref(@NotNull ExtractedlogoParser.DerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDeref(@NotNull ExtractedlogoParser.DerefContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#setxy}.
	 * @param ctx the parse tree
	 */
	void enterSetxy(@NotNull ExtractedlogoParser.SetxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#setxy}.
	 * @param ctx the parse tree
	 */
	void exitSetxy(@NotNull ExtractedlogoParser.SetxyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#stop}.
	 * @param ctx the parse tree
	 */
	void enterStop(@NotNull ExtractedlogoParser.StopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#stop}.
	 * @param ctx the parse tree
	 */
	void exitStop(@NotNull ExtractedlogoParser.StopContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#home}.
	 * @param ctx the parse tree
	 */
	void enterHome(@NotNull ExtractedlogoParser.HomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#home}.
	 * @param ctx the parse tree
	 */
	void exitHome(@NotNull ExtractedlogoParser.HomeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(@NotNull ExtractedlogoParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(@NotNull ExtractedlogoParser.MultiplyingExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#ht}.
	 * @param ctx the parse tree
	 */
	void enterHt(@NotNull ExtractedlogoParser.HtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#ht}.
	 * @param ctx the parse tree
	 */
	void exitHt(@NotNull ExtractedlogoParser.HtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ExtractedlogoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ExtractedlogoParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull ExtractedlogoParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull ExtractedlogoParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#lt}.
	 * @param ctx the parse tree
	 */
	void enterLt(@NotNull ExtractedlogoParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#lt}.
	 * @param ctx the parse tree
	 */
	void exitLt(@NotNull ExtractedlogoParser.LtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(@NotNull ExtractedlogoParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(@NotNull ExtractedlogoParser.RepeatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ExtractedlogoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ExtractedlogoParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(@NotNull ExtractedlogoParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(@NotNull ExtractedlogoParser.ProcedureDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#signExpression}.
	 * @param ctx the parse tree
	 */
	void enterSignExpression(@NotNull ExtractedlogoParser.SignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#signExpression}.
	 * @param ctx the parse tree
	 */
	void exitSignExpression(@NotNull ExtractedlogoParser.SignExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#bk}.
	 * @param ctx the parse tree
	 */
	void enterBk(@NotNull ExtractedlogoParser.BkContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#bk}.
	 * @param ctx the parse tree
	 */
	void exitBk(@NotNull ExtractedlogoParser.BkContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#procedureInvocation}.
	 * @param ctx the parse tree
	 */
	void enterProcedureInvocation(@NotNull ExtractedlogoParser.ProcedureInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#procedureInvocation}.
	 * @param ctx the parse tree
	 */
	void exitProcedureInvocation(@NotNull ExtractedlogoParser.ProcedureInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull ExtractedlogoParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull ExtractedlogoParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ExtractedlogoParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ExtractedlogoParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull ExtractedlogoParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull ExtractedlogoParser.FuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#fore}.
	 * @param ctx the parse tree
	 */
	void enterFore(@NotNull ExtractedlogoParser.ForeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#fore}.
	 * @param ctx the parse tree
	 */
	void exitFore(@NotNull ExtractedlogoParser.ForeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#st}.
	 * @param ctx the parse tree
	 */
	void enterSt(@NotNull ExtractedlogoParser.StContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#st}.
	 * @param ctx the parse tree
	 */
	void exitSt(@NotNull ExtractedlogoParser.StContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(@NotNull ExtractedlogoParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(@NotNull ExtractedlogoParser.ComparisonOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandom(@NotNull ExtractedlogoParser.RandomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandom(@NotNull ExtractedlogoParser.RandomContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull ExtractedlogoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull ExtractedlogoParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull ExtractedlogoParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull ExtractedlogoParser.LabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void enterStringliteral(@NotNull ExtractedlogoParser.StringliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void exitStringliteral(@NotNull ExtractedlogoParser.StringliteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#fd}.
	 * @param ctx the parse tree
	 */
	void enterFd(@NotNull ExtractedlogoParser.FdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#fd}.
	 * @param ctx the parse tree
	 */
	void exitFd(@NotNull ExtractedlogoParser.FdContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull ExtractedlogoParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull ExtractedlogoParser.ComparisonContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull ExtractedlogoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull ExtractedlogoParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#cs}.
	 * @param ctx the parse tree
	 */
	void enterCs(@NotNull ExtractedlogoParser.CsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#cs}.
	 * @param ctx the parse tree
	 */
	void exitCs(@NotNull ExtractedlogoParser.CsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#pd}.
	 * @param ctx the parse tree
	 */
	void enterPd(@NotNull ExtractedlogoParser.PdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#pd}.
	 * @param ctx the parse tree
	 */
	void exitPd(@NotNull ExtractedlogoParser.PdContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull ExtractedlogoParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull ExtractedlogoParser.CmdContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#ife}.
	 * @param ctx the parse tree
	 */
	void enterIfe(@NotNull ExtractedlogoParser.IfeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#ife}.
	 * @param ctx the parse tree
	 */
	void exitIfe(@NotNull ExtractedlogoParser.IfeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarations(@NotNull ExtractedlogoParser.ParameterDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarations(@NotNull ExtractedlogoParser.ParameterDeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#pu}.
	 * @param ctx the parse tree
	 */
	void enterPu(@NotNull ExtractedlogoParser.PuContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#pu}.
	 * @param ctx the parse tree
	 */
	void exitPu(@NotNull ExtractedlogoParser.PuContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#rt}.
	 * @param ctx the parse tree
	 */
	void enterRt(@NotNull ExtractedlogoParser.RtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#rt}.
	 * @param ctx the parse tree
	 */
	void exitRt(@NotNull ExtractedlogoParser.RtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull ExtractedlogoParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull ExtractedlogoParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedlogoParser#make}.
	 * @param ctx the parse tree
	 */
	void enterMake(@NotNull ExtractedlogoParser.MakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedlogoParser#make}.
	 * @param ctx the parse tree
	 */
	void exitMake(@NotNull ExtractedlogoParser.MakeContext ctx);
}