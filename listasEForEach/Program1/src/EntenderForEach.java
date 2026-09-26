import java.util.Scanner;

public class EntenderForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        System.out.println("_________________________________________________________________________\n");
        String [] string2 = {"apple", "sky", "orange"};
        int contador3 = 0;
        for (String i : string2) {
            for (int j = 0; j < i.length(); j++) {
                char currentChar = i.charAt(j);
                if (currentChar == 'a' || currentChar == 'e' || currentChar =='i' || currentChar == 'o' || currentChar == 'u'){
                    contador3++;
                }
            }
        }
        System.out.println("Número de vogais é: "+contador3);
        System.out.println("_________________________________________________________________________\n");
        String [] string10 = {"I", "love", "for-each", "loops"};
        String resultado="";
        for (String i : string10) {
            resultado += i + " "; 
        }
        System.out.println(resultado);
        System.out.println("_________________________________________________________________________\n");
        String[] string11 = {"cat", "dog", "sun"};
        for (String i : string11) {
            String reverse="";
            for (int j = i.length()-1; j >= 0; j--) {
                reverse += i.charAt(j);
            }
            System.out.println(reverse);
        }
        System.out.println("_________________________________________________________________________\n");
        int[] act12 = {12, 5, 8, 20, 3, 17, 30};
        for (int i : act12) {
            if (i>10) {
                System.out.println(i);
            }
        }
        System.out.println("_________________________________________________________________________\n");
        double[] act13 = {55, 72, 90, 48, 65, 88};
        int contadorAct13 = 0;
        for (double i : act13) {
            if (i>=60) {
                contadorAct13++;
            }
        }
        System.out.println(contadorAct13);
        System.out.println("_________________________________________________________________________\n");
        String[] act14 = {"pen", "book", "ruler", "eraser"};
        boolean found = false;
        System.out.println("Which word should i look for?");
        String x = sc.nextLine();
        for (String i : act14) {
            if (x.equals(i)) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Found it!");
        }
        System.out.println("_________________________________________________________________________\n");
        String [] act15 = {"hi", "banana", "cat", "watermelon", "dog"};
        String found15 = "";
        for (String i : act15) {
            if (i.length()>found15.length()) {
                    found15 = i;
                }
        }
        System.out.println(found15);
        System.out.println("_________________________________________________________________________\n");
        String [] act16 = {"hello", "world", "java"};
        int contador16 = 0;
        for (String i : act16) {
            for (int j = 0; j < i.length(); j++) {
                contador16++;
            }
        }
        System.out.println(contador16);
        System.out.println("_________________________________________________________________________\n");
        String[] act17 ={"a", "b", "c"};
        int index = 0;
        for (String i : act17) {
            System.out.println("index: "+index+" item: "+i);
            index++;
        }
        System.out.println("_________________________________________________________________________\n");
        int[] act18 = {1, 2, 2, 3, 1, 4, 5, 5};
        String visto = ",";
        for (int i : act18) {
            if (!visto.contains(","+ i + ",")) {
                System.out.println(i);
                visto += i +",";
            }
        }
        System.out.println("_________________________________________________________________________\n");
        int[] act19 = {10, 20, 30, 40, 50};
        int[] actS19 = new int[5];
        for (int i = 4; i >= 0; i--) {
            actS19[4-i] = act19[i];
            
        }
        for (int i : actS19) {
            System.out.println(i);
        }
        System.out.println("_________________________________________________________________________\n");
        double [] act20 = {19.99, 5.50, 12.00, 3.25};
        double soma = 0;
        for (double d : act20) {
            soma += d;
        }
        System.out.println(soma*0.1);
    }
}
