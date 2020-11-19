package lesson1;

public class Wall implements Barrier {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void take(Person person) {
        person.jump(height);
    }
}
