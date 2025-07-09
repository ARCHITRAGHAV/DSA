package BinarySearch;

public class PeakElementInArray {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 5, 6, 7, 8, 3};
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(arr[low]);
    }
}
