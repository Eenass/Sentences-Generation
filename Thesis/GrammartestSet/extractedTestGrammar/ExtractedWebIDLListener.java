// Generated from ExtractedWebIDL.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedWebIDLParser}.
 */
public interface ExtractedWebIDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#callbackOrInterface}.
	 * @param ctx the parse tree
	 */
	void enterCallbackOrInterface(@NotNull ExtractedWebIDLParser.CallbackOrInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#callbackOrInterface}.
	 * @param ctx the parse tree
	 */
	void exitCallbackOrInterface(@NotNull ExtractedWebIDLParser.CallbackOrInterfaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#partialDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartialDefinition(@NotNull ExtractedWebIDLParser.PartialDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#partialDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartialDefinition(@NotNull ExtractedWebIDLParser.PartialDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#serializationPatternList}.
	 * @param ctx the parse tree
	 */
	void enterSerializationPatternList(@NotNull ExtractedWebIDLParser.SerializationPatternListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#serializationPatternList}.
	 * @param ctx the parse tree
	 */
	void exitSerializationPatternList(@NotNull ExtractedWebIDLParser.SerializationPatternListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#interface_}.
	 * @param ctx the parse tree
	 */
	void enterInterface_(@NotNull ExtractedWebIDLParser.Interface_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#interface_}.
	 * @param ctx the parse tree
	 */
	void exitInterface_(@NotNull ExtractedWebIDLParser.Interface_Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers(@NotNull ExtractedWebIDLParser.IdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers(@NotNull ExtractedWebIDLParser.IdentifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#exceptionField}.
	 * @param ctx the parse tree
	 */
	void enterExceptionField(@NotNull ExtractedWebIDLParser.ExceptionFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#exceptionField}.
	 * @param ctx the parse tree
	 */
	void exitExceptionField(@NotNull ExtractedWebIDLParser.ExceptionFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeRest}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeRest(@NotNull ExtractedWebIDLParser.ExtendedAttributeRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeRest}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeRest(@NotNull ExtractedWebIDLParser.ExtendedAttributeRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#optionalOrRequiredArgument}.
	 * @param ctx the parse tree
	 */
	void enterOptionalOrRequiredArgument(@NotNull ExtractedWebIDLParser.OptionalOrRequiredArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#optionalOrRequiredArgument}.
	 * @param ctx the parse tree
	 */
	void exitOptionalOrRequiredArgument(@NotNull ExtractedWebIDLParser.OptionalOrRequiredArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#exception}.
	 * @param ctx the parse tree
	 */
	void enterException(@NotNull ExtractedWebIDLParser.ExceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#exception}.
	 * @param ctx the parse tree
	 */
	void exitException(@NotNull ExtractedWebIDLParser.ExceptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#const_}.
	 * @param ctx the parse tree
	 */
	void enterConst_(@NotNull ExtractedWebIDLParser.Const_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#const_}.
	 * @param ctx the parse tree
	 */
	void exitConst_(@NotNull ExtractedWebIDLParser.Const_Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#operationOrIterator}.
	 * @param ctx the parse tree
	 */
	void enterOperationOrIterator(@NotNull ExtractedWebIDLParser.OperationOrIteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#operationOrIterator}.
	 * @param ctx the parse tree
	 */
	void exitOperationOrIterator(@NotNull ExtractedWebIDLParser.OperationOrIteratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#ellipsis}.
	 * @param ctx the parse tree
	 */
	void enterEllipsis(@NotNull ExtractedWebIDLParser.EllipsisContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#ellipsis}.
	 * @param ctx the parse tree
	 */
	void exitEllipsis(@NotNull ExtractedWebIDLParser.EllipsisContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#staticMemberRest}.
	 * @param ctx the parse tree
	 */
	void enterStaticMemberRest(@NotNull ExtractedWebIDLParser.StaticMemberRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#staticMemberRest}.
	 * @param ctx the parse tree
	 */
	void exitStaticMemberRest(@NotNull ExtractedWebIDLParser.StaticMemberRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ExtractedWebIDLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ExtractedWebIDLParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#specialOperation}.
	 * @param ctx the parse tree
	 */
	void enterSpecialOperation(@NotNull ExtractedWebIDLParser.SpecialOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#specialOperation}.
	 * @param ctx the parse tree
	 */
	void exitSpecialOperation(@NotNull ExtractedWebIDLParser.SpecialOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void enterTypeSuffix(@NotNull ExtractedWebIDLParser.TypeSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void exitTypeSuffix(@NotNull ExtractedWebIDLParser.TypeSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#typeSuffixStartingWithArray}.
	 * @param ctx the parse tree
	 */
	void enterTypeSuffixStartingWithArray(@NotNull ExtractedWebIDLParser.TypeSuffixStartingWithArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#typeSuffixStartingWithArray}.
	 * @param ctx the parse tree
	 */
	void exitTypeSuffixStartingWithArray(@NotNull ExtractedWebIDLParser.TypeSuffixStartingWithArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(@NotNull ExtractedWebIDLParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(@NotNull ExtractedWebIDLParser.FloatLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeTypePair}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeTypePair(@NotNull ExtractedWebIDLParser.ExtendedAttributeTypePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeTypePair}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeTypePair(@NotNull ExtractedWebIDLParser.ExtendedAttributeTypePairContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull ExtractedWebIDLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull ExtractedWebIDLParser.DefaultValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#interfaceMembers}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMembers(@NotNull ExtractedWebIDLParser.InterfaceMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#interfaceMembers}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMembers(@NotNull ExtractedWebIDLParser.InterfaceMembersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull ExtractedWebIDLParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull ExtractedWebIDLParser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#webIDL}.
	 * @param ctx the parse tree
	 */
	void enterWebIDL(@NotNull ExtractedWebIDLParser.WebIDLContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#webIDL}.
	 * @param ctx the parse tree
	 */
	void exitWebIDL(@NotNull ExtractedWebIDLParser.WebIDLContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#definitions}.
	 * @param ctx the parse tree
	 */
	void enterDefinitions(@NotNull ExtractedWebIDLParser.DefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#definitions}.
	 * @param ctx the parse tree
	 */
	void exitDefinitions(@NotNull ExtractedWebIDLParser.DefinitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#inherit}.
	 * @param ctx the parse tree
	 */
	void enterInherit(@NotNull ExtractedWebIDLParser.InheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#inherit}.
	 * @param ctx the parse tree
	 */
	void exitInherit(@NotNull ExtractedWebIDLParser.InheritContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#partial}.
	 * @param ctx the parse tree
	 */
	void enterPartial(@NotNull ExtractedWebIDLParser.PartialContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#partial}.
	 * @param ctx the parse tree
	 */
	void exitPartial(@NotNull ExtractedWebIDLParser.PartialContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterTypedef(@NotNull ExtractedWebIDLParser.TypedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitTypedef(@NotNull ExtractedWebIDLParser.TypedefContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#specials}.
	 * @param ctx the parse tree
	 */
	void enterSpecials(@NotNull ExtractedWebIDLParser.SpecialsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#specials}.
	 * @param ctx the parse tree
	 */
	void exitSpecials(@NotNull ExtractedWebIDLParser.SpecialsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#enumValueListComma}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueListComma(@NotNull ExtractedWebIDLParser.EnumValueListCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#enumValueListComma}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueListComma(@NotNull ExtractedWebIDLParser.EnumValueListCommaContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#stringifier}.
	 * @param ctx the parse tree
	 */
	void enterStringifier(@NotNull ExtractedWebIDLParser.StringifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#stringifier}.
	 * @param ctx the parse tree
	 */
	void exitStringifier(@NotNull ExtractedWebIDLParser.StringifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#iteratorRest}.
	 * @param ctx the parse tree
	 */
	void enterIteratorRest(@NotNull ExtractedWebIDLParser.IteratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#iteratorRest}.
	 * @param ctx the parse tree
	 */
	void exitIteratorRest(@NotNull ExtractedWebIDLParser.IteratorRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#dictionaryMembers}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryMembers(@NotNull ExtractedWebIDLParser.DictionaryMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#dictionaryMembers}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryMembers(@NotNull ExtractedWebIDLParser.DictionaryMembersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#attributeRest}.
	 * @param ctx the parse tree
	 */
	void enterAttributeRest(@NotNull ExtractedWebIDLParser.AttributeRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#attributeRest}.
	 * @param ctx the parse tree
	 */
	void exitAttributeRest(@NotNull ExtractedWebIDLParser.AttributeRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#optionalLong}.
	 * @param ctx the parse tree
	 */
	void enterOptionalLong(@NotNull ExtractedWebIDLParser.OptionalLongContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#optionalLong}.
	 * @param ctx the parse tree
	 */
	void exitOptionalLong(@NotNull ExtractedWebIDLParser.OptionalLongContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#serializationPatternMap}.
	 * @param ctx the parse tree
	 */
	void enterSerializationPatternMap(@NotNull ExtractedWebIDLParser.SerializationPatternMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#serializationPatternMap}.
	 * @param ctx the parse tree
	 */
	void exitSerializationPatternMap(@NotNull ExtractedWebIDLParser.SerializationPatternMapContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributes}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributes(@NotNull ExtractedWebIDLParser.ExtendedAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributes}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributes(@NotNull ExtractedWebIDLParser.ExtendedAttributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#exceptionMembers}.
	 * @param ctx the parse tree
	 */
	void enterExceptionMembers(@NotNull ExtractedWebIDLParser.ExceptionMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#exceptionMembers}.
	 * @param ctx the parse tree
	 */
	void exitExceptionMembers(@NotNull ExtractedWebIDLParser.ExceptionMembersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#staticMember}.
	 * @param ctx the parse tree
	 */
	void enterStaticMember(@NotNull ExtractedWebIDLParser.StaticMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#staticMember}.
	 * @param ctx the parse tree
	 */
	void exitStaticMember(@NotNull ExtractedWebIDLParser.StaticMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#nonAnyType}.
	 * @param ctx the parse tree
	 */
	void enterNonAnyType(@NotNull ExtractedWebIDLParser.NonAnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#nonAnyType}.
	 * @param ctx the parse tree
	 */
	void exitNonAnyType(@NotNull ExtractedWebIDLParser.NonAnyTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#unionType}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(@NotNull ExtractedWebIDLParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#unionType}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(@NotNull ExtractedWebIDLParser.UnionTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#partialDictionary}.
	 * @param ctx the parse tree
	 */
	void enterPartialDictionary(@NotNull ExtractedWebIDLParser.PartialDictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#partialDictionary}.
	 * @param ctx the parse tree
	 */
	void exitPartialDictionary(@NotNull ExtractedWebIDLParser.PartialDictionaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(@NotNull ExtractedWebIDLParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(@NotNull ExtractedWebIDLParser.OtherContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#attributeOrOperationOrIterator}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOrOperationOrIterator(@NotNull ExtractedWebIDLParser.AttributeOrOperationOrIteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#attributeOrOperationOrIterator}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOrOperationOrIterator(@NotNull ExtractedWebIDLParser.AttributeOrOperationOrIteratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#serializer}.
	 * @param ctx the parse tree
	 */
	void enterSerializer(@NotNull ExtractedWebIDLParser.SerializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#serializer}.
	 * @param ctx the parse tree
	 */
	void exitSerializer(@NotNull ExtractedWebIDLParser.SerializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#implementsStatement}.
	 * @param ctx the parse tree
	 */
	void enterImplementsStatement(@NotNull ExtractedWebIDLParser.ImplementsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#implementsStatement}.
	 * @param ctx the parse tree
	 */
	void exitImplementsStatement(@NotNull ExtractedWebIDLParser.ImplementsStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#constValue}.
	 * @param ctx the parse tree
	 */
	void enterConstValue(@NotNull ExtractedWebIDLParser.ConstValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#constValue}.
	 * @param ctx the parse tree
	 */
	void exitConstValue(@NotNull ExtractedWebIDLParser.ConstValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#floatType}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(@NotNull ExtractedWebIDLParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#floatType}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(@NotNull ExtractedWebIDLParser.FloatTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#callbackRest}.
	 * @param ctx the parse tree
	 */
	void enterCallbackRest(@NotNull ExtractedWebIDLParser.CallbackRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#callbackRest}.
	 * @param ctx the parse tree
	 */
	void exitCallbackRest(@NotNull ExtractedWebIDLParser.CallbackRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull ExtractedWebIDLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull ExtractedWebIDLParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#callbackRestOrInterface}.
	 * @param ctx the parse tree
	 */
	void enterCallbackRestOrInterface(@NotNull ExtractedWebIDLParser.CallbackRestOrInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#callbackRestOrInterface}.
	 * @param ctx the parse tree
	 */
	void exitCallbackRestOrInterface(@NotNull ExtractedWebIDLParser.CallbackRestOrInterfaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#enum_}.
	 * @param ctx the parse tree
	 */
	void enterEnum_(@NotNull ExtractedWebIDLParser.Enum_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#enum_}.
	 * @param ctx the parse tree
	 */
	void exitEnum_(@NotNull ExtractedWebIDLParser.Enum_Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#unrestrictedFloatType}.
	 * @param ctx the parse tree
	 */
	void enterUnrestrictedFloatType(@NotNull ExtractedWebIDLParser.UnrestrictedFloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#unrestrictedFloatType}.
	 * @param ctx the parse tree
	 */
	void exitUnrestrictedFloatType(@NotNull ExtractedWebIDLParser.UnrestrictedFloatTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#exceptionMember}.
	 * @param ctx the parse tree
	 */
	void enterExceptionMember(@NotNull ExtractedWebIDLParser.ExceptionMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#exceptionMember}.
	 * @param ctx the parse tree
	 */
	void exitExceptionMember(@NotNull ExtractedWebIDLParser.ExceptionMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#partialInterface}.
	 * @param ctx the parse tree
	 */
	void enterPartialInterface(@NotNull ExtractedWebIDLParser.PartialInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#partialInterface}.
	 * @param ctx the parse tree
	 */
	void exitPartialInterface(@NotNull ExtractedWebIDLParser.PartialInterfaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#stringifierRest}.
	 * @param ctx the parse tree
	 */
	void enterStringifierRest(@NotNull ExtractedWebIDLParser.StringifierRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#stringifierRest}.
	 * @param ctx the parse tree
	 */
	void exitStringifierRest(@NotNull ExtractedWebIDLParser.StringifierRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#unsignedIntegerType}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedIntegerType(@NotNull ExtractedWebIDLParser.UnsignedIntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#unsignedIntegerType}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedIntegerType(@NotNull ExtractedWebIDLParser.UnsignedIntegerTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#argumentNameKeyword}.
	 * @param ctx the parse tree
	 */
	void enterArgumentNameKeyword(@NotNull ExtractedWebIDLParser.ArgumentNameKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#argumentNameKeyword}.
	 * @param ctx the parse tree
	 */
	void exitArgumentNameKeyword(@NotNull ExtractedWebIDLParser.ArgumentNameKeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void enterArgumentName(@NotNull ExtractedWebIDLParser.ArgumentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void exitArgumentName(@NotNull ExtractedWebIDLParser.ArgumentNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#optionalIteratorInterfaceOrObject}.
	 * @param ctx the parse tree
	 */
	void enterOptionalIteratorInterfaceOrObject(@NotNull ExtractedWebIDLParser.OptionalIteratorInterfaceOrObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#optionalIteratorInterfaceOrObject}.
	 * @param ctx the parse tree
	 */
	void exitOptionalIteratorInterfaceOrObject(@NotNull ExtractedWebIDLParser.OptionalIteratorInterfaceOrObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#operationRest}.
	 * @param ctx the parse tree
	 */
	void enterOperationRest(@NotNull ExtractedWebIDLParser.OperationRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#operationRest}.
	 * @param ctx the parse tree
	 */
	void exitOperationRest(@NotNull ExtractedWebIDLParser.OperationRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#otherOrComma}.
	 * @param ctx the parse tree
	 */
	void enterOtherOrComma(@NotNull ExtractedWebIDLParser.OtherOrCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#otherOrComma}.
	 * @param ctx the parse tree
	 */
	void exitOtherOrComma(@NotNull ExtractedWebIDLParser.OtherOrCommaContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeNoArgs}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeNoArgs(@NotNull ExtractedWebIDLParser.ExtendedAttributeNoArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeNoArgs}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeNoArgs(@NotNull ExtractedWebIDLParser.ExtendedAttributeNoArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#optionalIteratorInterface}.
	 * @param ctx the parse tree
	 */
	void enterOptionalIteratorInterface(@NotNull ExtractedWebIDLParser.OptionalIteratorInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#optionalIteratorInterface}.
	 * @param ctx the parse tree
	 */
	void exitOptionalIteratorInterface(@NotNull ExtractedWebIDLParser.OptionalIteratorInterfaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeList(@NotNull ExtractedWebIDLParser.ExtendedAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeList(@NotNull ExtractedWebIDLParser.ExtendedAttributeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeNamedArgList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeNamedArgList(@NotNull ExtractedWebIDLParser.ExtendedAttributeNamedArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeNamedArgList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeNamedArgList(@NotNull ExtractedWebIDLParser.ExtendedAttributeNamedArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#constType}.
	 * @param ctx the parse tree
	 */
	void enterConstType(@NotNull ExtractedWebIDLParser.ConstTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#constType}.
	 * @param ctx the parse tree
	 */
	void exitConstType(@NotNull ExtractedWebIDLParser.ConstTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 */
	void enterUnionMemberTypes(@NotNull ExtractedWebIDLParser.UnionMemberTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 */
	void exitUnionMemberTypes(@NotNull ExtractedWebIDLParser.UnionMemberTypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#singleType}.
	 * @param ctx the parse tree
	 */
	void enterSingleType(@NotNull ExtractedWebIDLParser.SingleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#singleType}.
	 * @param ctx the parse tree
	 */
	void exitSingleType(@NotNull ExtractedWebIDLParser.SingleTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#optionalIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOptionalIdentifier(@NotNull ExtractedWebIDLParser.OptionalIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#optionalIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOptionalIdentifier(@NotNull ExtractedWebIDLParser.OptionalIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(@NotNull ExtractedWebIDLParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(@NotNull ExtractedWebIDLParser.DefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#unionMemberType}.
	 * @param ctx the parse tree
	 */
	void enterUnionMemberType(@NotNull ExtractedWebIDLParser.UnionMemberTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#unionMemberType}.
	 * @param ctx the parse tree
	 */
	void exitUnionMemberType(@NotNull ExtractedWebIDLParser.UnionMemberTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#extendedAttribute}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttribute(@NotNull ExtractedWebIDLParser.ExtendedAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttribute}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttribute(@NotNull ExtractedWebIDLParser.ExtendedAttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull ExtractedWebIDLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull ExtractedWebIDLParser.BooleanLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeArgList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeArgList(@NotNull ExtractedWebIDLParser.ExtendedAttributeArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeArgList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeArgList(@NotNull ExtractedWebIDLParser.ExtendedAttributeArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void enterDictionary(@NotNull ExtractedWebIDLParser.DictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void exitDictionary(@NotNull ExtractedWebIDLParser.DictionaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull ExtractedWebIDLParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull ExtractedWebIDLParser.ArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#operationOrIteratorRest}.
	 * @param ctx the parse tree
	 */
	void enterOperationOrIteratorRest(@NotNull ExtractedWebIDLParser.OperationOrIteratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#operationOrIteratorRest}.
	 * @param ctx the parse tree
	 */
	void exitOperationOrIteratorRest(@NotNull ExtractedWebIDLParser.OperationOrIteratorRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(@NotNull ExtractedWebIDLParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(@NotNull ExtractedWebIDLParser.InheritanceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(@NotNull ExtractedWebIDLParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(@NotNull ExtractedWebIDLParser.ReturnTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeIdent}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeIdent(@NotNull ExtractedWebIDLParser.ExtendedAttributeIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeIdent}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeIdent(@NotNull ExtractedWebIDLParser.ExtendedAttributeIdentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#serializationPattern}.
	 * @param ctx the parse tree
	 */
	void enterSerializationPattern(@NotNull ExtractedWebIDLParser.SerializationPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#serializationPattern}.
	 * @param ctx the parse tree
	 */
	void exitSerializationPattern(@NotNull ExtractedWebIDLParser.SerializationPatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull ExtractedWebIDLParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull ExtractedWebIDLParser.ArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#serializerRest}.
	 * @param ctx the parse tree
	 */
	void enterSerializerRest(@NotNull ExtractedWebIDLParser.SerializerRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#serializerRest}.
	 * @param ctx the parse tree
	 */
	void exitSerializerRest(@NotNull ExtractedWebIDLParser.SerializerRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#readOnly}.
	 * @param ctx the parse tree
	 */
	void enterReadOnly(@NotNull ExtractedWebIDLParser.ReadOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#readOnly}.
	 * @param ctx the parse tree
	 */
	void exitReadOnly(@NotNull ExtractedWebIDLParser.ReadOnlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#null_}.
	 * @param ctx the parse tree
	 */
	void enterNull_(@NotNull ExtractedWebIDLParser.Null_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#null_}.
	 * @param ctx the parse tree
	 */
	void exitNull_(@NotNull ExtractedWebIDLParser.Null_Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeInner}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeInner(@NotNull ExtractedWebIDLParser.ExtendedAttributeInnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#extendedAttributeInner}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeInner(@NotNull ExtractedWebIDLParser.ExtendedAttributeInnerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull ExtractedWebIDLParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull ExtractedWebIDLParser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMember(@NotNull ExtractedWebIDLParser.InterfaceMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMember(@NotNull ExtractedWebIDLParser.InterfaceMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#default_}.
	 * @param ctx the parse tree
	 */
	void enterDefault_(@NotNull ExtractedWebIDLParser.Default_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#default_}.
	 * @param ctx the parse tree
	 */
	void exitDefault_(@NotNull ExtractedWebIDLParser.Default_Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#enumValueListString}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueListString(@NotNull ExtractedWebIDLParser.EnumValueListStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#enumValueListString}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueListString(@NotNull ExtractedWebIDLParser.EnumValueListStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(@NotNull ExtractedWebIDLParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(@NotNull ExtractedWebIDLParser.SpecialContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#enumValueList}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueList(@NotNull ExtractedWebIDLParser.EnumValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#enumValueList}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueList(@NotNull ExtractedWebIDLParser.EnumValueListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#dictionaryMember}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryMember(@NotNull ExtractedWebIDLParser.DictionaryMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#dictionaryMember}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryMember(@NotNull ExtractedWebIDLParser.DictionaryMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedWebIDLParser#integerType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(@NotNull ExtractedWebIDLParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedWebIDLParser#integerType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(@NotNull ExtractedWebIDLParser.IntegerTypeContext ctx);
}