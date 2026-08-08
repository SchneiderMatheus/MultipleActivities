import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List <Integer>list = new ArrayList<>();
        Locale.setDefault(Locale.US);

        int soma = 0;

        for(int i = 0; i<5; i++){
            System.out.println("Adicione um número inteiro: ");
            int escolha = sc.nextInt();
            soma += escolha;
            list.add(escolha);
        }

        System.out.println(list);
        System.out.println("Soma = "+soma);

        sc.close();
    }
}
