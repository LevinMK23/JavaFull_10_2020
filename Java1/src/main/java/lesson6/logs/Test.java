package lesson6.logs;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        A a = new A() {
        };
        System.out.println(a.getClass());
        A a1 = new A() {
        };
        System.out.println(a1.getClass());

        Logger cl = new ConsoleLogger("Test");
        Logger fl = new FileLogger("Test");
        cl.log("OLOLO");
        fl.log("OLOLO!!!!");
    }
}
