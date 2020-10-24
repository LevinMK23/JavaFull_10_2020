package lesson3;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {

    private static boolean isInGame = true;

    public String[] getWords() throws Exception {
        return Files.newBufferedReader(Path.of(getClass().getResource("words.txt").toURI()))
            .readLine().replaceAll("\"+", "").split(", ");
    }

    public static void main(String[] args) throws Exception {
        HomeWork hw = new HomeWork();
        Scanner in = new Scanner(System.in);
        String[] words = hw.getWords();
        String randomWord = words[(int) (Math.random() * words.length)];
        char[] chars = fillChars(randomWord);
        int[] cnt = new int[15];
        char[] randomChars = randomWord.toCharArray();
        while (isInGame) {
            String userWord = in.next();
            if (userWord.equals(randomWord)) {
                System.out.println("Victory!");
                isInGame = false;
            } else {
                System.out.println("Try again!");
                char[] userChars = userWord.toCharArray();
                for (int i = 0; i < 15; i++) {
                    if (i < userChars.length && i < randomWord.length()) {
                        if (userChars[i] == randomChars[i]) {
                            cnt[i]++;
                            chars[i] = userChars[i];
                        } else {
                            cnt[i]++;
                            if (cnt[i] > 2) {
                                chars[i] = randomChars[i];
                            }
                        }
                    }
                }
                System.out.println(chars);
            }
        }
    }

    private static char[] fillChars(String randomWord) {
        char[] chars = new char[15];
        Arrays.fill(chars, '#');
        return chars;
    }
}
