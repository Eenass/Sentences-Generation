grammar ExtractedObjC;

translation_unit
	:	external_declaration+ EOF 
	;

external_declaration
	:	COMMENT
	|	LINE_COMMENT
	|	preprocessor_declaration
	|	function_definition
	|	declaration
	|	class_interface
	|	class_implementation
	|	category_interface
	|	category_implementation
	|	protocol_declaration
	|	protocol_declaration_list
	|	class_declaration_list 
	;

preprocessor_declaration
	:	IMPORT
	|	INCLUDE 
	;

class_interface
	:	'@interface' class_name ( ':' superclass_name  ) ?  protocol_reference_list?  instance_variables?  interface_declaration_list?  '@end' 
	;

category_interface
	:	'@interface' class_name '(' category_name?  ')' protocol_reference_list?  instance_variables?  interface_declaration_list?  '@end' 
	;

class_implementation
	:	'@implementation' ( class_name ( ':' superclass_name  ) ?  instance_variables?  ( implementation_definition_list ) ?   )  '@end' 
	;

category_implementation
	:	'@implementation' ( class_name '(' category_name ')' ( implementation_definition_list ) ?   )  '@end' 
	;

protocol_declaration
	:	'@protocol' ( protocol_name ( protocol_reference_list ) ?  interface_declaration_list?  '@optional'?  interface_declaration_list?   )  '@end' 
	;

protocol_declaration_list
	:	( '@protocol' protocol_list ';'  ) 
	;

class_declaration_list
	:	( '@class' class_list ';'  ) 
	;

class_list
	:	class_name ( ',' class_name  ) * 
	;

protocol_reference_list
	:	( '<' protocol_list '>'  ) 
	;

protocol_list
	:	protocol_name ( ',' protocol_name  ) * 
	;

property_declaration
	:	'@property' property_attributes_declaration?  struct_declaration 
	;

property_attributes_declaration
	:	'(' property_attributes_list ')' 
	;

property_attributes_list
	:	property_attribute ( ',' property_attribute  ) * 
	;

property_attribute
	:	'nonatomic'
	|	'assign'
	|	'weak'
	|	'strong'
	|	'retain'
	|	'readonly'
	|	'readwrite'
	|	
	|	'getter' '=' IDENTIFIER 
	|	'setter' '=' IDENTIFIER ':' 
	|	IDENTIFIER 
	;

class_name
	:	IDENTIFIER
	;

superclass_name
	:	IDENTIFIER
	;

category_name
	:	IDENTIFIER
	;

protocol_name
	:	IDENTIFIER
	;

instance_variables
	:	'{' struct_declaration* '}' 
	|	'{' visibility_specification struct_declaration+ '}' 
	|	'{' struct_declaration+ instance_variables '}' 
	|	'{' visibility_specification struct_declaration+ instance_variables '}'  
	;

visibility_specification
	:	'@private'
	|	'@protected'
	|	'@package'
	|	'@public' 
	;

interface_declaration_list
	:	( declaration|class_method_declaration|instance_method_declaration|property_declaration) +
	;

class_method_declaration
	:	( '+' method_declaration  ) 
	;

instance_method_declaration
	:	( '-' method_declaration  ) 
	;

method_declaration
	:	( method_type ) ?  method_selector ';' 
	;

implementation_definition_list
	:	( function_definition|declaration|class_method_definition|instance_method_definition|property_implementation) +
	;

class_method_definition
	:	( '+' method_definition  ) 
	;

instance_method_definition
	:	( '-' method_definition  ) 
	;

method_definition
	:	( method_type ) ?  method_selector ( init_declarator_list ) ?  ';'?  compound_statement 
	;

method_selector
	:	selector
	|	( keyword_declarator+ ( parameter_list ) ?   )  
	;

keyword_declarator
	:	selector?  ':' method_type* IDENTIFIER 
	;

selector
	:	IDENTIFIER
	;

method_type
	:	'(' type_name ')' 
	;

property_implementation
	:	'@synthesize' property_synthesize_list ';' 
	|	'@dynamic' property_synthesize_list ';'  
	;

property_synthesize_list
	:	property_synthesize_item ( ',' property_synthesize_item  ) * 
	;

property_synthesize_item
	:	IDENTIFIER
	|	IDENTIFIER '=' IDENTIFIER  
	;

block_type
	:	type_specifier '(' '^' type_specifier?  ')' block_parameters?  
	;

type_specifier
	:	'void'
	|	'char'
	|	'short'
	|	'int'
	|	'long'
	|	'float'
	|	'double'
	|	'signed'
	|	'unsigned'
	|	( 'id' ( protocol_reference_list ) ?   ) 
	|	( class_name ( protocol_reference_list ) ?   ) 
	|	struct_or_union_specifier
	|	enum_specifier
	|	IDENTIFIER
	|	IDENTIFIER pointer  
	;

type_qualifier
	:	'const'
	|	'volatile'
	|	protocol_qualifier 
	;

protocol_qualifier
	:	'in'
	|	'out'
	|	'inout'
	|	'bycopy'
	|	'byref'
	|	'oneway' 
	;

primary_expression
	:	IDENTIFIER
	|	constant
	|	STRING_LITERAL
	|	( '(' expression ')'  ) 
	|	'self'
	|	'super'
	|	message_expression
	|	selector_expression
	|	protocol_expression
	|	encode_expression
	|	dictionary_expression
	|	array_expression
	|	box_expression
	|	block_expression 
	;

dictionary_pair
	:	postfix_expression ':' postfix_expression 
	;

dictionary_expression
	:	'@' '{' dictionary_pair?  ( ',' dictionary_pair  ) * ','?  '}' 
	;

array_expression
	:	'@' '[' postfix_expression?  ( ',' postfix_expression  ) * ','?  ']' 
	;

box_expression
	:	'@' '(' postfix_expression ')' 
	|	'@' constant  
	;

block_parameters
	:	'(' ( type_variable_declarator|'void') ?  ( ',' type_variable_declarator  ) * ')' 
	;

block_expression
	:	'^' type_specifier?  block_parameters?  compound_statement 
	;

message_expression
	:	'[' receiver message_selector ']' 
	;

receiver
	:	expression
	|	class_name
	|	'super' 
	;

message_selector
	:	selector
	|	keyword_argument+ 
	;

keyword_argument
	:	selector?  ':' expression 
	;

selector_expression
	:	'@selector' '(' selector_name ')' 
	;

selector_name
	:	selector
	|	( selector?  ':'  ) + 
	;

protocol_expression
	:	'@protocol' '(' protocol_name ')' 
	;

encode_expression
	:	'@encode' '(' type_name ')' 
	;

type_variable_declarator
	:	declaration_specifiers declarator 
	;

try_statement
	:	'@try' compound_statement 
	;

catch_statement
	:	'@catch' '(' type_variable_declarator ')' compound_statement 
	;

finally_statement
	:	'@finally' compound_statement 
	;

throw_statement
	:	'@throw' '(' IDENTIFIER ')' 
	;

try_block
	:	try_statement ( catch_statement ) * ( finally_statement ) ?  
	;

synchronized_statement
	:	'@synchronized' '(' primary_expression ')' compound_statement 
	;

autorelease_statement
	:	'@autoreleasepool' compound_statement 
	;

function_definition
	:	declaration_specifiers?  declarator compound_statement 
	;

declaration
	:	declaration_specifiers init_declarator_list?  ';' 
	;

declaration_specifiers
	:	( arc_behaviour_specifier|storage_class_specifier|type_specifier|type_qualifier) +
	;

arc_behaviour_specifier
	:	'__unsafe_unretained'
	|	'__weak' 
	;

storage_class_specifier
	:	'auto'
	|	'register'
	|	'static'
	|	'extern'
	|	'typedef' 
	;

init_declarator_list
	:	init_declarator ( ',' init_declarator  ) * 
	;

init_declarator
	:	declarator ( '=' initializer  ) ?  
	;

struct_or_union_specifier
	:	( 'struct'|'union')  ( IDENTIFIER|IDENTIFIER?  '{' struct_declaration+ '}' )  
	;

struct_declaration
	:	specifier_qualifier_list struct_declarator_list ';' 
	;

specifier_qualifier_list
	:	( arc_behaviour_specifier|type_specifier|type_qualifier) +
	;

struct_declarator_list
	:	struct_declarator ( ',' struct_declarator  ) * 
	;

struct_declarator
	:	declarator
	|	declarator?  ':' constant  
	;

enum_specifier
	:	'enum' ( ':' type_name  ) ?  ( identifier ( '{' enumerator_list '}'  ) ?  |'{' enumerator_list '}' )  
	|	'NS_OPTIONS' '(' type_name ',' identifier ')' '{' enumerator_list '}' 
	|	'NS_ENUM' '(' type_name ',' identifier ')' '{' enumerator_list '}'  
	;

enumerator_list
	:	enumerator ( ',' enumerator  ) * ','?  
	;

enumerator
	:	identifier ( '=' constant_expression  ) ?  
	;

pointer
	:	'*' declaration_specifiers?  
	|	'*' declaration_specifiers?  pointer  
	;

declarator
	:	pointer?  direct_declarator 
	;

direct_declarator
	:	identifier declarator_suffix* 
	|	'(' declarator ')' declarator_suffix* 
	|	'(' '^' identifier?  ')' block_parameters  
	;

declarator_suffix
	:	'[' constant_expression?  ']' 
	|	'(' parameter_list?  ')'  
	;

parameter_list
	:	parameter_declaration_list ( ',' '...'  ) ?  
	;

parameter_declaration
	:	declaration_specifiers ( declarator? |abstract_declarator)  
	;

initializer
	:	assignment_expression
	|	'{' initializer ( ',' initializer  ) * ','?  '}'  
	;

type_name
	:	specifier_qualifier_list abstract_declarator 
	|	block_type 
	;

abstract_declarator
	:	pointer abstract_declarator 
	|	'(' abstract_declarator ')' abstract_declarator_suffix+ 
	|	( '[' constant_expression?  ']'  ) +
	|	 
	;

abstract_declarator_suffix
	:	'[' constant_expression?  ']' 
	|	'(' parameter_declaration_list?  ')'  
	;

parameter_declaration_list
	:	parameter_declaration ( ',' parameter_declaration  ) * 
	;

statement_list
	:	statement+
	;

statement
	:	labeled_statement
	|	expression ';' 
	|	compound_statement
	|	selection_statement
	|	iteration_statement
	|	jump_statement
	|	synchronized_statement
	|	autorelease_statement
	|	try_block
	|	';' 
	;

labeled_statement
	:	identifier ':' statement 
	|	'case' constant_expression ':' statement 
	|	'default' ':' statement  
	;

compound_statement
	:	'{' ( declaration|statement_list) * '}' 
	;

selection_statement
	:	'if' '(' expression ')' statement ( 'else' statement  ) ?  
	|	'switch' '(' expression ')' statement  
	;

for_in_statement
	:	'for' '(' type_variable_declarator 'in' expression?  ')' statement 
	;

for_statement
	:	'for' '(' ( ( declaration_specifiers init_declarator_list  ) |expression) ?  ';' expression?  ';' expression?  ')' statement 
	;

while_statement
	:	'while' '(' expression ')' statement 
	;

do_statement
	:	'do' statement 'while' '(' expression ')' ';' 
	;

iteration_statement
	:	while_statement
	|	do_statement
	|	for_statement
	|	for_in_statement 
	;

jump_statement
	:	'goto' identifier ';' 
	|	'continue' ';' 
	|	'break' ';' 
	|	'return' expression?  ';'  
	;

expression
	:	assignment_expression ( ',' assignment_expression  ) * 
	;

assignment_expression
	:	conditional_expression
	|	unary_expression assignment_operator assignment_expression  
	;

assignment_operator
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

conditional_expression
	:	logical_or_expression ( '?' conditional_expression ':' conditional_expression  ) ?  
	;

constant_expression
	:	conditional_expression
	;

logical_or_expression
	:	logical_and_expression ( '||' logical_and_expression  ) * 
	;

logical_and_expression
	:	inclusive_or_expression ( '&&' inclusive_or_expression  ) * 
	;

inclusive_or_expression
	:	exclusive_or_expression ( '|' exclusive_or_expression  ) * 
	;

exclusive_or_expression
	:	and_expression ( '^' and_expression  ) * 
	;

and_expression
	:	equality_expression ( '&' equality_expression  ) * 
	;

equality_expression
	:	relational_expression ( ( '!='|'==')  relational_expression  ) * 
	;

relational_expression
	:	shift_expression ( ( '<'|'>'|'<='|'>=')  shift_expression  ) * 
	;

shift_expression
	:	additive_expression ( ( '<<'|'>>')  additive_expression  ) * 
	;

additive_expression
	:	multiplicative_expression ( ( '+'|'-')  multiplicative_expression  ) * 
	;

multiplicative_expression
	:	cast_expression ( ( '*'|'/'|'%')  cast_expression  ) * 
	;

cast_expression
	:	'(' type_name ')' cast_expression 
	|	unary_expression 
	;

unary_expression
	:	postfix_expression
	|	'++' unary_expression 
	|	'--' unary_expression 
	|	unary_operator cast_expression 
	|	'sizeof' ( '(' type_name ')' |unary_expression)   
	;

unary_operator
	:	'&'
	|	'*'
	|	'-'
	|	'~'
	|	'!' 
	;

postfix_expression
	:	primary_expression ( '[' expression ']' |'(' argument_expression_list?  ')' |'.' identifier |'->' identifier |'++'|'--') * 
	;

argument_expression_list
	:	assignment_expression ( ',' assignment_expression  ) * 
	;

identifier
	:	IDENTIFIER
	;

constant
	:	DECIMAL_LITERAL
	|	HEX_LITERAL
	|	OCTAL_LITERAL
	|	CHARACTER_LITERAL
	|	FLOATING_POINT_LITERAL 
	;

AUTORELEASEPOOL
	:	'@autoreleasepool'
	;

CATCH
	:	'@catch'
	;

CLASS
	:	'@class'
	;

DYNAMIC
	:	'@dynamic'
	;

ENCODE
	:	'@encode'
	;

END
	:	'@end'
	;

FINALLY
	:	'@finally'
	;

IMPLEMENTATION
	:	'@implementation'
	;

INTERFACE
	:	'@interface'
	;

PACKAGE
	:	'@package'
	;

PROTOCOL
	:	'@protocol'
	;

OPTIONAL
	:	'@optional'
	;

PRIVATE
	:	'@private'
	;

PROPERTY
	:	'@property'
	;

PROTECTED
	:	'@protected'
	;

PUBLIC
	:	'@public'
	;

SELECTOR
	:	'@selector'
	;

SYNCHRONIZED
	:	'@synchronized'
	;

SYNTHESIZE
	:	'@synthesize'
	;

THROW
	:	'@throw'
	;

TRY
	:	'@try'
	;

SUPER
	:	'super'
	;

SELF
	:	'self'
	;

ABSTRACT
	:	'abstract'
	;

AUTO
	:	'auto'
	;

BOOLEAN
	:	'boolean'
	;

BREAK
	:	'break'
	;

BYCOPY
	:	'bycopy'
	;

BYREF
	:	'byref'
	;

CASE
	:	'case'
	;

CHAR
	:	'char'
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

EXTERN
	:	'extern'
	;

FLOAT
	:	'float'
	;

FOR
	:	'for'
	;

ID
	:	'id'
	;

IF
	:	'if'
	;

IN
	:	'in'
	;

INOUT
	:	'inout'
	;

GOTO
	:	'goto'
	;

INT
	:	'int'
	;

LONG
	:	'long'
	;

ONEWAY
	:	'oneway'
	;

OUT
	:	'out'
	;

REGISTER
	:	'register'
	;

RETURN
	:	'return'
	;

SHORT
	:	'short'
	;

SIGNED
	:	'signed'
	;

SIZEOF
	:	'sizeof'
	;

STATIC
	:	'static'
	;

STRUCT
	:	'struct'
	;

SWITCH
	:	'switch'
	;

TYPEDEF
	:	'typedef'
	;

UNION
	:	'union'
	;

UNSIGNED
	:	'unsigned'
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

NS_OPTIONS
	:	'NS_OPTIONS'
	;

NS_ENUM
	:	'NS_ENUM'
	;

WWEAK
	:	'__weak'
	;

WUNSAFE_UNRETAINED
	:	'__unsafe_unretained'
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

STRUCTACCESS
	:	'->'
	;

AT
	:	'@'
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

SHIFT_R
	:	'>>'
	;

SHIFT_L
	:	'<<'
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

ELIPSIS
	:	'...'
	;

ASSIGNPA
	:	'assign'
	;

GETTER
	:	'getter'
	;

NONATOMIC
	:	'nonatomic'
	;

SETTER
	:	'setter'
	;

STRONG
	:	'strong'
	;

RETAIN
	:	'retain'
	;

READONLY
	:	'readonly'
	;

READWRITE
	:	'readwrite'
	;

WEAK
	:	'weak'
	;

IDENTIFIER
	:	LETTER  
	;

LETTER
	:	'$'
	|	'A'
	|	'a'
	|	'_' 
	;

CHARACTER_LITERAL
	:	'\'' ( EscapeSequence|~ ( '\''|'\\')  )  '\'' 
	;

STRING_LITERAL
	:	'L' STRING 
	;

STRING
	:	'"'  '"' 
	;

HEX_LITERAL
	:	'0' ( 'x'|'X')  HexDigit  
	;

DECIMAL_LITERAL
	:	( '0'|'1'  )   
	;

OCTAL_LITERAL
	:	'0' ( '0' )   
	;

HexDigit
	:	( '0'|'a'|'A') 
	;

IntegerTypeSuffix
	:	( 'u'|'U'|'l'|'L') 
	;

FLOATING_POINT_LITERAL
	:	( '0' )     
	;

Exponent
	:	( 'e'|'E')   ( '0' )  
	;

FloatTypeSuffix
	:	( 'f'|'F'|'d'|'D') 
	;

EscapeSequence
	:	'\\' ( 'b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')  
	|	OctalEscape 
	;

OctalEscape
	:	'\\' ( '0' )  ( '0' )  ( '0' )  
	|	'\\' ( '0' )  ( '0' )  
	|	'\\' ( '0' )   
	;

UnicodeEscape
	:	'\\' 'u' HexDigit HexDigit HexDigit HexDigit 
	;

IMPORT
	:	'#import'  ( STRING|ANGLE_STRING)  WS 
	;

INCLUDE
	:	'#include'  ( STRING|ANGLE_STRING)  WS 
	;

PRAGMA
	:	'#pragma'  
	;

ANGLE_STRING
	:	'<'  '>' 
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

HDEFINE
	:	'#define'  
	;

HIF
	:	'#if'  
	;

HELSE
	:	'#else'  
	;

HUNDEF
	:	'#undef'  
	;

HIFNDEF
	:	'#ifndef'  
	;

HENDIF
	:	'#endif'  
	;
