package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbe rof Shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= args.length; i++) {
            System.out.println("Shape #"+i+" data: ");
            System.out.print("Rectangle or Circle (r/c)?");
            char whichShape = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.nextLine();
            if (whichShape =='r') {
                System.out.print("width: ");
                double width = sc.nextDouble();
                System.out.print("height: ");
                double height = sc.nextDouble();
                
            }
        }

        sc.close();
    }
}
