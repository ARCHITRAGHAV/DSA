package ArraysAndArrayLists;

import java.util.Scanner;

public class SumProductOflements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
        int product = 1;
        for (int i = 0; i < size; i++) {
            product *= arr[i];
        }
        System.out.println("Product = " + product);
    }
}
