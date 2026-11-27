import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Set<String> set = new LinkedHashSet<>();
        set.add("Tablet");
        set.add("TV");
        set.add("Notebook");
        
        set.removeIf(x -> x.length()>= 3);

        for (String p : set) {
            System.out.println(p);
        }
    }
}
