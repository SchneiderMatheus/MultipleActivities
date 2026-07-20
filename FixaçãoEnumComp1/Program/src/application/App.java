package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.OrderStatus;
import entities.Product;
import java.time.LocalDateTime;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String stringDate = sc.nextLine();
        Client c1 = new Client(name, email, stringDate);
        now = LocalDateTime.now();
        

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());
        Order pedido = new Order(now, orderStatus, c1);
        System.out.print("How many items to this order?");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1;i<=n;i++){
            System.out.println("Enter "+i+" item data: ");
            System.out.print("Product name:");
            String nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.println();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(nameProduct, price);
            OrdemItem ordemItem = new OrdemItem(quantity, product);
            pedido.addItem(ordemItem);
            
         }

        System.out.println(pedido);
        sc.close();

        // Product bolacha = new Product("bolacha", 9.9);
        // Product salgadinho = new Product("Salgadinho", 12.5);
        // LocalDateTime now = LocalDateTime.now();

        // Client bibi = new Client("Bibi", "bibi@bibi.com", "06/03/1997");
        // Order pedidoBibi = new Order();
        // pedidoBibi.setClient(bibi);
        // pedidoBibi.setStatus(OrderStatus.PROCESSING);
        // pedidoBibi.setMoment(now);
        // OrdemItem item1 = new OrdemItem(1, salgadinho);
        // OrdemItem item2 = new OrdemItem(2, bolacha);
        // item2.setPrice(9.0);

        // pedidoBibi.addItem(item1);
        // pedidoBibi.addItem(item2);

        // System.out.println(pedidoBibi);
        

    }
}
