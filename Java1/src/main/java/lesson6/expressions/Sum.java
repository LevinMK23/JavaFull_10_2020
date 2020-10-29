package lesson6.expressions;

public class Sum extends BinaryExpression {


    public Sum(Expression left, Expression right) {
        super(left, right);
        operation = "+";
    }

    @Override
    int apply() {
        return left.apply() + right.apply();
    }
}
