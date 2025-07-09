package ArraysAndArrayLists;

public class Segregate0s1s {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == 1 && arr[end] == 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if (arr[start] == 0) start++;
            else if (arr[end] == 1) end--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
