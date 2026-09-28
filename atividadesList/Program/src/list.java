import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Matheus");
        list.add("João");
        list.add("Silvana");

        sc.close();
    }
}
