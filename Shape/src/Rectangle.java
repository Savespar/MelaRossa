public class Rectangle extends Shape{

        String shape;
        public Rectangle(String color, String shape){
            super(color);
            this.shape = shape;
        }

    @Override
    public void draw(Shape shape) {
        System.out.println("Figure " + getShape() +  " Color " + shape.color);
    }

        public String getShape() {
            return shape;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }
    }


