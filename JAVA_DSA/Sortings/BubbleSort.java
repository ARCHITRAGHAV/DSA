package Sortings;

import static ArraysAndArrayLists.Questions.print;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2, 9, 0};
        int[] arr1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) {
                break;
            }
        }
        print(arr);
    }
}
