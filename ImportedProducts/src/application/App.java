package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < products.length; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.println("Common, used or imported (c/u/i)?");
            char escolha = sc.next().charAt(0);
            sc.nextLine();

            if (escolha == 'c') {
                System.out.print("Name:");
                String name = sc.nextLine();
                System.out.print("Price:");
                double price = sc.nextDouble();
                sc.nextLine();

                products[i] = new Product(name, price);
            } else if (escolha == 'u') {
                System.out.print("Name:");
                String name = sc.nextLine();
                System.out.print("Price:");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY):");
                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String entrada = sc.nextLine();
                LocalDate date = LocalDate.parse(entrada,fmt);

                products[i] = new UsedProduct(name, price, date);
            } else {
                System.out.print("Name:");
                String name = sc.nextLine();
                System.out.print("Price:");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.print("Custom Fee:");
                double customsFee = sc.nextDouble();
                sc.nextLine();

                products[i] = new ImportedProduct(name, price, customsFee);
            }


        }
        System.out.println("\nPRICE TAGS: "); 

        for (Product product : products) {
            System.out.println(product.priceTag()); // TIRAR DUVIDA COM O BIBI, DOS PRODUTOS PRINTING
        }

        sc.close();
    }
}
