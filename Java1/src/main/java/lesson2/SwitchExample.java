package lesson2;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
//        int x = in.nextInt();
//        int result = switch (x) {
//            case 1 -> 3;
//            case 2 -> 5;
//            default -> 7;
//        };
//        System.out.println(result);

        String s = in.next();
        Color c = Color.BLUE;

        switch (c) {
            case RED -> {}
            case BLUE -> {}
            case GREEN -> {}
            case WHITE -> {}
        }
//        int x = switch (c) {
//            case "one" -> 1;
//            case "two" -> 2;
//            default -> -1;
//        };
//        System.out.println(x);
    }
}
