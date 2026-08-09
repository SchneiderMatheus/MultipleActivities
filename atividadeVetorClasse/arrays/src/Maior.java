
import java.util.Locale;
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite  quantidade de numeros a ser digitada: ");
        int n = sc.nextInt();
        sc.nextLine();


        double [] lista =  new double [n];
        double maiorValor=0;
        double posicao=0;
        double max = 0;
        
        for(int i = 0; i<lista.length; i++){
            System.out.print("Digite um número: ");
            lista[i] = sc.nextDouble();
            if(lista[i]>max){
                maiorValor = lista[i];
                max = lista[i];
                posicao = i+1;
            }
        
        }
        

        System.out.println("Maior Valor: "+maiorValor);
        System.out.println("Posição: "+posicao);
        sc.close();
    }
}
