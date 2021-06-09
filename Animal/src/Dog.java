public class Dog extends Animal{
    int biteForce;

    public Dog (String food, String location, int biteForce){
        super(food, location);
        this.biteForce = biteForce;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog Said");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat " + this.food);
    }

    public int getBiteForce() {
        return biteForce;
    }

    public void setBiteForce(int biteForce) {
        this.biteForce = biteForce;
    }
}
