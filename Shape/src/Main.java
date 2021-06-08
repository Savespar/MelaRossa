public class Main {
    public static void main(String[] args) {
        Shape[] picture = new Shape[]{new Circle("Green", "Circle"), new Rectangle("Yellow", "Rectangle")};
        for (Shape s : picture) {
            s.draw(s);
        }
    }
}
