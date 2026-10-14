package application;
import java.util.Scanner;
import entities.Conta;
import entities.DomainException;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder  = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            Conta acc = new Conta(number, holder, initialBalance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            double withdraw = sc.nextDouble();
            acc.withdraw(withdraw);
            System.out.print("New balance: ");
            acc.getBalance();
            
        } catch (DomainException e) {
            System.out.println("Error: "+e.getMessage());
        } 
        sc.close();
    }
}
