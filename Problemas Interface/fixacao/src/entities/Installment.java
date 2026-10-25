package entities;

import java.time.LocalDateTime;

public class Installment {
    private LocalDateTime dueDate;
    private Integer amount;

    public Installment(LocalDateTime dueDate, Integer amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    
}
