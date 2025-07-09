package Arrays2D;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30}, {50, 60, 70}, {85, 90, 95}};
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println(sum);
    }
}
