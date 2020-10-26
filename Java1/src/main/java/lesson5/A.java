package lesson5;

public class A {

    int a, b;

    public A() {
    }

    // default = package private
    // private = in class
    // public = anywhere
    // protected = default + extends

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setValues(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.printf("A = {\n\ta = %d, \n\tb = %d\n}%n", a, b);
    }
}
