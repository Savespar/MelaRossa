import java.util.ArrayList;

public class Vet {
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        Dog shepherd = new Dog("Pig", "Germany", 15);
        animal.add(shepherd);
        Cat cheshireCat = new Cat("Cake", "England", 1000);
        animal.add(cheshireCat);
        Dog komondor = new Dog ("Sheep", "Hungary", 21);
        animal.add(komondor);
        Horse arabianHorse = new Horse("Grass", "Near East", 45);
        animal.add(arabianHorse);
        for (Animal a:animal) {
            treatAnimal(a);
        }
    }

    public static void treatAnimal(Animal animal){
        System.out.println("Next patient:");
        System.out.println("Location animal " + animal.location);
        System.out.println("Food animal " + animal.food);
    }
}
