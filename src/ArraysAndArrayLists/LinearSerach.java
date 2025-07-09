package ArraysAndArrayLists;

import java.util.Scanner;

public class LinearSerach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = {89, 78, 67, 34, 81};
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }
}
