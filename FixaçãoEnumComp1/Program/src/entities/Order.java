package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private List<OrdemItem> orderItem = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();

    
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
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
    public void addClient(Client client){
        clients.add(client);
    }

    public void removeClient(Client client){
        clients.remove(client);
    }
    public void addBirth(Date dateBirth){
        clients.remove(dateBirth);
    }
    public Double total(){
        double total =0;
         for(OrdemItem c :orderItem){
            total += c.getPrice()*c.getQuantity();
        }
        return total;
    }


}
