import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Alis", "Very nice");
        Toy toy2 = new Toy("Kristi", "Nice");
        Toy toy3 = new Toy("Helen", "Very nice");
        Toy toy4 = new Toy("Julia", "No nice");
        Toy toy5 = new Toy("Anna", "Nice");
        Toy toy6 = new Toy("Kate", "Very very nice");
        HashMap <String, Toy> toys = new HashMap<>();
        toys.put(toy1.getName(),toy1);
        toys.put(toy2.getName(),toy2);
        toys.put(toy3.getName(),toy3);
        toys.put(toy4.getName(),toy4);
        toys.put(toy5.getName(),toy5);
        toys.put(toy6.getName(),toy6);
        printCouple(toys);
        System.out.println();
        printName(toys);
        System.out.println();
        printValue(toys);
    }

    public static void printCouple(HashMap <String, Toy> toys) {
        for (Map.Entry entry: toys.entrySet()) {
            System.out.println(entry);
        }
    }

    public static void printName(HashMap <String, Toy> toys) {
        for (Map.Entry entry: toys.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public static void printValue(HashMap <String, Toy> toys) {
        for (Map.Entry entry: toys.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

}
