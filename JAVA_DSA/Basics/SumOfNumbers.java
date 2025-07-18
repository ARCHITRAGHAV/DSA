package Basics;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 = ");
        int x = sc.nextInt();
        System.out.print("Enter number 2 = ");
        int y = sc.nextInt();
        System.out.print("Enter number 3 = ");
        int z = sc.nextInt();
        long sum = x + y + z;
        System.out.println("Sum = " + sum);
    }
}