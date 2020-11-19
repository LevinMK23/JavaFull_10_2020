package lesson2;

public class ArrayUtils {

    public static long processArray(String[][] data) {
        if (data.length != 4 || data[0].length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (data[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        long sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(data[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
