package application;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        int[] lista = new int[n];

        for(int i =0; i<lista.length; i++){
            System.out.println("Digite o valor "+(i+1));
            lista[i] = sc.nextInt();
        }
        System.out.println("Números negativos: ");
        for(int i =0; i<lista.length; i++){
            if (lista[i]<0) {
                System.out.println(lista[i]);
                
            }
        }


        sc.close();
    }
}
