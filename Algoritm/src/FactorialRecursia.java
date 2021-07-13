import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialRecursia {
    public static void main(String[] args) throws IOException {
        System.out.print("Факториал числа:");
        int number = Integer.valueOf((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        System.out.println(factorial(number));
    }

    public static int factorial(int n) {
        int rez = 1;
        if (n == 0 || n == 1 ) return rez;
        rez = n * factorial(n - 1);
        return rez;
    }
}