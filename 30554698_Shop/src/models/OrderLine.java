package models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 30554698
 */
public class OrderLine 
{
    //Private Attributes
    
    private int orderLineId;
    private Product product;
    private int quantity;
    private double lineTotal;
    
    //Getters and Setters
    
    public int getOrderLineId() 
    {
    return orderLineId;
    }

    public void setOrderLineId(int orderLineId)
    {
    this.orderLineId = orderLineId;
    }

    public Product getProduct()
    {
    return product;
    }

    public void setProduct(Product product) 
    {
    this.product = product;
    }

    public int getQuantity()
    {
    return quantity;
    }

    public void setQuantity(int quantity) 
    {
    this.quantity = quantity;
    }

    public double getLineTotal() 
    {
    return lineTotal;
    }

    public void setLineTotal(double lineTotal)
    {
    this.lineTotal = lineTotal;
    }
    
    //Constructors

    public OrderLine(int orderLineId, Product product, int quantity, double lineTotal)
    {
        this.orderLineId = orderLineId;
        this.product = product;
        this.quantity = quantity;
        this.lineTotal = lineTotal;
    }

    public OrderLine(int orderLineId, Product product, int quantity)
    {
        this.orderLineId = orderLineId;
        this.product = product;
        this.quantity = quantity;
        this.lineTotal = product.getPrice() * quantity;
    }
}
