package applications;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalPay;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the contract data: ");
        System.out.print("Number: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MMM/yyy): ");
        LocalDate data = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Contract value: ");
        double value = sc.nextDouble();
        Contract contract = new Contract(numero, data, value);

        System.out.print("Installments: ");
        int parcelas = sc.nextInt();

    
        ContractService contractService = new ContractService(new PaypalPay());
        contractService.processContract(contract, parcelas);

        System.out.println("Installments: ");
        for (Installment n : contract.getInstallments()) {
            System.out.println(n);
        }

        sc.close();
    }
}
