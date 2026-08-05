import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a sua nota da m1: ");
        double m1 = sc.nextDouble();
        System.out.println("Entre com a sua nota da m2: ");
        double m2 = sc.nextDouble();
        System.out.println("Entre com a sua nota da m3: ");
        double m3 = sc.nextDouble();

        double media = (m1 + m2 + m3) / 3;
        System.out.println("Sua média é: " + media);
        System.out.println("Entre com a sua quantidade de faltas: ");
        int faltas = sc.nextInt(); 
        if (media >= 7 && faltas <= 10) {
            System.out.println("Aprovado");
        } else if (media < 7 && faltas <= 10) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
