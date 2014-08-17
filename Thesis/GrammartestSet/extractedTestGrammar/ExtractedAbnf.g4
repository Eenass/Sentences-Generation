grammar ExtractedAbnf;

rulelist
	:	rule_* EOF 
	;

rule_
	:	ID ( '='|'=/')  elements 
	;

elements
	:	alternation
	;

alternation
	:	concatenation ( '/' concatenation  ) * 
	;

concatenation
	:	repetition ( repetition ) * 
	;

repetition
	:	repeat?  element 
	;

repeat
	:	INT
	|	( INT?  '*' INT?   )  
	;

element
	:	ID
	|	group
	|	option
	|	STRING
	|	NumberValue
	|	ProseValue 
	;

group
	:	'(' alternation ')' 
	;

option
	:	'[' alternation ']' 
	;

NumberValue
	:	'%' ( BinaryValue|DecimalValue|HexValue)  
	;

BinaryValue
	:	'b' BIT  
	;

DecimalValue
	:	'd' DIGIT  
	;

HexValue
	:	'x' HEX_DIGIT  
	;

ProseValue
	:	'<'  '>' 
	;

ID
	:	( 'a'|'A')   
	;

INT
	:	'0'
	;

COMMENT
	:	';'   '\n' 
	;

WS
	:	( ' '|'\t'|'\r'|'\n') 
	;

STRING
	:	'"'  '"' 
	;

BIT
	:	'0'
	;

DIGIT
	:	'0'
	;

HEX_DIGIT
	:	( '0'|'a'|'A') 
	;
