// Generated from ExtractedjvmBasic.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedjvmBasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedjvmBasicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#scalestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalestmt(@NotNull ExtractedjvmBasicParser.ScalestmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#amperoper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmperoper(@NotNull ExtractedjvmBasicParser.AmperoperContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#ongosubstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOngosubstmt(@NotNull ExtractedjvmBasicParser.OngosubstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#usrfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsrfunc(@NotNull ExtractedjvmBasicParser.UsrfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#leftfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftfunc(@NotNull ExtractedjvmBasicParser.LeftfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#prstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrstmt(@NotNull ExtractedjvmBasicParser.PrstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#colorstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorstmt(@NotNull ExtractedjvmBasicParser.ColorstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#onerrstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnerrstmt(@NotNull ExtractedjvmBasicParser.OnerrstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#rndfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRndfunc(@NotNull ExtractedjvmBasicParser.RndfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#lomemstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLomemstmt(@NotNull ExtractedjvmBasicParser.LomemstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#rotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotstmt(@NotNull ExtractedjvmBasicParser.RotstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#endstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndstmt(@NotNull ExtractedjvmBasicParser.EndstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#midfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMidfunc(@NotNull ExtractedjvmBasicParser.MidfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#absfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsfunc(@NotNull ExtractedjvmBasicParser.AbsfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#gte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGte(@NotNull ExtractedjvmBasicParser.GteContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarname(@NotNull ExtractedjvmBasicParser.VarnameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#waitstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitstmt(@NotNull ExtractedjvmBasicParser.WaitstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#rightfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightfunc(@NotNull ExtractedjvmBasicParser.RightfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#sgnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSgnfunc(@NotNull ExtractedjvmBasicParser.SgnfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#readstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadstmt(@NotNull ExtractedjvmBasicParser.ReadstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#tanfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTanfunc(@NotNull ExtractedjvmBasicParser.TanfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#printlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlist(@NotNull ExtractedjvmBasicParser.PrintlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#chrfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChrfunc(@NotNull ExtractedjvmBasicParser.ChrfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#forstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt(@NotNull ExtractedjvmBasicParser.ForstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(@NotNull ExtractedjvmBasicParser.VarlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#includestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludestmt(@NotNull ExtractedjvmBasicParser.IncludestmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#pdlfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPdlfunc(@NotNull ExtractedjvmBasicParser.PdlfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#varsuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsuffix(@NotNull ExtractedjvmBasicParser.VarsuffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull ExtractedjvmBasicParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#valfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValfunc(@NotNull ExtractedjvmBasicParser.ValfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#sinfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinfunc(@NotNull ExtractedjvmBasicParser.SinfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#datastmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatastmt(@NotNull ExtractedjvmBasicParser.DatastmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#neq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeq(@NotNull ExtractedjvmBasicParser.NeqContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#addingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddingExpression(@NotNull ExtractedjvmBasicParser.AddingExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#datum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatum(@NotNull ExtractedjvmBasicParser.DatumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#peekfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeekfunc(@NotNull ExtractedjvmBasicParser.PeekfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#vlinstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVlinstmt(@NotNull ExtractedjvmBasicParser.VlinstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull ExtractedjvmBasicParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#instmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstmt(@NotNull ExtractedjvmBasicParser.InstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(@NotNull ExtractedjvmBasicParser.ExprlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#plotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlotstmt(@NotNull ExtractedjvmBasicParser.PlotstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#spcfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpcfunc(@NotNull ExtractedjvmBasicParser.SpcfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#lenfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenfunc(@NotNull ExtractedjvmBasicParser.LenfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#himemstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHimemstmt(@NotNull ExtractedjvmBasicParser.HimemstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#inputstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputstmt(@NotNull ExtractedjvmBasicParser.InputstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#ascfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscfunc(@NotNull ExtractedjvmBasicParser.AscfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#htabstmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtabstmnt(@NotNull ExtractedjvmBasicParser.HtabstmntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#amptstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmptstmt(@NotNull ExtractedjvmBasicParser.AmptstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#scrnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrnfunc(@NotNull ExtractedjvmBasicParser.ScrnfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#amprstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmprstmt(@NotNull ExtractedjvmBasicParser.AmprstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#cosfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosfunc(@NotNull ExtractedjvmBasicParser.CosfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ExtractedjvmBasicParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#dimstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimstmt(@NotNull ExtractedjvmBasicParser.DimstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#hlinstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHlinstmt(@NotNull ExtractedjvmBasicParser.HlinstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#letstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetstmt(@NotNull ExtractedjvmBasicParser.LetstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#expfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpfunc(@NotNull ExtractedjvmBasicParser.ExpfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#linenumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinenumber(@NotNull ExtractedjvmBasicParser.LinenumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#logfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogfunc(@NotNull ExtractedjvmBasicParser.LogfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#defstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefstmt(@NotNull ExtractedjvmBasicParser.DefstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#gosubstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGosubstmt(@NotNull ExtractedjvmBasicParser.GosubstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull ExtractedjvmBasicParser.FuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#hcolorstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHcolorstmt(@NotNull ExtractedjvmBasicParser.HcolorstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#ongotostmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOngotostmt(@NotNull ExtractedjvmBasicParser.OngotostmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#recallstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecallstmt(@NotNull ExtractedjvmBasicParser.RecallstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#getstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetstmt(@NotNull ExtractedjvmBasicParser.GetstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#liststmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListstmt(@NotNull ExtractedjvmBasicParser.ListstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#intfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntfunc(@NotNull ExtractedjvmBasicParser.IntfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#strfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrfunc(@NotNull ExtractedjvmBasicParser.StrfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#speedstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeedstmt(@NotNull ExtractedjvmBasicParser.SpeedstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#frefunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrefunc(@NotNull ExtractedjvmBasicParser.FrefuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ExtractedjvmBasicParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#drawstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawstmt(@NotNull ExtractedjvmBasicParser.DrawstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#pokestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPokestmt(@NotNull ExtractedjvmBasicParser.PokestmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#exponentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentExpression(@NotNull ExtractedjvmBasicParser.ExponentExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#lte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLte(@NotNull ExtractedjvmBasicParser.LteContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(@NotNull ExtractedjvmBasicParser.MultiplyingExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#hplotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHplotstmt(@NotNull ExtractedjvmBasicParser.HplotstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull ExtractedjvmBasicParser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#vtabstmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVtabstmnt(@NotNull ExtractedjvmBasicParser.VtabstmntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(@NotNull ExtractedjvmBasicParser.RelopContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#fnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnfunc(@NotNull ExtractedjvmBasicParser.FnfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(@NotNull ExtractedjvmBasicParser.ReturnstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#restorestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestorestmt(@NotNull ExtractedjvmBasicParser.RestorestmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#signExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignExpression(@NotNull ExtractedjvmBasicParser.SignExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#gotostmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotostmt(@NotNull ExtractedjvmBasicParser.GotostmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(@NotNull ExtractedjvmBasicParser.RelationalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#tabstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabstmt(@NotNull ExtractedjvmBasicParser.TabstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(@NotNull ExtractedjvmBasicParser.CallstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#storestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorestmt(@NotNull ExtractedjvmBasicParser.StorestmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#sqrfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrfunc(@NotNull ExtractedjvmBasicParser.SqrfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(@NotNull ExtractedjvmBasicParser.IfstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#printstmt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstmt1(@NotNull ExtractedjvmBasicParser.Printstmt1Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#xdrawstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXdrawstmt(@NotNull ExtractedjvmBasicParser.XdrawstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#posfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosfunc(@NotNull ExtractedjvmBasicParser.PosfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#variableassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableassignment(@NotNull ExtractedjvmBasicParser.VariableassignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#popstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPopstmt(@NotNull ExtractedjvmBasicParser.PopstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#atnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtnfunc(@NotNull ExtractedjvmBasicParser.AtnfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#vplotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVplotstmt(@NotNull ExtractedjvmBasicParser.VplotstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedjvmBasicParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(@NotNull ExtractedjvmBasicParser.VardeclContext ctx);
}