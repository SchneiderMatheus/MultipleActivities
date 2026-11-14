import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import services.CalculationService;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List <Product> list = new ArrayList<>();
        System.out.print("Number of numbers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product: ");
            String product = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();

            list.add(new Product(product, price));
        }
        System.out.println("Max: ");
        System.out.println(CalculationService.max(list));

        sc.close();
    }
}
