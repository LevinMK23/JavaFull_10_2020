package lesson6.expressions;

public class Constant extends Expression {

    private int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    int apply() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
