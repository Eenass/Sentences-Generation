// Generated from ExtractedIDL.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedIDLParser}.
 */
public interface ExtractedIDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#factory_decl}.
	 * @param ctx the parse tree
	 */
	void enterFactory_decl(@NotNull ExtractedIDLParser.Factory_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#factory_decl}.
	 * @param ctx the parse tree
	 */
	void exitFactory_decl(@NotNull ExtractedIDLParser.Factory_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull ExtractedIDLParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull ExtractedIDLParser.DeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#event_abs_decl}.
	 * @param ctx the parse tree
	 */
	void enterEvent_abs_decl(@NotNull ExtractedIDLParser.Event_abs_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#event_abs_decl}.
	 * @param ctx the parse tree
	 */
	void exitEvent_abs_decl(@NotNull ExtractedIDLParser.Event_abs_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#home_export}.
	 * @param ctx the parse tree
	 */
	void enterHome_export(@NotNull ExtractedIDLParser.Home_exportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#home_export}.
	 * @param ctx the parse tree
	 */
	void exitHome_export(@NotNull ExtractedIDLParser.Home_exportContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#except_decl}.
	 * @param ctx the parse tree
	 */
	void enterExcept_decl(@NotNull ExtractedIDLParser.Except_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#except_decl}.
	 * @param ctx the parse tree
	 */
	void exitExcept_decl(@NotNull ExtractedIDLParser.Except_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#consumes_decl}.
	 * @param ctx the parse tree
	 */
	void enterConsumes_decl(@NotNull ExtractedIDLParser.Consumes_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#consumes_decl}.
	 * @param ctx the parse tree
	 */
	void exitConsumes_decl(@NotNull ExtractedIDLParser.Consumes_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(@NotNull ExtractedIDLParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(@NotNull ExtractedIDLParser.Type_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#union_type}.
	 * @param ctx the parse tree
	 */
	void enterUnion_type(@NotNull ExtractedIDLParser.Union_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#union_type}.
	 * @param ctx the parse tree
	 */
	void exitUnion_type(@NotNull ExtractedIDLParser.Union_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#readonly_attr_spec}.
	 * @param ctx the parse tree
	 */
	void enterReadonly_attr_spec(@NotNull ExtractedIDLParser.Readonly_attr_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#readonly_attr_spec}.
	 * @param ctx the parse tree
	 */
	void exitReadonly_attr_spec(@NotNull ExtractedIDLParser.Readonly_attr_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#object_type}.
	 * @param ctx the parse tree
	 */
	void enterObject_type(@NotNull ExtractedIDLParser.Object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#object_type}.
	 * @param ctx the parse tree
	 */
	void exitObject_type(@NotNull ExtractedIDLParser.Object_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#interface_type}.
	 * @param ctx the parse tree
	 */
	void enterInterface_type(@NotNull ExtractedIDLParser.Interface_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#interface_type}.
	 * @param ctx the parse tree
	 */
	void exitInterface_type(@NotNull ExtractedIDLParser.Interface_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(@NotNull ExtractedIDLParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(@NotNull ExtractedIDLParser.EventContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#op_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterOp_type_spec(@NotNull ExtractedIDLParser.Op_type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#op_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitOp_type_spec(@NotNull ExtractedIDLParser.Op_type_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(@NotNull ExtractedIDLParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(@NotNull ExtractedIDLParser.Shift_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#provides_decl}.
	 * @param ctx the parse tree
	 */
	void enterProvides_decl(@NotNull ExtractedIDLParser.Provides_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#provides_decl}.
	 * @param ctx the parse tree
	 */
	void exitProvides_decl(@NotNull ExtractedIDLParser.Provides_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#value_inheritance_spec}.
	 * @param ctx the parse tree
	 */
	void enterValue_inheritance_spec(@NotNull ExtractedIDLParser.Value_inheritance_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#value_inheritance_spec}.
	 * @param ctx the parse tree
	 */
	void exitValue_inheritance_spec(@NotNull ExtractedIDLParser.Value_inheritance_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declarator(@NotNull ExtractedIDLParser.Simple_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declarator(@NotNull ExtractedIDLParser.Simple_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#octet_type}.
	 * @param ctx the parse tree
	 */
	void enterOctet_type(@NotNull ExtractedIDLParser.Octet_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#octet_type}.
	 * @param ctx the parse tree
	 */
	void exitOctet_type(@NotNull ExtractedIDLParser.Octet_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#get_excep_expr}.
	 * @param ctx the parse tree
	 */
	void enterGet_excep_expr(@NotNull ExtractedIDLParser.Get_excep_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#get_excep_expr}.
	 * @param ctx the parse tree
	 */
	void exitGet_excep_expr(@NotNull ExtractedIDLParser.Get_excep_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void enterSigned_int(@NotNull ExtractedIDLParser.Signed_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void exitSigned_int(@NotNull ExtractedIDLParser.Signed_intContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#op_decl}.
	 * @param ctx the parse tree
	 */
	void enterOp_decl(@NotNull ExtractedIDLParser.Op_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#op_decl}.
	 * @param ctx the parse tree
	 */
	void exitOp_decl(@NotNull ExtractedIDLParser.Op_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#parameter_decls}.
	 * @param ctx the parse tree
	 */
	void enterParameter_decls(@NotNull ExtractedIDLParser.Parameter_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#parameter_decls}.
	 * @param ctx the parse tree
	 */
	void exitParameter_decls(@NotNull ExtractedIDLParser.Parameter_declsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#value_box_decl}.
	 * @param ctx the parse tree
	 */
	void enterValue_box_decl(@NotNull ExtractedIDLParser.Value_box_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#value_box_decl}.
	 * @param ctx the parse tree
	 */
	void exitValue_box_decl(@NotNull ExtractedIDLParser.Value_box_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#publishes_decl}.
	 * @param ctx the parse tree
	 */
	void enterPublishes_decl(@NotNull ExtractedIDLParser.Publishes_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#publishes_decl}.
	 * @param ctx the parse tree
	 */
	void exitPublishes_decl(@NotNull ExtractedIDLParser.Publishes_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void enterInteger_type(@NotNull ExtractedIDLParser.Integer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void exitInteger_type(@NotNull ExtractedIDLParser.Integer_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#component_header}.
	 * @param ctx the parse tree
	 */
	void enterComponent_header(@NotNull ExtractedIDLParser.Component_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#component_header}.
	 * @param ctx the parse tree
	 */
	void exitComponent_header(@NotNull ExtractedIDLParser.Component_headerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#context_expr}.
	 * @param ctx the parse tree
	 */
	void enterContext_expr(@NotNull ExtractedIDLParser.Context_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#context_expr}.
	 * @param ctx the parse tree
	 */
	void exitContext_expr(@NotNull ExtractedIDLParser.Context_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#component_forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterComponent_forward_decl(@NotNull ExtractedIDLParser.Component_forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#component_forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitComponent_forward_decl(@NotNull ExtractedIDLParser.Component_forward_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void enterStruct_type(@NotNull ExtractedIDLParser.Struct_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void exitStruct_type(@NotNull ExtractedIDLParser.Struct_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#type_id_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_id_decl(@NotNull ExtractedIDLParser.Type_id_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#type_id_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_id_decl(@NotNull ExtractedIDLParser.Type_id_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#value_name}.
	 * @param ctx the parse tree
	 */
	void enterValue_name(@NotNull ExtractedIDLParser.Value_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#value_name}.
	 * @param ctx the parse tree
	 */
	void exitValue_name(@NotNull ExtractedIDLParser.Value_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(@NotNull ExtractedIDLParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(@NotNull ExtractedIDLParser.Type_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#attr_declarator}.
	 * @param ctx the parse tree
	 */
	void enterAttr_declarator(@NotNull ExtractedIDLParser.Attr_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#attr_declarator}.
	 * @param ctx the parse tree
	 */
	void exitAttr_declarator(@NotNull ExtractedIDLParser.Attr_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#init_param_decls}.
	 * @param ctx the parse tree
	 */
	void enterInit_param_decls(@NotNull ExtractedIDLParser.Init_param_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#init_param_decls}.
	 * @param ctx the parse tree
	 */
	void exitInit_param_decls(@NotNull ExtractedIDLParser.Init_param_declsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void enterInterface_body(@NotNull ExtractedIDLParser.Interface_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void exitInterface_body(@NotNull ExtractedIDLParser.Interface_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#unsigned_longlong_int}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_longlong_int(@NotNull ExtractedIDLParser.Unsigned_longlong_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#unsigned_longlong_int}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_longlong_int(@NotNull ExtractedIDLParser.Unsigned_longlong_intContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#wide_char_type}.
	 * @param ctx the parse tree
	 */
	void enterWide_char_type(@NotNull ExtractedIDLParser.Wide_char_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#wide_char_type}.
	 * @param ctx the parse tree
	 */
	void exitWide_char_type(@NotNull ExtractedIDLParser.Wide_char_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#scoped_name}.
	 * @param ctx the parse tree
	 */
	void enterScoped_name(@NotNull ExtractedIDLParser.Scoped_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#scoped_name}.
	 * @param ctx the parse tree
	 */
	void exitScoped_name(@NotNull ExtractedIDLParser.Scoped_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void enterInterface_name(@NotNull ExtractedIDLParser.Interface_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void exitInterface_name(@NotNull ExtractedIDLParser.Interface_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#value_base_type}.
	 * @param ctx the parse tree
	 */
	void enterValue_base_type(@NotNull ExtractedIDLParser.Value_base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#value_base_type}.
	 * @param ctx the parse tree
	 */
	void exitValue_base_type(@NotNull ExtractedIDLParser.Value_base_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(@NotNull ExtractedIDLParser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(@NotNull ExtractedIDLParser.Any_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#component_body}.
	 * @param ctx the parse tree
	 */
	void enterComponent_body(@NotNull ExtractedIDLParser.Component_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#component_body}.
	 * @param ctx the parse tree
	 */
	void exitComponent_body(@NotNull ExtractedIDLParser.Component_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#home_decl}.
	 * @param ctx the parse tree
	 */
	void enterHome_decl(@NotNull ExtractedIDLParser.Home_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#home_decl}.
	 * @param ctx the parse tree
	 */
	void exitHome_decl(@NotNull ExtractedIDLParser.Home_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#signed_short_int}.
	 * @param ctx the parse tree
	 */
	void enterSigned_short_int(@NotNull ExtractedIDLParser.Signed_short_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#signed_short_int}.
	 * @param ctx the parse tree
	 */
	void exitSigned_short_int(@NotNull ExtractedIDLParser.Signed_short_intContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#raises_expr}.
	 * @param ctx the parse tree
	 */
	void enterRaises_expr(@NotNull ExtractedIDLParser.Raises_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#raises_expr}.
	 * @param ctx the parse tree
	 */
	void exitRaises_expr(@NotNull ExtractedIDLParser.Raises_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#set_excep_expr}.
	 * @param ctx the parse tree
	 */
	void enterSet_excep_expr(@NotNull ExtractedIDLParser.Set_excep_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#set_excep_expr}.
	 * @param ctx the parse tree
	 */
	void exitSet_excep_expr(@NotNull ExtractedIDLParser.Set_excep_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterBase_type_spec(@NotNull ExtractedIDLParser.Base_type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitBase_type_spec(@NotNull ExtractedIDLParser.Base_type_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#wide_string_type}.
	 * @param ctx the parse tree
	 */
	void enterWide_string_type(@NotNull ExtractedIDLParser.Wide_string_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#wide_string_type}.
	 * @param ctx the parse tree
	 */
	void exitWide_string_type(@NotNull ExtractedIDLParser.Wide_string_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(@NotNull ExtractedIDLParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(@NotNull ExtractedIDLParser.MemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(@NotNull ExtractedIDLParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(@NotNull ExtractedIDLParser.ModuleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCase_stmt(@NotNull ExtractedIDLParser.Case_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCase_stmt(@NotNull ExtractedIDLParser.Case_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#supported_interface_spec}.
	 * @param ctx the parse tree
	 */
	void enterSupported_interface_spec(@NotNull ExtractedIDLParser.Supported_interface_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#supported_interface_spec}.
	 * @param ctx the parse tree
	 */
	void exitSupported_interface_spec(@NotNull ExtractedIDLParser.Supported_interface_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#value_header}.
	 * @param ctx the parse tree
	 */
	void enterValue_header(@NotNull ExtractedIDLParser.Value_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#value_header}.
	 * @param ctx the parse tree
	 */
	void exitValue_header(@NotNull ExtractedIDLParser.Value_headerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#sequence_type}.
	 * @param ctx the parse tree
	 */
	void enterSequence_type(@NotNull ExtractedIDLParser.Sequence_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#sequence_type}.
	 * @param ctx the parse tree
	 */
	void exitSequence_type(@NotNull ExtractedIDLParser.Sequence_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#template_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_type_spec(@NotNull ExtractedIDLParser.Template_type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#template_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_type_spec(@NotNull ExtractedIDLParser.Template_type_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expr(@NotNull ExtractedIDLParser.Primary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expr(@NotNull ExtractedIDLParser.Primary_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#finder_decl}.
	 * @param ctx the parse tree
	 */
	void enterFinder_decl(@NotNull ExtractedIDLParser.Finder_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#finder_decl}.
	 * @param ctx the parse tree
	 */
	void exitFinder_decl(@NotNull ExtractedIDLParser.Finder_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#value_forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterValue_forward_decl(@NotNull ExtractedIDLParser.Value_forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#value_forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitValue_forward_decl(@NotNull ExtractedIDLParser.Value_forward_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#value_decl}.
	 * @param ctx the parse tree
	 */
	void enterValue_decl(@NotNull ExtractedIDLParser.Value_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#value_decl}.
	 * @param ctx the parse tree
	 */
	void exitValue_decl(@NotNull ExtractedIDLParser.Value_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#exception_list}.
	 * @param ctx the parse tree
	 */
	void enterException_list(@NotNull ExtractedIDLParser.Exception_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#exception_list}.
	 * @param ctx the parse tree
	 */
	void exitException_list(@NotNull ExtractedIDLParser.Exception_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#component_inheritance_spec}.
	 * @param ctx the parse tree
	 */
	void enterComponent_inheritance_spec(@NotNull ExtractedIDLParser.Component_inheritance_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#component_inheritance_spec}.
	 * @param ctx the parse tree
	 */
	void exitComponent_inheritance_spec(@NotNull ExtractedIDLParser.Component_inheritance_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#component_export}.
	 * @param ctx the parse tree
	 */
	void enterComponent_export(@NotNull ExtractedIDLParser.Component_exportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#component_export}.
	 * @param ctx the parse tree
	 */
	void exitComponent_export(@NotNull ExtractedIDLParser.Component_exportContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#uses_decl}.
	 * @param ctx the parse tree
	 */
	void enterUses_decl(@NotNull ExtractedIDLParser.Uses_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#uses_decl}.
	 * @param ctx the parse tree
	 */
	void exitUses_decl(@NotNull ExtractedIDLParser.Uses_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#fixed_pt_type}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pt_type(@NotNull ExtractedIDLParser.Fixed_pt_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#fixed_pt_type}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pt_type(@NotNull ExtractedIDLParser.Fixed_pt_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#init_decl}.
	 * @param ctx the parse tree
	 */
	void enterInit_decl(@NotNull ExtractedIDLParser.Init_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#init_decl}.
	 * @param ctx the parse tree
	 */
	void exitInit_decl(@NotNull ExtractedIDLParser.Init_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#home_body}.
	 * @param ctx the parse tree
	 */
	void enterHome_body(@NotNull ExtractedIDLParser.Home_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#home_body}.
	 * @param ctx the parse tree
	 */
	void exitHome_body(@NotNull ExtractedIDLParser.Home_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(@NotNull ExtractedIDLParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(@NotNull ExtractedIDLParser.Add_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(@NotNull ExtractedIDLParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(@NotNull ExtractedIDLParser.Unary_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#event_decl}.
	 * @param ctx the parse tree
	 */
	void enterEvent_decl(@NotNull ExtractedIDLParser.Event_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#event_decl}.
	 * @param ctx the parse tree
	 */
	void exitEvent_decl(@NotNull ExtractedIDLParser.Event_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#event_forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterEvent_forward_decl(@NotNull ExtractedIDLParser.Event_forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#event_forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitEvent_forward_decl(@NotNull ExtractedIDLParser.Event_forward_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#constr_forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterConstr_forward_decl(@NotNull ExtractedIDLParser.Constr_forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#constr_forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitConstr_forward_decl(@NotNull ExtractedIDLParser.Constr_forward_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(@NotNull ExtractedIDLParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(@NotNull ExtractedIDLParser.ComponentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#attr_raises_expr}.
	 * @param ctx the parse tree
	 */
	void enterAttr_raises_expr(@NotNull ExtractedIDLParser.Attr_raises_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#attr_raises_expr}.
	 * @param ctx the parse tree
	 */
	void exitAttr_raises_expr(@NotNull ExtractedIDLParser.Attr_raises_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#unsigned_short_int}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_short_int(@NotNull ExtractedIDLParser.Unsigned_short_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#unsigned_short_int}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_short_int(@NotNull ExtractedIDLParser.Unsigned_short_intContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(@NotNull ExtractedIDLParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(@NotNull ExtractedIDLParser.EnumeratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(@NotNull ExtractedIDLParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(@NotNull ExtractedIDLParser.Xor_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#interface_decl}.
	 * @param ctx the parse tree
	 */
	void enterInterface_decl(@NotNull ExtractedIDLParser.Interface_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#interface_decl}.
	 * @param ctx the parse tree
	 */
	void exitInterface_decl(@NotNull ExtractedIDLParser.Interface_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ExtractedIDLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ExtractedIDLParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#string_type}.
	 * @param ctx the parse tree
	 */
	void enterString_type(@NotNull ExtractedIDLParser.String_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#string_type}.
	 * @param ctx the parse tree
	 */
	void exitString_type(@NotNull ExtractedIDLParser.String_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#const_exp}.
	 * @param ctx the parse tree
	 */
	void enterConst_exp(@NotNull ExtractedIDLParser.Const_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#const_exp}.
	 * @param ctx the parse tree
	 */
	void exitConst_exp(@NotNull ExtractedIDLParser.Const_expContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#switch_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_type_spec(@NotNull ExtractedIDLParser.Switch_type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#switch_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_type_spec(@NotNull ExtractedIDLParser.Switch_type_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#array_declarator}.
	 * @param ctx the parse tree
	 */
	void enterArray_declarator(@NotNull ExtractedIDLParser.Array_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#array_declarator}.
	 * @param ctx the parse tree
	 */
	void exitArray_declarator(@NotNull ExtractedIDLParser.Array_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#primary_key_spec}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_key_spec(@NotNull ExtractedIDLParser.Primary_key_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#primary_key_spec}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_key_spec(@NotNull ExtractedIDLParser.Primary_key_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#enum_type}.
	 * @param ctx the parse tree
	 */
	void enterEnum_type(@NotNull ExtractedIDLParser.Enum_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#enum_type}.
	 * @param ctx the parse tree
	 */
	void exitEnum_type(@NotNull ExtractedIDLParser.Enum_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#event_header}.
	 * @param ctx the parse tree
	 */
	void enterEvent_header(@NotNull ExtractedIDLParser.Event_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#event_header}.
	 * @param ctx the parse tree
	 */
	void exitEvent_header(@NotNull ExtractedIDLParser.Event_headerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#simple_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type_spec(@NotNull ExtractedIDLParser.Simple_type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#simple_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type_spec(@NotNull ExtractedIDLParser.Simple_type_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#value_abs_decl}.
	 * @param ctx the parse tree
	 */
	void enterValue_abs_decl(@NotNull ExtractedIDLParser.Value_abs_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#value_abs_decl}.
	 * @param ctx the parse tree
	 */
	void exitValue_abs_decl(@NotNull ExtractedIDLParser.Value_abs_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#state_member}.
	 * @param ctx the parse tree
	 */
	void enterState_member(@NotNull ExtractedIDLParser.State_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#state_member}.
	 * @param ctx the parse tree
	 */
	void exitState_member(@NotNull ExtractedIDLParser.State_memberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#signed_long_int}.
	 * @param ctx the parse tree
	 */
	void enterSigned_long_int(@NotNull ExtractedIDLParser.Signed_long_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#signed_long_int}.
	 * @param ctx the parse tree
	 */
	void exitSigned_long_int(@NotNull ExtractedIDLParser.Signed_long_intContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#home_inheritance_spec}.
	 * @param ctx the parse tree
	 */
	void enterHome_inheritance_spec(@NotNull ExtractedIDLParser.Home_inheritance_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#home_inheritance_spec}.
	 * @param ctx the parse tree
	 */
	void exitHome_inheritance_spec(@NotNull ExtractedIDLParser.Home_inheritance_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#component_decl}.
	 * @param ctx the parse tree
	 */
	void enterComponent_decl(@NotNull ExtractedIDLParser.Component_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#component_decl}.
	 * @param ctx the parse tree
	 */
	void exitComponent_decl(@NotNull ExtractedIDLParser.Component_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#positive_int_const}.
	 * @param ctx the parse tree
	 */
	void enterPositive_int_const(@NotNull ExtractedIDLParser.Positive_int_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#positive_int_const}.
	 * @param ctx the parse tree
	 */
	void exitPositive_int_const(@NotNull ExtractedIDLParser.Positive_int_constContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull ExtractedIDLParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull ExtractedIDLParser.Unary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#value_element}.
	 * @param ctx the parse tree
	 */
	void enterValue_element(@NotNull ExtractedIDLParser.Value_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#value_element}.
	 * @param ctx the parse tree
	 */
	void exitValue_element(@NotNull ExtractedIDLParser.Value_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#init_param_attribute}.
	 * @param ctx the parse tree
	 */
	void enterInit_param_attribute(@NotNull ExtractedIDLParser.Init_param_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#init_param_attribute}.
	 * @param ctx the parse tree
	 */
	void exitInit_param_attribute(@NotNull ExtractedIDLParser.Init_param_attributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#import_decl}.
	 * @param ctx the parse tree
	 */
	void enterImport_decl(@NotNull ExtractedIDLParser.Import_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#import_decl}.
	 * @param ctx the parse tree
	 */
	void exitImport_decl(@NotNull ExtractedIDLParser.Import_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#fixed_pt_const_type}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pt_const_type(@NotNull ExtractedIDLParser.Fixed_pt_const_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#fixed_pt_const_type}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pt_const_type(@NotNull ExtractedIDLParser.Fixed_pt_const_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#init_param_decl}.
	 * @param ctx the parse tree
	 */
	void enterInit_param_decl(@NotNull ExtractedIDLParser.Init_param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#init_param_decl}.
	 * @param ctx the parse tree
	 */
	void exitInit_param_decl(@NotNull ExtractedIDLParser.Init_param_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(@NotNull ExtractedIDLParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(@NotNull ExtractedIDLParser.Param_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#home_header}.
	 * @param ctx the parse tree
	 */
	void enterHome_header(@NotNull ExtractedIDLParser.Home_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#home_header}.
	 * @param ctx the parse tree
	 */
	void exitHome_header(@NotNull ExtractedIDLParser.Home_headerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#param_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterParam_type_spec(@NotNull ExtractedIDLParser.Param_type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#param_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitParam_type_spec(@NotNull ExtractedIDLParser.Param_type_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#attr_spec}.
	 * @param ctx the parse tree
	 */
	void enterAttr_spec(@NotNull ExtractedIDLParser.Attr_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#attr_spec}.
	 * @param ctx the parse tree
	 */
	void exitAttr_spec(@NotNull ExtractedIDLParser.Attr_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#imported_scope}.
	 * @param ctx the parse tree
	 */
	void enterImported_scope(@NotNull ExtractedIDLParser.Imported_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#imported_scope}.
	 * @param ctx the parse tree
	 */
	void exitImported_scope(@NotNull ExtractedIDLParser.Imported_scopeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(@NotNull ExtractedIDLParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(@NotNull ExtractedIDLParser.And_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr(@NotNull ExtractedIDLParser.Or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr(@NotNull ExtractedIDLParser.Or_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 */
	void enterFloating_pt_type(@NotNull ExtractedIDLParser.Floating_pt_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 */
	void exitFloating_pt_type(@NotNull ExtractedIDLParser.Floating_pt_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#attr_decl}.
	 * @param ctx the parse tree
	 */
	void enterAttr_decl(@NotNull ExtractedIDLParser.Attr_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#attr_decl}.
	 * @param ctx the parse tree
	 */
	void exitAttr_decl(@NotNull ExtractedIDLParser.Attr_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_type(@NotNull ExtractedIDLParser.Boolean_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_type(@NotNull ExtractedIDLParser.Boolean_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#signed_longlong_int}.
	 * @param ctx the parse tree
	 */
	void enterSigned_longlong_int(@NotNull ExtractedIDLParser.Signed_longlong_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#signed_longlong_int}.
	 * @param ctx the parse tree
	 */
	void exitSigned_longlong_int(@NotNull ExtractedIDLParser.Signed_longlong_intContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#interface_header}.
	 * @param ctx the parse tree
	 */
	void enterInterface_header(@NotNull ExtractedIDLParser.Interface_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#interface_header}.
	 * @param ctx the parse tree
	 */
	void exitInterface_header(@NotNull ExtractedIDLParser.Interface_headerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#const_type}.
	 * @param ctx the parse tree
	 */
	void enterConst_type(@NotNull ExtractedIDLParser.Const_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#const_type}.
	 * @param ctx the parse tree
	 */
	void exitConst_type(@NotNull ExtractedIDLParser.Const_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#declarators}.
	 * @param ctx the parse tree
	 */
	void enterDeclarators(@NotNull ExtractedIDLParser.DeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#declarators}.
	 * @param ctx the parse tree
	 */
	void exitDeclarators(@NotNull ExtractedIDLParser.DeclaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#interface_inheritance_spec}.
	 * @param ctx the parse tree
	 */
	void enterInterface_inheritance_spec(@NotNull ExtractedIDLParser.Interface_inheritance_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#interface_inheritance_spec}.
	 * @param ctx the parse tree
	 */
	void exitInterface_inheritance_spec(@NotNull ExtractedIDLParser.Interface_inheritance_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#param_attribute}.
	 * @param ctx the parse tree
	 */
	void enterParam_attribute(@NotNull ExtractedIDLParser.Param_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#param_attribute}.
	 * @param ctx the parse tree
	 */
	void exitParam_attribute(@NotNull ExtractedIDLParser.Param_attributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec(@NotNull ExtractedIDLParser.Element_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec(@NotNull ExtractedIDLParser.Element_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#constr_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterConstr_type_spec(@NotNull ExtractedIDLParser.Constr_type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#constr_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitConstr_type_spec(@NotNull ExtractedIDLParser.Constr_type_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#interface_or_forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterInterface_or_forward_decl(@NotNull ExtractedIDLParser.Interface_or_forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#interface_or_forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitInterface_or_forward_decl(@NotNull ExtractedIDLParser.Interface_or_forward_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_body(@NotNull ExtractedIDLParser.Switch_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_body(@NotNull ExtractedIDLParser.Switch_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(@NotNull ExtractedIDLParser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(@NotNull ExtractedIDLParser.Case_labelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterForward_decl(@NotNull ExtractedIDLParser.Forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitForward_decl(@NotNull ExtractedIDLParser.Forward_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(@NotNull ExtractedIDLParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(@NotNull ExtractedIDLParser.ExportContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(@NotNull ExtractedIDLParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(@NotNull ExtractedIDLParser.DefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#complex_declarator}.
	 * @param ctx the parse tree
	 */
	void enterComplex_declarator(@NotNull ExtractedIDLParser.Complex_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#complex_declarator}.
	 * @param ctx the parse tree
	 */
	void exitComplex_declarator(@NotNull ExtractedIDLParser.Complex_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void enterMult_expr(@NotNull ExtractedIDLParser.Mult_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void exitMult_expr(@NotNull ExtractedIDLParser.Mult_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#type_prefix_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_prefix_decl(@NotNull ExtractedIDLParser.Type_prefix_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#type_prefix_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_prefix_decl(@NotNull ExtractedIDLParser.Type_prefix_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#char_type}.
	 * @param ctx the parse tree
	 */
	void enterChar_type(@NotNull ExtractedIDLParser.Char_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#char_type}.
	 * @param ctx the parse tree
	 */
	void exitChar_type(@NotNull ExtractedIDLParser.Char_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#readonly_attr_declarator}.
	 * @param ctx the parse tree
	 */
	void enterReadonly_attr_declarator(@NotNull ExtractedIDLParser.Readonly_attr_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#readonly_attr_declarator}.
	 * @param ctx the parse tree
	 */
	void exitReadonly_attr_declarator(@NotNull ExtractedIDLParser.Readonly_attr_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#fixed_array_size}.
	 * @param ctx the parse tree
	 */
	void enterFixed_array_size(@NotNull ExtractedIDLParser.Fixed_array_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#fixed_array_size}.
	 * @param ctx the parse tree
	 */
	void exitFixed_array_size(@NotNull ExtractedIDLParser.Fixed_array_sizeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#type_declarator}.
	 * @param ctx the parse tree
	 */
	void enterType_declarator(@NotNull ExtractedIDLParser.Type_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#type_declarator}.
	 * @param ctx the parse tree
	 */
	void exitType_declarator(@NotNull ExtractedIDLParser.Type_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#member_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_list(@NotNull ExtractedIDLParser.Member_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#member_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_list(@NotNull ExtractedIDLParser.Member_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(@NotNull ExtractedIDLParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(@NotNull ExtractedIDLParser.SpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#emits_decl}.
	 * @param ctx the parse tree
	 */
	void enterEmits_decl(@NotNull ExtractedIDLParser.Emits_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#emits_decl}.
	 * @param ctx the parse tree
	 */
	void exitEmits_decl(@NotNull ExtractedIDLParser.Emits_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ExtractedIDLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ExtractedIDLParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void enterConst_decl(@NotNull ExtractedIDLParser.Const_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void exitConst_decl(@NotNull ExtractedIDLParser.Const_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_int(@NotNull ExtractedIDLParser.Unsigned_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_int(@NotNull ExtractedIDLParser.Unsigned_intContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#unsigned_long_int}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_long_int(@NotNull ExtractedIDLParser.Unsigned_long_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#unsigned_long_int}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_long_int(@NotNull ExtractedIDLParser.Unsigned_long_intContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedIDLParser#op_attribute}.
	 * @param ctx the parse tree
	 */
	void enterOp_attribute(@NotNull ExtractedIDLParser.Op_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedIDLParser#op_attribute}.
	 * @param ctx the parse tree
	 */
	void exitOp_attribute(@NotNull ExtractedIDLParser.Op_attributeContext ctx);
}