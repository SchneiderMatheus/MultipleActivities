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
    
    do {
        System.out.println("Digite um número");
        tentativa = sc.nextInt();
        if (tentativa < random) {
            System.out.println("Mais alto");
        } else if (tentativa > random){
            System.out.println("passou do ponto");
        }
    } while (tentativa != random);

    if (tentativa == random) {
        System.out.println("Voce Acertou");
    }
        sc.close();
    }

    public static int gerarNumero(){
        Random rd = new Random();
        int numero = rd.nextInt(101);
        return numero;
    }

    public static int tentativa(){
        Scanner sc = new Scanner(System.in);
        int tentativa = sc.nextInt();
        sc.close();
        return tentativa;
    }

}
