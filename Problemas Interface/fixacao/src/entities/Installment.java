package entities;

import java.time.LocalDateTime;

public class Installment extends Contract {
    private LocalDateTime dueDate;
    private Double amount;

    public Installment(Integer number, LocalDateTime date, Double totalValue, LocalDateTime dueDate, Double amount) {
        super(number, date, totalValue);
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    
}
