public class Horse extends Animal{
    int speed;

    public Horse (String food, String location, int speed){
        super(food, location);
        this.speed = speed;
    }
    @Override
    public void makeNoise() {
        System.out.println("Horse said");
    }

    @Override
    public void eat() {
        System.out.println("Horse eat " + this.food);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
