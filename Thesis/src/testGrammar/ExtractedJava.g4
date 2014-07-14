grammar ExtractedJava;

compilationUnit
	:	packageDeclaration?  importDeclaration* typeDeclaration* EOF 
	;

packageDeclaration
	:	annotation* 'package' qualifiedName ';' 
	;

importDeclaration
	:	'import' 'static'?  qualifiedName ( '.' '*'  ) ?  ';' 
	;

typeDeclaration
	:	classOrInterfaceModifier* classDeclaration 
	|	classOrInterfaceModifier* enumDeclaration 
	|	classOrInterfaceModifier* interfaceDeclaration 
	|	classOrInterfaceModifier* annotationTypeDeclaration 
	|	';' 
	;

modifier
	:	classOrInterfaceModifier
	|	( 'native'|'synchronized'|'transient'|'volatile')  
	;

classOrInterfaceModifier
	:	annotation
	|	( 'public'|'protected'|'private'|'static'|'abstract'|'final'|'strictfp')  
	;

variableModifier
	:	'final'
	|	annotation 
	;

classDeclaration
	:	'class' Identifier typeParameters?  ( 'extends' type  ) ?  ( 'implements' typeList  ) ?  classBody 
	;

typeParameters
	:	'<' typeParameter ( ',' typeParameter  ) * '>' 
	;

typeParameter
	:	Identifier ( 'extends' typeBound  ) ?  
	;

typeBound
	:	type ( '&' type  ) * 
	;

enumDeclaration
	:	ENUM Identifier ( 'implements' typeList  ) ?  '{' enumConstants?  ','?  enumBodyDeclarations?  '}' 
	;

enumConstants
	:	enumConstant ( ',' enumConstant  ) * 
	;

enumConstant
	:	annotation* Identifier arguments?  classBody?  
	;

enumBodyDeclarations
	:	';' classBodyDeclaration* 
	;

interfaceDeclaration
	:	'interface' Identifier typeParameters?  ( 'extends' typeList  ) ?  interfaceBody 
	;

typeList
	:	type ( ',' type  ) * 
	;

classBody
	:	'{' classBodyDeclaration* '}' 
	;

interfaceBody
	:	'{' interfaceBodyDeclaration* '}' 
	;

classBodyDeclaration
	:	';'
	|	'static'?  block 
	|	modifier* memberDeclaration  
	;

memberDeclaration
	:	methodDeclaration
	|	genericMethodDeclaration
	|	fieldDeclaration
	|	constructorDeclaration
	|	genericConstructorDeclaration
	|	interfaceDeclaration
	|	annotationTypeDeclaration
	|	classDeclaration
	|	enumDeclaration 
	;

methodDeclaration
	:	( type|'void')  Identifier formalParameters ( '[' ']'  ) * ( 'throws' qualifiedNameList  ) ?  ( methodBody|';')  
	;

genericMethodDeclaration
	:	typeParameters methodDeclaration 
	;

constructorDeclaration
	:	Identifier formalParameters ( 'throws' qualifiedNameList  ) ?  constructorBody 
	;

genericConstructorDeclaration
	:	typeParameters constructorDeclaration 
	;

fieldDeclaration
	:	type variableDeclarators ';' 
	;

interfaceBodyDeclaration
	:	modifier* interfaceMemberDeclaration 
	|	';' 
	;

interfaceMemberDeclaration
	:	constDeclaration
	|	interfaceMethodDeclaration
	|	genericInterfaceMethodDeclaration
	|	interfaceDeclaration
	|	annotationTypeDeclaration
	|	classDeclaration
	|	enumDeclaration 
	;

constDeclaration
	:	type constantDeclarator ( ',' constantDeclarator  ) * ';' 
	;

constantDeclarator
	:	Identifier ( '[' ']'  ) * '=' variableInitializer 
	;

interfaceMethodDeclaration
	:	( type|'void')  Identifier formalParameters ( '[' ']'  ) * ( 'throws' qualifiedNameList  ) ?  ';' 
	;

genericInterfaceMethodDeclaration
	:	typeParameters interfaceMethodDeclaration 
	;

variableDeclarators
	:	variableDeclarator ( ',' variableDeclarator  ) * 
	;

variableDeclarator
	:	variableDeclaratorId ( '=' variableInitializer  ) ?  
	;

variableDeclaratorId
	:	Identifier ( '[' ']'  ) * 
	;

variableInitializer
	:	arrayInitializer
	|	expression 
	;

arrayInitializer
	:	'{' ( variableInitializer ( ',' variableInitializer  ) * ( ',' ) ?   ) ?  '}' 
	;

enumConstantName
	:	Identifier
	;

type
	:	classOrInterfaceType ( '[' ']'  ) * 
	|	primitiveType ( '[' ']'  ) *  
	;

classOrInterfaceType
	:	Identifier typeArguments?  ( '.' Identifier typeArguments?   ) * 
	;

primitiveType
	:	'boolean'
	|	'char'
	|	'byte'
	|	'short'
	|	'int'
	|	'long'
	|	'float'
	|	'double' 
	;

typeArguments
	:	'<' typeArgument ( ',' typeArgument  ) * '>' 
	;

typeArgument
	:	type
	|	'?' ( ( 'extends'|'super')  type  ) ?   
	;

qualifiedNameList
	:	qualifiedName ( ',' qualifiedName  ) * 
	;

formalParameters
	:	'(' formalParameterList?  ')' 
	;

formalParameterList
	:	formalParameter ( ',' formalParameter  ) * ( ',' lastFormalParameter  ) ?  
	|	lastFormalParameter 
	;

formalParameter
	:	variableModifier* type variableDeclaratorId 
	;

lastFormalParameter
	:	variableModifier* type '...' variableDeclaratorId 
	;

methodBody
	:	block
	;

constructorBody
	:	block
	;

qualifiedName
	:	Identifier ( '.' Identifier  ) * 
	;

literal
	:	IntegerLiteral
	|	FloatingPointLiteral
	|	CharacterLiteral
	|	StringLiteral
	|	BooleanLiteral
	|	'null' 
	;

annotation
	:	'@' annotationName ( '(' ( elementValuePairs|elementValue) ?  ')'  ) ?  
	;

annotationName
	:	qualifiedName
	;

elementValuePairs
	:	elementValuePair ( ',' elementValuePair  ) * 
	;

elementValuePair
	:	Identifier '=' elementValue 
	;

elementValue
	:	expression
	|	annotation
	|	elementValueArrayInitializer 
	;

elementValueArrayInitializer
	:	'{' ( elementValue ( ',' elementValue  ) *  ) ?  ( ',' ) ?  '}' 
	;

annotationTypeDeclaration
	:	'@' 'interface' Identifier annotationTypeBody 
	;

annotationTypeBody
	:	'{' ( annotationTypeElementDeclaration ) * '}' 
	;

annotationTypeElementDeclaration
	:	modifier* annotationTypeElementRest 
	|	';' 
	;

annotationTypeElementRest
	:	type annotationMethodOrConstantRest ';' 
	|	classDeclaration ';'?  
	|	interfaceDeclaration ';'?  
	|	enumDeclaration ';'?  
	|	annotationTypeDeclaration ';'?   
	;

annotationMethodOrConstantRest
	:	annotationMethodRest
	|	annotationConstantRest 
	;

annotationMethodRest
	:	Identifier '(' ')' defaultValue?  
	;

annotationConstantRest
	:	variableDeclarators
	;

defaultValue
	:	'default' elementValue 
	;

block
	:	'{' blockStatement* '}' 
	;

blockStatement
	:	localVariableDeclarationStatement
	|	statement
	|	typeDeclaration 
	;

localVariableDeclarationStatement
	:	localVariableDeclaration ';' 
	;

localVariableDeclaration
	:	variableModifier* type variableDeclarators 
	;

statement
	:	block
	|	ASSERT expression ( ':' expression  ) ?  ';' 
	|	'if' parExpression statement ( 'else' statement  ) ?  
	|	'for' '(' forControl ')' statement 
	|	'while' parExpression statement 
	|	'do' statement 'while' parExpression ';' 
	|	'try' block ( catchClause+ finallyBlock?  |finallyBlock)  
	|	'try' resourceSpecification block catchClause* finallyBlock?  
	|	'switch' parExpression '{' switchBlockStatementGroup* switchLabel* '}' 
	|	'synchronized' parExpression block 
	|	'return' expression?  ';' 
	|	'throw' expression ';' 
	|	'break' Identifier?  ';' 
	|	'continue' Identifier?  ';' 
	|	';'
	|	statementExpression ';' 
	|	Identifier ':' statement  
	;

catchClause
	:	'catch' '(' variableModifier* catchType Identifier ')' block 
	;

catchType
	:	qualifiedName ( '|' qualifiedName  ) * 
	;

finallyBlock
	:	'finally' block 
	;

resourceSpecification
	:	'(' resources ';'?  ')' 
	;

resources
	:	resource ( ';' resource  ) * 
	;

resource
	:	variableModifier* classOrInterfaceType variableDeclaratorId '=' expression 
	;

switchBlockStatementGroup
	:	switchLabel+ blockStatement+ 
	;

switchLabel
	:	'case' constantExpression ':' 
	|	'case' enumConstantName ':' 
	|	'default' ':'  
	;

forControl
	:	enhancedForControl
	|	forInit?  ';' expression?  ';' forUpdate?   
	;

forInit
	:	localVariableDeclaration
	|	expressionList 
	;

enhancedForControl
	:	variableModifier* type variableDeclaratorId ':' expression 
	;

forUpdate
	:	expressionList
	;

parExpression
	:	'(' expression ')' 
	;

expressionList
	:	expression ( ',' expression  ) * 
	;

statementExpression
	:	expression
	;

constantExpression
	:	expression
	;

expression
	:	primary
	|	expression '.' Identifier 
	|	expression '.' 'this' 
	|	expression '.' 'new' nonWildcardTypeArguments?  innerCreator 
	|	expression '.' 'super' superSuffix 
	|	expression '.' explicitGenericInvocation 
	|	expression '[' expression ']' 
	|	expression '(' expressionList?  ')' 
	|	'new' creator 
	|	'(' type ')' expression 
	|	expression ( '++'|'--')  
	|	( '+'|'-'|'++'|'--')  expression 
	|	( '~'|'!')  expression 
	|	expression ( '*'|'/'|'%')  expression 
	|	expression ( '+'|'-')  expression 
	|	expression ( '<' '<' |'>' '>' '>' |'>' '>' )  expression 
	|	expression ( '<='|'>='|'>'|'<')  expression 
	|	expression 'instanceof' type 
	|	expression ( '=='|'!=')  expression 
	|	expression '&' expression 
	|	expression '^' expression 
	|	expression '|' expression 
	|	expression '&&' expression 
	|	expression '||' expression 
	|	expression '?' expression ':' expression 
	|	expression ( '='|'+='|'-='|'*='|'/='|'&='|'|='|'^='|'>>='|'>>>='|'<<='|'%=')  expression  
	;

primary
	:	'(' expression ')' 
	|	'this'
	|	'super'
	|	literal
	|	Identifier
	|	type '.' 'class' 
	|	'void' '.' 'class' 
	|	nonWildcardTypeArguments ( explicitGenericInvocationSuffix|'this' arguments )   
	;

creator
	:	nonWildcardTypeArguments createdName classCreatorRest 
	|	createdName ( arrayCreatorRest|classCreatorRest)   
	;

createdName
	:	Identifier typeArgumentsOrDiamond?  ( '.' Identifier typeArgumentsOrDiamond?   ) * 
	|	primitiveType 
	;

innerCreator
	:	Identifier nonWildcardTypeArgumentsOrDiamond?  classCreatorRest 
	;

arrayCreatorRest
	:	'[' ( ']' ( '[' ']'  ) * arrayInitializer |expression ']' ( '[' expression ']'  ) * ( '[' ']'  ) * )  
	;

classCreatorRest
	:	arguments classBody?  
	;

explicitGenericInvocation
	:	nonWildcardTypeArguments explicitGenericInvocationSuffix 
	;

nonWildcardTypeArguments
	:	'<' typeList '>' 
	;

typeArgumentsOrDiamond
	:	'<' '>' 
	|	typeArguments 
	;

nonWildcardTypeArgumentsOrDiamond
	:	'<' '>' 
	|	nonWildcardTypeArguments 
	;

superSuffix
	:	arguments
	|	'.' Identifier arguments?   
	;

explicitGenericInvocationSuffix
	:	'super' superSuffix 
	|	Identifier arguments  
	;

arguments
	:	'(' expressionList?  ')' 
	;

ABSTRACT
	:	'abstract'
	;

ASSERT
	:	'assert'
	;

BOOLEAN
	:	'boolean'
	;

BREAK
	:	'break'
	;

BYTE
	:	'byte'
	;

CASE
	:	'case'
	;

CATCH
	:	'catch'
	;

CHAR
	:	'char'
	;

CLASS
	:	'class'
	;

CONST
	:	'const'
	;

CONTINUE
	:	'continue'
	;

DEFAULT
	:	'default'
	;

DO
	:	'do'
	;

DOUBLE
	:	'double'
	;

ELSE
	:	'else'
	;

ENUM
	:	'enum'
	;

EXTENDS
	:	'extends'
	;

FINAL
	:	'final'
	;

FINALLY
	:	'finally'
	;

FLOAT
	:	'float'
	;

FOR
	:	'for'
	;

IF
	:	'if'
	;

GOTO
	:	'goto'
	;

IMPLEMENTS
	:	'implements'
	;

IMPORT
	:	'import'
	;

INSTANCEOF
	:	'instanceof'
	;

INT
	:	'int'
	;

INTERFACE
	:	'interface'
	;

LONG
	:	'long'
	;

NATIVE
	:	'native'
	;

NEW
	:	'new'
	;

PACKAGE
	:	'package'
	;

PRIVATE
	:	'private'
	;

PROTECTED
	:	'protected'
	;

PUBLIC
	:	'public'
	;

RETURN
	:	'return'
	;

SHORT
	:	'short'
	;

STATIC
	:	'static'
	;

STRICTFP
	:	'strictfp'
	;

SUPER
	:	'super'
	;

SWITCH
	:	'switch'
	;

SYNCHRONIZED
	:	'synchronized'
	;

THIS
	:	'this'
	;

THROW
	:	'throw'
	;

THROWS
	:	'throws'
	;

TRANSIENT
	:	'transient'
	;

TRY
	:	'try'
	;

VOID
	:	'void'
	;

VOLATILE
	:	'volatile'
	;

WHILE
	:	'while'
	;

IntegerLiteral
	:	DecimalIntegerLiteral
	|	HexIntegerLiteral
	|	OctalIntegerLiteral
	|	BinaryIntegerLiteral 
	;

DecimalIntegerLiteral
	:	DecimalNumeral IntegerTypeSuffix?  
	;

HexIntegerLiteral
	:	HexNumeral IntegerTypeSuffix?  
	;

OctalIntegerLiteral
	:	OctalNumeral IntegerTypeSuffix?  
	;

BinaryIntegerLiteral
	:	BinaryNumeral IntegerTypeSuffix?  
	;

IntegerTypeSuffix
	:	[lL]
	;

DecimalNumeral
	:	'0'
	|	NonZeroDigit ( Digits? |Underscores Digits )   
	;

Digits
	:	Digit ( DigitOrUnderscore* Digit  ) ?  
	;

Digit
	:	'0'
	|	NonZeroDigit 
	;

NonZeroDigit
	:	[1-9]
	;

DigitOrUnderscore
	:	Digit
	|	'_' 
	;

Underscores
	:	'_'+
	;

HexNumeral
	:	'0' [xX] HexDigits 
	;

HexDigits
	:	HexDigit ( HexDigitOrUnderscore* HexDigit  ) ?  
	;

HexDigit
	:	[0-9a-fA-F]
	;

HexDigitOrUnderscore
	:	HexDigit
	|	'_' 
	;

OctalNumeral
	:	'0' Underscores?  OctalDigits 
	;

OctalDigits
	:	OctalDigit ( OctalDigitOrUnderscore* OctalDigit  ) ?  
	;

OctalDigit
	:	[0-7]
	;

OctalDigitOrUnderscore
	:	OctalDigit
	|	'_' 
	;

BinaryNumeral
	:	'0' [bB] BinaryDigits 
	;

BinaryDigits
	:	BinaryDigit ( BinaryDigitOrUnderscore* BinaryDigit  ) ?  
	;

BinaryDigit
	:	[01]
	;

BinaryDigitOrUnderscore
	:	BinaryDigit
	|	'_' 
	;

FloatingPointLiteral
	:	DecimalFloatingPointLiteral
	|	HexadecimalFloatingPointLiteral 
	;

DecimalFloatingPointLiteral
	:	Digits '.' Digits?  ExponentPart?  FloatTypeSuffix?  
	|	'.' Digits ExponentPart?  FloatTypeSuffix?  
	|	Digits ExponentPart FloatTypeSuffix?  
	|	Digits FloatTypeSuffix  
	;

ExponentPart
	:	ExponentIndicator SignedInteger 
	;

ExponentIndicator
	:	[eE]
	;

SignedInteger
	:	Sign?  Digits 
	;

Sign
	:	[+-]
	;

FloatTypeSuffix
	:	[fFdD]
	;

HexadecimalFloatingPointLiteral
	:	HexSignificand BinaryExponent FloatTypeSuffix?  
	;

HexSignificand
	:	HexNumeral '.'?  
	|	'0' [xX] HexDigits?  '.' HexDigits  
	;

BinaryExponent
	:	BinaryExponentIndicator SignedInteger 
	;

BinaryExponentIndicator
	:	[pP]
	;

BooleanLiteral
	:	'true'
	|	'false' 
	;

CharacterLiteral
	:	'\'' SingleCharacter '\'' 
	|	'\'' EscapeSequence '\''  
	;

SingleCharacter
	:	~ ['\\] 
	;

StringLiteral
	:	'"' StringCharacters?  '"' 
	;

StringCharacters
	:	StringCharacter+
	;

StringCharacter
	:	~ ["\\] 
	|	EscapeSequence 
	;

EscapeSequence
	:	'\\' [btnfr"'\\] 
	|	OctalEscape
	|	UnicodeEscape 
	;

OctalEscape
	:	'\\' OctalDigit 
	|	'\\' OctalDigit OctalDigit 
	|	'\\' ZeroToThree OctalDigit OctalDigit  
	;

UnicodeEscape
	:	'\\' 'u' HexDigit HexDigit HexDigit HexDigit 
	;

ZeroToThree
	:	[0-3]
	;

NullLiteral
	:	'null'
	;

LPAREN
	:	'('
	;

RPAREN
	:	')'
	;

LBRACE
	:	'{'
	;

RBRACE
	:	'}'
	;

LBRACK
	:	'['
	;

RBRACK
	:	']'
	;

SEMI
	:	';'
	;

COMMA
	:	','
	;

DOT
	:	'.'
	;

ASSIGN
	:	'='
	;

GT
	:	'>'
	;

LT
	:	'<'
	;

BANG
	:	'!'
	;

TILDE
	:	'~'
	;

QUESTION
	:	'?'
	;

COLON
	:	':'
	;

EQUAL
	:	'=='
	;

LE
	:	'<='
	;

GE
	:	'>='
	;

NOTEQUAL
	:	'!='
	;

AND
	:	'&&'
	;

OR
	:	'||'
	;

INC
	:	'++'
	;

DEC
	:	'--'
	;

ADD
	:	'+'
	;

SUB
	:	'-'
	;

MUL
	:	'*'
	;

DIV
	:	'/'
	;

BITAND
	:	'&'
	;

BITOR
	:	'|'
	;

CARET
	:	'^'
	;

MOD
	:	'%'
	;

ADD_ASSIGN
	:	'+='
	;

SUB_ASSIGN
	:	'-='
	;

MUL_ASSIGN
	:	'*='
	;

DIV_ASSIGN
	:	'/='
	;

AND_ASSIGN
	:	'&='
	;

OR_ASSIGN
	:	'|='
	;

XOR_ASSIGN
	:	'^='
	;

MOD_ASSIGN
	:	'%='
	;

LSHIFT_ASSIGN
	:	'<<='
	;

RSHIFT_ASSIGN
	:	'>>='
	;

URSHIFT_ASSIGN
	:	'>>>='
	;

Identifier
	:	JavaLetter JavaLetterOrDigit* 
	;

JavaLetter
	:	[a-zA-Z$_]
	|	~ [\u0000-\u00FF\uD800-\uDBFF]   
	|	[\uD800-\uDBFF] [\uDC00-\uDFFF]   
	;

JavaLetterOrDigit
	:	[a-zA-Z0-9$_]
	|	~ [\u0000-\u00FF\uD800-\uDBFF]   
	|	[\uD800-\uDBFF] [\uDC00-\uDFFF]   
	;

AT
	:	'@'
	;

ELLIPSIS
	:	'...'
	;

WS
	:	[ \t\r\n\u000C]+
	;

COMMENT
	:	'/*' ?  '*/' 
	;

LINE_COMMENT
	:	'//' ~ [\r\n] * 
	;
