
import java.util.Scanner;

import model.entities.Conta;

public class App {
    public static void main(String[] args) throws Exception {
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
            System.out.print("New balance: ");
            acc.getBalance();
            
        } catch (Exception e) {
            
        }
        sc.close();
    }
}
