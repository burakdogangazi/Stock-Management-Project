
import Entities.Customer;
import Entities.Order;
import Entities.Product;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.sql.DATE;


public class ConnectionClass {
    
    private Connection connection = null;
    
    private Statement statement = null;
    
    private PreparedStatement preparedStatement = null;
    
    
    public ArrayList<Product> getAllProducts(){
        
       ArrayList<Product> productOutputs = new ArrayList<Product>();
        
        try {
            statement =connection.createStatement();
            String query = "SELECT PRODUCTID,PRODUCTNAME,CATEGORYID,QUANTITYPERUNIT,UNITPRICE,UNITSINSTOCK,UNITSONORDER FROM PRODUCTS";
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                
                int ProductID = rs.getInt("PRODUCTID");
                
                String ProductName = rs.getString("PRODUCTNAME");
                
                int CategoryID = rs.getInt("CATEGORYID");
                
                String QuantityPerUnit = rs.getString("QUANTITYPERUNIT");
                
                int UnitPrice = rs.getInt("UNITPRICE");
                
                int UnitsInStock = rs.getInt("UNITSINSTOCK");
                
                int UnitsOnOrder = rs.getInt("UNITSONORDER");
                
                productOutputs.add(new Product(ProductID, ProductName, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder));

                
            }
            return productOutputs;
            
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
 
    }
    
    public ArrayList<Customer> getAllCustomers(){
        
       ArrayList<Customer> customerOutputs = new ArrayList<Customer>();
        
        try {
            statement =connection.createStatement();
            String query = "SELECT CUSTOMERID,COMPANYNAME,CONTACTNAME,CONTACTTITLE,ADDRESS,CITY,COUNTRY,POSTALCODE,PHONE,FAX FROM CUSTOMERS";
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                
                String CustomerID = rs.getString("CUSTOMERID");
                
                String CompanyName = rs.getString("COMPANYNAME");
                
                String ContactName = rs.getString("CONTACTNAME");
                
                String ContactTitle = rs.getString("CONTACTTITLE");
                
                String Address = rs.getString("ADDRESS");
                
                String City = rs.getString("CITY");
                
                String Country = rs.getString("COUNTRY");
                
                String PostalCode = rs.getString("POSTALCODE");
                
                String Phone = rs.getString("PHONE");
                
                String Fax = rs.getString("FAX");
                          
                customerOutputs.add(new Customer(CustomerID,CompanyName,ContactName,ContactTitle,Address,City,Country,PostalCode,Phone,Fax));             
            }
            return customerOutputs;
            
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
 
    }
    
    public ArrayList<Order> getAllOrders(){
        
       ArrayList<Order> orderOutputs = new ArrayList<Order>();
        
        try {
            statement =connection.createStatement();
            String query = "SELECT ORDERID,ORDERDATE,SHIPNAME,SHIPADDRESS FROM ORDERS";
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                
                int OrderID = rs.getInt("ORDERID");
                
                Date OrderDate = rs.getDate("ORDERDATE");
                
                String ShipName =rs.getString("SHIPNAME");
                
                String ShipAddress = rs.getString("SHIPADDRESS");

                orderOutputs.add(new Order(OrderID,OrderDate,ShipName,ShipAddress));
            }
            return orderOutputs;
            
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
 
    }


    public void AddProduct(String productName,String categoryID,String quantityPerUnit,String unitPrice,String unitsInStock,String unitsOnOrder){
        
        
        String query = "Insert Into Products(PRODUCTNAME,CATEGORYID,QUANTITYPERUNIT,UNITPRICE,UNITSINSTOCK,UNITSONORDER) VALUES (?,?,?,?,?,?)";
        
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, productName);
            preparedStatement.setString(2, categoryID);
            preparedStatement.setString(3, quantityPerUnit);
            preparedStatement.setString(4, unitPrice);
            preparedStatement.setString(5, unitsInStock);
            preparedStatement.setString(6, unitsOnOrder);
            
            preparedStatement.executeUpdate();
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    
    
    public void UpdateProduct(int productID,String productName,String categoryID,String quantityPerUnit,String unitPrice,String unitsInStock,String unitsOnOrder){
        
        String query ="UPDATE PRODUCTS SET PRODUCTNAME=?,CATEGORYID=?,QUANTITYPERUNIT=?,UNITPRICE=?,UNITSINSTOCK=?,UNITSONORDER=? WHERE PRODUCTID = ?";
        
        
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, productName);
            preparedStatement.setString(2, categoryID);
            preparedStatement.setString(3, quantityPerUnit);
            preparedStatement.setString(4, unitPrice);
            preparedStatement.setString(5, unitsInStock);
            preparedStatement.setString(6, unitsOnOrder);
            preparedStatement.setInt(7, productID);
            preparedStatement.executeUpdate();
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    
    public void DeleteProduct(int productID){  
        try {
            CallableStatement deleteCall = connection.prepareCall("{call DELETEPRODUCTVIAJAVA(?)}");
            deleteCall.setInt(1, productID);
            deleteCall.execute();
        } 
        catch (SQLException ex) {
            Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
         
        }   
    }
    
    public boolean Login(String username, String password,String Query) throws SQLException{
        
        preparedStatement = connection.prepareStatement(Query);  
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        
        ResultSet rs = preparedStatement.executeQuery();
        
        return rs.next();
        
        
    }
    
    public ConnectionClass(){
        
        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
        try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
        } 
        
        catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı..");
        }
        
        try {
            connection = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı..");
        } 
        
        catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız..");
        }    
        
    }

    
}
