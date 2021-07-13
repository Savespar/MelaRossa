import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) throws IOException {
        System.out.println("Размерность массива:");
        int n = Integer.valueOf((new BufferedReader(new InputStreamReader(System.in))).readLine());
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(15);
            System.out.print(array[i] + " ");
        }

        for (int i = 1; i < array.length; i++){
            int current = array[i];
            int j = i-1;
            while (j >=0 && current < array[j]){
               array[j + 1] = array[j];
               j--;
            }
            array[j + 1] = current;
        }
        System.out.println();
        for (int i:array) {
            System.out.print(i + " ");
        }
    }
}
