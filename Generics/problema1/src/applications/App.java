package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        System.out.print("How many values?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            lista.add(sc.nextInt());
        }
        System.out.println(lista);
        System.out.println("Frist: "+lista.getFirst());
        sc.close();
    }
}
