package lesson1;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Barrier> barriersLine = new ArrayList<>();
        barriersLine.add(new Wall(2));
        barriersLine.add(new Road(100));
        barriersLine.add(new Wall(3));
        barriersLine.add(new Wall(5));
        barriersLine.add(new Road(200));

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Robot(100, 100));
        people.add(new Human(300, 4));
        people.add(new Cat(200, 30));

        for (Person person : people) {
            for (Barrier barrier : barriersLine) {
                barrier.take(person);
            }
        }
    }
}
