// Generated from ExtractedTURTLE.g4 by ANTLR 4.1
package extractedTestGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedTURTLEParser}.
 */
public interface ExtractedTURTLEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void enterSparqlBase(@NotNull ExtractedTURTLEParser.SparqlBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void exitSparqlBase(@NotNull ExtractedTURTLEParser.SparqlBaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRdfLiteral(@NotNull ExtractedTURTLEParser.RdfLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRdfLiteral(@NotNull ExtractedTURTLEParser.RdfLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#prefixID}.
	 * @param ctx the parse tree
	 */
	void enterPrefixID(@NotNull ExtractedTURTLEParser.PrefixIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#prefixID}.
	 * @param ctx the parse tree
	 */
	void exitPrefixID(@NotNull ExtractedTURTLEParser.PrefixIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(@NotNull ExtractedTURTLEParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(@NotNull ExtractedTURTLEParser.SubjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(@NotNull ExtractedTURTLEParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(@NotNull ExtractedTURTLEParser.PredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(@NotNull ExtractedTURTLEParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(@NotNull ExtractedTURTLEParser.CollectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull ExtractedTURTLEParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull ExtractedTURTLEParser.ObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#objectList}.
	 * @param ctx the parse tree
	 */
	void enterObjectList(@NotNull ExtractedTURTLEParser.ObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#objectList}.
	 * @param ctx the parse tree
	 */
	void exitObjectList(@NotNull ExtractedTURTLEParser.ObjectListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(@NotNull ExtractedTURTLEParser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(@NotNull ExtractedTURTLEParser.IriContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#turtleDoc}.
	 * @param ctx the parse tree
	 */
	void enterTurtleDoc(@NotNull ExtractedTURTLEParser.TurtleDocContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#turtleDoc}.
	 * @param ctx the parse tree
	 */
	void exitTurtleDoc(@NotNull ExtractedTURTLEParser.TurtleDocContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ExtractedTURTLEParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ExtractedTURTLEParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(@NotNull ExtractedTURTLEParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(@NotNull ExtractedTURTLEParser.VerbContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterBlankNodePropertyList(@NotNull ExtractedTURTLEParser.BlankNodePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitBlankNodePropertyList(@NotNull ExtractedTURTLEParser.BlankNodePropertyListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(@NotNull ExtractedTURTLEParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(@NotNull ExtractedTURTLEParser.BaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#triples}.
	 * @param ctx the parse tree
	 */
	void enterTriples(@NotNull ExtractedTURTLEParser.TriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#triples}.
	 * @param ctx the parse tree
	 */
	void exitTriples(@NotNull ExtractedTURTLEParser.TriplesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void enterPredicateObjectList(@NotNull ExtractedTURTLEParser.PredicateObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void exitPredicateObjectList(@NotNull ExtractedTURTLEParser.PredicateObjectListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(@NotNull ExtractedTURTLEParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(@NotNull ExtractedTURTLEParser.DirectiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSparqlPrefix(@NotNull ExtractedTURTLEParser.SparqlPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSparqlPrefix(@NotNull ExtractedTURTLEParser.SparqlPrefixContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedTURTLEParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ExtractedTURTLEParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedTURTLEParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ExtractedTURTLEParser.LiteralContext ctx);
}