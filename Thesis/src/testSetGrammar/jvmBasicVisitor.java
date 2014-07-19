// Generated from jvmBasic.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jvmBasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jvmBasicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#scalestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalestmt(@NotNull jvmBasicParser.ScalestmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#amperoper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmperoper(@NotNull jvmBasicParser.AmperoperContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#ongosubstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOngosubstmt(@NotNull jvmBasicParser.OngosubstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#usrfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsrfunc(@NotNull jvmBasicParser.UsrfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#leftfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftfunc(@NotNull jvmBasicParser.LeftfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#prstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrstmt(@NotNull jvmBasicParser.PrstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#colorstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorstmt(@NotNull jvmBasicParser.ColorstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#onerrstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnerrstmt(@NotNull jvmBasicParser.OnerrstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#rndfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRndfunc(@NotNull jvmBasicParser.RndfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#lomemstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLomemstmt(@NotNull jvmBasicParser.LomemstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#rotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotstmt(@NotNull jvmBasicParser.RotstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#endstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndstmt(@NotNull jvmBasicParser.EndstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#midfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMidfunc(@NotNull jvmBasicParser.MidfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#absfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsfunc(@NotNull jvmBasicParser.AbsfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#gte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGte(@NotNull jvmBasicParser.GteContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarname(@NotNull jvmBasicParser.VarnameContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#waitstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitstmt(@NotNull jvmBasicParser.WaitstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#rightfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightfunc(@NotNull jvmBasicParser.RightfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#sgnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSgnfunc(@NotNull jvmBasicParser.SgnfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#readstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadstmt(@NotNull jvmBasicParser.ReadstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#tanfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTanfunc(@NotNull jvmBasicParser.TanfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#printlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlist(@NotNull jvmBasicParser.PrintlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#chrfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChrfunc(@NotNull jvmBasicParser.ChrfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#forstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt(@NotNull jvmBasicParser.ForstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(@NotNull jvmBasicParser.VarlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#includestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludestmt(@NotNull jvmBasicParser.IncludestmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#pdlfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPdlfunc(@NotNull jvmBasicParser.PdlfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#varsuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsuffix(@NotNull jvmBasicParser.VarsuffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull jvmBasicParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#valfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValfunc(@NotNull jvmBasicParser.ValfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#sinfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinfunc(@NotNull jvmBasicParser.SinfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#datastmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatastmt(@NotNull jvmBasicParser.DatastmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#neq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeq(@NotNull jvmBasicParser.NeqContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#addingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddingExpression(@NotNull jvmBasicParser.AddingExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#datum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatum(@NotNull jvmBasicParser.DatumContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#peekfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeekfunc(@NotNull jvmBasicParser.PeekfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#vlinstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVlinstmt(@NotNull jvmBasicParser.VlinstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull jvmBasicParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#instmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstmt(@NotNull jvmBasicParser.InstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(@NotNull jvmBasicParser.ExprlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#plotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlotstmt(@NotNull jvmBasicParser.PlotstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#spcfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpcfunc(@NotNull jvmBasicParser.SpcfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#lenfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenfunc(@NotNull jvmBasicParser.LenfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#himemstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHimemstmt(@NotNull jvmBasicParser.HimemstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#inputstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputstmt(@NotNull jvmBasicParser.InputstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#ascfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscfunc(@NotNull jvmBasicParser.AscfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#htabstmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtabstmnt(@NotNull jvmBasicParser.HtabstmntContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#amptstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmptstmt(@NotNull jvmBasicParser.AmptstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#scrnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrnfunc(@NotNull jvmBasicParser.ScrnfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#amprstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmprstmt(@NotNull jvmBasicParser.AmprstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#cosfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosfunc(@NotNull jvmBasicParser.CosfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull jvmBasicParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#dimstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimstmt(@NotNull jvmBasicParser.DimstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#hlinstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHlinstmt(@NotNull jvmBasicParser.HlinstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#letstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetstmt(@NotNull jvmBasicParser.LetstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#expfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpfunc(@NotNull jvmBasicParser.ExpfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#linenumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinenumber(@NotNull jvmBasicParser.LinenumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#logfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogfunc(@NotNull jvmBasicParser.LogfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#defstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefstmt(@NotNull jvmBasicParser.DefstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#gosubstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGosubstmt(@NotNull jvmBasicParser.GosubstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull jvmBasicParser.FuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#hcolorstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHcolorstmt(@NotNull jvmBasicParser.HcolorstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#ongotostmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOngotostmt(@NotNull jvmBasicParser.OngotostmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#recallstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecallstmt(@NotNull jvmBasicParser.RecallstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#getstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetstmt(@NotNull jvmBasicParser.GetstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#liststmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListstmt(@NotNull jvmBasicParser.ListstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#intfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntfunc(@NotNull jvmBasicParser.IntfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#strfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrfunc(@NotNull jvmBasicParser.StrfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#speedstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeedstmt(@NotNull jvmBasicParser.SpeedstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#frefunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrefunc(@NotNull jvmBasicParser.FrefuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull jvmBasicParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#drawstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawstmt(@NotNull jvmBasicParser.DrawstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#pokestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPokestmt(@NotNull jvmBasicParser.PokestmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#exponentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentExpression(@NotNull jvmBasicParser.ExponentExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#lte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLte(@NotNull jvmBasicParser.LteContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(@NotNull jvmBasicParser.MultiplyingExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#hplotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHplotstmt(@NotNull jvmBasicParser.HplotstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull jvmBasicParser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#vtabstmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVtabstmnt(@NotNull jvmBasicParser.VtabstmntContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(@NotNull jvmBasicParser.RelopContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#fnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnfunc(@NotNull jvmBasicParser.FnfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(@NotNull jvmBasicParser.ReturnstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#restorestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestorestmt(@NotNull jvmBasicParser.RestorestmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#signExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignExpression(@NotNull jvmBasicParser.SignExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#gotostmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotostmt(@NotNull jvmBasicParser.GotostmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(@NotNull jvmBasicParser.RelationalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#tabstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabstmt(@NotNull jvmBasicParser.TabstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(@NotNull jvmBasicParser.CallstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#storestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorestmt(@NotNull jvmBasicParser.StorestmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#sqrfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrfunc(@NotNull jvmBasicParser.SqrfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(@NotNull jvmBasicParser.IfstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#printstmt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstmt1(@NotNull jvmBasicParser.Printstmt1Context ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#xdrawstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXdrawstmt(@NotNull jvmBasicParser.XdrawstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#posfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosfunc(@NotNull jvmBasicParser.PosfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#variableassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableassignment(@NotNull jvmBasicParser.VariableassignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#popstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPopstmt(@NotNull jvmBasicParser.PopstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#atnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtnfunc(@NotNull jvmBasicParser.AtnfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#vplotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVplotstmt(@NotNull jvmBasicParser.VplotstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(@NotNull jvmBasicParser.VardeclContext ctx);
}