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
        System.out.println("print list: ");
        printList(myInts);
        System.out.println("____________________________________________________");
        System.out.println("sout: ");
        System.out.println(myInts);
        System.out.println("__________________________________");
        System.out.println(myObj);

    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
