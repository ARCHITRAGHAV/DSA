package ArraysAndArrayLists;

public class Max {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int maxProduct = Integer.MIN_VALUE;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product = product * nums[i];
            System.out.println(product);
            if (maxProduct < product) {
                maxProduct = product;
                System.out.println(maxProduct);
            }
        }
        System.out.println(maxProduct);
    }
}
