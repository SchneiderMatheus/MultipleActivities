package entities;


public class OrdemItem {
    private Integer quantity;
    private Double price;

    private Product product;
    
    public OrdemItem(Integer quantity,  Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = product.getPrice();
    }
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

    public String toString(){
        return quantity + ", " + price + "," + product;
    }
}
