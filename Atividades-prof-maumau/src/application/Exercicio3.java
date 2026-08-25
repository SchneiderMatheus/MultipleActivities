package application;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        

        System.out.println("MENU");
        exibirMenu();
        char escolha = lerOpcao();
        lerNumero1();
        lerNumero2();

        

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

    public static double lerNumero1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        double firstDouble = sc.nextDouble();
        sc.close();
        return firstDouble;
        
    }

    public static double lerNumero2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Segundo número: ");
        double secondDouble = sc.nextDouble();
        sc.close();
        return secondDouble;
        
    }
}
