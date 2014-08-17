// Generated from PCRE.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PCREParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PCREVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PCREParser#shared_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShared_literal(@NotNull PCREParser.Shared_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull PCREParser.AtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#option_flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_flags(@NotNull PCREParser.Option_flagsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#cc_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCc_atom(@NotNull PCREParser.Cc_atomContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference(@NotNull PCREParser.BackreferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#quantifier_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_type(@NotNull PCREParser.Quantifier_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull PCREParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#option_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_flag(@NotNull PCREParser.Option_flagContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#alternation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternation(@NotNull PCREParser.AlternationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#alpha_nums}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha_nums(@NotNull PCREParser.Alpha_numsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(@NotNull PCREParser.QuantifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_capture(@NotNull PCREParser.Non_captureContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#look_around}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook_around(@NotNull PCREParser.Look_aroundContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#backtrack_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBacktrack_control(@NotNull PCREParser.Backtrack_controlContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull PCREParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#cc_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCc_literal(@NotNull PCREParser.Cc_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture(@NotNull PCREParser.CaptureContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#octal_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_char(@NotNull PCREParser.Octal_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#subroutine_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_reference(@NotNull PCREParser.Subroutine_referenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits(@NotNull PCREParser.DigitsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull PCREParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(@NotNull PCREParser.OptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#non_close_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_close_paren(@NotNull PCREParser.Non_close_parenContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull PCREParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#newline_convention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline_convention(@NotNull PCREParser.Newline_conventionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#character_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_class(@NotNull PCREParser.Character_classContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#callout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallout(@NotNull PCREParser.CalloutContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#letter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetter(@NotNull PCREParser.LetterContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull PCREParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#shared_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShared_atom(@NotNull PCREParser.Shared_atomContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#backreference_or_octal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference_or_octal(@NotNull PCREParser.Backreference_or_octalContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(@NotNull PCREParser.DigitContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#non_close_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_close_parens(@NotNull PCREParser.Non_close_parensContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#octal_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_digit(@NotNull PCREParser.Octal_digitContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(@NotNull PCREParser.ConditionalContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull PCREParser.CommentContext ctx);

	/**
	 * Visit a parse tree produced by {@link PCREParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull PCREParser.LiteralContext ctx);
}