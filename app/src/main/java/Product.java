/**
 * Created by ahmed on 4/12/17.
 */

public class Product {
    String Name;
    double Price;
    String Image;
    public String get_Name()
    {
        return  Name;

    }
    public void set_Name(String Name)
    {

        this.Name=Name;
    }
    public double get_Price()
    {
        return  Price;

    }
    public void set_Price( double price)
    {
        Price=price;
    }

    public void setImage(String Image)
    {
        this.Image=Image;

    }

    public String getImage()
    {

        return Image;
    }
}
