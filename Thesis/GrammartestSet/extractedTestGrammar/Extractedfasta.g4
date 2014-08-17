grammar Extractedfasta;

sequence
	:	section+
	;

section
	:	descriptionline
	|	sequencelines
	|	commentline 
	;

sequencelines
	:	SEQUENCELINE+
	;

descriptionline
	:	DESCRIPTIONLINE
	;

commentline
	:	COMMENTLINE
	;

COMMENTLINE
	:	';'  EOL 
	;

DESCRIPTIONLINE
	:	'>' TEXT  EOL 
	;

TEXT
	:	( DIGIT|LETTER|SYMBOL) 
	;

EOL
	:	 '\n' 
	;

DIGIT
	:	'0'
	;

LETTER
	:	'A'
	;

SYMBOL
	:	'.'
	|	'-'
	|	'+'
	|	'_'
	|	'.'
	|	' '
	|	'['
	|	']'
	|	'('
	|	')'
	|	','
	|	'/'
	|	':'
	|	'&'
	|	'\'' 
	;

SEQUENCELINE
	:	LETTER EOL 
	;
