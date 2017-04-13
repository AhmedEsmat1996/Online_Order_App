import java.util.List;

/**
 * Created by ahmed on 4/12/17.
 */

public class User  extends Person {

List<Order> L_order;

    public List<Order> getL_order() {
        return L_order;
    }
    public void setL_order(List<Order> l_order)
    {

        L_order=l_order;

    }
}
