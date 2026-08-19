package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual teu peso?");
        double peso = sc.nextDouble();
        System.out.println("Quão alto é voce?");
        double altura =sc.nextDouble();
        
        Pessoas pessoa = new Pessoas(altura,peso);

        System.out.println(pessoa);
        

    
        sc.close();
    }

}
