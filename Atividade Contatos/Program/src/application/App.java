package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contacts;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Contacts> listaContatos = new ArrayList<>();
        System.out.println("1 - Adiconar novo contato.");
        System.out.println("2 - Visualizar contatos.");
        System.out.println("3 - Atualizar o telefone e e-mail de um contato existente.");
        System.out.println("4 - Remover um contato da lista.");
        System.out.println("5 - Sair do programa.");
        System.out.println("Selecione a opção desejada (1 até 5)");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Digite as informações do novo contato: ");
                System.out.print("Nome: ");
                String name = sc.nextLine();
                System.out.print("telefone: ");
                String phone = sc.nextLine();
                System.out.print("E-mail: ");
                String email = sc.nextLine();
                Contacts contato = new Contacts(name,phone,email);
                listaContatos.add(contato);
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            default:

                break;
        }
        for (Contacts contacts : listaContatos) {
            System.out.println(contacts);
        }
        sc.close();
    }
}
