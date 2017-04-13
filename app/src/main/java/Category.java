import java.util.List;

/**
 * Created by ahmed on 4/12/17.
 */

public class Category {
    String  Name;
    String Color;
    List<Product> Lof_product;

    public List<Product> getLof_product() {
        return Lof_product;
    }

    public String getColor() {
        return Color;
    }

    public String getName() {
        return Name;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setLof_product(List<Product> lof_product) {
        Lof_product = lof_product;
    }

    public void setName(String name) {
        Name = name;
    }
}
