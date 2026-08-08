import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                
                matriz[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }

        System.out.print("Select a number: ");
        int escolha = sc.nextInt();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (escolha == matriz[i][j]) {
                    System.out.println("Posição:"+i+":"+j);

                    if (escolha -1 >=0) {
                        System.out.println("Esquerda:"+matriz[i][j-1]);
                    }
                }
            }
        }

        sc.close();
    }
}
