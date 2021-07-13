import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialNoRecursia {
    public static void main(String[] args) throws IOException {
        System.out.print("Факториал числа:");
        int number = Integer.valueOf((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        if (number == 0){
            System.out.print(1);
        } else {
            int factorial = 1;
            for(int i = 1; i <= number; i++){
                factorial *= i;
            }
            System.out.print(factorial);
        }
    }
}
