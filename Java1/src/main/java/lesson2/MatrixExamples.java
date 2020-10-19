package lesson2;

import java.util.Arrays;

public class MatrixExamples {

    public static void printMatrix(char[][] m) {
        for (char[] chars : m) {
            for (char aChar : chars) {
                System.out.printf("%c", aChar);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[9][9];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (i + 1) * (j + 1);
            }
        }
        //printMatrix(a);
        int n = 4;
        //   *
        //  ***
        // *****
        //*******
        char[][] t = new char[n][2 * n - 1];
        for (char[] chars : t) {
            Arrays.fill(chars, ' ');
        }
        int start = 0;
        for (int i = n-1; i >= 0; i--) {
            for (int j = start; j < t[i].length - start; j++) {
                t[i][j] = '*';
            }
            start++;
        }
        int[][] m = new int[4][];
        m[0] = new int[1];
        m[1] = new int[3];
        m[2] = new int[3];
        m[3] = new int[1];
        printMatrix(t);
    }
}
