package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Employee> list = new ArrayList<>();
        
        System.out.println("Enter the number of emplyees: ");
        int n = sc.nextInt();
        
        sc.close();
    }
}
