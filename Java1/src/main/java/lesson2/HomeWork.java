package lesson2;

import java.util.Arrays;

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
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    // O(N) O(N) X
    // O(N) O(1) ?
    public int[] shift(int[] arr, int n) {

        int startIndex   = 0;      // Стартовый индекс. Нужен для отслеживания закольцевания
        int currentIndex = 0;      // Индекс элемента, который сейчас в буфере
        int currentValue = arr[0]; // Буфер для значения

        // Пройдем по массиву 1 раз и сразу будем перемещать элементы в нужные места
        for (int i : arr) {

            int newIndex, temp;

            // Вычисляем индекс, куда перемещать текущий элемент
            newIndex = (currentIndex + n % arr.length) % arr.length;
            newIndex = newIndex < 0 ? (arr.length + newIndex) % arr.length : newIndex;

            // Если вдруг вернулись в ту же точку до окончания основного цикла,
            // то возьмем следующий индекс от стартового, иначе так и будт ходить по кругу.
            // В противном случае просто перемещаем элемент из буфера в новое место массива,
            // а в буфер помещаем новый элемент.
            if (newIndex == startIndex) {
                arr[newIndex] = currentValue;
                currentIndex  = (++startIndex) % arr.length;
                currentValue  = arr[currentIndex];
            } else {
                temp          = arr[newIndex];
                arr[newIndex] = currentValue;
                currentValue  = temp;
                currentIndex  = newIndex;
            }

        }

        System.out.println(Arrays.toString(arr));
        return arr;

    }

    private void makeShift(int[] array) {
        int left = array[0];
        // 1 2 3 4 5
        // 2 3 4 5 1
        System.arraycopy(array, 1, array, 0, array.length - 1);
        array[array.length - 1] = left;
    }

}
