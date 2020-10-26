package lesson5;

import java.util.ArrayList;
import java.util.HashMap;

public class Cat {

    private String name;
    private int age;
    private int catId;
    private static int createdCatCounter = 0;
    private static ArrayList<Cat> cats = new ArrayList<>();
    private static HashMap<Integer, Cat> catsMap = new HashMap<>();

    public Cat() {
        name = "NO_NAME";
        age = 0;
        createdCatCounter++;
        catId = createdCatCounter;
        cats.add(this);
        catsMap.put(catId, this);
    }

    public Cat(String name) {
        this.name = name;
        age = 0;
        createdCatCounter++;
        catId = createdCatCounter;
        cats.add(this);
        catsMap.put(catId, this);
    }

    public static Cat findCatById(int id) {
        return catsMap.get(id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCatId() {
        return catId;
    }

    public void say() {
        say(false);
    }

    public void say(boolean isAngry) {
        System.out.println(isAngry ? "SHSHSHSH" : "MEOW");
    }

    public void spendTime() {
        age++;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", catId=" + catId +
                '}';
    }
}
