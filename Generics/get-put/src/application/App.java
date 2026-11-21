import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> listaInt = new ArrayList<>();
        listaInt.add(1,8,9);
        List<Double> listaDouble = new ArrayList<>();
        for (int i : listaInt) {
            listaDouble.add(i);
        }
        
        List<Number> listaNum = new ArrayList<>();
        listaNum.add(listaDouble);
    }
}
