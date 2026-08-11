package util;

public class Calculator {
    public static final double IOF = 0.06;

    public static double toPay(double price, double quantity){
        double totalInReais = price*quantity;
        double iofValue = totalInReais*IOF;
        return totalInReais + iofValue;
    }
}
