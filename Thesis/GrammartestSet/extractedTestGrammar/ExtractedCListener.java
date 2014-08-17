// Generated from ExtractedC.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedCParser}.
 */
public interface ExtractedCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ExtractedCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ExtractedCParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull ExtractedCParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull ExtractedCParser.DeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull ExtractedCParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull ExtractedCParser.ExpressionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull ExtractedCParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull ExtractedCParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(@NotNull ExtractedCParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(@NotNull ExtractedCParser.DesignationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(@NotNull ExtractedCParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(@NotNull ExtractedCParser.ParameterDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(@NotNull ExtractedCParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(@NotNull ExtractedCParser.NestedParenthesesBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(@NotNull ExtractedCParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(@NotNull ExtractedCParser.ParameterTypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(@NotNull ExtractedCParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(@NotNull ExtractedCParser.DesignatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull ExtractedCParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull ExtractedCParser.PrimaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(@NotNull ExtractedCParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(@NotNull ExtractedCParser.StructOrUnionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(@NotNull ExtractedCParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(@NotNull ExtractedCParser.InitDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(@NotNull ExtractedCParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(@NotNull ExtractedCParser.StorageClassSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(@NotNull ExtractedCParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(@NotNull ExtractedCParser.TypeQualifierListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(@NotNull ExtractedCParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(@NotNull ExtractedCParser.StructDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull ExtractedCParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull ExtractedCParser.ParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(@NotNull ExtractedCParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(@NotNull ExtractedCParser.EnumeratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(@NotNull ExtractedCParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(@NotNull ExtractedCParser.DeclarationListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull ExtractedCParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull ExtractedCParser.ShiftExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(@NotNull ExtractedCParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(@NotNull ExtractedCParser.BlockItemListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(@NotNull ExtractedCParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(@NotNull ExtractedCParser.TypedefNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull ExtractedCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull ExtractedCParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(@NotNull ExtractedCParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(@NotNull ExtractedCParser.DesignatorListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull ExtractedCParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull ExtractedCParser.AssignmentExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(@NotNull ExtractedCParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(@NotNull ExtractedCParser.GenericSelectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(@NotNull ExtractedCParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(@NotNull ExtractedCParser.SelectionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(@NotNull ExtractedCParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(@NotNull ExtractedCParser.ArgumentExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull ExtractedCParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull ExtractedCParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(@NotNull ExtractedCParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(@NotNull ExtractedCParser.DeclarationSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(@NotNull ExtractedCParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(@NotNull ExtractedCParser.PostfixExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(@NotNull ExtractedCParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(@NotNull ExtractedCParser.AlignmentSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ExtractedCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ExtractedCParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull ExtractedCParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull ExtractedCParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(@NotNull ExtractedCParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(@NotNull ExtractedCParser.UnaryOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(@NotNull ExtractedCParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(@NotNull ExtractedCParser.GenericAssociationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull ExtractedCParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull ExtractedCParser.FunctionDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull ExtractedCParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull ExtractedCParser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(@NotNull ExtractedCParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(@NotNull ExtractedCParser.StructDeclarationListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(@NotNull ExtractedCParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(@NotNull ExtractedCParser.InitializerListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(@NotNull ExtractedCParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(@NotNull ExtractedCParser.PointerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(@NotNull ExtractedCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(@NotNull ExtractedCParser.DeclarationSpecifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(@NotNull ExtractedCParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(@NotNull ExtractedCParser.StructDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(@NotNull ExtractedCParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(@NotNull ExtractedCParser.EnumSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull ExtractedCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull ExtractedCParser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull ExtractedCParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull ExtractedCParser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(@NotNull ExtractedCParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(@NotNull ExtractedCParser.StaticAssertDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(@NotNull ExtractedCParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(@NotNull ExtractedCParser.DeclarationSpecifiers2Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(@NotNull ExtractedCParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(@NotNull ExtractedCParser.AtomicTypeSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull ExtractedCParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull ExtractedCParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(@NotNull ExtractedCParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(@NotNull ExtractedCParser.DirectDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(@NotNull ExtractedCParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(@NotNull ExtractedCParser.GccAttributeSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(@NotNull ExtractedCParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(@NotNull ExtractedCParser.DirectAbstractDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(@NotNull ExtractedCParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(@NotNull ExtractedCParser.IdentifierListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(@NotNull ExtractedCParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(@NotNull ExtractedCParser.TypeSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull ExtractedCParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull ExtractedCParser.ConditionalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(@NotNull ExtractedCParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(@NotNull ExtractedCParser.TranslationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull ExtractedCParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull ExtractedCParser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(@NotNull ExtractedCParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(@NotNull ExtractedCParser.StructOrUnionSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(@NotNull ExtractedCParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(@NotNull ExtractedCParser.LabeledStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull ExtractedCParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull ExtractedCParser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(@NotNull ExtractedCParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(@NotNull ExtractedCParser.EnumerationConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(@NotNull ExtractedCParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(@NotNull ExtractedCParser.GccAttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(@NotNull ExtractedCParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(@NotNull ExtractedCParser.GccDeclaratorExtensionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(@NotNull ExtractedCParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(@NotNull ExtractedCParser.IterationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(@NotNull ExtractedCParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(@NotNull ExtractedCParser.GccAttributeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(@NotNull ExtractedCParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(@NotNull ExtractedCParser.TypeQualifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(@NotNull ExtractedCParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(@NotNull ExtractedCParser.EnumeratorListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(@NotNull ExtractedCParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(@NotNull ExtractedCParser.CompoundStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(@NotNull ExtractedCParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(@NotNull ExtractedCParser.JumpStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(@NotNull ExtractedCParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(@NotNull ExtractedCParser.BlockItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(@NotNull ExtractedCParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(@NotNull ExtractedCParser.LogicalAndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(@NotNull ExtractedCParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(@NotNull ExtractedCParser.AbstractDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull ExtractedCParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull ExtractedCParser.TypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(@NotNull ExtractedCParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(@NotNull ExtractedCParser.LogicalOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull ExtractedCParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull ExtractedCParser.InclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(@NotNull ExtractedCParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(@NotNull ExtractedCParser.GenericAssocListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(@NotNull ExtractedCParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(@NotNull ExtractedCParser.FunctionSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull ExtractedCParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull ExtractedCParser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(@NotNull ExtractedCParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(@NotNull ExtractedCParser.StructDeclaratorListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull ExtractedCParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull ExtractedCParser.CastExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(@NotNull ExtractedCParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(@NotNull ExtractedCParser.SpecifierQualifierListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(@NotNull ExtractedCParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(@NotNull ExtractedCParser.ExternalDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull ExtractedCParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull ExtractedCParser.InitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(@NotNull ExtractedCParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(@NotNull ExtractedCParser.InitDeclaratorListContext ctx);
}