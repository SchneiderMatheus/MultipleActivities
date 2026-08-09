package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Room[] quartos = new Room[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<n; i++){
            System.out.println("Rent #"+(i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room you want: ");
            int numeroQuarto = sc.nextInt();
            sc.nextLine();

            quartos[numeroQuarto] = new Room(name, email);
            
        }
        System.out.println("Busy Rooms: ");
        for(int i=0; i<quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i+": "+quartos[i]);
            }
            
        }
        
        sc.close();
    }
}
