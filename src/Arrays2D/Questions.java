package Arrays2D;

import java.util.ArrayList;

import static Arrays2D.TransposeOfMatrix.print;

public class Questions {

    public static void setMatrixZeroes(int[][] matrix) {
        boolean[] a = new boolean[matrix.length];
        boolean[] b = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    a[i] = true;
                    b[j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (a[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (b[i]) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        print(matrix);
    }

    public static void matrixMultiplication(int[][] mat, int[][] mat1) {
        int[][] mat2 = new int[mat.length][mat1[0].length];
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                for (int k = 0; k < mat1[0].length; k++) {
                    mat2[i][j] = mat2[i][j] + mat[i][k] * mat1[k][j];
                }
            }
        }
        print(mat2);
    }

    public static void spiral(int mat[][]) {
        int startRow = 0;
        int endRow = mat.length - 1;
        int startCol = 0;
        int endCol = mat[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(mat[startRow][i] + "->");
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(mat[i][endCol] + "<-");
            }
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(mat[endRow][i] + "=>");
            }
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(mat[i][startCol] + "<=");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static boolean search(int[][] mat, int target) {
        int start = 0;
        int end = mat[0].length - 1;
        while (start < mat.length && end >= 0) {
            if (mat[start][end] == target) {
                return true;
            } else if (mat[start][end] > target) {
                end--;
            } else {
                start++;
            }

        }
        return false;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int combination(int n, int r) {
        int combination = factorial(n) / (factorial(r) * factorial(n - r));
        return combination;
    }

    public static void pascal(int n) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    a.add(1);
                } else {
                    a.add(arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1));
                }
//                a.add(combination(i, j));
            }
            arr.add(a);
        }
        System.out.println(arr);
    }

    public static int minOutMax(int[][] mat) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < mat.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < mat[0].length; j++) {
                if (max < mat[i][j]) {
                    max = mat[i][j];
                }
            }
            if (minimum > max) {
                minimum = max;
            }
        }
        return minimum;
    }

    public static void snake(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mat[0].length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = mat[0].length - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }

    public static void transpose(int[][] mat) {
        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void rotate(int[][] mat) {
        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            int start = 0;
            int end = mat[0].length - 1;
            while (start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
        print(mat);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 2, 3}, {0, 1, 2, 4}, {8, 0, 7, 0}, {7, 5, 6, 4}};
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int[][] mat = {{1, 2}, {3, 4}};
        int[][] mat1 = {{5, 6}, {7, 8}};
        int[][] mat3 = new int[mat.length][mat1[0].length];
//        System.out.println(minOutMax(mat));
//        snake(mat);
//        transpose(mat);
//        print(mat);
//        rotate(mat);
//        factorial(3);
//        pascal(5);
//        System.out.println(search(mat, 6));
//        spiral(arr);
//        print(mat);
//        print(mat1);
//        matrixMultiplication(mat, mat1);
        setMatrixZeroes(matrix);
    }
}
