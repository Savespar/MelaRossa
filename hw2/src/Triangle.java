import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        //System.out.println(line);
        int star = Integer.parseInt(line);
        int count = 0;
        for (int i = 0; i < star; i++) {
            while (count <= star + i) {
                if (i != star - 1) {
                    if (count == star + i || count == star - i) {
                        System.out.print("*");
                    } else System.out.print(" ");
                } else System.out.print("*");
                count++;
            }
            count = 0;
            System.out.println();
        }
    }

}
