package applications;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the contract data: ");
        System.out.print("Number: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MMM/yyy): ");
        LocalDateTime data = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Contract value: ");
        double value = sc.nextDouble();
        Contract contract = new Contract(numero, data, value);

        System.out.print("Installments: ");
        int parcelas = sc.nextInt();
        Installment installment = new Installment(data, parcelas);
    

        sc.close();
    }
}
