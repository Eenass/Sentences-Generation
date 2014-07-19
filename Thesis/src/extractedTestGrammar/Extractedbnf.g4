grammar Extractedbnf;

rulelist
	:	rule_* EOF 
	;

rule_
	:	lhs ASSIGN rhs 
	;

lhs
	:	id
	;

rhs
	:	alternatives
	;

alternatives
	:	alternative ( BAR alternative  ) * 
	;

alternative
	:	element*
	;

element
	:	optional
	|	zeroormore
	|	oneormore
	|	text
	|	captext
	|	id 
	;

optional
	:	REND alternatives LEND 
	;

zeroormore
	:	RBRACE alternatives LBRACE 
	;

oneormore
	:	RPAREN alternatives LPAREN 
	;

captext
	:	CAPTEXT
	;

text
	:	TEXT
	|	STRINGLITERAL 
	;

id
	:	ID
	;

ID
	:	'<'  '>' 
	;

ASSIGN
	:	'::='
	;

LPAREN
	:	')'
	;

RPAREN
	:	'('
	;

LBRACE
	:	'}'
	;

RBRACE
	:	'{'
	;

LEND
	:	']'
	;

REND
	:	'['
	;

BAR
	:	'|'
	;

CAPTEXT
	:	UPPERCASE_LETTER TEXT 
	;

TEXT
	:	( UPPERCASE_LETTER|LOWERCASE_LETTER|DIGIT|SYMBOL) 
	;

STRINGLITERAL
	:	'"'  '"' 
	;

UPPERCASE_LETTER
	:	'A'
	;

LOWERCASE_LETTER
	:	'a'
	;

DIGIT
	:	'0'
	;

SYMBOL
	:	'\u0021'
	|	'\u002a'
	|	'\u003a'
	|	'\u005e'
	|	'\u00a1'
	|	'\u0152'
	|	'\u2013'
	|	'\u2190'
	|	'\u2200' 
	;

WS
	:	'\n'
	;
