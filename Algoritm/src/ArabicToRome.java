import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArabicToRome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] listRomeNumber = new String[]{"I", "V", "X", "L", "C", "D", "M"};
        String romeNumber = "";
        int arabicNumber = Integer.valueOf(reader.readLine());
        int number;
        int count = numberDiggits(arabicNumber);

        if (count > 3) {
            number = (int) (arabicNumber / Math.pow(10, 3));
            for (int i = 0; i < number; i++) {
                romeNumber += listRomeNumber[6];
            }
            arabicNumber %= Math.pow(10, count - 3);
        } else {
            count = numberDiggits(arabicNumber);
            while (count > 0) {
                count--;
                number = (int) (arabicNumber / Math.pow(10, count));
                romeNumber += transfer(number, count, listRomeNumber);
                arabicNumber %= Math.pow(10, count);
            }
        }

        System.out.println(romeNumber);


    }

    static int numberDiggits(int arabicNumber) {
        int count = 0;
        while (arabicNumber > 0) {
            arabicNumber /= 10;
            count++;
        }
        return count;
    }

    static String transfer(int number, int discharge, String[] listRomeNumber) {
        discharge++;
        String transferRome = "";
        switch (number){
            case 1:
                if (discharge == 3){
                    transferRome += listRomeNumber[4];
                    break;
                }
                if (discharge == 2){
                    transferRome += listRomeNumber[2];
                    break;
                }
                if (discharge == 1){
                    transferRome += listRomeNumber[0];
                    break;
                }
            case 2:
                if (discharge == 3){
                    transferRome += listRomeNumber[4] + listRomeNumber[4];
                    break;
                }
                if (discharge == 2){
                    transferRome += listRomeNumber[2] + listRomeNumber[2];
                    break;
                }
                if (discharge == 1){
                    transferRome += listRomeNumber[0] + listRomeNumber[0];
                    break;
                }
            case 3:
                if (discharge == 3){
                    transferRome += listRomeNumber[4] + listRomeNumber[4] + listRomeNumber[4];
                    break;
                }
                if (discharge == 2){
                    transferRome += listRomeNumber[2] + listRomeNumber[2]+listRomeNumber[2];
                    break;
                }
                if (discharge == 1){
                    transferRome += listRomeNumber[0] + listRomeNumber[0] + listRomeNumber[0];
                    break;
                }
            case 4:
                if (discharge == 3){
                    transferRome += listRomeNumber[4] + listRomeNumber[5];
                    break;
                }
                if (discharge == 2){
                    transferRome += listRomeNumber[2] + listRomeNumber[3];
                    break;
                }
                if (discharge == 1){
                    transferRome += listRomeNumber[0] + listRomeNumber[1];
                    break;
                }
            case 5:
                if (discharge == 3){
                    transferRome += listRomeNumber[5];
                    break;
                }
                if (discharge == 2){
                    transferRome += listRomeNumber[3];
                    break;
                }
                if (discharge == 1){
                    transferRome += listRomeNumber[1];
                    break;
                }
            case 6:
                if (discharge == 3){
                    transferRome += listRomeNumber[5] + listRomeNumber[4];
                    break;
                }
                if (discharge == 2){
                    transferRome += listRomeNumber[3] + listRomeNumber[2];
                    break;
                }
                if (discharge == 1){
                    transferRome += listRomeNumber[1] + listRomeNumber[0];
                    break;
                }
            case 7:
                if (discharge == 3){
                    transferRome += listRomeNumber[5] + listRomeNumber[4] + listRomeNumber[4];
                    break;
                }
                if (discharge == 2){
                    transferRome += listRomeNumber[3] + listRomeNumber[2] + listRomeNumber[2];
                    break;
                }
                if (discharge == 1){
                    transferRome += listRomeNumber[1] + listRomeNumber[0] + listRomeNumber[0];
                    break;
                }
            case 8:
                if (discharge == 3){
                    transferRome += listRomeNumber[5] + listRomeNumber[4] + listRomeNumber[4] + listRomeNumber[4];
                    break;
                }
                if (discharge == 2){
                    transferRome += listRomeNumber[3] + listRomeNumber[2] + listRomeNumber[2] + listRomeNumber[2];
                    break;
                }
                if (discharge == 1){
                    transferRome += listRomeNumber[1] + listRomeNumber[0] + listRomeNumber[0] + listRomeNumber[0];
                    break;
                }
            case 9:
                if (discharge == 3){
                    transferRome += listRomeNumber[4] + listRomeNumber[6];
                    break;
                }
                if (discharge == 2){
                    transferRome += listRomeNumber[2] + listRomeNumber[4];
                    break;
                }
                if (discharge == 1){
                    transferRome += listRomeNumber[0] + listRomeNumber[2];
                    break;
                }

        }
        return transferRome;
    }
}
