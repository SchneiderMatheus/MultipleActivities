package applications;

import java.util.Locale;
import java.util.Scanner;
import services.InterestService;
import services.UsaInterestService;
import services.BrazilInterestService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double payment = 0;
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
        sc.nextLine();
        System.out.println("Which country do you which to calculate? (USA or BR)");
        String n = sc.nextLine();

        if (n.equalsIgnoreCase("USA")) {
            InterestService is = new UsaInterestService(1.0);
		    payment = is.payment(amount, months);

        } else {
            InterestService is = new BrazilInterestService(2.0);
		    payment = is.payment(amount, months);
        
        }
		
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
    }
}
