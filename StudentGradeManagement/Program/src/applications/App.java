package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Teacher teacher = new Teacher("Matheus", 29, "123456", "History", 4590.5);
        System.out.println(teacher);
        
        sc.close();
    }
}
