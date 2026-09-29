package application;
import java.util.Scanner;
import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de funcionarios que voce deseja armazenar: ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] list1 = new Employee[n];

        for (int i = 0; i<list1.length;i++) {
            System.out.print("Digite o nome do funcionario: ");
            String name = sc.nextLine();
            System.out.print("Digite as horas trabalhadas: ");
            int hour = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite a valor da hora tbralahada do funcionario: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();

            list1[i] = new Employee(name, hour, valuePerHour);

        }

        for (Employee employee : list1) {
            System.out.println(employee);
        }
        
        sc.close();
    }
}
