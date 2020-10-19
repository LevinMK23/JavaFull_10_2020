package lesson2;

public class HomeWork {

    // O(3N) = O(N)
    public boolean checkArray(int[] array) {
        long sum = arraySum(array);
        long leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            if (leftSum * 2 == sum) {
                printArrayInfo(array, i);
                return true;
            }
        }
        return false;
    }

    private void printArrayInfo(int[] array, int pos) {
        System.out.println("pos = " + pos);
        for (int i = 0; i <= pos; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print(" | ");
        for (int i = pos + 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private long arraySum(int[] array) {
        long sum = 0;
        for(int i : array) {
            sum += i;
        }
        return sum;
    }

}
