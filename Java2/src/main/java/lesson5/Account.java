package lesson5;

public class Account {

    // volatile
    // = < > <= >=
    private volatile int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void increment(int value) {
        synchronized (this) {
            balance += value;
        }
        // 1. balance <-
        // 2. balance + value
        // 3. -> balance_new
    }

    public void decrement(int value) {
        synchronized (this) {
            balance -= value;
        }
    }

    private boolean wrongBalance() {
        return false;
    }

    public int getBalance() {
        return balance;
    }
}
