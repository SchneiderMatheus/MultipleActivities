package application;
import java.util.Scanner;
import entities.Employee;
import entities.OutsourcedEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] list1 = new Employee[n];

        for (int i = 0; i<list1.length;i++) {
            System.out.println("Employee #"+(i+1)+" data: ");
            System.out.print("Outsourced (y/n)? ");
            char escolha = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hour = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();
            if(escolha =='y'){
                System.out.print("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                list1[i] = new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge);
            } else

            list1[i] = new Employee(name, hour, valuePerHour);

        }

        for (Employee employee : list1) {
            System.out.println(employee);
        }
        
        sc.close();
    }
}
