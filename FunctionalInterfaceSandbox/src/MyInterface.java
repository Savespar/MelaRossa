public class MyInterface {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Big Java";

        Operationable<String> operation1 = (String x, String y) -> {
            if (Operationable.isNotNull(a) && Operationable.isNotNull(b)) {
                if (x.equals(y)) {
                    return x;
                } else {
                    return y;
                }
            }
            return "Line is NULL";
        };
        System.out.println(operation1.act(a, b));

        Operationable<String> operation2 = (String x, String y) -> x + " " + y;
        System.out.println(operation2.act(a, b));

    }

    interface Operationable<String> {

        static <String> boolean isNotNull(String s) {
            return s != null ? true : false;
        }

        default void printLine(String s) {
            System.out.println("Line " + s);
        }

        String act(String a, String b);

    }
}
