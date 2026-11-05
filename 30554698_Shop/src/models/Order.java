package models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 30554698
 */
import java.util.Date;
import java.util.HashMap;

public class Order
{
    //Private attributes
    
    private int orderId;
    private Date orderDate;
    private double orderTotal;
    private String status;
    private HashMap<Integer, OrderLine> orderLines;
    
    //Getters and setters
    
    public int getOrderId()
    {
    return orderId;
    }

    public void setOrderId(int orderId)
    {
    this.orderId = orderId;
    }

    public Date getOrderDate()
    {
    return orderDate;
    }

    public void setOrderDate(Date orderDate)
    {
    this.orderDate = orderDate;
    }

    public double getOrderTotal()
    {
    return orderTotal;
    }

    public void setOrderTotal(double orderTotal)
    {
    this.orderTotal = orderTotal;
    }

    public String getStatus()
    {
    return status;
    }

    public void setStatus(String status)
    {
    this.status = status;
    }

    public HashMap<Integer, OrderLine> getOrderLines()
    {
    return orderLines;
    }

    public void setOrderLines(HashMap<Integer, OrderLine> orderLines)
    {
    this.orderLines = orderLines;
    }
    
    public double calculateOrderTotal()
    {
    double total = 0;

    for (OrderLine line : getOrderLines().values()) {
        total += line.getLineTotal();
    }
    
    return total;
    }

    //Constructors

    public Order(int orderId, Date orderDate, double orderTotal, String status, HashMap<Integer, OrderLine> orderLines)
    {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
        this.status = status;
        this.orderLines = orderLines;
    }

    
    public Order(int orderId, Date orderDate, double orderTotal, String status)
    {
    this.orderId = orderId;
    this.orderDate = orderDate;
    this.orderTotal = orderTotal;
    this.status = status;
    this.orderLines = new HashMap<Integer, OrderLine>();
    }
}
