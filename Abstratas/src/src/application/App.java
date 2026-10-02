package application;

import java.util.Scanner;

import entities.Account;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
        x.withdraw(50.0);
        y.withdraw(50.0);
        System.out.println(x);
        System.out.println(y);

        sc.close();
    }
}
