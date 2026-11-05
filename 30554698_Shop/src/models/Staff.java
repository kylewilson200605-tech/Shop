package models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 30554698
 */
public class Staff extends User
{
    //Attributes
    private String position;
    private double salary;
    
    // Getters

public String getPosition()
{
    return position;
}

public double getSalary()
{
    return salary;
}
// Setters

public void setPosition(String position)
{
    this.position = position;
}

public void setSalary(double salary)
{
    this.salary = salary;
}
//Constructors
    public Staff()
    {
        super();
        position = "";
        salary = 0.0;
    }

    public Staff(String position, double salary, String username, String password, String firstName, String lastName)
    {
        super(username, password, firstName, lastName);
        this.position = position;
        this.salary = salary;
    }
    
    public String greeting() {
    return "Welcome to the Staff Portal, " + getFirstName() + "!"
            + "\nPosition: " + getPosition()
            + "\nHave a productive shift!";
}
}
