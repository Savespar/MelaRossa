public class Lorry extends Car {
    int carrying;

    public Lorry(String marka, String carClass, double weight, Driver driver, Engine engine, int carrying) {
        super(marka, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return super.toString() + "; Carrying: " + getCarrying();
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}
