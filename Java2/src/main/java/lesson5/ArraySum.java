package lesson5;

import lesson1.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArraySum {

    private static void multi(List<Integer> integers, int n) throws InterruptedException {
        int len = integers.size() / n;
        Thread[] threads = new Thread[n];
        ArrayCalculator[] calculators = new ArrayCalculator[n];
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            calculators[i] = new ArrayCalculator(integers, i * len, (i + 1) * len, i);
            threads[i] = new Thread(calculators[i]); // + 8 stack
            threads[i].start();
        }
        long result = 0;
        for (ArrayCalculator calculator : calculators) {
            if (!calculator.isFinished()) {
                System.out.println("* " + calculator.getIndex());
                threads[calculator.getIndex()].join();
                // threads[calculator.getIndex()] finished
            }
            result += calculator.getSum();
        }
        long end = System.currentTimeMillis();
        System.out.println("sum=" + result);
        System.out.println("FINISHED! Time: " + (end - start) + " ms.");
    }

    private static void single(List<Integer> integers) {
        long sum = 0;
        long start = System.currentTimeMillis();
        for (Integer integer : integers) {
            sum += integer;
        }
        long end = System.currentTimeMillis();
        System.out.println("sum=" + sum);
        System.out.println("FINISHED! Time: " + (end - start) + " ms.");
    }

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 300_000_000; i++) {
            integers.add(random.nextInt(1000));
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms.");
        multi(integers, 2);
        single(integers);
    }
}
