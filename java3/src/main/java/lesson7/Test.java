package lesson7;

import lesson3.HistoryService;
import lesson3.IoHistoryServiceImpl;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        // ReflectionUtils.printClassInfo(String.class);
//        String s = "123";
//        ReflectionUtils.set(s, new byte[]{65, 66}, "value");
//        System.out.println(s);

//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
//        ReflectionUtils.set(list, 2, "size");
//        list.add(11);
//        System.out.println(list);
//        //ReflectionUtils.printClassInfo(ArrayList.class, "M");
//        System.out.println(
//                Arrays.asList((Object[]) ReflectionUtils.invoke(list,
//                        "grow",
//                        new Class[]{int.class},
//                        1)));
        //System.out.println(list);
        // System.out.println(ReflectionUtils.construct(B.class));

        DBCore core = new DBCore();

        Book book = new Book(1, "War or Peace", "Lev");
        core.insert(book);
        System.out.println(book);
        HistoryService hs = new IoHistoryServiceImpl();
        System.out.println(
                Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                        new Class[]{HistoryService.class},
                        Proxy.getInvocationHandler(hs)));
        //core.insert(new User(1, "Ivanov", "Ivan"));
        //core.insert(new User(2, "Petrov", "Petr"));
    }
}
