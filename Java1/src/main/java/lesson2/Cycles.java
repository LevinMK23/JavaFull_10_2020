package lesson2;

/**
 * Cycles examples
 *
 * @author Mikhail
 */
public class Cycles {
    public static void main(String[] args) {
        int n = 1;
//        while (n < 30) {
//            System.out.print(" * ");
//            n += 4;
//            System.out.print(n + " ");
//        }
        // [][[]][[[]]] n = 3
//        n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("[");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("]");
//            }
//        }
        // [][[]][[[]]]........... N
        int start = 1, counter = 0;
        n = 17;
        label:
        while (true) {
            for (int j = 0; j < start; j++) {
                System.out.print("[");
                counter++;
                if (counter == n) {
                    break label;
                }
            }
            for (int j = 0; j < start; j++) {
                System.out.print("]");
                counter++;
                if (counter == n) {
                    break label;
                }
            }
            start++;
        }
        System.out.println();
        l1:
        for (int i = 0; i < 5; i++) {
            l:
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break l1;
                }
                for (int k = 0; k < 5; k++) {
                    System.out.println(i + " " + j + " " + k);
                    if (k == 2) {
                        break l;
                    }
                }
            }
        }

//        while(condition) {
//            action
//        }
//
//        for(init;condition;step) {
//            action
//        }

    }
}
