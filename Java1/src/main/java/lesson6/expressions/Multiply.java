package lesson6.expressions;

public class Multiply extends BinaryExpression {
    public Multiply(Expression left, Expression right) {
        super(left, right);
        operation = "*";
    }

    @Override
    int apply() {
        return left.apply() * right.apply();
    }
}
