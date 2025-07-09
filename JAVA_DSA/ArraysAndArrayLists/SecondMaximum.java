package ArraysAndArrayLists;

public class SecondMaximum {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int arr[] = {4, 10, 10, 6, 3, 8};
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            if (max2 < arr[i] && max != arr[i]) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
