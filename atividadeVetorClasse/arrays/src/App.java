import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números voce vai digitar?");
        int n = sc.nextInt();
        sc.nextLine();

        int [] lista = new int[n];
        int soma=0;
        double media=0;

        for(int i =0;i<lista.length; i++){
            System.out.print("Digite um número:");
            lista[i] = sc.nextInt();
            soma += lista[i];
        }
        System.out.print("\nValores = ");
        for(int i =0;i<lista.length; i++){
            System.out.print(lista[i]+" ");
        }
        System.out.println("Soma: "+soma);
        media = soma/n;
        System.out.println("Media: "+media);
        sc.close();
    }
}
