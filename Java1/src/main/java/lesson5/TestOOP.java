package lesson5;

public class TestOOP {
    public static void main(String[] args) {
//        A a = new A(1, 4);
//        A a1 = new A();
//        a.print();
//        a1.print();
//        a.setValues(5, 5);
//        a.print();
        IntArray a = new IntArray();

        for (int i = 0; i < 10; i++) {
            a.add(i + 1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(a.get(i) + " ");
        }

        Cat cat = new Cat("Oleg");
        cat.spendTime();
        cat.spendTime();
        cat.say();
        cat.say(true);

        for (int i = 0; i < 10; i++) {
            new Cat("name" + i);
        }

        Cat cat1 = new Cat("Oleg");
        Cat cat2 = new Cat("Ivan");

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(new Cat());

        System.out.println(Cat.findCatById(7));

        for (int i = 0; i < 15; i++) {
            System.out.println(new DataParameter().getEntityId());
        }
    }
}
