package ArraysAndArrayLists;

public class MissingInArray {

    public static int MissingArray(int[] arr) {
        int n = arr.length;
        int sum = (n * (n + 1)) / 2;
        int ArraySum = 0;
        for (int j : arr) {
            ArraySum = ArraySum + j;
        }
        return sum - ArraySum;
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(MissingArray(arr));
    }
}
