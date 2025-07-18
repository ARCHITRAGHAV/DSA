package Sortings;

import static ArraysAndArrayLists.Questions.print;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2, 0};
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        print(arr);
    }
}
