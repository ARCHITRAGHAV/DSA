package ArraysAndArrayLists;

import java.util.Arrays;

public class ArrayPractice {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 78, 5, 56, -78};
        print(arr);

        Arrays.sort(arr);
        print(arr);

        int[] x = arr; // Shallow Copy
        print(x);
        x[1] = 100;
        print(arr);

        int[] y = Arrays.copyOf(arr, arr.length);
        print(y);
        y[0] = 900;
        System.out.println(arr[0]);
        print(y);
    }
}
