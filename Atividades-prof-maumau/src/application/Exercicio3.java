package application;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        

        System.out.println("MENU");
        exibirMenu();
        lerOpcao();

    }

    public static void exibirMenu(){
        System.out.println("1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir");
    }

    public static char lerOpcao(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha uma opção:");
        char escolha = sc.next().charAt(0);
        sc.close();
        return escolha;
    }
}
