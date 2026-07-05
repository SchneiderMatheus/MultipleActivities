package Application;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos contratos voce tem?");
        int n = sc.nextInt();
        System.out.println("Escolha o mês referente: (Informe em número): ");
        int mes = sc.nextInt();

        sc.close();
    }
}
