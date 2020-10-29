package lesson6;

public class B extends A {

    private int b;

    public B(int a, int b) {
        super(a);
        System.out.println("B created");
        this.b = b;
    }

    public int getB() {
        return b;
    }

    // ctrl + O
    @Override
    public int inc() {
        return ++b;
    }

    @Override
    public String toString() {
        return super.toString() + "B{" +
                "b=" + b +
                '}';
    }
}
