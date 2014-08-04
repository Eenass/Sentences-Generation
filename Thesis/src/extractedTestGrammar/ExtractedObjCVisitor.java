// Generated from ExtractedObjC.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedObjCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedObjCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#synchronized_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronized_statement(@NotNull ExtractedObjCParser.Synchronized_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#try_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_statement(@NotNull ExtractedObjCParser.Try_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(@NotNull ExtractedObjCParser.DeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#autorelease_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutorelease_statement(@NotNull ExtractedObjCParser.Autorelease_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#property_implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_implementation(@NotNull ExtractedObjCParser.Property_implementationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(@NotNull ExtractedObjCParser.ReceiverContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(@NotNull ExtractedObjCParser.Labeled_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#message_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_expression(@NotNull ExtractedObjCParser.Message_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(@NotNull ExtractedObjCParser.Compound_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#box_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBox_expression(@NotNull ExtractedObjCParser.Box_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#arc_behaviour_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArc_behaviour_specifier(@NotNull ExtractedObjCParser.Arc_behaviour_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(@NotNull ExtractedObjCParser.Cast_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(@NotNull ExtractedObjCParser.Equality_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull ExtractedObjCParser.For_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_class_specifier(@NotNull ExtractedObjCParser.Storage_class_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#class_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_interface(@NotNull ExtractedObjCParser.Class_interfaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(@NotNull ExtractedObjCParser.Function_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#block_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_parameters(@NotNull ExtractedObjCParser.Block_parametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#array_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expression(@NotNull ExtractedObjCParser.Array_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_unit(@NotNull ExtractedObjCParser.Translation_unitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#type_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_qualifier(@NotNull ExtractedObjCParser.Type_qualifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#protocol_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_list(@NotNull ExtractedObjCParser.Protocol_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(@NotNull ExtractedObjCParser.Logical_and_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(@NotNull ExtractedObjCParser.Shift_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(@NotNull ExtractedObjCParser.Method_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull ExtractedObjCParser.Type_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(@NotNull ExtractedObjCParser.PointerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#method_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_definition(@NotNull ExtractedObjCParser.Method_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(@NotNull ExtractedObjCParser.Parameter_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#encode_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncode_expression(@NotNull ExtractedObjCParser.Encode_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(@NotNull ExtractedObjCParser.Inclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(@NotNull ExtractedObjCParser.Constant_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#dictionary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_expression(@NotNull ExtractedObjCParser.Dictionary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(@NotNull ExtractedObjCParser.Relational_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(@NotNull ExtractedObjCParser.Class_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifiers(@NotNull ExtractedObjCParser.Declaration_specifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration_list(@NotNull ExtractedObjCParser.Parameter_declaration_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expression(@NotNull ExtractedObjCParser.Postfix_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#keyword_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_declarator(@NotNull ExtractedObjCParser.Keyword_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#message_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_selector(@NotNull ExtractedObjCParser.Message_selectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_declaration(@NotNull ExtractedObjCParser.Property_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#preprocessor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor_declaration(@NotNull ExtractedObjCParser.Preprocessor_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#property_attributes_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_attributes_declaration(@NotNull ExtractedObjCParser.Property_attributes_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(@NotNull ExtractedObjCParser.Selection_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#type_variable_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_variable_declarator(@NotNull ExtractedObjCParser.Type_variable_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#protocol_reference_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_reference_list(@NotNull ExtractedObjCParser.Protocol_reference_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#finally_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_statement(@NotNull ExtractedObjCParser.Finally_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#try_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_block(@NotNull ExtractedObjCParser.Try_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#class_method_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_method_definition(@NotNull ExtractedObjCParser.Class_method_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#protocol_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_declaration_list(@NotNull ExtractedObjCParser.Protocol_declaration_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#property_synthesize_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_synthesize_list(@NotNull ExtractedObjCParser.Property_synthesize_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#block_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_type(@NotNull ExtractedObjCParser.Block_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(@NotNull ExtractedObjCParser.Conditional_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#class_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration_list(@NotNull ExtractedObjCParser.Class_declaration_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(@NotNull ExtractedObjCParser.Primary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#keyword_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_argument(@NotNull ExtractedObjCParser.Keyword_argumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifier_qualifier_list(@NotNull ExtractedObjCParser.Specifier_qualifier_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#visibility_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility_specification(@NotNull ExtractedObjCParser.Visibility_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#category_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategory_interface(@NotNull ExtractedObjCParser.Category_interfaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(@NotNull ExtractedObjCParser.InitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ExtractedObjCParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(@NotNull ExtractedObjCParser.SelectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#protocol_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_declaration(@NotNull ExtractedObjCParser.Protocol_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#property_attributes_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_attributes_list(@NotNull ExtractedObjCParser.Property_attributes_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(@NotNull ExtractedObjCParser.Assignment_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(@NotNull ExtractedObjCParser.Multiplicative_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#property_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_attribute(@NotNull ExtractedObjCParser.Property_attributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(@NotNull ExtractedObjCParser.Jump_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#instance_method_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_method_definition(@NotNull ExtractedObjCParser.Instance_method_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(@NotNull ExtractedObjCParser.EnumeratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#protocol_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_qualifier(@NotNull ExtractedObjCParser.Protocol_qualifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declarator_list(@NotNull ExtractedObjCParser.Struct_declarator_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#interface_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_declaration_list(@NotNull ExtractedObjCParser.Interface_declaration_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#struct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declarator(@NotNull ExtractedObjCParser.Struct_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#protocol_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_expression(@NotNull ExtractedObjCParser.Protocol_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#class_method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_method_declaration(@NotNull ExtractedObjCParser.Class_method_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#selector_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_name(@NotNull ExtractedObjCParser.Selector_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull ExtractedObjCParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#init_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator_list(@NotNull ExtractedObjCParser.Init_declarator_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator(@NotNull ExtractedObjCParser.Init_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_or_union_specifier(@NotNull ExtractedObjCParser.Struct_or_union_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#do_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(@NotNull ExtractedObjCParser.Do_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(@NotNull ExtractedObjCParser.Exclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#enumerator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator_list(@NotNull ExtractedObjCParser.Enumerator_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ExtractedObjCParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(@NotNull ExtractedObjCParser.Additive_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(@NotNull ExtractedObjCParser.Unary_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#category_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategory_name(@NotNull ExtractedObjCParser.Category_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#instance_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_variables(@NotNull ExtractedObjCParser.Instance_variablesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expression(@NotNull ExtractedObjCParser.Logical_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(@NotNull ExtractedObjCParser.Iteration_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(@NotNull ExtractedObjCParser.Throw_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull ExtractedObjCParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#argument_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_expression_list(@NotNull ExtractedObjCParser.Argument_expression_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#class_implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_implementation(@NotNull ExtractedObjCParser.Class_implementationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull ExtractedObjCParser.While_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(@NotNull ExtractedObjCParser.Struct_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#enum_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_specifier(@NotNull ExtractedObjCParser.Enum_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(@NotNull ExtractedObjCParser.Parameter_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#method_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_selector(@NotNull ExtractedObjCParser.Method_selectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(@NotNull ExtractedObjCParser.Assignment_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(@NotNull ExtractedObjCParser.Unary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#instance_method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_method_declaration(@NotNull ExtractedObjCParser.Instance_method_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#method_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_type(@NotNull ExtractedObjCParser.Method_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#protocol_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_name(@NotNull ExtractedObjCParser.Protocol_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#for_in_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in_statement(@NotNull ExtractedObjCParser.For_in_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#category_implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategory_implementation(@NotNull ExtractedObjCParser.Category_implementationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull ExtractedObjCParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(@NotNull ExtractedObjCParser.Statement_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#abstract_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_declarator(@NotNull ExtractedObjCParser.Abstract_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#external_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_declaration(@NotNull ExtractedObjCParser.External_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#block_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_expression(@NotNull ExtractedObjCParser.Block_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#abstract_declarator_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_declarator_suffix(@NotNull ExtractedObjCParser.Abstract_declarator_suffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#class_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_list(@NotNull ExtractedObjCParser.Class_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#property_synthesize_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_synthesize_item(@NotNull ExtractedObjCParser.Property_synthesize_itemContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#direct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_declarator(@NotNull ExtractedObjCParser.Direct_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#implementation_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementation_definition_list(@NotNull ExtractedObjCParser.Implementation_definition_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(@NotNull ExtractedObjCParser.And_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#superclass_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_name(@NotNull ExtractedObjCParser.Superclass_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_statement(@NotNull ExtractedObjCParser.Catch_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#dictionary_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_pair(@NotNull ExtractedObjCParser.Dictionary_pairContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(@NotNull ExtractedObjCParser.Type_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#selector_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_expression(@NotNull ExtractedObjCParser.Selector_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedObjCParser#declarator_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator_suffix(@NotNull ExtractedObjCParser.Declarator_suffixContext ctx);
}