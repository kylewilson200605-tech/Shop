package models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 30554698
 */
import java.util.HashMap;

public class Customer extends User //extends to user to use its attributes
{
    //Private Attributes
    private String addressLine1;
    private String addressLine2;
    private String town;
    private String postcode;
    private boolean isregistered;
    private HashMap<Integer, Order> orders;

    // Getters

public String getAddressLine1()
{
    return addressLine1;
}

public String getAddressLine2()
{
    return addressLine2;
}

public String getTown()
{
    return town;
}

public String getPostcode()
{
    return postcode;
}

public boolean getIsRegistered()
{
    return isregistered;
}

public HashMap<Integer, Order> getOrders()
{
    return orders;
}

// Setters

public void setAddressLine1(String addressLine1)
{
    this.addressLine1 = addressLine1;
}

public void setAddressLine2(String addressLine2)
{
    this.addressLine2 = addressLine2;
}

public void setTown(String town)
{
    this.town = town;
}

public void setPostcode(String postcode)
{
    this.postcode = postcode;
}

public void setIsRegistered(boolean isregistered)
{
    this.isregistered = isregistered;
}

public void setOrders(HashMap<Integer, Order> orders)
{
    this.orders = orders;
}
//Constructors
    public Customer()
    {
        super();
        addressLine1 = "";
        addressLine2 = "";
        town = "";
        postcode = "";
        isregistered = false;
        orders = new HashMap<>();
    }

    public Customer(String addressLine1, String addressLine2, String town, String postcode, String username, String password, String firstName, String lastName)
    {
        super(username, password, firstName, lastName);
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.town = town;
        this.postcode = postcode;
        this.orders = new HashMap<>();
    }     
    public String greeting()
    {
        return "Welcome Back, " + getFirstName() + "!"
                + " We hope you enjoy shopping with us!";
    }
}