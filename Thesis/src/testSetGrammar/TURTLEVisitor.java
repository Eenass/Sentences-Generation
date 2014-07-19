// Generated from TURTLE.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TURTLEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TURTLEVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TURTLEParser#sparqlBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlBase(@NotNull TURTLEParser.SparqlBaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#rdfLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdfLiteral(@NotNull TURTLEParser.RdfLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#prefixID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixID(@NotNull TURTLEParser.PrefixIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(@NotNull TURTLEParser.SubjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(@NotNull TURTLEParser.PredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(@NotNull TURTLEParser.CollectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(@NotNull TURTLEParser.ObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#objectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectList(@NotNull TURTLEParser.ObjectListContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri(@NotNull TURTLEParser.IriContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#turtleDoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurtleDoc(@NotNull TURTLEParser.TurtleDocContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull TURTLEParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(@NotNull TURTLEParser.VerbContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNodePropertyList(@NotNull TURTLEParser.BlankNodePropertyListContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(@NotNull TURTLEParser.BaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#triples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriples(@NotNull TURTLEParser.TriplesContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#predicateObjectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateObjectList(@NotNull TURTLEParser.PredicateObjectListContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(@NotNull TURTLEParser.DirectiveContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlPrefix(@NotNull TURTLEParser.SparqlPrefixContext ctx);

	/**
	 * Visit a parse tree produced by {@link TURTLEParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull TURTLEParser.LiteralContext ctx);
}