public class ArrayBidimensional {
    public static void imprimeArray() {
        int[][] array_b = {
                { 0, 1, 2 },
                { 6, 3, 4 }
        };

        for (int i = 0; i < array_b.length; i++) {
            System.out.println("");
            for (int j = 0; j < array_b[i].length; j++) {
                System.out.print(array_b[i][j]);
            }
        }
        System.out.println();
    }
}
