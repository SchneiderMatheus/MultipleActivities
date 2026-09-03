package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Produto produto = new Produto(98777, "Celular Iphone", 7000.9, 3);
        System.out.println(produto);
        sc.close();
    }

}
