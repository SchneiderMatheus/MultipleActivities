import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> listaInt = new ArrayList<>();
        listaInt.add(1);
        listaInt.add(2);
        listaInt.add(3);
        List<Double> listaDouble = new ArrayList<>();
        for (int i : listaInt) {
            listaDouble.add((double)i);
        }
        
        List<Number> listaNum = new ArrayList<>();
        listaNum.add(listaDouble);
    }
}
