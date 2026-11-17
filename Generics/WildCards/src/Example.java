import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) throws Exception {
        

        /* 
        List<Object> myObj = new ArrayList<Object>();
        List<Integer> myNumber = new ArrayList<Integer>();
        
        myObj = myNumber; // o compilador não permite esse upcasting
        */

        List<?> myObj = new ArrayList<>();
        List<Integer> myNumber = new ArrayList<Integer>();
        myObj = myNumber;

    }
}
