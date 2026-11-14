import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import services.CalculationService;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List <Integer> list = new ArrayList<>();
        System.out.print("Number of numbers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Max: ");
        System.out.println(CalculationService.max(list));

        sc.close();
    }
}
