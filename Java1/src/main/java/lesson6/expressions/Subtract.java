package lesson6.expressions;

public class Subtract extends BinaryExpression{
    public Subtract(Expression left, Expression right) {
        super(left, right);
        operation = "-";
    }

    @Override
    int apply() {
        return left.apply() - right.apply();
    }
}
