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
	:	'"'  '"' 
	;

ESC
	:	'\\' ( '"'|UNICODE)  
	;

UNICODE
	:	'u' HEX HEX HEX HEX 
	;

HEX
	:	'0'
	;

NUMBER
	:	 INT '.' INT  
	|	 INT EXP 
	|	 INT  
	;

INT
	:	'0'
	|	'1'   
	;

EXP
	:	'E'  INT 
	;

WS
	:	'\n'
	;
