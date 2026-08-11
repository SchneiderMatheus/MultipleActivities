package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the dollar price?");
        double price = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double quantity =sc.nextDouble();

        System.out.println("Amount to be paid = "+Calculator.toPay(price,quantity));

        sc.close();
    }
}
