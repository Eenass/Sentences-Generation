// Generated from ExtractedIDL.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedIDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedIDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#factory_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactory_decl(@NotNull ExtractedIDLParser.Factory_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(@NotNull ExtractedIDLParser.DeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#event_abs_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_abs_decl(@NotNull ExtractedIDLParser.Event_abs_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#home_export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome_export(@NotNull ExtractedIDLParser.Home_exportContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#except_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_decl(@NotNull ExtractedIDLParser.Except_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#consumes_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsumes_decl(@NotNull ExtractedIDLParser.Consumes_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decl(@NotNull ExtractedIDLParser.Type_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#union_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_type(@NotNull ExtractedIDLParser.Union_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#readonly_attr_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadonly_attr_spec(@NotNull ExtractedIDLParser.Readonly_attr_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#object_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type(@NotNull ExtractedIDLParser.Object_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#interface_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_type(@NotNull ExtractedIDLParser.Interface_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(@NotNull ExtractedIDLParser.EventContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#op_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_type_spec(@NotNull ExtractedIDLParser.Op_type_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(@NotNull ExtractedIDLParser.Shift_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#provides_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProvides_decl(@NotNull ExtractedIDLParser.Provides_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#value_inheritance_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_inheritance_spec(@NotNull ExtractedIDLParser.Value_inheritance_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#simple_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_declarator(@NotNull ExtractedIDLParser.Simple_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#octet_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctet_type(@NotNull ExtractedIDLParser.Octet_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#get_excep_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_excep_expr(@NotNull ExtractedIDLParser.Get_excep_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#signed_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_int(@NotNull ExtractedIDLParser.Signed_intContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#op_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_decl(@NotNull ExtractedIDLParser.Op_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#parameter_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_decls(@NotNull ExtractedIDLParser.Parameter_declsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#value_box_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_box_decl(@NotNull ExtractedIDLParser.Value_box_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#publishes_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublishes_decl(@NotNull ExtractedIDLParser.Publishes_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#integer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_type(@NotNull ExtractedIDLParser.Integer_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#component_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_header(@NotNull ExtractedIDLParser.Component_headerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#context_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_expr(@NotNull ExtractedIDLParser.Context_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#component_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_forward_decl(@NotNull ExtractedIDLParser.Component_forward_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#struct_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_type(@NotNull ExtractedIDLParser.Struct_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#type_id_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_id_decl(@NotNull ExtractedIDLParser.Type_id_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#value_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_name(@NotNull ExtractedIDLParser.Value_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec(@NotNull ExtractedIDLParser.Type_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#attr_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_declarator(@NotNull ExtractedIDLParser.Attr_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#init_param_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_param_decls(@NotNull ExtractedIDLParser.Init_param_declsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#interface_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_body(@NotNull ExtractedIDLParser.Interface_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#unsigned_longlong_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_longlong_int(@NotNull ExtractedIDLParser.Unsigned_longlong_intContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#wide_char_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWide_char_type(@NotNull ExtractedIDLParser.Wide_char_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#scoped_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScoped_name(@NotNull ExtractedIDLParser.Scoped_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#interface_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_name(@NotNull ExtractedIDLParser.Interface_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#value_base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_base_type(@NotNull ExtractedIDLParser.Value_base_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#any_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_type(@NotNull ExtractedIDLParser.Any_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#component_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_body(@NotNull ExtractedIDLParser.Component_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#home_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome_decl(@NotNull ExtractedIDLParser.Home_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#signed_short_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_short_int(@NotNull ExtractedIDLParser.Signed_short_intContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#raises_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaises_expr(@NotNull ExtractedIDLParser.Raises_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#set_excep_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_excep_expr(@NotNull ExtractedIDLParser.Set_excep_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type_spec(@NotNull ExtractedIDLParser.Base_type_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#wide_string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWide_string_type(@NotNull ExtractedIDLParser.Wide_string_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(@NotNull ExtractedIDLParser.MemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(@NotNull ExtractedIDLParser.ModuleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#case_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_stmt(@NotNull ExtractedIDLParser.Case_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#supported_interface_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupported_interface_spec(@NotNull ExtractedIDLParser.Supported_interface_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#value_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_header(@NotNull ExtractedIDLParser.Value_headerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#sequence_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_type(@NotNull ExtractedIDLParser.Sequence_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#template_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_type_spec(@NotNull ExtractedIDLParser.Template_type_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#primary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expr(@NotNull ExtractedIDLParser.Primary_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#finder_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinder_decl(@NotNull ExtractedIDLParser.Finder_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#value_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_forward_decl(@NotNull ExtractedIDLParser.Value_forward_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#value_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_decl(@NotNull ExtractedIDLParser.Value_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#exception_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_list(@NotNull ExtractedIDLParser.Exception_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#component_inheritance_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_inheritance_spec(@NotNull ExtractedIDLParser.Component_inheritance_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#component_export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_export(@NotNull ExtractedIDLParser.Component_exportContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#uses_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUses_decl(@NotNull ExtractedIDLParser.Uses_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#fixed_pt_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_pt_type(@NotNull ExtractedIDLParser.Fixed_pt_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#init_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_decl(@NotNull ExtractedIDLParser.Init_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#home_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome_body(@NotNull ExtractedIDLParser.Home_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#add_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expr(@NotNull ExtractedIDLParser.Add_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr(@NotNull ExtractedIDLParser.Unary_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#event_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_decl(@NotNull ExtractedIDLParser.Event_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#event_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_forward_decl(@NotNull ExtractedIDLParser.Event_forward_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#constr_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_forward_decl(@NotNull ExtractedIDLParser.Constr_forward_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(@NotNull ExtractedIDLParser.ComponentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#attr_raises_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_raises_expr(@NotNull ExtractedIDLParser.Attr_raises_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#unsigned_short_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_short_int(@NotNull ExtractedIDLParser.Unsigned_short_intContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(@NotNull ExtractedIDLParser.EnumeratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(@NotNull ExtractedIDLParser.Xor_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#interface_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_decl(@NotNull ExtractedIDLParser.Interface_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull ExtractedIDLParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_type(@NotNull ExtractedIDLParser.String_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#const_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_exp(@NotNull ExtractedIDLParser.Const_expContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#switch_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_type_spec(@NotNull ExtractedIDLParser.Switch_type_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#array_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declarator(@NotNull ExtractedIDLParser.Array_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#primary_key_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_key_spec(@NotNull ExtractedIDLParser.Primary_key_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#enum_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_type(@NotNull ExtractedIDLParser.Enum_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#event_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_header(@NotNull ExtractedIDLParser.Event_headerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#simple_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type_spec(@NotNull ExtractedIDLParser.Simple_type_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#value_abs_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_abs_decl(@NotNull ExtractedIDLParser.Value_abs_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#state_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_member(@NotNull ExtractedIDLParser.State_memberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#signed_long_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_long_int(@NotNull ExtractedIDLParser.Signed_long_intContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#home_inheritance_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome_inheritance_spec(@NotNull ExtractedIDLParser.Home_inheritance_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#component_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_decl(@NotNull ExtractedIDLParser.Component_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#positive_int_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositive_int_const(@NotNull ExtractedIDLParser.Positive_int_constContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(@NotNull ExtractedIDLParser.Unary_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#value_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_element(@NotNull ExtractedIDLParser.Value_elementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#init_param_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_param_attribute(@NotNull ExtractedIDLParser.Init_param_attributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#import_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_decl(@NotNull ExtractedIDLParser.Import_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#fixed_pt_const_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_pt_const_type(@NotNull ExtractedIDLParser.Fixed_pt_const_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#init_param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_param_decl(@NotNull ExtractedIDLParser.Init_param_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl(@NotNull ExtractedIDLParser.Param_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#home_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome_header(@NotNull ExtractedIDLParser.Home_headerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#param_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_type_spec(@NotNull ExtractedIDLParser.Param_type_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#attr_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_spec(@NotNull ExtractedIDLParser.Attr_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#imported_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImported_scope(@NotNull ExtractedIDLParser.Imported_scopeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(@NotNull ExtractedIDLParser.And_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expr(@NotNull ExtractedIDLParser.Or_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_pt_type(@NotNull ExtractedIDLParser.Floating_pt_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#attr_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_decl(@NotNull ExtractedIDLParser.Attr_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#boolean_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_type(@NotNull ExtractedIDLParser.Boolean_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#signed_longlong_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_longlong_int(@NotNull ExtractedIDLParser.Signed_longlong_intContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#interface_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_header(@NotNull ExtractedIDLParser.Interface_headerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#const_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_type(@NotNull ExtractedIDLParser.Const_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#declarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarators(@NotNull ExtractedIDLParser.DeclaratorsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#interface_inheritance_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_inheritance_spec(@NotNull ExtractedIDLParser.Interface_inheritance_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#param_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_attribute(@NotNull ExtractedIDLParser.Param_attributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#element_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_spec(@NotNull ExtractedIDLParser.Element_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#constr_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_type_spec(@NotNull ExtractedIDLParser.Constr_type_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#interface_or_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_or_forward_decl(@NotNull ExtractedIDLParser.Interface_or_forward_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#switch_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_body(@NotNull ExtractedIDLParser.Switch_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#case_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_label(@NotNull ExtractedIDLParser.Case_labelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward_decl(@NotNull ExtractedIDLParser.Forward_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(@NotNull ExtractedIDLParser.ExportContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(@NotNull ExtractedIDLParser.DefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#complex_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_declarator(@NotNull ExtractedIDLParser.Complex_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#mult_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_expr(@NotNull ExtractedIDLParser.Mult_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#type_prefix_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_prefix_decl(@NotNull ExtractedIDLParser.Type_prefix_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#char_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_type(@NotNull ExtractedIDLParser.Char_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#readonly_attr_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadonly_attr_declarator(@NotNull ExtractedIDLParser.Readonly_attr_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#fixed_array_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_array_size(@NotNull ExtractedIDLParser.Fixed_array_sizeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#type_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declarator(@NotNull ExtractedIDLParser.Type_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#member_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_list(@NotNull ExtractedIDLParser.Member_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification(@NotNull ExtractedIDLParser.SpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#emits_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmits_decl(@NotNull ExtractedIDLParser.Emits_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull ExtractedIDLParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#const_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_decl(@NotNull ExtractedIDLParser.Const_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_int(@NotNull ExtractedIDLParser.Unsigned_intContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#unsigned_long_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_long_int(@NotNull ExtractedIDLParser.Unsigned_long_intContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedIDLParser#op_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_attribute(@NotNull ExtractedIDLParser.Op_attributeContext ctx);
}