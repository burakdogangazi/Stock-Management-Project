
package Entities;

import java.sql.Date;


public class Order implements IEntity{
    
    private int OrderID;
    
    
    private Date OrderDate;
    
    private String ShipName;
    
    private String ShipAddress;

    public Order(int OrderID,Date OrderDate, String ShipName, String ShipAddress) {
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
        this.ShipName = ShipName;
        this.ShipAddress = ShipAddress;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getShipName() {
        return ShipName;
    }

    public void setShipName(String ShipName) {
        this.ShipName = ShipName;
    }

    public String getShipAddress() {
        return ShipAddress;
    }

    public void setShipAddress(String ShipAddress) {
        this.ShipAddress = ShipAddress;
    }

    
    
}
