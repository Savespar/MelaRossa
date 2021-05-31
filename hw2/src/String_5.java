import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] lineArray = line.split(" ");
        int sum = 0;
        for (String s : lineArray) {
            if (s.indexOf(":") != -1) {
                sum += sumLetter(s);
            } else {
                if (s.length() % 2 == 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }

    public static int sumLetter(String line) {
        int sum = 0;
        String[] words = line.split(":");
        for (String s : words) {
            if (s.length() % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }
}
