import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        char[] vowels = new char[]{'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y',};
        char[] consonants = new char[]{'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
                'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z',
                'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
        String[] words = line.split(" ");
        for (String s : words) {
            if (s.length() > 1) {
                if (searchVowels(s.charAt(0), vowels) && searchConsonants(s.charAt(s.length() - 1), consonants)) {
                    System.out.println(s);
                }
            }
        }
    }

    public static boolean searchVowels(char symbol, char[] vowels) {
        boolean bool = false;
        for (int i = 0; i < vowels.length; i++) {
            if (symbol == vowels[i]) {
                bool = true;
                break;
            }
        }
        return bool;
    }

    public static boolean searchConsonants(char symbol, char[] consonants) {
        boolean bool = false;
        for (int i = 0; i < consonants.length; i++) {
            if (symbol == consonants[i]) {
                bool = true;
                break;
            }
        }
        return bool;
    }
}
