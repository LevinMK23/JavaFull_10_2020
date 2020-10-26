package lesson5;

public class IntArray {

    private int[] data;
    private int length;
    private int capacity;

    public IntArray() {
        length = 0;
        capacity = 256;
        data = new int[capacity];
    }

    // add(idx, value)
    // remove(idx)
    // remove(from, to)

    public void add(int element) {
        // TODO: 26.10.2020 capacity check
        data[length] = element;
        length++;
    }

    public int get(int index) {
        return data[index];
    }
}
