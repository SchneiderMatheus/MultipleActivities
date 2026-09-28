import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Matheus");
        list.add("João");
        list.add("Silvana");
        list.add(2,"Marco");
        System.out.println(list.size()); // ja que o pc conta 0,1,2,3   o tamanho nao deveria dar 4?
        System.out.println("________________________________________________________________________________________________");

        for (String string : list) {
            System.out.println(string);
        }
        System.out.println("________________________________________________________________________________________________");

        //list.remove("João");
        list.removeIf(x->x.charAt(0)=='M'); // Função lamba que se chama: predicado

        for (String string : list) {
            System.out.println(string);
        }
        System.out.println("________________________________________________________________________________________________");
        list.add("Luiz");
        System.out.println("Index of Silvana: " + list.indexOf("Silvana"));
        System.out.println("________________________________________________________________________________________________");
        list.add("Silvio");
        list.add("Savio");

        List<String> result = list.stream().filter(x ->x.charAt(0)=='S').toList();

        for (String string : result) {
            System.out.println(string);
        }
        System.out.println("________________________________________________________________________________________________");
        String name = list.stream().filter(x ->x.charAt(0)=='S').findFirst().orElse(null);
        System.out.println(name);
        sc.close();
    }
}
