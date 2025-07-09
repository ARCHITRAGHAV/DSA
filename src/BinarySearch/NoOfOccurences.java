package BinarySearch;

public class NoOfOccurences {
    public static int count(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        low = 0;
        high = arr.length - 1;
        int last = -1;
        if (first == -1) return 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (last - first) + 1;
    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 12, 12, 12};
        System.out.println(count(arr, 134));
    }
}
