package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String stringDate = sc.nextLine();


        Client c1 = new Client(name, email, stringDate);

        System.out.print("How many items to this order?");
        int n = sc.nextInt();
        for(int i =0;i>n;i++){
            System.out.println("Enter "+i+" item data: ");
            System.out.print("Product name:");
            String nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.println();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(nameProduct, price);
            OrdemtItem orderItem = new OrderItem(quantity);
        }

        sc.close();
    }
}
