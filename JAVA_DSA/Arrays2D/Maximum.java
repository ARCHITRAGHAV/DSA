package Arrays2D;

public class Maximum {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[][] mat = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                max = Math.max(max, mat[i][j]);
            }
        }
        System.out.println("Maximum = " + max);
    }
}
