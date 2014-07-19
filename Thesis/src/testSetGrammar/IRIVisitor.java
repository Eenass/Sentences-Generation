// Generated from IRI.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IRIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IRIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IRIParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(@NotNull IRIParser.PortContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#pct_encoded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPct_encoded(@NotNull IRIParser.Pct_encodedContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ls32}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLs32(@NotNull IRIParser.Ls32Context ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ipchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpchar(@NotNull IRIParser.IpcharContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#non_zero_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_zero_digit(@NotNull IRIParser.Non_zero_digitContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#h16}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH16(@NotNull IRIParser.H16Context ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ip_v6_address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp_v6_address(@NotNull IRIParser.Ip_v6_addressContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ipath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpath(@NotNull IRIParser.IpathContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ireg_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIreg_name(@NotNull IRIParser.Ireg_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ihier_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIhier_part(@NotNull IRIParser.Ihier_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#absolute_iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolute_iri(@NotNull IRIParser.Absolute_iriContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ipath_abempty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpath_abempty(@NotNull IRIParser.Ipath_abemptyContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#unreserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreserved(@NotNull IRIParser.UnreservedContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri(@NotNull IRIParser.IriContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ifragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfragment(@NotNull IRIParser.IfragmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheme(@NotNull IRIParser.SchemeContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ipath_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpath_empty(@NotNull IRIParser.Ipath_emptyContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha(@NotNull IRIParser.AlphaContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ip_v_future}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp_v_future(@NotNull IRIParser.Ip_v_futureContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ip_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp_literal(@NotNull IRIParser.Ip_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#dec_octet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_octet(@NotNull IRIParser.Dec_octetContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#iuserinfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIuserinfo(@NotNull IRIParser.IuserinfoContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull IRIParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ipath_absolute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpath_absolute(@NotNull IRIParser.Ipath_absoluteContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#isegment_nz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsegment_nz(@NotNull IRIParser.Isegment_nzContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#iquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIquery(@NotNull IRIParser.IqueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#irelative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIrelative_part(@NotNull IRIParser.Irelative_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ip_v4_address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp_v4_address(@NotNull IRIParser.Ip_v4_addressContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#irelative_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIrelative_ref(@NotNull IRIParser.Irelative_refContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#reserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserved(@NotNull IRIParser.ReservedContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#isegment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsegment(@NotNull IRIParser.IsegmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#hexdig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexdig(@NotNull IRIParser.HexdigContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ihost}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIhost(@NotNull IRIParser.IhostContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(@NotNull IRIParser.DigitContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#iauthority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIauthority(@NotNull IRIParser.IauthorityContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ipath_noscheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpath_noscheme(@NotNull IRIParser.Ipath_noschemeContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#isegment_nz_nc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsegment_nz_nc(@NotNull IRIParser.Isegment_nz_ncContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#sub_delims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_delims(@NotNull IRIParser.Sub_delimsContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#iri_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri_reference(@NotNull IRIParser.Iri_referenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#gen_delims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGen_delims(@NotNull IRIParser.Gen_delimsContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#ipath_rootless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpath_rootless(@NotNull IRIParser.Ipath_rootlessContext ctx);

	/**
	 * Visit a parse tree produced by {@link IRIParser#iunreserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIunreserved(@NotNull IRIParser.IunreservedContext ctx);
}