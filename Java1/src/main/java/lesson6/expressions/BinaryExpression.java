package lesson6.expressions;

public abstract class BinaryExpression extends Expression{

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
