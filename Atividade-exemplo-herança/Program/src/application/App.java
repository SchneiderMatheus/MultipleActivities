package application;

import java.util.Scanner;

import entities.BusinessAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BusinessAccount contaEmpresa = new BusinessAccount(1,"Matheus",9.5,1000.50);

        System.out.println("Valor do emprestimo:");
        contaEmpresa.loan(sc.nextDouble());

        System.err.println(contaEmpresa.getBalance());
        sc.close();
    }
}
