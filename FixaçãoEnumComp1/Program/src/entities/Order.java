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
        StringBuilder sb = new StringBuilder();
        
        sb.append("Order Summary: \n");
        sb.append("Order Moment: " +moment + "\n" );
        sb.append("Order Status: "+ status);
        sb.append("\nClient: " + client.getName() + " " + client.getBirthDate() + " - " + client.getEmail());
        sb.append("\nOrder Items: \n");
        for (OrdemItem i: orderItem){
            sb.append(i.toString() +"\n");
        }
        sb.append("\nTotal price: R$"+total());
        return sb.toString();
    }


}
