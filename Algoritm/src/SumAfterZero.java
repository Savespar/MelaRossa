import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SumAfterZero {
    public static void main(String[] args) throws IOException {
        System.out.println("Размерность массива:");
        int n = Integer.valueOf((new BufferedReader(new InputStreamReader(System.in))).readLine());
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt( 3) + 1 ;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (!flag) {
                flag = (array[i] == 0) ? true : false;
            }
            if (flag && array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
