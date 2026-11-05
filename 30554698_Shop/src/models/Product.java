package models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 30554698
 */
public class Product
{
    //Attributes
    private int productID;
    private String productName;
    private double price;
    private int stockLevel;

// Getters

public int getProductID()
{
    return productID;
}

public String getProductName()
{
    return productName;
}

public double getPrice()
{
    return price;
}

public int getStockLevel()
{
    return stockLevel;
}


// Setters

public void setProductID(int ProductID)
{
    this.productID = ProductID;
}

public void setProductName(String ProductName)
{
    this.productName = ProductName;
}

public void setPrice(double Price)
{
    this.price = Price;
}

public void setStockLevel(int StockLevel)
{
    this.stockLevel = StockLevel;
}

    public Product() 
    {
        productID = 0;
        productName = "";
        price = 0.0;
        stockLevel = 0;
    }

//Constructors
    public Product(String productName, double price, int stockLevel)
    {
        this.productName = productName;
        this.price = price;
        this.stockLevel = stockLevel;
    }

    public Product(int productID, String productName, double price, int stockLevel)
    {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockLevel = stockLevel;
    }
    @Override
public String toString() {
    return productName + " - £" + String.format("%.2f", price);
}
}

