
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        java.math.BigInteger totalGraos = java.math.BigInteger.ZERO;
        java.math.BigInteger graosCasa = java.math.BigInteger.ONE;

        final BigInteger MIL = new BigInteger("1000");
        final BigInteger MILHAO = new BigInteger("1000000");
        final BigInteger BILHAO = new BigInteger("1000000000");

        BigInteger [][] tabuleiro = new BigInteger[8][8];

        int casaCerta1=0,casaCerta2=0, casaCerta3=0;

        for (int casa=1; casa <= 64; casa++) {
            totalGraos = totalGraos.add(graosCasa);

            if (totalGraos.compareTo(MIL) >= 0 && casaCerta1==0) {
                casaCerta1 = casa;
            }
            if (totalGraos.compareTo(MILHAO) >= 0 && casaCerta2==0) {
                casaCerta2 = casa;
            }
            if (totalGraos.compareTo(BILHAO) >= 0 && casaCerta3==0) {
                casaCerta3 = casa;
            }

            int linha = (casa - 1) / 8;  
            int coluna = (casa - 1) % 8;  
            tabuleiro[linha][coluna] = graosCasa;  

            System.out.println("Casa: "+casa+", Grão na casa: "+graosCasa+" Total Acumulado: "+totalGraos);
            graosCasa = graosCasa.multiply(java.math.BigInteger.valueOf(2));
            

        }
        System.out.println("-----------------------------------------------");
        System.out.println("Grãos: "+totalGraos);
        System.out.println("Para chegar a mil grãos são necessarias: "+casaCerta1+" casas");
        System.out.println("Para chegar a milhão grãos são necessarias: "+casaCerta2+" casas");
        System.out.println("Para chegar a bilhão grãos são necessarias: "+casaCerta3+" casas");
        System.out.println();
        System.out.println("-----------------------------------------------");
        
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                System.out.print(tabuleiro[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
