// Generated from redcode.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link redcodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface redcodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link redcodeParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(@NotNull redcodeParser.ModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link redcodeParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(@NotNull redcodeParser.FileContext ctx);

	/**
	 * Visit a parse tree produced by {@link redcodeParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull redcodeParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link redcodeParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull redcodeParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link redcodeParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(@NotNull redcodeParser.InstructionContext ctx);

	/**
	 * Visit a parse tree produced by {@link redcodeParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull redcodeParser.CommentContext ctx);

	/**
	 * Visit a parse tree produced by {@link redcodeParser#mmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMmode(@NotNull redcodeParser.MmodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link redcodeParser#opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcode(@NotNull redcodeParser.OpcodeContext ctx);
}