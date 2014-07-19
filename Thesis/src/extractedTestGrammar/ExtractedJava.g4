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
	:	DecimalNumeral  
	;

HexIntegerLiteral
	:	HexNumeral  
	;

OctalIntegerLiteral
	:	OctalNumeral  
	;

BinaryIntegerLiteral
	:	BinaryNumeral  
	;

IntegerTypeSuffix
	:	'l'
	;

DecimalNumeral
	:	'0'
	|	NonZeroDigit ( Underscores Digits )   
	;

Digits
	:	Digit  
	;

Digit
	:	'0'
	|	NonZeroDigit 
	;

NonZeroDigit
	:	'1'
	;

DigitOrUnderscore
	:	Digit
	|	'_' 
	;

Underscores
	:	'_'
	;

HexNumeral
	:	'0' 'x' HexDigits 
	;

HexDigits
	:	HexDigit  
	;

HexDigit
	:	'0'
	;

HexDigitOrUnderscore
	:	HexDigit
	|	'_' 
	;

OctalNumeral
	:	'0'  OctalDigits 
	;

OctalDigits
	:	OctalDigit  
	;

OctalDigit
	:	'0'
	;

OctalDigitOrUnderscore
	:	OctalDigit
	|	'_' 
	;

BinaryNumeral
	:	'0' 'b' BinaryDigits 
	;

BinaryDigits
	:	BinaryDigit  
	;

BinaryDigit
	:	'0'
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
	:	Digits '.'    
	|	'.' Digits   
	|	Digits ExponentPart  
	|	Digits FloatTypeSuffix  
	;

ExponentPart
	:	ExponentIndicator SignedInteger 
	;

ExponentIndicator
	:	'e'
	;

SignedInteger
	:	 Digits 
	;

Sign
	:	'+'
	;

FloatTypeSuffix
	:	'f'
	;

HexadecimalFloatingPointLiteral
	:	HexSignificand BinaryExponent  
	;

HexSignificand
	:	HexNumeral  
	|	'0' 'x'  '.' HexDigits  
	;

BinaryExponent
	:	BinaryExponentIndicator SignedInteger 
	;

BinaryExponentIndicator
	:	'p'
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
	:	~ '\'\\' 
	;

StringLiteral
	:	'"'  '"' 
	;

StringCharacters
	:	StringCharacter
	;

StringCharacter
	:	~ '"\\' 
	|	EscapeSequence 
	;

EscapeSequence
	:	'\\' 'b' 
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
	:	'0'
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
	:	JavaLetter  
	;

JavaLetter
	:	'a'
	|	~ '\u0000'   
	|	'\uD800' '\uDC00'   
	;

JavaLetterOrDigit
	:	'a'
	|	~ '\u0000'   
	|	'\uD800' '\uDC00'   
	;

AT
	:	'@'
	;

ELLIPSIS
	:	'...'
	;

WS
	:	'\n'
	;

COMMENT
	:	'/*'  '*/' 
	;

LINE_COMMENT
	:	'//'  
	;
