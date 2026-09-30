package entities;

import java.util.Date;

public class UsedProduct extends Product {
    private Date manufacturedDate;

    public UsedProduct(String name, Double price, Date manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }
    @Override 
    public String priceTag() {
        return "Product [name=" + getName() 
        + "(used), price=" + getPrice() 
        + " (Manufacture date: " + manufacturedDate
        + ")]";
    }
}
