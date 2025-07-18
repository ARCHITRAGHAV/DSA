package Recursion;

public class Recursion_Arrays {

    public static void printRec(int[] arr, int index) {
        if (index == arr.length) return;
        System.out.print(arr[index] + " ");
        printRec(arr, index + 1);
    }

    public static int linearSearch(int[] arr, int index, int target) {
        if (index == arr.length) return -1;
        if (arr[index] == target) return index;
        return linearSearch(arr, index + 1, target);
    }

    public static void reverse(int[] arr, int start, int end) {
        if (start > end) return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }

    public static int findMax(int[] arr, int index, int max) {
        if (index == arr.length) return max;
        if (arr[index] > max) {
            max = arr[index];
        }
        return findMax(arr, index + 1, max);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 8, 9, 6, 7, 11, 4};
        printRec(arr, 0);
        System.out.println(linearSearch(arr, 0, 8));
        reverse(arr, 0, arr.length - 1);
        printRec(arr, 0);
        System.out.println(findMax(arr, 0, Integer.MIN_VALUE));
    }
}
