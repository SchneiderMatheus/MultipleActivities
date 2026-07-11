package entities;


public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;
    
    
    public OrderItem(Product product) {
        this.product = product;
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
    /*public void addProduct(Product product){
        product.setName(product);
    }

    public void removeProduct(Product product){
       product.remove(product);
    } */
}
