import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SummNumber {
    public static void main(String[] args) throws IOException {
        int[] arr;
        System.out.print("Разменость массива: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dimension = Integer.valueOf(reader.readLine());
        arr = new int[dimension];
        Random rd = new Random();
        int summ = 0;
        for (int i = 0; i < dimension; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
            summ += sumNumber(arr[i]);
        }
        System.out.println("Результат:");
        System.out.println(summ);
        reader.close();
    }

    public static int sumNumber(int number) {
        int summ = 0;
        int n;
        while (number > 0) {
            n = number % 10;
            summ += n;
            number /= 10;
        }
        return summ;
    }
}
