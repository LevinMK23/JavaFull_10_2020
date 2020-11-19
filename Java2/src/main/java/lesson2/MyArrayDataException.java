package lesson2;

public class MyArrayDataException extends IllegalArgumentException {

    private int i;
    private int j;

    public MyArrayDataException(int i, int j) {
        super(String.format("Wrong array data at i = %d, j = %d. " +
                "Data should be integer", i, j));
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
