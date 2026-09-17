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
    }
}
