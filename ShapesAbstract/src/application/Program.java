package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Color;
import entities.Shape;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List <Shape> list = new ArrayList<>();

        System.out.print("Enter the numbe rof Shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= args.length; i++) {
            System.out.println("Shape #"+i+" data: ");
            System.out.print("Rectangle or Circle (r/c)?");
            char whichShape = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (whichShape =='r') {
                System.out.print("width: ");
                double width = sc.nextDouble();
                System.out.print("height: ");
                double height = sc.nextDouble();


            } else {

            }
        }

        sc.close();
    }
}
