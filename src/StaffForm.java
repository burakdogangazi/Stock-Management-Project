
import Entities.Customer;
import Entities.Order;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class StaffForm extends javax.swing.JFrame {

    DefaultTableModel orderModel;
    DefaultTableModel customerModel;
    ConnectionClass connectionClass = new ConnectionClass();
 
    public StaffForm() {
        initComponents();
        customerModel = (DefaultTableModel) customerTable.getModel();
        ListCustomers();
        
        orderModel = (DefaultTableModel) orderTable.getModel();
        ListOrders();
    }

    public void SearchCustomer(String search){
        
        TableRowSorter<DefaultTableModel> trwSorter = new TableRowSorter<DefaultTableModel>(customerModel);
        
        customerTable.setRowSorter(trwSorter);
        
        trwSorter.setRowFilter(RowFilter.regexFilter("(?i)"+ search));

    }
    
    public void SearchOrder(String search){
        
        TableRowSorter<DefaultTableModel> trwSorter = new TableRowSorter<DefaultTableModel>(orderModel);
        
        orderTable.setRowSorter(trwSorter);
        
        trwSorter.setRowFilter(RowFilter.regexFilter("(?i)"+ search));

    }
    public void ListOrders(){
        orderModel.setRowCount(0);
        
        ArrayList<Order> orders = new ArrayList<Order>();   
        orders = connectionClass.getAllOrders();
            if(orders !=null){
                for(Order order : orders){
                    Object[] ordersObject = {order.getOrderID(),order.getOrderDate(),order.getShipName(),order.getShipAddress()};
                    orderModel.addRow(ordersObject);
                }
            
            }
    }
    
    public void ListCustomers(){
        customerModel.setRowCount(0);
        
        ArrayList<Customer> customers = new ArrayList<Customer>();
        
        customers = connectionClass.getAllCustomers();
        
        if(customers!=null){
            for(Customer customer: customers){
                Object[] customerObjects = {customer.getCustomerID(),customer.getCompanyName(),customer.getContactName(),customer.getContactTitle(),customer.getAddress(),customer.getCity(),customer.getCountry(),customer.getPostalCode(),customer.getPhone(),customer.getFax()};
                customerModel.addRow(customerObjects);
            }
        }    
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblCustomerList = new javax.swing.JLabel();
        lblOrderList = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tbxSearchCustomers = new javax.swing.JTextField();
        lblSearchOrders = new javax.swing.JLabel();
        tbxSearchOrders = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(240, 207, 216));

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Company Name", "Contact Name", "Contact Title", "Address", "City", "Country", "Postal Code", "Phone", "Fax"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTable);
        if (customerTable.getColumnModel().getColumnCount() > 0) {
            customerTable.getColumnModel().getColumn(0).setResizable(false);
            customerTable.getColumnModel().getColumn(1).setResizable(false);
            customerTable.getColumnModel().getColumn(2).setResizable(false);
            customerTable.getColumnModel().getColumn(3).setResizable(false);
            customerTable.getColumnModel().getColumn(4).setResizable(false);
            customerTable.getColumnModel().getColumn(5).setResizable(false);
            customerTable.getColumnModel().getColumn(6).setResizable(false);
            customerTable.getColumnModel().getColumn(7).setResizable(false);
            customerTable.getColumnModel().getColumn(8).setResizable(false);
            customerTable.getColumnModel().getColumn(9).setResizable(false);
        }

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Order Date", "Ship Name", "Ship Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(0).setResizable(false);
            orderTable.getColumnModel().getColumn(1).setResizable(false);
            orderTable.getColumnModel().getColumn(2).setResizable(false);
            orderTable.getColumnModel().getColumn(3).setResizable(false);
        }

        lblCustomerList.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblCustomerList.setText("Customer List");

        lblOrderList.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblOrderList.setText("Order List");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Search Customers :");

        tbxSearchCustomers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbxSearchCustomersKeyReleased(evt);
            }
        });

        lblSearchOrders.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSearchOrders.setText("Search Orders:");

        tbxSearchOrders.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbxSearchOrdersKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCustomerList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 567, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbxSearchCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblOrderList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSearchOrders)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbxSearchOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerList)
                    .addComponent(tbxSearchCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderList)
                    .addComponent(lblSearchOrders)
                    .addComponent(tbxSearchOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbxSearchCustomersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxSearchCustomersKeyReleased
        String search = tbxSearchCustomers.getText();
     
        SearchCustomer(search);
         
    }//GEN-LAST:event_tbxSearchCustomersKeyReleased

    private void tbxSearchOrdersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxSearchOrdersKeyReleased
        
        String search = tbxSearchOrders.getText();
     
        SearchOrder(search);
        
    }//GEN-LAST:event_tbxSearchOrdersKeyReleased


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCustomerList;
    private javax.swing.JLabel lblOrderList;
    private javax.swing.JLabel lblSearchOrders;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField tbxSearchCustomers;
    private javax.swing.JTextField tbxSearchOrders;
    // End of variables declaration//GEN-END:variables
}
