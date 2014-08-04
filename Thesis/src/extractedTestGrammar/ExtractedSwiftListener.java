// Generated from ExtractedSwift.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedSwiftParser}.
 */
public interface ExtractedSwiftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_expression(@NotNull ExtractedSwiftParser.Parenthesized_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_expression(@NotNull ExtractedSwiftParser.Parenthesized_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeinitializer_declaration(@NotNull ExtractedSwiftParser.Deinitializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeinitializer_declaration(@NotNull ExtractedSwiftParser.Deinitializer_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(@NotNull ExtractedSwiftParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(@NotNull ExtractedSwiftParser.Expression_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#context_sensitive_keyword}.
	 * @param ctx the parse tree
	 */
	void enterContext_sensitive_keyword(@NotNull ExtractedSwiftParser.Context_sensitive_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#context_sensitive_keyword}.
	 * @param ctx the parse tree
	 */
	void exitContext_sensitive_keyword(@NotNull ExtractedSwiftParser.Context_sensitive_keywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case(@NotNull ExtractedSwiftParser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case(@NotNull ExtractedSwiftParser.Raw_value_style_enum_caseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_initializer_expression(@NotNull ExtractedSwiftParser.Superclass_initializer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_initializer_expression(@NotNull ExtractedSwiftParser.Superclass_initializer_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterPattern_initializer_list(@NotNull ExtractedSwiftParser.Pattern_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitPattern_initializer_list(@NotNull ExtractedSwiftParser.Pattern_initializer_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_initializer_declaration(@NotNull ExtractedSwiftParser.Protocol_initializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_initializer_declaration(@NotNull ExtractedSwiftParser.Protocol_initializer_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#precedence_clause}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_clause(@NotNull ExtractedSwiftParser.Precedence_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#precedence_clause}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_clause(@NotNull ExtractedSwiftParser.Precedence_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#variable_declaration_head}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_head(@NotNull ExtractedSwiftParser.Variable_declaration_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#variable_declaration_head}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_head(@NotNull ExtractedSwiftParser.Variable_declaration_headContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(@NotNull ExtractedSwiftParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(@NotNull ExtractedSwiftParser.Label_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#getter_clause}.
	 * @param ctx the parse tree
	 */
	void enterGetter_clause(@NotNull ExtractedSwiftParser.Getter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#getter_clause}.
	 * @param ctx the parse tree
	 */
	void exitGetter_clause(@NotNull ExtractedSwiftParser.Getter_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration(@NotNull ExtractedSwiftParser.Operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration(@NotNull ExtractedSwiftParser.Operator_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#requirement_clause}.
	 * @param ctx the parse tree
	 */
	void enterRequirement_clause(@NotNull ExtractedSwiftParser.Requirement_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#requirement_clause}.
	 * @param ctx the parse tree
	 */
	void exitRequirement_clause(@NotNull ExtractedSwiftParser.Requirement_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#import_path}.
	 * @param ctx the parse tree
	 */
	void enterImport_path(@NotNull ExtractedSwiftParser.Import_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#import_path}.
	 * @param ctx the parse tree
	 */
	void exitImport_path(@NotNull ExtractedSwiftParser.Import_pathContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(@NotNull ExtractedSwiftParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(@NotNull ExtractedSwiftParser.Class_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 */
	void enterWillSet_didSet_block(@NotNull ExtractedSwiftParser.WillSet_didSet_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 */
	void exitWillSet_didSet_block(@NotNull ExtractedSwiftParser.WillSet_didSet_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#raw_value_assignment}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_assignment(@NotNull ExtractedSwiftParser.Raw_value_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#raw_value_assignment}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_assignment(@NotNull ExtractedSwiftParser.Raw_value_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(@NotNull ExtractedSwiftParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(@NotNull ExtractedSwiftParser.Identifier_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#balanced_tokens}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_tokens(@NotNull ExtractedSwiftParser.Balanced_tokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#balanced_tokens}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_tokens(@NotNull ExtractedSwiftParser.Balanced_tokensContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#extension_body}.
	 * @param ctx the parse tree
	 */
	void enterExtension_body(@NotNull ExtractedSwiftParser.Extension_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#extension_body}.
	 * @param ctx the parse tree
	 */
	void exitExtension_body(@NotNull ExtractedSwiftParser.Extension_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_associated_type_declaration(@NotNull ExtractedSwiftParser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_associated_type_declaration(@NotNull ExtractedSwiftParser.Protocol_associated_type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(@NotNull ExtractedSwiftParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(@NotNull ExtractedSwiftParser.Variable_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_property_declaration(@NotNull ExtractedSwiftParser.Protocol_property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_property_declaration(@NotNull ExtractedSwiftParser.Protocol_property_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#fallthrough_statement}.
	 * @param ctx the parse tree
	 */
	void enterFallthrough_statement(@NotNull ExtractedSwiftParser.Fallthrough_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#fallthrough_statement}.
	 * @param ctx the parse tree
	 */
	void exitFallthrough_statement(@NotNull ExtractedSwiftParser.Fallthrough_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull ExtractedSwiftParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull ExtractedSwiftParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void enterImport_declaration(@NotNull ExtractedSwiftParser.Import_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void exitImport_declaration(@NotNull ExtractedSwiftParser.Import_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#union_style_enum}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum(@NotNull ExtractedSwiftParser.Union_style_enumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#union_style_enum}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum(@NotNull ExtractedSwiftParser.Union_style_enumContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(@NotNull ExtractedSwiftParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(@NotNull ExtractedSwiftParser.Parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#local_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterLocal_parameter_name(@NotNull ExtractedSwiftParser.Local_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#local_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitLocal_parameter_name(@NotNull ExtractedSwiftParser.Local_parameter_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_subscript_declaration(@NotNull ExtractedSwiftParser.Protocol_subscript_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_subscript_declaration(@NotNull ExtractedSwiftParser.Protocol_subscript_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum(@NotNull ExtractedSwiftParser.Raw_value_style_enumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum(@NotNull ExtractedSwiftParser.Raw_value_style_enumContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#in_out_expression}.
	 * @param ctx the parse tree
	 */
	void enterIn_out_expression(@NotNull ExtractedSwiftParser.In_out_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#in_out_expression}.
	 * @param ctx the parse tree
	 */
	void exitIn_out_expression(@NotNull ExtractedSwiftParser.In_out_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#associativity_clause}.
	 * @param ctx the parse tree
	 */
	void enterAssociativity_clause(@NotNull ExtractedSwiftParser.Associativity_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#associativity_clause}.
	 * @param ctx the parse tree
	 */
	void exitAssociativity_clause(@NotNull ExtractedSwiftParser.Associativity_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#generic_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter_list(@NotNull ExtractedSwiftParser.Generic_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#generic_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter_list(@NotNull ExtractedSwiftParser.Generic_parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifiers(@NotNull ExtractedSwiftParser.Declaration_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifiers(@NotNull ExtractedSwiftParser.Declaration_specifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#typealias_name}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_name(@NotNull ExtractedSwiftParser.Typealias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#typealias_name}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_name(@NotNull ExtractedSwiftParser.Typealias_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#subscript_head}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_head(@NotNull ExtractedSwiftParser.Subscript_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#subscript_head}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_head(@NotNull ExtractedSwiftParser.Subscript_headContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterType_annotation(@NotNull ExtractedSwiftParser.Type_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitType_annotation(@NotNull ExtractedSwiftParser.Type_annotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#default_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_argument_clause(@NotNull ExtractedSwiftParser.Default_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#default_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_argument_clause(@NotNull ExtractedSwiftParser.Default_argument_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#is_pattern}.
	 * @param ctx the parse tree
	 */
	void enterIs_pattern(@NotNull ExtractedSwiftParser.Is_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#is_pattern}.
	 * @param ctx the parse tree
	 */
	void exitIs_pattern(@NotNull ExtractedSwiftParser.Is_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(@NotNull ExtractedSwiftParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(@NotNull ExtractedSwiftParser.Class_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#tuple_type_body}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_body(@NotNull ExtractedSwiftParser.Tuple_type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#tuple_type_body}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_body(@NotNull ExtractedSwiftParser.Tuple_type_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(@NotNull ExtractedSwiftParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(@NotNull ExtractedSwiftParser.Function_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#infix_operator_attributes}.
	 * @param ctx the parse tree
	 */
	void enterInfix_operator_attributes(@NotNull ExtractedSwiftParser.Infix_operator_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#infix_operator_attributes}.
	 * @param ctx the parse tree
	 */
	void exitInfix_operator_attributes(@NotNull ExtractedSwiftParser.Infix_operator_attributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_member(@NotNull ExtractedSwiftParser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_member(@NotNull ExtractedSwiftParser.Raw_value_style_enum_memberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#initializer_body}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_body(@NotNull ExtractedSwiftParser.Initializer_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#initializer_body}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_body(@NotNull ExtractedSwiftParser.Initializer_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#default_label}.
	 * @param ctx the parse tree
	 */
	void enterDefault_label(@NotNull ExtractedSwiftParser.Default_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#default_label}.
	 * @param ctx the parse tree
	 */
	void exitDefault_label(@NotNull ExtractedSwiftParser.Default_labelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#top_level}.
	 * @param ctx the parse tree
	 */
	void enterTop_level(@NotNull ExtractedSwiftParser.Top_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#top_level}.
	 * @param ctx the parse tree
	 */
	void exitTop_level(@NotNull ExtractedSwiftParser.Top_levelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull ExtractedSwiftParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull ExtractedSwiftParser.OperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(@NotNull ExtractedSwiftParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(@NotNull ExtractedSwiftParser.Attribute_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#while_condition}.
	 * @param ctx the parse tree
	 */
	void enterWhile_condition(@NotNull ExtractedSwiftParser.While_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#while_condition}.
	 * @param ctx the parse tree
	 */
	void exitWhile_condition(@NotNull ExtractedSwiftParser.While_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#type_inheritance_list}.
	 * @param ctx the parse tree
	 */
	void enterType_inheritance_list(@NotNull ExtractedSwiftParser.Type_inheritance_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#type_inheritance_list}.
	 * @param ctx the parse tree
	 */
	void exitType_inheritance_list(@NotNull ExtractedSwiftParser.Type_inheritance_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern_element(@NotNull ExtractedSwiftParser.Tuple_pattern_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern_element(@NotNull ExtractedSwiftParser.Tuple_pattern_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_member_declaration(@NotNull ExtractedSwiftParser.Protocol_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_member_declaration(@NotNull ExtractedSwiftParser.Protocol_member_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#precedence_level}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_level(@NotNull ExtractedSwiftParser.Precedence_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#precedence_level}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_level(@NotNull ExtractedSwiftParser.Precedence_levelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(@NotNull ExtractedSwiftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(@NotNull ExtractedSwiftParser.PatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#expression_element_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_element_list(@NotNull ExtractedSwiftParser.Expression_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#expression_element_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_element_list(@NotNull ExtractedSwiftParser.Expression_element_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_expression(@NotNull ExtractedSwiftParser.Superclass_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_expression(@NotNull ExtractedSwiftParser.Superclass_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#superclass_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_method_expression(@NotNull ExtractedSwiftParser.Superclass_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#superclass_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_method_expression(@NotNull ExtractedSwiftParser.Superclass_method_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#protocol_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_member_declarations(@NotNull ExtractedSwiftParser.Protocol_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#protocol_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_member_declarations(@NotNull ExtractedSwiftParser.Protocol_member_declarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#setter_name}.
	 * @param ctx the parse tree
	 */
	void enterSetter_name(@NotNull ExtractedSwiftParser.Setter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#setter_name}.
	 * @param ctx the parse tree
	 */
	void exitSetter_name(@NotNull ExtractedSwiftParser.Setter_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#willSet_clause}.
	 * @param ctx the parse tree
	 */
	void enterWillSet_clause(@NotNull ExtractedSwiftParser.WillSet_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#willSet_clause}.
	 * @param ctx the parse tree
	 */
	void exitWillSet_clause(@NotNull ExtractedSwiftParser.WillSet_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_declaration(@NotNull ExtractedSwiftParser.Protocol_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_declaration(@NotNull ExtractedSwiftParser.Protocol_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ExtractedSwiftParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ExtractedSwiftParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#expression_element}.
	 * @param ctx the parse tree
	 */
	void enterExpression_element(@NotNull ExtractedSwiftParser.Expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#expression_element}.
	 * @param ctx the parse tree
	 */
	void exitExpression_element(@NotNull ExtractedSwiftParser.Expression_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(@NotNull ExtractedSwiftParser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(@NotNull ExtractedSwiftParser.Type_identifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expression(@NotNull ExtractedSwiftParser.Literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expression(@NotNull ExtractedSwiftParser.Literal_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator_declaration(@NotNull ExtractedSwiftParser.Prefix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator_declaration(@NotNull ExtractedSwiftParser.Prefix_operator_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#element_name}.
	 * @param ctx the parse tree
	 */
	void enterElement_name(@NotNull ExtractedSwiftParser.Element_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#element_name}.
	 * @param ctx the parse tree
	 */
	void exitElement_name(@NotNull ExtractedSwiftParser.Element_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(@NotNull ExtractedSwiftParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(@NotNull ExtractedSwiftParser.Constant_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_declaration(@NotNull ExtractedSwiftParser.Initializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_declaration(@NotNull ExtractedSwiftParser.Initializer_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#enum_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_name(@NotNull ExtractedSwiftParser.Enum_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#enum_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_name(@NotNull ExtractedSwiftParser.Enum_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(@NotNull ExtractedSwiftParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(@NotNull ExtractedSwiftParser.If_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull ExtractedSwiftParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull ExtractedSwiftParser.Function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(@NotNull ExtractedSwiftParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(@NotNull ExtractedSwiftParser.Parameter_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#as_pattern}.
	 * @param ctx the parse tree
	 */
	void enterAs_pattern(@NotNull ExtractedSwiftParser.As_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#as_pattern}.
	 * @param ctx the parse tree
	 */
	void exitAs_pattern(@NotNull ExtractedSwiftParser.As_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_pattern(@NotNull ExtractedSwiftParser.Wildcard_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_pattern(@NotNull ExtractedSwiftParser.Wildcard_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case_clause(@NotNull ExtractedSwiftParser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case_clause(@NotNull ExtractedSwiftParser.Union_style_enum_case_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull ExtractedSwiftParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull ExtractedSwiftParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#enum_case_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_case_name(@NotNull ExtractedSwiftParser.Enum_case_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#enum_case_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_case_name(@NotNull ExtractedSwiftParser.Enum_case_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#type_casting_pattern}.
	 * @param ctx the parse tree
	 */
	void enterType_casting_pattern(@NotNull ExtractedSwiftParser.Type_casting_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#type_casting_pattern}.
	 * @param ctx the parse tree
	 */
	void exitType_casting_pattern(@NotNull ExtractedSwiftParser.Type_casting_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#extension_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExtension_declaration(@NotNull ExtractedSwiftParser.Extension_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#extension_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExtension_declaration(@NotNull ExtractedSwiftParser.Extension_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#import_path_identifier}.
	 * @param ctx the parse tree
	 */
	void enterImport_path_identifier(@NotNull ExtractedSwiftParser.Import_path_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#import_path_identifier}.
	 * @param ctx the parse tree
	 */
	void exitImport_path_identifier(@NotNull ExtractedSwiftParser.Import_path_identifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case(@NotNull ExtractedSwiftParser.Union_style_enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case(@NotNull ExtractedSwiftParser.Union_style_enum_caseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#associativity}.
	 * @param ctx the parse tree
	 */
	void enterAssociativity(@NotNull ExtractedSwiftParser.AssociativityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#associativity}.
	 * @param ctx the parse tree
	 */
	void exitAssociativity(@NotNull ExtractedSwiftParser.AssociativityContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#guard_expression}.
	 * @param ctx the parse tree
	 */
	void enterGuard_expression(@NotNull ExtractedSwiftParser.Guard_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#guard_expression}.
	 * @param ctx the parse tree
	 */
	void exitGuard_expression(@NotNull ExtractedSwiftParser.Guard_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_members(@NotNull ExtractedSwiftParser.Union_style_enum_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_members(@NotNull ExtractedSwiftParser.Union_style_enum_membersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(@NotNull ExtractedSwiftParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(@NotNull ExtractedSwiftParser.Integer_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal_item(@NotNull ExtractedSwiftParser.Dictionary_literal_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal_item(@NotNull ExtractedSwiftParser.Dictionary_literal_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull ExtractedSwiftParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull ExtractedSwiftParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#protocol_composition_type}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_composition_type(@NotNull ExtractedSwiftParser.Protocol_composition_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#protocol_composition_type}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_composition_type(@NotNull ExtractedSwiftParser.Protocol_composition_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case_list(@NotNull ExtractedSwiftParser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case_list(@NotNull ExtractedSwiftParser.Raw_value_style_enum_case_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull ExtractedSwiftParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull ExtractedSwiftParser.While_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern_element_list(@NotNull ExtractedSwiftParser.Tuple_pattern_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern_element_list(@NotNull ExtractedSwiftParser.Tuple_pattern_element_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#struct_name}.
	 * @param ctx the parse tree
	 */
	void enterStruct_name(@NotNull ExtractedSwiftParser.Struct_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#struct_name}.
	 * @param ctx the parse tree
	 */
	void exitStruct_name(@NotNull ExtractedSwiftParser.Struct_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#protocol_body}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_body(@NotNull ExtractedSwiftParser.Protocol_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#protocol_body}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_body(@NotNull ExtractedSwiftParser.Protocol_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull ExtractedSwiftParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull ExtractedSwiftParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 */
	void enterType_inheritance_clause(@NotNull ExtractedSwiftParser.Type_inheritance_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 */
	void exitType_inheritance_clause(@NotNull ExtractedSwiftParser.Type_inheritance_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_name(@NotNull ExtractedSwiftParser.Protocol_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_name(@NotNull ExtractedSwiftParser.Protocol_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void enterSetter_keyword_clause(@NotNull ExtractedSwiftParser.Setter_keyword_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void exitSetter_keyword_clause(@NotNull ExtractedSwiftParser.Setter_keyword_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_in_statement(@NotNull ExtractedSwiftParser.For_in_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_in_statement(@NotNull ExtractedSwiftParser.For_in_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(@NotNull ExtractedSwiftParser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(@NotNull ExtractedSwiftParser.Case_labelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter_clause(@NotNull ExtractedSwiftParser.Generic_parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter_clause(@NotNull ExtractedSwiftParser.Generic_parameter_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(@NotNull ExtractedSwiftParser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(@NotNull ExtractedSwiftParser.RequirementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_pattern(@NotNull ExtractedSwiftParser.Identifier_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_pattern(@NotNull ExtractedSwiftParser.Identifier_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal(@NotNull ExtractedSwiftParser.Array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal(@NotNull ExtractedSwiftParser.Array_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#value_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void enterValue_binding_pattern(@NotNull ExtractedSwiftParser.Value_binding_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#value_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void exitValue_binding_pattern(@NotNull ExtractedSwiftParser.Value_binding_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#array_literal_items}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal_items(@NotNull ExtractedSwiftParser.Array_literal_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#array_literal_items}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal_items(@NotNull ExtractedSwiftParser.Array_literal_itemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter(@NotNull ExtractedSwiftParser.Generic_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter(@NotNull ExtractedSwiftParser.Generic_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(@NotNull ExtractedSwiftParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(@NotNull ExtractedSwiftParser.Do_while_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal_items(@NotNull ExtractedSwiftParser.Dictionary_literal_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal_items(@NotNull ExtractedSwiftParser.Dictionary_literal_itemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(@NotNull ExtractedSwiftParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(@NotNull ExtractedSwiftParser.AttributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#generic_argument}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument(@NotNull ExtractedSwiftParser.Generic_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#generic_argument}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument(@NotNull ExtractedSwiftParser.Generic_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_argument_clause(@NotNull ExtractedSwiftParser.Attribute_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_argument_clause(@NotNull ExtractedSwiftParser.Attribute_argument_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#generic_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument_clause(@NotNull ExtractedSwiftParser.Generic_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#generic_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument_clause(@NotNull ExtractedSwiftParser.Generic_argument_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void enterGetter_keyword_clause(@NotNull ExtractedSwiftParser.Getter_keyword_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void exitGetter_keyword_clause(@NotNull ExtractedSwiftParser.Getter_keyword_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#conformance_requirement}.
	 * @param ctx the parse tree
	 */
	void enterConformance_requirement(@NotNull ExtractedSwiftParser.Conformance_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#conformance_requirement}.
	 * @param ctx the parse tree
	 */
	void exitConformance_requirement(@NotNull ExtractedSwiftParser.Conformance_requirementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(@NotNull ExtractedSwiftParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(@NotNull ExtractedSwiftParser.Labeled_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_declaration(@NotNull ExtractedSwiftParser.Enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_declaration(@NotNull ExtractedSwiftParser.Enum_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#implicit_member_expression}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_member_expression(@NotNull ExtractedSwiftParser.Implicit_member_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#implicit_member_expression}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_member_expression(@NotNull ExtractedSwiftParser.Implicit_member_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#enum_case_pattern}.
	 * @param ctx the parse tree
	 */
	void enterEnum_case_pattern(@NotNull ExtractedSwiftParser.Enum_case_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#enum_case_pattern}.
	 * @param ctx the parse tree
	 */
	void exitEnum_case_pattern(@NotNull ExtractedSwiftParser.Enum_case_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#declaration_specifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifier(@NotNull ExtractedSwiftParser.Declaration_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#declaration_specifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifier(@NotNull ExtractedSwiftParser.Declaration_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#requirement_list}.
	 * @param ctx the parse tree
	 */
	void enterRequirement_list(@NotNull ExtractedSwiftParser.Requirement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#requirement_list}.
	 * @param ctx the parse tree
	 */
	void exitRequirement_list(@NotNull ExtractedSwiftParser.Requirement_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_declaration(@NotNull ExtractedSwiftParser.Subscript_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_declaration(@NotNull ExtractedSwiftParser.Subscript_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull ExtractedSwiftParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull ExtractedSwiftParser.For_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#setter_clause}.
	 * @param ctx the parse tree
	 */
	void enterSetter_clause(@NotNull ExtractedSwiftParser.Setter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#setter_clause}.
	 * @param ctx the parse tree
	 */
	void exitSetter_clause(@NotNull ExtractedSwiftParser.Setter_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#import_kind}.
	 * @param ctx the parse tree
	 */
	void enterImport_kind(@NotNull ExtractedSwiftParser.Import_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#import_kind}.
	 * @param ctx the parse tree
	 */
	void exitImport_kind(@NotNull ExtractedSwiftParser.Import_kindContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body(@NotNull ExtractedSwiftParser.Struct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body(@NotNull ExtractedSwiftParser.Struct_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#case_item_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_item_list(@NotNull ExtractedSwiftParser.Case_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#case_item_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_item_list(@NotNull ExtractedSwiftParser.Case_item_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void enterBranch_statement(@NotNull ExtractedSwiftParser.Branch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void exitBranch_statement(@NotNull ExtractedSwiftParser.Branch_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#type_casting_operator}.
	 * @param ctx the parse tree
	 */
	void enterType_casting_operator(@NotNull ExtractedSwiftParser.Type_casting_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#type_casting_operator}.
	 * @param ctx the parse tree
	 */
	void exitType_casting_operator(@NotNull ExtractedSwiftParser.Type_casting_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#trailing_closure}.
	 * @param ctx the parse tree
	 */
	void enterTrailing_closure(@NotNull ExtractedSwiftParser.Trailing_closureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#trailing_closure}.
	 * @param ctx the parse tree
	 */
	void exitTrailing_closure(@NotNull ExtractedSwiftParser.Trailing_closureContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operator_declaration(@NotNull ExtractedSwiftParser.Postfix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operator_declaration(@NotNull ExtractedSwiftParser.Postfix_operator_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#typealias_assignment}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_assignment(@NotNull ExtractedSwiftParser.Typealias_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#typealias_assignment}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_assignment(@NotNull ExtractedSwiftParser.Typealias_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#typealias_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_declaration(@NotNull ExtractedSwiftParser.Typealias_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#typealias_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_declaration(@NotNull ExtractedSwiftParser.Typealias_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument_list(@NotNull ExtractedSwiftParser.Generic_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument_list(@NotNull ExtractedSwiftParser.Generic_argument_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type(@NotNull ExtractedSwiftParser.Tuple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type(@NotNull ExtractedSwiftParser.Tuple_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_subscript_expression(@NotNull ExtractedSwiftParser.Superclass_subscript_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_subscript_expression(@NotNull ExtractedSwiftParser.Superclass_subscript_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_member(@NotNull ExtractedSwiftParser.Union_style_enum_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_member(@NotNull ExtractedSwiftParser.Union_style_enum_memberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(@NotNull ExtractedSwiftParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(@NotNull ExtractedSwiftParser.Function_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull ExtractedSwiftParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull ExtractedSwiftParser.If_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case_clause(@NotNull ExtractedSwiftParser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case_clause(@NotNull ExtractedSwiftParser.Raw_value_style_enum_case_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(@NotNull ExtractedSwiftParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(@NotNull ExtractedSwiftParser.Class_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(@NotNull ExtractedSwiftParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(@NotNull ExtractedSwiftParser.Variable_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#metatype_type}.
	 * @param ctx the parse tree
	 */
	void enterMetatype_type(@NotNull ExtractedSwiftParser.Metatype_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#metatype_type}.
	 * @param ctx the parse tree
	 */
	void exitMetatype_type(@NotNull ExtractedSwiftParser.Metatype_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#self_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelf_expression(@NotNull ExtractedSwiftParser.Self_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#self_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelf_expression(@NotNull ExtractedSwiftParser.Self_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#control_transfer_statement}.
	 * @param ctx the parse tree
	 */
	void enterControl_transfer_statement(@NotNull ExtractedSwiftParser.Control_transfer_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#control_transfer_statement}.
	 * @param ctx the parse tree
	 */
	void exitControl_transfer_statement(@NotNull ExtractedSwiftParser.Control_transfer_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(@NotNull ExtractedSwiftParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(@NotNull ExtractedSwiftParser.Binary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull ExtractedSwiftParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull ExtractedSwiftParser.Return_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#parameter_clauses}.
	 * @param ctx the parse tree
	 */
	void enterParameter_clauses(@NotNull ExtractedSwiftParser.Parameter_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#parameter_clauses}.
	 * @param ctx the parse tree
	 */
	void exitParameter_clauses(@NotNull ExtractedSwiftParser.Parameter_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#getter_setter_block}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter_block(@NotNull ExtractedSwiftParser.Getter_setter_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#getter_setter_block}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter_block(@NotNull ExtractedSwiftParser.Getter_setter_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#array_literal_item}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal_item(@NotNull ExtractedSwiftParser.Array_literal_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#array_literal_item}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal_item(@NotNull ExtractedSwiftParser.Array_literal_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(@NotNull ExtractedSwiftParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(@NotNull ExtractedSwiftParser.Continue_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#same_type_requirement}.
	 * @param ctx the parse tree
	 */
	void enterSame_type_requirement(@NotNull ExtractedSwiftParser.Same_type_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#same_type_requirement}.
	 * @param ctx the parse tree
	 */
	void exitSame_type_requirement(@NotNull ExtractedSwiftParser.Same_type_requirementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_method_declaration(@NotNull ExtractedSwiftParser.Protocol_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_method_declaration(@NotNull ExtractedSwiftParser.Protocol_method_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(@NotNull ExtractedSwiftParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(@NotNull ExtractedSwiftParser.Break_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(@NotNull ExtractedSwiftParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(@NotNull ExtractedSwiftParser.Primary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#closure_signature}.
	 * @param ctx the parse tree
	 */
	void enterClosure_signature(@NotNull ExtractedSwiftParser.Closure_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#closure_signature}.
	 * @param ctx the parse tree
	 */
	void exitClosure_signature(@NotNull ExtractedSwiftParser.Closure_signatureContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#expression_pattern}.
	 * @param ctx the parse tree
	 */
	void enterExpression_pattern(@NotNull ExtractedSwiftParser.Expression_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#expression_pattern}.
	 * @param ctx the parse tree
	 */
	void exitExpression_pattern(@NotNull ExtractedSwiftParser.Expression_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull ExtractedSwiftParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull ExtractedSwiftParser.InitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(@NotNull ExtractedSwiftParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(@NotNull ExtractedSwiftParser.Code_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ExtractedSwiftParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ExtractedSwiftParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#statement_label}.
	 * @param ctx the parse tree
	 */
	void enterStatement_label(@NotNull ExtractedSwiftParser.Statement_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#statement_label}.
	 * @param ctx the parse tree
	 */
	void exitStatement_label(@NotNull ExtractedSwiftParser.Statement_labelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_element_list(@NotNull ExtractedSwiftParser.Tuple_type_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_element_list(@NotNull ExtractedSwiftParser.Tuple_type_element_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#dictionary_literal}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal(@NotNull ExtractedSwiftParser.Dictionary_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#dictionary_literal}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal(@NotNull ExtractedSwiftParser.Dictionary_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter_keyword_block(@NotNull ExtractedSwiftParser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter_keyword_block(@NotNull ExtractedSwiftParser.Getter_setter_keyword_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern(@NotNull ExtractedSwiftParser.Tuple_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern(@NotNull ExtractedSwiftParser.Tuple_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_token(@NotNull ExtractedSwiftParser.Balanced_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_token(@NotNull ExtractedSwiftParser.Balanced_tokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operator(@NotNull ExtractedSwiftParser.Postfix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operator(@NotNull ExtractedSwiftParser.Postfix_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(@NotNull ExtractedSwiftParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(@NotNull ExtractedSwiftParser.Switch_caseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#guard_clause}.
	 * @param ctx the parse tree
	 */
	void enterGuard_clause(@NotNull ExtractedSwiftParser.Guard_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#guard_clause}.
	 * @param ctx the parse tree
	 */
	void exitGuard_clause(@NotNull ExtractedSwiftParser.Guard_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#protocol_identifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_identifier(@NotNull ExtractedSwiftParser.Protocol_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#protocol_identifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_identifier(@NotNull ExtractedSwiftParser.Protocol_identifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(@NotNull ExtractedSwiftParser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(@NotNull ExtractedSwiftParser.Else_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ExtractedSwiftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ExtractedSwiftParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_element(@NotNull ExtractedSwiftParser.Tuple_type_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_element(@NotNull ExtractedSwiftParser.Tuple_type_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#for_init}.
	 * @param ctx the parse tree
	 */
	void enterFor_init(@NotNull ExtractedSwiftParser.For_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#for_init}.
	 * @param ctx the parse tree
	 */
	void exitFor_init(@NotNull ExtractedSwiftParser.For_initContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterParameter_clause(@NotNull ExtractedSwiftParser.Parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitParameter_clause(@NotNull ExtractedSwiftParser.Parameter_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#initializer_head}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_head(@NotNull ExtractedSwiftParser.Initializer_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#initializer_head}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_head(@NotNull ExtractedSwiftParser.Initializer_headContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case_list(@NotNull ExtractedSwiftParser.Union_style_enum_case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case_list(@NotNull ExtractedSwiftParser.Union_style_enum_case_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator(@NotNull ExtractedSwiftParser.Prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator(@NotNull ExtractedSwiftParser.Prefix_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull ExtractedSwiftParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull ExtractedSwiftParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#pattern_initializer}.
	 * @param ctx the parse tree
	 */
	void enterPattern_initializer(@NotNull ExtractedSwiftParser.Pattern_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#pattern_initializer}.
	 * @param ctx the parse tree
	 */
	void exitPattern_initializer(@NotNull ExtractedSwiftParser.Pattern_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(@NotNull ExtractedSwiftParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(@NotNull ExtractedSwiftParser.Struct_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(@NotNull ExtractedSwiftParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(@NotNull ExtractedSwiftParser.Loop_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInfix_operator_declaration(@NotNull ExtractedSwiftParser.Infix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInfix_operator_declaration(@NotNull ExtractedSwiftParser.Infix_operator_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull ExtractedSwiftParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull ExtractedSwiftParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(@NotNull ExtractedSwiftParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(@NotNull ExtractedSwiftParser.Assignment_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#switch_cases}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_cases(@NotNull ExtractedSwiftParser.Switch_casesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#switch_cases}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_cases(@NotNull ExtractedSwiftParser.Switch_casesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#didSet_clause}.
	 * @param ctx the parse tree
	 */
	void enterDidSet_clause(@NotNull ExtractedSwiftParser.DidSet_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#didSet_clause}.
	 * @param ctx the parse tree
	 */
	void exitDidSet_clause(@NotNull ExtractedSwiftParser.DidSet_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#function_head}.
	 * @param ctx the parse tree
	 */
	void enterFunction_head(@NotNull ExtractedSwiftParser.Function_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#function_head}.
	 * @param ctx the parse tree
	 */
	void exitFunction_head(@NotNull ExtractedSwiftParser.Function_headContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(@NotNull ExtractedSwiftParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(@NotNull ExtractedSwiftParser.Switch_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#protocol_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_identifier_list(@NotNull ExtractedSwiftParser.Protocol_identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#protocol_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_identifier_list(@NotNull ExtractedSwiftParser.Protocol_identifier_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull ExtractedSwiftParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull ExtractedSwiftParser.DeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#typealias_head}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_head(@NotNull ExtractedSwiftParser.Typealias_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#typealias_head}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_head(@NotNull ExtractedSwiftParser.Typealias_headContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#capture_specifier}.
	 * @param ctx the parse tree
	 */
	void enterCapture_specifier(@NotNull ExtractedSwiftParser.Capture_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#capture_specifier}.
	 * @param ctx the parse tree
	 */
	void exitCapture_specifier(@NotNull ExtractedSwiftParser.Capture_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull ExtractedSwiftParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull ExtractedSwiftParser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void enterClosure_expression(@NotNull ExtractedSwiftParser.Closure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void exitClosure_expression(@NotNull ExtractedSwiftParser.Closure_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterConditional_operator(@NotNull ExtractedSwiftParser.Conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitConditional_operator(@NotNull ExtractedSwiftParser.Conditional_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#capture_list}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list(@NotNull ExtractedSwiftParser.Capture_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#capture_list}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list(@NotNull ExtractedSwiftParser.Capture_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#wildcard_expression}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_expression(@NotNull ExtractedSwiftParser.Wildcard_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#wildcard_expression}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_expression(@NotNull ExtractedSwiftParser.Wildcard_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_members(@NotNull ExtractedSwiftParser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_members(@NotNull ExtractedSwiftParser.Raw_value_style_enum_membersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#function_result}.
	 * @param ctx the parse tree
	 */
	void enterFunction_result(@NotNull ExtractedSwiftParser.Function_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#function_result}.
	 * @param ctx the parse tree
	 */
	void exitFunction_result(@NotNull ExtractedSwiftParser.Function_resultContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void enterFunction_signature(@NotNull ExtractedSwiftParser.Function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void exitFunction_signature(@NotNull ExtractedSwiftParser.Function_signatureContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#subscript_result}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_result(@NotNull ExtractedSwiftParser.Subscript_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#subscript_result}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_result(@NotNull ExtractedSwiftParser.Subscript_resultContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSwiftParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ExtractedSwiftParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSwiftParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ExtractedSwiftParser.LiteralContext ctx);
}