// Generated from TURTLE.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TURTLEParser}.
 */
public interface TURTLEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TURTLEParser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void enterSparqlBase(@NotNull TURTLEParser.SparqlBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void exitSparqlBase(@NotNull TURTLEParser.SparqlBaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRdfLiteral(@NotNull TURTLEParser.RdfLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRdfLiteral(@NotNull TURTLEParser.RdfLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#prefixID}.
	 * @param ctx the parse tree
	 */
	void enterPrefixID(@NotNull TURTLEParser.PrefixIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#prefixID}.
	 * @param ctx the parse tree
	 */
	void exitPrefixID(@NotNull TURTLEParser.PrefixIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(@NotNull TURTLEParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(@NotNull TURTLEParser.SubjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(@NotNull TURTLEParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(@NotNull TURTLEParser.PredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(@NotNull TURTLEParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(@NotNull TURTLEParser.CollectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull TURTLEParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull TURTLEParser.ObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#objectList}.
	 * @param ctx the parse tree
	 */
	void enterObjectList(@NotNull TURTLEParser.ObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#objectList}.
	 * @param ctx the parse tree
	 */
	void exitObjectList(@NotNull TURTLEParser.ObjectListContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(@NotNull TURTLEParser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(@NotNull TURTLEParser.IriContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#turtleDoc}.
	 * @param ctx the parse tree
	 */
	void enterTurtleDoc(@NotNull TURTLEParser.TurtleDocContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#turtleDoc}.
	 * @param ctx the parse tree
	 */
	void exitTurtleDoc(@NotNull TURTLEParser.TurtleDocContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull TURTLEParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull TURTLEParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(@NotNull TURTLEParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(@NotNull TURTLEParser.VerbContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterBlankNodePropertyList(@NotNull TURTLEParser.BlankNodePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitBlankNodePropertyList(@NotNull TURTLEParser.BlankNodePropertyListContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(@NotNull TURTLEParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(@NotNull TURTLEParser.BaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#triples}.
	 * @param ctx the parse tree
	 */
	void enterTriples(@NotNull TURTLEParser.TriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#triples}.
	 * @param ctx the parse tree
	 */
	void exitTriples(@NotNull TURTLEParser.TriplesContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void enterPredicateObjectList(@NotNull TURTLEParser.PredicateObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void exitPredicateObjectList(@NotNull TURTLEParser.PredicateObjectListContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(@NotNull TURTLEParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(@NotNull TURTLEParser.DirectiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSparqlPrefix(@NotNull TURTLEParser.SparqlPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSparqlPrefix(@NotNull TURTLEParser.SparqlPrefixContext ctx);

	/**
	 * Enter a parse tree produced by {@link TURTLEParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull TURTLEParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TURTLEParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull TURTLEParser.LiteralContext ctx);
}