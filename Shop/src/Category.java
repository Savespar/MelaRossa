import java.util.ArrayList;

public class Category {
    private String name;
    ArrayList<Product> cproducts;

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.cproducts = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
