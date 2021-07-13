import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibboRecursia {
    public static void main(String[] args) throws IOException {
        System.out.println("Сколько чисел фибоначчи показать:");
        int number = Integer.valueOf((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        System.out.println(fibo(number));
    }
    public static long fibo(int n){
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}
