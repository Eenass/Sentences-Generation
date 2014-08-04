// Generated from ExtractedObjC.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedObjCParser}.
 */
public interface ExtractedObjCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#synchronized_statement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronized_statement(@NotNull ExtractedObjCParser.Synchronized_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#synchronized_statement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronized_statement(@NotNull ExtractedObjCParser.Synchronized_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(@NotNull ExtractedObjCParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(@NotNull ExtractedObjCParser.Try_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull ExtractedObjCParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull ExtractedObjCParser.DeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#autorelease_statement}.
	 * @param ctx the parse tree
	 */
	void enterAutorelease_statement(@NotNull ExtractedObjCParser.Autorelease_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#autorelease_statement}.
	 * @param ctx the parse tree
	 */
	void exitAutorelease_statement(@NotNull ExtractedObjCParser.Autorelease_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#property_implementation}.
	 * @param ctx the parse tree
	 */
	void enterProperty_implementation(@NotNull ExtractedObjCParser.Property_implementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#property_implementation}.
	 * @param ctx the parse tree
	 */
	void exitProperty_implementation(@NotNull ExtractedObjCParser.Property_implementationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(@NotNull ExtractedObjCParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(@NotNull ExtractedObjCParser.ReceiverContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(@NotNull ExtractedObjCParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(@NotNull ExtractedObjCParser.Labeled_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#message_expression}.
	 * @param ctx the parse tree
	 */
	void enterMessage_expression(@NotNull ExtractedObjCParser.Message_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#message_expression}.
	 * @param ctx the parse tree
	 */
	void exitMessage_expression(@NotNull ExtractedObjCParser.Message_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(@NotNull ExtractedObjCParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(@NotNull ExtractedObjCParser.Compound_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#box_expression}.
	 * @param ctx the parse tree
	 */
	void enterBox_expression(@NotNull ExtractedObjCParser.Box_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#box_expression}.
	 * @param ctx the parse tree
	 */
	void exitBox_expression(@NotNull ExtractedObjCParser.Box_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#arc_behaviour_specifier}.
	 * @param ctx the parse tree
	 */
	void enterArc_behaviour_specifier(@NotNull ExtractedObjCParser.Arc_behaviour_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#arc_behaviour_specifier}.
	 * @param ctx the parse tree
	 */
	void exitArc_behaviour_specifier(@NotNull ExtractedObjCParser.Arc_behaviour_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(@NotNull ExtractedObjCParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(@NotNull ExtractedObjCParser.Cast_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(@NotNull ExtractedObjCParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(@NotNull ExtractedObjCParser.Equality_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull ExtractedObjCParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull ExtractedObjCParser.For_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_class_specifier(@NotNull ExtractedObjCParser.Storage_class_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_class_specifier(@NotNull ExtractedObjCParser.Storage_class_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#class_interface}.
	 * @param ctx the parse tree
	 */
	void enterClass_interface(@NotNull ExtractedObjCParser.Class_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#class_interface}.
	 * @param ctx the parse tree
	 */
	void exitClass_interface(@NotNull ExtractedObjCParser.Class_interfaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(@NotNull ExtractedObjCParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(@NotNull ExtractedObjCParser.Function_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#block_parameters}.
	 * @param ctx the parse tree
	 */
	void enterBlock_parameters(@NotNull ExtractedObjCParser.Block_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#block_parameters}.
	 * @param ctx the parse tree
	 */
	void exitBlock_parameters(@NotNull ExtractedObjCParser.Block_parametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_expression(@NotNull ExtractedObjCParser.Array_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_expression(@NotNull ExtractedObjCParser.Array_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(@NotNull ExtractedObjCParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(@NotNull ExtractedObjCParser.Translation_unitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(@NotNull ExtractedObjCParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(@NotNull ExtractedObjCParser.Type_qualifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#protocol_list}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_list(@NotNull ExtractedObjCParser.Protocol_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#protocol_list}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_list(@NotNull ExtractedObjCParser.Protocol_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(@NotNull ExtractedObjCParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(@NotNull ExtractedObjCParser.Logical_and_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(@NotNull ExtractedObjCParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(@NotNull ExtractedObjCParser.Shift_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(@NotNull ExtractedObjCParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(@NotNull ExtractedObjCParser.Method_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull ExtractedObjCParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull ExtractedObjCParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(@NotNull ExtractedObjCParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(@NotNull ExtractedObjCParser.PointerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#method_definition}.
	 * @param ctx the parse tree
	 */
	void enterMethod_definition(@NotNull ExtractedObjCParser.Method_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#method_definition}.
	 * @param ctx the parse tree
	 */
	void exitMethod_definition(@NotNull ExtractedObjCParser.Method_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(@NotNull ExtractedObjCParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(@NotNull ExtractedObjCParser.Parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#encode_expression}.
	 * @param ctx the parse tree
	 */
	void enterEncode_expression(@NotNull ExtractedObjCParser.Encode_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#encode_expression}.
	 * @param ctx the parse tree
	 */
	void exitEncode_expression(@NotNull ExtractedObjCParser.Encode_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(@NotNull ExtractedObjCParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(@NotNull ExtractedObjCParser.Inclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(@NotNull ExtractedObjCParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(@NotNull ExtractedObjCParser.Constant_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#dictionary_expression}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_expression(@NotNull ExtractedObjCParser.Dictionary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#dictionary_expression}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_expression(@NotNull ExtractedObjCParser.Dictionary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(@NotNull ExtractedObjCParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(@NotNull ExtractedObjCParser.Relational_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(@NotNull ExtractedObjCParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(@NotNull ExtractedObjCParser.Class_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifiers(@NotNull ExtractedObjCParser.Declaration_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifiers(@NotNull ExtractedObjCParser.Declaration_specifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration_list(@NotNull ExtractedObjCParser.Parameter_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration_list(@NotNull ExtractedObjCParser.Parameter_declaration_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(@NotNull ExtractedObjCParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(@NotNull ExtractedObjCParser.Postfix_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#keyword_declarator}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_declarator(@NotNull ExtractedObjCParser.Keyword_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#keyword_declarator}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_declarator(@NotNull ExtractedObjCParser.Keyword_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#message_selector}.
	 * @param ctx the parse tree
	 */
	void enterMessage_selector(@NotNull ExtractedObjCParser.Message_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#message_selector}.
	 * @param ctx the parse tree
	 */
	void exitMessage_selector(@NotNull ExtractedObjCParser.Message_selectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration(@NotNull ExtractedObjCParser.Property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration(@NotNull ExtractedObjCParser.Property_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#preprocessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor_declaration(@NotNull ExtractedObjCParser.Preprocessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#preprocessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor_declaration(@NotNull ExtractedObjCParser.Preprocessor_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#property_attributes_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_attributes_declaration(@NotNull ExtractedObjCParser.Property_attributes_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#property_attributes_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_attributes_declaration(@NotNull ExtractedObjCParser.Property_attributes_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(@NotNull ExtractedObjCParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(@NotNull ExtractedObjCParser.Selection_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#type_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterType_variable_declarator(@NotNull ExtractedObjCParser.Type_variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#type_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitType_variable_declarator(@NotNull ExtractedObjCParser.Type_variable_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#protocol_reference_list}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_reference_list(@NotNull ExtractedObjCParser.Protocol_reference_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#protocol_reference_list}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_reference_list(@NotNull ExtractedObjCParser.Protocol_reference_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#finally_statement}.
	 * @param ctx the parse tree
	 */
	void enterFinally_statement(@NotNull ExtractedObjCParser.Finally_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#finally_statement}.
	 * @param ctx the parse tree
	 */
	void exitFinally_statement(@NotNull ExtractedObjCParser.Finally_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#try_block}.
	 * @param ctx the parse tree
	 */
	void enterTry_block(@NotNull ExtractedObjCParser.Try_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#try_block}.
	 * @param ctx the parse tree
	 */
	void exitTry_block(@NotNull ExtractedObjCParser.Try_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#class_method_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_method_definition(@NotNull ExtractedObjCParser.Class_method_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#class_method_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_method_definition(@NotNull ExtractedObjCParser.Class_method_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#protocol_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_declaration_list(@NotNull ExtractedObjCParser.Protocol_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#protocol_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_declaration_list(@NotNull ExtractedObjCParser.Protocol_declaration_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#property_synthesize_list}.
	 * @param ctx the parse tree
	 */
	void enterProperty_synthesize_list(@NotNull ExtractedObjCParser.Property_synthesize_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#property_synthesize_list}.
	 * @param ctx the parse tree
	 */
	void exitProperty_synthesize_list(@NotNull ExtractedObjCParser.Property_synthesize_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#block_type}.
	 * @param ctx the parse tree
	 */
	void enterBlock_type(@NotNull ExtractedObjCParser.Block_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#block_type}.
	 * @param ctx the parse tree
	 */
	void exitBlock_type(@NotNull ExtractedObjCParser.Block_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(@NotNull ExtractedObjCParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(@NotNull ExtractedObjCParser.Conditional_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#class_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration_list(@NotNull ExtractedObjCParser.Class_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#class_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration_list(@NotNull ExtractedObjCParser.Class_declaration_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(@NotNull ExtractedObjCParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(@NotNull ExtractedObjCParser.Primary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#keyword_argument}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_argument(@NotNull ExtractedObjCParser.Keyword_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#keyword_argument}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_argument(@NotNull ExtractedObjCParser.Keyword_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void enterSpecifier_qualifier_list(@NotNull ExtractedObjCParser.Specifier_qualifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void exitSpecifier_qualifier_list(@NotNull ExtractedObjCParser.Specifier_qualifier_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#visibility_specification}.
	 * @param ctx the parse tree
	 */
	void enterVisibility_specification(@NotNull ExtractedObjCParser.Visibility_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#visibility_specification}.
	 * @param ctx the parse tree
	 */
	void exitVisibility_specification(@NotNull ExtractedObjCParser.Visibility_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#category_interface}.
	 * @param ctx the parse tree
	 */
	void enterCategory_interface(@NotNull ExtractedObjCParser.Category_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#category_interface}.
	 * @param ctx the parse tree
	 */
	void exitCategory_interface(@NotNull ExtractedObjCParser.Category_interfaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull ExtractedObjCParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull ExtractedObjCParser.InitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ExtractedObjCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ExtractedObjCParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(@NotNull ExtractedObjCParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(@NotNull ExtractedObjCParser.SelectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_declaration(@NotNull ExtractedObjCParser.Protocol_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_declaration(@NotNull ExtractedObjCParser.Protocol_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#property_attributes_list}.
	 * @param ctx the parse tree
	 */
	void enterProperty_attributes_list(@NotNull ExtractedObjCParser.Property_attributes_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#property_attributes_list}.
	 * @param ctx the parse tree
	 */
	void exitProperty_attributes_list(@NotNull ExtractedObjCParser.Property_attributes_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(@NotNull ExtractedObjCParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(@NotNull ExtractedObjCParser.Assignment_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(@NotNull ExtractedObjCParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(@NotNull ExtractedObjCParser.Multiplicative_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#property_attribute}.
	 * @param ctx the parse tree
	 */
	void enterProperty_attribute(@NotNull ExtractedObjCParser.Property_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#property_attribute}.
	 * @param ctx the parse tree
	 */
	void exitProperty_attribute(@NotNull ExtractedObjCParser.Property_attributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(@NotNull ExtractedObjCParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(@NotNull ExtractedObjCParser.Jump_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#instance_method_definition}.
	 * @param ctx the parse tree
	 */
	void enterInstance_method_definition(@NotNull ExtractedObjCParser.Instance_method_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#instance_method_definition}.
	 * @param ctx the parse tree
	 */
	void exitInstance_method_definition(@NotNull ExtractedObjCParser.Instance_method_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(@NotNull ExtractedObjCParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(@NotNull ExtractedObjCParser.EnumeratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#protocol_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_qualifier(@NotNull ExtractedObjCParser.Protocol_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#protocol_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_qualifier(@NotNull ExtractedObjCParser.Protocol_qualifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator_list(@NotNull ExtractedObjCParser.Struct_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator_list(@NotNull ExtractedObjCParser.Struct_declarator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#interface_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_declaration_list(@NotNull ExtractedObjCParser.Interface_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#interface_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_declaration_list(@NotNull ExtractedObjCParser.Interface_declaration_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator(@NotNull ExtractedObjCParser.Struct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator(@NotNull ExtractedObjCParser.Struct_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#protocol_expression}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_expression(@NotNull ExtractedObjCParser.Protocol_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#protocol_expression}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_expression(@NotNull ExtractedObjCParser.Protocol_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#class_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_method_declaration(@NotNull ExtractedObjCParser.Class_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#class_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_method_declaration(@NotNull ExtractedObjCParser.Class_method_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#selector_name}.
	 * @param ctx the parse tree
	 */
	void enterSelector_name(@NotNull ExtractedObjCParser.Selector_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#selector_name}.
	 * @param ctx the parse tree
	 */
	void exitSelector_name(@NotNull ExtractedObjCParser.Selector_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull ExtractedObjCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull ExtractedObjCParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(@NotNull ExtractedObjCParser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(@NotNull ExtractedObjCParser.Init_declarator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator(@NotNull ExtractedObjCParser.Init_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator(@NotNull ExtractedObjCParser.Init_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_or_union_specifier(@NotNull ExtractedObjCParser.Struct_or_union_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_or_union_specifier(@NotNull ExtractedObjCParser.Struct_or_union_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(@NotNull ExtractedObjCParser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(@NotNull ExtractedObjCParser.Do_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(@NotNull ExtractedObjCParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(@NotNull ExtractedObjCParser.Exclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_list(@NotNull ExtractedObjCParser.Enumerator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_list(@NotNull ExtractedObjCParser.Enumerator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ExtractedObjCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ExtractedObjCParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(@NotNull ExtractedObjCParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(@NotNull ExtractedObjCParser.Additive_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull ExtractedObjCParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull ExtractedObjCParser.Unary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#category_name}.
	 * @param ctx the parse tree
	 */
	void enterCategory_name(@NotNull ExtractedObjCParser.Category_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#category_name}.
	 * @param ctx the parse tree
	 */
	void exitCategory_name(@NotNull ExtractedObjCParser.Category_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#instance_variables}.
	 * @param ctx the parse tree
	 */
	void enterInstance_variables(@NotNull ExtractedObjCParser.Instance_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#instance_variables}.
	 * @param ctx the parse tree
	 */
	void exitInstance_variables(@NotNull ExtractedObjCParser.Instance_variablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(@NotNull ExtractedObjCParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(@NotNull ExtractedObjCParser.Logical_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(@NotNull ExtractedObjCParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(@NotNull ExtractedObjCParser.Iteration_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(@NotNull ExtractedObjCParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(@NotNull ExtractedObjCParser.Throw_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull ExtractedObjCParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull ExtractedObjCParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_expression_list(@NotNull ExtractedObjCParser.Argument_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_expression_list(@NotNull ExtractedObjCParser.Argument_expression_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#class_implementation}.
	 * @param ctx the parse tree
	 */
	void enterClass_implementation(@NotNull ExtractedObjCParser.Class_implementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#class_implementation}.
	 * @param ctx the parse tree
	 */
	void exitClass_implementation(@NotNull ExtractedObjCParser.Class_implementationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull ExtractedObjCParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull ExtractedObjCParser.While_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(@NotNull ExtractedObjCParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(@NotNull ExtractedObjCParser.Struct_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum_specifier(@NotNull ExtractedObjCParser.Enum_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum_specifier(@NotNull ExtractedObjCParser.Enum_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(@NotNull ExtractedObjCParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(@NotNull ExtractedObjCParser.Parameter_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void enterMethod_selector(@NotNull ExtractedObjCParser.Method_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void exitMethod_selector(@NotNull ExtractedObjCParser.Method_selectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(@NotNull ExtractedObjCParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(@NotNull ExtractedObjCParser.Assignment_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(@NotNull ExtractedObjCParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(@NotNull ExtractedObjCParser.Unary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#instance_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInstance_method_declaration(@NotNull ExtractedObjCParser.Instance_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#instance_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInstance_method_declaration(@NotNull ExtractedObjCParser.Instance_method_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#method_type}.
	 * @param ctx the parse tree
	 */
	void enterMethod_type(@NotNull ExtractedObjCParser.Method_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#method_type}.
	 * @param ctx the parse tree
	 */
	void exitMethod_type(@NotNull ExtractedObjCParser.Method_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_name(@NotNull ExtractedObjCParser.Protocol_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_name(@NotNull ExtractedObjCParser.Protocol_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_in_statement(@NotNull ExtractedObjCParser.For_in_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_in_statement(@NotNull ExtractedObjCParser.For_in_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#category_implementation}.
	 * @param ctx the parse tree
	 */
	void enterCategory_implementation(@NotNull ExtractedObjCParser.Category_implementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#category_implementation}.
	 * @param ctx the parse tree
	 */
	void exitCategory_implementation(@NotNull ExtractedObjCParser.Category_implementationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull ExtractedObjCParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull ExtractedObjCParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(@NotNull ExtractedObjCParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(@NotNull ExtractedObjCParser.Statement_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_declarator(@NotNull ExtractedObjCParser.Abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_declarator(@NotNull ExtractedObjCParser.Abstract_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExternal_declaration(@NotNull ExtractedObjCParser.External_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExternal_declaration(@NotNull ExtractedObjCParser.External_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#block_expression}.
	 * @param ctx the parse tree
	 */
	void enterBlock_expression(@NotNull ExtractedObjCParser.Block_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#block_expression}.
	 * @param ctx the parse tree
	 */
	void exitBlock_expression(@NotNull ExtractedObjCParser.Block_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#abstract_declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_declarator_suffix(@NotNull ExtractedObjCParser.Abstract_declarator_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#abstract_declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_declarator_suffix(@NotNull ExtractedObjCParser.Abstract_declarator_suffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#class_list}.
	 * @param ctx the parse tree
	 */
	void enterClass_list(@NotNull ExtractedObjCParser.Class_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#class_list}.
	 * @param ctx the parse tree
	 */
	void exitClass_list(@NotNull ExtractedObjCParser.Class_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#property_synthesize_item}.
	 * @param ctx the parse tree
	 */
	void enterProperty_synthesize_item(@NotNull ExtractedObjCParser.Property_synthesize_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#property_synthesize_item}.
	 * @param ctx the parse tree
	 */
	void exitProperty_synthesize_item(@NotNull ExtractedObjCParser.Property_synthesize_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterDirect_declarator(@NotNull ExtractedObjCParser.Direct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitDirect_declarator(@NotNull ExtractedObjCParser.Direct_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#implementation_definition_list}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_definition_list(@NotNull ExtractedObjCParser.Implementation_definition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#implementation_definition_list}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_definition_list(@NotNull ExtractedObjCParser.Implementation_definition_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull ExtractedObjCParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull ExtractedObjCParser.And_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#superclass_name}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_name(@NotNull ExtractedObjCParser.Superclass_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#superclass_name}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_name(@NotNull ExtractedObjCParser.Superclass_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatch_statement(@NotNull ExtractedObjCParser.Catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatch_statement(@NotNull ExtractedObjCParser.Catch_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#dictionary_pair}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_pair(@NotNull ExtractedObjCParser.Dictionary_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#dictionary_pair}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_pair(@NotNull ExtractedObjCParser.Dictionary_pairContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(@NotNull ExtractedObjCParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(@NotNull ExtractedObjCParser.Type_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelector_expression(@NotNull ExtractedObjCParser.Selector_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelector_expression(@NotNull ExtractedObjCParser.Selector_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedObjCParser#declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator_suffix(@NotNull ExtractedObjCParser.Declarator_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedObjCParser#declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator_suffix(@NotNull ExtractedObjCParser.Declarator_suffixContext ctx);
}