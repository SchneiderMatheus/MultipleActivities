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
        System.out.println("_________________________________________________________________________\n");
        int[] inteiros2 = {2, 4, 6, 8};
        for (int i: inteiros2){
            System.out.println(i*2);
        }
        System.out.println("_________________________________________________________________________\n");
        double[] inteiros3 = {4.99, 12.50, 3.75, 8.00};
        double total = 0;
        for (double i : inteiros3) {
            total += i;
        }
        System.out.println(total);
    }
}
