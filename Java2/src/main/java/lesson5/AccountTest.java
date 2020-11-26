package lesson5;

public class AccountTest {

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(10000);
        System.out.println("Start balance: " + account.getBalance());
        Runnable add = () -> {
            for (int i = 0; i < 100000; i++) {
                account.increment(3);
            }
        };
        Runnable sub = () -> {
            for (int i = 0; i < 100000; i++) {
                account.decrement(3);
            }
        };
        Thread t1 = new Thread(add);
        Thread t2 = new Thread(sub);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Finish balance: " + account.getBalance());
    }
}
