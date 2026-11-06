package matrix;

public class Matrix {

    private static final int SIZE = 2;

    public static void add(int a, int b, int c, int d) {

        int[][] matrix = {
            {a, b},
            {c, d}
        };

        System.out.println("Matrix:");

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of elements = "
                + (a + b + c + d));
    }
}