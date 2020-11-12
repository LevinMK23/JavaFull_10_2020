package lesson1.e;

import lesson1.interfaces.User;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

        A a = new A();
        a.setA(1);

        B b = new B();
        b.setA(2);
        b.setB(2);

        C c = new C();
        c.setA(3);
        c.setB(3);
        c.setC(3);

        System.out.println(a.calculateAndGet());
        System.out.println(b.calculateAndGet());
        System.out.println(c.calculateAndGet());
    }
}
