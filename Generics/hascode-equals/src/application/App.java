package application;

import entities.Client;

public class App {
    public static void main(String[] args) throws Exception {
        Client c1 =  new Client("Matheus", "schneider@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");
        Client c3 = new Client("Malu", "malu@gmail.com");
        Client c4 = new Client("Malu", "marialuiza@gmail.com");
        Client c5 = new Client("Malu", "malu@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println("___________________________________________________________");
        System.out.println(c1.equals(c2));
        System.out.println(c3.equals(c4));
        System.out.println("___________________________________________________________");
        System.out.println("Comparando Malu com Malu, mas emails diferentes: ");
        System.out.println(c3.equals(c4));
        System.out.println("___________________________________________________________");
        System.out.println("Comparando agora para ver se são iguais com email iguais: ");
        System.out.println(c3.equals(c5));
        System.out.println("___________________________________________________________");
        System.out.println("Testando == com informaçoes iguais mas guardadas em objetos diferentes:");
        System.out.println(c3 == c5);

    }
}
