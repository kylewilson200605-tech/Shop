package models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 30554698
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBManager {
    
    public ArrayList<Customer> loadCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        
         try {
        Connection conn = DriverManager.getConnection(
            "jdbc:ucanaccess://Data/ShopDB.accdb"
        );

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Customers");

        while (rs.next()) {
            Customer customer = new Customer(
                rs.getString("AddressLine1"),
                rs.getString("AddressLine2"),
                rs.getString("Town"),
                rs.getString("Postcode"),
                rs.getString("Username"),
                rs.getString("Password"),
                rs.getString("FirstName"),
                rs.getString("LastName")
            );

            customers.add(customer);
        }

        conn.close();

    } catch (Exception e) {
        System.out.println(e);
    }
        
        return customers;
    }
    
    public boolean deleteProduct(int productId) {

    String sql = "DELETE FROM Products WHERE ProductID = ?";

    try (Connection conn = DriverManager.getConnection(
                "jdbc:ucanaccess://Data/ShopDB.accdb");
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, productId);

        int rowsDeleted = stmt.executeUpdate();

        return rowsDeleted > 0;

    } catch (SQLException ex) {

        System.out.println(
                "Error deleting product: " + ex.getMessage());

        return false;
    }
    }

    public ArrayList<Staff> loadStaff() {
    ArrayList<Staff> staff = new ArrayList<>();

    try {
        Connection conn = DriverManager.getConnection(
            "jdbc:ucanaccess://Data/ShopDB.accdb"
        );

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Staff");

        while (rs.next()) {
            Staff member = new Staff(
                rs.getString("Position"),
                rs.getDouble("Salary"),
                rs.getString("Username"),
                rs.getString("Password"),
                rs.getString("FirstName"),
                rs.getString("LastName")
            );

            staff.add(member);
        }

        conn.close();

    } catch (Exception e) {
        System.out.println(e);
    }

    return staff;
    }
    
    public Customer customerLogin(String username, String password) {
    
        ArrayList<Customer> customers = loadCustomers();

        for (Customer customer : customers) {
         
           if (customer.getUsername().equals(username)
                && customer.getPassword().equals(password)) {
            
              return customer;
           }
       }

    return null;
    }

    public Staff staffLogin(String username, String password) {
    
        ArrayList<Staff> staff = loadStaff();

        for (Staff member : staff) {
            if (member.getUsername().equals(username) &&
                member.getPassword().equals(password)) {
            
            return member;
        }
    }

    return null;

    }
        public ArrayList<Product> loadProducts()
        {

        ArrayList<Product> products = new ArrayList<>();
        
         try {
        Connection conn = DriverManager.getConnection(
            "jdbc:ucanaccess://Data/ShopDB.accdb"
        );

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Products");

        while (rs.next()) {

            int productID = rs.getInt("ProductId");
            String productName = rs.getString("ProductName");
            double price = rs.getDouble("Price");
            int stockLevel = rs.getInt("StockLevel");
            String productType = rs.getString("ProductType");

            if (productType.equals("Solar Panel")) {

                int wattageOutput = rs.getInt("WattageOutput");

                SolarPanel solarPanel = new SolarPanel(
                    wattageOutput,
                    productID,
                    productName,
                    price,
                    stockLevel
                );

                products.add(solarPanel);

            } else if (productType.equals("Heat Pump")) {

                double efficiencyRating = rs.getDouble("EfficiencyRating");

                Heatpump heatpump = new Heatpump(
                    efficiencyRating,
                    productID,
                    productName,
                    price,
                    stockLevel
                );

                products.add(heatpump);
            }
        }

        rs.close();
        stmt.close();
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

        return products;
        }
        
    public boolean saveOrder(String username, double orderTotal) {

    String sql = "INSERT INTO Orders "
            + "(Username, OrderTotal, OrderDate) "
            + "VALUES (?, ?, ?)";

    try (Connection conn = DriverManager.getConnection(
            "jdbc:ucanaccess://Data/ShopDB.accdb");
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, username);
        stmt.setDouble(2, orderTotal);
        stmt.setDate(3, new java.sql.Date(
                System.currentTimeMillis()));

        stmt.executeUpdate();

        return true;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
}

    
    //Testing Database code to display Customer and Staff Info
    
//    public static void main(String[] args) {
//
//    DBManager db = new DBManager();
//
//    ArrayList<Customer> customers = db.loadCustomers();
//
//    System.out.println("Customers:");
//
//    for (Customer customer : customers) {
//        System.out.println(
//            customer.getUsername() + " "
//            + customer.getFirstName() + " "
//            + customer.getLastName()
//        );
//    }
//
//    ArrayList<Staff> staff = db.loadStaff();
//
//    System.out.println("Staff:");
//
//    for (Staff member : staff) {
//        System.out.println(
//            member.getUsername() + " "
//            + member.getFirstName() + " "
//            + member.getLastName()
//        );
//    }
//}

