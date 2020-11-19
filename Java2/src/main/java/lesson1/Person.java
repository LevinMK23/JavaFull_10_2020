package lesson1;

public class Person implements Runnable, Jumpable {

    private static int counter = 0;
    private int runLimit;
    private int jumpLimit;
    private boolean isPossible;
    private int humanId;
    protected String type;

    public Person(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        isPossible = true;
        counter++;
        humanId = counter;
    }

    @Override
    public void jump(int height) {
        if (height > jumpLimit) {
            isPossible = false;
        }
        if (isPossible) {
            System.out.println(type + "#" + humanId + " jump to " + height + " m.");
        }
    }

    @Override
    public void run(int distance) {
        if (distance > runLimit) {
            isPossible = false;
        }
        if (isPossible) {
            System.out.println(type + "#" + humanId + " run to " + distance + " m.");
        }
    }

}