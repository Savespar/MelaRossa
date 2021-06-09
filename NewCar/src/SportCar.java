public class SportCar extends Car {
    int speed;

    public SportCar(String marka, String carClass, double weight, Driver driver, Engine engine, int speed) {
        super(marka, carClass, weight, driver, engine);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + ": Speed: " + getSpeed();
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
