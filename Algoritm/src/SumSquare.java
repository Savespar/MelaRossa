import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SumSquare {
    public static void main(String[] args) throws IOException {
        System.out.print("Размерность массива:");
        int n = Integer.valueOf((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        int[] array = new int[n];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
            sum += Math.pow(array[i], 2);
        }
        System.out.println();
        System.out.println(sum);
    }
}
