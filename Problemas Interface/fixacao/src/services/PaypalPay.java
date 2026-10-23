package services;

public class PaypalPay {
    public double paypalTax(Double valor, Integer parcelas){
        double valorCacular = (valor + (valor*0.01)) * parcelas; 
        return valorCacular += valorCacular*0.02;
    }
}
