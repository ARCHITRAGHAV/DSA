package Recursion;

public class Recursion_Binary_Search {

    public static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) return -1;
        int mid = (start + end) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] > target) return binarySearch(arr, start, mid - 1, target);
        else return binarySearch(arr, mid + 1, end, target);
    }

    public static int firstOccurrence(int[] arr, int low, int high, int target, int index) {
        if (low > high) return index;
        int mid = (low + high) / 2;
        if (arr[mid] < target) return firstOccurrence(arr, mid + 1, high, target, index);
        else {
            if (arr[mid] == target) index = mid;
            return firstOccurrence(arr, low, mid - 1, target, index);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 4));
        System.out.println(firstOccurrence(arr, 0, arr.length - 1, 5, -1));
    }
}
