import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplicity {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число:");
        int n = Integer.valueOf((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        if (n < 3){
            System.out.println(0);
        }else {
            int sum = 0;
            for(int i = 3; i <= n; i++){
                if (i % 3 == 0 || i % 5 == 0){
                    sum += i;
                }
            }
            System.out.println(sum);
        }

    }
}
