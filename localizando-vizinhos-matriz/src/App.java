import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        int [][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            int linha,coluna;
            for (int j = 0; j < matriz.length; j++) {
                 do {
                linha = random.nextInt(2);
                coluna = random.nextInt(2);
            } while (matriz[linha][coluna]!= '0');
            matriz[linha][coluna] = random.nextInt(9);
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(" "+matriz[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
