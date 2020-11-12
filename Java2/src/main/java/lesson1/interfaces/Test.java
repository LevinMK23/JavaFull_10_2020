package lesson1.interfaces;

import lesson1.e.A;
import lesson1.e.B;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    void foo(int[] a) {
        a[3] = 5;
    }

    void foo() {
        int a = 3;
        int b = 4;
        String s = "2313";
        List<Integer> l = new ArrayList<>();
        l = new ArrayList<>();
    }

    public static void main(String[] args) throws Exception {
        UserService s1 = new DBUserServiceImpl();
        UserService s2 = new FileUserServiceImpl();

        int[] a = {1, 3, 4, 5, 6};
        a = null;
        new Test().foo(a);

        System.out.println(a);

        Object o1 = new A();
        Object o2 = new B();

        System.out.println(o1 instanceof A);
        System.out.println(o2 instanceof A);
        System.out.println(o2 instanceof B);

        System.out.println(((A)o1).calculateAndGet());
        System.out.println(((B)o2).calculateAndGet());

        FileMessage<String> fileMessage = new FileMessage<>("lol.txt");
        fileMessage.write("Hello world");

        System.out.println(fileMessage.read());
    }
}
