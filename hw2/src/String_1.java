import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String symbol = reader.readLine();
        char searchSymbol = symbol.charAt(0);
        char[] lineSymbol = new char[line.length()];
        line.getChars(0, line.length(), lineSymbol, 0);
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (lineSymbol[i] == searchSymbol) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        if (count > 0) {
            System.out.println(count);
        } else System.out.println("Symbol " + symbol + " not found");

    }
}
