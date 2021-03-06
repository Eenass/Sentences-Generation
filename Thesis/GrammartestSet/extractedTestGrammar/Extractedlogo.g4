grammar Extractedlogo;

prog
	:	( line?  EOL  ) +
	;

line
	:	cmd+ comment?  
	|	comment
	|	procedureDeclaration 
	;

cmd
	:	repeat
	|	fd
	|	bk
	|	rt
	|	lt
	|	cs
	|	pu
	|	pd
	|	ht
	|	st
	|	home
	|	label
	|	setxy
	|	make
	|	print
	|	procedureInvocation
	|	ife
	|	stop
	|	fore 
	;

procedureInvocation
	:	name expression* 
	;

procedureDeclaration
	:	'to' name parameterDeclarations* EOL?  ( line?  EOL  ) + 'end' 
	;

parameterDeclarations
	:	':' name ( ',' parameterDeclarations  ) * 
	;

func
	:	random
	;

repeat
	:	'repeat' number block 
	;

block
	:	'[' cmd+ ']' 
	;

ife
	:	'if' comparison block 
	;

comparison
	:	expression comparisonOperator expression 
	;

comparisonOperator
	:	'<'
	|	'>'
	|	'=' 
	;

make
	:	'make' stringliteral value 
	;

print
	:	'print' value 
	;

name
	:	STRING
	;

stringliteral
	:	'"' STRING 
	;

value
	:	stringliteral
	|	expression
	|	deref 
	;

signExpression
	:	( ( '+'|'-')  ) * ( number|deref|func)  
	;

multiplyingExpression
	:	signExpression ( ( '*'|'/')  signExpression  ) * 
	;

expression
	:	multiplyingExpression ( ( '+'|'-')  multiplyingExpression  ) * 
	;

deref
	:	':' name 
	;

fd
	:	( 'fd'|'forward')  expression 
	;

bk
	:	( 'bk'|'backward')  expression 
	;

rt
	:	( 'rt'|'right')  expression 
	;

lt
	:	( 'lt'|'left')  expression 
	;

cs
	:	'cs'
	|	'clearscreen' 
	;

pu
	:	'pu'
	|	'penup' 
	;

pd
	:	'pd'
	|	'pendown' 
	;

ht
	:	'ht'
	|	'hideturtle' 
	;

st
	:	'st'
	|	'showturtle' 
	;

home
	:	'home'
	;

stop
	:	'stop'
	;

label
	:	'label'
	;

setxy
	:	'setxy' expression expression 
	;

random
	:	'random' expression 
	;

fore
	:	'for' '[' name expression expression expression ']' block 
	;

number
	:	NUMBER
	;

comment
	:	COMMENT
	;

STRING
	:	'a'  
	;

NUMBER
	:	'0'
	;

COMMENT
	:	';'  
	;

EOL
	:	 '\n' 
	;

WS
	:	'\n'
	;
