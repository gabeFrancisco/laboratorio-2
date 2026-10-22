public class SelectionSort {
    public static int[] ordenar(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menor]) {
                    menor = j;
                }
            }

            int temp = array[i];
            array[i] = array[menor];
            array[menor] = temp;

        }
        return array;
    }
}
