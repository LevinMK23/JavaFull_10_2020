package lesson5;

import java.util.List;

public class ArrayCalculator implements Runnable {

    private final List<Integer> integers;
    private int from, to;
    private long sum;
    private boolean finished;
    private int index;

    public ArrayCalculator(List<Integer> integers,
                           int from, int to, int index) {
        this.integers = integers;
        this.from = from;
        this.to = to;
        sum = 0;
        this.index = index;
        if (to >= integers.size()) {
            to = integers.size();
        }
        // System.out.println(from + " " + to);
    }

    @Override
    public void run() {
        for (int i = from; i < to; i++) {
            sum += integers.get(i);
        }
        finished = true;
    }

    public int getIndex() {
        return index;
    }

    public boolean isFinished() {
        return finished;
    }

    public long getSum() {
        return sum;
    }
}
