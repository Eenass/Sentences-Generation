grammar ExtractedC;

start
	: primaryExpression;

primaryExpression
	:	Identifier
	|	Constant
	|	StringLiteral+
	|	'(' expression ')' 
	|	genericSelection
	|	'__extension__'?  '(' compoundStatement ')' 
	|	'__builtin_va_arg' '(' unaryExpression ',' typeName ')' 
	|	'__builtin_offsetof' '(' typeName ',' unaryExpression ')'  
	;

genericSelection
	:	'_Generic' '(' assignmentExpression ',' genericAssocList ')' 
	;

genericAssocList
	:	genericAssociation
	|	genericAssocList ',' genericAssociation  
	;

genericAssociation
	:	typeName ':' assignmentExpression 
	|	'default' ':' assignmentExpression  
	;

postfixExpression
	:	primaryExpression
	|	postfixExpression '[' expression ']' 
	|	postfixExpression '(' argumentExpressionList?  ')' 
	|	postfixExpression '.' Identifier 
	|	postfixExpression '->' Identifier 
	|	postfixExpression '++' 
	|	postfixExpression '--' 
	|	'(' typeName ')' '{' initializerList '}' 
	|	'(' typeName ')' '{' initializerList ',' '}' 
	|	'__extension__' '(' typeName ')' '{' initializerList '}' 
	|	'__extension__' '(' typeName ')' '{' initializerList ',' '}'  
	;

argumentExpressionList
	:	assignmentExpression
	|	argumentExpressionList ',' assignmentExpression  
	;

unaryExpression
	:	postfixExpression
	|	'++' unaryExpression 
	|	'--' unaryExpression 
	|	unaryOperator castExpression 
	|	'sizeof' unaryExpression 
	|	'sizeof' '(' typeName ')' 
	|	'_Alignof' '(' typeName ')' 
	|	'&&' Identifier  
	;

unaryOperator
	:	'&'
	|	'*'
	|	'+'
	|	'-'
	|	'~'
	|	'!' 
	;

castExpression
	:	unaryExpression
	|	'(' typeName ')' castExpression 
	|	'__extension__' '(' typeName ')' castExpression  
	;

multiplicativeExpression
	:	castExpression
	|	multiplicativeExpression '*' castExpression 
	|	multiplicativeExpression '/' castExpression 
	|	multiplicativeExpression '%' castExpression  
	;

additiveExpression
	:	multiplicativeExpression
	|	additiveExpression '+' multiplicativeExpression 
	|	additiveExpression '-' multiplicativeExpression  
	;

shiftExpression
	:	additiveExpression
	|	shiftExpression '<<' additiveExpression 
	|	shiftExpression '>>' additiveExpression  
	;

relationalExpression
	:	shiftExpression
	|	relationalExpression '<' shiftExpression 
	|	relationalExpression '>' shiftExpression 
	|	relationalExpression '<=' shiftExpression 
	|	relationalExpression '>=' shiftExpression  
	;

equalityExpression
	:	relationalExpression
	|	equalityExpression '==' relationalExpression 
	|	equalityExpression '!=' relationalExpression  
	;

andExpression
	:	equalityExpression
	|	andExpression '&' equalityExpression  
	;

exclusiveOrExpression
	:	andExpression
	|	exclusiveOrExpression '^' andExpression  
	;

inclusiveOrExpression
	:	exclusiveOrExpression
	|	inclusiveOrExpression '|' exclusiveOrExpression  
	;

logicalAndExpression
	:	inclusiveOrExpression
	|	logicalAndExpression '&&' inclusiveOrExpression  
	;

logicalOrExpression
	:	logicalAndExpression
	|	logicalOrExpression '||' logicalAndExpression  
	;

conditionalExpression
	:	logicalOrExpression ( '?' expression ':' conditionalExpression  ) ?  
	;

assignmentExpression
	:	conditionalExpression
	|	unaryExpression assignmentOperator assignmentExpression  
	;

assignmentOperator
	:	'='
	|	'*='
	|	'/='
	|	'%='
	|	'+='
	|	'-='
	|	'<<='
	|	'>>='
	|	'&='
	|	'^='
	|	'|=' 
	;

expression
	:	assignmentExpression
	|	expression ',' assignmentExpression  
	;

constantExpression
	:	conditionalExpression
	;

declaration
	:	declarationSpecifiers initDeclaratorList?  ';' 
	|	staticAssertDeclaration 
	;

declarationSpecifiers
	:	declarationSpecifier+
	;

declarationSpecifiers2
	:	declarationSpecifier+
	;

declarationSpecifier
	:	storageClassSpecifier
	|	typeSpecifier
	|	typeQualifier
	|	functionSpecifier
	|	alignmentSpecifier 
	;

initDeclaratorList
	:	initDeclarator
	|	initDeclaratorList ',' initDeclarator  
	;

initDeclarator
	:	declarator
	|	declarator '=' initializer  
	;

storageClassSpecifier
	:	'typedef'
	|	'extern'
	|	'static'
	|	'_Thread_local'
	|	'auto'
	|	'register' 
	;

typeSpecifier
	:	( 'void'|'char'|'short'|'int'|'long'|'float'|'double'|'signed'|'unsigned'|'_Bool'|'_Complex'|'__m128'|'__m128d'|'__m128i') 
	|	'__extension__' '(' ( '__m128'|'__m128d'|'__m128i')  ')' 
	|	atomicTypeSpecifier
	|	structOrUnionSpecifier
	|	enumSpecifier
	|	typedefName
	|	'__typeof__' '(' constantExpression ')'  
	;

structOrUnionSpecifier
	:	structOrUnion Identifier?  '{' structDeclarationList '}' 
	|	structOrUnion Identifier  
	;

structOrUnion
	:	'struct'
	|	'union' 
	;

structDeclarationList
	:	structDeclaration
	|	structDeclarationList structDeclaration  
	;

structDeclaration
	:	specifierQualifierList structDeclaratorList?  ';' 
	|	staticAssertDeclaration 
	;

specifierQualifierList
	:	typeSpecifier specifierQualifierList?  
	|	typeQualifier specifierQualifierList?   
	;

structDeclaratorList
	:	structDeclarator
	|	structDeclaratorList ',' structDeclarator  
	;

structDeclarator
	:	declarator
	|	declarator?  ':' constantExpression  
	;

enumSpecifier
	:	'enum' Identifier?  '{' enumeratorList '}' 
	|	'enum' Identifier?  '{' enumeratorList ',' '}' 
	|	'enum' Identifier  
	;

enumeratorList
	:	enumerator
	|	enumeratorList ',' enumerator  
	;

enumerator
	:	enumerationConstant
	|	enumerationConstant '=' constantExpression  
	;

enumerationConstant
	:	Identifier
	;

atomicTypeSpecifier
	:	'_Atomic' '(' typeName ')' 
	;

typeQualifier
	:	'const'
	|	'restrict'
	|	'volatile'
	|	'_Atomic' 
	;

functionSpecifier
	:	( 'inline'|'_Noreturn'|'__inline__'|'__stdcall') 
	|	gccAttributeSpecifier
	|	'__declspec' '(' Identifier ')'  
	;

alignmentSpecifier
	:	'_Alignas' '(' typeName ')' 
	|	'_Alignas' '(' constantExpression ')'  
	;

declarator
	:	pointer?  directDeclarator gccDeclaratorExtension* 
	;

directDeclarator
	:	Identifier
	|	'(' declarator ')' 
	|	directDeclarator '[' typeQualifierList?  assignmentExpression?  ']' 
	|	directDeclarator '[' 'static' typeQualifierList?  assignmentExpression ']' 
	|	directDeclarator '[' typeQualifierList 'static' assignmentExpression ']' 
	|	directDeclarator '[' typeQualifierList?  '*' ']' 
	|	directDeclarator '(' parameterTypeList ')' 
	|	directDeclarator '(' identifierList?  ')'  
	;

gccDeclaratorExtension
	:	'__asm' '(' StringLiteral+ ')' 
	|	gccAttributeSpecifier 
	;

gccAttributeSpecifier
	:	'__attribute__' '(' '(' gccAttributeList ')' ')' 
	;

gccAttributeList
	:	gccAttribute ( ',' gccAttribute  ) * 
	|	 
	;

gccAttribute
	:	~ ( ','|'('|')')   ( '(' argumentExpressionList?  ')'  ) ?  
	|	 
	;

nestedParenthesesBlock
	:	( ~ ( '('|')')  |'(' nestedParenthesesBlock ')' ) *
	;

pointer
	:	'*' typeQualifierList?  
	|	'*' typeQualifierList?  pointer 
	|	'^' typeQualifierList?  
	|	'^' typeQualifierList?  pointer  
	;

typeQualifierList
	:	typeQualifier
	|	typeQualifierList typeQualifier  
	;

parameterTypeList
	:	parameterList
	|	parameterList ',' '...'  
	;

parameterList
	:	parameterDeclaration
	|	parameterList ',' parameterDeclaration  
	;

parameterDeclaration
	:	declarationSpecifiers declarator 
	|	declarationSpecifiers2 abstractDeclarator?   
	;

identifierList
	:	Identifier
	|	identifierList ',' Identifier  
	;

typeName
	:	specifierQualifierList abstractDeclarator?  
	;

abstractDeclarator
	:	pointer
	|	pointer?  directAbstractDeclarator gccDeclaratorExtension*  
	;

directAbstractDeclarator
	:	'(' abstractDeclarator ')' gccDeclaratorExtension* 
	|	'[' typeQualifierList?  assignmentExpression?  ']' 
	|	'[' 'static' typeQualifierList?  assignmentExpression ']' 
	|	'[' typeQualifierList 'static' assignmentExpression ']' 
	|	'[' '*' ']' 
	|	'(' parameterTypeList?  ')' gccDeclaratorExtension* 
	|	directAbstractDeclarator '[' typeQualifierList?  assignmentExpression?  ']' 
	|	directAbstractDeclarator '[' 'static' typeQualifierList?  assignmentExpression ']' 
	|	directAbstractDeclarator '[' typeQualifierList 'static' assignmentExpression ']' 
	|	directAbstractDeclarator '[' '*' ']' 
	|	directAbstractDeclarator '(' parameterTypeList?  ')' gccDeclaratorExtension*  
	;

typedefName
	:	Identifier
	;

initializer
	:	assignmentExpression
	|	'{' initializerList '}' 
	|	'{' initializerList ',' '}'  
	;

initializerList
	:	designation?  initializer 
	|	initializerList ',' designation?  initializer  
	;

designation
	:	designatorList '=' 
	;

designatorList
	:	designator
	|	designatorList designator  
	;

designator
	:	'[' constantExpression ']' 
	|	'.' Identifier  
	;

staticAssertDeclaration
	:	'_Static_assert' '(' constantExpression ',' StringLiteral+ ')' ';' 
	;

statement
	:	labeledStatement
	|	compoundStatement
	|	expressionStatement
	|	selectionStatement
	|	iterationStatement
	|	jumpStatement
	|	( '__asm'|'__asm__')  ( 'volatile'|'__volatile__')  '(' ( logicalOrExpression ( ',' logicalOrExpression  ) *  ) ?  ( ':' ( logicalOrExpression ( ',' logicalOrExpression  ) *  ) ?   ) * ')' ';'  
	;

labeledStatement
	:	Identifier ':' statement 
	|	'case' constantExpression ':' statement 
	|	'default' ':' statement  
	;

compoundStatement
	:	'{' blockItemList?  '}' 
	;

blockItemList
	:	blockItem
	|	blockItemList blockItem  
	;

blockItem
	:	declaration
	|	statement 
	;

expressionStatement
	:	expression?  ';' 
	;

selectionStatement
	:	'if' '(' expression ')' statement ( 'else' statement  ) ?  
	|	'switch' '(' expression ')' statement  
	;

iterationStatement
	:	'while' '(' expression ')' statement 
	|	'do' statement 'while' '(' expression ')' ';' 
	|	'for' '(' expression?  ';' expression?  ';' expression?  ')' statement 
	|	'for' '(' declaration expression?  ';' expression?  ')' statement  
	;

jumpStatement
	:	'goto' Identifier ';' 
	|	'continue' ';' 
	|	'break' ';' 
	|	'return' expression?  ';' 
	|	'goto' unaryExpression ';'  
	;

compilationUnit
	:	translationUnit?  EOF 
	;

translationUnit
	:	externalDeclaration
	|	translationUnit externalDeclaration  
	;

externalDeclaration
	:	functionDefinition
	|	declaration
	|	';' 
	;

functionDefinition
	:	declarationSpecifiers?  declarator declarationList?  compoundStatement 
	;

declarationList
	:	declaration
	|	declarationList declaration  
	;

Auto
	:	'auto'
	;

Break
	:	'break'
	;

Case
	:	'case'
	;

Char
	:	'char'
	;

Const
	:	'const'
	;

Continue
	:	'continue'
	;

Default
	:	'default'
	;

Do
	:	'do'
	;

Double
	:	'double'
	;

Else
	:	'else'
	;

Enum
	:	'enum'
	;

Extern
	:	'extern'
	;

Float
	:	'float'
	;

For
	:	'for'
	;

Goto
	:	'goto'
	;

If
	:	'if'
	;

Inline
	:	'inline'
	;

Int
	:	'int'
	;

Long
	:	'long'
	;

Register
	:	'register'
	;

Restrict
	:	'restrict'
	;

Return
	:	'return'
	;

Short
	:	'short'
	;

Signed
	:	'signed'
	;

Sizeof
	:	'sizeof'
	;

Static
	:	'static'
	;

Struct
	:	'struct'
	;

Switch
	:	'switch'
	;

Typedef
	:	'typedef'
	;

Union
	:	'union'
	;

Unsigned
	:	'unsigned'
	;

Void
	:	'void'
	;

Volatile
	:	'volatile'
	;

While
	:	'while'
	;

Alignas
	:	'_Alignas'
	;

Alignof
	:	'_Alignof'
	;

Atomic
	:	'_Atomic'
	;

Bool
	:	'_Bool'
	;

Complex
	:	'_Complex'
	;

Generic
	:	'_Generic'
	;

Imaginary
	:	'_Imaginary'
	;

Noreturn
	:	'_Noreturn'
	;

StaticAssert
	:	'_Static_assert'
	;

ThreadLocal
	:	'_Thread_local'
	;

LeftParen
	:	'('
	;

RightParen
	:	')'
	;

LeftBracket
	:	'['
	;

RightBracket
	:	']'
	;

LeftBrace
	:	'{'
	;

RightBrace
	:	'}'
	;

Less
	:	'<'
	;

LessEqual
	:	'<='
	;

Greater
	:	'>'
	;

GreaterEqual
	:	'>='
	;

LeftShift
	:	'<<'
	;

RightShift
	:	'>>'
	;

Plus
	:	'+'
	;

PlusPlus
	:	'++'
	;

Minus
	:	'-'
	;

MinusMinus
	:	'--'
	;

Star
	:	'*'
	;

Div
	:	'/'
	;

Mod
	:	'%'
	;

And
	:	'&'
	;

Or
	:	'|'
	;

AndAnd
	:	'&&'
	;

OrOr
	:	'||'
	;

Caret
	:	'^'
	;

Not
	:	'!'
	;

Tilde
	:	'~'
	;

Question
	:	'?'
	;

Colon
	:	':'
	;

Semi
	:	';'
	;

Comma
	:	','
	;

Assign
	:	'='
	;

StarAssign
	:	'*='
	;

DivAssign
	:	'/='
	;

ModAssign
	:	'%='
	;

PlusAssign
	:	'+='
	;

MinusAssign
	:	'-='
	;

LeftShiftAssign
	:	'<<='
	;

RightShiftAssign
	:	'>>='
	;

AndAssign
	:	'&='
	;

XorAssign
	:	'^='
	;

OrAssign
	:	'|='
	;

Equal
	:	'=='
	;

NotEqual
	:	'!='
	;

Arrow
	:	'->'
	;

Dot
	:	'.'
	;

Ellipsis
	:	'...'
	;

Identifier
	:	IdentifierNondigit ( IdentifierNondigit|Digit) * 
	;

IdentifierNondigit
	:	Nondigit
	|	UniversalCharacterName 
	;

Nondigit
	:	[a-zA-Z_]
	;

Digit
	:	[0-9]
	;

UniversalCharacterName
	:	'\\u' HexQuad 
	|	'\\U' HexQuad HexQuad  
	;

HexQuad
	:	HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit 
	;

Constant
	:	IntegerConstant
	|	FloatingConstant
	|	CharacterConstant 
	;

IntegerConstant
	:	DecimalConstant IntegerSuffix?  
	|	OctalConstant IntegerSuffix?  
	|	HexadecimalConstant IntegerSuffix?   
	;

DecimalConstant
	:	NonzeroDigit Digit* 
	;

OctalConstant
	:	'0' OctalDigit* 
	;

HexadecimalConstant
	:	HexadecimalPrefix HexadecimalDigit+ 
	;

HexadecimalPrefix
	:	'0' [xX] 
	;

NonzeroDigit
	:	[1-9]
	;

OctalDigit
	:	[0-7]
	;

HexadecimalDigit
	:	[0-9a-fA-F]
	;

IntegerSuffix
	:	UnsignedSuffix LongSuffix?  
	|	UnsignedSuffix LongLongSuffix 
	|	LongSuffix UnsignedSuffix?  
	|	LongLongSuffix UnsignedSuffix?   
	;

UnsignedSuffix
	:	[uU]
	;

LongSuffix
	:	[lL]
	;

LongLongSuffix
	:	'll'
	|	'LL' 
	;

FloatingConstant
	:	DecimalFloatingConstant
	|	HexadecimalFloatingConstant 
	;

DecimalFloatingConstant
	:	FractionalConstant ExponentPart?  FloatingSuffix?  
	|	DigitSequence ExponentPart FloatingSuffix?   
	;

HexadecimalFloatingConstant
	:	HexadecimalPrefix HexadecimalFractionalConstant BinaryExponentPart FloatingSuffix?  
	|	HexadecimalPrefix HexadecimalDigitSequence BinaryExponentPart FloatingSuffix?   
	;

FractionalConstant
	:	DigitSequence?  '.' DigitSequence 
	|	DigitSequence '.'  
	;

ExponentPart
	:	'e' Sign?  DigitSequence 
	|	'E' Sign?  DigitSequence  
	;

Sign
	:	'+'
	|	'-' 
	;

DigitSequence
	:	Digit+
	;

HexadecimalFractionalConstant
	:	HexadecimalDigitSequence?  '.' HexadecimalDigitSequence 
	|	HexadecimalDigitSequence '.'  
	;

BinaryExponentPart
	:	'p' Sign?  DigitSequence 
	|	'P' Sign?  DigitSequence  
	;

HexadecimalDigitSequence
	:	HexadecimalDigit+
	;

FloatingSuffix
	:	'f'
	|	'l'
	|	'F'
	|	'L' 
	;

CharacterConstant
	:	'\'' CCharSequence '\'' 
	|	'L\'' CCharSequence '\'' 
	|	'u\'' CCharSequence '\'' 
	|	'U\'' CCharSequence '\''  
	;

CCharSequence
	:	CChar+
	;

CChar
	:	~ ['\\\r\n] 
	|	EscapeSequence 
	;

EscapeSequence
	:	SimpleEscapeSequence
	|	OctalEscapeSequence
	|	HexadecimalEscapeSequence
	|	UniversalCharacterName 
	;

SimpleEscapeSequence
	:	'\\' ['"?abfnrtv\\] 
	;

OctalEscapeSequence
	:	'\\' OctalDigit 
	|	'\\' OctalDigit OctalDigit 
	|	'\\' OctalDigit OctalDigit OctalDigit  
	;

HexadecimalEscapeSequence
	:	'\\x' HexadecimalDigit+ 
	;

StringLiteral
	:	EncodingPrefix?  '"' SCharSequence?  '"' 
	;

EncodingPrefix
	:	'u8'
	|	'u'
	|	'U'
	|	'L' 
	;

SCharSequence
	:	SChar+
	;

SChar
	:	~ ["\\\r\n] 
	|	EscapeSequence 
	;

LineDirective
	:	'#' Whitespace?  DecimalConstant Whitespace?  StringLiteral ~ [\r\n] * 
	;

PragmaDirective
	:	'#' Whitespace?  'pragma' Whitespace ~ [\r\n] * 
	;

Whitespace
	:	[ \t]+
	;

Newline
	:	( '\r' '\n'?  |'\n') 
	;

BlockComment
	:	'/*' ?  '*/' 
	;

LineComment
	:	'//' ~ [\r\n] * 
	;
