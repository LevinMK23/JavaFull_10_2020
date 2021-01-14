package lesson5;

import java.lang.ref.PhantomReference;
import java.lang.ref.WeakReference;
import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

public class SyncUtils {

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        Semaphore semaphore = new Semaphore(2);
//        Fighter[] fighters = {
//                new Fighter(semaphore), new Fighter(semaphore),
//                new Fighter(semaphore), new Fighter(semaphore)
//        };
//        fighters[0].setEnemy(fighters[1]);
//        fighters[1].setEnemy(fighters[0]);
//        fighters[2].setEnemy(fighters[3]);
//        fighters[3].setEnemy(fighters[2]);
//        Thread[] threads = new Thread[4];
//        semaphore.acquire();
//        for (int i = 0; i < 4; i++) {
//            threads[i] = new Thread(fighters[i]);
//            threads[i].start();
//        }
//        semaphore.release();

        CountDownLatch cl = new CountDownLatch(3);
        Initer[] initers = {
                new Initer(cl),
                new Initer(cl),
                new Initer(cl)
        };

        CyclicBarrier cr = new CyclicBarrier(2);
        for (Initer initer : initers) {
            new Thread(initer).start();
        }

        AtomicInteger ai = new AtomicInteger(0);

        ReentrantLock lock = new ReentrantLock();
        Integer counter = new Integer(0);

//        Calculator[] calculators = {
//                new Calculator(counter, lock),
//                new Calculator(counter, lock),
//                new Calculator(counter, lock),
//                new Calculator(counter, lock),
//                new Calculator(counter, lock)
//        };
//        for (Calculator calculator : calculators) {
//            new Thread(calculator).start();
//        }
        SecondMetric metric = new SecondMetric();
        for (int i = 0; i < 16; i++) {
            new Thread(() -> {
                while (true) {
                    metric.inc();
                    int sleep = (int) (1 + Math.random() * 20);
                    try {
                        TimeUnit.MILLISECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String command = in.next();
            if (command.equals("info")) {
                System.out.println(metric.getRPS());
            }
        }

        if (metric.allow()) {

        } else {
            // transfer to second node
        }
    }
}
