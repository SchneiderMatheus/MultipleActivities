package application;

import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Account acc1 = new Account(1001, "Alex", 1000.0); // nao deixa account ser instanciado
        Account acc2 = new SavingsAccount(1001, "Alex", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1001, "Alex", 1000.0,500.0);

        sc.close();
    }
}
