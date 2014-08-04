// Generated from Extractedredcode.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedredcodeParser}.
 */
public interface ExtractedredcodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedredcodeParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull ExtractedredcodeParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedredcodeParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull ExtractedredcodeParser.ModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedredcodeParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull ExtractedredcodeParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedredcodeParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull ExtractedredcodeParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedredcodeParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull ExtractedredcodeParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedredcodeParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull ExtractedredcodeParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedredcodeParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull ExtractedredcodeParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedredcodeParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull ExtractedredcodeParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedredcodeParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull ExtractedredcodeParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedredcodeParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull ExtractedredcodeParser.InstructionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedredcodeParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull ExtractedredcodeParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedredcodeParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull ExtractedredcodeParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedredcodeParser#mmode}.
	 * @param ctx the parse tree
	 */
	void enterMmode(@NotNull ExtractedredcodeParser.MmodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedredcodeParser#mmode}.
	 * @param ctx the parse tree
	 */
	void exitMmode(@NotNull ExtractedredcodeParser.MmodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedredcodeParser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(@NotNull ExtractedredcodeParser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedredcodeParser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(@NotNull ExtractedredcodeParser.OpcodeContext ctx);
}