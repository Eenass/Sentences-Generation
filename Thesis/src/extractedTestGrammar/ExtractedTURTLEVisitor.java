// Generated from ExtractedTURTLE.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedTURTLEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedTURTLEVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#sparqlBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlBase(@NotNull ExtractedTURTLEParser.SparqlBaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#rdfLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdfLiteral(@NotNull ExtractedTURTLEParser.RdfLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#prefixID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixID(@NotNull ExtractedTURTLEParser.PrefixIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(@NotNull ExtractedTURTLEParser.SubjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(@NotNull ExtractedTURTLEParser.PredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(@NotNull ExtractedTURTLEParser.CollectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(@NotNull ExtractedTURTLEParser.ObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#objectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectList(@NotNull ExtractedTURTLEParser.ObjectListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri(@NotNull ExtractedTURTLEParser.IriContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#turtleDoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurtleDoc(@NotNull ExtractedTURTLEParser.TurtleDocContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ExtractedTURTLEParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(@NotNull ExtractedTURTLEParser.VerbContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNodePropertyList(@NotNull ExtractedTURTLEParser.BlankNodePropertyListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(@NotNull ExtractedTURTLEParser.BaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#triples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriples(@NotNull ExtractedTURTLEParser.TriplesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#predicateObjectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateObjectList(@NotNull ExtractedTURTLEParser.PredicateObjectListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(@NotNull ExtractedTURTLEParser.DirectiveContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlPrefix(@NotNull ExtractedTURTLEParser.SparqlPrefixContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedTURTLEParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull ExtractedTURTLEParser.LiteralContext ctx);
}