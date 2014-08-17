// Generated from ExtractedSmalltalk.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedSmalltalkParser}.
 */
public interface ExtractedSmalltalkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ExtractedSmalltalkParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ExtractedSmalltalkParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#literalArray}.
	 * @param ctx the parse tree
	 */
	void enterLiteralArray(@NotNull ExtractedSmalltalkParser.LiteralArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#literalArray}.
	 * @param ctx the parse tree
	 */
	void exitLiteralArray(@NotNull ExtractedSmalltalkParser.LiteralArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull ExtractedSmalltalkParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull ExtractedSmalltalkParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ExtractedSmalltalkParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ExtractedSmalltalkParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#stInteger}.
	 * @param ctx the parse tree
	 */
	void enterStInteger(@NotNull ExtractedSmalltalkParser.StIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#stInteger}.
	 * @param ctx the parse tree
	 */
	void exitStInteger(@NotNull ExtractedSmalltalkParser.StIntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#runtimeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRuntimeLiteral(@NotNull ExtractedSmalltalkParser.RuntimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#runtimeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRuntimeLiteral(@NotNull ExtractedSmalltalkParser.RuntimeLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#bareLiteralArray}.
	 * @param ctx the parse tree
	 */
	void enterBareLiteralArray(@NotNull ExtractedSmalltalkParser.BareLiteralArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#bareLiteralArray}.
	 * @param ctx the parse tree
	 */
	void exitBareLiteralArray(@NotNull ExtractedSmalltalkParser.BareLiteralArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#temps}.
	 * @param ctx the parse tree
	 */
	void enterTemps(@NotNull ExtractedSmalltalkParser.TempsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#temps}.
	 * @param ctx the parse tree
	 */
	void exitTemps(@NotNull ExtractedSmalltalkParser.TempsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(@NotNull ExtractedSmalltalkParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(@NotNull ExtractedSmalltalkParser.HexContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#unarySend}.
	 * @param ctx the parse tree
	 */
	void enterUnarySend(@NotNull ExtractedSmalltalkParser.UnarySendContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#unarySend}.
	 * @param ctx the parse tree
	 */
	void exitUnarySend(@NotNull ExtractedSmalltalkParser.UnarySendContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#unarySelector}.
	 * @param ctx the parse tree
	 */
	void enterUnarySelector(@NotNull ExtractedSmalltalkParser.UnarySelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#unarySelector}.
	 * @param ctx the parse tree
	 */
	void exitUnarySelector(@NotNull ExtractedSmalltalkParser.UnarySelectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#numberExp}.
	 * @param ctx the parse tree
	 */
	void enterNumberExp(@NotNull ExtractedSmalltalkParser.NumberExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#numberExp}.
	 * @param ctx the parse tree
	 */
	void exitNumberExp(@NotNull ExtractedSmalltalkParser.NumberExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull ExtractedSmalltalkParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull ExtractedSmalltalkParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#charConstant}.
	 * @param ctx the parse tree
	 */
	void enterCharConstant(@NotNull ExtractedSmalltalkParser.CharConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#charConstant}.
	 * @param ctx the parse tree
	 */
	void exitCharConstant(@NotNull ExtractedSmalltalkParser.CharConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#keywordSend}.
	 * @param ctx the parse tree
	 */
	void enterKeywordSend(@NotNull ExtractedSmalltalkParser.KeywordSendContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#keywordSend}.
	 * @param ctx the parse tree
	 */
	void exitKeywordSend(@NotNull ExtractedSmalltalkParser.KeywordSendContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void enterSubexpression(@NotNull ExtractedSmalltalkParser.SubexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void exitSubexpression(@NotNull ExtractedSmalltalkParser.SubexpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#binaryTail}.
	 * @param ctx the parse tree
	 */
	void enterBinaryTail(@NotNull ExtractedSmalltalkParser.BinaryTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#binaryTail}.
	 * @param ctx the parse tree
	 */
	void exitBinaryTail(@NotNull ExtractedSmalltalkParser.BinaryTailContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#unaryTail}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTail(@NotNull ExtractedSmalltalkParser.UnaryTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#unaryTail}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTail(@NotNull ExtractedSmalltalkParser.UnaryTailContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#binarySend}.
	 * @param ctx the parse tree
	 */
	void enterBinarySend(@NotNull ExtractedSmalltalkParser.BinarySendContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#binarySend}.
	 * @param ctx the parse tree
	 */
	void exitBinarySend(@NotNull ExtractedSmalltalkParser.BinarySendContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(@NotNull ExtractedSmalltalkParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(@NotNull ExtractedSmalltalkParser.PrimitiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#bareSymbol}.
	 * @param ctx the parse tree
	 */
	void enterBareSymbol(@NotNull ExtractedSmalltalkParser.BareSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#bareSymbol}.
	 * @param ctx the parse tree
	 */
	void exitBareSymbol(@NotNull ExtractedSmalltalkParser.BareSymbolContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#keywordPair}.
	 * @param ctx the parse tree
	 */
	void enterKeywordPair(@NotNull ExtractedSmalltalkParser.KeywordPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#keywordPair}.
	 * @param ctx the parse tree
	 */
	void exitKeywordPair(@NotNull ExtractedSmalltalkParser.KeywordPairContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#keywords}.
	 * @param ctx the parse tree
	 */
	void enterKeywords(@NotNull ExtractedSmalltalkParser.KeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#keywords}.
	 * @param ctx the parse tree
	 */
	void exitKeywords(@NotNull ExtractedSmalltalkParser.KeywordsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(@NotNull ExtractedSmalltalkParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(@NotNull ExtractedSmalltalkParser.SymbolContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#literalArrayRest}.
	 * @param ctx the parse tree
	 */
	void enterLiteralArrayRest(@NotNull ExtractedSmalltalkParser.LiteralArrayRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#literalArrayRest}.
	 * @param ctx the parse tree
	 */
	void exitLiteralArrayRest(@NotNull ExtractedSmalltalkParser.LiteralArrayRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(@NotNull ExtractedSmalltalkParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(@NotNull ExtractedSmalltalkParser.AnswerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#pseudoVariable}.
	 * @param ctx the parse tree
	 */
	void enterPseudoVariable(@NotNull ExtractedSmalltalkParser.PseudoVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#pseudoVariable}.
	 * @param ctx the parse tree
	 */
	void exitPseudoVariable(@NotNull ExtractedSmalltalkParser.PseudoVariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull ExtractedSmalltalkParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull ExtractedSmalltalkParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#parsetimeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterParsetimeLiteral(@NotNull ExtractedSmalltalkParser.ParsetimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#parsetimeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitParsetimeLiteral(@NotNull ExtractedSmalltalkParser.ParsetimeLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(@NotNull ExtractedSmalltalkParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(@NotNull ExtractedSmalltalkParser.WsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(@NotNull ExtractedSmalltalkParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(@NotNull ExtractedSmalltalkParser.ScriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(@NotNull ExtractedSmalltalkParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(@NotNull ExtractedSmalltalkParser.OperandContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#binaryMessage}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMessage(@NotNull ExtractedSmalltalkParser.BinaryMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#binaryMessage}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMessage(@NotNull ExtractedSmalltalkParser.BinaryMessageContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(@NotNull ExtractedSmalltalkParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(@NotNull ExtractedSmalltalkParser.ReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#dynamicArray}.
	 * @param ctx the parse tree
	 */
	void enterDynamicArray(@NotNull ExtractedSmalltalkParser.DynamicArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#dynamicArray}.
	 * @param ctx the parse tree
	 */
	void exitDynamicArray(@NotNull ExtractedSmalltalkParser.DynamicArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(@NotNull ExtractedSmalltalkParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(@NotNull ExtractedSmalltalkParser.ExpressionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#keywordMessage}.
	 * @param ctx the parse tree
	 */
	void enterKeywordMessage(@NotNull ExtractedSmalltalkParser.KeywordMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#keywordMessage}.
	 * @param ctx the parse tree
	 */
	void exitKeywordMessage(@NotNull ExtractedSmalltalkParser.KeywordMessageContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(@NotNull ExtractedSmalltalkParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(@NotNull ExtractedSmalltalkParser.MessageContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull ExtractedSmalltalkParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull ExtractedSmalltalkParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#cascade}.
	 * @param ctx the parse tree
	 */
	void enterCascade(@NotNull ExtractedSmalltalkParser.CascadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#cascade}.
	 * @param ctx the parse tree
	 */
	void exitCascade(@NotNull ExtractedSmalltalkParser.CascadeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(@NotNull ExtractedSmalltalkParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(@NotNull ExtractedSmalltalkParser.SequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull ExtractedSmalltalkParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull ExtractedSmalltalkParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#dynamicDictionary}.
	 * @param ctx the parse tree
	 */
	void enterDynamicDictionary(@NotNull ExtractedSmalltalkParser.DynamicDictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#dynamicDictionary}.
	 * @param ctx the parse tree
	 */
	void exitDynamicDictionary(@NotNull ExtractedSmalltalkParser.DynamicDictionaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#unaryMessage}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMessage(@NotNull ExtractedSmalltalkParser.UnaryMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#unaryMessage}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMessage(@NotNull ExtractedSmalltalkParser.UnaryMessageContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ExtractedSmalltalkParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ExtractedSmalltalkParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#stFloat}.
	 * @param ctx the parse tree
	 */
	void enterStFloat(@NotNull ExtractedSmalltalkParser.StFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#stFloat}.
	 * @param ctx the parse tree
	 */
	void exitStFloat(@NotNull ExtractedSmalltalkParser.StFloatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ExtractedSmalltalkParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ExtractedSmalltalkParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedSmalltalkParser#blockParamList}.
	 * @param ctx the parse tree
	 */
	void enterBlockParamList(@NotNull ExtractedSmalltalkParser.BlockParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedSmalltalkParser#blockParamList}.
	 * @param ctx the parse tree
	 */
	void exitBlockParamList(@NotNull ExtractedSmalltalkParser.BlockParamListContext ctx);
}