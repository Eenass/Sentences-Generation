// Generated from WebIDL.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WebIDLParser}.
 */
public interface WebIDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#callbackOrInterface}.
	 * @param ctx the parse tree
	 */
	void enterCallbackOrInterface(@NotNull WebIDLParser.CallbackOrInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#callbackOrInterface}.
	 * @param ctx the parse tree
	 */
	void exitCallbackOrInterface(@NotNull WebIDLParser.CallbackOrInterfaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#partialDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartialDefinition(@NotNull WebIDLParser.PartialDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#partialDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartialDefinition(@NotNull WebIDLParser.PartialDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#serializationPatternList}.
	 * @param ctx the parse tree
	 */
	void enterSerializationPatternList(@NotNull WebIDLParser.SerializationPatternListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#serializationPatternList}.
	 * @param ctx the parse tree
	 */
	void exitSerializationPatternList(@NotNull WebIDLParser.SerializationPatternListContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#interface_}.
	 * @param ctx the parse tree
	 */
	void enterInterface_(@NotNull WebIDLParser.Interface_Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#interface_}.
	 * @param ctx the parse tree
	 */
	void exitInterface_(@NotNull WebIDLParser.Interface_Context ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers(@NotNull WebIDLParser.IdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers(@NotNull WebIDLParser.IdentifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#exceptionField}.
	 * @param ctx the parse tree
	 */
	void enterExceptionField(@NotNull WebIDLParser.ExceptionFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#exceptionField}.
	 * @param ctx the parse tree
	 */
	void exitExceptionField(@NotNull WebIDLParser.ExceptionFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeRest}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeRest(@NotNull WebIDLParser.ExtendedAttributeRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeRest}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeRest(@NotNull WebIDLParser.ExtendedAttributeRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#optionalOrRequiredArgument}.
	 * @param ctx the parse tree
	 */
	void enterOptionalOrRequiredArgument(@NotNull WebIDLParser.OptionalOrRequiredArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#optionalOrRequiredArgument}.
	 * @param ctx the parse tree
	 */
	void exitOptionalOrRequiredArgument(@NotNull WebIDLParser.OptionalOrRequiredArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#exception}.
	 * @param ctx the parse tree
	 */
	void enterException(@NotNull WebIDLParser.ExceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#exception}.
	 * @param ctx the parse tree
	 */
	void exitException(@NotNull WebIDLParser.ExceptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#const_}.
	 * @param ctx the parse tree
	 */
	void enterConst_(@NotNull WebIDLParser.Const_Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#const_}.
	 * @param ctx the parse tree
	 */
	void exitConst_(@NotNull WebIDLParser.Const_Context ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#operationOrIterator}.
	 * @param ctx the parse tree
	 */
	void enterOperationOrIterator(@NotNull WebIDLParser.OperationOrIteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#operationOrIterator}.
	 * @param ctx the parse tree
	 */
	void exitOperationOrIterator(@NotNull WebIDLParser.OperationOrIteratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#ellipsis}.
	 * @param ctx the parse tree
	 */
	void enterEllipsis(@NotNull WebIDLParser.EllipsisContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#ellipsis}.
	 * @param ctx the parse tree
	 */
	void exitEllipsis(@NotNull WebIDLParser.EllipsisContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#staticMemberRest}.
	 * @param ctx the parse tree
	 */
	void enterStaticMemberRest(@NotNull WebIDLParser.StaticMemberRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#staticMemberRest}.
	 * @param ctx the parse tree
	 */
	void exitStaticMemberRest(@NotNull WebIDLParser.StaticMemberRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull WebIDLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull WebIDLParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#specialOperation}.
	 * @param ctx the parse tree
	 */
	void enterSpecialOperation(@NotNull WebIDLParser.SpecialOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#specialOperation}.
	 * @param ctx the parse tree
	 */
	void exitSpecialOperation(@NotNull WebIDLParser.SpecialOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void enterTypeSuffix(@NotNull WebIDLParser.TypeSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void exitTypeSuffix(@NotNull WebIDLParser.TypeSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#typeSuffixStartingWithArray}.
	 * @param ctx the parse tree
	 */
	void enterTypeSuffixStartingWithArray(@NotNull WebIDLParser.TypeSuffixStartingWithArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#typeSuffixStartingWithArray}.
	 * @param ctx the parse tree
	 */
	void exitTypeSuffixStartingWithArray(@NotNull WebIDLParser.TypeSuffixStartingWithArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(@NotNull WebIDLParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(@NotNull WebIDLParser.FloatLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeTypePair}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeTypePair(@NotNull WebIDLParser.ExtendedAttributeTypePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeTypePair}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeTypePair(@NotNull WebIDLParser.ExtendedAttributeTypePairContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull WebIDLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull WebIDLParser.DefaultValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#interfaceMembers}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMembers(@NotNull WebIDLParser.InterfaceMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#interfaceMembers}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMembers(@NotNull WebIDLParser.InterfaceMembersContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull WebIDLParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull WebIDLParser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#webIDL}.
	 * @param ctx the parse tree
	 */
	void enterWebIDL(@NotNull WebIDLParser.WebIDLContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#webIDL}.
	 * @param ctx the parse tree
	 */
	void exitWebIDL(@NotNull WebIDLParser.WebIDLContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#definitions}.
	 * @param ctx the parse tree
	 */
	void enterDefinitions(@NotNull WebIDLParser.DefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#definitions}.
	 * @param ctx the parse tree
	 */
	void exitDefinitions(@NotNull WebIDLParser.DefinitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#inherit}.
	 * @param ctx the parse tree
	 */
	void enterInherit(@NotNull WebIDLParser.InheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#inherit}.
	 * @param ctx the parse tree
	 */
	void exitInherit(@NotNull WebIDLParser.InheritContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#partial}.
	 * @param ctx the parse tree
	 */
	void enterPartial(@NotNull WebIDLParser.PartialContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#partial}.
	 * @param ctx the parse tree
	 */
	void exitPartial(@NotNull WebIDLParser.PartialContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterTypedef(@NotNull WebIDLParser.TypedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitTypedef(@NotNull WebIDLParser.TypedefContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#specials}.
	 * @param ctx the parse tree
	 */
	void enterSpecials(@NotNull WebIDLParser.SpecialsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#specials}.
	 * @param ctx the parse tree
	 */
	void exitSpecials(@NotNull WebIDLParser.SpecialsContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#enumValueListComma}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueListComma(@NotNull WebIDLParser.EnumValueListCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#enumValueListComma}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueListComma(@NotNull WebIDLParser.EnumValueListCommaContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#stringifier}.
	 * @param ctx the parse tree
	 */
	void enterStringifier(@NotNull WebIDLParser.StringifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#stringifier}.
	 * @param ctx the parse tree
	 */
	void exitStringifier(@NotNull WebIDLParser.StringifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#iteratorRest}.
	 * @param ctx the parse tree
	 */
	void enterIteratorRest(@NotNull WebIDLParser.IteratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#iteratorRest}.
	 * @param ctx the parse tree
	 */
	void exitIteratorRest(@NotNull WebIDLParser.IteratorRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#dictionaryMembers}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryMembers(@NotNull WebIDLParser.DictionaryMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#dictionaryMembers}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryMembers(@NotNull WebIDLParser.DictionaryMembersContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#attributeRest}.
	 * @param ctx the parse tree
	 */
	void enterAttributeRest(@NotNull WebIDLParser.AttributeRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#attributeRest}.
	 * @param ctx the parse tree
	 */
	void exitAttributeRest(@NotNull WebIDLParser.AttributeRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#optionalLong}.
	 * @param ctx the parse tree
	 */
	void enterOptionalLong(@NotNull WebIDLParser.OptionalLongContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#optionalLong}.
	 * @param ctx the parse tree
	 */
	void exitOptionalLong(@NotNull WebIDLParser.OptionalLongContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#serializationPatternMap}.
	 * @param ctx the parse tree
	 */
	void enterSerializationPatternMap(@NotNull WebIDLParser.SerializationPatternMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#serializationPatternMap}.
	 * @param ctx the parse tree
	 */
	void exitSerializationPatternMap(@NotNull WebIDLParser.SerializationPatternMapContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributes}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributes(@NotNull WebIDLParser.ExtendedAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributes}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributes(@NotNull WebIDLParser.ExtendedAttributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#exceptionMembers}.
	 * @param ctx the parse tree
	 */
	void enterExceptionMembers(@NotNull WebIDLParser.ExceptionMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#exceptionMembers}.
	 * @param ctx the parse tree
	 */
	void exitExceptionMembers(@NotNull WebIDLParser.ExceptionMembersContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#staticMember}.
	 * @param ctx the parse tree
	 */
	void enterStaticMember(@NotNull WebIDLParser.StaticMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#staticMember}.
	 * @param ctx the parse tree
	 */
	void exitStaticMember(@NotNull WebIDLParser.StaticMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#nonAnyType}.
	 * @param ctx the parse tree
	 */
	void enterNonAnyType(@NotNull WebIDLParser.NonAnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#nonAnyType}.
	 * @param ctx the parse tree
	 */
	void exitNonAnyType(@NotNull WebIDLParser.NonAnyTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#unionType}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(@NotNull WebIDLParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#unionType}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(@NotNull WebIDLParser.UnionTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#partialDictionary}.
	 * @param ctx the parse tree
	 */
	void enterPartialDictionary(@NotNull WebIDLParser.PartialDictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#partialDictionary}.
	 * @param ctx the parse tree
	 */
	void exitPartialDictionary(@NotNull WebIDLParser.PartialDictionaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(@NotNull WebIDLParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(@NotNull WebIDLParser.OtherContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#attributeOrOperationOrIterator}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOrOperationOrIterator(@NotNull WebIDLParser.AttributeOrOperationOrIteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#attributeOrOperationOrIterator}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOrOperationOrIterator(@NotNull WebIDLParser.AttributeOrOperationOrIteratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#serializer}.
	 * @param ctx the parse tree
	 */
	void enterSerializer(@NotNull WebIDLParser.SerializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#serializer}.
	 * @param ctx the parse tree
	 */
	void exitSerializer(@NotNull WebIDLParser.SerializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#implementsStatement}.
	 * @param ctx the parse tree
	 */
	void enterImplementsStatement(@NotNull WebIDLParser.ImplementsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#implementsStatement}.
	 * @param ctx the parse tree
	 */
	void exitImplementsStatement(@NotNull WebIDLParser.ImplementsStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#constValue}.
	 * @param ctx the parse tree
	 */
	void enterConstValue(@NotNull WebIDLParser.ConstValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#constValue}.
	 * @param ctx the parse tree
	 */
	void exitConstValue(@NotNull WebIDLParser.ConstValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#floatType}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(@NotNull WebIDLParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#floatType}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(@NotNull WebIDLParser.FloatTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#callbackRest}.
	 * @param ctx the parse tree
	 */
	void enterCallbackRest(@NotNull WebIDLParser.CallbackRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#callbackRest}.
	 * @param ctx the parse tree
	 */
	void exitCallbackRest(@NotNull WebIDLParser.CallbackRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull WebIDLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull WebIDLParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#callbackRestOrInterface}.
	 * @param ctx the parse tree
	 */
	void enterCallbackRestOrInterface(@NotNull WebIDLParser.CallbackRestOrInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#callbackRestOrInterface}.
	 * @param ctx the parse tree
	 */
	void exitCallbackRestOrInterface(@NotNull WebIDLParser.CallbackRestOrInterfaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#enum_}.
	 * @param ctx the parse tree
	 */
	void enterEnum_(@NotNull WebIDLParser.Enum_Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#enum_}.
	 * @param ctx the parse tree
	 */
	void exitEnum_(@NotNull WebIDLParser.Enum_Context ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#unrestrictedFloatType}.
	 * @param ctx the parse tree
	 */
	void enterUnrestrictedFloatType(@NotNull WebIDLParser.UnrestrictedFloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#unrestrictedFloatType}.
	 * @param ctx the parse tree
	 */
	void exitUnrestrictedFloatType(@NotNull WebIDLParser.UnrestrictedFloatTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#exceptionMember}.
	 * @param ctx the parse tree
	 */
	void enterExceptionMember(@NotNull WebIDLParser.ExceptionMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#exceptionMember}.
	 * @param ctx the parse tree
	 */
	void exitExceptionMember(@NotNull WebIDLParser.ExceptionMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#partialInterface}.
	 * @param ctx the parse tree
	 */
	void enterPartialInterface(@NotNull WebIDLParser.PartialInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#partialInterface}.
	 * @param ctx the parse tree
	 */
	void exitPartialInterface(@NotNull WebIDLParser.PartialInterfaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#stringifierRest}.
	 * @param ctx the parse tree
	 */
	void enterStringifierRest(@NotNull WebIDLParser.StringifierRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#stringifierRest}.
	 * @param ctx the parse tree
	 */
	void exitStringifierRest(@NotNull WebIDLParser.StringifierRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#unsignedIntegerType}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedIntegerType(@NotNull WebIDLParser.UnsignedIntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#unsignedIntegerType}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedIntegerType(@NotNull WebIDLParser.UnsignedIntegerTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#argumentNameKeyword}.
	 * @param ctx the parse tree
	 */
	void enterArgumentNameKeyword(@NotNull WebIDLParser.ArgumentNameKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#argumentNameKeyword}.
	 * @param ctx the parse tree
	 */
	void exitArgumentNameKeyword(@NotNull WebIDLParser.ArgumentNameKeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void enterArgumentName(@NotNull WebIDLParser.ArgumentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void exitArgumentName(@NotNull WebIDLParser.ArgumentNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#optionalIteratorInterfaceOrObject}.
	 * @param ctx the parse tree
	 */
	void enterOptionalIteratorInterfaceOrObject(@NotNull WebIDLParser.OptionalIteratorInterfaceOrObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#optionalIteratorInterfaceOrObject}.
	 * @param ctx the parse tree
	 */
	void exitOptionalIteratorInterfaceOrObject(@NotNull WebIDLParser.OptionalIteratorInterfaceOrObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#operationRest}.
	 * @param ctx the parse tree
	 */
	void enterOperationRest(@NotNull WebIDLParser.OperationRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#operationRest}.
	 * @param ctx the parse tree
	 */
	void exitOperationRest(@NotNull WebIDLParser.OperationRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#otherOrComma}.
	 * @param ctx the parse tree
	 */
	void enterOtherOrComma(@NotNull WebIDLParser.OtherOrCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#otherOrComma}.
	 * @param ctx the parse tree
	 */
	void exitOtherOrComma(@NotNull WebIDLParser.OtherOrCommaContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeNoArgs}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeNoArgs(@NotNull WebIDLParser.ExtendedAttributeNoArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeNoArgs}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeNoArgs(@NotNull WebIDLParser.ExtendedAttributeNoArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#optionalIteratorInterface}.
	 * @param ctx the parse tree
	 */
	void enterOptionalIteratorInterface(@NotNull WebIDLParser.OptionalIteratorInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#optionalIteratorInterface}.
	 * @param ctx the parse tree
	 */
	void exitOptionalIteratorInterface(@NotNull WebIDLParser.OptionalIteratorInterfaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeList(@NotNull WebIDLParser.ExtendedAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeList(@NotNull WebIDLParser.ExtendedAttributeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeNamedArgList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeNamedArgList(@NotNull WebIDLParser.ExtendedAttributeNamedArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeNamedArgList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeNamedArgList(@NotNull WebIDLParser.ExtendedAttributeNamedArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#constType}.
	 * @param ctx the parse tree
	 */
	void enterConstType(@NotNull WebIDLParser.ConstTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#constType}.
	 * @param ctx the parse tree
	 */
	void exitConstType(@NotNull WebIDLParser.ConstTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 */
	void enterUnionMemberTypes(@NotNull WebIDLParser.UnionMemberTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 */
	void exitUnionMemberTypes(@NotNull WebIDLParser.UnionMemberTypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#singleType}.
	 * @param ctx the parse tree
	 */
	void enterSingleType(@NotNull WebIDLParser.SingleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#singleType}.
	 * @param ctx the parse tree
	 */
	void exitSingleType(@NotNull WebIDLParser.SingleTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#optionalIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOptionalIdentifier(@NotNull WebIDLParser.OptionalIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#optionalIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOptionalIdentifier(@NotNull WebIDLParser.OptionalIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(@NotNull WebIDLParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(@NotNull WebIDLParser.DefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#unionMemberType}.
	 * @param ctx the parse tree
	 */
	void enterUnionMemberType(@NotNull WebIDLParser.UnionMemberTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#unionMemberType}.
	 * @param ctx the parse tree
	 */
	void exitUnionMemberType(@NotNull WebIDLParser.UnionMemberTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttribute}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttribute(@NotNull WebIDLParser.ExtendedAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttribute}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttribute(@NotNull WebIDLParser.ExtendedAttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull WebIDLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull WebIDLParser.BooleanLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeArgList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeArgList(@NotNull WebIDLParser.ExtendedAttributeArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeArgList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeArgList(@NotNull WebIDLParser.ExtendedAttributeArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void enterDictionary(@NotNull WebIDLParser.DictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void exitDictionary(@NotNull WebIDLParser.DictionaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull WebIDLParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull WebIDLParser.ArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#operationOrIteratorRest}.
	 * @param ctx the parse tree
	 */
	void enterOperationOrIteratorRest(@NotNull WebIDLParser.OperationOrIteratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#operationOrIteratorRest}.
	 * @param ctx the parse tree
	 */
	void exitOperationOrIteratorRest(@NotNull WebIDLParser.OperationOrIteratorRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(@NotNull WebIDLParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(@NotNull WebIDLParser.InheritanceContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(@NotNull WebIDLParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(@NotNull WebIDLParser.ReturnTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeIdent}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeIdent(@NotNull WebIDLParser.ExtendedAttributeIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeIdent}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeIdent(@NotNull WebIDLParser.ExtendedAttributeIdentContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#serializationPattern}.
	 * @param ctx the parse tree
	 */
	void enterSerializationPattern(@NotNull WebIDLParser.SerializationPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#serializationPattern}.
	 * @param ctx the parse tree
	 */
	void exitSerializationPattern(@NotNull WebIDLParser.SerializationPatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull WebIDLParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull WebIDLParser.ArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#serializerRest}.
	 * @param ctx the parse tree
	 */
	void enterSerializerRest(@NotNull WebIDLParser.SerializerRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#serializerRest}.
	 * @param ctx the parse tree
	 */
	void exitSerializerRest(@NotNull WebIDLParser.SerializerRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#readOnly}.
	 * @param ctx the parse tree
	 */
	void enterReadOnly(@NotNull WebIDLParser.ReadOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#readOnly}.
	 * @param ctx the parse tree
	 */
	void exitReadOnly(@NotNull WebIDLParser.ReadOnlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#null_}.
	 * @param ctx the parse tree
	 */
	void enterNull_(@NotNull WebIDLParser.Null_Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#null_}.
	 * @param ctx the parse tree
	 */
	void exitNull_(@NotNull WebIDLParser.Null_Context ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeInner}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeInner(@NotNull WebIDLParser.ExtendedAttributeInnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeInner}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeInner(@NotNull WebIDLParser.ExtendedAttributeInnerContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull WebIDLParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull WebIDLParser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMember(@NotNull WebIDLParser.InterfaceMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMember(@NotNull WebIDLParser.InterfaceMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#default_}.
	 * @param ctx the parse tree
	 */
	void enterDefault_(@NotNull WebIDLParser.Default_Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#default_}.
	 * @param ctx the parse tree
	 */
	void exitDefault_(@NotNull WebIDLParser.Default_Context ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#enumValueListString}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueListString(@NotNull WebIDLParser.EnumValueListStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#enumValueListString}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueListString(@NotNull WebIDLParser.EnumValueListStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(@NotNull WebIDLParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(@NotNull WebIDLParser.SpecialContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#enumValueList}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueList(@NotNull WebIDLParser.EnumValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#enumValueList}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueList(@NotNull WebIDLParser.EnumValueListContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#dictionaryMember}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryMember(@NotNull WebIDLParser.DictionaryMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#dictionaryMember}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryMember(@NotNull WebIDLParser.DictionaryMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link WebIDLParser#integerType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(@NotNull WebIDLParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#integerType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(@NotNull WebIDLParser.IntegerTypeContext ctx);
}