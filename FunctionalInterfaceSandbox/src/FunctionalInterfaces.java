public class FunctionalInterfaces {
    public static void main(String[] args) {
        String animal = "Cat";
        String fish = "Shark";
        int flockSharks = 67;
        Predicate<String> lengthLine = x -> x.isEmpty();
        System.out.println(!lengthLine.test(animal));

        BinaryOperator<Integer> sumLength = (x, y) -> x + y;
        System.out.println(sumLength.apply(animal.length(), fish.length()));

        UnaryOperator<String> characteristic = x -> "Angry " + x;
        System.out.println(characteristic.apply(fish));

        Function<Integer, String> flock = x-> "There are " + String.valueOf(x) + " sharks in a pack";
        System.out.println(flock.apply(flockSharks));

        Consumer<String> print = x-> System.out.println(x + " is good!!!");
        print.accept(animal);

        Supplier<String> nameCat = () -> {
            return "Glutton";
        };
        System.out.println("This " + animal + " name is " + nameCat.get());
    }

    public interface Predicate<String> {
        boolean test(String a);
    }

    public interface BinaryOperator<Integer> {
        Integer apply(Integer a, Integer b);
    }

    public interface UnaryOperator<String> {
        String apply(String a);
    }

    public interface Function <Integer, String>{
        String apply (Integer a);
    }

    public interface Consumer<Sting>{
        void accept(String a);
    }

    public interface Supplier<String>{
        String get();
    }
}
