public abstract class Car {
    private String marka;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String marka, String carClass, double weight, Driver driver, Engine engine) {
        this.marka = marka;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(String marka, String driver) {
        System.out.println("Broom:" + getMarka() + "; Driver: " + getDriver().getFullName() + ": " + "Поехали");
    }

    public void stop(String marka, String driver) {
        System.out.println("Broom:" + getMarka() + "; Driver: " + getDriver().getFullName() + ": " + "Останавливаемся");
    }

    public void turnRight(String marka, String driver) {
        System.out.println("Broom:" + getMarka() + "; Driver: " + getDriver().getFullName() + ": " + "Поворот направо");
    }

    public void turnLeft(String marka, String driver) {
        System.out.println("Broom:" + getMarka() + "; Driver: " + getDriver().getFullName() + ": " + "Поворот налево");
    }

    public String toString() {
        return "Marka: " + getMarka() + "; Car class: " + getCarClass() + "; Weight; " + getWeight() + "; Driver: " + getDriver() + "; Engine: " + getEngine();
    }

    public String getMarka() {
        return marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
