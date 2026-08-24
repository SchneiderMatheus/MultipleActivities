package application;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
    System.out.println("Bem vindo ao jogo da adivinhação!");
    int random = gerarNumero();
    int tentativa;
    Scanner sc = new Scanner(System.in);
    System.out.println("De sua primeira tentativa: ");
    tentativa = sc.nextInt();
    tentativaValida(tentativa);
    
    do {
        System.out.println("Digite um número");
        tentativa = sc.nextInt();
        if (tentativa < random) {
            System.out.println("---Mais alto---");
        } else if (tentativa > random){
            System.out.println("---Passou do ponto---");
        }
    } while (tentativa != random);

    acertou(tentativa, random);
    sc.close();
    }

    public static int gerarNumero(){
        Random rd = new Random();
        int numero = rd.nextInt(101);
        return numero;
    }

    public static boolean tentativaValida(int tentativa){
        if (tentativa < 101 && tentativa>=0) {
            return true;
        } else 
            System.out.println("Tenatativa invalida!");
            return false;
    }

    public static boolean acertou(int tentativa, int random){
        if (tentativa == random) {
            System.out.println("Voce Acertou");
            return true;
        } else
            return false;
    }

}
