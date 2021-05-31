public class String_6 {
    public static void main(String[] args) {
        String number;
        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            number = buildString(i);
            if (number.indexOf("4") != -1 || number.indexOf("13") != -1) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static String buildString(int num) {
        String s = Integer.toString(num);
        for (int i = s.length(); i < 5; i++) {
            s = "0" + s;
        }
        return s;
    }
}
