package ArraysAndArrayLists;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {20, 43, 55, 90};
//        int[] x = arr;
//        x[0] = 100;
//        System.out.println(arr[0]);
        int[] deep = Arrays.copyOf(arr, arr.length);
        deep[0] = 100;
        System.out.println(arr[0]);
    }
}
