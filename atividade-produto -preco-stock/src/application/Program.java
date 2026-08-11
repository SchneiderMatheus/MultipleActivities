package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();


        System.out.println("Product data: " + product.name + ", $ " + product.price + ", " + product.quantity
                + " units, Total: $ " + product.totalValueInStock()); // minha versão
        
        System.out.print("\nProduct data: "); // versão do professor usando metodos
        System.out.println(product);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity =sc.nextInt(); // versão que o prof fez.
        product.addProducts(quantity);

        System.out.println("Product data: " + product.name + ", $ " + product.price + ", " + product.quantity
                + " units, Total: $ " + product.totalValueInStock());

        System.out.println("Enter the number of products to be taken out of stock: ");
        product.removeProducts(sc.nextInt());

        System.out.println("Product data: " + product.name + ", $ " + product.price + ", " + product.quantity
                + " units, Total: $ " + product.totalValueInStock());
        

        sc.close();
    }
}
