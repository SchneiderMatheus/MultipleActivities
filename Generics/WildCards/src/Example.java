import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) throws Exception {

        /*
         * List<Object> myObj = new ArrayList<Object>();
         * List<Integer> myNumber = new ArrayList<Integer>();
         * 
         * myObj = myNumber; // o compilador não permite esse upcasting
         */

        List<?> myObj = new ArrayList<>();
        List<Integer> myNumber = new ArrayList<Integer>();
        myObj = myNumber;

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
