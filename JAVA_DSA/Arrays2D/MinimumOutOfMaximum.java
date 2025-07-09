package Arrays2D;

public class MinimumOutOfMaximum {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int[][] mat = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {-89, -90, -56, -98, -789}};
        for (int i = 0; i < mat.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < mat[0].length; j++) {
                if (max < mat[i][j]) {
                    max = mat[i][j];
                }
            }
            if (min > max) {
                min = max;
            }
        }
        System.out.println("Minimum element out of all the maximum elements of each row = " + min);
    }
}
