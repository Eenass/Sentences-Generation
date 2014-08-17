// Generated from logo.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link logoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface logoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link logoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull logoParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#deref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeref(@NotNull logoParser.DerefContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#setxy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetxy(@NotNull logoParser.SetxyContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#stop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop(@NotNull logoParser.StopContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#home}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome(@NotNull logoParser.HomeContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(@NotNull logoParser.MultiplyingExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#ht}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHt(@NotNull logoParser.HtContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull logoParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull logoParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#lt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(@NotNull logoParser.LtContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(@NotNull logoParser.RepeatContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull logoParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(@NotNull logoParser.ProcedureDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#signExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignExpression(@NotNull logoParser.SignExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#bk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBk(@NotNull logoParser.BkContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#procedureInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureInvocation(@NotNull logoParser.ProcedureInvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull logoParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull logoParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull logoParser.FuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#fore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFore(@NotNull logoParser.ForeContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSt(@NotNull logoParser.StContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(@NotNull logoParser.ComparisonOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#random}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandom(@NotNull logoParser.RandomContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull logoParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull logoParser.LabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#stringliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringliteral(@NotNull logoParser.StringliteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#fd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFd(@NotNull logoParser.FdContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(@NotNull logoParser.ComparisonContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull logoParser.PrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#cs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCs(@NotNull logoParser.CsContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#pd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPd(@NotNull logoParser.PdContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(@NotNull logoParser.CmdContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#ife}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfe(@NotNull logoParser.IfeContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarations(@NotNull logoParser.ParameterDeclarationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#pu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPu(@NotNull logoParser.PuContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#rt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRt(@NotNull logoParser.RtContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull logoParser.CommentContext ctx);

	/**
	 * Visit a parse tree produced by {@link logoParser#make}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMake(@NotNull logoParser.MakeContext ctx);
}