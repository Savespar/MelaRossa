import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortLengthLine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lines = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()){
            lines.add(line);
            line = reader.readLine();
        }

        for (String s: lines) {
            System.out.println(s);
        }

        for(int i = 0; i < lines.size() - 1; i++){
            for (int j = i; j < lines.size(); j++){

            }
        }
    }
}
