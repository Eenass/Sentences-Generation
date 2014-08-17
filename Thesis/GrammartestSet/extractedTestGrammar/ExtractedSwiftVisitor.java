// Generated from ExtractedSwift.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedSwiftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedSwiftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_expression(@NotNull ExtractedSwiftParser.Parenthesized_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeinitializer_declaration(@NotNull ExtractedSwiftParser.Deinitializer_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(@NotNull ExtractedSwiftParser.Expression_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#context_sensitive_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_sensitive_keyword(@NotNull ExtractedSwiftParser.Context_sensitive_keywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case(@NotNull ExtractedSwiftParser.Raw_value_style_enum_caseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_initializer_expression(@NotNull ExtractedSwiftParser.Superclass_initializer_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_initializer_list(@NotNull ExtractedSwiftParser.Pattern_initializer_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_initializer_declaration(@NotNull ExtractedSwiftParser.Protocol_initializer_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#precedence_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_clause(@NotNull ExtractedSwiftParser.Precedence_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#variable_declaration_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_head(@NotNull ExtractedSwiftParser.Variable_declaration_headContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(@NotNull ExtractedSwiftParser.Label_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#getter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_clause(@NotNull ExtractedSwiftParser.Getter_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_declaration(@NotNull ExtractedSwiftParser.Operator_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#requirement_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement_clause(@NotNull ExtractedSwiftParser.Requirement_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#import_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_path(@NotNull ExtractedSwiftParser.Import_pathContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(@NotNull ExtractedSwiftParser.Class_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWillSet_didSet_block(@NotNull ExtractedSwiftParser.WillSet_didSet_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#raw_value_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_assignment(@NotNull ExtractedSwiftParser.Raw_value_assignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(@NotNull ExtractedSwiftParser.Identifier_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#balanced_tokens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanced_tokens(@NotNull ExtractedSwiftParser.Balanced_tokensContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#extension_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_body(@NotNull ExtractedSwiftParser.Extension_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_associated_type_declaration(@NotNull ExtractedSwiftParser.Protocol_associated_type_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(@NotNull ExtractedSwiftParser.Variable_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_property_declaration(@NotNull ExtractedSwiftParser.Protocol_property_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#fallthrough_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFallthrough_statement(@NotNull ExtractedSwiftParser.Fallthrough_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull ExtractedSwiftParser.Type_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#import_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_declaration(@NotNull ExtractedSwiftParser.Import_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#union_style_enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum(@NotNull ExtractedSwiftParser.Union_style_enumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(@NotNull ExtractedSwiftParser.Parameter_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#local_parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_parameter_name(@NotNull ExtractedSwiftParser.Local_parameter_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_subscript_declaration(@NotNull ExtractedSwiftParser.Protocol_subscript_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum(@NotNull ExtractedSwiftParser.Raw_value_style_enumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#in_out_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_out_expression(@NotNull ExtractedSwiftParser.In_out_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#associativity_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativity_clause(@NotNull ExtractedSwiftParser.Associativity_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#generic_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter_list(@NotNull ExtractedSwiftParser.Generic_parameter_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifiers(@NotNull ExtractedSwiftParser.Declaration_specifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#typealias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_name(@NotNull ExtractedSwiftParser.Typealias_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#subscript_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_head(@NotNull ExtractedSwiftParser.Subscript_headContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_annotation(@NotNull ExtractedSwiftParser.Type_annotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#default_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_argument_clause(@NotNull ExtractedSwiftParser.Default_argument_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#is_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_pattern(@NotNull ExtractedSwiftParser.Is_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(@NotNull ExtractedSwiftParser.Class_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#tuple_type_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_body(@NotNull ExtractedSwiftParser.Tuple_type_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(@NotNull ExtractedSwiftParser.Function_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#infix_operator_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_operator_attributes(@NotNull ExtractedSwiftParser.Infix_operator_attributesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_member(@NotNull ExtractedSwiftParser.Raw_value_style_enum_memberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#initializer_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_body(@NotNull ExtractedSwiftParser.Initializer_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#default_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_label(@NotNull ExtractedSwiftParser.Default_labelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#top_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_level(@NotNull ExtractedSwiftParser.Top_levelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull ExtractedSwiftParser.OperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(@NotNull ExtractedSwiftParser.Attribute_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#while_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_condition(@NotNull ExtractedSwiftParser.While_conditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#type_inheritance_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_inheritance_list(@NotNull ExtractedSwiftParser.Type_inheritance_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern_element(@NotNull ExtractedSwiftParser.Tuple_pattern_elementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_member_declaration(@NotNull ExtractedSwiftParser.Protocol_member_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#precedence_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_level(@NotNull ExtractedSwiftParser.Precedence_levelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(@NotNull ExtractedSwiftParser.PatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#expression_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_element_list(@NotNull ExtractedSwiftParser.Expression_element_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#superclass_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_expression(@NotNull ExtractedSwiftParser.Superclass_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#superclass_method_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_method_expression(@NotNull ExtractedSwiftParser.Superclass_method_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#protocol_member_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_member_declarations(@NotNull ExtractedSwiftParser.Protocol_member_declarationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#setter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_name(@NotNull ExtractedSwiftParser.Setter_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#willSet_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWillSet_clause(@NotNull ExtractedSwiftParser.WillSet_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#protocol_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_declaration(@NotNull ExtractedSwiftParser.Protocol_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ExtractedSwiftParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_element(@NotNull ExtractedSwiftParser.Expression_elementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_identifier(@NotNull ExtractedSwiftParser.Type_identifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#literal_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_expression(@NotNull ExtractedSwiftParser.Literal_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator_declaration(@NotNull ExtractedSwiftParser.Prefix_operator_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#element_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_name(@NotNull ExtractedSwiftParser.Element_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(@NotNull ExtractedSwiftParser.Constant_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#initializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_declaration(@NotNull ExtractedSwiftParser.Initializer_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#enum_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_name(@NotNull ExtractedSwiftParser.Enum_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(@NotNull ExtractedSwiftParser.If_conditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(@NotNull ExtractedSwiftParser.Function_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(@NotNull ExtractedSwiftParser.Parameter_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#as_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_pattern(@NotNull ExtractedSwiftParser.As_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#wildcard_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_pattern(@NotNull ExtractedSwiftParser.Wildcard_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case_clause(@NotNull ExtractedSwiftParser.Union_style_enum_case_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull ExtractedSwiftParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#enum_case_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_case_name(@NotNull ExtractedSwiftParser.Enum_case_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#type_casting_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_casting_pattern(@NotNull ExtractedSwiftParser.Type_casting_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#extension_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_declaration(@NotNull ExtractedSwiftParser.Extension_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#import_path_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_path_identifier(@NotNull ExtractedSwiftParser.Import_path_identifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case(@NotNull ExtractedSwiftParser.Union_style_enum_caseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#associativity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativity(@NotNull ExtractedSwiftParser.AssociativityContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#guard_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_expression(@NotNull ExtractedSwiftParser.Guard_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_members(@NotNull ExtractedSwiftParser.Union_style_enum_membersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(@NotNull ExtractedSwiftParser.Integer_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal_item(@NotNull ExtractedSwiftParser.Dictionary_literal_itemContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull ExtractedSwiftParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#protocol_composition_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_composition_type(@NotNull ExtractedSwiftParser.Protocol_composition_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case_list(@NotNull ExtractedSwiftParser.Raw_value_style_enum_case_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull ExtractedSwiftParser.While_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern_element_list(@NotNull ExtractedSwiftParser.Tuple_pattern_element_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#struct_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_name(@NotNull ExtractedSwiftParser.Struct_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#protocol_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_body(@NotNull ExtractedSwiftParser.Protocol_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull ExtractedSwiftParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_inheritance_clause(@NotNull ExtractedSwiftParser.Type_inheritance_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#protocol_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_name(@NotNull ExtractedSwiftParser.Protocol_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_keyword_clause(@NotNull ExtractedSwiftParser.Setter_keyword_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#for_in_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in_statement(@NotNull ExtractedSwiftParser.For_in_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#case_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_label(@NotNull ExtractedSwiftParser.Case_labelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter_clause(@NotNull ExtractedSwiftParser.Generic_parameter_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(@NotNull ExtractedSwiftParser.RequirementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#identifier_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_pattern(@NotNull ExtractedSwiftParser.Identifier_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#array_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal(@NotNull ExtractedSwiftParser.Array_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#value_binding_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_binding_pattern(@NotNull ExtractedSwiftParser.Value_binding_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#array_literal_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal_items(@NotNull ExtractedSwiftParser.Array_literal_itemsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#generic_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter(@NotNull ExtractedSwiftParser.Generic_parameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(@NotNull ExtractedSwiftParser.Do_while_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal_items(@NotNull ExtractedSwiftParser.Dictionary_literal_itemsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(@NotNull ExtractedSwiftParser.AttributesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#generic_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument(@NotNull ExtractedSwiftParser.Generic_argumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_argument_clause(@NotNull ExtractedSwiftParser.Attribute_argument_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#generic_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument_clause(@NotNull ExtractedSwiftParser.Generic_argument_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_keyword_clause(@NotNull ExtractedSwiftParser.Getter_keyword_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#conformance_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConformance_requirement(@NotNull ExtractedSwiftParser.Conformance_requirementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(@NotNull ExtractedSwiftParser.Labeled_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#enum_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_declaration(@NotNull ExtractedSwiftParser.Enum_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#implicit_member_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_member_expression(@NotNull ExtractedSwiftParser.Implicit_member_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#enum_case_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_case_pattern(@NotNull ExtractedSwiftParser.Enum_case_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#declaration_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifier(@NotNull ExtractedSwiftParser.Declaration_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#requirement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement_list(@NotNull ExtractedSwiftParser.Requirement_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#subscript_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_declaration(@NotNull ExtractedSwiftParser.Subscript_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull ExtractedSwiftParser.For_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#setter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_clause(@NotNull ExtractedSwiftParser.Setter_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#import_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_kind(@NotNull ExtractedSwiftParser.Import_kindContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#struct_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_body(@NotNull ExtractedSwiftParser.Struct_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#case_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item_list(@NotNull ExtractedSwiftParser.Case_item_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#branch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_statement(@NotNull ExtractedSwiftParser.Branch_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#type_casting_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_casting_operator(@NotNull ExtractedSwiftParser.Type_casting_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#trailing_closure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailing_closure(@NotNull ExtractedSwiftParser.Trailing_closureContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operator_declaration(@NotNull ExtractedSwiftParser.Postfix_operator_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#typealias_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_assignment(@NotNull ExtractedSwiftParser.Typealias_assignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#typealias_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_declaration(@NotNull ExtractedSwiftParser.Typealias_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#generic_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument_list(@NotNull ExtractedSwiftParser.Generic_argument_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#tuple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type(@NotNull ExtractedSwiftParser.Tuple_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_subscript_expression(@NotNull ExtractedSwiftParser.Superclass_subscript_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_member(@NotNull ExtractedSwiftParser.Union_style_enum_memberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(@NotNull ExtractedSwiftParser.Function_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull ExtractedSwiftParser.If_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case_clause(@NotNull ExtractedSwiftParser.Raw_value_style_enum_case_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(@NotNull ExtractedSwiftParser.Class_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(@NotNull ExtractedSwiftParser.Variable_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#metatype_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetatype_type(@NotNull ExtractedSwiftParser.Metatype_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#self_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_expression(@NotNull ExtractedSwiftParser.Self_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#control_transfer_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_transfer_statement(@NotNull ExtractedSwiftParser.Control_transfer_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(@NotNull ExtractedSwiftParser.Binary_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(@NotNull ExtractedSwiftParser.Return_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#parameter_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_clauses(@NotNull ExtractedSwiftParser.Parameter_clausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#getter_setter_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter_block(@NotNull ExtractedSwiftParser.Getter_setter_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#array_literal_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal_item(@NotNull ExtractedSwiftParser.Array_literal_itemContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(@NotNull ExtractedSwiftParser.Continue_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#same_type_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSame_type_requirement(@NotNull ExtractedSwiftParser.Same_type_requirementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_method_declaration(@NotNull ExtractedSwiftParser.Protocol_method_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(@NotNull ExtractedSwiftParser.Break_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(@NotNull ExtractedSwiftParser.Primary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#closure_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_signature(@NotNull ExtractedSwiftParser.Closure_signatureContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#expression_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_pattern(@NotNull ExtractedSwiftParser.Expression_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(@NotNull ExtractedSwiftParser.InitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(@NotNull ExtractedSwiftParser.Code_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull ExtractedSwiftParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#statement_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_label(@NotNull ExtractedSwiftParser.Statement_labelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_element_list(@NotNull ExtractedSwiftParser.Tuple_type_element_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#dictionary_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal(@NotNull ExtractedSwiftParser.Dictionary_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter_keyword_block(@NotNull ExtractedSwiftParser.Getter_setter_keyword_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#tuple_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern(@NotNull ExtractedSwiftParser.Tuple_patternContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#balanced_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanced_token(@NotNull ExtractedSwiftParser.Balanced_tokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#postfix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operator(@NotNull ExtractedSwiftParser.Postfix_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(@NotNull ExtractedSwiftParser.Switch_caseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#guard_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_clause(@NotNull ExtractedSwiftParser.Guard_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#protocol_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_identifier(@NotNull ExtractedSwiftParser.Protocol_identifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_clause(@NotNull ExtractedSwiftParser.Else_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ExtractedSwiftParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#tuple_type_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_element(@NotNull ExtractedSwiftParser.Tuple_type_elementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#for_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init(@NotNull ExtractedSwiftParser.For_initContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_clause(@NotNull ExtractedSwiftParser.Parameter_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#initializer_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_head(@NotNull ExtractedSwiftParser.Initializer_headContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case_list(@NotNull ExtractedSwiftParser.Union_style_enum_case_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator(@NotNull ExtractedSwiftParser.Prefix_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull ExtractedSwiftParser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#pattern_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_initializer(@NotNull ExtractedSwiftParser.Pattern_initializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(@NotNull ExtractedSwiftParser.Struct_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(@NotNull ExtractedSwiftParser.Loop_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_operator_declaration(@NotNull ExtractedSwiftParser.Infix_operator_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull ExtractedSwiftParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(@NotNull ExtractedSwiftParser.Assignment_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#switch_cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_cases(@NotNull ExtractedSwiftParser.Switch_casesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#didSet_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDidSet_clause(@NotNull ExtractedSwiftParser.DidSet_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#function_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_head(@NotNull ExtractedSwiftParser.Function_headContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(@NotNull ExtractedSwiftParser.Switch_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#protocol_identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_identifier_list(@NotNull ExtractedSwiftParser.Protocol_identifier_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(@NotNull ExtractedSwiftParser.DeclarationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#typealias_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_head(@NotNull ExtractedSwiftParser.Typealias_headContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#capture_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_specifier(@NotNull ExtractedSwiftParser.Capture_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(@NotNull ExtractedSwiftParser.KeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#closure_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_expression(@NotNull ExtractedSwiftParser.Closure_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_operator(@NotNull ExtractedSwiftParser.Conditional_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#capture_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_list(@NotNull ExtractedSwiftParser.Capture_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#wildcard_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_expression(@NotNull ExtractedSwiftParser.Wildcard_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_members(@NotNull ExtractedSwiftParser.Raw_value_style_enum_membersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#function_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_result(@NotNull ExtractedSwiftParser.Function_resultContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#function_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_signature(@NotNull ExtractedSwiftParser.Function_signatureContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#subscript_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_result(@NotNull ExtractedSwiftParser.Subscript_resultContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSwiftParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull ExtractedSwiftParser.LiteralContext ctx);
}