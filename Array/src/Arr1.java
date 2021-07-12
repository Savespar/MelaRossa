import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Random;

public class Arr1 {
    public static void main(String[] args) throws IOException {
        int[] arr;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Разрядность массива: ");
        String s = reader.readLine();
        int dimension = Integer.valueOf(s);
        System.out.println("Нижняя граница элементов массива: ");
        s = reader.readLine();
        int lowBorder = Integer.valueOf(s);
        System.out.println("Верхняя граница элементов массива: ");
        s = reader.readLine();
        int upBorder = Integer.valueOf(s);;
        arr = new int[dimension];
        Random rd = new Random();
        for (int i = 0; i < dimension; i++){
            arr[i] = rd.nextInt (upBorder - lowBorder + 1) + lowBorder;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int summ = 0;
        for (int i = 0; i < dimension; i++){
            if (i % 2 == 0){
                summ += arr[i];
            }
        }
        System.out.println(summ);
        reader.close();
    }
}
