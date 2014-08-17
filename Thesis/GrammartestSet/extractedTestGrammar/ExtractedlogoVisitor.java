// Generated from Extractedlogo.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedlogoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedlogoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ExtractedlogoParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#deref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeref(@NotNull ExtractedlogoParser.DerefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#setxy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetxy(@NotNull ExtractedlogoParser.SetxyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#stop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop(@NotNull ExtractedlogoParser.StopContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#home}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome(@NotNull ExtractedlogoParser.HomeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(@NotNull ExtractedlogoParser.MultiplyingExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#ht}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHt(@NotNull ExtractedlogoParser.HtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ExtractedlogoParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull ExtractedlogoParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#lt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(@NotNull ExtractedlogoParser.LtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(@NotNull ExtractedlogoParser.RepeatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull ExtractedlogoParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(@NotNull ExtractedlogoParser.ProcedureDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#signExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignExpression(@NotNull ExtractedlogoParser.SignExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#bk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBk(@NotNull ExtractedlogoParser.BkContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#procedureInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureInvocation(@NotNull ExtractedlogoParser.ProcedureInvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull ExtractedlogoParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull ExtractedlogoParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull ExtractedlogoParser.FuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#fore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFore(@NotNull ExtractedlogoParser.ForeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSt(@NotNull ExtractedlogoParser.StContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(@NotNull ExtractedlogoParser.ComparisonOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#random}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandom(@NotNull ExtractedlogoParser.RandomContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull ExtractedlogoParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull ExtractedlogoParser.LabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#stringliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringliteral(@NotNull ExtractedlogoParser.StringliteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#fd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFd(@NotNull ExtractedlogoParser.FdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(@NotNull ExtractedlogoParser.ComparisonContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull ExtractedlogoParser.PrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#cs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCs(@NotNull ExtractedlogoParser.CsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#pd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPd(@NotNull ExtractedlogoParser.PdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(@NotNull ExtractedlogoParser.CmdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#ife}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfe(@NotNull ExtractedlogoParser.IfeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarations(@NotNull ExtractedlogoParser.ParameterDeclarationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#pu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPu(@NotNull ExtractedlogoParser.PuContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#rt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRt(@NotNull ExtractedlogoParser.RtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull ExtractedlogoParser.CommentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedlogoParser#make}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMake(@NotNull ExtractedlogoParser.MakeContext ctx);
}