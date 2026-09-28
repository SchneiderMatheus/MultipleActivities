public class array_lista {
    public static void main(String[] args) {
        int [] vect = {1,2,3,4,5,6};
        for (int i = 2; i < vect.length; i++) {
            vect[i] = 7;
        }
        for (int i : vect) {
            System.out.print(i+",");
        }
    }
}
