// Generated from asm6502.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link asm6502Parser}.
 */
public interface asm6502Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull asm6502Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull asm6502Parser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull asm6502Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull asm6502Parser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull asm6502Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull asm6502Parser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull asm6502Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull asm6502Parser.LabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#assemblerinstruction}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerinstruction(@NotNull asm6502Parser.AssemblerinstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#assemblerinstruction}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerinstruction(@NotNull asm6502Parser.AssemblerinstructionContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(@NotNull asm6502Parser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(@NotNull asm6502Parser.OpcodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void enterArgumentlist(@NotNull asm6502Parser.ArgumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void exitArgumentlist(@NotNull asm6502Parser.ArgumentlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull asm6502Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull asm6502Parser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#assembleropcode}.
	 * @param ctx the parse tree
	 */
	void enterAssembleropcode(@NotNull asm6502Parser.AssembleropcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#assembleropcode}.
	 * @param ctx the parse tree
	 */
	void exitAssembleropcode(@NotNull asm6502Parser.AssembleropcodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#lbl}.
	 * @param ctx the parse tree
	 */
	void enterLbl(@NotNull asm6502Parser.LblContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#lbl}.
	 * @param ctx the parse tree
	 */
	void exitLbl(@NotNull asm6502Parser.LblContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(@NotNull asm6502Parser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(@NotNull asm6502Parser.PrefixContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull asm6502Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull asm6502Parser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull asm6502Parser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull asm6502Parser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull asm6502Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull asm6502Parser.InstructionContext ctx);

	/**
	 * Enter a parse tree produced by {@link asm6502Parser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull asm6502Parser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull asm6502Parser.CommentContext ctx);
}