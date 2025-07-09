package ArraysAndArrayLists;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr1 = {8, 2, 4, 6, 3, 1, 9, 7, 5};
        int[] arr = {1, 2, 3, 4, 5};
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not sorted");
        }
    }
}
