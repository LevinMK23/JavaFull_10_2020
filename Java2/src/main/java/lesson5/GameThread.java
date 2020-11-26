package lesson5;

public class GameThread extends Thread {

    private StringBuilder p;
    private boolean running;

    @Override
    public void run() {
        running = true;
        while (running) {
            p.append((char) (Math.random() * 26 + 'a'));
            //System.out.print("*");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Game stopped!");
    }

    public void stopGame() {
        System.out.println("Game going to stop");
        running = false;
    }

    public StringBuilder getP() {
        return p;
    }

    public void setP(StringBuilder p) {
        this.p = p;
    }
}
