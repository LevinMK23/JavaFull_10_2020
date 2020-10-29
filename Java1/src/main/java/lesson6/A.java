package lesson6;

public class A {

    protected int a;

    public A(int a) {
        System.out.println("A created");
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public int inc() {
        return ++a;
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }
}
