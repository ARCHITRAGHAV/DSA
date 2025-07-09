package Arrays2D;

public class MatrixMultiplication {

    public static void matrixMultiplication(int[][] A, int[][] B, int[][] C) {
        if (A[0].length != B.length) {
            System.out.println("Not Possible to multiply.");
        } else {
            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C[0].length; j++) {
                    for (int k = 0; k < B[0].length; k++) {
                        C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
                    }
                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] B = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] C = new int[A.length][B[0].length];
        matrixMultiplication(A, B, C);
    }
}
