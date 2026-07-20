package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    private List<OrdemItem> orderItem = new ArrayList<>();
    
    public void setClient(Client client){
        this.client= client;
    }
    
    public Client getClient() {
        return client;
    }
    public LocalDateTime getMoment() {
        return moment;
    }
    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrdemItem item){
        orderItem.add(item);
    }

    public void removeItem(OrdemItem item){
        orderItem.remove(item);
    }
    
    
    public Double total(){
        double total =0;
         for(OrdemItem c :orderItem){
            total += c.getPrice()*c.getQuantity();
        }
        return total;
    }

    public String toString(){
        return "Order Summary: \n"
        + "Order Moment: " + getMoment() + "\n" 
        + "Client: " + client.getName() + " " + client.getBirthDate() + " - " + client.getEmail()
        + "Order items: \n" 
        +  for (OrdemItem i: orderItem ){
            System.out.print(i.getProduct().getName()+", Quantity: "+ i.getQuantity() + ", Subtotal: "+ i.subTotal());
        }
        + 
    }


}
