package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        /*  Account acc1 = new Account(1001, "Alex", 1000.0); // nao deixa account ser instanciado
        Account acc2 = new SavingsAccount(1001, "Alex", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1001, "Alex", 1000.0,500.0);*/
        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001,"Matheus",1000.0,0.01));
        list.add(new BusinessAccount(1002, "Malu", 1000.0, 300.0));

        double sum = 0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total Balance: %.2f%n",sum);

        for (Account account : list) {
            account.deposit(10.0);
        }

        for (Account account : list) {
            System.out.println(account.getBalance());
        }
        sc.close();
    }
}
