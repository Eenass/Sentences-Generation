grammar ExtractedWebIDL;

webIDL
	:	definitions EOF 
	;

definitions
	:	extendedAttributeList definition definitions 
	|	 
	;

definition
	:	callbackOrInterface
	|	partial
	|	dictionary
	|	exception
	|	enum_
	|	typedef
	|	implementsStatement 
	;

callbackOrInterface
	:	'callback' callbackRestOrInterface 
	|	interface_ 
	;

callbackRestOrInterface
	:	callbackRest
	|	interface_ 
	;

interface_
	:	'interface' IDENTIFIER_WEBIDL inheritance '{' interfaceMembers '}' ';' 
	;

partial
	:	'partial' partialDefinition 
	;

partialDefinition
	:	partialInterface
	|	partialDictionary 
	;

partialInterface
	:	'interface' IDENTIFIER_WEBIDL '{' interfaceMembers '}' ';' 
	;

interfaceMembers
	:	extendedAttributeList interfaceMember interfaceMembers 
	|	 
	;

interfaceMember
	:	const_
	|	attributeOrOperationOrIterator 
	;

dictionary
	:	'dictionary' IDENTIFIER_WEBIDL inheritance '{' dictionaryMembers '}' ';' 
	;

dictionaryMembers
	:	extendedAttributeList dictionaryMember dictionaryMembers 
	|	 
	;

dictionaryMember
	:	type IDENTIFIER_WEBIDL default_ ';' 
	;

partialDictionary
	:	'dictionary' IDENTIFIER_WEBIDL '{' dictionaryMembers '}' ';' 
	;

default_
	:	'=' defaultValue 
	|	 
	;

defaultValue
	:	constValue
	|	STRING_WEBIDL 
	;

exception
	:	'exception' IDENTIFIER_WEBIDL inheritance '{' exceptionMembers '}' ';' 
	;

exceptionMembers
	:	extendedAttributeList exceptionMember exceptionMembers 
	|	 
	;

inheritance
	:	':' IDENTIFIER_WEBIDL 
	|	 
	;

enum_
	:	'enum' IDENTIFIER_WEBIDL '{' enumValueList '}' ';' 
	;

enumValueList
	:	STRING_WEBIDL enumValueListComma 
	;

enumValueListComma
	:	',' enumValueListString 
	|	 
	;

enumValueListString
	:	STRING_WEBIDL enumValueListComma 
	|	 
	;

callbackRest
	:	IDENTIFIER_WEBIDL '=' returnType '(' argumentList ')' ';' 
	;

typedef
	:	'typedef' extendedAttributeList type IDENTIFIER_WEBIDL ';' 
	;

implementsStatement
	:	IDENTIFIER_WEBIDL 'implements' IDENTIFIER_WEBIDL ';' 
	;

const_
	:	'const' constType IDENTIFIER_WEBIDL '=' constValue ';' 
	;

constValue
	:	booleanLiteral
	|	floatLiteral
	|	INTEGER_WEBIDL
	|	'null' 
	;

booleanLiteral
	:	'true'
	|	'false' 
	;

floatLiteral
	:	FLOAT_WEBIDL
	|	'-Infinity'
	|	'Infinity'
	|	'NaN' 
	;

attributeOrOperationOrIterator
	:	serializer
	|	stringifier
	|	staticMember
	|	attribute
	|	operationOrIterator 
	;

serializer
	:	'serializer' serializerRest 
	;

serializerRest
	:	operationRest
	|	'=' serializationPattern 
	|	 
	;

serializationPattern
	:	'{' serializationPatternMap '}' 
	|	'[' serializationPatternList ']' 
	|	IDENTIFIER_WEBIDL 
	;

serializationPatternMap
	:	'getter'
	|	'inherit' identifiers 
	|	IDENTIFIER_WEBIDL identifiers 
	|	 
	;

serializationPatternList
	:	'getter'
	|	IDENTIFIER_WEBIDL identifiers 
	|	 
	;

identifiers
	:	',' IDENTIFIER_WEBIDL identifiers 
	|	 
	;

stringifier
	:	'stringifier' stringifierRest 
	;

stringifierRest
	:	attributeRest
	|	returnType operationRest 
	|	';' 
	;

staticMember
	:	'static' staticMemberRest 
	;

staticMemberRest
	:	attributeRest
	|	returnType operationRest  
	;

attribute
	:	inherit attributeRest 
	;

attributeRest
	:	readOnly 'attribute' type IDENTIFIER_WEBIDL ';' 
	;

inherit
	:	'inherit'
	|	 
	;

readOnly
	:	'readonly'
	|	 
	;

operationOrIterator
	:	returnType operationOrIteratorRest 
	|	specialOperation 
	;

specialOperation
	:	special specials returnType operationRest 
	;

specials
	:	special specials 
	|	 
	;

special
	:	'getter'
	|	'setter'
	|	'creator'
	|	'deleter'
	|	'legacycaller' 
	;

operationOrIteratorRest
	:	iteratorRest
	|	operationRest 
	;

iteratorRest
	:	'iterator' optionalIteratorInterfaceOrObject ';' 
	;

optionalIteratorInterfaceOrObject
	:	optionalIteratorInterface
	|	'object' 
	;

optionalIteratorInterface
	:	'=' IDENTIFIER_WEBIDL 
	|	 
	;

operationRest
	:	optionalIdentifier '(' argumentList ')' ';' 
	;

optionalIdentifier
	:	IDENTIFIER_WEBIDL
	|	 
	;

argumentList
	:	argument arguments 
	|	 
	;

arguments
	:	',' argument arguments 
	|	 
	;

argument
	:	extendedAttributeList optionalOrRequiredArgument 
	;

optionalOrRequiredArgument
	:	'optional' type argumentName default_ 
	|	type ellipsis argumentName  
	;

argumentName
	:	argumentNameKeyword
	|	IDENTIFIER_WEBIDL 
	;

ellipsis
	:	'...'
	|	 
	;

exceptionMember
	:	const_
	|	exceptionField 
	;

exceptionField
	:	type IDENTIFIER_WEBIDL ';' 
	;

extendedAttributeList
	:	'[' extendedAttribute extendedAttributes ']' 
	|	 
	;

extendedAttributes
	:	',' extendedAttribute extendedAttributes 
	|	 
	;

extendedAttribute
	:	'(' extendedAttributeInner ')' extendedAttributeRest 
	|	'[' extendedAttributeInner ']' extendedAttributeRest 
	|	'{' extendedAttributeInner '}' extendedAttributeRest 
	|	other extendedAttributeRest  
	;

extendedAttributeRest
	:	extendedAttribute
	|	 
	;

extendedAttributeInner
	:	'(' extendedAttributeInner ')' extendedAttributeInner 
	|	'[' extendedAttributeInner ']' extendedAttributeInner 
	|	'{' extendedAttributeInner '}' extendedAttributeInner 
	|	otherOrComma extendedAttributeInner 
	|	 
	;

other
	:	INTEGER_WEBIDL
	|	FLOAT_WEBIDL
	|	IDENTIFIER_WEBIDL
	|	STRING_WEBIDL
	|	OTHER_WEBIDL
	|	'-'
	|	'.'
	|	'...'
	|	':'
	|	';'
	|	'<'
	|	'='
	|	'>'
	|	'?'
	|	'ByteString'
	|	'Date'
	|	'DOMString'
	|	'Infinity'
	|	'NaN'
	|	'RegExp'
	|	'any'
	|	'boolean'
	|	'byte'
	|	'double'
	|	'false'
	|	'float'
	|	'long'
	|	'null'
	|	'object'
	|	'octet'
	|	'or'
	|	'optional'
	|	'sequence'
	|	'short'
	|	'true'
	|	'unsigned'
	|	'void'
	|	argumentNameKeyword 
	;

argumentNameKeyword
	:	'attribute'
	|	'callback'
	|	'const'
	|	'creator'
	|	'deleter'
	|	'dictionary'
	|	'enum'
	|	'exception'
	|	'getter'
	|	'implements'
	|	'inherit'
	|	'interface'
	|	'legacycaller'
	|	'partial'
	|	'serializer'
	|	'setter'
	|	'static'
	|	'stringifier'
	|	'typedef'
	|	'unrestricted' 
	;

otherOrComma
	:	other
	|	',' 
	;

type
	:	singleType
	|	unionType typeSuffix  
	;

singleType
	:	nonAnyType
	|	'any' typeSuffixStartingWithArray  
	;

unionType
	:	'(' unionMemberType 'or' unionMemberType unionMemberTypes ')' 
	;

unionMemberType
	:	nonAnyType
	|	unionType typeSuffix 
	|	'any' '[' ']' typeSuffix  
	;

unionMemberTypes
	:	'or' unionMemberType unionMemberTypes 
	|	 
	;

nonAnyType
	:	primitiveType typeSuffix 
	|	'ByteString' typeSuffix 
	|	'DOMString' typeSuffix 
	|	IDENTIFIER_WEBIDL typeSuffix 
	|	'sequence' '<' type '>' null_ 
	|	'object' typeSuffix 
	|	'Date' typeSuffix 
	|	'RegExp' typeSuffix  
	;

constType
	:	primitiveType null_ 
	|	IDENTIFIER_WEBIDL null_  
	;

primitiveType
	:	unsignedIntegerType
	|	unrestrictedFloatType
	|	'boolean'
	|	'byte'
	|	'octet' 
	;

unrestrictedFloatType
	:	'unrestricted' floatType 
	|	floatType 
	;

floatType
	:	'float'
	|	'double' 
	;

unsignedIntegerType
	:	'unsigned' integerType 
	|	integerType 
	;

integerType
	:	'short'
	|	'long' optionalLong  
	;

optionalLong
	:	'long'
	|	 
	;

typeSuffix
	:	'[' ']' typeSuffix 
	|	'?' typeSuffixStartingWithArray 
	|	 
	;

typeSuffixStartingWithArray
	:	'[' ']' typeSuffix 
	|	 
	;

null_
	:	'?'
	|	 
	;

returnType
	:	type
	|	'void' 
	;

extendedAttributeNoArgs
	:	IDENTIFIER_WEBIDL
	;

extendedAttributeArgList
	:	IDENTIFIER_WEBIDL '(' argumentList ')' 
	;

extendedAttributeIdent
	:	IDENTIFIER_WEBIDL '=' IDENTIFIER_WEBIDL 
	;

extendedAttributeNamedArgList
	:	IDENTIFIER_WEBIDL '=' IDENTIFIER_WEBIDL '(' argumentList ')' 
	;

extendedAttributeTypePair
	:	'(' type ',' type ')' 
	;

INTEGER_WEBIDL
	:	'-'?  ( '0' ( [Xx] [0-9A-Fa-f]+ |[0-7]*)  |[1-9] [0-9]* )  
	;

FLOAT_WEBIDL
	:	'-'?  ( ( [0-9]+ '.' [0-9]* |[0-9]* '.' [0-9]+ )  ( [Ee] [\+\-]?  [0-9]+  ) ?  |[0-9]+ [Ee] [\+\-]?  [0-9]+ )  
	;

IDENTIFIER_WEBIDL
	:	[A-Z_a-z] [0-9A-Z_a-z]* 
	;

STRING_WEBIDL
	:	'"' ~ ['"'] * '"' 
	;

WHITESPACE_WEBIDL
	:	[\t\n\r ]+
	;

COMMENT_WEBIDL
	:	( '//' ~ [\n\r] * |'/*' ( .|'\n') ?  '*/' ) +
	;

OTHER_WEBIDL
	:	~ [\t\n\r 0-9A-Z_a-z] 
	;
