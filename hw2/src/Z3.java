public class Z3 {
    public static void main(String[] args){
        int n=12345;
        int count;
        int sum = 0;
        while (n > 0) {
            count = n % 10;
            sum +=  count;
            n /= 10;
        }
        System.out.println(sum);
    }
}
