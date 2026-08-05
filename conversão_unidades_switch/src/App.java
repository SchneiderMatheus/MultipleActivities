import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        double valor = sc.nextDouble();
        System.out.print("\nEscolha uma medida (i) para polegadas e (c) para centímetros: ");
        char escolha = sc.next().charAt(0);

        switch (escolha) {
            case 'c':
                valor = valor/2.54;
                System.out.println("Em Polegadas o valor digitado fica: "+valor);
                break;
            
            case 'i':
                valor = valor *2.54;
            System.out.println("Em Centímetros o valor digitado fica: "+valor);
                break;
        
            default:
                System.out.println("Escolha Inválida!");
                break;
        } 

        sc.close();
    }
}
