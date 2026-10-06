package exercicios;

import java.security.InvalidParameterException;

public class ExerciciosRecursao {

    // public static void contar(int n) {
    // if (n == 0) {
    // return;
    // }

    // System.out.println(n);

    // contar(n - 1);
    // }

    // Exercicio 1 ***********************************************
    public static void arrayInvertido(int[] array) {
        if (array.length == 0) {
            throw new InvalidParameterException("array não pode estar vazio!");
        }

        imprimeArrayInvertido(array, array.length);
    }

    private static void imprimeArrayInvertido(int[] array, int index) {
        if (index == 0) {
            return;
        }

        System.out.println(array[index - 1]);

        imprimeArrayInvertido(array, index - 1);

    }

    // Exercicio 2 ***********************************************
    // Crie um método recursivo que recebe um array bidimensional de double e
    // retorna a soma dos elementos deste array
    public static void somaArrayDouble(double[][] arr, int linha, int coluna) {

        if (linha == arr.length) {
            return;
        }

        if (coluna == arr[linha].length) {
            System.out.println();
            somaArrayDouble(arr, linha + 1, 0);
            return;
        }

        System.out.println(arr[linha][coluna] + " ");
        somaArrayDouble(arr, linha, coluna + 1);

    }

    public static void contar(int n) {
        System.out.println(n);

        if (n == 5) {
            return;
        }

        contar(n + 1);
    }

    // Fatorial *************************************************

    public static void imprimirFatorial(int n) {
        if (n <= 0) {
            throw new InvalidParameterException("Números negativos não são permitidos!");
        }

        int result = fatorial(n);
        System.out.println("Resultado: " + result);
    }

    private static int fatorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * fatorial(n - 1);
    }

}
