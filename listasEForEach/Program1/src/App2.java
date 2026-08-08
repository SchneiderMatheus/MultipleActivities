import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        List <String>list = new ArrayList<>();
        
        for(int i = 0;i<6; i++){
            System.out.println("Adicione uma fruta: ");
            String fruta = sc.nextLine();
            list.add(fruta);
        }
        List<String> resultado = removerDuplicatas(list);
        System.out.println("Original: "+list);
        System.out.println("Sem repetiçoes: "+resultado);

        sc.close();
    }
    public static List<String> removerDuplicatas(List<String> original) {
        Set<String> vistos = new HashSet<>();
        List<String> unicos = new ArrayList<>();

        for (String item : original) {
            if (vistos.add(item)) {  
                unicos.add(item);
            }
        }
        return unicos;
    }
}
