package applications;

import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the contract data: ");
        System.out.print("Number: ");
        int numero = sc.nextInt();
        System.err.println("Data (dd/MMM/yyy): ");
        LocalDateTime data = sc.nextLine();

        sc.close();
    }
}
