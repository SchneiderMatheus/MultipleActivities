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
        System.out.println("_________________________________________________________________________\n");
        int[] inteiros4 ={3, 8, 12, 7, 20, 15, 4};
        int contador2 = 0;
        for (int i : inteiros4) {
            if (i%2==0) {
                contador2++;
            }
        }
        System.out.println("São "+contador2+" números pares");
        System.out.println("_________________________________________________________________________\n");
        int[] inteiros5 ={9, 4, 15, 2, 7};
        int small=100;
        for (int i : inteiros5) {
            if (i < small) {
                small = i;
            }
            
        }
        System.out.println(small);
        System.out.println("_________________________________________________________________________\n");
        int[] inteiros6 ={88, 92, 75, 60, 100};
        int total2 = 0;
        for (int i : inteiros6) {
            total2 += i;
        }
        System.out.println(total2);
        System.out.println("_________________________________________________________________________\n");
        String[] string1 = {"java", "loop", "code"};
        for (String i : string1) {
            System.out.println(i);
            System.out.println(i.length());
        }
    }
}
