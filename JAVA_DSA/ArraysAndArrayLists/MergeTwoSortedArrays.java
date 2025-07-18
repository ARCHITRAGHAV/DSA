package ArraysAndArrayLists;

public class MergeTwoSortedArrays {
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

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 6, 9, 20};
        int[] arr2 = {1, 3, 4, 5, 7, 8};

        int[] arr3 = new int[arr1.length + arr2.length];
        merge(arr3, arr1, arr2);
        for (int ele : arr3) {
            System.out.print(ele + " ");
        }
    }
}
