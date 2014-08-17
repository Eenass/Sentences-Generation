// Generated from ExtractedSmalltalk.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedSmalltalkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedSmalltalkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ExtractedSmalltalkParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#literalArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralArray(@NotNull ExtractedSmalltalkParser.LiteralArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull ExtractedSmalltalkParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ExtractedSmalltalkParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#stInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStInteger(@NotNull ExtractedSmalltalkParser.StIntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#runtimeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuntimeLiteral(@NotNull ExtractedSmalltalkParser.RuntimeLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#bareLiteralArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBareLiteralArray(@NotNull ExtractedSmalltalkParser.BareLiteralArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#temps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemps(@NotNull ExtractedSmalltalkParser.TempsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#hex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(@NotNull ExtractedSmalltalkParser.HexContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#unarySend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarySend(@NotNull ExtractedSmalltalkParser.UnarySendContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#unarySelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarySelector(@NotNull ExtractedSmalltalkParser.UnarySelectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#numberExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExp(@NotNull ExtractedSmalltalkParser.NumberExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull ExtractedSmalltalkParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#charConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharConstant(@NotNull ExtractedSmalltalkParser.CharConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#keywordSend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordSend(@NotNull ExtractedSmalltalkParser.KeywordSendContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#subexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubexpression(@NotNull ExtractedSmalltalkParser.SubexpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#binaryTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryTail(@NotNull ExtractedSmalltalkParser.BinaryTailContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#unaryTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryTail(@NotNull ExtractedSmalltalkParser.UnaryTailContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#binarySend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinarySend(@NotNull ExtractedSmalltalkParser.BinarySendContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(@NotNull ExtractedSmalltalkParser.PrimitiveContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#bareSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBareSymbol(@NotNull ExtractedSmalltalkParser.BareSymbolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#keywordPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordPair(@NotNull ExtractedSmalltalkParser.KeywordPairContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#keywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywords(@NotNull ExtractedSmalltalkParser.KeywordsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(@NotNull ExtractedSmalltalkParser.SymbolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#literalArrayRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralArrayRest(@NotNull ExtractedSmalltalkParser.LiteralArrayRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(@NotNull ExtractedSmalltalkParser.AnswerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#pseudoVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoVariable(@NotNull ExtractedSmalltalkParser.PseudoVariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull ExtractedSmalltalkParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#parsetimeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParsetimeLiteral(@NotNull ExtractedSmalltalkParser.ParsetimeLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWs(@NotNull ExtractedSmalltalkParser.WsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(@NotNull ExtractedSmalltalkParser.ScriptContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(@NotNull ExtractedSmalltalkParser.OperandContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#binaryMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMessage(@NotNull ExtractedSmalltalkParser.BinaryMessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(@NotNull ExtractedSmalltalkParser.ReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#dynamicArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicArray(@NotNull ExtractedSmalltalkParser.DynamicArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(@NotNull ExtractedSmalltalkParser.ExpressionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#keywordMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordMessage(@NotNull ExtractedSmalltalkParser.KeywordMessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(@NotNull ExtractedSmalltalkParser.MessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull ExtractedSmalltalkParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#cascade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascade(@NotNull ExtractedSmalltalkParser.CascadeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(@NotNull ExtractedSmalltalkParser.SequenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull ExtractedSmalltalkParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#dynamicDictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicDictionary(@NotNull ExtractedSmalltalkParser.DynamicDictionaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#unaryMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMessage(@NotNull ExtractedSmalltalkParser.UnaryMessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull ExtractedSmalltalkParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#stFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStFloat(@NotNull ExtractedSmalltalkParser.StFloatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull ExtractedSmalltalkParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedSmalltalkParser#blockParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockParamList(@NotNull ExtractedSmalltalkParser.BlockParamListContext ctx);
}