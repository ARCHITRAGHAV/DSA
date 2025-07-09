package BinarySearch;

public class BinarySearch {

    public static boolean searchDescending(int[] arr, int key) {
        int low = arr.length - 1;
        int high = 0;
        while (low >= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] > key) {
                high = mid + 1;
            } else {
                low = mid - 1;
            }
        }
        return false;
    }

    public static boolean searchAscending(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-76, -4, 9, 28, 47, 49, 510, 615, 9911, 99999};
        int[] nums = {67, 56, 47, 31, 23, 17, 5, -8, -867};
        if (searchAscending(arr, 47)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        if (searchDescending(nums, 67)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}