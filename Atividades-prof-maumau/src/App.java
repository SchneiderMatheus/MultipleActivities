import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual teu peso?");
        double peso = sc.nextDouble();
        System.out.println("Quão alto é voce?");
        double altura =sc.nextDouble();
        
        
        double imc = calculo(peso,altura);

        System.out.println(calculo(peso,altura));
        sc.close();
    }

    public static double calculo(double peso, double altura){
        System.out.println("");
        double imc = peso / (altura *altura);

        if (imc>19) {
            System.out.println("Voce é saudável");
        }
        else if (imc > 26) {
            System.out.println("Ta fortin!");
        }
        return imc;
    }
}
