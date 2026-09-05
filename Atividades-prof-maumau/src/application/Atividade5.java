package application;

import java.util.Scanner;

import entities.ProdutoAtividade5;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoAtividade5[] produto = new ProdutoAtividade5[5];

        for (int i = 0; i < produto.length; i++) {
            System.out.println("Adicione o nome do produto "+(i+1));
            String nome = sc.nextLine();
            System.out.println("Adicione o codigo do produto: "+(i+1));
            Integer codigo = sc.nextInt();
            System.out.println("Adicione o preço do produto: "+(i+1));
            Double preco = sc.nextDouble();

            produto[i].setNome(nome);
            produto[i].setCodigo(codigo);
            produto[i].setPreco(preco);
        }
    }
}
