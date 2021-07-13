import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Avengers {
    public static void main(String[] args) throws IOException {
       System.out.print("Количество людей в очереди: ");
        int lengthQueue = Integer.valueOf((new BufferedReader(new InputStreamReader(System.in))).readLine());
        System.out.println(lengthQueue);
        int[] moneyPeople = new int[lengthQueue];
        Random random = new Random();
        for (int i = 0; i < moneyPeople.length; i++) {
            int current = random.nextInt(3) + 1;
            switch (current) {
                case 1:
                    moneyPeople[i] = 25;
                    break;
                case 2:
                    moneyPeople[i] = 50;
                    break;
                case 3:
                    moneyPeople[i] = 100;
            }
            System.out.print(moneyPeople[i] + " ");
        }

        System.out.println();
        int[] cashBox = {0, 0, 0};
        boolean bool = true;

        for (int i = 0; i < moneyPeople.length; i++) {
            switch (moneyPeople[i]) {
                case 25:
                    cashBox[0]++;
                    System.out.print("1 " + cashBox[0] + " " + cashBox[1] + " " + cashBox[2]);
                    System.out.println();
                    break;
                case 50:
                    if (cashBox[0] == 0) {
                        bool = false;
                    } else {
                        cashBox[0]--;
                        cashBox[1]++;
                        System.out.print("2 " + cashBox[0] + " " + cashBox[1] + " " + cashBox[2]);
                        System.out.println();
                    }
                    break;
                case 100:
                    if (cashBox[0] == 0 || (cashBox[0] * 25 + cashBox[1] * 50) < 75) {
                        bool = false;
                    } else {
                        cashBox[2]++;
                        if (cashBox[1] == 0) {
                            cashBox[0] -= 3;
                        } else {
                            cashBox[0]--;
                            cashBox[1]--;
                        }
                        System.out.print("3 " + cashBox[0] + " " + cashBox[1] + " " + cashBox[2]);
                        System.out.println();
                    }
                    break;
            }
            if (!bool) {break;}
        }
        System.out.println(bool);
    }
}
