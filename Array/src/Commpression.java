import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Commpression {
    public static void main(String[] args) throws IOException {
        int[] arr;
        System.out.print("Разменость массива: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dimension = Integer.valueOf(reader.readLine());
        arr = new int[dimension];
        Random rd = new Random();
        System.out.print("Значение рандома: ");
        int border = Integer.valueOf(reader.readLine());
        for (int i = 0; i < dimension; i++) {
            arr[i] = rd.nextInt(border) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Нижняя граница интервала: ");
        int lowBorder = Integer.valueOf(reader.readLine());
        System.out.print("Верхняя граница интервала: ");
        int upBorder = Integer.valueOf(reader.readLine());
        deleteElement(arr, lowBorder, upBorder);
        for (int i = 0; i < dimension; i++) {
            System.out.print(arr[i] + " ");
        }
        deleteZero(arr);
        System.out.println();
        for (int i = 0; i < dimension; i++) {
            System.out.print(arr[i] + " ");
        }
        reader.close();
    }
    public static void deleteElement(int[] arr, int lowBorder, int upBorder){
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= lowBorder && arr[i] <= upBorder) {
                arr[i] = 0;
            }
        }
    }

    public static void deleteZero(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < arr.length - count; j++) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                }
                count++;
            }
        }
    }
}

