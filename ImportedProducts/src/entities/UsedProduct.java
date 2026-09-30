package entities;

import java.time.LocalDate;

public class UsedProduct extends Product {
    private LocalDate manufacturedDate;

    public UsedProduct(String name, Double price, LocalDate manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
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
