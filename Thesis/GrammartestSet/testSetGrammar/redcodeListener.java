// Generated from redcode.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link redcodeParser}.
 */
public interface redcodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link redcodeParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull redcodeParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull redcodeParser.ModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link redcodeParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull redcodeParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull redcodeParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link redcodeParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull redcodeParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull redcodeParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link redcodeParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull redcodeParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull redcodeParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link redcodeParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull redcodeParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull redcodeParser.InstructionContext ctx);

	/**
	 * Enter a parse tree produced by {@link redcodeParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull redcodeParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull redcodeParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link redcodeParser#mmode}.
	 * @param ctx the parse tree
	 */
	void enterMmode(@NotNull redcodeParser.MmodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#mmode}.
	 * @param ctx the parse tree
	 */
	void exitMmode(@NotNull redcodeParser.MmodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link redcodeParser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(@NotNull redcodeParser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(@NotNull redcodeParser.OpcodeContext ctx);
}