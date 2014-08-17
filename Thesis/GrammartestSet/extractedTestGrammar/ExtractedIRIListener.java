// Generated from ExtractedIRI.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedIRIParser}.
 */
public interface ExtractedIRIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(@NotNull ExtractedIRIParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(@NotNull ExtractedIRIParser.PortContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#pct_encoded}.
	 * @param ctx the parse tree
	 */
	void enterPct_encoded(@NotNull ExtractedIRIParser.Pct_encodedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#pct_encoded}.
	 * @param ctx the parse tree
	 */
	void exitPct_encoded(@NotNull ExtractedIRIParser.Pct_encodedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ls32}.
	 * @param ctx the parse tree
	 */
	void enterLs32(@NotNull ExtractedIRIParser.Ls32Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ls32}.
	 * @param ctx the parse tree
	 */
	void exitLs32(@NotNull ExtractedIRIParser.Ls32Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ipchar}.
	 * @param ctx the parse tree
	 */
	void enterIpchar(@NotNull ExtractedIRIParser.IpcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ipchar}.
	 * @param ctx the parse tree
	 */
	void exitIpchar(@NotNull ExtractedIRIParser.IpcharContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#non_zero_digit}.
	 * @param ctx the parse tree
	 */
	void enterNon_zero_digit(@NotNull ExtractedIRIParser.Non_zero_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#non_zero_digit}.
	 * @param ctx the parse tree
	 */
	void exitNon_zero_digit(@NotNull ExtractedIRIParser.Non_zero_digitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#h16}.
	 * @param ctx the parse tree
	 */
	void enterH16(@NotNull ExtractedIRIParser.H16Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#h16}.
	 * @param ctx the parse tree
	 */
	void exitH16(@NotNull ExtractedIRIParser.H16Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ip_v6_address}.
	 * @param ctx the parse tree
	 */
	void enterIp_v6_address(@NotNull ExtractedIRIParser.Ip_v6_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ip_v6_address}.
	 * @param ctx the parse tree
	 */
	void exitIp_v6_address(@NotNull ExtractedIRIParser.Ip_v6_addressContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ipath}.
	 * @param ctx the parse tree
	 */
	void enterIpath(@NotNull ExtractedIRIParser.IpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ipath}.
	 * @param ctx the parse tree
	 */
	void exitIpath(@NotNull ExtractedIRIParser.IpathContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ireg_name}.
	 * @param ctx the parse tree
	 */
	void enterIreg_name(@NotNull ExtractedIRIParser.Ireg_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ireg_name}.
	 * @param ctx the parse tree
	 */
	void exitIreg_name(@NotNull ExtractedIRIParser.Ireg_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ihier_part}.
	 * @param ctx the parse tree
	 */
	void enterIhier_part(@NotNull ExtractedIRIParser.Ihier_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ihier_part}.
	 * @param ctx the parse tree
	 */
	void exitIhier_part(@NotNull ExtractedIRIParser.Ihier_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#absolute_iri}.
	 * @param ctx the parse tree
	 */
	void enterAbsolute_iri(@NotNull ExtractedIRIParser.Absolute_iriContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#absolute_iri}.
	 * @param ctx the parse tree
	 */
	void exitAbsolute_iri(@NotNull ExtractedIRIParser.Absolute_iriContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ipath_abempty}.
	 * @param ctx the parse tree
	 */
	void enterIpath_abempty(@NotNull ExtractedIRIParser.Ipath_abemptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ipath_abempty}.
	 * @param ctx the parse tree
	 */
	void exitIpath_abempty(@NotNull ExtractedIRIParser.Ipath_abemptyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#unreserved}.
	 * @param ctx the parse tree
	 */
	void enterUnreserved(@NotNull ExtractedIRIParser.UnreservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#unreserved}.
	 * @param ctx the parse tree
	 */
	void exitUnreserved(@NotNull ExtractedIRIParser.UnreservedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(@NotNull ExtractedIRIParser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(@NotNull ExtractedIRIParser.IriContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ifragment}.
	 * @param ctx the parse tree
	 */
	void enterIfragment(@NotNull ExtractedIRIParser.IfragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ifragment}.
	 * @param ctx the parse tree
	 */
	void exitIfragment(@NotNull ExtractedIRIParser.IfragmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(@NotNull ExtractedIRIParser.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(@NotNull ExtractedIRIParser.SchemeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ipath_empty}.
	 * @param ctx the parse tree
	 */
	void enterIpath_empty(@NotNull ExtractedIRIParser.Ipath_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ipath_empty}.
	 * @param ctx the parse tree
	 */
	void exitIpath_empty(@NotNull ExtractedIRIParser.Ipath_emptyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(@NotNull ExtractedIRIParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(@NotNull ExtractedIRIParser.AlphaContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ip_v_future}.
	 * @param ctx the parse tree
	 */
	void enterIp_v_future(@NotNull ExtractedIRIParser.Ip_v_futureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ip_v_future}.
	 * @param ctx the parse tree
	 */
	void exitIp_v_future(@NotNull ExtractedIRIParser.Ip_v_futureContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ip_literal}.
	 * @param ctx the parse tree
	 */
	void enterIp_literal(@NotNull ExtractedIRIParser.Ip_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ip_literal}.
	 * @param ctx the parse tree
	 */
	void exitIp_literal(@NotNull ExtractedIRIParser.Ip_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#dec_octet}.
	 * @param ctx the parse tree
	 */
	void enterDec_octet(@NotNull ExtractedIRIParser.Dec_octetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#dec_octet}.
	 * @param ctx the parse tree
	 */
	void exitDec_octet(@NotNull ExtractedIRIParser.Dec_octetContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#iuserinfo}.
	 * @param ctx the parse tree
	 */
	void enterIuserinfo(@NotNull ExtractedIRIParser.IuserinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#iuserinfo}.
	 * @param ctx the parse tree
	 */
	void exitIuserinfo(@NotNull ExtractedIRIParser.IuserinfoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull ExtractedIRIParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull ExtractedIRIParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ipath_absolute}.
	 * @param ctx the parse tree
	 */
	void enterIpath_absolute(@NotNull ExtractedIRIParser.Ipath_absoluteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ipath_absolute}.
	 * @param ctx the parse tree
	 */
	void exitIpath_absolute(@NotNull ExtractedIRIParser.Ipath_absoluteContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#isegment_nz}.
	 * @param ctx the parse tree
	 */
	void enterIsegment_nz(@NotNull ExtractedIRIParser.Isegment_nzContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#isegment_nz}.
	 * @param ctx the parse tree
	 */
	void exitIsegment_nz(@NotNull ExtractedIRIParser.Isegment_nzContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#iquery}.
	 * @param ctx the parse tree
	 */
	void enterIquery(@NotNull ExtractedIRIParser.IqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#iquery}.
	 * @param ctx the parse tree
	 */
	void exitIquery(@NotNull ExtractedIRIParser.IqueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#irelative_part}.
	 * @param ctx the parse tree
	 */
	void enterIrelative_part(@NotNull ExtractedIRIParser.Irelative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#irelative_part}.
	 * @param ctx the parse tree
	 */
	void exitIrelative_part(@NotNull ExtractedIRIParser.Irelative_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ip_v4_address}.
	 * @param ctx the parse tree
	 */
	void enterIp_v4_address(@NotNull ExtractedIRIParser.Ip_v4_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ip_v4_address}.
	 * @param ctx the parse tree
	 */
	void exitIp_v4_address(@NotNull ExtractedIRIParser.Ip_v4_addressContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#irelative_ref}.
	 * @param ctx the parse tree
	 */
	void enterIrelative_ref(@NotNull ExtractedIRIParser.Irelative_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#irelative_ref}.
	 * @param ctx the parse tree
	 */
	void exitIrelative_ref(@NotNull ExtractedIRIParser.Irelative_refContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#reserved}.
	 * @param ctx the parse tree
	 */
	void enterReserved(@NotNull ExtractedIRIParser.ReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#reserved}.
	 * @param ctx the parse tree
	 */
	void exitReserved(@NotNull ExtractedIRIParser.ReservedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#isegment}.
	 * @param ctx the parse tree
	 */
	void enterIsegment(@NotNull ExtractedIRIParser.IsegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#isegment}.
	 * @param ctx the parse tree
	 */
	void exitIsegment(@NotNull ExtractedIRIParser.IsegmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#hexdig}.
	 * @param ctx the parse tree
	 */
	void enterHexdig(@NotNull ExtractedIRIParser.HexdigContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#hexdig}.
	 * @param ctx the parse tree
	 */
	void exitHexdig(@NotNull ExtractedIRIParser.HexdigContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ihost}.
	 * @param ctx the parse tree
	 */
	void enterIhost(@NotNull ExtractedIRIParser.IhostContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ihost}.
	 * @param ctx the parse tree
	 */
	void exitIhost(@NotNull ExtractedIRIParser.IhostContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(@NotNull ExtractedIRIParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(@NotNull ExtractedIRIParser.DigitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#iauthority}.
	 * @param ctx the parse tree
	 */
	void enterIauthority(@NotNull ExtractedIRIParser.IauthorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#iauthority}.
	 * @param ctx the parse tree
	 */
	void exitIauthority(@NotNull ExtractedIRIParser.IauthorityContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ipath_noscheme}.
	 * @param ctx the parse tree
	 */
	void enterIpath_noscheme(@NotNull ExtractedIRIParser.Ipath_noschemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ipath_noscheme}.
	 * @param ctx the parse tree
	 */
	void exitIpath_noscheme(@NotNull ExtractedIRIParser.Ipath_noschemeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#isegment_nz_nc}.
	 * @param ctx the parse tree
	 */
	void enterIsegment_nz_nc(@NotNull ExtractedIRIParser.Isegment_nz_ncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#isegment_nz_nc}.
	 * @param ctx the parse tree
	 */
	void exitIsegment_nz_nc(@NotNull ExtractedIRIParser.Isegment_nz_ncContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#sub_delims}.
	 * @param ctx the parse tree
	 */
	void enterSub_delims(@NotNull ExtractedIRIParser.Sub_delimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#sub_delims}.
	 * @param ctx the parse tree
	 */
	void exitSub_delims(@NotNull ExtractedIRIParser.Sub_delimsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#iri_reference}.
	 * @param ctx the parse tree
	 */
	void enterIri_reference(@NotNull ExtractedIRIParser.Iri_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#iri_reference}.
	 * @param ctx the parse tree
	 */
	void exitIri_reference(@NotNull ExtractedIRIParser.Iri_referenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#gen_delims}.
	 * @param ctx the parse tree
	 */
	void enterGen_delims(@NotNull ExtractedIRIParser.Gen_delimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#gen_delims}.
	 * @param ctx the parse tree
	 */
	void exitGen_delims(@NotNull ExtractedIRIParser.Gen_delimsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#ipath_rootless}.
	 * @param ctx the parse tree
	 */
	void enterIpath_rootless(@NotNull ExtractedIRIParser.Ipath_rootlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#ipath_rootless}.
	 * @param ctx the parse tree
	 */
	void exitIpath_rootless(@NotNull ExtractedIRIParser.Ipath_rootlessContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIRIParser#iunreserved}.
	 * @param ctx the parse tree
	 */
	void enterIunreserved(@NotNull ExtractedIRIParser.IunreservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIRIParser#iunreserved}.
	 * @param ctx the parse tree
	 */
	void exitIunreserved(@NotNull ExtractedIRIParser.IunreservedContext ctx);
}