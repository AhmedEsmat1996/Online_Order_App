import java.util.List;

/**
 * Created by ahmed on 4/12/17.
 */

public class Admin extends Person {

    String P_image;
    List<Category> Lof_category;
    public void setP_image( String image)
    {

        this.P_image=image;

    }

    public String getP_image()
    {
        return P_image;
    }

    public List<Category> getLof_category() {
        return Lof_category;
    }

    public void setLof_category(List<Category> lof_category) {
        Lof_category = lof_category;
    }
}
