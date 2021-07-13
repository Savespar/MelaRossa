import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvclidRec {
    public static void main(String[] args) throws IOException {
        System.out.print("a=");
        int a = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.print("b=");
        int b = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
        if (a == 0) {
            System.out.println(b);
        } else {
            System.out.println(nod(a, b));
        }
    }

    public static int nod(int a, int b) {
       if (b == 0){
           return a;
       } else {
           return nod(b, a % b);
       }

    }
}
