package lesson5;

import java.util.Map;
import java.util.Scanner;

public class MultiThreading {

    public static void main(String[] args) {
//        Thread tread = new Thread() {
//            @Override
//            public void run() {
//                // TODO: 26.11.2020
//            }
//        };

        GameThread game = new GameThread();
        game.setP(new StringBuilder());
        game.setDaemon(true);
        game.start();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();
            if (s.equals("info")) {
                System.out.println(game.getP());
            }
            if (s.equals("stop")) {
                game.stopGame();
            }
            if (s.equals("clear")) {
                System.out.println("CLEARED");
                game = null;
            }
            if (s.equals("ref")) {
                Thread.getAllStackTraces().entrySet()
                        .stream()
                        .filter(p -> p.getKey().getName().startsWith("Thread"))
                        .findFirst()
                        .map(Map.Entry::getKey)
                        .ifPresent(Thread::stop);
            }
            if (s.equals("quit")) {
                System.out.println("Good buy!");
                break;
            }
            if (s.equals("threadInfo")) {
                Thread.getAllStackTraces().forEach((key, val) -> {
                    System.out.println("!!!" + key.getName() + " : ");
                    for (StackTraceElement element : val) {
                        System.out.println(element);
                    }
                });
            }
        }
    }
}
