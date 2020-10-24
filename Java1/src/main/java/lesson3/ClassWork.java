package lesson3;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassWork {

    static void bufferedInput() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(new File("bigData.txt")));
        while (true) {
            String s = br.readLine();
            if (s == null) {
                break;
            }
        }
    }

    static void input() throws FileNotFoundException {
        Scanner in = new Scanner(new File("bigData.txt"));
        while (in.hasNext()) {
            in.next();
        }
    }

    static void genBigData() {
        File file = new File("bigData.txt");
        try (PrintWriter pr = new PrintWriter(file)) {
            for (int i = 0; i < 10_000_000; i++) {
                pr.println("aaa");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int[] randomArray(int n, int limit) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) ((Math.random() - Math.random()) * limit);
        }
        return a;
    }

    static int[] randomArray(int n, int from, int to) {
        int[] a = new int[n];
        if (to < from) {
            throw new IllegalArgumentException("Ты дурачок");
        }
        for (int i = 0; i < n; i++) {
            a[i] = (int) (from + Math.random() * (to - from));
        }
        return a;
    }

    static int sum(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        Random rnd = new Random();

        //genBigData();
        //System.out.println(new File("bigData.txt").length());
//        long start = System.currentTimeMillis();
//        bufferedInput();
//        System.out.println(System.currentTimeMillis() - start + " ms.");
        Scanner in = new Scanner(System.in);
//        int a = in.nextInt(), b = in.nextInt();
//        String s = in.next();
        // phones: 89112756975, 89112754689, 89112457898
//        String s = in.nextLine();
//        String[] data = s.split("[:, ]+");
//        System.out.println(Arrays.toString(data));
//        long[] numbers = new long[data.length-1];
//        for (int i = 1; i < data.length; i++) {
//            numbers[i-1] = Long.parseLong(data[i]);
//        }
//        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(randomArray(10, 50, 70)));

        int x = 15;
        String name = "Вася";
        char sex = 'M';
        float averageBall = 78.12f;

        // %d int, long, byt, short
        // %f double float
        // %c char
        // %s String
        System.out.printf("%s возрастом %4d %c %.4f\n", name, x, sex, averageBall);
        String s = String.format("age = %d\n", x);
        // String.format("select * from my_table where id = %d;", 12);
        System.out.println(s);
        int[] ar = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(sum(1));
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(ar));
    }
}
