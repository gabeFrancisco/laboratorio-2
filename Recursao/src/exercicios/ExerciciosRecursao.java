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
    public static void somaArrayDouble(double[][] arrM) {
        double[][] arr = {
                { 1.2, 3.2 },
                { 3.2, 3.2 }
        };

    }

}
