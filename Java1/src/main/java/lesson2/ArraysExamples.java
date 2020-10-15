package lesson2;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
//        int x = 3; // _
//        //  1  2  3  4  5
//        // [0][1][2][3][4]
//        while (true) {
//            int[] a = new int[300000];
//            for (int i = 0; i < a.length; i++) {
//                // option + enter
//                a[i] = (int) (Math.random() * 1000)
//                        - (int) (Math.random() * 1000); // alt + enter
//            }
////        for (int element : a) {
////            System.out.print(element + " ");
////        }
//            System.out.println();
//            int m1 = 10001, m2 = 10001;
//            // 1 2 3 4 5
//            for (int i : a) {
//                if (i < m1) {
//                    if (m1 < m2) {
//                        m2 = m1;
//                    }
//                    m1 = i;
//                    continue;
//                }
//                if (i < m2) {
//                    m2 = i;
//                }
//            }
//            System.out.println(m2 + " " + m1);
//            if (m2 == m1) {
//                break;
//            }
//        }
        int[] a = new int[5];
        for (int i : a) {
            i = ++i;
        }
        System.out.println(Arrays.toString(a));
    }
}
