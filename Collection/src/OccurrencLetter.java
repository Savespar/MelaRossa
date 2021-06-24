import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class OccurrencLetter {
    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> dictionary = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine().toLowerCase(Locale.ROOT).replaceAll("[\\W0-9_]", "");
        System.out.println(line);
        char[] lineArray = line.toCharArray();
        for (int i = 0; i < lineArray.length; i++) {
            if (lineArray[i] != ' ') {
                int count = 1;
                for (int j = i+1; j < lineArray.length; j++) {
                    if (lineArray[i] == lineArray[j] && lineArray[j] != 0) {
                        count++;
                        lineArray[j] = 0;
                    }
                }
                dictionary.put(lineArray[i], count);
            }

        }
        System.out.println(dictionary);
    }
}
