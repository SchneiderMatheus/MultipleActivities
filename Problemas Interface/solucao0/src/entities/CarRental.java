package entities;

import java.time.Duration;
import java.time.LocalDateTime;

public class CarRental {
    private String model;
    private Double price;
    private LocalDateTime start;
    private LocalDateTime finish;

    public CarRental(String model, LocalDateTime start, LocalDateTime finish) {
        this.model = model;
        this.start = start;
        this.finish = finish;
        price = totalPrice();
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

    public Double totalPrice(){
        double minutes = Duration.between(getStart(), getFinish()).toMinutes();
        double hours = minutes /60;
        double price = 0;
        if (hours <= 12) {
            price = 10 * Math.ceil(hours);
            if (price > 100) {
                return price * 0.15;
            } else 
                return price * 0.2;

        }
        else {
            price = 130 * Math.ceil(hours/24);
            if (price > 100) {
                return price * 0.15;
            } else 
                return price * 0.2;
        }
    }

    @Override
    public String toString() {
        return "CarRental [model=" + model + ", price=" + price + "]";
    }
    
    
}
