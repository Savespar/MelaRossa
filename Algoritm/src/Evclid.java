import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Evclid {
    public static void main(String[] args) throws IOException {
        System.out.print("a=");
        int a = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.print("b=");
        int b = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
        if (a == 0){
            System.out.println(b);
        }
        while (b != 0){
            if (a > b){
                a-=b;
            } else {
                b -=a;
            }
        }
        System.out.println(a);
    }
}
