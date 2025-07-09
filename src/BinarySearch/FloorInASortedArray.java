package BinarySearch;

public class FloorInASortedArray {
    public static int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else {
                index = mid;
                low = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7};
        System.out.println(findFloor(arr, 5));
    }
}
