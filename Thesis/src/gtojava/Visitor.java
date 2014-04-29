package gtojava;

public interface Visitor<T> {

	T visit(Terminal terminal);

	T visit(Nonterminal nonterminal);

	T visit(Optional optional);

	T visit(Star star);

	T visit(Plus plus);

	T visit(Sequence sequence);

	T visit(Empty empty);

	T visit(Choice choice);

}
