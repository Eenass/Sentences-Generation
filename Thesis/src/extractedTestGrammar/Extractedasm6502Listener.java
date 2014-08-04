// Generated from Extractedasm6502.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Extractedasm6502Parser}.
 */
public interface Extractedasm6502Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull Extractedasm6502Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull Extractedasm6502Parser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull Extractedasm6502Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull Extractedasm6502Parser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull Extractedasm6502Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull Extractedasm6502Parser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull Extractedasm6502Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull Extractedasm6502Parser.LabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#assemblerinstruction}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerinstruction(@NotNull Extractedasm6502Parser.AssemblerinstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#assemblerinstruction}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerinstruction(@NotNull Extractedasm6502Parser.AssemblerinstructionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(@NotNull Extractedasm6502Parser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(@NotNull Extractedasm6502Parser.OpcodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void enterArgumentlist(@NotNull Extractedasm6502Parser.ArgumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void exitArgumentlist(@NotNull Extractedasm6502Parser.ArgumentlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull Extractedasm6502Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull Extractedasm6502Parser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#assembleropcode}.
	 * @param ctx the parse tree
	 */
	void enterAssembleropcode(@NotNull Extractedasm6502Parser.AssembleropcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#assembleropcode}.
	 * @param ctx the parse tree
	 */
	void exitAssembleropcode(@NotNull Extractedasm6502Parser.AssembleropcodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#lbl}.
	 * @param ctx the parse tree
	 */
	void enterLbl(@NotNull Extractedasm6502Parser.LblContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#lbl}.
	 * @param ctx the parse tree
	 */
	void exitLbl(@NotNull Extractedasm6502Parser.LblContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(@NotNull Extractedasm6502Parser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(@NotNull Extractedasm6502Parser.PrefixContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull Extractedasm6502Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull Extractedasm6502Parser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull Extractedasm6502Parser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull Extractedasm6502Parser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull Extractedasm6502Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull Extractedasm6502Parser.InstructionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Extractedasm6502Parser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull Extractedasm6502Parser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Extractedasm6502Parser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull Extractedasm6502Parser.CommentContext ctx);
}