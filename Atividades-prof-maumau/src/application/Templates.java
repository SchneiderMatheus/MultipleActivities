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

        Templates com vetor: 
        Em Java, o conceito que você conhece como Templates (termo muito usado em C++) é chamado de Generics (Genéricos).
        A ideia central é a mesma: permitir que um vetor ou estrutura de dados opere sobre diferentes tipos de
        arquivos/objetos sem que você precise reescrever o código para cada tipo.

        Em C++, os templates aceitam tipos primitivos (como int ou double). Em Java, os Genéricos não aceitam tipos 
        primitivos. Você deve usar as classes wrapper correspondentes:
        Em vez de int, use Integer
        Em vez de double, use Double
        Em vez de char, use Character

     Criando um Método "Template" para VetoresNa programação estruturada, você cria funções estáticas que usam um 
     parâmetro de tipo (geralmente representado pela letra T de Type).
     Veja este exemplo de uma função "template" que troca a posição de dois elementos em um vetor de qualquer tipo:
     
     javapublic class ExemploTemplate {

    // O <T> antes do tipo de retorno avisa o Java que este é um método "Template"
    public static <T> void trocarElementos(T[] vetor, int indice1, int indice2) {
        T temporario = vetor[indice1];
        vetor[indice1] = vetor[indice2];
        vetor[indice2] = temporario;
    }

    public static void main(String[] args) {
        // Funciona com vetor de String
        String[] palavras = {"Mundo", "Olá"};
        trocarElementos(palavras, 0, 1); 
        // Agora o vetor é {"Olá", "Mundo"}

        // Funciona com vetor de Integer (int encapsulado)
        Integer[] numeros = {10, 20};
        trocarElementos(numeros, 0, 1);  
        // Agora o vetor é {20, 10}
    }
}

        Templates com Matrizes
        O mesmo conceito pode ser utilizado com matrizes.
        Uma matriz possui duas dimensões:
            int matriz[][]= new int[linhas][colunas];
        O template precisa representar:
        • T → tipo dos elementos
        • M → número de linhas
        • N → número de colunas
        Desta forma, declara-se:

        private T[][] nomeDaMatriz;


        ❑ Templates permitem programação genérica: uma implementação pode
        trabalhar com diferentes tipos.
        ❑ O compilador pode deduzir os parâmetros do template a partir dos
        argumentos.
        ❑ Templates podem receber tipos (typename T) e valores (size_t N).
        ❑ Templates e sobrecarga são complementares: podem ser utilizados em
        conjunto
         */
        System.out.println(somar(3, 4));
        System.out.println(somar(3.5, 3.5));

        System.out.println(somar(3, 3.5));



    }
    public static int somar(int a, int b){
        return a + b;
    }
    public static double somar(double a, double b){
        return a + b;
    }
    public static <T extends Number> double somar(T a, T b){ // aqui podemos usar os dois
        return a.doubleValue() + b.doubleValue();
    }

    /*public class VetorInt{
        private int[] elementos;
    }

    public class VetorDouble{
        private int[] elementos;
    }

    // com generics:
    public static class Vetor<T> {
        private T[] elementos;
    }*/
}
