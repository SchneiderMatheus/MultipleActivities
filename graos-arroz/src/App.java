import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        java.math.BigInteger totalGraos = java.math.BigInteger.ZERO;
        java.math.BigInteger graosCasa = java.math.BigInteger.ONE;

        int casa100, casa1000;

        for (int casa=1; casa <= 64; casa++) {
            totalGraos = totalGraos.add(graosCasa);
            System.out.println("Casa: "+casa+", Grão na casa: "+graosCasa+" Total Acumulado: "+totalGraos);
            graosCasa = graosCasa.multiply(java.math.BigInteger.valueOf(2));
            if (totalGraos.compareTo(totalGraos) >= 100) {
                
            }
        }
        
        System.out.println("Grãos: "+totalGraos);
        sc.close();
    }
}
