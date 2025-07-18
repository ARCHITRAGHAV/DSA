package Arrays2D;

public class MaxSumRow {
    public static void main(String[] args) {
        int row = 0;
        int max = Integer.MIN_VALUE;
        int[][] mat = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {-89, 90, 56, 98, -789}};
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            if (max < sum) {
                max = sum;
                row = i;
            }
        }
        System.out.println("MaximumSum in a row " + row + " = " + max);
    }
}
