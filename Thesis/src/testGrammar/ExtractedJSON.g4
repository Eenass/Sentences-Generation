grammar ExtractedJSON;

json
	:	object
	|	array 
	;

object
	:	'{' pair ( ',' pair  ) * '}' 
	|	'{' '}'  
	;

pair
	:	STRING ':' value 
	;

array
	:	'[' value ( ',' value  ) * ']' 
	|	'[' ']'  
	;

value
	:	STRING
	|	NUMBER
	|	object
	|	array
	|	'true'
	|	'false'
	|	'null' 
	;

STRING
	:	'"' ( ESC|~ ["\\] ) * '"' 
	;

ESC
	:	'\\' ( ["\\/bfnrt]|UNICODE)  
	;

UNICODE
	:	'u' HEX HEX HEX HEX 
	;

HEX
	:	[0-9a-fA-F]
	;

NUMBER
	:	'-'?  INT '.' INT EXP?  
	|	'-'?  INT EXP 
	|	'-'?  INT  
	;

INT
	:	'0'
	|	[1-9] [0-9]*  
	;

EXP
	:	[Ee] [+\-]?  INT 
	;

WS
	:	[ \t\n\r]+
	;
