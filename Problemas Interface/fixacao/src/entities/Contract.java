package entities;

import java.time.LocalDateTime;

import services.PaymentService;

public class Contract {
    private Integer number;
    private LocalDateTime date;
    private Double totalValue;
    private PaymentService payment;

    
    public Contract(Integer number, LocalDateTime date, PaymentService payment) {
        this.number = number;
        this.date = date;
        this.payment = payment;
    }
    
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public Double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue() {
        this.totalValue = payment.;
    }
    
    
}
