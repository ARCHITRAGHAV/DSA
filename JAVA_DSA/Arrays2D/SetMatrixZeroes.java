package Arrays2D;

public class SetMatrixZeroes {

    public static void zeroes(int[][] arr) {
        boolean[] rows = new boolean[arr.length];
        boolean[] cols = new boolean[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (rows[i]) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            if (cols[i]) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j][i] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{3, 6, 2, 1, 7, 3}, {8, 0, -2, 3, -5, -7}, {4, 5, 6, 4, 0, 3}, {1, 2, 0, 2, 4, 4}};
        zeroes(arr);
    }
}
