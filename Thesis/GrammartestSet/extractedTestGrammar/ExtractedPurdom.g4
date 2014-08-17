grammar ExtractedPurdom;

s
	:	'{' e '}' 
	;

e
	:	( e '+' t  ) 
	|	t 
	;

t
	:	p '^' t 
	|	p 
	;

p
	:	'(' e ')' 
	|	'i' 
	;
