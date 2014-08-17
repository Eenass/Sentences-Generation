// Generated from asm6502.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link asm6502Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface asm6502Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link asm6502Parser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull asm6502Parser.ArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull asm6502Parser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull asm6502Parser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull asm6502Parser.LabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#assemblerinstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblerinstruction(@NotNull asm6502Parser.AssemblerinstructionContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcode(@NotNull asm6502Parser.OpcodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#argumentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentlist(@NotNull asm6502Parser.ArgumentlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull asm6502Parser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#assembleropcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssembleropcode(@NotNull asm6502Parser.AssembleropcodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#lbl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbl(@NotNull asm6502Parser.LblContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(@NotNull asm6502Parser.PrefixContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull asm6502Parser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull asm6502Parser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(@NotNull asm6502Parser.InstructionContext ctx);

	/**
	 * Visit a parse tree produced by {@link asm6502Parser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull asm6502Parser.CommentContext ctx);
}