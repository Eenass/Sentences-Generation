// Generated from WebIDL.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WebIDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WebIDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#callbackOrInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallbackOrInterface(@NotNull WebIDLParser.CallbackOrInterfaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#partialDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialDefinition(@NotNull WebIDLParser.PartialDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#serializationPatternList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializationPatternList(@NotNull WebIDLParser.SerializationPatternListContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#interface_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_(@NotNull WebIDLParser.Interface_Context ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers(@NotNull WebIDLParser.IdentifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#exceptionField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionField(@NotNull WebIDLParser.ExceptionFieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeRest(@NotNull WebIDLParser.ExtendedAttributeRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#optionalOrRequiredArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalOrRequiredArgument(@NotNull WebIDLParser.OptionalOrRequiredArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#exception}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException(@NotNull WebIDLParser.ExceptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#const_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_(@NotNull WebIDLParser.Const_Context ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#operationOrIterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationOrIterator(@NotNull WebIDLParser.OperationOrIteratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#ellipsis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEllipsis(@NotNull WebIDLParser.EllipsisContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#staticMemberRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticMemberRest(@NotNull WebIDLParser.StaticMemberRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull WebIDLParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#specialOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialOperation(@NotNull WebIDLParser.SpecialOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#typeSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSuffix(@NotNull WebIDLParser.TypeSuffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#typeSuffixStartingWithArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSuffixStartingWithArray(@NotNull WebIDLParser.TypeSuffixStartingWithArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(@NotNull WebIDLParser.FloatLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeTypePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeTypePair(@NotNull WebIDLParser.ExtendedAttributeTypePairContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(@NotNull WebIDLParser.DefaultValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#interfaceMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMembers(@NotNull WebIDLParser.InterfaceMembersContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull WebIDLParser.ArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#webIDL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWebIDL(@NotNull WebIDLParser.WebIDLContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#definitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitions(@NotNull WebIDLParser.DefinitionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#inherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInherit(@NotNull WebIDLParser.InheritContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#partial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartial(@NotNull WebIDLParser.PartialContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#typedef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef(@NotNull WebIDLParser.TypedefContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#specials}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecials(@NotNull WebIDLParser.SpecialsContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#enumValueListComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValueListComma(@NotNull WebIDLParser.EnumValueListCommaContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#stringifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringifier(@NotNull WebIDLParser.StringifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#iteratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteratorRest(@NotNull WebIDLParser.IteratorRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#dictionaryMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryMembers(@NotNull WebIDLParser.DictionaryMembersContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#attributeRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeRest(@NotNull WebIDLParser.AttributeRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#optionalLong}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalLong(@NotNull WebIDLParser.OptionalLongContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#serializationPatternMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializationPatternMap(@NotNull WebIDLParser.SerializationPatternMapContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributes(@NotNull WebIDLParser.ExtendedAttributesContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#exceptionMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionMembers(@NotNull WebIDLParser.ExceptionMembersContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#staticMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticMember(@NotNull WebIDLParser.StaticMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#nonAnyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonAnyType(@NotNull WebIDLParser.NonAnyTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#unionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionType(@NotNull WebIDLParser.UnionTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#partialDictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialDictionary(@NotNull WebIDLParser.PartialDictionaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther(@NotNull WebIDLParser.OtherContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#attributeOrOperationOrIterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeOrOperationOrIterator(@NotNull WebIDLParser.AttributeOrOperationOrIteratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#serializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializer(@NotNull WebIDLParser.SerializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#implementsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsStatement(@NotNull WebIDLParser.ImplementsStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#constValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstValue(@NotNull WebIDLParser.ConstValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#floatType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(@NotNull WebIDLParser.FloatTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#callbackRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallbackRest(@NotNull WebIDLParser.CallbackRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull WebIDLParser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#callbackRestOrInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallbackRestOrInterface(@NotNull WebIDLParser.CallbackRestOrInterfaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#enum_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_(@NotNull WebIDLParser.Enum_Context ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#unrestrictedFloatType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnrestrictedFloatType(@NotNull WebIDLParser.UnrestrictedFloatTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#exceptionMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionMember(@NotNull WebIDLParser.ExceptionMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#partialInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialInterface(@NotNull WebIDLParser.PartialInterfaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#stringifierRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringifierRest(@NotNull WebIDLParser.StringifierRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#unsignedIntegerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedIntegerType(@NotNull WebIDLParser.UnsignedIntegerTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#argumentNameKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentNameKeyword(@NotNull WebIDLParser.ArgumentNameKeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#argumentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentName(@NotNull WebIDLParser.ArgumentNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#optionalIteratorInterfaceOrObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalIteratorInterfaceOrObject(@NotNull WebIDLParser.OptionalIteratorInterfaceOrObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#operationRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationRest(@NotNull WebIDLParser.OperationRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#otherOrComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherOrComma(@NotNull WebIDLParser.OtherOrCommaContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeNoArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeNoArgs(@NotNull WebIDLParser.ExtendedAttributeNoArgsContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#optionalIteratorInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalIteratorInterface(@NotNull WebIDLParser.OptionalIteratorInterfaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeList(@NotNull WebIDLParser.ExtendedAttributeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeNamedArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeNamedArgList(@NotNull WebIDLParser.ExtendedAttributeNamedArgListContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#constType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstType(@NotNull WebIDLParser.ConstTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionMemberTypes(@NotNull WebIDLParser.UnionMemberTypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#singleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleType(@NotNull WebIDLParser.SingleTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#optionalIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalIdentifier(@NotNull WebIDLParser.OptionalIdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(@NotNull WebIDLParser.DefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#unionMemberType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionMemberType(@NotNull WebIDLParser.UnionMemberTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttribute(@NotNull WebIDLParser.ExtendedAttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull WebIDLParser.BooleanLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeArgList(@NotNull WebIDLParser.ExtendedAttributeArgListContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#dictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary(@NotNull WebIDLParser.DictionaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull WebIDLParser.ArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#operationOrIteratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationOrIteratorRest(@NotNull WebIDLParser.OperationOrIteratorRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritance(@NotNull WebIDLParser.InheritanceContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(@NotNull WebIDLParser.ReturnTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeIdent(@NotNull WebIDLParser.ExtendedAttributeIdentContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#serializationPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializationPattern(@NotNull WebIDLParser.SerializationPatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull WebIDLParser.ArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#serializerRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializerRest(@NotNull WebIDLParser.SerializerRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#readOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadOnly(@NotNull WebIDLParser.ReadOnlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#null_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_(@NotNull WebIDLParser.Null_Context ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeInner(@NotNull WebIDLParser.ExtendedAttributeInnerContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull WebIDLParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#interfaceMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMember(@NotNull WebIDLParser.InterfaceMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#default_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_(@NotNull WebIDLParser.Default_Context ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#enumValueListString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValueListString(@NotNull WebIDLParser.EnumValueListStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(@NotNull WebIDLParser.SpecialContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#enumValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValueList(@NotNull WebIDLParser.EnumValueListContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#dictionaryMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryMember(@NotNull WebIDLParser.DictionaryMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link WebIDLParser#integerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(@NotNull WebIDLParser.IntegerTypeContext ctx);
}