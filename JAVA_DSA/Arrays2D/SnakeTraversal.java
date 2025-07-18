package Arrays2D;

import java.util.ArrayList;

public class SnakeTraversal {
    public static void snaketraversing(int mat[][]) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mat[0].length; j++) {
                    arr.add(mat[i][j]);
                }
            } else {
                for (int j = mat[0].length - 1; j >= 0; j--) {
                    arr.add(mat[i][j]);
                }
            }
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        int mat[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        snaketraversing(mat);
    }
}
