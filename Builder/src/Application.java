public class Application {
    public static void main(String[] args) {
        CarBuilder car1 = new CarBuilder.Builder("Ferrari", 600, "Automat")
                .gps(true)
                .navigator(true)
                .build();

        CarBuilder car2 = new CarBuilder.Builder("MOAZ", 1600, "Manualt")
                .gps(true)
                .navigator(false)
                .build();

        CarBuilder car3 = new CarBuilder.Builder("Space engine", 643600, "Unknown technology")
               .build();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }

}
