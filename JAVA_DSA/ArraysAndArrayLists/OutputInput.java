package ArraysAndArrayLists;

import java.util.Scanner;

public class OutputInput {
    public static void main(String[] args) {
//        int[] arr = {5, -8, -2, 67, 43, -97}; // length = 6
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * 2 + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * 2 + " ");
        }
    }
}
