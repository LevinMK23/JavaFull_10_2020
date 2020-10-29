package lesson6.expressions;

public abstract class Expression {

    String operation;
    Expression left, right;

    abstract int apply();

    @Override
    public String toString() {
        return "(" + left.toString() + operation + right.toString() + ")";
    }
}
