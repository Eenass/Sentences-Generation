// Generated from ExtractedJava.g4 by ANTLR 4.1
package testGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedJavaParser}.
 */
public interface ExtractedJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(@NotNull ExtractedJavaParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(@NotNull ExtractedJavaParser.InnerCreatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(@NotNull ExtractedJavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(@NotNull ExtractedJavaParser.GenericMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull ExtractedJavaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull ExtractedJavaParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull ExtractedJavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull ExtractedJavaParser.TypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull ExtractedJavaParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull ExtractedJavaParser.ForUpdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull ExtractedJavaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull ExtractedJavaParser.AnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(@NotNull ExtractedJavaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(@NotNull ExtractedJavaParser.EnumConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull ExtractedJavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull ExtractedJavaParser.ImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(@NotNull ExtractedJavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(@NotNull ExtractedJavaParser.AnnotationMethodOrConstantRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(@NotNull ExtractedJavaParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(@NotNull ExtractedJavaParser.EnumConstantNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(@NotNull ExtractedJavaParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(@NotNull ExtractedJavaParser.FinallyBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull ExtractedJavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull ExtractedJavaParser.VariableDeclaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(@NotNull ExtractedJavaParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(@NotNull ExtractedJavaParser.ElementValuePairsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(@NotNull ExtractedJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(@NotNull ExtractedJavaParser.InterfaceMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(@NotNull ExtractedJavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(@NotNull ExtractedJavaParser.InterfaceBodyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(@NotNull ExtractedJavaParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(@NotNull ExtractedJavaParser.EnumConstantsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull ExtractedJavaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull ExtractedJavaParser.CatchClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull ExtractedJavaParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull ExtractedJavaParser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull ExtractedJavaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull ExtractedJavaParser.EnumDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(@NotNull ExtractedJavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(@NotNull ExtractedJavaParser.ExplicitGenericInvocationSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull ExtractedJavaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull ExtractedJavaParser.TypeParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(@NotNull ExtractedJavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(@NotNull ExtractedJavaParser.EnumBodyDeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull ExtractedJavaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull ExtractedJavaParser.TypeBoundContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull ExtractedJavaParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull ExtractedJavaParser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull ExtractedJavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull ExtractedJavaParser.VariableInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ExtractedJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ExtractedJavaParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(@NotNull ExtractedJavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(@NotNull ExtractedJavaParser.GenericInterfaceMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull ExtractedJavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull ExtractedJavaParser.LocalVariableDeclarationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(@NotNull ExtractedJavaParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(@NotNull ExtractedJavaParser.SuperSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull ExtractedJavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull ExtractedJavaParser.FieldDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull ExtractedJavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull ExtractedJavaParser.FormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(@NotNull ExtractedJavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(@NotNull ExtractedJavaParser.ExplicitGenericInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull ExtractedJavaParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull ExtractedJavaParser.ParExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull ExtractedJavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull ExtractedJavaParser.SwitchLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull ExtractedJavaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull ExtractedJavaParser.TypeParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull ExtractedJavaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull ExtractedJavaParser.QualifiedNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull ExtractedJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull ExtractedJavaParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(@NotNull ExtractedJavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(@NotNull ExtractedJavaParser.AnnotationConstantRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull ExtractedJavaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull ExtractedJavaParser.ArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(@NotNull ExtractedJavaParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(@NotNull ExtractedJavaParser.ConstructorBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull ExtractedJavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull ExtractedJavaParser.FormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull ExtractedJavaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull ExtractedJavaParser.TypeArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull ExtractedJavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull ExtractedJavaParser.ForInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull ExtractedJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull ExtractedJavaParser.VariableDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(@NotNull ExtractedJavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(@NotNull ExtractedJavaParser.AnnotationTypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ExtractedJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ExtractedJavaParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(@NotNull ExtractedJavaParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(@NotNull ExtractedJavaParser.ResourcesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull ExtractedJavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull ExtractedJavaParser.FormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ExtractedJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ExtractedJavaParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull ExtractedJavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull ExtractedJavaParser.ElementValueArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(@NotNull ExtractedJavaParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(@NotNull ExtractedJavaParser.AnnotationNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull ExtractedJavaParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull ExtractedJavaParser.EnhancedForControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(@NotNull ExtractedJavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(@NotNull ExtractedJavaParser.AnnotationMethodRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull ExtractedJavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull ExtractedJavaParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull ExtractedJavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull ExtractedJavaParser.ClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(@NotNull ExtractedJavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(@NotNull ExtractedJavaParser.ClassOrInterfaceModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull ExtractedJavaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull ExtractedJavaParser.DefaultValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(@NotNull ExtractedJavaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(@NotNull ExtractedJavaParser.VariableModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(@NotNull ExtractedJavaParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(@NotNull ExtractedJavaParser.ConstDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(@NotNull ExtractedJavaParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(@NotNull ExtractedJavaParser.CreatedNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull ExtractedJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull ExtractedJavaParser.InterfaceDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull ExtractedJavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull ExtractedJavaParser.PackageDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(@NotNull ExtractedJavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(@NotNull ExtractedJavaParser.ConstantDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(@NotNull ExtractedJavaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(@NotNull ExtractedJavaParser.CatchTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull ExtractedJavaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull ExtractedJavaParser.TypeArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(@NotNull ExtractedJavaParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(@NotNull ExtractedJavaParser.ClassCreatorRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull ExtractedJavaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull ExtractedJavaParser.ModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ExtractedJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ExtractedJavaParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(@NotNull ExtractedJavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(@NotNull ExtractedJavaParser.InterfaceBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull ExtractedJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull ExtractedJavaParser.ClassBodyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(@NotNull ExtractedJavaParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(@NotNull ExtractedJavaParser.LastFormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull ExtractedJavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull ExtractedJavaParser.ForControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull ExtractedJavaParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull ExtractedJavaParser.TypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull ExtractedJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull ExtractedJavaParser.LocalVariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull ExtractedJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull ExtractedJavaParser.VariableDeclaratorIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull ExtractedJavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull ExtractedJavaParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull ExtractedJavaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull ExtractedJavaParser.ElementValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull ExtractedJavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull ExtractedJavaParser.ClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(@NotNull ExtractedJavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(@NotNull ExtractedJavaParser.TypeArgumentsOrDiamondContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(@NotNull ExtractedJavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(@NotNull ExtractedJavaParser.AnnotationTypeElementDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull ExtractedJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull ExtractedJavaParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(@NotNull ExtractedJavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(@NotNull ExtractedJavaParser.AnnotationTypeBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(@NotNull ExtractedJavaParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(@NotNull ExtractedJavaParser.QualifiedNameListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(@NotNull ExtractedJavaParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(@NotNull ExtractedJavaParser.CreatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(@NotNull ExtractedJavaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(@NotNull ExtractedJavaParser.MemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull ExtractedJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull ExtractedJavaParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(@NotNull ExtractedJavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(@NotNull ExtractedJavaParser.AnnotationTypeElementRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(@NotNull ExtractedJavaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(@NotNull ExtractedJavaParser.ResourceSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull ExtractedJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull ExtractedJavaParser.ConstructorDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull ExtractedJavaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull ExtractedJavaParser.ResourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull ExtractedJavaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull ExtractedJavaParser.ElementValuePairContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull ExtractedJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull ExtractedJavaParser.MethodBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull ExtractedJavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull ExtractedJavaParser.ArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(@NotNull ExtractedJavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(@NotNull ExtractedJavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull ExtractedJavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull ExtractedJavaParser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(@NotNull ExtractedJavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(@NotNull ExtractedJavaParser.NonWildcardTypeArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(@NotNull ExtractedJavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(@NotNull ExtractedJavaParser.ArrayCreatorRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(@NotNull ExtractedJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(@NotNull ExtractedJavaParser.InterfaceMemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(@NotNull ExtractedJavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(@NotNull ExtractedJavaParser.GenericConstructorDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ExtractedJavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ExtractedJavaParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull ExtractedJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull ExtractedJavaParser.SwitchBlockStatementGroupContext ctx);
}