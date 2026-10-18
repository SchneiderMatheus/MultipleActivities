package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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

        File sourcePath = new File(strPath);
        String sourceFolder = sourcePath.getParent();

        boolean success = new File(sourceFolder + "\\out").mkdir();
        System.out.println("Directory created successfully: "+success);

        String targetFile = sourceFolder + "out/summary.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))){
            
        } catch (Exception e) {
            // TODO: handle exception
        }

        sc.close();
    }
}
