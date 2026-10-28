package services;

public class PaypalPay implements PaymentService {

    @Override
    public double paymentTax(Double amount) {
        return amount *0.02;
    }

    @Override
    public double interest(double amount, int months) {
        return amount *0.01 * months;
    }
    
}
