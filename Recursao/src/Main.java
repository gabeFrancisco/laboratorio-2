public class Main {
    public static int A(int i) {
        if (i > 10)
            return 0;
        int x = 5 + i;
        i += 3;
        return x + A(i);
    }

    public static void main(String[] args) {
        System.out.println("Deus abençoe!");
        // int[] arr = { 0, 1, 2, 3, 4 };
        // double[][] arrM = {
        // { 1.2, 3.2 },
        // { 3.2, 3.2 }
        // };

        // ExerciciosRecursao.contar(1);

        // ExerciciosRecursao.arrayInvertido(arr);
        // ArrayBidimensional.imprimeArray();
        // ExerciciosRecursao.somaArrayDouble(arrM, 0, 0);
        // ExerciciosRecursao.imprimirFatorial(7);
        // ExerciciosRecursao.somarArray(arr, 0, 0);
        // System.out.println(A(3));
        // ExerciciosRecursao.imprimirFibonnaci(1, 1);
        int[] lista = { 0, 4, 7, 10, 11, 12, 18, 23, 24, 26, 28 };
        var buscaBinaria = new BuscaBinaria();
        int resultado = buscaBinaria.procurar(lista, 26);
        System.out.println("Resultado da busca binária: " + resultado);
    }

}
