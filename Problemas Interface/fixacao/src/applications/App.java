package applications;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter the contract data: ");
        System.out.print("Number: ");
        int numero = sc.nextInt();
        System.err.print("Data (dd/MMM/yyy): ");
        LocalDateTime data = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Contract value: ");
        double value = sc.nextDouble();

        sc.close();
    }
}
