// Generated from ExtractedC.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ExtractedCParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(@NotNull ExtractedCParser.DeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(@NotNull ExtractedCParser.ExpressionStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(@NotNull ExtractedCParser.UnaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(@NotNull ExtractedCParser.DesignationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(@NotNull ExtractedCParser.ParameterDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(@NotNull ExtractedCParser.NestedParenthesesBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(@NotNull ExtractedCParser.ParameterTypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(@NotNull ExtractedCParser.DesignatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(@NotNull ExtractedCParser.PrimaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(@NotNull ExtractedCParser.StructOrUnionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(@NotNull ExtractedCParser.InitDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(@NotNull ExtractedCParser.StorageClassSpecifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(@NotNull ExtractedCParser.TypeQualifierListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(@NotNull ExtractedCParser.StructDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull ExtractedCParser.ParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(@NotNull ExtractedCParser.EnumeratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(@NotNull ExtractedCParser.DeclarationListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(@NotNull ExtractedCParser.ShiftExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(@NotNull ExtractedCParser.BlockItemListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(@NotNull ExtractedCParser.TypedefNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull ExtractedCParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(@NotNull ExtractedCParser.DesignatorListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(@NotNull ExtractedCParser.AssignmentExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(@NotNull ExtractedCParser.GenericSelectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(@NotNull ExtractedCParser.SelectionStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(@NotNull ExtractedCParser.ArgumentExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(@NotNull ExtractedCParser.AdditiveExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(@NotNull ExtractedCParser.DeclarationSpecifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(@NotNull ExtractedCParser.PostfixExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(@NotNull ExtractedCParser.AlignmentSpecifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ExtractedCParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(@NotNull ExtractedCParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(@NotNull ExtractedCParser.UnaryOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssociation(@NotNull ExtractedCParser.GenericAssociationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(@NotNull ExtractedCParser.FunctionDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(@NotNull ExtractedCParser.ConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(@NotNull ExtractedCParser.StructDeclarationListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(@NotNull ExtractedCParser.InitializerListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(@NotNull ExtractedCParser.PointerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(@NotNull ExtractedCParser.DeclarationSpecifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(@NotNull ExtractedCParser.StructDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(@NotNull ExtractedCParser.EnumSpecifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(@NotNull ExtractedCParser.MultiplicativeExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(@NotNull ExtractedCParser.AssignmentOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(@NotNull ExtractedCParser.StaticAssertDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(@NotNull ExtractedCParser.DeclarationSpecifiers2Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(@NotNull ExtractedCParser.AtomicTypeSpecifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull ExtractedCParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(@NotNull ExtractedCParser.DirectDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeSpecifier(@NotNull ExtractedCParser.GccAttributeSpecifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(@NotNull ExtractedCParser.DirectAbstractDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(@NotNull ExtractedCParser.IdentifierListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(@NotNull ExtractedCParser.TypeSpecifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(@NotNull ExtractedCParser.ConditionalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(@NotNull ExtractedCParser.TranslationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(@NotNull ExtractedCParser.AndExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(@NotNull ExtractedCParser.StructOrUnionSpecifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(@NotNull ExtractedCParser.LabeledStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(@NotNull ExtractedCParser.RelationalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(@NotNull ExtractedCParser.EnumerationConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttribute(@NotNull ExtractedCParser.GccAttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccDeclaratorExtension(@NotNull ExtractedCParser.GccDeclaratorExtensionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(@NotNull ExtractedCParser.IterationStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeList(@NotNull ExtractedCParser.GccAttributeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(@NotNull ExtractedCParser.TypeQualifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(@NotNull ExtractedCParser.EnumeratorListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(@NotNull ExtractedCParser.CompoundStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(@NotNull ExtractedCParser.JumpStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(@NotNull ExtractedCParser.BlockItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(@NotNull ExtractedCParser.LogicalAndExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(@NotNull ExtractedCParser.AbstractDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(@NotNull ExtractedCParser.TypeNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(@NotNull ExtractedCParser.LogicalOrExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(@NotNull ExtractedCParser.InclusiveOrExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssocList(@NotNull ExtractedCParser.GenericAssocListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(@NotNull ExtractedCParser.FunctionSpecifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(@NotNull ExtractedCParser.EqualityExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(@NotNull ExtractedCParser.StructDeclaratorListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(@NotNull ExtractedCParser.CastExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(@NotNull ExtractedCParser.SpecifierQualifierListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(@NotNull ExtractedCParser.ExternalDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(@NotNull ExtractedCParser.InitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(@NotNull ExtractedCParser.InitDeclaratorListContext ctx);
}