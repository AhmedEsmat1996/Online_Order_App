/**
 * Created by ahmed on 4/12/17.
 */

public abstract class Person {

    String Name ;
    String Email;
    String Address;
    int Phone;
    String Password;
public String gettname()
{
    return Name;
}


    public int getPhone() {
        return Phone;
    }

    public String getAddress() {
        return Address;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setName(String Name)
    {
        this.Name= Name;


    }
    public void setEmail(String Email)
    {

        this.Email=Email;
    }
    public void setAddress(String Address)
    {

        this.Address=Address;

    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }
}
