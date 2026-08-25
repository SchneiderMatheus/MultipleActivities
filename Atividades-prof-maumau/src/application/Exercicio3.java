package application;

import java.util.Scanner;

public class Exercicio3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("MENU");
        exibirMenu();
        char escolha = lerOpcao();
        double a = lerNumero1();
        double b = lerNumero2();

        if (escolha == '1') {
            System.out.print("Soma é igual: "+somar(a, b));
        } else if (escolha == '2') {
            System.out.print("Substração é igual: "+subtrair(a, b));
        } else if (escolha == '3') {
            System.out.println("Multiplicação é igual a: "+multiplicar(a, b));
        } else if (escolha == '4') {
            if (divisaoValida(b)) {
                System.out.println("A divisão é igual a: "+dividir(a, b));
            } else
                System.out.println("Divisor inválido");
        }

    }

    public static void exibirMenu(){
        System.out.println("1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir");
    }

    public static char lerOpcao(){
        
        System.out.print("Escolha uma opção:");
        char escolha = sc.next().charAt(0);
        return escolha;
    }

    public static double lerNumero1(){
        
        System.out.print("Primeiro número: ");
        double firstDouble = sc.nextDouble();
        return firstDouble;
        
    }

    public static double lerNumero2(){
       
        System.out.print("Segundo número: ");
        double secondDouble = sc.nextDouble();
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

    public static boolean divisaoValida(double b){
        if (b >0) {
            return true;
        } else
            return false;
    }
}
