import jdk.dynalink.Operation;

public class Solution {
    public static void main(String[] args) {
        int n1 = 7, n2 = 46, n3 = 53;
        ThreeFunction<Integer> tf1 = (x, y, z) -> (Math.max(x, Math.max(y, z)));
        int max = tf1.threeFunction(n1, n2, n3);
        System.out.println(max);

        ThreeFunction<Integer> tf2 = (x, y, z) -> (Math.min(x, Math.min(y, z)));
        int min = tf2.threeFunction(n1, n2, n3);
        System.out.println(min);
    }

    @FunctionalInterface
    public interface ThreeFunction<Integer> {
        Integer threeFunction(Integer a, Integer b, Integer c);
    }

}
