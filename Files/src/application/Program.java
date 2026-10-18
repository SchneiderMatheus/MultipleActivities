package application;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List <Product> products =  new ArrayList<>();

        System.out.println("Enter the file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        

        sc.close();
    }
}
