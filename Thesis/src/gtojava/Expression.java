package gtojava;

public abstract class Expression extends ASTNode{
	public abstract <T> T accept(Visitor<T> visitor);
}
