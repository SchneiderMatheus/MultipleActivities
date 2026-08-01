package application;

import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account(2, "Alex", 0.0);
        BusinessAccount contaEmpresa = new BusinessAccount(1,"Matheus",9.5,1000.50);

        System.out.println("Valor do emprestimo:");
        contaEmpresa.loan(sc.nextDouble());

        System.err.println(contaEmpresa.getBalance());

        // upcasting

        Account acc1 = contaEmpresa;
        Account acc2 = new BusinessAccount(3, "Anna", 0.0, 1000.0);
        sc.close();
    }
}
