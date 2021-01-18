package lesson5.hw;

public class Road extends Stage {

    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            int limit = c.getRace().getStages().size();
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000L);
            System.out.println(c.getName() + " закончил этап: " + description);
            if (c.getSpeed() == limit) {

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
