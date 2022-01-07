
import Entities.Order;
import Entities.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ManagerProductForm extends javax.swing.JFrame {
    DefaultTableModel model;
    ConnectionClass connectionClass = new ConnectionClass();
  
    public ManagerProductForm() {
        initComponents();
        model = (DefaultTableModel) productTable.getModel();
        ListProducts();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblUnitsOnOrder = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        lblProductList = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tbxSearchBar = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        btnShowCategories = new javax.swing.JButton();
        lblProductName = new javax.swing.JLabel();
        lblCategoryID = new javax.swing.JLabel();
        lblQuantityPerUnit = new javax.swing.JLabel();
        lblUnitPrice = new javax.swing.JLabel();
        lblUnitsInStock = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tbxProductName = new javax.swing.JTextField();
        tbxCategoryID = new javax.swing.JTextField();
        tbxQuantityPerUnit = new javax.swing.JTextField();
        tbxUnitPrice = new javax.swing.JTextField();
        tbxUnitsInStock = new javax.swing.JTextField();
        tbxUnitsOnOrder = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        btnClear = new javax.swing.JButton();
        btnOrdersAndCustomers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUnitsOnOrder.setBackground(new java.awt.Color(255, 52, 109));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category ID", "Quantity Per Unit", "Unit Price", "Units In Stock", "Units On Order"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setResizable(false);
            productTable.getColumnModel().getColumn(1).setResizable(false);
            productTable.getColumnModel().getColumn(2).setResizable(false);
            productTable.getColumnModel().getColumn(3).setResizable(false);
            productTable.getColumnModel().getColumn(4).setResizable(false);
            productTable.getColumnModel().getColumn(5).setResizable(false);
            productTable.getColumnModel().getColumn(6).setResizable(false);
        }

        lblProductList.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lblProductList.setText("Product List");

        tbxSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbxSearchBarKeyReleased(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSearch.setText("Search :");

        btnShowCategories.setBackground(new java.awt.Color(51, 255, 255));
        btnShowCategories.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnShowCategories.setForeground(new java.awt.Color(0, 63, 0));
        btnShowCategories.setText("Show Categories");
        btnShowCategories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowCategoriesMouseClicked(evt);
            }
        });

        lblProductName.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblProductName.setText("Product Name :");

        lblCategoryID.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblCategoryID.setText("CategoryID :");

        lblQuantityPerUnit.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblQuantityPerUnit.setText("Quantity Per Unit : ");

        lblUnitPrice.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblUnitPrice.setText("Unit Price :");

        lblUnitsInStock.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblUnitsInStock.setText("Units In Stock :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Units On Order :");

        btnUpdate.setBackground(new java.awt.Color(0, 153, 204));
        btnUpdate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 153, 204));
        btnAdd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 153, 204));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(204, 226, 68));
        btnClear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnClear.setText("Clear Text Fields");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnOrdersAndCustomers.setBackground(new java.awt.Color(102, 255, 204));
        btnOrdersAndCustomers.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnOrdersAndCustomers.setForeground(new java.awt.Color(0, 0, 102));
        btnOrdersAndCustomers.setText("Orders And Customers");
        btnOrdersAndCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersAndCustomersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblUnitsOnOrderLayout = new javax.swing.GroupLayout(lblUnitsOnOrder);
        lblUnitsOnOrder.setLayout(lblUnitsOnOrderLayout);
        lblUnitsOnOrderLayout.setHorizontalGroup(
            lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblUnitsOnOrderLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(lblUnitsOnOrderLayout.createSequentialGroup()
                        .addComponent(btnShowCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrdersAndCustomers)
                        .addGap(50, 50, 50)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lblUnitsOnOrderLayout.createSequentialGroup()
                        .addComponent(lblProductList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbxSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblUnitsOnOrderLayout.createSequentialGroup()
                .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblUnitsOnOrderLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbxCategoryID, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(tbxProductName))
                        .addGap(86, 86, 86)
                        .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantityPerUnit)
                            .addComponent(lblUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbxUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbxQuantityPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(lblUnitsOnOrderLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblUnitsOnOrderLayout.createSequentialGroup()
                        .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblUnitsOnOrderLayout.createSequentialGroup()
                                .addComponent(lblUnitsInStock)
                                .addGap(18, 18, 18)
                                .addComponent(tbxUnitsInStock, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(lblUnitsOnOrderLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbxUnitsOnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblUnitsOnOrderLayout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
        );
        lblUnitsOnOrderLayout.setVerticalGroup(
            lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblUnitsOnOrderLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductList)
                    .addComponent(tbxSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnShowCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdersAndCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantityPerUnit)
                    .addComponent(lblUnitsInStock)
                    .addComponent(tbxProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxQuantityPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxUnitsInStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoryID)
                    .addComponent(jLabel3)
                    .addComponent(tbxUnitsOnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnitPrice)
                    .addComponent(tbxUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(lblUnitsOnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUnitsOnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUnitsOnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void SearchProduct(String search){
        
        TableRowSorter<DefaultTableModel> trwSorter = new TableRowSorter<DefaultTableModel>(model);
        
        productTable.setRowSorter(trwSorter);
        
        trwSorter.setRowFilter(RowFilter.regexFilter("(?i)"+ search));

    }

    
    private void tbxSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxSearchBarKeyReleased
        
     String search = tbxSearchBar.getText();
     
     SearchProduct(search);
         
    }//GEN-LAST:event_tbxSearchBarKeyReleased

    private void btnShowCategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowCategoriesMouseClicked

        JOptionPane.showMessageDialog(rootPane, "CategoryID - Category Name\n"
                + "1 - Beverages\n"
                + "2 - Condiments\n"
                + "3 - Confections\n"
                + "4 - Dairy Products\n"
                + "5 - Grains/Cereals\n"
                + "6 - Meat/Poltry\n"
                + "7 - Produce\n"
                + "8 - Seafood");

    }//GEN-LAST:event_btnShowCategoriesMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        String productName = tbxProductName.getText();
        
        String categoryID = tbxCategoryID.getText();
        
        String quantityPerUnit = tbxQuantityPerUnit.getText();
        
        String unitPrice = tbxUnitPrice.getText();
        
        String unitsInStock = tbxUnitsInStock.getText();
                
        String unitsOnOrder = tbxUnitsOnOrder.getText();
        
        
        if("".equals(tbxProductName.getText())){
            JOptionPane.showMessageDialog(rootPane, "Please Choose A Product!");
        }
        
        else {       
            connectionClass.AddProduct(productName,categoryID,quantityPerUnit,unitPrice,unitsInStock,unitsOnOrder);
            ListProducts();
            JOptionPane.showMessageDialog(rootPane, "The product is successfully added.");
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        tbxCategoryID.setText("");
        tbxProductName.setText("");
        tbxQuantityPerUnit.setText("");
        tbxUnitPrice.setText("");
        tbxUnitsInStock.setText("");
        tbxUnitsOnOrder.setText("");
        

    }//GEN-LAST:event_btnClearActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
       
        int selectedRow = productTable.getSelectedRow();
        
        tbxProductName.setText(model.getValueAt(selectedRow, 1).toString());
        tbxCategoryID.setText(model.getValueAt(selectedRow, 2).toString());
        tbxQuantityPerUnit.setText(model.getValueAt(selectedRow, 3).toString());
        tbxUnitPrice.setText(model.getValueAt(selectedRow, 4).toString());
        tbxUnitsInStock.setText(model.getValueAt(selectedRow, 5).toString());
        tbxUnitsOnOrder.setText(model.getValueAt(selectedRow, 6).toString());
        
        
    }//GEN-LAST:event_productTableMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        String productName = tbxProductName.getText();
        
        String categoryID = tbxCategoryID.getText();
        
        String quantityPerUnit = tbxQuantityPerUnit.getText();
        
        String unitPrice = tbxUnitPrice.getText();
        
        String unitsInStock = tbxUnitsInStock.getText();
                
        String unitsOnOrder = tbxUnitsOnOrder.getText();
        
        
        int selectedrow = productTable.getSelectedRow();
        
        if(selectedrow == -1){
            if(productTable.getRowCount() ==0){ 
                JOptionPane.showMessageDialog(rootPane, "Product Table Is Empty!");
            }  
            else{
                JOptionPane.showMessageDialog(rootPane, "Please Choose A Product For Update!");
            }
        }
        
        else{
            int productID = (int) productTable.getValueAt(selectedrow, 0);    
            connectionClass.UpdateProduct(productID,productName,categoryID,quantityPerUnit,unitPrice,unitsInStock,unitsOnOrder);
            ListProducts();
            JOptionPane.showMessageDialog(rootPane, "The product is successfully updated.");
        }
        
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        int selectedRow = productTable.getSelectedRow();
        
        if(selectedRow == -1){
            
            if(model.getRowCount() == 0){
                JOptionPane.showMessageDialog(rootPane, "Product Table Is Empty");
            }
            
            else{
                JOptionPane.showMessageDialog(rootPane, "Please Choose A Product For Delete!");
            }
            
        }
        
        else{
            int productId = (int) model.getValueAt(selectedRow, 0);
            
            connectionClass.DeleteProduct(productId);
            
            ListProducts();
            
             JOptionPane.showMessageDialog(rootPane, "The product is successfully deleted.");
            
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnOrdersAndCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersAndCustomersActionPerformed
        StaffForm staffForm = new StaffForm();
        
        staffForm.setVisible(true);
       
    }//GEN-LAST:event_btnOrdersAndCustomersActionPerformed


    
    public void ListProducts(){
        model.setRowCount(0);
        
        ArrayList<Product> products = new ArrayList<Product>();   
        products = connectionClass.getAllProducts();
            if(products !=null){
                for(Product product : products){
                    Object[] addedProducts = {product.getProductID(),product.getProductName(),product.getCategoryID(),product.getQuantityPerUnit(),product.getUnitPrice(),product.getUnitsInStock(),product.getUnitsOnOrder()};
                    model.addRow(addedProducts);
                }
            
            }

        
    }
    
    
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOrdersAndCustomers;
    private javax.swing.JButton btnShowCategories;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblCategoryID;
    private javax.swing.JLabel lblProductList;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuantityPerUnit;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JLabel lblUnitsInStock;
    private javax.swing.JPanel lblUnitsOnOrder;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField tbxCategoryID;
    private javax.swing.JTextField tbxProductName;
    private javax.swing.JTextField tbxQuantityPerUnit;
    private javax.swing.JTextField tbxSearchBar;
    private javax.swing.JTextField tbxUnitPrice;
    private javax.swing.JTextField tbxUnitsInStock;
    private javax.swing.JTextField tbxUnitsOnOrder;
    // End of variables declaration//GEN-END:variables
}
