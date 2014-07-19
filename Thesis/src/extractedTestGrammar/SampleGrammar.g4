grammar SampleGrammar;

s : a c;
a : (a '+' b) |'a';
b : 'b';
c: 'c';
