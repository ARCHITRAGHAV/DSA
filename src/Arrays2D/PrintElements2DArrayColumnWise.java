package Arrays2D;

public class PrintElements2DArrayColumnWise {
    public static void main(String[] args) {
        // Transpose
        int arr[][] = {{10, 20, 30, 90}, {40, 50, 60, 95}, {70, 80, 90, 98}};
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
