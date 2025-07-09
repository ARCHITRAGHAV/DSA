package BinarySearch;

public class FirstOccurence {
    public static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                index = mid;
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {-76, -4, 9, 28, 47, 47, 49, 510, 615, 99999};
        System.out.println(search(arr, 47));
    }
}
