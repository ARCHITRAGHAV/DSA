package Arrays2D;

public class ArraysInitialisation {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int[] arrs : arr) {
            for (int ele : arrs) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
