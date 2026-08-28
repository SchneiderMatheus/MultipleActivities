package application;

public class Templates {
    public static void main(String[] args) {
        /*
        Um template permite criar funções ou estruturas genéricas, capazes de
        trabalhar com diferentes tipos de dados sem precisar escrever uma
        implementação específica para cada tipo.
        Objetivos:
        ❑ Evitar duplicação de código.
        ❑ Criar funções que possam trabalhar com diferentes tipos de dados.
        ❑ Reutilizar a mesma lógica para int, double, float, entre outros tipos.
        ❑ Permitir que o compilador determine o tipo adequado a partir dos
        argumentos utilizados.
        ❑ Facilitar a criação de funções genéricas para vetores e matrizes.
         */

    }
    public static int somar(int a, int b){
        return a + b;
    }
    public static double somar(double a, double b){
        return a + b;
    }
}
