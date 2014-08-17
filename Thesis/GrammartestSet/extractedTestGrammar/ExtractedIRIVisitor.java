// Generated from ExtractedIRI.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedIRIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedIRIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(@NotNull ExtractedIRIParser.PortContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#pct_encoded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPct_encoded(@NotNull ExtractedIRIParser.Pct_encodedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ls32}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLs32(@NotNull ExtractedIRIParser.Ls32Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ipchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpchar(@NotNull ExtractedIRIParser.IpcharContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#non_zero_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_zero_digit(@NotNull ExtractedIRIParser.Non_zero_digitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#h16}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH16(@NotNull ExtractedIRIParser.H16Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ip_v6_address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp_v6_address(@NotNull ExtractedIRIParser.Ip_v6_addressContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ipath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpath(@NotNull ExtractedIRIParser.IpathContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ireg_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIreg_name(@NotNull ExtractedIRIParser.Ireg_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ihier_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIhier_part(@NotNull ExtractedIRIParser.Ihier_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#absolute_iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolute_iri(@NotNull ExtractedIRIParser.Absolute_iriContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ipath_abempty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpath_abempty(@NotNull ExtractedIRIParser.Ipath_abemptyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#unreserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreserved(@NotNull ExtractedIRIParser.UnreservedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri(@NotNull ExtractedIRIParser.IriContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ifragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfragment(@NotNull ExtractedIRIParser.IfragmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheme(@NotNull ExtractedIRIParser.SchemeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ipath_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpath_empty(@NotNull ExtractedIRIParser.Ipath_emptyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha(@NotNull ExtractedIRIParser.AlphaContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ip_v_future}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp_v_future(@NotNull ExtractedIRIParser.Ip_v_futureContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ip_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp_literal(@NotNull ExtractedIRIParser.Ip_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#dec_octet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_octet(@NotNull ExtractedIRIParser.Dec_octetContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#iuserinfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIuserinfo(@NotNull ExtractedIRIParser.IuserinfoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull ExtractedIRIParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ipath_absolute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpath_absolute(@NotNull ExtractedIRIParser.Ipath_absoluteContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#isegment_nz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsegment_nz(@NotNull ExtractedIRIParser.Isegment_nzContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#iquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIquery(@NotNull ExtractedIRIParser.IqueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#irelative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIrelative_part(@NotNull ExtractedIRIParser.Irelative_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ip_v4_address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp_v4_address(@NotNull ExtractedIRIParser.Ip_v4_addressContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#irelative_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIrelative_ref(@NotNull ExtractedIRIParser.Irelative_refContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#reserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserved(@NotNull ExtractedIRIParser.ReservedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#isegment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsegment(@NotNull ExtractedIRIParser.IsegmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#hexdig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexdig(@NotNull ExtractedIRIParser.HexdigContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ihost}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIhost(@NotNull ExtractedIRIParser.IhostContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(@NotNull ExtractedIRIParser.DigitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#iauthority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIauthority(@NotNull ExtractedIRIParser.IauthorityContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ipath_noscheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpath_noscheme(@NotNull ExtractedIRIParser.Ipath_noschemeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#isegment_nz_nc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsegment_nz_nc(@NotNull ExtractedIRIParser.Isegment_nz_ncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#sub_delims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_delims(@NotNull ExtractedIRIParser.Sub_delimsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#iri_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri_reference(@NotNull ExtractedIRIParser.Iri_referenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#gen_delims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGen_delims(@NotNull ExtractedIRIParser.Gen_delimsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#ipath_rootless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpath_rootless(@NotNull ExtractedIRIParser.Ipath_rootlessContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIRIParser#iunreserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIunreserved(@NotNull ExtractedIRIParser.IunreservedContext ctx);
}