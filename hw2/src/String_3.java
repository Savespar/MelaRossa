import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] words = line.split(" ");
        int sum = 0;

        for (String s : words) {
            sum += s.length();
        }
        System.out.println((double) (sum / words.length));
    }
}
