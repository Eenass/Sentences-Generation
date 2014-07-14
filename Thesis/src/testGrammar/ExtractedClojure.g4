grammar ExtractedClojure;

file
	:	list*
	;

form
	:	literal
	|	list
	|	vector
	|	map
	|	reader_macro
	|	'#\'' SYMBOL  
	;

list
	:	'(' form* ')' 
	;

vector
	:	'[' form* ']' 
	;

map
	:	'{' ( form form  ) * '}' 
	;

special_form
	:	( '\''|'`'|'~'|'~@'|'^'|'@'|'&')  form 
	;

lambda
	:	'#(' form* ')' 
	;

meta_data
	:	'#^' map form 
	;

var_quote
	:	'\'' '#' SYMBOL 
	;

regex
	:	'#' STRING 
	;

reader_macro
	:	lambda
	|	meta_data
	|	special_form
	|	regex
	|	var_quote
	|	SYMBOL '#'  
	;

literal
	:	STRING
	|	NUMBER
	|	CHARACTER
	|	NIL
	|	BOOLEAN
	|	KEYWORD
	|	SYMBOL
	|	PARAM_NAME 
	;

STRING
	:	'"' ( ~ '"' |'\\' '"' ) * '"' 
	;

NUMBER
	:	'-'?  [0-9]+ ( '.' [0-9]+  ) ?  ( [eE] '-'?  [0-9]+  ) ?  
	;

CHARACTER
	:	'\\'  
	;

NIL
	:	'nil'
	;

BOOLEAN
	:	'true'
	|	'false' 
	;

KEYWORD
	:	':' SYMBOL 
	;

SYMBOL
	:	'.'
	|	'/'
	|	NAME ( '/' NAME  ) ?   
	;

PARAM_NAME
	:	'%' ( [1-9] [1-9]*  ) ?  
	;

NAME
	:	SYMBOL_HEAD SYMBOL_REST* ( ':' SYMBOL_REST+  ) * 
	;

SYMBOL_HEAD
	:	[a-z]
	|	[A-Z]
	|	'*'
	|	'+'
	|	'!'
	|	'-'
	|	'_'
	|	'?'
	|	'>'
	|	'<'
	|	'='
	|	'$' 
	;

SYMBOL_REST
	:	SYMBOL_HEAD
	|	'&'
	|	[1-9]
	|	'.' 
	;

WS
	:	[ \n\r\t\,]
	;

COMMENT
	:	';' ~ [\r\n] * 
	;
