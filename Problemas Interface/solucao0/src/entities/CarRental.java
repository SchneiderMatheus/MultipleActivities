package entities;

import java.time.Duration;
import java.time.LocalDateTime;

public class CarRental {
    private String model;
    private Double price;
    private LocalDateTime start;
    private LocalDateTime finish;
    private Double tax;

    public CarRental(String model, LocalDateTime start, LocalDateTime finish) {
        this.model = model;
        this.start = start;
        this.finish = finish;
        price = totalPrice();
        tax = tax(price)*100;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }


    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }
    

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }
    public Double tax(Double price){
        if (price > 100) {
            return 0.15;
        } else
            return 0.2;
    }

    public Double totalPrice(){
        double minutes = Duration.between(getStart(), getFinish()).toMinutes();
        double hours = minutes /60;
        double price = 0;
        if (hours <= 12) {
           price = 10 * Math.ceil(hours);
           return price += tax(price)*price;
    
        }
        else {
            price = 130 * Math.ceil(hours/24);
            return price += tax(price)*price;
        }
    }

    @Override
    public String toString() {
        return "CarRental [model=" + model + ", price=" + price + ", tax=" + tax + "]";
    }

}
