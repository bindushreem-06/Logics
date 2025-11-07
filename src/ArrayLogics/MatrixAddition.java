package ArrayLogics;

public class MatrixAddition {
    public static void main(String[] args) {
        int rows = 2, cols = 3;
        int[][] A = { {1, 2, 3}, {4, 5, 6} };
        int[][] B = { {7, 8, 9}, {1, 2, 3} };
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Sum of two matrices:");
        for (int[] row : sum) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

