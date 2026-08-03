package application;

import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account(2, "Alex", 1000.0);
        BusinessAccount contaEmpresa = new BusinessAccount(1,"Matheus",9.5,1000.50);

        System.out.println("Valor do emprestimo:");
        contaEmpresa.loan(sc.nextDouble());

        System.err.println(contaEmpresa.getBalance());

        // upcasting

        Account acc1 = contaEmpresa;
        Account acc2 = new BusinessAccount(3, "Anna", 0.0, 1000.0);
        Account acc3 = new SavingsAccount(3, "Alex", 1000.0, 0.01);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);


        // downcasting

        BusinessAccount acc4 = (BusinessAccount)acc2; 
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200);
            System.out.println("loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance(1.0);
            System.out.println("Balance of "+ acc5.getHolder()+" : "+acc5.getBalance());
            System.out.println(acc5);
        }
        acc.wihtdraw(200.0);
        System.out.println("ACC sem override: ");
        System.out.println(acc);

        Account acc7 = new SavingsAccount(7,"Alex2",1000.0,0.01);
        acc7.wihtdraw(200.0);
        System.out.println("ACC Override funcionando");

        System.out.println(acc7);
        sc.close();
    }
}
