import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingPerson {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Andrei", 23));
        persons.add(new Person("Ilya", 24));
        persons.add(new Person("Ivan", 22));
        persons.add(new Person("Nastya", 16));
        persons.add(new Person("Vit", 20));
        persons.add(new Person("Georg", 21));
        persons.add(new Person("Vlad", 22));
        persons.add(new Person("I", 100));
        persons.add(new Person("Boss Andrei", 23));

        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println();

        persons.stream().sorted(Person.NameComparator).forEach(System.out::println);
        System.out.println();
        //интересно было сохранит ли отсортированный лист
        persons = persons.stream().sorted(Person.AgeComparator).collect(Collectors.toList());
        System.out.println();

        print(persons);
    }

    public static void print(List<Person> persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
