package lesson6;

public class Test {

    // protected = default + ext
    public static void main(String[] args) {
        A b = new B(1,2);
        b.inc();
        b.inc();
        System.out.println(b);
    }
}
