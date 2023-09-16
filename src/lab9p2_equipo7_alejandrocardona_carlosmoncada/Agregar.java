package lab9p2_equipo7_alejandrocardona_carlosmoncada;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Agregar {

    private String orderID, orderDate, shipDate, shipMode, customerID, customerName,
            segment, country, city, state, postalCode, region, productID, category,
            sub_Category, productName, Sales, quantity, discount, profit;

    public Agregar(String orderID, String orderDate, String shipDate, String shipMode, String customerID, String customerName, String segment, String country, String city, String state, String postalCode, String region, String productID, String category, String sub_Category, String productName, String Sales, String quantity, String discount, String profit) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.shipDate = shipDate;
        this.shipMode = shipMode;
        this.customerID = customerID;
        this.customerName = customerName;
        this.segment = segment;
        this.country = country;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.region = region;
        this.productID = productID;
        this.category = category;
        this.sub_Category = sub_Category;
        this.productName = productName;
        this.Sales = Sales;
        this.quantity = quantity;
        this.discount = discount;
        this.profit = profit;
        add();
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public String getShipMode() {
        return shipMode;
    }

    public void setShipMode(String shipMode) {
        this.shipMode = shipMode;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSub_Category() {
        return sub_Category;
    }

    public void setSub_Category(String sub_Category) {
        this.sub_Category = sub_Category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSales() {
        return Sales;
    }

    public void setSales(String Sales) {
        this.Sales = Sales;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    private void add() {
        Dba db = new Dba("./Nilaccdb.accdb");
        db.conectar();
        try {
            db.query.execute("INSERT INTO TenRecord"
                    + " ([Order ID], [Order Date], [Ship Date], [Ship Mode], [Customer ID], [Customer Name], [Segment], [Country], [City], [State], [Postal Code], [Region], [Product ID], [Category], [Sub-Category], [Product Name], [Sales], [Quantity], [Discount], [Profit])"
                    + " VALUES ('" + orderID + "', '" + orderDate + "', '" + shipDate + "', '" + shipMode + "', '" + customerID + "', '" + customerName + "', '" + segment + "', '" + country + "', '" + city + "', '" + state + "', '" + postalCode + "', '" + region + "', '" + productID + "', '" + category + "', '" + sub_Category + "', '" + productName + "', '" + Sales + "', '" + quantity + "', '" + discount + "', '" + profit + "');");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
}