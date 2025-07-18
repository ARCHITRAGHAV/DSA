package Merge_Sort;

public class MergeSortUsingMagic {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1, 6, 7, 3};
        mergeSort(arr);
        for (int ele : arr) System.out.print(ele + " ");
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) return;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }
        mergeSort(a);
        mergeSort(b);
        merge(arr, a, b);
    }

    public static void merge(int[] arr3, int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
    }
}
