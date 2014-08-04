// Generated from ExtractedWebIDL.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedWebIDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedWebIDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#callbackOrInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallbackOrInterface(@NotNull ExtractedWebIDLParser.CallbackOrInterfaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#partialDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialDefinition(@NotNull ExtractedWebIDLParser.PartialDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#serializationPatternList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializationPatternList(@NotNull ExtractedWebIDLParser.SerializationPatternListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#interface_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_(@NotNull ExtractedWebIDLParser.Interface_Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers(@NotNull ExtractedWebIDLParser.IdentifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#exceptionField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionField(@NotNull ExtractedWebIDLParser.ExceptionFieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeRest(@NotNull ExtractedWebIDLParser.ExtendedAttributeRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#optionalOrRequiredArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalOrRequiredArgument(@NotNull ExtractedWebIDLParser.OptionalOrRequiredArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#exception}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException(@NotNull ExtractedWebIDLParser.ExceptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#const_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_(@NotNull ExtractedWebIDLParser.Const_Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#operationOrIterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationOrIterator(@NotNull ExtractedWebIDLParser.OperationOrIteratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#ellipsis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEllipsis(@NotNull ExtractedWebIDLParser.EllipsisContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#staticMemberRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticMemberRest(@NotNull ExtractedWebIDLParser.StaticMemberRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull ExtractedWebIDLParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#specialOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialOperation(@NotNull ExtractedWebIDLParser.SpecialOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#typeSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSuffix(@NotNull ExtractedWebIDLParser.TypeSuffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#typeSuffixStartingWithArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSuffixStartingWithArray(@NotNull ExtractedWebIDLParser.TypeSuffixStartingWithArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(@NotNull ExtractedWebIDLParser.FloatLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeTypePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeTypePair(@NotNull ExtractedWebIDLParser.ExtendedAttributeTypePairContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(@NotNull ExtractedWebIDLParser.DefaultValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#interfaceMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMembers(@NotNull ExtractedWebIDLParser.InterfaceMembersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull ExtractedWebIDLParser.ArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#webIDL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWebIDL(@NotNull ExtractedWebIDLParser.WebIDLContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#definitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitions(@NotNull ExtractedWebIDLParser.DefinitionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#inherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInherit(@NotNull ExtractedWebIDLParser.InheritContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#partial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartial(@NotNull ExtractedWebIDLParser.PartialContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#typedef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef(@NotNull ExtractedWebIDLParser.TypedefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#specials}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecials(@NotNull ExtractedWebIDLParser.SpecialsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#enumValueListComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValueListComma(@NotNull ExtractedWebIDLParser.EnumValueListCommaContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#stringifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringifier(@NotNull ExtractedWebIDLParser.StringifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#iteratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteratorRest(@NotNull ExtractedWebIDLParser.IteratorRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#dictionaryMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryMembers(@NotNull ExtractedWebIDLParser.DictionaryMembersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#attributeRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeRest(@NotNull ExtractedWebIDLParser.AttributeRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#optionalLong}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalLong(@NotNull ExtractedWebIDLParser.OptionalLongContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#serializationPatternMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializationPatternMap(@NotNull ExtractedWebIDLParser.SerializationPatternMapContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributes(@NotNull ExtractedWebIDLParser.ExtendedAttributesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#exceptionMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionMembers(@NotNull ExtractedWebIDLParser.ExceptionMembersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#staticMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticMember(@NotNull ExtractedWebIDLParser.StaticMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#nonAnyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonAnyType(@NotNull ExtractedWebIDLParser.NonAnyTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#unionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionType(@NotNull ExtractedWebIDLParser.UnionTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#partialDictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialDictionary(@NotNull ExtractedWebIDLParser.PartialDictionaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther(@NotNull ExtractedWebIDLParser.OtherContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#attributeOrOperationOrIterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeOrOperationOrIterator(@NotNull ExtractedWebIDLParser.AttributeOrOperationOrIteratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#serializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializer(@NotNull ExtractedWebIDLParser.SerializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#implementsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsStatement(@NotNull ExtractedWebIDLParser.ImplementsStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#constValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstValue(@NotNull ExtractedWebIDLParser.ConstValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#floatType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(@NotNull ExtractedWebIDLParser.FloatTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#callbackRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallbackRest(@NotNull ExtractedWebIDLParser.CallbackRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull ExtractedWebIDLParser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#callbackRestOrInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallbackRestOrInterface(@NotNull ExtractedWebIDLParser.CallbackRestOrInterfaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#enum_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_(@NotNull ExtractedWebIDLParser.Enum_Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#unrestrictedFloatType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnrestrictedFloatType(@NotNull ExtractedWebIDLParser.UnrestrictedFloatTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#exceptionMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionMember(@NotNull ExtractedWebIDLParser.ExceptionMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#partialInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialInterface(@NotNull ExtractedWebIDLParser.PartialInterfaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#stringifierRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringifierRest(@NotNull ExtractedWebIDLParser.StringifierRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#unsignedIntegerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedIntegerType(@NotNull ExtractedWebIDLParser.UnsignedIntegerTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#argumentNameKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentNameKeyword(@NotNull ExtractedWebIDLParser.ArgumentNameKeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#argumentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentName(@NotNull ExtractedWebIDLParser.ArgumentNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#optionalIteratorInterfaceOrObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalIteratorInterfaceOrObject(@NotNull ExtractedWebIDLParser.OptionalIteratorInterfaceOrObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#operationRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationRest(@NotNull ExtractedWebIDLParser.OperationRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#otherOrComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherOrComma(@NotNull ExtractedWebIDLParser.OtherOrCommaContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeNoArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeNoArgs(@NotNull ExtractedWebIDLParser.ExtendedAttributeNoArgsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#optionalIteratorInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalIteratorInterface(@NotNull ExtractedWebIDLParser.OptionalIteratorInterfaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeList(@NotNull ExtractedWebIDLParser.ExtendedAttributeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeNamedArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeNamedArgList(@NotNull ExtractedWebIDLParser.ExtendedAttributeNamedArgListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#constType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstType(@NotNull ExtractedWebIDLParser.ConstTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionMemberTypes(@NotNull ExtractedWebIDLParser.UnionMemberTypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#singleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleType(@NotNull ExtractedWebIDLParser.SingleTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#optionalIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalIdentifier(@NotNull ExtractedWebIDLParser.OptionalIdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(@NotNull ExtractedWebIDLParser.DefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#unionMemberType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionMemberType(@NotNull ExtractedWebIDLParser.UnionMemberTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttribute(@NotNull ExtractedWebIDLParser.ExtendedAttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull ExtractedWebIDLParser.BooleanLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeArgList(@NotNull ExtractedWebIDLParser.ExtendedAttributeArgListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#dictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary(@NotNull ExtractedWebIDLParser.DictionaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull ExtractedWebIDLParser.ArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#operationOrIteratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationOrIteratorRest(@NotNull ExtractedWebIDLParser.OperationOrIteratorRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritance(@NotNull ExtractedWebIDLParser.InheritanceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(@NotNull ExtractedWebIDLParser.ReturnTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeIdent(@NotNull ExtractedWebIDLParser.ExtendedAttributeIdentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#serializationPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializationPattern(@NotNull ExtractedWebIDLParser.SerializationPatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull ExtractedWebIDLParser.ArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#serializerRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializerRest(@NotNull ExtractedWebIDLParser.SerializerRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#readOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadOnly(@NotNull ExtractedWebIDLParser.ReadOnlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#null_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_(@NotNull ExtractedWebIDLParser.Null_Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeInner(@NotNull ExtractedWebIDLParser.ExtendedAttributeInnerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull ExtractedWebIDLParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#interfaceMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMember(@NotNull ExtractedWebIDLParser.InterfaceMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#default_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_(@NotNull ExtractedWebIDLParser.Default_Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#enumValueListString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValueListString(@NotNull ExtractedWebIDLParser.EnumValueListStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(@NotNull ExtractedWebIDLParser.SpecialContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#enumValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValueList(@NotNull ExtractedWebIDLParser.EnumValueListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#dictionaryMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryMember(@NotNull ExtractedWebIDLParser.DictionaryMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedWebIDLParser#integerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(@NotNull ExtractedWebIDLParser.IntegerTypeContext ctx);
}