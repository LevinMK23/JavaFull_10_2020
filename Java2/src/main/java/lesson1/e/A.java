package lesson1.e;

public class A {

    protected int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int calculateAndGet() {
        return ++a;
    }
}
