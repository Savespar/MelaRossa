public class Toy {
    private String name;
    private String milota;

    public Toy (String name, String milota){
        this.name = name;
        this.milota = milota;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMilota(String milota) {
        this.milota = milota;
    }

    public String getName() {
        return name;
    }

    public String getMilota() {
        return milota;
    }

    @Override
    public String toString() {
        String s = "Name toy is " + name + ". She is " + milota;
        return s;
    }
}
