package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contacts;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Contacts> listaContatos = new ArrayList<>();
        int opcao;
        do {
            System.out.println("1 - Adicionar novo contato.");
            System.out.println("2 - Visualizar contatos.");
            System.out.println("3 - Atualizar o telefone e e-mail de um contato existente.");
            System.out.println("4 - Remover um contato da lista.");
            System.out.println("5 - Sair do programa.");
            System.out.println("Selecione a opção desejada (1 até 5)");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite as informações do novo contato: ");
                    System.out.print("Nome: ");
                    String name = sc.nextLine();
                    System.out.print("telefone: ");
                    String phone = sc.nextLine();
                    System.out.print("E-mail: ");
                    String email = sc.nextLine();
                    Contacts contato = new Contacts(name, phone, email);
                    listaContatos.add(contato);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\nLista de Contatos: ");
                    for (Contacts contacts : listaContatos) {
                        System.out.println(contacts);
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Informe o contato que você gostaria de mudar as informações");
                    String nameVerificar = sc.nextLine();
                    for (Contacts contatos : listaContatos) {
                        if (nameVerificar.equalsIgnoreCase(contatos.getName())) {
                            System.out.println("Digite o novo telefone: ");
                            String phoneNovo = sc.nextLine();
                            contatos.setPhone(phoneNovo);
                            System.out.println("Digite o novo e-mail: ");
                            String emailNovo = sc.nextLine();
                            contatos.setEmail(emailNovo);
                        } else
                            System.out.println("Contato não encontrado!");
                    }

                    break;
                case 4:
                    System.out.println("Informe o contato a ser removido: ");
                    String nameRemove = sc.nextLine();
                    for (Contacts contatos : listaContatos) {
                        if (nameRemove.equalsIgnoreCase(contatos.getName())) {
                            listaContatos.remove(contatos);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Finalizando o Programa...!");
                    opcao = 5;
                    break;
                default:

                    break;
            }
        } while (opcao != 5);
        sc.close();
        return;
    }
}
