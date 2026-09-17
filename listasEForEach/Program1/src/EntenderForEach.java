public class EntenderForEach {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("_________________________________________________________________________\n");

        for (String i : fruits) {
            System.out.println(i);
        }
        System.out.println("_________________________________________________________________________\n");
        String[] colors = {"red", "green", "blue"};

        for (String i : colors) {
            System.out.println(i);
        }
        System.out.println("_________________________________________________________________________\n");

        int[] inteiros = {7, 14, 21, 28, 35};
        int contador = 0;
        for (int i : inteiros){
            contador ++;
        }
        System.out.println("Contador: "+contador);
        System.out.println("________________________________________________________________\n");
        int[] inteiros2 = {2, 4, 6, 8};
        
    }
}
