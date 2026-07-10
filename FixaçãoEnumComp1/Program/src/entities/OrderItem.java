package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private List<Product> product = new ArrayList<>();
    
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public Double subTotal(){
        return quantity*price;
    }
    /*public void addProduct(Product product){
        product.setName(product);
    }

    public void removeProduct(Product product){
       product.remove(product);
    } */
}
