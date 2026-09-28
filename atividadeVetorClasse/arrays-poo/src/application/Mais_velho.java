package application;

import java.util.Scanner;
import entities.Mais_Velho;

public class Mais_velho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar?");
        int n = sc.nextInt();
        sc.nextLine();

        Mais_Velho [] vect = new Mais_Velho[n];
        for (int i = 0;i<vect.length; i++) {
            System.out.print("Nome:");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            vect[i] = new Mais_Velho(nome, idade);
        }

        sc.close();
    }
}
