import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {
    public static void main(String[] args) throws IOException {
        System.out.println("Размерность матрицы:");
        int n = Integer.valueOf((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == 0 || j == 0){
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j] + array[i][j - 1];
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
