import java.util.List;

/**
 * Created by ahmed on 4/12/17.
 */

public class Order {
    double Total_price;
    String status;
    List<Product> L_product;
    public double getTotal_price()
    {
        return Total_price;
    }
    public void settotal_price(double price)
    {
    Total_price= price;

    }

    public void setstatus(String status)
    {

        this.status=status;
    }
    public String getStatus()
    {
        return status;
    }

    public void setL_product(List<Product>x)
    {
        this.L_product=x;

    }
    public  List<Product>  getL_product()
    {

        return L_product;

    }
}
