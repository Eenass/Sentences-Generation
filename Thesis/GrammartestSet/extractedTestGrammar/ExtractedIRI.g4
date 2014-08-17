grammar ExtractedIRI;

parse
	:	iri EOF 
	;

iri
	:	scheme ':' ihier_part ( '?' iquery  ) ?  ( '#' ifragment  ) ?  
	;

ihier_part
	:	'//' iauthority ipath_abempty 
	|	ipath_absolute
	|	ipath_rootless
	|	ipath_empty 
	;

iri_reference
	:	iri
	|	irelative_ref 
	;

absolute_iri
	:	scheme ':' ihier_part ( '?' iquery  ) ?  
	;

irelative_ref
	:	irelative_part ( '?' iquery  ) ?  ( '#' ifragment  ) ?  
	;

irelative_part
	:	'//' iauthority ipath_abempty 
	|	ipath_absolute
	|	ipath_noscheme
	|	ipath_empty 
	;

iauthority
	:	( iuserinfo '@'  ) ?  ihost ( ':' port  ) ?  
	;

iuserinfo
	:	( iunreserved|pct_encoded|sub_delims|':') *
	;

ihost
	:	ip_literal
	|	ip_v4_address
	|	ireg_name 
	;

ireg_name
	:	( iunreserved|pct_encoded|sub_delims) *
	;

ipath
	:	ipath_abempty
	|	ipath_absolute
	|	ipath_noscheme
	|	ipath_rootless
	|	ipath_empty 
	;

ipath_abempty
	:	( '/' isegment  ) *
	;

ipath_absolute
	:	'/' ( isegment_nz ( '/' isegment  ) *  ) ?  
	;

ipath_noscheme
	:	isegment_nz_nc ( '/' isegment  ) * 
	;

ipath_rootless
	:	isegment_nz ( '/' isegment  ) * 
	;

ipath_empty
	:	
	;

isegment
	:	ipchar*
	;

isegment_nz
	:	ipchar+
	;

isegment_nz_nc
	:	( iunreserved|pct_encoded|sub_delims|'@') +
	;

ipchar
	:	iunreserved
	|	pct_encoded
	|	sub_delims
	|	( ':'|'@')  
	;

iquery
	:	( ipchar|( IPRIVATE|'/'|'?') ) *
	;

ifragment
	:	( ipchar|( '/'|'?') ) *
	;

iunreserved
	:	alpha
	|	digit
	|	( '-'|'.'|'_'|'~'|UCSCHAR)  
	;

scheme
	:	alpha ( alpha|digit|( '+'|'-'|'.') ) * 
	;

port
	:	digit*
	;

ip_literal
	:	'[' ( ip_v6_address|ip_v_future)  ']' 
	;

ip_v_future
	:	V hexdig+ '.' ( unreserved|sub_delims|':') + 
	;

ip_v6_address
	:	h16 ':' h16 ':' h16 ':' h16 ':' h16 ':' h16 ':' ls32 
	|	'::' h16 ':' h16 ':' h16 ':' h16 ':' h16 ':' ls32 
	|	h16?  '::' h16 ':' h16 ':' h16 ':' h16 ':' ls32 
	|	( ( h16 ':'  ) ?  h16  ) ?  '::' h16 ':' h16 ':' h16 ':' ls32 
	|	( ( ( h16 ':'  ) ?  h16 ':'  ) ?  h16  ) ?  '::' h16 ':' h16 ':' ls32 
	|	( ( ( ( h16 ':'  ) ?  h16 ':'  ) ?  h16 ':'  ) ?  h16  ) ?  '::' h16 ':' ls32 
	|	( ( ( ( ( h16 ':'  ) ?  h16 ':'  ) ?  h16 ':'  ) ?  h16 ':'  ) ?  h16  ) ?  '::' ls32 
	|	( ( ( ( ( ( h16 ':'  ) ?  h16 ':'  ) ?  h16 ':'  ) ?  h16 ':'  ) ?  h16 ':'  ) ?  h16  ) ?  '::' h16 
	|	( ( ( ( ( ( ( h16 ':'  ) ?  h16 ':'  ) ?  h16 ':'  ) ?  h16 ':'  ) ?  h16 ':'  ) ?  h16 ':'  ) ?  h16  ) ?  '::'  
	;

h16
	:	hexdig hexdig hexdig hexdig 
	|	hexdig hexdig hexdig 
	|	hexdig hexdig 
	|	hexdig 
	;

ls32
	:	h16 ':' h16 
	|	ip_v4_address 
	;

ip_v4_address
	:	dec_octet '.' dec_octet '.' dec_octet '.' dec_octet 
	;

dec_octet
	:	digit
	|	non_zero_digit digit 
	|	D1 digit digit 
	|	D2 ( D0|D1|D2|D3|D4)  digit 
	|	D2 D5 ( D0|D1|D2|D3|D4|D5)   
	;

pct_encoded
	:	'%' hexdig hexdig 
	;

unreserved
	:	alpha
	|	digit
	|	( '-'|'.'|'_'|'~')  
	;

reserved
	:	gen_delims
	|	sub_delims 
	;

gen_delims
	:	':'
	|	'/'
	|	'?'
	|	'#'
	|	'['
	|	']'
	|	'@' 
	;

sub_delims
	:	'!'
	|	'$'
	|	'&'
	|	'\''
	|	'('
	|	')'
	|	'*'
	|	'+'
	|	','
	|	';'
	|	'=' 
	;

alpha
	:	A
	|	B
	|	C
	|	D
	|	E
	|	F
	|	G
	|	H
	|	I
	|	J
	|	K
	|	L
	|	M
	|	N
	|	O
	|	P
	|	Q
	|	R
	|	S
	|	T
	|	U
	|	V
	|	W
	|	X
	|	Y
	|	Z 
	;

hexdig
	:	digit
	|	( A|B|C|D|E|F)  
	;

digit
	:	D0
	|	non_zero_digit 
	;

non_zero_digit
	:	D1
	|	D2
	|	D3
	|	D4
	|	D5
	|	D6
	|	D7
	|	D8
	|	D9 
	;

UCSCHAR
	:	'\u00A0'
	|	'\uF900'
	|	'\uFDF0'
	|	'\u10000'
	|	'\u20000'
	|	'\u30000'
	|	'\u40000'
	|	'\u50000'
	|	'\u60000'
	|	'\u70000'
	|	'\u80000'
	|	'\u90000'
	|	'\uA0000'
	|	'\uB0000'
	|	'\uC0000'
	|	'\uD0000'
	|	'\uE1000' 
	;

IPRIVATE
	:	'\uE000'
	|	'\uF0000'
	|	'\u100000' 
	;

D0
	:	'0'
	;

D1
	:	'1'
	;

D2
	:	'2'
	;

D3
	:	'3'
	;

D4
	:	'4'
	;

D5
	:	'5'
	;

D6
	:	'6'
	;

D7
	:	'7'
	;

D8
	:	'8'
	;

D9
	:	'9'
	;

A
	:	'a'
	;

B
	:	'b'
	;

C
	:	'c'
	;

D
	:	'd'
	;

E
	:	'e'
	;

F
	:	'f'
	;

G
	:	'g'
	;

H
	:	'h'
	;

I
	:	'i'
	;

J
	:	'j'
	;

K
	:	'k'
	;

L
	:	'l'
	;

M
	:	'm'
	;

N
	:	'n'
	;

O
	:	'o'
	;

P
	:	'p'
	;

Q
	:	'q'
	;

R
	:	'r'
	;

S
	:	's'
	;

T
	:	't'
	;

U
	:	'u'
	;

V
	:	'v'
	;

W
	:	'w'
	;

X
	:	'x'
	;

Y
	:	'y'
	;

Z
	:	'z'
	;

COL2
	:	'::'
	;

COL
	:	':'
	;

DOT
	:	'.'
	;

PERCENT
	:	'%'
	;

HYPHEN
	:	'-'
	;

TILDE
	:	'~'
	;

USCORE
	:	'_'
	;

EXCL
	:	'!'
	;

DOLLAR
	:	'$'
	;

AMP
	:	'&'
	;

SQUOTE
	:	'\''
	;

OPAREN
	:	'('
	;

CPAREN
	:	')'
	;

STAR
	:	'*'
	;

PLUS
	:	'+'
	;

COMMA
	:	','
	;

SCOL
	:	';'
	;

EQUALS
	:	'='
	;

FSLASH2
	:	'//'
	;

FSLASH
	:	'/'
	;

QMARK
	:	'?'
	;

HASH
	:	'#'
	;

OBRACK
	:	'['
	;

CBRACK
	:	']'
	;

AT
	:	'@'
	;
