package lesson5;

public class TicTac {

    static final Object monitor = new Object();

    public static void main(String[] args) {

        Runnable tic = () -> {
            while (true) {
                synchronized (monitor) {
                    System.out.print("(");
                    try {
                        monitor.notify();
                        monitor.wait();
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // <-
            }
        };

        Runnable tac = () -> {
            while (true) {
                synchronized (monitor) {
                    System.out.print(")");
                    try {
                        monitor.notify();
                        monitor.wait();
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // <-
            }
        };

        new Thread(tic).start();
        new Thread(tac).start();

    }
}
