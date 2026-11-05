package models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 30554698
 */
public class SolarPanel extends Product
{
    //Attributes
    private int wattageOutput;
    
    // Getter

public int getWattageOutput()
{
    return wattageOutput;
}


// Setter

public void setWattageOutput(int wattageOutput)
{
    this.wattageOutput = wattageOutput;
}
//Constructors
    public SolarPanel() 
    {
        super();
        wattageOutput = 0;
    }

    public SolarPanel(int wattageOutput, String productName, double price, int stockLevel)
    {
        super(productName, price, stockLevel);
        this.wattageOutput = wattageOutput;
    }

    public SolarPanel(int wattageOutput, int productID, String productName, double price, int stockLevel)
    {
        super(productID, productName, price, stockLevel);
        this.wattageOutput = wattageOutput;
    }
}
