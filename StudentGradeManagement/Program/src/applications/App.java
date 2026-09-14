package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.Student;
import entities.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Teacher teacher = new Teacher("Matheus", 29, "123456", "History", 4590.5);
        System.out.println(teacher);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Quanto de aumento o professor deve receber?");
        double n = sc.nextDouble();
        teacher.giveRaise(n);
        sc.nextLine();
        System.out.println(teacher);
        System.out.println("-----------------------------------------------------------------------");
        
        double[] numeros = {9.0,7.5,8,7.5,3};
        Student estudante1 = new Student("Matheus", 29, "123456", numeros);
        System.out.println(estudante1.displayInfo());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Digita as informçãoes do aluno 2: ");
        System.out.print("nome: ");
        String nome2 = sc.nextLine();
        System.out.print("Idade: ");
        int age2 = sc.nextInt();
        sc.nextLine();
        System.out.print("ID: ");
        String id2 = sc.nextLine();
        System.out.println("Notas: ");
        double [] numeros2 = new double[5];
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Nota "+(i+1)+": ");
            double digitados = sc.nextDouble();
            numeros2[i] = digitados;
        }
        

        Student estudante2 = new Student(nome2, age2, id2, numeros2);
        System.out.println(estudante2.displayInfo());
        
        Person pessoa = new Person("Maria", 24);
        System.out.println(pessoa.displayInfo());

        sc.close();
    }
}
