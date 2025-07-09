package Arrays2D;

public class TransposeOfMatrix {

    public static void print(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int mat[][]) {
        for (int i = 1; i < mat[0].length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        print(mat);
        transposeMatrix(mat);
        System.out.println();
        print(mat);
    }
}
