// Generated from ExtractedJava.g4 by ANTLR 4.1
package extractedGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(@NotNull ExtractedJavaParser.InnerCreatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(@NotNull ExtractedJavaParser.GenericMethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull ExtractedJavaParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(@NotNull ExtractedJavaParser.TypeDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(@NotNull ExtractedJavaParser.ForUpdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull ExtractedJavaParser.AnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(@NotNull ExtractedJavaParser.EnumConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull ExtractedJavaParser.ImportDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(@NotNull ExtractedJavaParser.AnnotationMethodOrConstantRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(@NotNull ExtractedJavaParser.EnumConstantNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(@NotNull ExtractedJavaParser.FinallyBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(@NotNull ExtractedJavaParser.VariableDeclaratorsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(@NotNull ExtractedJavaParser.ElementValuePairsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(@NotNull ExtractedJavaParser.InterfaceMethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(@NotNull ExtractedJavaParser.InterfaceBodyDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(@NotNull ExtractedJavaParser.EnumConstantsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(@NotNull ExtractedJavaParser.CatchClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(@NotNull ExtractedJavaParser.ConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(@NotNull ExtractedJavaParser.EnumDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(@NotNull ExtractedJavaParser.ExplicitGenericInvocationSuffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(@NotNull ExtractedJavaParser.TypeParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(@NotNull ExtractedJavaParser.EnumBodyDeclarationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(@NotNull ExtractedJavaParser.TypeBoundContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(@NotNull ExtractedJavaParser.StatementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(@NotNull ExtractedJavaParser.VariableInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ExtractedJavaParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(@NotNull ExtractedJavaParser.GenericInterfaceMethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(@NotNull ExtractedJavaParser.LocalVariableDeclarationStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(@NotNull ExtractedJavaParser.SuperSuffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(@NotNull ExtractedJavaParser.FieldDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(@NotNull ExtractedJavaParser.FormalParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(@NotNull ExtractedJavaParser.ExplicitGenericInvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(@NotNull ExtractedJavaParser.ParExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(@NotNull ExtractedJavaParser.SwitchLabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(@NotNull ExtractedJavaParser.TypeParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull ExtractedJavaParser.QualifiedNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull ExtractedJavaParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(@NotNull ExtractedJavaParser.AnnotationConstantRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull ExtractedJavaParser.ArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(@NotNull ExtractedJavaParser.ConstructorBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(@NotNull ExtractedJavaParser.FormalParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(@NotNull ExtractedJavaParser.TypeArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(@NotNull ExtractedJavaParser.ForInitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(@NotNull ExtractedJavaParser.VariableDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(@NotNull ExtractedJavaParser.AnnotationTypeDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ExtractedJavaParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(@NotNull ExtractedJavaParser.ResourcesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(@NotNull ExtractedJavaParser.FormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull ExtractedJavaParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(@NotNull ExtractedJavaParser.ElementValueArrayInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(@NotNull ExtractedJavaParser.AnnotationNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(@NotNull ExtractedJavaParser.EnhancedForControlContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(@NotNull ExtractedJavaParser.AnnotationMethodRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull ExtractedJavaParser.PrimaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull ExtractedJavaParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(@NotNull ExtractedJavaParser.ClassOrInterfaceModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(@NotNull ExtractedJavaParser.DefaultValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(@NotNull ExtractedJavaParser.VariableModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(@NotNull ExtractedJavaParser.ConstDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(@NotNull ExtractedJavaParser.CreatedNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(@NotNull ExtractedJavaParser.InterfaceDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(@NotNull ExtractedJavaParser.PackageDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(@NotNull ExtractedJavaParser.ConstantDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(@NotNull ExtractedJavaParser.CatchTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(@NotNull ExtractedJavaParser.TypeArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(@NotNull ExtractedJavaParser.ClassCreatorRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(@NotNull ExtractedJavaParser.ModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ExtractedJavaParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(@NotNull ExtractedJavaParser.InterfaceBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(@NotNull ExtractedJavaParser.ClassBodyDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(@NotNull ExtractedJavaParser.LastFormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(@NotNull ExtractedJavaParser.ForControlContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(@NotNull ExtractedJavaParser.TypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(@NotNull ExtractedJavaParser.LocalVariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(@NotNull ExtractedJavaParser.VariableDeclaratorIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull ExtractedJavaParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(@NotNull ExtractedJavaParser.ElementValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(@NotNull ExtractedJavaParser.ClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(@NotNull ExtractedJavaParser.TypeArgumentsOrDiamondContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(@NotNull ExtractedJavaParser.AnnotationTypeElementDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull ExtractedJavaParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(@NotNull ExtractedJavaParser.AnnotationTypeBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(@NotNull ExtractedJavaParser.QualifiedNameListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(@NotNull ExtractedJavaParser.CreatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(@NotNull ExtractedJavaParser.MemberDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull ExtractedJavaParser.MethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(@NotNull ExtractedJavaParser.AnnotationTypeElementRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(@NotNull ExtractedJavaParser.ResourceSpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(@NotNull ExtractedJavaParser.ConstructorDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(@NotNull ExtractedJavaParser.ResourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(@NotNull ExtractedJavaParser.ElementValuePairContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(@NotNull ExtractedJavaParser.MethodBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(@NotNull ExtractedJavaParser.ArrayInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(@NotNull ExtractedJavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull ExtractedJavaParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(@NotNull ExtractedJavaParser.NonWildcardTypeArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(@NotNull ExtractedJavaParser.ArrayCreatorRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(@NotNull ExtractedJavaParser.InterfaceMemberDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(@NotNull ExtractedJavaParser.GenericConstructorDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull ExtractedJavaParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(@NotNull ExtractedJavaParser.SwitchBlockStatementGroupContext ctx);
}