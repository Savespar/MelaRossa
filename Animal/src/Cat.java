public class Cat extends Animal{
    int rumblingVolume;

    public Cat (String food, String location, int rumblingVolume){
        super(food, location);
        this.rumblingVolume = rumblingVolume;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat Said");;
    }

    @Override
    public void eat() {
        System.out.println("Cat eat " + this.food);
    }

    public int getRumblingVolume() {
        return rumblingVolume;
    }

    public void setRumblingVolume(int rumblingVolume) {
        this.rumblingVolume = rumblingVolume;
    }
}
