package services;

public interface PaymentService {
    double paymentTax(Double amount);
    double interest(double amount, int months);
}
