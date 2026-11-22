import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> listaInt = new ArrayList<>();
        listaInt.add(1);
        listaInt.add(2);
        listaInt.add(3);
        List<Double> listaDouble = new ArrayList<>();
        listaDouble.add(8.5);
        listaDouble.add(7.3);
        for (int i : listaInt) {
            listaDouble.add((double)i);
        }
        
        List<Number> listaNum = new ArrayList<>();

        for (double number : listaDouble) {
            listaNum.add(number);
        }
        System.out.println("Lista de INT: ");
        System.out.println(listaInt);
        System.out.println("---------------------------------------------");
        System.out.println("Lista de Double: ");
        System.out.println(listaDouble);
        System.out.println("---------------------------------------------");
        System.out.println("Lista com ambos: ");
        System.out.println(listaNum);
    }
}
