package application;

import entities.Client;

public class App {
    public static void main(String[] args) throws Exception {
        Client c1 =  new Client("Matheus", "schneider@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
