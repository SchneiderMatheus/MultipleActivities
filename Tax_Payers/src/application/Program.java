package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Tax payer %d data:\n",i);
            System.out.print("Individual or company (i/c)?");
            char choice = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            System.out.print("Health expenditures: ");
            double healthExpenditures = sc.nextDouble();

        }

        sc.close();
    }
}
