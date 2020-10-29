package lesson6.expressions;

public class Divide extends BinaryExpression{

    public Divide(Expression left, Expression right) {
        super(left, right);
        operation = "/";
    }

    @Override
    int apply() {
        return left.apply() / right.apply();
    }
}
