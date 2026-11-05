/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;
import models.DBManager;
import models.Product;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import models.Order;
import models.OrderLine;
import java.util.Date;
import models.Customer;
/**
 *
 * @author 30554698
 */

public class ProductMenu extends javax.swing.JFrame {
    
    private ArrayList<Product> products;
    
    private ArrayList<Product> displayedProducts = new ArrayList<>();
    
    private Order basketOrder =
    new Order(1, new Date(), 0.0, "Basket");
    
    private Customer loggedInCustomer;

    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ProductMenu.class.getName());

    public ProductMenu() 
    {
    initComponents();
    
    DBManager db = new DBManager();
    products = db.loadProducts();
    
    DefaultListModel<String> categoryModel = new DefaultListModel<>();

    categoryModel.addElement("SolarPanel");
    categoryModel.addElement("Heatpump");

    lstCategories.setModel(categoryModel);
    }
    
    
   public ProductMenu(Customer customer)
   {
    this();
    this.loggedInCustomer = customer;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnViewBasket = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnAddtoBasket = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstCategories = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstProducts = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("Back");

        btnViewBasket.setText("View Basket");
        btnViewBasket.addActionListener(this::btnViewBasketActionPerformed);

        jLabel1.setText("Products");

        jLabel2.setText("Categories");

        jLabel3.setText("Product");

        jLabel4.setText("Quantity");

        btnAddtoBasket.setText("Add to Basket");
        btnAddtoBasket.addActionListener(this::btnAddtoBasketActionPerformed);

        lstCategories.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Heatpump", "SolarPanel" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCategories.addListSelectionListener(this::lstCategoriesValueChanged);
        jScrollPane3.setViewportView(lstCategories);

        jScrollPane4.setViewportView(lstProducts);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBack)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnViewBasket)
                                                .addComponent(jLabel3)))
                                        .addComponent(btnAddtoBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnViewBasket)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddtoBasket)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstCategoriesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCategoriesValueChanged

    if (evt.getValueIsAdjusting()) {
        return;
    }

    String selectedCategory = lstCategories.getSelectedValue();

    DefaultListModel<String> productModel = new DefaultListModel<>();
    displayedProducts.clear();


    for (Product product : products) {

        if (product.getClass().getSimpleName().equals(selectedCategory)) {
            productModel.addElement(product.toString());
            displayedProducts.add(product);
        }
    }

    lstProducts.setModel(productModel);
    }//GEN-LAST:event_lstCategoriesValueChanged

    private void btnAddtoBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoBasketActionPerformed
        
    if (lstProducts.getSelectedIndex() == -1) {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Please select a product."
    );
    return;
    }
    
    
    int quantity;

    try {
    quantity = Integer.parseInt(txtQuantity.getText().trim());
    } catch (NumberFormatException e) {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Please enter a valid quantity."
    );
    return;
    }

    if (quantity <= 0) {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Quantity must be greater than zero."
    );
    return;
    }
    
    Product selectedProduct =
    displayedProducts.get(lstProducts.getSelectedIndex());

    if (quantity > selectedProduct.getStockLevel())
    {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Not enough stock available."
    );
    return;
    }
    
    int orderLineId = basketOrder.getOrderLines().size() + 1;

    OrderLine newOrderLine = new OrderLine(
    orderLineId,
    selectedProduct,
    quantity
    );

    basketOrder.getOrderLines().put(orderLineId, newOrderLine);

    javax.swing.JOptionPane.showMessageDialog(
    this, "Product added to basket."
    );

    }//GEN-LAST:event_btnAddtoBasketActionPerformed

    private void btnViewBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBasketActionPerformed

         Basket basket = new Basket(basketOrder, loggedInCustomer);
         basket.setVisible(true);
         this.dispose();

    }//GEN-LAST:event_btnViewBasketActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ProductMenu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtoBasket;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewBasket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lstCategories;
    private javax.swing.JList<String> lstProducts;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
