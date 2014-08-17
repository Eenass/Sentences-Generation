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
	:	'S' 'T' 'R' 'I' 'C' 'T' 
	;

GRAPH
	:	'G' 'R' 'A' 'P' 'H' 
	;

DIGRAPH
	:	'D' 'I' 'G' 'R' 'A' 'P' 'H' 
	;

NODE
	:	'N' 'O' 'D' 'E' 
	;

EDGE
	:	'E' 'D' 'G' 'E' 
	;

SUBGRAPH
	:	'S' 'U' 'B' 'G' 'R' 'A' 'P' 'H' 
	;

NUMBER
	:	 ( '.' DIGIT |DIGIT  )  
	;

DIGIT
	:	'0'
	;

STRING
	:	'"'  '"' 
	;

ID
	:	LETTER  
	;

LETTER
	:	'a'
	;

HTML_STRING
	:	'<'  '>' 
	;

TAG
	:	'<'  '>' 
	;

COMMENT
	:	'/*'  '*/' 
	;

LINE_COMMENT
	:	'//'   '\n' 
	;

PREPROC
	:	'#'  '\n' 
	;

WS
	:	'\n'
	;
