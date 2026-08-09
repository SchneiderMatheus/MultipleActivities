package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Aprovados {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("quantos alunos serão digitados?");
        int n = sc.nextInt();
        sc.nextLine();

        Alunos [] lista = new Alunos[n];

        for(int i=0; i<lista.length;i++){
            System.out.println("Digite nome, primeira e segunda nota do aluno número: "+(i+1));
            String name = sc.nextLine();
            System.out.println("Nota 1: ");
            double m1 = sc.nextDouble();
            System.out.println("Nota 2: ");
            double m2 = sc.nextDouble();
            sc.nextLine();

            lista[i] = new Alunos(name, m1,m2);
        }
        System.out.println("Alunos Aprovados: ");
        for(int i=0; i<lista.length;i++){
            if ((lista[i].getM1() + lista[i].getM2())/2 >= 6){
                System.out.println(lista[i].getName());
            }
        }
        sc.close();
    }

}
