import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problema2 {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        System.out.println(myObjs);
        copy(myDoubles, myObjs);
        System.out.println(myObjs);
        
    }
    public static void copy(List<? extends Number> fonte,List<? super Number> destino){ // pq aqui nao póde ser extends no lugar de super
        for (Number number : fonte) {
            destino.add(number);
        }
    }
}
