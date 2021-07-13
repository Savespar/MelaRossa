import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibboNoRecursia{
    public static void main(String[] args) throws IOException {
        System.out.println("Сколько чисел фибоначчи показать:");
        int number = Integer.valueOf((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        if(number == 1){
            System.out.println(0);
        } else if (number == 2){
            System.out.println(1);
        } else{
            int[] fibo = new int[number];
            fibo[0] = 0;
            fibo[1] = 1;
            for (int i = 2; i < fibo.length; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
            System.out.println(fibo[fibo.length - 1]);
        }

    }
}
