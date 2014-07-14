grammar ExtractedDOT;

graph
	:	STRICT?  ( GRAPH|DIGRAPH)  id?  '{' stmt_list '}' 
	;

stmt_list
	:	( stmt ';'?   ) *
	;

stmt
	:	node_stmt
	|	edge_stmt
	|	attr_stmt
	|	id '=' id 
	|	subgraph 
	;

attr_stmt
	:	( GRAPH|NODE|EDGE)  attr_list 
	;

attr_list
	:	( '[' a_list?  ']'  ) +
	;

a_list
	:	( id ( '=' id  ) ?  ','?   ) +
	;

edge_stmt
	:	( node_id|subgraph)  edgeRHS attr_list?  
	;

edgeRHS
	:	( edgeop ( node_id|subgraph)   ) +
	;

edgeop
	:	'->'
	|	'--' 
	;

node_stmt
	:	node_id attr_list?  
	;

node_id
	:	id port?  
	;

port
	:	':' id ( ':' id  ) ?  
	;

subgraph
	:	( SUBGRAPH id?   ) ?  '{' stmt_list '}' 
	;

id
	:	ID
	|	STRING
	|	HTML_STRING
	|	NUMBER 
	;

STRICT
	:	[Ss] [Tt] [Rr] [Ii] [Cc] [Tt] 
	;

GRAPH
	:	[Gg] [Rr] [Aa] [Pp] [Hh] 
	;

DIGRAPH
	:	[Dd] [Ii] [Gg] [Rr] [Aa] [Pp] [Hh] 
	;

NODE
	:	[Nn] [Oo] [Dd] [Ee] 
	;

EDGE
	:	[Ee] [Dd] [Gg] [Ee] 
	;

SUBGRAPH
	:	[Ss] [Uu] [Bb] [Gg] [Rr] [Aa] [Pp] [Hh] 
	;

NUMBER
	:	'-'?  ( '.' DIGIT+ |DIGIT+ ( '.' DIGIT*  ) ?  )  
	;

DIGIT
	:	[0-9]
	;

STRING
	:	'"' ( '\\"'|.)* ?  '"' 
	;

ID
	:	LETTER ( LETTER|DIGIT) * 
	;

LETTER
	:	[a-zA-Z\u0080-\u00FF_]
	;

HTML_STRING
	:	'<' ( TAG|~ [<>] ) * '>' 
	;

TAG
	:	'<' ?  '>' 
	;

COMMENT
	:	'/*' ?  '*/' 
	;

LINE_COMMENT
	:	'//' ?  '\r'?  '\n' 
	;

PREPROC
	:	'#' ?  '\n' 
	;

WS
	:	[ \t\n\r]+
	;