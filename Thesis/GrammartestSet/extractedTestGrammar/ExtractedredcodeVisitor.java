// Generated from Extractedredcode.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedredcodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedredcodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedredcodeParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(@NotNull ExtractedredcodeParser.ModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedredcodeParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(@NotNull ExtractedredcodeParser.FileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedredcodeParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull ExtractedredcodeParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedredcodeParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull ExtractedredcodeParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedredcodeParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(@NotNull ExtractedredcodeParser.InstructionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedredcodeParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull ExtractedredcodeParser.CommentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedredcodeParser#mmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMmode(@NotNull ExtractedredcodeParser.MmodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedredcodeParser#opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcode(@NotNull ExtractedredcodeParser.OpcodeContext ctx);
}