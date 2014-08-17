// Generated from Clojure.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ClojureVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class ClojureBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ClojureVisitor<T> {
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitSpecial_form(@NotNull ClojureParser.Special_formContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitLambda(@NotNull ClojureParser.LambdaContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitForm(@NotNull ClojureParser.FormContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitVar_quote(@NotNull ClojureParser.Var_quoteContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitReader_macro(@NotNull ClojureParser.Reader_macroContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitRegex(@NotNull ClojureParser.RegexContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitVector(@NotNull ClojureParser.VectorContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitFile(@NotNull ClojureParser.FileContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitMap(@NotNull ClojureParser.MapContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitList(@NotNull ClojureParser.ListContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitMeta_data(@NotNull ClojureParser.Meta_dataContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitLiteral(@NotNull ClojureParser.LiteralContext ctx) { return visitChildren(ctx); }
}