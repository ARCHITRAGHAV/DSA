package ArraysAndArrayLists;

public class RotateArray {
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 1, 2, 4, 9, 0};
        int d = 3;
        d = d % arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
