package models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 30554698
 */
public class Heatpump extends Product
{
    //Attributes
    private double efficiencyRating;
    
    // Getter

public double getEfficencyRating()
{
    return efficiencyRating;
}


// Setter

public void setEfficencyRating(double efficencyRating)
{
    this.efficiencyRating = efficencyRating;
}
//Constructors
    public Heatpump() 
    {
        super();
        efficiencyRating = 0;
    }

    public Heatpump(double efficiencyRating, String productName, double price, int stockLevel) 
    {
        super(productName, price, stockLevel);
        this.efficiencyRating = efficiencyRating;
    }

    public Heatpump(double efficiencyRating, int productID, String productName, double price, int stockLevel)
    {
        super(productID, productName, price, stockLevel);
        this.efficiencyRating = efficiencyRating;
    }
}
