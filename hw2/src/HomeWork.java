import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] words = line.split(" ");

        for (String s : words) {
            s.trim();
        }

        for (int i = 0; i < words.length; i++) {

            while (((int) words[i].charAt(0) > 90 && (int) words[i].charAt(0) < 97) || (int) words[i].charAt(0) < 65 || (int) words[i].charAt(0) > 122) {
                words[i] = words[i].substring(1);
                if (words[i].isEmpty()) {
                    break;
                }
            }
            if (!words[i].isEmpty()) {
                while (((int) words[i].charAt(words[i].length() - 1) > 90 && (int) words[i].charAt(words[i].length() - 1) < 97) || (int) words[i].charAt(words[i].length() - 1) < 65 || (int) words[i].charAt(words[i].length() - 1) > 122) {
                    words[i] = words[i].substring(0, words[i].length() - 1);
                }
                if (words[i].isEmpty()) {
                    break;
                }
            }
        }

        Arrays.sort(words);

        for (String s: words) {
            System.out.print(s + " ");
        }
        System.out.println();


        int sum = 1;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!words[i].isEmpty()) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                        sum++;
                        words[j] = "";
                    }
                }
            }
            if (!words[i].isEmpty()) {
                System.out.print(words[i].charAt(0) + ":");
                System.out.println("   " + words[i] + " " + sum);
            }
            sum = 1;
        }

    }
}
