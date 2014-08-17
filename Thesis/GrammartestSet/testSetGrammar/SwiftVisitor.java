// Generated from Swift.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SwiftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SwiftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SwiftParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_expression(@NotNull SwiftParser.Parenthesized_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeinitializer_declaration(@NotNull SwiftParser.Deinitializer_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(@NotNull SwiftParser.Expression_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#context_sensitive_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_sensitive_keyword(@NotNull SwiftParser.Context_sensitive_keywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case(@NotNull SwiftParser.Raw_value_style_enum_caseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_initializer_expression(@NotNull SwiftParser.Superclass_initializer_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_initializer_list(@NotNull SwiftParser.Pattern_initializer_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_initializer_declaration(@NotNull SwiftParser.Protocol_initializer_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#precedence_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_clause(@NotNull SwiftParser.Precedence_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#variable_declaration_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_head(@NotNull SwiftParser.Variable_declaration_headContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(@NotNull SwiftParser.Label_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#getter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_clause(@NotNull SwiftParser.Getter_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_declaration(@NotNull SwiftParser.Operator_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#requirement_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement_clause(@NotNull SwiftParser.Requirement_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#import_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_path(@NotNull SwiftParser.Import_pathContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(@NotNull SwiftParser.Class_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWillSet_didSet_block(@NotNull SwiftParser.WillSet_didSet_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_assignment(@NotNull SwiftParser.Raw_value_assignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(@NotNull SwiftParser.Identifier_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#balanced_tokens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanced_tokens(@NotNull SwiftParser.Balanced_tokensContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#extension_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_body(@NotNull SwiftParser.Extension_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_associated_type_declaration(@NotNull SwiftParser.Protocol_associated_type_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(@NotNull SwiftParser.Variable_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_property_declaration(@NotNull SwiftParser.Protocol_property_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#fallthrough_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFallthrough_statement(@NotNull SwiftParser.Fallthrough_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull SwiftParser.Type_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#import_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_declaration(@NotNull SwiftParser.Import_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#union_style_enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum(@NotNull SwiftParser.Union_style_enumContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(@NotNull SwiftParser.Parameter_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#local_parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_parameter_name(@NotNull SwiftParser.Local_parameter_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_subscript_declaration(@NotNull SwiftParser.Protocol_subscript_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum(@NotNull SwiftParser.Raw_value_style_enumContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#in_out_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_out_expression(@NotNull SwiftParser.In_out_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#associativity_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativity_clause(@NotNull SwiftParser.Associativity_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#generic_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter_list(@NotNull SwiftParser.Generic_parameter_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifiers(@NotNull SwiftParser.Declaration_specifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#typealias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_name(@NotNull SwiftParser.Typealias_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#subscript_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_head(@NotNull SwiftParser.Subscript_headContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_annotation(@NotNull SwiftParser.Type_annotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#default_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_argument_clause(@NotNull SwiftParser.Default_argument_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#is_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_pattern(@NotNull SwiftParser.Is_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(@NotNull SwiftParser.Class_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_type_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_body(@NotNull SwiftParser.Tuple_type_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(@NotNull SwiftParser.Function_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#infix_operator_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_operator_attributes(@NotNull SwiftParser.Infix_operator_attributesContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_member(@NotNull SwiftParser.Raw_value_style_enum_memberContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#initializer_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_body(@NotNull SwiftParser.Initializer_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#default_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_label(@NotNull SwiftParser.Default_labelContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#top_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_level(@NotNull SwiftParser.Top_levelContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull SwiftParser.OperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(@NotNull SwiftParser.Attribute_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#while_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_condition(@NotNull SwiftParser.While_conditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_inheritance_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_inheritance_list(@NotNull SwiftParser.Type_inheritance_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern_element(@NotNull SwiftParser.Tuple_pattern_elementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_member_declaration(@NotNull SwiftParser.Protocol_member_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#precedence_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_level(@NotNull SwiftParser.Precedence_levelContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(@NotNull SwiftParser.PatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#expression_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_element_list(@NotNull SwiftParser.Expression_element_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#superclass_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_expression(@NotNull SwiftParser.Superclass_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#superclass_method_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_method_expression(@NotNull SwiftParser.Superclass_method_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_member_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_member_declarations(@NotNull SwiftParser.Protocol_member_declarationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#setter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_name(@NotNull SwiftParser.Setter_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#willSet_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWillSet_clause(@NotNull SwiftParser.WillSet_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_declaration(@NotNull SwiftParser.Protocol_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull SwiftParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_element(@NotNull SwiftParser.Expression_elementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_identifier(@NotNull SwiftParser.Type_identifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#literal_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_expression(@NotNull SwiftParser.Literal_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator_declaration(@NotNull SwiftParser.Prefix_operator_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#element_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_name(@NotNull SwiftParser.Element_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(@NotNull SwiftParser.Constant_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#initializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_declaration(@NotNull SwiftParser.Initializer_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#enum_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_name(@NotNull SwiftParser.Enum_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(@NotNull SwiftParser.If_conditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(@NotNull SwiftParser.Function_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(@NotNull SwiftParser.Parameter_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#as_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_pattern(@NotNull SwiftParser.As_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#wildcard_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_pattern(@NotNull SwiftParser.Wildcard_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case_clause(@NotNull SwiftParser.Union_style_enum_case_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull SwiftParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#enum_case_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_case_name(@NotNull SwiftParser.Enum_case_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_casting_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_casting_pattern(@NotNull SwiftParser.Type_casting_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#extension_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_declaration(@NotNull SwiftParser.Extension_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#import_path_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_path_identifier(@NotNull SwiftParser.Import_path_identifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#union_style_enum_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case(@NotNull SwiftParser.Union_style_enum_caseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#associativity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativity(@NotNull SwiftParser.AssociativityContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#guard_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_expression(@NotNull SwiftParser.Guard_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#union_style_enum_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_members(@NotNull SwiftParser.Union_style_enum_membersContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(@NotNull SwiftParser.Integer_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal_item(@NotNull SwiftParser.Dictionary_literal_itemContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull SwiftParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_composition_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_composition_type(@NotNull SwiftParser.Protocol_composition_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case_list(@NotNull SwiftParser.Raw_value_style_enum_case_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull SwiftParser.While_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern_element_list(@NotNull SwiftParser.Tuple_pattern_element_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#struct_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_name(@NotNull SwiftParser.Struct_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_body(@NotNull SwiftParser.Protocol_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull SwiftParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_inheritance_clause(@NotNull SwiftParser.Type_inheritance_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_name(@NotNull SwiftParser.Protocol_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_keyword_clause(@NotNull SwiftParser.Setter_keyword_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#for_in_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in_statement(@NotNull SwiftParser.For_in_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#case_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_label(@NotNull SwiftParser.Case_labelContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter_clause(@NotNull SwiftParser.Generic_parameter_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(@NotNull SwiftParser.RequirementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#identifier_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_pattern(@NotNull SwiftParser.Identifier_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#array_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal(@NotNull SwiftParser.Array_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#value_binding_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_binding_pattern(@NotNull SwiftParser.Value_binding_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#array_literal_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal_items(@NotNull SwiftParser.Array_literal_itemsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#generic_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter(@NotNull SwiftParser.Generic_parameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(@NotNull SwiftParser.Do_while_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal_items(@NotNull SwiftParser.Dictionary_literal_itemsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(@NotNull SwiftParser.AttributesContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#generic_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument(@NotNull SwiftParser.Generic_argumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_argument_clause(@NotNull SwiftParser.Attribute_argument_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#generic_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument_clause(@NotNull SwiftParser.Generic_argument_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_keyword_clause(@NotNull SwiftParser.Getter_keyword_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#conformance_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConformance_requirement(@NotNull SwiftParser.Conformance_requirementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(@NotNull SwiftParser.Labeled_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#enum_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_declaration(@NotNull SwiftParser.Enum_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#implicit_member_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_member_expression(@NotNull SwiftParser.Implicit_member_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#enum_case_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_case_pattern(@NotNull SwiftParser.Enum_case_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#declaration_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifier(@NotNull SwiftParser.Declaration_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#requirement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement_list(@NotNull SwiftParser.Requirement_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#subscript_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_declaration(@NotNull SwiftParser.Subscript_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull SwiftParser.For_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#setter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_clause(@NotNull SwiftParser.Setter_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#import_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_kind(@NotNull SwiftParser.Import_kindContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#struct_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_body(@NotNull SwiftParser.Struct_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#case_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item_list(@NotNull SwiftParser.Case_item_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#branch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_statement(@NotNull SwiftParser.Branch_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_casting_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_casting_operator(@NotNull SwiftParser.Type_casting_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#trailing_closure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailing_closure(@NotNull SwiftParser.Trailing_closureContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operator_declaration(@NotNull SwiftParser.Postfix_operator_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#typealias_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_assignment(@NotNull SwiftParser.Typealias_assignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#typealias_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_declaration(@NotNull SwiftParser.Typealias_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#generic_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument_list(@NotNull SwiftParser.Generic_argument_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type(@NotNull SwiftParser.Tuple_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_subscript_expression(@NotNull SwiftParser.Superclass_subscript_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#union_style_enum_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_member(@NotNull SwiftParser.Union_style_enum_memberContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(@NotNull SwiftParser.Function_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull SwiftParser.If_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case_clause(@NotNull SwiftParser.Raw_value_style_enum_case_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(@NotNull SwiftParser.Class_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(@NotNull SwiftParser.Variable_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#metatype_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetatype_type(@NotNull SwiftParser.Metatype_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#self_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_expression(@NotNull SwiftParser.Self_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#control_transfer_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_transfer_statement(@NotNull SwiftParser.Control_transfer_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(@NotNull SwiftParser.Binary_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(@NotNull SwiftParser.Return_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#parameter_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_clauses(@NotNull SwiftParser.Parameter_clausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#getter_setter_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter_block(@NotNull SwiftParser.Getter_setter_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#array_literal_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal_item(@NotNull SwiftParser.Array_literal_itemContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(@NotNull SwiftParser.Continue_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#same_type_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSame_type_requirement(@NotNull SwiftParser.Same_type_requirementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_method_declaration(@NotNull SwiftParser.Protocol_method_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(@NotNull SwiftParser.Break_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(@NotNull SwiftParser.Primary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#closure_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_signature(@NotNull SwiftParser.Closure_signatureContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#expression_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_pattern(@NotNull SwiftParser.Expression_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(@NotNull SwiftParser.InitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(@NotNull SwiftParser.Code_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull SwiftParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#statement_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_label(@NotNull SwiftParser.Statement_labelContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_element_list(@NotNull SwiftParser.Tuple_type_element_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#dictionary_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal(@NotNull SwiftParser.Dictionary_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter_keyword_block(@NotNull SwiftParser.Getter_setter_keyword_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern(@NotNull SwiftParser.Tuple_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#balanced_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanced_token(@NotNull SwiftParser.Balanced_tokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#postfix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operator(@NotNull SwiftParser.Postfix_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(@NotNull SwiftParser.Switch_caseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#guard_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_clause(@NotNull SwiftParser.Guard_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_identifier(@NotNull SwiftParser.Protocol_identifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_clause(@NotNull SwiftParser.Else_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull SwiftParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_type_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_element(@NotNull SwiftParser.Tuple_type_elementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#for_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init(@NotNull SwiftParser.For_initContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_clause(@NotNull SwiftParser.Parameter_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#initializer_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_head(@NotNull SwiftParser.Initializer_headContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case_list(@NotNull SwiftParser.Union_style_enum_case_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator(@NotNull SwiftParser.Prefix_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull SwiftParser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#pattern_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_initializer(@NotNull SwiftParser.Pattern_initializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(@NotNull SwiftParser.Struct_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(@NotNull SwiftParser.Loop_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_operator_declaration(@NotNull SwiftParser.Infix_operator_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull SwiftParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(@NotNull SwiftParser.Assignment_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#switch_cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_cases(@NotNull SwiftParser.Switch_casesContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#didSet_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDidSet_clause(@NotNull SwiftParser.DidSet_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#function_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_head(@NotNull SwiftParser.Function_headContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(@NotNull SwiftParser.Switch_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_identifier_list(@NotNull SwiftParser.Protocol_identifier_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(@NotNull SwiftParser.DeclarationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#typealias_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_head(@NotNull SwiftParser.Typealias_headContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#capture_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_specifier(@NotNull SwiftParser.Capture_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(@NotNull SwiftParser.KeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#closure_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_expression(@NotNull SwiftParser.Closure_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_operator(@NotNull SwiftParser.Conditional_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#capture_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_list(@NotNull SwiftParser.Capture_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#wildcard_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_expression(@NotNull SwiftParser.Wildcard_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_members(@NotNull SwiftParser.Raw_value_style_enum_membersContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#function_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_result(@NotNull SwiftParser.Function_resultContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#function_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_signature(@NotNull SwiftParser.Function_signatureContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#subscript_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_result(@NotNull SwiftParser.Subscript_resultContext ctx);

	/**
	 * Visit a parse tree produced by {@link SwiftParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull SwiftParser.LiteralContext ctx);
}