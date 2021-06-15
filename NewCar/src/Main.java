public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Garry Potter", 6);
        System.out.println(driver1.toString());
        Person person1 = new Person(driver1.getFullName(), driver1.getExperience(), 16);
        System.out.println(person1.toString());
        Engine engineSportCar1 = new Engine(500, "Sport broom");
        System.out.println(engineSportCar1.toString());
        Car quidditchBroom = new SportCar("Best Pine Broom","Sport broom", 3.6, driver1, engineSportCar1, 400);
        System.out.println(quidditchBroom.toString());
        Driver driver2 = new Driver("Hagrid", 1300);
        System.out.println(driver2.toString());
        Person person2 = new Person(driver2.getFullName(), driver2.getExperience(), 1700);
        System.out.println(person2.toString());
        Engine engineWorkCar1 = new Engine(350, "Work broom");
        System.out.println(engineWorkCar1.toString());
        Lorry workLorry1 = new Lorry("Big Broom", "Work broom", 6.7, driver2, engineWorkCar1, 600);
        System.out.println(workLorry1.toString());
        workLorry1.turnLeft(workLorry1.getMarka(), workLorry1.getDriver().getFullName());
        quidditchBroom.start(quidditchBroom.getMarka(), quidditchBroom.getDriver().getFullName());

    }
}
