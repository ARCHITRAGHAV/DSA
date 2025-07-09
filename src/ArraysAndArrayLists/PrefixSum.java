package ArraysAndArrayLists;

public class PrefixSum {
    public static void maxSubArraySum(int[] arr) {
        if (arr.length == 0) {
            System.out.println(0);
        }
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        maxSubArraySum(arr);
    }
}