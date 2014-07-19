grammar ExtractedTURTLE;

turtleDoc
	:	statement*
	;

statement
	:	directive
	|	triples '.'  
	;

directive
	:	prefixID
	|	base
	|	sparqlPrefix
	|	sparqlBase 
	;

prefixID
	:	'@prefix' PNAME_NS IRIREF '.' 
	;

base
	:	'@base' IRIREF '.' 
	;

sparqlBase
	:	'BASE' IRIREF 
	;

sparqlPrefix
	:	'PREFIX' PNAME_NS IRIREF 
	;

triples
	:	subject predicateObjectList 
	|	blankNodePropertyList predicateObjectList?   
	;

predicateObjectList
	:	verb objectList ( ';' ( verb objectList  ) ?   ) * 
	;

objectList
	:	object ( ',' object  ) * 
	;

verb
	:	predicate
	|	'a' 
	;

subject
	:	iri
	|	BlankNode
	|	collection 
	;

predicate
	:	iri
	;

object
	:	iri
	|	BlankNode
	|	collection
	|	blankNodePropertyList
	|	literal 
	;

literal
	:	rdfLiteral
	|	NumericLiteral
	|	BooleanLiteral 
	;

blankNodePropertyList
	:	'[' predicateObjectList ']' 
	;

collection
	:	'(' object* ')' 
	;

NumericLiteral
	:	INTEGER
	|	DECIMAL
	|	DOUBLE 
	;

rdfLiteral
	:	String ( LANGTAG|'^^' iri ) ?  
	;

BooleanLiteral
	:	'true'
	|	'false' 
	;

String
	:	STRING_LITERAL_QUOTE
	|	STRING_LITERAL_SINGLE_QUOTE
	|	STRING_LITERAL_LONG_SINGLE_QUOTE
	|	STRING_LITERAL_LONG_QUOTE 
	;

iri
	:	IRIREF
	|	PrefixedName 
	;

BlankNode
	:	BLANK_NODE_LABEL
	|	ANON 
	;

WS
	:	( '\n'|' ') 
	;

PN_PREFIX
	:	PN_CHARS_BASE  
	;

IRIREF
	:	'<'  '>' 
	;

PNAME_NS
	:	 ':' 
	;

PrefixedName
	:	PNAME_LN
	|	PNAME_NS 
	;

PNAME_LN
	:	PNAME_NS PN_LOCAL 
	;

BLANK_NODE_LABEL
	:	'_:' ( PN_CHARS_U|'0')   
	;

LANGTAG
	:	'@' 'a'  
	;

INTEGER
	:	 '0' 
	;

DECIMAL
	:	  '.' '0' 
	;

DOUBLE
	:	 ( '0' '.'  EXPONENT |'.' '0' EXPONENT |'0' EXPONENT )  
	;

EXPONENT
	:	'e'  '0' 
	;

STRING_LITERAL_LONG_SINGLE_QUOTE
	:	'\'\'\''  '\'\'\'' 
	;

STRING_LITERAL_LONG_QUOTE
	:	'"""'  '"""' 
	;

STRING_LITERAL_QUOTE
	:	'"'  '"' 
	;

STRING_LITERAL_SINGLE_QUOTE
	:	'\''  '\'' 
	;

UCHAR
	:	'\\u' HEX HEX HEX HEX 
	|	'\\U' HEX HEX HEX HEX HEX HEX HEX HEX  
	;

ECHAR
	:	'\\' 't' 
	;

ANON_WS
	:	' '
	|	'\t'
	|	'\r'
	|	'\n' 
	;

ANON
	:	'['  ']' 
	;

SC
	:	'$'
	;

PN_CHARS_BASE
	:	'A'
	|	'a'
	|	'\u00C0'
	|	'\u00D8'
	|	'\u00F8'
	|	'\u0370'
	|	'\u037F'
	|	'\u200C'
	|	'\u2070'
	|	'\u2C00'
	|	'\u3001'
	|	'\uF900'
	|	'\uFDF0' 
	;

PN_CHARS_U
	:	PN_CHARS_BASE
	|	'_' 
	;

PN_CHARS
	:	PN_CHARS_U
	|	'-'
	|	'0'
	|	'\u00B7'
	|	'\u0300'
	|	'\u203F' 
	;

PN_LOCAL
	:	( PN_CHARS_U|':'|'0'|PLX)   
	;

PLX
	:	PERCENT
	|	PN_LOCAL_ESC 
	;

PERCENT
	:	'%' HEX HEX 
	;

HEX
	:	'0'
	|	'A'
	|	'a' 
	;

PN_LOCAL_ESC
	:	'\\' ( '_'|'~'|'.'|'-'|'!'|'$'|'&'|'\''|'('|')'|'*'|'+'|','|';'|'='|'/'|'?'|'#'|'@'|'%')  
	;
