package lesson2;

public class MyArraySizeException extends IllegalArgumentException {

    public MyArraySizeException() {
        super("Array size should be 4 * 4");
    }
}
