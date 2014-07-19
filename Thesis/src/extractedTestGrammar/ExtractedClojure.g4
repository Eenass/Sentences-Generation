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
	:	'"'  '"' 
	;

NUMBER
	:	 '0'   
	;

CHARACTER
	:	'\\' . 
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
	|	NAME   
	;

PARAM_NAME
	:	'%'  
	;

NAME
	:	SYMBOL_HEAD   
	;

SYMBOL_HEAD
	:	'a'
	|	'A'
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
	|	'0'
	|	'.' 
	;

WS
	:	'\n'
	;

COMMENT
	:	';'  
	;
