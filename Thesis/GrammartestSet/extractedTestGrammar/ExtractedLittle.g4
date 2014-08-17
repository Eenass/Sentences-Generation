grammar ExtractedLittle;

s
	:	e
	;

e
	:	e '+' e 
	|	'e' 
	;
