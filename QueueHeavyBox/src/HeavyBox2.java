public class HeavyBox2 {
    public double weight;
    public String content;

    HeavyBox2(double weight, String content){
        this.weight = weight;
        this.content = content;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getWeight() {
        return weight;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        String s = content + " " + weight;
        return s;
    }
}
