public class App {
    public static void main(String[] args) throws Exception {
        char contador='a';
        int valorNumerico = 0;
        while (valorNumerico <= 121) {
            System.out.println("Caractere = "+contador);
            valorNumerico = contador;
            System.out.println("Valor correspondente = "+valorNumerico);
            contador ++;
            System.out.println("------------------------------------");
        }
    }
}
