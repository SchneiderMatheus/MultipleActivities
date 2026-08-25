package application;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        

        System.out.println("MENU");
        exibirMenu();
        char escolha = lerOpcao();
        double a = lerNumero1();
        double b = lerNumero2();

        if (escolha == 1) {
            System.out.print("Soma é igual: ");
            somar(a, b);
        } else if (escolha == 2) {
            System.out.print("Substração é igual: ");
            subtrair(a, b);
        } else if (escolha == 3) {
            System.out.print("Multiplicação é igual: ");
            multiplicar(a, b);
        } else if (escolha == 4) {
            System.out.print("Divisão é igual: ");
            dividir(a, b);
        }

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

    public static double somar(double a, double b){
        return a+b;
    }

    public static double subtrair(double a, double b){
        return a-b;
    }

    public static double multiplicar(double a, double b){
        return a*b;
    }

    public static double dividir(double a, double b){
        return a/b;
    }
}
