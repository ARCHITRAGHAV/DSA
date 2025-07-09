package Arrays2D;

public class RotationBy90Degree {
    public static void print(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotationMatrix(int mat[][]) {
        for (int i = 1; i < mat[0].length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // Row Wise
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
        // Column Wise
        for (int i = 0; i < mat[0].length; i++) {
            int start = 0;
            int end = mat.length - 1;
            while (start < end) {
                int temp = mat[start][i];
                mat[start][i] = mat[end][i];
                mat[end][i] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        print(mat);
        rotationMatrix(mat);
        System.out.println();
        print(mat);
    }
}
